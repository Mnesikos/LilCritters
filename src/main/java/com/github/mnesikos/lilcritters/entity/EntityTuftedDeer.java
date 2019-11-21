package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.util.ModFoodGroups;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.init.ZAWAItems;

import javax.annotation.Nullable;

public class EntityTuftedDeer extends EntityBase {
    public EntityTuftedDeer(World world) {
        super(world);
        setSize(1.0F, 1.2F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24D);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
    }

    @Override
    public float getEyeHeight() {
        return super.getEyeHeight();
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 2;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.UNGULATE_VIAL, 1);
    }

    @Override
    public ItemStack setTameItem() {
        return new ItemStack(ZAWAItems.UNGULATE_KIBBLE, 1);
    }

    @Override
    public int setVariants() {
        return 4;
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.SKITTISH;
    }

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return ModFoodGroups.VegetationItems(stack);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityTuftedDeer parent2 = (EntityTuftedDeer) ageable;
        EntityTuftedDeer fawn = new EntityTuftedDeer(this.world);
        if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
            fawn.setAnimalType(parent2.getAnimalType());
        } else {
            fawn.setAnimalType(this.getAnimalType());
        }
        return fawn;
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