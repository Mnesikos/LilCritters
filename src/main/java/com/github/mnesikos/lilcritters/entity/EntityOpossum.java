package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.AnimalData.EnumNature;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.init.ZAWAItems;

public class EntityOpossum extends LCBaseLand {
    public EntityOpossum(World world) {
        super(world);
        setSize(0.6F, 0.5F);
        this.stepHeight = 1.0F;
        this.speed = 1.0F;
        this.activity = AnimalData.Activity.CALM;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.8F;
    }

    @Override
    public boolean displayCuriosity() {
        return true;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
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
    public EnumNature setNature() {
        return EnumNature.SKITTISH;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.CANINE_VIAL, 1);
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
