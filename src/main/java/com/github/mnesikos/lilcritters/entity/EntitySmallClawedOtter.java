package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseCrossover;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.modules.ModuleManager;

public class EntitySmallClawedOtter extends LCBaseCrossover {
    private BlockPos toGo = null;
    private int swimTime = 0;

    public EntitySmallClawedOtter(World world) {
        super(world);
        setSize(0.6F, 0.4F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.7F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.SMALL_CLAWED_OTTER, ModEntityPoses.SMALL_CLAWED_OTTER_SLEEP);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.SMALL_CLAWED_OTTER, ModEntityPoses.SMALL_CLAWED_OTTER_SLEEP);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.SMALL_CLAWED_OTTER;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntitySmallClawedOtter parent2 = (EntitySmallClawedOtter) ageable;
        EntitySmallClawedOtter child = new EntitySmallClawedOtter(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

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
