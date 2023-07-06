package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.JumpingEntity;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class PumpkinToadletEntity extends ZawaLandEntity implements JumpingEntity {
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int jumpDelayTicks;

    public PumpkinToadletEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
        jumpControl = new JumpHelperController(this);
        moveControl = new MoveHelperController(this);
        this.setSpeedModifier(this, 0.0D);
    }

    public static AttributeModifierMap.MutableAttribute registerPumpkinToadletAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 1.0, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.35F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.PUMPKIN_TOADLET.get().create(world);
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
