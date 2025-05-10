package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.JumpingEntity;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.TreeFrog;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class PacmanFrogEntity extends ZawaLandEntity implements OviparousEntity, JumpingEntity {
    protected final WaterBoundPathNavigation waterNavigation;
    protected final GroundPathNavigation groundNavigation;
    protected TryFindWaterGoal tryFindWaterGoal;
    protected RandomSwimmingGoal randomSwimmingGoal;
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int jumpDelayTicks;

    public PacmanFrogEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
        setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
        jumpControl = new JumpersJumpControl(this);
        moveControl = new TreeFrog.FrogMovementControl(this);
        setSpeedModifier(this, 0.0D);
        waterNavigation = new WaterBoundPathNavigation(this, level());
        groundNavigation = new GroundPathNavigation(this, level());
        tryFindWaterGoal = new TryFindWaterGoal(this);
        randomSwimmingGoal = new RandomSwimmingGoal(this, 1.0D, 10);
    }

    public static AttributeSupplier.Builder registerPacmanFrogAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 4.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData spawnData, @Nullable CompoundTag dataTag) {
        if (spawnData == null) spawnData = new AgeableMobGroupData(false);
        return super.finalizeSpawn(world, difficulty, reason, spawnData, dataTag);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.75F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.PACMAN_FROG.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.PACMAN_FROG_FROGSPAWN.get().getDefaultInstance();
    }

    @Override
    public void setAge(int i) {
        boolean wasBaby = isBaby();
        super.setAge(i);
        if (isBaby() && !wasBaby) {
            navigation = waterNavigation;
            goalSelector.removeGoal(floatGoal);
            goalSelector.removeGoal(waterAvoidingRandomStrollGoal);
            goalSelector.addGoal(0, tryFindWaterGoal);
            goalSelector.addGoal(4, randomSwimmingGoal);
        }
    }

    @Override
    protected void ageBoundaryReached() {
        if (!isBaby()) {
            navigation = groundNavigation;
            goalSelector.removeGoal(tryFindWaterGoal);
            goalSelector.removeGoal(randomSwimmingGoal);
            goalSelector.addGoal(0, floatGoal);
            goalSelector.addGoal(8, waterAvoidingRandomStrollGoal);
        }
    }

    @Override
    public void updateSwimming() {
        if (isBaby() && !level().isClientSide) {
            if (isEffectiveAi() && isInWater()) {
                navigation = waterNavigation;
                setSwimming(true);
            } else {
                navigation = groundNavigation;
                setSwimming(false);
            }
        } else super.updateSwimming();
    }

    @Override
    public void tick() {
        super.tick();
        if (isBaby()) {
            if (onGround() && !isInWaterRainOrBubble()) {
                setDeltaMovement(getDeltaMovement().add((random.nextFloat() * 2.0F - 1.0F) * 0.2F, 0.5D, (random.nextFloat() * 2.0F - 1.0F) * 0.2F));
                setYRot(random.nextFloat() * 360.0F);
                setOnGround(false);;
                hasImpulse = true;
            }
        }
    }

    @Override
    public void baseTick() {
        int i = getAirSupply();
        super.baseTick();
        if (isBaby()) {
            handleAirSupply(i);
        }
    }

    protected void handleAirSupply(int airSupply) {
        if (isAlive() && !isInWaterOrBubble()) {
            setAirSupply(airSupply - 1);
            if (getAirSupply() == -20) {
                setAirSupply(0);
                hurt(damageSources().drown(), 2.0F);
            }
        } else setAirSupply(300);
    }

    @Override
    public void travel(Vec3 travelVector) {
        if (isBaby() && isEffectiveAi() && isInWater()) {
            moveRelative(getSpeed(), travelVector);
            move(MoverType.SELF, getDeltaMovement());
            setDeltaMovement(getDeltaMovement().scale(0.9D));
            if (getTarget() == null) setDeltaMovement(getDeltaMovement().add(0.0D, -0.005D, 0.0D));
        } else super.travel(travelVector);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return isBaby();
    }

    @Override
    public MobType getMobType() {
        return isBaby() ? MobType.WATER : super.getMobType();
    }

    @Override
    public boolean isPushedByFluid() {
        return !isBaby();
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
        return false;
    }

    @Override
    public boolean getJumping() {
        return jumping;
    }

    @Override
    public int getJumpDuration() {
        return jumpDuration;
    }

    @Override
    public void setJumpDuration(int jumpDuration) {
        this.jumpDuration = jumpDuration;
    }

    @Override
    public int getJumpTicks() {
        return jumpTicks;
    }

    @Override
    public void setJumpTicks(int jumpTicks) {
        this.jumpTicks = jumpTicks;
    }

    @Override
    public boolean wasOnGround() {
        return wasOnGround;
    }

    @Override
    public void setWasOnGround(boolean wasOnGround) {
        this.wasOnGround = wasOnGround;
    }

    @Override
    public int getJumpDelayTicks() {
        return jumpDelayTicks;
    }

    @Override
    public void setJumpDelayTicks(int jumpDelayTicks) {
        this.jumpDelayTicks = jumpDelayTicks;
    }

    @Override
    protected float getJumpPower() {
        return adjustJumpPower(this);
    }

    @Override
    protected void jumpFromGround() {
        super.jumpFromGround();
        if (!isBaby()) adjustJumpFromGround(this, getDeltaMovement().horizontalDistanceSqr());
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        if (!isBaby()) jumpServerAiStep(this);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!isBaby()) jumpAiStep(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void handleEntityEvent(byte id) {
        if (id == 1) {
            spawnSprintParticle();
            jumpDuration = 10;
            jumpTicks = 0;

        } else super.handleEntityEvent(id);
    }
}
