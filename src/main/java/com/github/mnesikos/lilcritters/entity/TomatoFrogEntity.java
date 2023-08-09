package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.FindWaterGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.pathfinding.SwimmerPathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.JumpingEntity;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.TreeFrog;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class TomatoFrogEntity extends ZawaLandEntity implements OviparousEntity, JumpingEntity {
    protected final SwimmerPathNavigator waterNavigation;
    protected final GroundPathNavigator groundNavigation;
    protected FindWaterGoal tryFindWaterGoal;
    protected RandomSwimmingGoal randomSwimmingGoal;
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int jumpDelayTicks;

    public TomatoFrogEntity(EntityType<? extends ZawaBaseEntity> type, World world) {
        super(type, world);
        setPathfindingMalus(PathNodeType.WATER, 0.0F);
        jumpControl = new JumpersJumpControl(this);
        moveControl = new TreeFrog.FrogMovementControl(this);
        setSpeedModifier(this, 0.0D);
        waterNavigation = new SwimmerPathNavigator(this, level);
        groundNavigation = new GroundPathNavigator(this, level);
        tryFindWaterGoal = new FindWaterGoal(this);
        randomSwimmingGoal = new RandomSwimmingGoal(this, 1.0D, 10);
    }

    public static AttributeModifierMap.MutableAttribute registerTomatoFrogAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 4.0).add(Attributes.ATTACK_DAMAGE, 0.5);
    }

    @Override
    public ILivingEntityData finalizeSpawn(IServerWorld world, DifficultyInstance difficulty, SpawnReason reason, @Nullable ILivingEntityData spawnData, @Nullable CompoundNBT dataTag) {
        if (spawnData == null) spawnData = new AgeableData(false);
        return super.finalizeSpawn(world, difficulty, reason, spawnData, dataTag);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
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

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.TOMATO_FROG_FROGSPAWN.get().getDefaultInstance();
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
        if (isBaby() && !level.isClientSide) {
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
            if (onGround && !isInWaterRainOrBubble()) {
                setDeltaMovement(getDeltaMovement().add((random.nextFloat() * 2.0F - 1.0F) * 0.2F, 0.5D, (random.nextFloat() * 2.0F - 1.0F) * 0.2F));
                yRot = random.nextFloat() * 360.0F;
                onGround = false;
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
                hurt(DamageSource.DROWN, 2.0F);
            }
        } else setAirSupply(300);
    }

    @Override
    public void travel(Vector3d travelVector) {
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
    public CreatureAttribute getMobType() {
        return isBaby() ? CreatureAttribute.WATER : super.getMobType();
    }

    @Override
    public boolean isPushedByFluid() {
        return !isBaby();
    }

    @Override
    public boolean causeFallDamage(float p_225503_1_, float p_225503_2_) {
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
        if (!isBaby()) adjustJumpFromGround(this, getHorizontalDistanceSqr(getDeltaMovement()));
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
