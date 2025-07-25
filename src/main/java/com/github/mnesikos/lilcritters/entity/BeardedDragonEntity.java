package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WallClimberNavigation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.ClimbingEntity;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

public class BeardedDragonEntity extends ZawaLandEntity implements OviparousEntity, ClimbingEntity {
    public static final EntityDataAccessor<Boolean> CLIMBING = SynchedEntityData.defineId(BeardedDragonEntity.class, EntityDataSerializers.BOOLEAN);

    public BeardedDragonEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerBeardedDragonAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return super.getStandingEyeHeight(pose, size); // todo
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.BEARDED_DRAGON.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.BEARDED_DRAGON_EGG.get().getDefaultInstance();
    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new WallClimberNavigation(this, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (!level().isClientSide && horizontalCollision)
            setClimbing(isClimbableBlock(level(), blockPosition().relative(getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return isClimbing();
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
        return false;
    }

    @Override
    public boolean isClimbing() {
        return entityData.get(CLIMBING);
    }

    @Override
    public void setClimbing(boolean climbing) {
        entityData.set(CLIMBING, climbing);
    }
}
