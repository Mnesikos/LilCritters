package com.github.mnesikos.lilcritters.entity;

import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.IMultiSpeciesEntity;
import org.zawamod.entity.core.SpeciesData;

import java.util.List;

public class EntitySkunk extends EntityBaseAvoidWater implements IMultiSpeciesEntity {
    public EntitySkunk(World world) {
        super(world);
        setSize(0.8F, 0.8F);
    }

    @Override
    public ItemStack setVial() {
        return null;
    }

    @Override
    public ItemStack setTameItem() {
        return null;
    }

    @Override
    public int setVariants() {
        return 0;
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return null;
    }

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }

    @Override
    public List<SpeciesData> speciesData() {
        return null;
    }
}
