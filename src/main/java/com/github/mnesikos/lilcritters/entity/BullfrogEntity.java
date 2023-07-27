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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.JumpingEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

import javax.annotation.Nullable;

public class BullfrogEntity extends ZawaSemiAquaticEntity implements SpeciesVariantsEntity, JumpingEntity {
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int jumpDelayTicks;

    public BullfrogEntity(EntityType<? extends ZawaSemiAquaticEntity> type, World world) {
        super(type, world);
        this.maxUpStep = 1.0F;
        jumpControl = new JumpHelperController(this);
        moveControl = new MoveHelperController(this);
        this.setSpeedModifier(this, 0.0D);
    }

    public static AttributeModifierMap.MutableAttribute registerBullfrogAttributes() {
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
        return LCEntities.BULLFROG.get().create(world);
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }

    @Override
    public boolean causeFallDamage(float p_225503_1_, float p_225503_2_) {
        return false;
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
    public boolean getJumping() {
        return jumping;
    }

    @Override
    protected float getJumpPower() {
        return adjustJumpPower(this);
    }

    @Override
    protected void jumpFromGround() {
        super.jumpFromGround();
        adjustJumpFromGround(this, getHorizontalDistanceSqr(getDeltaMovement()));
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        jumpServerAiStep(this);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        jumpAiStep(this);
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
