package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.ai.EntityAIRapidEatGrass;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

public class EntityTuftedDeer extends LCBaseLand {
    private EntityAIRapidEatGrass entityAIEatGrass;
    private int timer;

    public EntityTuftedDeer(World world) {
        super(world);
        setSize(1.0F, 1.2F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.8F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.TUFTED_DEER, ModEntityPoses.TUFTED_DEER_SLEEP);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.TUFTED_DEER, ModEntityPoses.TUFTED_DEER_SLEEP);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.entityAIEatGrass = new EntityAIRapidEatGrass(this);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(10, this.entityAIEatGrass);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.TUFTED_DEER;
    }

    @Override
    protected void updateAITasks() {
        this.timer = this.entityAIEatGrass.getEatingGrassTimer();

        if (this.getMoveHelper().isUpdating()) {
            double d0 = this.getMoveHelper().getSpeed();

            this.setSprinting(d0 >= 1.33D);

        } else
            this.setSprinting(false);

        super.updateAITasks();
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityTuftedDeer parent2 = (EntityTuftedDeer) ageable;
        EntityTuftedDeer child = new EntityTuftedDeer(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }

    @Override
    public void onLivingUpdate() {
        if (this.world.isRemote)
            this.timer = Math.max(0, this.timer - 1);
        super.onLivingUpdate();
    }

    @Override
    public void handleStatusUpdate(byte id) {
        if (id == 10)
            this.timer = 40;
        else
            super.handleStatusUpdate(id);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() { //TODO
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}