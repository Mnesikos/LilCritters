package com.github.mnesikos.lilcritters.entity;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.SittingEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

public class PrairieDogEntity extends ZawaLandEntity implements SittingEntity {
    public static final EntityDataAccessor<Boolean> SITTING = SynchedEntityData.defineId(PrairieDogEntity.class, EntityDataSerializers.BOOLEAN);
    private float sitAmount;
    private float sitAmountO;

    public PrairieDogEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerPrairieDogAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
        this.goalSelector.addGoal(7, new SitGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SITTING, false);
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.5F;
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.PRAIRIE_DOG.get().create(world);
    }

    @Override
    public boolean canSit() {
        if (getRandom().nextInt(300) == 0) return !isBaby() && !isInWater() && !isSitting();
        else return false;
    }

    @Override
    public boolean isSitting() {
        return entityData.get(SITTING);
    }

    @Override
    public void tryToSit() {
        if (!isInWater()) {
            setZza(0.0F);
            getNavigation().stop();
            sit(true);
        }
    }

    @Override
    public void sit(boolean sit) {
        entityData.set(SITTING, sit);
    }

    @Override
    public void updateSitAmount() {
        sitAmountO = sitAmount;
        if (isSitting()) sitAmount = Math.min(1.0F, sitAmount + 0.15F);
        else sitAmount = Math.max(0.0F, sitAmount - 0.19F);
    }

    @Override
    public float getSitAmount(float delta) {
        return Mth.lerp(delta, sitAmountO, sitAmount);
    }

    @Override
    public boolean canContinueSitting() {
        return !isInWater();
    }

    @Override
    public void onStopSitting() {}

    @Override
    public void tick() {
        super.tick();
        updateSitAmount();
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        sit(false);
        return super.hurt(source, amount);
    }
}
