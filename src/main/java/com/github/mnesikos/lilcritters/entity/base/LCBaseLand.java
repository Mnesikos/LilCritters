package com.github.mnesikos.lilcritters.entity.base;

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

public abstract class LCBaseLand extends ZAWABaseLand {
	protected EntityAIWanderAvoidWater aiWanderAvoidWater;

	public LCBaseLand(World world) {
		super(world);
		this.stepHeight = 1.0F;
		this.speed = 1.0F; //This is the speed variable that the zawa wander ai uses
		/* How often the entity should move ACTIVITY(chance)
		 * ACTIVE(50)
		 * HASTY(60)
		 * NORMAL(90)
		 * CALM(110)
		 * LAZY(130)
		 * INACTIVE(190) */
		this.activity = AnimalData.Activity.NORMAL;
	}

	@Override
	public abstract float getEyeHeight();

	//This will let the animal wander and check out dropped item
	@Override
	public abstract boolean displayCuriosity();

	//This will let the animal be carried in the back of the ATV
	@Override
	public boolean isTransportable() {
		return true;
	}

	@Override
	public abstract ItemStack setTameItem();

	@Override
	public abstract int setVariants();

	//SKITTISH - avoids when too close? (I think)
	//NETURAL - nothing
	//PROTECTIVE - attack when the entity is near or when hit (distance depends on difficulty)
	//AGGRESSIVE - attack on sight
	@Override
	public abstract AnimalData.EnumNature setNature();

	//All entities extending this class that are able to be picked up will have their position determined here
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
	public abstract EntityAgeable createChild(EntityAgeable ageable);

	//All entities extending this class can only be leashed by players in creative mode
	@Override
	public boolean canBeLeashedTo(EntityPlayer player) {
		return player.isCreative();
	}

	//Makes all entities extending this class less talkative (less annoying) - higher number = less talkative
	@Override
	public int getTalkInterval() {
		return 240;
	}

	@Override
	protected abstract SoundEvent getAmbientSound();

	@Override
	protected abstract SoundEvent getHurtSound(DamageSource damageSourceIn);
}