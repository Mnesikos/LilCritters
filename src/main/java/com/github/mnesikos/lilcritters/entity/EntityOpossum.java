package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.entity.core.modules.ModuleManager;

public class EntityOpossum extends LCBaseLand {
    public EntityOpossum(World world) {
        super(world);
        setSize(0.6F, 0.5F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.8F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.OPOSSUM, ModEntityPoses.OPOSSUM_SLEEP);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.OPOSSUM, ModEntityPoses.OPOSSUM_SLEEP);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.OPOSSUM;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityOpossum parent2 = (EntityOpossum) ageable;
        EntityOpossum child = new EntityOpossum(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
    }

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return DietHandler.OpportunistItems(stack);
    }

    @Override
    protected SoundEvent getAmbientSound() { // todo
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}
