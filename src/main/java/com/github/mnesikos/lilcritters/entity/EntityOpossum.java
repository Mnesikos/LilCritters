package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.BreedItems;
import org.zawamod.init.ZAWAItems;

public class EntityOpossum extends EntityBase {
    public EntityOpossum(World world) {
        super(world);
        setSize(0.8F, 0.8F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
    }

    @Override
    protected void initEntityAI() {
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityOpossum parent2 = (EntityOpossum) ageable;
        EntityOpossum child = new EntityOpossum(this.world);
        if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
            child.setAnimalType(parent2.getAnimalType());
        } else {
            child.setAnimalType(this.getAnimalType());
        }
        return child;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.CANINE_VIAL, 1);
    }

    @Override
    public ItemStack setTameItem() {
        return new ItemStack(ZAWAItems.CANINE_KIBBLE, 1);
    }

    @Override
    public int setVariants() {
        return 1;
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.SKITTISH;
    }

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return BreedItems.InsectivoreItems(stack) || BreedItems.OmnivoreItems(stack);
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
