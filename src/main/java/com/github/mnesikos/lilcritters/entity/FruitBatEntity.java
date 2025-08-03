package com.github.mnesikos.lilcritters.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaBirthGoal;
import org.zawamod.zawa.world.entity.ai.goal.ZawaBreedGoal;
import org.zawamod.zawa.world.entity.ai.goal.ZawaFollowParentGoal;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

public class FruitBatEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity {
    public static final EntityDataAccessor<Boolean> RESTING = SynchedEntityData.defineId(FruitBatEntity.class, EntityDataSerializers.BOOLEAN);
    private static final TargetingConditions RESTING_TARGETING = TargetingConditions.forNonCombat().range(4.0D);
    @Nullable
    private BlockPos targetPosition;

    public FruitBatEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
        if (!world.isClientSide) setResting(true);
    }

    public static AttributeSupplier.Builder registerFruitBatAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.225F).add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new ZawaBirthGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(2, new ZawaBreedGoal(this, (double)1.0F));
        this.goalSelector.addGoal(4, new ZawaFollowParentGoal(this, (double)1.25F));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !isTame()));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 10.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(RESTING, false);
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return super.getStandingEyeHeight(pose, size);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.FRUIT_BAT.get().create(world);
    }

    @Override
    public boolean isFlying() {
        return !isResting() && super.isFlying();
    }

    public boolean isResting() {
        return entityData.get(RESTING);
    }

    public void setResting(boolean resting) {
        entityData.set(RESTING, resting);
    }

    @Override
    public void tick() {
        super.tick();
        if (isResting()) {
            setDeltaMovement(Vec3.ZERO);
            setPosRaw(getX(), (double) Mth.floor(getY()) + 0.8D - (double) getBbHeight(), getZ()); // todo resting positioning
        } else setDeltaMovement(getDeltaMovement().multiply(1.0D, 0.6D, 1.0D));
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        BlockPos blockpos = blockPosition();
        BlockPos blockpos1 = blockpos.above();
        if (isResting()) {
            boolean flag = isSilent();
            if (level().getBlockState(blockpos1).isRedstoneConductor(level(), blockpos)) {
                if (random.nextInt(200) == 0) {
                    yHeadRot = (float) random.nextInt(360);
                }

                if (level().getNearestPlayer(RESTING_TARGETING, this) != null) {
                    setResting(false);
                    if (!flag) {
                        level().levelEvent(null, 1025, blockpos, 0);
                    }
                }
            } else {
                setResting(false);
                if (!flag) {
                    level().levelEvent(null, 1025, blockpos, 0);
                }
            }
        } else {
            if (targetPosition != null && (!level().isEmptyBlock(targetPosition) || targetPosition.getY() <= level().getMinBuildHeight())) {
                targetPosition = null;
            }

            if (targetPosition == null || random.nextInt(30) == 0 || targetPosition.closerToCenterThan(position(), 2.0D)) {
                targetPosition = BlockPos.containing(getX() + (double) random.nextInt(7) - (double) random.nextInt(7), getY() + (double) random.nextInt(6) - 2.0D, getZ() + (double) random.nextInt(7) - (double) random.nextInt(7));
            }

            double d2 = (double) targetPosition.getX() + 0.5D - getX();
            double d0 = (double) targetPosition.getY() + 0.1D - getY();
            double d1 = (double) targetPosition.getZ() + 0.5D - getZ();
            Vec3 vec3 = getDeltaMovement();
            Vec3 vec31 = vec3.add((Math.signum(d2) * 0.5D - vec3.x) * (double) 0.1F, (Math.signum(d0) * (double) 0.7F - vec3.y) * (double) 0.1F, (Math.signum(d1) * 0.5D - vec3.z) * (double) 0.1F);
            setDeltaMovement(vec31);
            float f = (float) (Mth.atan2(vec31.z, vec31.x) * (double) (180F / (float) Math.PI)) - 90.0F;
            float f1 = Mth.wrapDegrees(f - getYRot());
            zza = 0.5F;
            setYRot(getYRot() + f1);
            if (random.nextInt(100) == 0 && level().getBlockState(blockpos1).isRedstoneConductor(level(), blockpos1)) {
                setResting(true);
            }
        }
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (isInvulnerableTo(source)) return false;
        else {
            if (!level().isClientSide && isResting()) setResting(false);

            return super.hurt(source, amount);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        entityData.set(RESTING, compound.getBoolean("Resting"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("Resting", entityData.get(RESTING));
    }

    @Override
    public int getVariantByBiome(LevelAccessor levelAccessor) {
        return random.nextInt(getWildVariants());
    }
}
