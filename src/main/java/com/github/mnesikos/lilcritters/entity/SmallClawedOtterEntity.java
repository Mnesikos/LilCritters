package com.github.mnesikos.lilcritters.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;

import javax.annotation.Nullable;

public class SmallClawedOtterEntity extends ZawaSemiAquaticEntity {
    public SmallClawedOtterEntity(EntityType<? extends ZawaSemiAquaticEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 1.0F;
    }

    public static AttributeSupplier.Builder registerSmallClawedOtterAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 10.0).add(Attributes.ATTACK_DAMAGE, 2.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    public float swimSpeedMultiplier() {
        return 0.5F;
    }

    @Override
    public boolean canBabySwim() {
        return true;
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.7F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.SMALL_CLAWED_OTTER.get().create(world);
    }
}
