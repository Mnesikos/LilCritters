package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.zawamod.entity.base.ZAWABaseLand;
import org.zawamod.entity.core.AnimalData;

public abstract class EntityBase extends ZAWABaseLand {
	//protected static final DataParameter<Boolean> EGG_SPAWNED;
	protected EntityAIWanderAvoidWater aiWanderAvoidWater;

	public EntityBase(World world, Double defaultSpeed) {
		super(world, defaultSpeed);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		//this.dataManager.register(EGG_SPAWNED, false);
	}

	@Override
	protected void initEntityAI() {
		super.initEntityAI();
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}

	@Override
	public abstract int getMaxSpawnedInChunk();

	// might adjust this sometime
	/*@Override
	public boolean getCanSpawnHere() {
		return super.getCanSpawnHere();
	}*/

	@Override
	protected boolean canDespawn() {
		return !this.isTamed();
	}

	@Override
	public void updateRidden() {
		Entity entity = this.getRidingEntity();
		if (this.isRiding() && entity.isDead) {
			this.dismountRidingEntity();
		} else {
			this.motionX = 0.0D;
			this.motionY = 0.0D;
			this.motionZ = 0.0D;
			this.onUpdate();
			if (this.isRiding()) {
				if (entity.isPassenger(this) && entity instanceof EntityPlayer) {
					this.rotationYaw = ((EntityPlayer) entity).rotationYawHead;
					this.rotationYawHead = ((EntityPlayer) entity).rotationYawHead;
					this.prevRotationYaw = ((EntityPlayer) entity).rotationYawHead;
					int i = entity.getPassengers().indexOf(this);
					float radius = (i == 2 ? 0F : 0.4F);
					float angle = (0.0174533F * ((EntityPlayer) entity).renderYawOffset) + (i == 1 ? -90 : i == 0 ? 90 : 0);
					this.setPosition(
							entity.posX + (double) (radius * MathHelper.sin((float) (Math.PI + angle))),
							entity.posY + 1.4D + (i == 2 ? 0.4D : 0D),
							entity.posZ + (double) (radius * MathHelper.cos(angle)));
					if (entity.onGround && entity.isSneaking()) {
						this.dismountRidingEntity();
					}
				}
			}
		}
	}

	@Override
	public abstract ItemStack setVial();

	@Override
	public abstract ItemStack setTameItem();

	/*public boolean getEggSpawned() {
		return (Boolean)this.dataManager.get(EGG_SPAWNED);
	}

	public void setEggSpawned(boolean eggSpawned) {
		this.dataManager.set(EGG_SPAWNED, eggSpawned);
	}*/

	@Override
	public abstract int setVariants();

	@Override
	public abstract AnimalData.EnumNature setNature();

    @Override
    public abstract boolean isFoodItem(ItemStack stack);

	@Override
	public boolean canBeLeashedTo(EntityPlayer player) {
		return player.isCreative(); // can only be leashed by players in creative mode
	}

	@Override
	public int getTalkInterval() {
		return 240; // higher number = less talkative
	}

	@Override
	protected abstract SoundEvent getAmbientSound();

	@Override
	protected abstract SoundEvent getHurtSound(DamageSource damageSourceIn);
}
