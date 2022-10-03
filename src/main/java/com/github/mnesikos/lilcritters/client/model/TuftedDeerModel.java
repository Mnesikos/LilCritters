package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class TuftedDeerModel extends ZawaBaseModel<TuftedDeerEntity> {
    public ZawaModelRenderer body;
    public ZawaModelRenderer neck;
    public ZawaModelRenderer rightShoulder;
    public ZawaModelRenderer leftShoulder;
    public ZawaModelRenderer rightHip;
    public ZawaModelRenderer leftHip;
    public ZawaModelRenderer butt;
    public ZawaModelRenderer head;
    public ZawaModelRenderer neckLower;
    public ZawaModelRenderer snout;
    public ZawaModelRenderer earRight;
    public ZawaModelRenderer earLeft;
    public ZawaModelRenderer headTop;
    public ZawaModelRenderer hornRight;
    public ZawaModelRenderer hornLeft;
    public ZawaModelRenderer jaw;
    public ZawaModelRenderer saberRight;
    public ZawaModelRenderer saberLeft;
    public ZawaModelRenderer nose;
    public ZawaModelRenderer rightArm;
    public ZawaModelRenderer rightFrontHoof;
    public ZawaModelRenderer leftArm;
    public ZawaModelRenderer leftFrontHoof;
    public ZawaModelRenderer rightThigh;
    public ZawaModelRenderer rightLeg;
    public ZawaModelRenderer rightFoot;
    public ZawaModelRenderer leftThigh;
    public ZawaModelRenderer leftLeg;
    public ZawaModelRenderer leftFoot;
    public ZawaModelRenderer tail;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public TuftedDeerModel() {
        this.texWidth = 96;
        this.texHeight = 64;
        this.leftArm = new ZawaModelRenderer(this, 20, 43);
        this.leftArm.setPos(0.0F, 10.0F, 2.0F);
        this.leftArm.addBox(-1.5F, 0.0F, -4.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(leftArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.snout = new ZawaModelRenderer(this, 18, 33);
        this.snout.setPos(0.0F, -0.4F, -7.5F);
        this.snout.addBox(-2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(snout, 0.06981317007977318F, 0.0F, 0.0F);
        this.rightArm = new ZawaModelRenderer(this, 20, 43);
        this.rightArm.mirror = true;
        this.rightArm.setPos(0.0F, 10.0F, 2.0F);
        this.rightArm.addBox(-1.5F, 0.0F, -4.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(rightArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.leftHip = new ZawaModelRenderer(this, 74, 43);
        this.leftHip.setPos(2.5F, -0.5F, 11.5F);
        this.leftHip.addBox(-2.0F, 0.0F, -3.5F, 4, 9, 7, 0.0F);
        this.setRotateAngle(leftHip, -0.20943951023931953F, 0.0F, 0.0F);
        this.earLeft = new ZawaModelRenderer(this, 24, 0);
        this.earLeft.setPos(3.3F, -0.7F, -1.5F);
        this.earLeft.addBox(-0.5F, -5.0F, -3.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(earLeft, -1.117010721276371F, 0.20943951023931953F, 0.0F);
        this.jaw = new ZawaModelRenderer(this, 38, 33);
        this.jaw.setPos(0.0F, 2.0F, 0.4F);
        this.jaw.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(jaw, -0.10471975511965977F, 0.0F, 0.0F);
        this.body = new ZawaModelRenderer(this, 12, 1);
        this.body.setPos(0.0F, 10.6F, -1.0F);
        this.body.addBox(-4.0F, -6.0F, -10.0F, 8, 12, 20, 0.0F);
        this.leftFrontHoof = new ZawaModelRenderer(this, 35, 55);
        this.leftFrontHoof.setPos(-0.02F, 8.8F, -2.8F);
        this.leftFrontHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(leftFrontHoof, 0.06981317007977318F, 0.0F, 0.0F);
        this.saberLeft = new ZawaModelRenderer(this, 0, 4);
        this.saberLeft.setPos(1.9F, 1.8F, -2.6F);
        this.saberLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.nose = new ZawaModelRenderer(this, 0, 33);
        this.nose.setPos(0.0F, -2.7F, -0.3F);
        this.nose.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftShoulder = new ZawaModelRenderer(this, 0, 43);
        this.leftShoulder.setPos(2.5F, -2.0F, -6.8F);
        this.leftShoulder.addBox(-2.0F, 0.0F, -3.0F, 4, 10, 6, 0.0F);
        this.setRotateAngle(leftShoulder, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftFoot = new ZawaModelRenderer(this, 35, 55);
        this.leftFoot.setPos(-0.02F, 6.0F, -2.8F);
        this.leftFoot.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.10471975511965977F, 0.0F, 0.0F);
        this.rightLeg = new ZawaModelRenderer(this, 42, 43);
        this.rightLeg.mirror = true;
        this.rightLeg.setPos(0.0F, 8.0F, 5.0F);
        this.rightLeg.addBox(-1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(rightLeg, -0.8028514559173915F, 0.0F, 0.0F);
        this.tail = new ZawaModelRenderer(this, 57, 33);
        this.tail.setPos(0.0F, 1.0F, 6.0F);
        this.tail.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(tail, -1.117010721276371F, 0.0F, 0.0F);
        this.leftThigh = new ZawaModelRenderer(this, 56, 43);
        this.leftThigh.setPos(-0.02F, 9.0F, -3.5F);
        this.leftThigh.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(leftThigh, 0.9075712110370513F, 0.0F, 0.0F);
        this.earRight = new ZawaModelRenderer(this, 24, 0);
        this.earRight.mirror = true;
        this.earRight.setPos(-3.5F, -0.7F, -1.5F);
        this.earRight.addBox(-0.5F, -5.0F, -3.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(earRight, -1.117010721276371F, -0.20943951023931953F, 0.0F);
        this.rightThigh = new ZawaModelRenderer(this, 56, 43);
        this.rightThigh.mirror = true;
        this.rightThigh.setPos(0.02F, 9.0F, -3.5F);
        this.rightThigh.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(rightThigh, 0.9075712110370513F, 0.0F, 0.0F);
        this.rightFoot = new ZawaModelRenderer(this, 35, 55);
        this.rightFoot.mirror = true;
        this.rightFoot.setPos(0.02F, 6.0F, -2.8F);
        this.rightFoot.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.10471975511965977F, 0.0F, 0.0F);
        this.leftLeg = new ZawaModelRenderer(this, 42, 43);
        this.leftLeg.setPos(0.0F, 8.0F, 5.0F);
        this.leftLeg.addBox(-1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(leftLeg, -0.8028514559173915F, 0.0F, 0.0F);
        this.neck = new ZawaModelRenderer(this, 48, 0);
        this.neck.setPos(0.0F, -1.5F, -7.5F);
        this.neck.addBox(-3.0F, -8.0F, -4.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(neck, 1.0122909661567112F, 0.0F, 0.0F);
        this.saberRight = new ZawaModelRenderer(this, 0, 4);
        this.saberRight.mirror = true;
        this.saberRight.setPos(-1.9F, 1.8F, -2.6F);
        this.saberRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.hornRight = new ZawaModelRenderer(this, 0, 0);
        this.hornRight.mirror = true;
        this.hornRight.setPos(-2.8F, -2.7F, -3.9F);
        this.hornRight.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hornRight, -0.5585053606381855F, -0.2792526803190927F, 0.0F);
        this.neckLower = new ZawaModelRenderer(this, 76, 1);
        this.neckLower.setPos(0.0F, 2.5F, -6.5F);
        this.neckLower.addBox(-2.5F, -12.0F, 0.0F, 5, 12, 3, 0.0F);
        this.setRotateAngle(neckLower, -0.20943951023931953F, 0.0F, 0.0F);
        this.rightFrontHoof = new ZawaModelRenderer(this, 35, 55);
        this.rightFrontHoof.mirror = true;
        this.rightFrontHoof.setPos(0.02F, 8.8F, -2.8F);
        this.rightFrontHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(rightFrontHoof, 0.06981317007977318F, 0.0F, 0.0F);
        this.rightShoulder = new ZawaModelRenderer(this, 0, 43);
        this.rightShoulder.mirror = true;
        this.rightShoulder.setPos(-2.5F, -2.0F, -6.8F);
        this.rightShoulder.addBox(-2.0F, 0.0F, -3.0F, 4, 10, 6, 0.0F);
        this.setRotateAngle(rightShoulder, 0.13962634015954636F, 0.0F, 0.0F);
        this.butt = new ZawaModelRenderer(this, 68, 16);
        this.butt.setPos(0.0F, -6.0F, 10.0F);
        this.butt.addBox(-3.5F, 0.0F, 0.0F, 7, 12, 7, 0.0F);
        this.setRotateAngle(butt, -0.20943951023931953F, 0.0F, 0.0F);
        this.rightHip = new ZawaModelRenderer(this, 74, 43);
        this.rightHip.mirror = true;
        this.rightHip.setPos(-2.5F, -0.5F, 11.5F);
        this.rightHip.addBox(-2.0F, 0.0F, -3.5F, 4, 9, 7, 0.0F);
        this.setRotateAngle(rightHip, -0.20943951023931953F, 0.0F, 0.0F);
        this.hornLeft = new ZawaModelRenderer(this, 0, 0);
        this.hornLeft.setPos(2.8F, -2.7F, -3.9F);
        this.hornLeft.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hornLeft, -0.5585053606381855F, 0.2792526803190927F, 0.0F);
        this.head = new ZawaModelRenderer(this, 0, 0);
        this.head.setPos(0.0F, -6.0F, 1.5F);
        this.head.addBox(-4.0F, -3.5F, -8.0F, 8, 7, 8, 0.0F);
        this.setRotateAngle(head, -0.9075712110370513F, 0.0F, 0.0F);
        this.headTop = new ZawaModelRenderer(this, 0, 15);
        this.headTop.setPos(0.0F, -3.5F, -7.0F);
        this.headTop.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 4, 0.0F);
        this.setRotateAngle(headTop, 0.41887902047863906F, 0.0F, 0.0F);
        this.leftShoulder.addChild(this.leftArm);
        this.head.addChild(this.snout);
        this.rightShoulder.addChild(this.rightArm);
        this.body.addChild(this.leftHip);
        this.head.addChild(this.earLeft);
        this.snout.addChild(this.jaw);
        this.leftArm.addChild(this.leftFrontHoof);
        this.snout.addChild(this.saberLeft);
        this.snout.addChild(this.nose);
        this.body.addChild(this.leftShoulder);
        this.leftLeg.addChild(this.leftFoot);
        this.rightThigh.addChild(this.rightLeg);
        this.butt.addChild(this.tail);
        this.leftHip.addChild(this.leftThigh);
        this.head.addChild(this.earRight);
        this.rightHip.addChild(this.rightThigh);
        this.rightLeg.addChild(this.rightFoot);
        this.leftThigh.addChild(this.leftLeg);
        this.body.addChild(this.neck);
        this.snout.addChild(this.saberRight);
        this.head.addChild(this.hornRight);
        this.neck.addChild(this.neckLower);
        this.rightArm.addChild(this.rightFrontHoof);
        this.body.addChild(this.rightShoulder);
        this.body.addChild(this.butt);
        this.body.addChild(this.rightHip);
        this.head.addChild(this.hornLeft);
        this.neck.addChild(this.head);
        this.head.addChild(this.headTop);

        this.saveBase();
    }

    @Override
    public void setupAnim(TuftedDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (-48 / (180 / Math.PI));
        this.neck.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.06F) * limbSwingAmount * 0.5F + 1.05F;
        this.head.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.9F;

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed, degree;
        
        if (isSwimming) {
            limbSwing = (float)entity.tickCount;
            limbSwingAmount = 0.3F;
        }

        if (entity.isSprinting()) {
            speed = 1.0F;
            degree = 0.5F;
            this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + 1.05F;
            this.head.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.9F;
            this.tail.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F + 1.0F;
            this.leftShoulder.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.15F;
            this.leftArm.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.25F;
            this.rightShoulder.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.15F;
            this.rightArm.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.25F;
            this.leftHip.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.2F;
            this.leftThigh.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.9F;
            this.leftLeg.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.7F;
            this.rightHip.xRot = MathHelper.cos(5.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.2F;
            this.rightThigh.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.9F;
            this.rightLeg.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.7F;
            this.body.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F;

        } else {
            speed = 2.0F;
            degree = 1.0F;
            this.leftShoulder.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.leftArm.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F + -0.15F;
            this.leftFrontHoof.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F;
            this.rightShoulder.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.rightArm.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + -0.15F;
            this.rightFrontHoof.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F;
            this.leftHip.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + -0.15F;
            this.leftThigh.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -0.9F) * limbSwingAmount * 0.5F + 0.9F;
            this.leftLeg.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -0.5F) * limbSwingAmount * 0.5F + -0.8F;
            this.rightHip.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F + -0.15F;
            this.rightThigh.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 0.9F) * limbSwingAmount * 0.5F + 0.9F;
            this.rightLeg.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 0.5F) * limbSwingAmount * 0.5F + -0.8F;
            this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.06F) * limbSwingAmount * 0.5F + 1.05F;
            this.head.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.9F;
        }
    }
}
