package com.github.mnesikos.lilcritters.entity.base;

import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.controller.JumpController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public interface JumpingEntity {
    boolean getJumping();

    int getJumpDuration();

    void setJumpDuration(int jumpDuration);

    int getJumpTicks();

    void setJumpTicks(int jumpTicks);

    boolean wasOnGround();

    void setWasOnGround(boolean wasOnGround);

    int getJumpDelayTicks();

    void setJumpDelayTicks(int jumpDelayTicks);

    default float adjustJumpPower(MobEntity entity) {
        if (!entity.horizontalCollision && (!entity.getMoveControl().hasWanted() || !(entity.getMoveControl().getWantedY() > entity.getY() + 0.5D))) {
            Path path = entity.getNavigation().getPath();
            if (path != null && !path.isDone()) {
                Vector3d vector3d = path.getNextEntityPos(entity);
                if (vector3d.y > entity.getY() + 0.5D) return 0.5F;
            }
            return entity.getMoveControl().getSpeedModifier() <= 0.6D ? 0.2F : 0.3F;

        } else return 0.5F;
    }

    default void adjustJumpFromGround(MobEntity entity, double horizontalDistanceSqr) {
        double d0 = entity.getMoveControl().getSpeedModifier();
        if (d0 > 0.0D) if (horizontalDistanceSqr < 0.01D) entity.moveRelative(0.1F, new Vector3d(0.0D, 0.0D, 1.0D));
        if (!entity.level.isClientSide) entity.level.broadcastEntityEvent(entity, (byte) 1);
    }

    @OnlyIn(Dist.CLIENT)
    default float getJumpCompletion(float partialTick) {
        return getJumpDuration() == 0 ? 0.0F : ((float) getJumpTicks() + partialTick) / (float) getJumpDuration();
    }

    default void setSpeedModifier(MobEntity entity, double speedModifier) {
        entity.getNavigation().setSpeedModifier(speedModifier);
        entity.getMoveControl().setWantedPosition(entity.getMoveControl().getWantedX(), entity.getMoveControl().getWantedY(), entity.getMoveControl().getWantedZ(), speedModifier);
    }

    default void startJumping(MobEntity entity) {
        entity.setJumping(true);
        setJumpDuration(10);
        setJumpTicks(0);
    }

    default void jumpServerAiStep(MobEntity entity) {
        int jumpDelayTicks = getJumpDelayTicks();
        if (jumpDelayTicks > 0) setJumpDelayTicks(--jumpDelayTicks);

        if (entity.isOnGround()) {
            if (!wasOnGround()) {
                entity.setJumping(false);
                checkLandingDelay(entity);
            }

            JumpHelperController jumpHelperController = (JumpHelperController) entity.getJumpControl();
            if (!jumpHelperController.wantJump()) {
                if (entity.getMoveControl().hasWanted() && getJumpDelayTicks() == 0) {
                    Path path = entity.getNavigation().getPath();
                    Vector3d vector3d = new Vector3d(entity.getMoveControl().getWantedX(), entity.getMoveControl().getWantedY(), entity.getMoveControl().getWantedZ());
                    if (path != null && !path.isDone()) vector3d = path.getNextEntityPos(entity);

                    facePoint(entity, vector3d.x, vector3d.z);
                    startJumping(entity);
                }
            } else if (!jumpHelperController.canJump()) enableJumpControl(entity);
        }

        setWasOnGround(entity.isOnGround());
    }

    default void facePoint(MobEntity entity, double x, double z) {
        entity.yRot = (float) (MathHelper.atan2(z - entity.getZ(), x - entity.getX()) * (double) (180F / (float) Math.PI)) - 90.0F;
    }

    default void enableJumpControl(MobEntity entity) {
        ((JumpHelperController) entity.getJumpControl()).setCanJump(true);
    }

    default void disableJumpControl(MobEntity entity) {
        ((JumpHelperController) entity.getJumpControl()).setCanJump(false);
    }

    default void setLandingDelay(MobEntity entity) {
        if (entity.getMoveControl().getSpeedModifier() < 2.2D) setJumpDelayTicks(10);
        else setJumpDelayTicks(1);
    }

    default void checkLandingDelay(MobEntity entity) {
        setLandingDelay(entity);
        disableJumpControl(entity);
    }

    default void jumpAiStep(MobEntity entity) {
        int jumpTicks = getJumpTicks();
        if (jumpTicks != getJumpDuration()) setJumpTicks(++jumpTicks);
        else if (getJumpDuration() != 0) {
            setJumpTicks(0);
            setJumpDuration(0);
            entity.setJumping(false);
        }
    }

    class JumpHelperController extends JumpController {
        private final ZawaBaseEntity entity;
        private boolean canJump;

        public JumpHelperController(ZawaBaseEntity entity) {
            super(entity);
            this.entity = entity;
        }

        public boolean wantJump() {
            return jump;
        }

        public boolean canJump() {
            return canJump;
        }

        public void setCanJump(boolean pCanJump) {
            canJump = pCanJump;
        }

        public void tick() {
            if (jump) {
                ((JumpingEntity) entity).startJumping(entity);
                jump = false;
            }
        }
    }

    class MoveHelperController extends MovementController {
        private final ZawaBaseEntity entity;
        private double nextJumpSpeed;

        public MoveHelperController(ZawaBaseEntity entity) {
            super(entity);
            this.entity = entity;
        }

        public void tick() {
            if (entity.isOnGround() && !((JumpingEntity) entity).getJumping() && !((JumpingEntity.JumpHelperController) entity.getJumpControl()).wantJump())
                ((JumpingEntity) entity).setSpeedModifier(entity, 0.0D);
            else if (hasWanted()) ((JumpingEntity) entity).setSpeedModifier(entity, nextJumpSpeed);

            super.tick();
        }

        public void setWantedPosition(double x, double y, double z, double speed) {
            if (entity.isInWater()) speed = 1.5D;

            super.setWantedPosition(x, y, z, speed);
            if (speed > 0.0D) nextJumpSpeed = speed;
        }
    }
}
