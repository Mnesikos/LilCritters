package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.entity.base.ZawaLandEntity;
import org.zawamod.zawa.entity.behavior.ClimbingEntity;

import javax.annotation.Nullable;

public class TreeMonitorEntity extends ZawaLandEntity implements ClimbingEntity {
    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(TreeMonitorEntity.class, DataSerializers.BOOLEAN);

    public TreeMonitorEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerTreeMonitorAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.TREE_MONITOR.get().create(world);
    }

    @Override
    protected PathNavigator createNavigation(World world) {
        return new ClimberPathNavigator(this, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level.isClientSide && this.horizontalCollision)
            this.setClimbing(this.isClimbableBlock(this.level, this.blockPosition().relative(this.getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return this.isClimbing();
    }

    @Override
    public boolean causeFallDamage(float distance, float damageMultiplier) {
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
    public boolean isClimbing() {
        return this.entityData.get(CLIMBING);
    }

    @Override
    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }
}
