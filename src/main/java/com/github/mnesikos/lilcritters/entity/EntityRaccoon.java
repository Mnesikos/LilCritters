package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.modules.ModuleManager;

public class EntityRaccoon extends LCBaseLand {
    public EntityRaccoon(World world) {
        super(world);
        setSize(0.8F, 0.6F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.7F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.RACCOON, ModEntityPoses.RACCOON_SLEEP);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.RACCOON, ModEntityPoses.RACCOON_SLEEP);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.RACCOON;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityRaccoon parent2 = (EntityRaccoon) ageable;
        EntityRaccoon child = new EntityRaccoon(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 4;
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
