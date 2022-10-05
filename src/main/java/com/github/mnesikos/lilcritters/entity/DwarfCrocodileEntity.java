package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.entity.base.ZawaSemiAquaticEntity;
import org.zawamod.zawa.entity.goals.ZawaMeleeAttackGoal;

import javax.annotation.Nullable;

public class DwarfCrocodileEntity extends ZawaSemiAquaticEntity {
    public DwarfCrocodileEntity(EntityType<? extends ZawaSemiAquaticEntity> type, World world) {
        super(type, world);
        this.maxUpStep = 1.0F;
    }

    public static AttributeModifierMap.MutableAttribute registerDwarfCrocodileAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 12.0).add(Attributes.ATTACK_DAMAGE, 4.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0, 1.33, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NonTamedTargetGoal<>(this, PlayerEntity.class, true, (entity) -> this.distanceToSqr(entity) <= 10.0));
    }

    @Override
    public float swimSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public boolean canBabySwim() {
        return false;
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.6F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.DWARF_CROCODILE.get().create(world);
    }

    /*@Override
    public boolean doHurtTarget(Entity entity) {
        boolean didHurtTarget = super.doHurtTarget(entity);
        if (didHurtTarget) {
            this.playSound(LCSounds.DWARF_CROCODILE_ATTACKING.get(), 1.0F, 1.0F);
        }

        return didHurtTarget;
    } // todo */

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}
