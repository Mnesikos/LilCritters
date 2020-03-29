package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.ai.EntityAIRapidEatGrass;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.init.ZAWAItems;

import javax.annotation.Nullable;

public class EntityTuftedDeer extends LCBaseLand {
    private EntityAIRapidEatGrass entityAIEatGrass;
    private int timer;

    public EntityTuftedDeer(World world) {
        super(world);
        setSize(1.0F, 1.2F);
        this.stepHeight = 1.0F;
        this.speed = 1.2F;
        this.activity = AnimalData.Activity.HASTY;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24D);
    }

    @Override
    public float getEyeHeight() {
        return this.isChild() ? this.height * 0.8F : (this.scale() / 100.0F) * 2.4F;
    }

    @Override
    public boolean displayCuriosity() {
        return false;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.entityAIEatGrass = new EntityAIRapidEatGrass(this);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(10, this.entityAIEatGrass);
    }

    @Override
    protected void updateAITasks() {
        this.timer = this.entityAIEatGrass.getEatingGrassTimer();

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
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.UNGULATE_VIAL, 1);
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