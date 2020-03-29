package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseCrossover;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.init.ZAWAItems;

public class EntitySmallClawedOtter extends LCBaseCrossover {
    private BlockPos toGo = null;
    private int swimTime = 0;

    public EntitySmallClawedOtter(World world) {
        super(world);
        setSize(0.8F, 0.6F);
        this.speed = 1.0F;
        this.activity = AnimalData.Activity.ACTIVE;
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.5F;
    }

    @Override
    public boolean displayCuriosity() {
        return true;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.26D);
    }

    @Override
    public ItemStack setTameItem() {
        return new ItemStack(ZAWAItems.PINNIPED_KIBBLE);
    }

    @Override
    public int setVariants() {
        return 4;
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.NEUTRAL;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.PINNIPED_VIAL);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntitySmallClawedOtter parent2 = (EntitySmallClawedOtter) ageable;
        EntitySmallClawedOtter child = new EntitySmallClawedOtter(this.world);
        if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
            child.setAnimalType(parent2.getAnimalType());
        } else {
            child.setAnimalType(this.getAnimalType());
        }
        return child;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.inWater) {
            ++this.swimTime;
        } else {
            this.swimTime = 0;
            if (this.toGo != null) {
                this.toGo = null;
            }
        }

        if (this.swimTime > 30 && this.toGo == null) {
            Vec3d vec3d = RandomPositionGenerator.getLandPos(this, 10, 7);
            if (vec3d != null) {
                this.toGo = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
            }
        }

        if (this.toGo != null) {
            this.navigator.tryMoveToXYZ((double)this.toGo.getX(), (double)this.toGo.getY(), (double)this.toGo.getZ(), 1.0D);
        }
    }

    @Override
    public void travel(float strafe, float up, float forward) {
        if (this.isServerWorld() && this.isInWater()) {
            this.moveRelative(strafe, up, forward, 0.1F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.7999999761581421D;
            this.motionY *= 0.7999999761581421D;
            this.motionZ *= 0.7999999761581421D;
            if (this.collidedHorizontally) {
                this.motionY = 0.25999999046325684D;
                float f = this.rotationYaw * 0.017453292F;
                this.motionX -= (double)(MathHelper.sin(f) * 0.2F) * 1.0D;
                this.motionZ += (double)(MathHelper.cos(f) * 0.2F) * 1.0D;
            }

            if (!this.isMoving() && this.getAttackTarget() == null)
                this.motionY += 0.005D;
        } else
            super.travel(strafe, up, forward);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}
