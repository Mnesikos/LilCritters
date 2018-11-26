package com.github.mnesikos.lilcritters.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.entity.core.IMultiSpeciesEntity;
import org.zawamod.entity.core.SpeciesData;

import com.github.mnesikos.lilcritters.init.ModItems;
import com.github.mnesikos.lilcritters.init.ModSoundHandler;
import com.github.mnesikos.lilcritters.network.MessageSquirrelEat;
import com.github.mnesikos.lilcritters.network.ModPacketHandler;
import com.github.mnesikos.lilcritters.util.ModFoodGroups;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityTreeSquirrel extends EntityBaseAvoidWater implements IMultiSpeciesEntity {
	public boolean isSquirrelSitting;
	private int sitTicks;
	public ItemStack heldFood;

	public EntityTreeSquirrel(World world) {
		super(world, 0.30D);
		setSize(0.6F, 0.6F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);

		getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
	}

	@Override
	protected void initEntityAI() {
		super.initEntityAI();
		this.aiSit = new EntityAISit(this);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		this.tasks.addTask(4, new EntityAITempt(this, 1.25D, ModItems.ACORN, true));
		this.tasks.addTask(4, new EntityAITempt(this, 1.25D, ModItems.PINE_CONE, true));
	}
	
	public void setSitting() {
		this.aiSit.setSitting(true);
	}

	@Override
	public float getEyeHeight() {
		return this.height * 0.5F;
	}

	protected final EntityItem getNearbyNut()
	{
		List<EntityItem> list = this.world.<EntityItem>getEntitiesWithinAABB(EntityItem.class, this.getEntityBoundingBox().grow(8.0D));
		double d0 = Double.MAX_VALUE;
		EntityItem item = null;

		for (EntityItem itm : list)
		{
			if((item.getItem().getItem() == ModItems.ACORN || item.getItem().getItem() == ModItems.PINE_CONE)) {
				if (this.getDistanceSq(itm) < d0)
				{
					item = itm;
					d0 = this.getDistanceSq(itm);
				}
			}
		}
		return item;
	}
	
	@Override
	public void onLivingUpdate() {
		if(this.heldFood == null) {
			EntityItem targetFood = this.getNearbyFood();
			if(targetFood != null && !targetFood.isDead && targetFood.getItem().getCount() >= 1) {
				this.getLookHelper().setLookPositionWithEntity(targetFood, 10.0F, (float)this.getVerticalFaceSpeed());
				this.getNavigator().tryMoveToEntityLiving(targetFood, 1.0D);
				if (this.getDistanceSq(targetFood) < 9.0D)
				{
					this.isSquirrelSitting = true;
					this.aiSit.setSitting(true);
					
					MessageSquirrelEat eat = new MessageSquirrelEat(this.getEntityId(), targetFood.getItem().getItem() == ModItems.ACORN ? 0 : 1);
					ModPacketHandler.net.sendToAll(eat);
					
					this.heldFood = targetFood.getItem();
					targetFood.getItem().shrink(1);
				}
			}
		}
		
		if (isSquirrelSitting) {
			sitTicks++;
		}

		if (sitTicks >= 60) {
			this.isSquirrelSitting = false;
			this.aiSit.setSitting(false);
			this.heldFood = null;
			sitTicks = 0;
		}
		super.onLivingUpdate();
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return 5;
	}

	@Override
	public ItemStack setVial() {
		return new ItemStack(ModItems.RODENT_VIAL, 1);
	}

	@Override
	public ItemStack setTameItem() {
		return new ItemStack(ModItems.RODENT_KIBBLE, 1);
	}

	@Override
	public int setVariants() {
		return 5;
	}

	@Override
	public void onVariantSet() {
		//TODO Biome specific variants?
		super.onVariantSet();
	}

	public List<SpeciesData> speciesData() {
		List<SpeciesData> lst = new ArrayList();
		lst.add(new SpeciesData("Eastern Gray", 0));
		lst.add(new SpeciesData("Mexican Gray", 1));
		lst.add(new SpeciesData("Eastern Fox", 2));
		lst.add(new SpeciesData("Eurasian Red", 3));
		lst.add(new SpeciesData("Prevost's", 4));
		return lst;
	}

	@Override
	public AnimalData.EnumNature setNature() {
		return AnimalData.EnumNature.SKITTISH;
	}

	@Override
	public boolean isFoodItem(ItemStack stack) {
		return BreedItems.OmnivoreItems(stack) || ModFoodGroups.SeedItems(stack) || ModFoodGroups.NutItems(stack);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		EntityTreeSquirrel parent2 = (EntityTreeSquirrel) ageable;
		EntityTreeSquirrel child = new EntityTreeSquirrel(this.world);
		if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
			child.setAnimalType(parent2.getAnimalType());
		} else {
			child.setAnimalType(this.getAnimalType());
		}
		return child;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.inventory.getCurrentItem();
		if (!stack.isEmpty()) {
			if (stack != null && (stack.getItem() == ModItems.ACORN || stack.getItem() == ModItems.PINE_CONE) && !this.isSquirrelSitting && !this.isInWater()) {
				this.isSquirrelSitting = true;
				this.aiSit.setSitting(true);
				this.heldFood = new ItemStack(stack.getItem());
				if (!player.isCreative())
					stack.shrink(1);
				return true;
			}
		} else {
			if (player.getPassengers().size() < 3) {
				this.startRiding(player, true);
			}
			return true;
		}
		return super.processInteract(player, hand);
	}

	public boolean getIsSitting() {
		return this.isSquirrelSitting;
	}

	@Nullable
	public void setHeldFood(ItemStack stack) {
		this.heldFood = stack;
	}
	
	@Nullable
	public ItemStack getHeldFood() {
		return this.heldFood;
	}

	@Override
	public void travel(float p_191986_1_, float p_191986_2_, float p_191986_3_) {
		if (this.isSquirrelSitting) {
			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}
		super.travel(p_191986_1_, p_191986_2_, p_191986_3_);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float f2) {
		if (isEntityInvulnerable(source)) {
			return false;
		}
		else {
			if (this.aiSit != null) {
				this.aiSit.setSitting(false);
			}
			return super.attackEntityFrom(source, f2);
		}
	}

	@Override
	public void fall(float distance, float damageMultiplier) {}

	@Override
	protected SoundEvent getAmbientSound() {
		return ModSoundHandler.SQUIRREL_AMBIENT;
	}

	@Override
	protected float getSoundVolume() {
		return 0.1F;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSoundHandler.SQUIRREL_HURT;
	}
}
