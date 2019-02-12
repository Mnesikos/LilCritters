package com.github.mnesikos.lilcritters.entity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.util.math.BlockPos;
import org.zawamod.configuration.ZAWAConfig;
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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.land.EntityBlackSpiderMonkey;
import org.zawamod.util.DataItem;
import org.zawamod.util.StringedItem;
import org.zawamod.util.status.StatusClimbing;

public class EntityTreeSquirrel extends EntityBaseAvoidWater implements IMultiSpeciesEntity {
	private boolean isSquirrelSitting;
	private int sitTicks;
	private ItemStack heldFood = ItemStack.EMPTY;
	private static final DataParameter<Byte> CLIMBING;

	public EntityTreeSquirrel(World world) {
		super(world);
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
		this.tasks.addTask(0, this.aiSit);
		this.tasks.addTask(4, new EntityAITempt(this, 1.25D, ModItems.ACORN, true));
		this.tasks.addTask(4, new EntityAITempt(this, 1.25D, ModItems.PINE_CONE, true));
	}

	@Override
	public DataItem getIconList() {
		List<StringedItem> s = new ArrayList<>();
		s.add(new StatusClimbing());
		return new DataItem(s);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CLIMBING, (byte)0);
	}

	@Override
	protected PathNavigate createNavigator(World worldIn) {
		return new PathNavigateClimber(this, worldIn);
	}

	public void setSquirrelSitting(boolean b) {
		this.isSquirrelSitting = b;
	}
    
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setTag("HeldFood", this.getHeldFood().writeToNBT(new NBTTagCompound()));
    }
    
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        if(tagCompound.getTag("HeldFood") == null)
        	this.setHeldFood(ItemStack.EMPTY);
        else
        	this.setHeldFood(new ItemStack((NBTTagCompound) tagCompound.getTag("HeldFood")));
    }

	public void setSitting() {
		this.aiSit.setSitting(true);
	}

	@Override
	public float getEyeHeight() {
		return this.height * 0.5F;
	}

	/*protected final EntityItem getNearbyNut()
	{
		List<EntityItem> list = this.world.<EntityItem>getEntitiesWithinAABB(EntityItem.class, this.getEntityBoundingBox().grow(8.0D));
		double d0 = Double.MAX_VALUE;
		EntityItem item = null;

		for (EntityItem itm : list) {
			if((item.getItem().getItem() == ModItems.ACORN || item.getItem().getItem() == ModItems.PINE_CONE)) {
				if (this.getDistanceSq(itm) < d0) {
					item = itm;
					d0 = this.getDistanceSq(itm);
				}
			}
		}
		return item;
	}*/

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!this.world.isRemote && this.collidedHorizontally) {
			if (this.isValidBlock(this.world.getBlockState(new BlockPos(this.posX + 1.0D, this.posY, this.posZ)).getBlock())) {
				this.setBesideClimbableBlock(this.collidedHorizontally);
			} else if (this.isValidBlock(this.world.getBlockState(new BlockPos(this.posX - 1.0D, this.posY, this.posZ)).getBlock())) {
				this.setBesideClimbableBlock(this.collidedHorizontally);
			} else if (this.isValidBlock(this.world.getBlockState(new BlockPos(this.posX, this.posY, this.posZ + 1.0D)).getBlock())) {
				this.setBesideClimbableBlock(this.collidedHorizontally);
			} else if (this.isValidBlock(this.world.getBlockState(new BlockPos(this.posX, this.posY, this.posZ - 1.0D)).getBlock())) {
				this.setBesideClimbableBlock(this.collidedHorizontally);
			}
		}
	}

	private boolean isValidBlock(Block b) {
		return b instanceof BlockLog || b instanceof BlockLeaves || b instanceof BlockPlanks;
	}

	@Override
	public void onLivingUpdate() {
		if(this.getHeldFood() == ItemStack.EMPTY) {
			EntityItem targetFood = this.getNearbyFood();
			if(targetFood != null && !targetFood.isDead && targetFood.getItem().getCount() >= 1) {
				
				this.getLookHelper().setLookPositionWithEntity(targetFood, 10.0F, (float)this.getVerticalFaceSpeed());
				this.getNavigator().tryMoveToEntityLiving(targetFood, 1.25D);
				
				if (this.getDistanceSq(targetFood) < 2.0D){
					this.isSquirrelSitting = true;
					this.aiSit.setSitting(true);

					this.setHeldFood(targetFood.getItem());
					
					MessageSquirrelEat eat = new MessageSquirrelEat(this.getEntityId(), this.getHeldFood().writeToNBT(new NBTTagCompound()));
					ModPacketHandler.net.sendToAll(eat);
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
			this.setHeldFood(ItemStack.EMPTY);
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
		List<SpeciesData> lst = new ArrayList<>();
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
			if (stack != null && this.isFoodItem(stack) && !this.isSquirrelSitting && !this.isInWater()) {
				this.isSquirrelSitting = true;
				this.aiSit.setSitting(true);
				this.setHeldFood(new ItemStack(stack.getItem()));
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

	@Override
	protected boolean isMovementBlocked() {
		return this.isSquirrelSitting || super.isMovementBlocked();
	}

	@Override
	public void travel(float strafe, float vertical, float forward) {
		if (this.isSquirrelSitting) {
			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
		}
		super.travel(strafe, vertical, forward);
	}

	public boolean getIsSitting() {
		return this.isSquirrelSitting;
	}

	public void setHeldFood(ItemStack stack) {
		this.heldFood = stack == null ? ItemStack.EMPTY : stack;
	}
	
	public ItemStack getHeldFood() {
		return this.heldFood == null ? this.heldFood = ItemStack.EMPTY : this.heldFood;
	}

	public boolean isBesideClimbableBlock() {
		return ((Byte)this.dataManager.get(CLIMBING) & 1) != 0;
	}

	public void setBesideClimbableBlock(boolean climbing) {
		byte b0 = (Byte)this.dataManager.get(CLIMBING);
		if (climbing) {
			b0 = (byte)(b0 | 1);
		} else {
			b0 &= -2;
		}

		this.dataManager.set(CLIMBING, b0);
	}

	@Override
	public boolean isOnLadder() {
		return this.isBesideClimbableBlock() && ZAWAConfig.canClimb;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float f2) {
		if (isEntityInvulnerable(source)) {
			return false;
		}
		else {
			if (this.aiSit != null) {
				this.aiSit.setSitting(false); // cancels sitting when attacked
			}
			return super.attackEntityFrom(source, f2);
		}
	}

	@Override
	public void fall(float distance, float damageMultiplier) {} // no fall damage for these guys

	@Override
	protected SoundEvent getAmbientSound() {
		if (this.rand.nextInt(4) == 0) // 1/4th the amount of noise
			return ModSoundHandler.SQUIRREL_AMBIENT;
		else
			return null;
	}

	@Override
	protected float getSoundVolume() { // does this even do anything, I notice no difference
		return 0.1F;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSoundHandler.SQUIRREL_HURT;
	}

	static {
		CLIMBING = EntityDataManager.createKey(EntityBlackSpiderMonkey.class, DataSerializers.BYTE);
	}
}
