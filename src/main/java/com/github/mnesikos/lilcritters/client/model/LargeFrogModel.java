package com.github.mnesikos.lilcritters.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;
import org.zawamod.zawa.world.entity.JumpingEntity;

public class LargeFrogModel<E extends Entity> extends ZawaFrogBaseModel<E> {
    public ZawaModelRenderer Hips;
    public ZawaModelRenderer Head;
    public ZawaModelRenderer BodyPixie;
    public ZawaModelRenderer ArmLeft;
    public ZawaModelRenderer ArmRight;
    public ZawaModelRenderer ThighLeft;
    public ZawaModelRenderer ThighRight;
    public ZawaModelRenderer HipsPixie;
    public ZawaModelRenderer LegLeft;
    public ZawaModelRenderer FootLeft;
    public ZawaModelRenderer LegRight;
    public ZawaModelRenderer FootRight;
    public ZawaModelRenderer Forehead;
    public ZawaModelRenderer Snout;
    public ZawaModelRenderer Mouth;
    public ZawaModelRenderer EyeLeft;
    public ZawaModelRenderer EyeRight;
    public ZawaModelRenderer SnoutLeft;
    public ZawaModelRenderer SnoutRight;
    public ZawaModelRenderer HeadUnder;
    public ZawaModelRenderer HeadUnderPixie;
    public ZawaModelRenderer ForearmLeft;
    public ZawaModelRenderer HandLeft;
    public ZawaModelRenderer ForearmRight;
    public ZawaModelRenderer HandRight;
    private float jumpRotation;

    public LargeFrogModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.ArmLeft = new ZawaModelRenderer(this, 0, 21);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setPos(1.5F, 0.3F, -1.5F);
        this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ArmLeft, 1.3613568165555772F, 0.6283185307179586F, 0.0F);
        this.Mouth = new ZawaModelRenderer(this, 21, 27);
        this.Mouth.setPos(0.0F, 0.5F, -1.5F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.3490658503988659F, 0.0F, 0.0F);
        this.ForearmRight = new ZawaModelRenderer(this, 0, 24);
        this.ForearmRight.setPos(0.2F, 1.8F, -0.5F);
        this.ForearmRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmRight, 1.1344640137963142F, 0.08726646259971647F, -0.22689280275926282F);
        this.ForearmLeft = new ZawaModelRenderer(this, 0, 24);
        this.ForearmLeft.mirror = true;
        this.ForearmLeft.setPos(-0.2F, 1.8F, -0.5F);
        this.ForearmLeft.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmLeft, 1.1344640137963142F, -0.08726646259971647F, 0.22689280275926282F);
        this.EyeLeft = new ZawaModelRenderer(this, 18, 20);
        this.EyeLeft.mirror = true;
        this.EyeLeft.setPos(0.9F, 0.2F, -1.65F);
        this.EyeLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(EyeLeft, 0.0F, 0.3490658503988659F, 0.0F);
        this.ThighLeft = new ZawaModelRenderer(this, 8, 13);
        this.ThighLeft.mirror = true;
        this.ThighLeft.setPos(1.0F, 1.5F, 2.3F);
        this.ThighLeft.addBox(-0.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ThighLeft, -0.2792526803190927F, 0.6981317007977318F, -0.22689280275926282F);
        this.HandLeft = new ZawaModelRenderer(this, 0, 27);
        this.HandLeft.mirror = true;
        this.HandLeft.setPos(0.0F, -1.5F, 0.7F);
        this.HandLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(HandLeft, -0.593411945678072F, 0.0F, 0.0F);
        this.BodyPixie = new ZawaModelRenderer(this, 0, 0);
        this.BodyPixie.mirror = true;
        this.BodyPixie.setPos(0.0F, 0.0F, 0.0F);
        this.BodyPixie.addBox(-2.5F, -2.0F, -2.0F, 5.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.SnoutRight = new ZawaModelRenderer(this, 8, 24);
        this.SnoutRight.setPos(-1.8F, 0.0F, 1.0F);
        this.SnoutRight.addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutRight, 0.0F, -0.41887902047863906F, 0.0F);
        this.ThighRight = new ZawaModelRenderer(this, 8, 13);
        this.ThighRight.setPos(-1.0F, 1.5F, 2.3F);
        this.ThighRight.addBox(-2.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ThighRight, -0.2792526803190927F, -0.6981317007977318F, 0.22689280275926282F);
        this.HeadUnderPixie = new ZawaModelRenderer(this, 22, 20);
        this.HeadUnderPixie.setPos(0.0F, 0.7F, 0.5F);
        this.HeadUnderPixie.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(HeadUnderPixie, -0.3141592653589793F, 0.0F, 0.0F);
        this.EyeRight = new ZawaModelRenderer(this, 18, 20);
        this.EyeRight.setPos(-0.9F, 0.2F, -1.65F);
        this.EyeRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(EyeRight, 0.0F, -0.3490658503988659F, 0.0F);
        this.HipsPixie = new ZawaModelRenderer(this, 16, 1);
        this.HipsPixie.setPos(0.0F, 0.0F, 0.0F);
        this.HipsPixie.addBox(-2.0F, -1.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.Snout = new ZawaModelRenderer(this, 14, 24);
        this.Snout.setPos(0.0F, 0.0F, -2.0F);
        this.Snout.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, -0.17453292519943295F, 0.0F, 0.0F);
        this.HandRight = new ZawaModelRenderer(this, 0, 27);
        this.HandRight.setPos(0.0F, -1.5F, 0.7F);
        this.HandRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(HandRight, -0.593411945678072F, 0.0F, 0.0F);
        this.SnoutLeft = new ZawaModelRenderer(this, 8, 24);
        this.SnoutLeft.mirror = true;
        this.SnoutLeft.setPos(1.8F, 0.0F, 1.0F);
        this.SnoutLeft.addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutLeft, 0.0F, 0.41887902047863906F, 0.0F);
        this.LegLeft = new ZawaModelRenderer(this, 8, 15);
        this.LegLeft.mirror = true;
        this.LegLeft.setPos(2.0F, 0.1F, 0.5F);
        this.LegLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegLeft, 0.0F, 0.45378560551852565F, 0.0F);
        this.Head = new ZawaModelRenderer(this, 7, 21);
        this.Head.setPos(0.0F, -1.0F, -1.7F);
        this.Head.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.5585053606381855F, 0.0F, 0.0F);
        this.HeadUnder = new ZawaModelRenderer(this, 23, 24);
        this.HeadUnder.mirror = true;
        this.HeadUnder.setPos(0.0F, 0.5F, 0.5F);
        this.HeadUnder.addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(HeadUnder, -0.3141592653589793F, 0.0F, 0.0F);
        this.ArmRight = new ZawaModelRenderer(this, 0, 21);
        this.ArmRight.setPos(-1.5F, 0.3F, -1.5F);
        this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ArmRight, 1.3613568165555772F, -0.6283185307179586F, 0.0F);
        this.FootRight = new ZawaModelRenderer(this, 8, 17);
        this.FootRight.setPos(2.0F, 0.0F, -0.5F);
        this.FootRight.addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootRight, 0.0F, 0.08726646259971647F, -0.45378560551852565F);
        this.Forehead = new ZawaModelRenderer(this, 14, 27);
        this.Forehead.setPos(0.0F, -0.9F, 0.15F);
        this.Forehead.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Forehead, -0.05235987755982988F, 0.0F, 0.0F);
        this.LegRight = new ZawaModelRenderer(this, 8, 15);
        this.LegRight.setPos(-2.0F, 0.1F, 0.5F);
        this.LegRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegRight, 0.0F, -0.45378560551852565F, 0.0F);
        this.Hips = new ZawaModelRenderer(this, 14, 7);
        this.Hips.setPos(0.0F, -1.0F, 0.5F);
        this.Hips.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.13962634015954636F, 0.0F, 0.0F);
        this.FootLeft = new ZawaModelRenderer(this, 8, 17);
        this.FootLeft.mirror = true;
        this.FootLeft.setPos(-2.0F, 0.0F, -0.5F);
        this.FootLeft.addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootLeft, 0.0F, -0.08726646259971647F, 0.45378560551852565F);
        this.Body = new ZawaModelRenderer(this, 0, 7);
        this.Body.mirror = true;
        this.Body.setPos(0.0F, 21.5F, 0.0F);
        this.Body.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.22689280275926282F, 0.0F, 0.0F);
        this.Body.addChild(this.ArmLeft);
        this.Head.addChild(this.Mouth);
        this.ArmRight.addChild(this.ForearmRight);
        this.ArmLeft.addChild(this.ForearmLeft);
        this.Forehead.addChild(this.EyeLeft);
        this.Hips.addChild(this.ThighLeft);
        this.ForearmLeft.addChild(this.HandLeft);
        this.Body.addChild(this.BodyPixie);
        this.Snout.addChild(this.SnoutRight);
        this.Hips.addChild(this.ThighRight);
        this.Mouth.addChild(this.HeadUnderPixie);
        this.Forehead.addChild(this.EyeRight);
        this.Hips.addChild(this.HipsPixie);
        this.Head.addChild(this.Snout);
        this.ForearmRight.addChild(this.HandRight);
        this.Snout.addChild(this.SnoutLeft);
        this.ThighLeft.addChild(this.LegLeft);
        this.Body.addChild(this.Head);
        this.Mouth.addChild(this.HeadUnder);
        this.Body.addChild(this.ArmRight);
        this.LegRight.addChild(this.FootRight);
        this.Head.addChild(this.Forehead);
        this.ThighRight.addChild(this.LegRight);
        this.Body.addChild(this.Hips);
        this.LegLeft.addChild(this.FootLeft);
        this.saveBase();
    }

    @Override
    public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = headPitch / (180F / (float) Math.PI) + 0.56F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.xRot = MathHelper.cos(limbSwing * 0.1F) * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entity instanceof JumpingEntity) {
            float f = ageInTicks - (float) entity.tickCount;
            this.jumpRotation = MathHelper.sin(((JumpingEntity) entity).getJumpCompletion(f) * (float) Math.PI);
            this.ThighLeft.xRot = this.jumpRotation * 1.2f - 0.279F;
            this.ThighLeft.zRot = this.jumpRotation * 1.2f - 0.226f;
            this.ThighRight.xRot = this.jumpRotation * 1.2f - 0.279F;
            this.ThighRight.zRot = -this.jumpRotation * 1.2f + 0.226f;
            this.FootLeft.zRot = this.jumpRotation * 0.9f + 0.453f;
            this.FootRight.zRot = -this.jumpRotation * 0.9f - 0.453f;
            this.ArmLeft.xRot = -this.jumpRotation * 1.2f + 1.36F;
            this.ArmLeft.yRot = -this.jumpRotation * 0.7f + 0.628F;
            this.ArmRight.xRot = -this.jumpRotation * 1.2f + 1.36F;
            this.ArmRight.yRot = this.jumpRotation * 0.7f - 0.628F;
            this.ForearmLeft.xRot = this.jumpRotation * 0.7f + 1.134F;
            this.ForearmRight.xRot = this.jumpRotation * 0.7f + 1.134F;
        }
    }

    @Override
    public void prepareMobModel(E entity, float speed, float walkSpeed, float partialTick) {
        super.prepareMobModel(entity, speed, walkSpeed, partialTick);
        if (entity instanceof JumpingEntity)
            this.jumpRotation = MathHelper.sin(((JumpingEntity) entity).getJumpCompletion(partialTick) * (float) Math.PI);
    }
}
