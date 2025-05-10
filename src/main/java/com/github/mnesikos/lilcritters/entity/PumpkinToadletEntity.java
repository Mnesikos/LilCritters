package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.item.LCItems;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.JumpingEntity;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class PumpkinToadletEntity extends ZawaLandEntity implements OviparousEntity, JumpingEntity {
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int jumpDelayTicks;

    public PumpkinToadletEntity(EntityType<? extends ZawaLandEntity> type, Level world) {
        super(type, world);
        jumpControl = new JumpersJumpControl(this);
        moveControl = new JumpingMoveControl(this);
        this.setSpeedModifier(this, 0.0D);
    }

    public static AttributeSupplier.Builder registerPumpkinToadletAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 4.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 1.0, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return size.height * 0.35F;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.PUMPKIN_TOADLET.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.PUMPKIN_TOADLET_EGG.get().getDefaultInstance();
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
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
        adjustJumpFromGround(this, getDeltaMovement().horizontalDistanceSqr());
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
