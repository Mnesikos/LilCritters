package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLandAvoidWater;
import com.github.mnesikos.lilcritters.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.IMultiSpeciesEntity;

import java.util.HashMap;
import java.util.Map;

public class EntitySkunk extends LCBaseLandAvoidWater implements IMultiSpeciesEntity {
    public EntitySkunk(World world) {
        super(world);
        setSize(0.8F, 0.8F);
        this.stepHeight = 1.0F;
        this.speed = 1.0F;
        this.activity = AnimalData.Activity.CALM;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
    }

    @Override
    public float getEyeHeight() {
        return 0.5F;
    }

    @Override
    public boolean displayCuriosity() {
        return false;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
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
    public ItemStack setTameItem() {
        return new ItemStack(ModItems.RODENT_KIBBLE, 1);
    }

    @Override
    public int setVariants() {
        return 2;
    }

    @Override
    public Map<Integer, String> speciesData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Striped");
        map.put(1, "Hooded");
        return map;
    }

    @Override
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.SKITTISH;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ModItems.RODENT_VIAL, 1);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntitySkunk parent2 = (EntitySkunk) ageable;
        EntitySkunk child = new EntitySkunk(this.world);
        if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
            child.setAnimalType(parent2.getAnimalType());
        } else {
            child.setAnimalType(this.getAnimalType());
        }
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
