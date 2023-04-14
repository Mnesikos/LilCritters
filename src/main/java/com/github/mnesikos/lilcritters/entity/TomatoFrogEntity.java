package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.entity.base.SpeciesVariantsEntity;
import org.zawamod.zawa.entity.base.ZawaSemiAquaticEntity;
import org.zawamod.zawa.entity.goals.ZawaMeleeAttackGoal;

import javax.annotation.Nullable;

public class TomatoFrogEntity extends ZawaSemiAquaticEntity {
    public TomatoFrogEntity(EntityType<? extends ZawaSemiAquaticEntity> type, World world) {
        super(type, world);
        this.maxUpStep = 1.0F;
    }

    public static AttributeModifierMap.MutableAttribute registerTomatoFrogAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 4.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    public float swimSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public boolean canBabySwim() {
        return true;
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.75F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.TOMATO_FROG.get().create(world);
    }
}
