package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLandAvoidWater;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.IMultiSpeciesEntity;
import org.zawamod.entity.core.modules.ModuleManager;

import java.util.HashMap;
import java.util.Map;

public class EntitySkunk extends LCBaseLandAvoidWater implements IMultiSpeciesEntity {
    public EntitySkunk(World world) {
        super(world);
        setSize(0.6F, 0.6F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.5F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.SKUNK, ModEntityPoses.SKUNK_SLEEP);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.SKUNK, ModEntityPoses.SKUNK_SLEEP);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.SKUNK;
    }

    @Override
    protected void updateAITasks() {
        if (this.getMoveHelper().isUpdating()) {
            double d0 = this.getMoveHelper().getSpeed();

            if (d0 >= 1.33D)
                this.setSprinting(true);
            else
                this.setSprinting(false);

        } else
            this.setSprinting(false);

        super.updateAITasks();
    }

    @Override
    public Map<Integer, String> speciesData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Striped");
        map.put(1, "Hooded");
        return map;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntitySkunk parent2 = (EntitySkunk) ageable;
        EntitySkunk child = new EntitySkunk(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
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
