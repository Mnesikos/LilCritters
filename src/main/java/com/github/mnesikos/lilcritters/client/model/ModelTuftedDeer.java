package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntityTuftedDeer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Tufted Deer - Ailments concentrate & Mnesikos
 * Created using Tabula 7.1.0
 */
public class ModelTuftedDeer extends ZAWAModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer rightShoulder;
    public BookwormModelRenderer leftShoulder;
    public BookwormModelRenderer rightHip;
    public BookwormModelRenderer leftHip;
    public BookwormModelRenderer butt;
    public BookwormModelRenderer head;
    public BookwormModelRenderer neckLower;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer earRight;
    public BookwormModelRenderer earLeft;
    public BookwormModelRenderer headTop;
    public BookwormModelRenderer hornRight;
    public BookwormModelRenderer hornLeft;
    public BookwormModelRenderer jaw;
    public BookwormModelRenderer saberRight;
    public BookwormModelRenderer saberLeft;
    public BookwormModelRenderer nose;
    public BookwormModelRenderer rightArm;
    public BookwormModelRenderer rightFrontHoof;
    public BookwormModelRenderer leftArm;
    public BookwormModelRenderer leftFrontHoof;
    public BookwormModelRenderer rightThigh;
    public BookwormModelRenderer rightLeg;
    public BookwormModelRenderer rightFoot;
    public BookwormModelRenderer leftThigh;
    public BookwormModelRenderer leftLeg;
    public BookwormModelRenderer leftFoot;
    public BookwormModelRenderer tail;

    public ModelTuftedDeer() {
        this.textureWidth = 96;
        this.textureHeight = 64;
        this.leftArm = new BookwormModelRenderer(this, 20, 43, "leftArm");
        this.leftArm.setRotationPoint(0.0F, 10.0F, 2.0F);
        this.leftArm.addBox(-1.5F, 0.0F, -4.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(leftArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.snout = new BookwormModelRenderer(this, 18, 33, "snout");
        this.snout.setRotationPoint(0.0F, -0.4F, -7.5F);
        this.snout.addBox(-2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(snout, 0.06981317007977318F, 0.0F, 0.0F);
        this.rightArm = new BookwormModelRenderer(this, 20, 43, "rightArm");
        this.rightArm.mirror = true;
        this.rightArm.setRotationPoint(0.0F, 10.0F, 2.0F);
        this.rightArm.addBox(-1.5F, 0.0F, -4.0F, 3, 10, 4, 0.0F);
        this.setRotateAngle(rightArm, -0.20943951023931953F, 0.0F, 0.0F);
        this.leftHip = new BookwormModelRenderer(this, 74, 43, "leftHip");
        this.leftHip.setRotationPoint(2.5F, -0.5F, 11.5F);
        this.leftHip.addBox(-2.0F, 0.0F, -3.5F, 4, 9, 7, 0.0F);
        this.setRotateAngle(leftHip, -0.20943951023931953F, 0.0F, 0.0F);
        this.earLeft = new BookwormModelRenderer(this, 24, 0, "earLeft");
        this.earLeft.setRotationPoint(3.3F, -0.7F, -1.5F);
        this.earLeft.addBox(-0.5F, -5.0F, -3.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(earLeft, -1.117010721276371F, 0.20943951023931953F, 0.0F);
        this.jaw = new BookwormModelRenderer(this, 38, 33, "jaw");
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.4F);
        this.jaw.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(jaw, -0.10471975511965977F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 12, 1, "body");
        this.body.setRotationPoint(0.0F, 10.6F, -1.0F);
        this.body.addBox(-4.0F, -6.0F, -10.0F, 8, 12, 20, 0.0F);
        this.leftFrontHoof = new BookwormModelRenderer(this, 35, 55, "leftFrontHoof");
        this.leftFrontHoof.setRotationPoint(-0.02F, 8.8F, -2.8F);
        this.leftFrontHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(leftFrontHoof, 0.06981317007977318F, 0.0F, 0.0F);
        this.saberLeft = new BookwormModelRenderer(this, 0, 4, "saberLeft");
        this.saberLeft.setRotationPoint(1.9F, 1.8F, -2.6F);
        this.saberLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.nose = new BookwormModelRenderer(this, 0, 33, "nose");
        this.nose.setRotationPoint(0.0F, -2.7F, -0.3F);
        this.nose.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftShoulder = new BookwormModelRenderer(this, 0, 43, "leftShoulder");
        this.leftShoulder.setRotationPoint(2.5F, -2.0F, -6.8F);
        this.leftShoulder.addBox(-2.0F, 0.0F, -3.0F, 4, 10, 6, 0.0F);
        this.setRotateAngle(leftShoulder, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftFoot = new BookwormModelRenderer(this, 35, 55, "leftFoot");
        this.leftFoot.setRotationPoint(-0.02F, 6.0F, -2.8F);
        this.leftFoot.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.10471975511965977F, 0.0F, 0.0F);
        this.rightLeg = new BookwormModelRenderer(this, 42, 43, "rightLeg");
        this.rightLeg.mirror = true;
        this.rightLeg.setRotationPoint(0.0F, 8.0F, 5.0F);
        this.rightLeg.addBox(-1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(rightLeg, -0.8028514559173915F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 57, 33, "tail");
        this.tail.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.tail.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(tail, -1.117010721276371F, 0.0F, 0.0F);
        this.leftThigh = new BookwormModelRenderer(this, 56, 43, "leftThigh");
        this.leftThigh.setRotationPoint(-0.02F, 9.0F, -3.5F);
        this.leftThigh.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(leftThigh, 0.9075712110370513F, 0.0F, 0.0F);
        this.earRight = new BookwormModelRenderer(this, 24, 0, "earRight");
        this.earRight.mirror = true;
        this.earRight.setRotationPoint(-3.5F, -0.7F, -1.5F);
        this.earRight.addBox(-0.5F, -5.0F, -3.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(earRight, -1.117010721276371F, -0.20943951023931953F, 0.0F);
        this.rightThigh = new BookwormModelRenderer(this, 56, 43, "rightThigh");
        this.rightThigh.mirror = true;
        this.rightThigh.setRotationPoint(0.02F, 9.0F, -3.5F);
        this.rightThigh.addBox(-2.0F, 0.0F, 0.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(rightThigh, 0.9075712110370513F, 0.0F, 0.0F);
        this.rightFoot = new BookwormModelRenderer(this, 35, 55, "rightFoot");
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(0.02F, 6.0F, -2.8F);
        this.rightFoot.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.10471975511965977F, 0.0F, 0.0F);
        this.leftLeg = new BookwormModelRenderer(this, 42, 43, "leftLeg");
        this.leftLeg.setRotationPoint(0.0F, 8.0F, 5.0F);
        this.leftLeg.addBox(-1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F);
        this.setRotateAngle(leftLeg, -0.8028514559173915F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 48, 0, "neck");
        this.neck.setRotationPoint(0.0F, -1.5F, -7.5F);
        this.neck.addBox(-3.0F, -8.0F, -4.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(neck, 1.0122909661567112F, 0.0F, 0.0F);
        this.saberRight = new BookwormModelRenderer(this, 0, 4, "saberRight");
        this.saberRight.mirror = true;
        this.saberRight.setRotationPoint(-1.9F, 1.8F, -2.6F);
        this.saberRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.hornRight = new BookwormModelRenderer(this, 0, 0, "hornRight");
        this.hornRight.mirror = true;
        this.hornRight.setRotationPoint(-2.8F, -2.7F, -3.9F);
        this.hornRight.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hornRight, -0.5585053606381855F, -0.2792526803190927F, 0.0F);
        this.neckLower = new BookwormModelRenderer(this, 76, 1, "neckLower");
        this.neckLower.setRotationPoint(0.0F, 2.5F, -6.5F);
        this.neckLower.addBox(-2.5F, -12.0F, 0.0F, 5, 12, 3, 0.0F);
        this.setRotateAngle(neckLower, -0.20943951023931953F, 0.0F, 0.0F);
        this.rightFrontHoof = new BookwormModelRenderer(this, 35, 55, "rightFrontHoof");
        this.rightFrontHoof.mirror = true;
        this.rightFrontHoof.setRotationPoint(0.02F, 8.8F, -2.8F);
        this.rightFrontHoof.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(rightFrontHoof, 0.06981317007977318F, 0.0F, 0.0F);
        this.rightShoulder = new BookwormModelRenderer(this, 0, 43, "rightShoulder");
        this.rightShoulder.mirror = true;
        this.rightShoulder.setRotationPoint(-2.5F, -2.0F, -6.8F);
        this.rightShoulder.addBox(-2.0F, 0.0F, -3.0F, 4, 10, 6, 0.0F);
        this.setRotateAngle(rightShoulder, 0.13962634015954636F, 0.0F, 0.0F);
        this.butt = new BookwormModelRenderer(this, 68, 16, "butt");
        this.butt.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.butt.addBox(-3.5F, 0.0F, 0.0F, 7, 12, 7, 0.0F);
        this.setRotateAngle(butt, -0.20943951023931953F, 0.0F, 0.0F);
        this.rightHip = new BookwormModelRenderer(this, 74, 43, "rightHip");
        this.rightHip.mirror = true;
        this.rightHip.setRotationPoint(-2.5F, -0.5F, 11.5F);
        this.rightHip.addBox(-2.0F, 0.0F, -3.5F, 4, 9, 7, 0.0F);
        this.setRotateAngle(rightHip, -0.20943951023931953F, 0.0F, 0.0F);
        this.hornLeft = new BookwormModelRenderer(this, 0, 0, "hornLeft");
        this.hornLeft.setRotationPoint(2.8F, -2.7F, -3.9F);
        this.hornLeft.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hornLeft, -0.5585053606381855F, 0.2792526803190927F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 0, "head");
        this.head.setRotationPoint(0.0F, -6.0F, 1.5F);
        this.head.addBox(-4.0F, -3.5F, -8.0F, 8, 7, 8, 0.0F);
        this.setRotateAngle(head, -0.9075712110370513F, 0.0F, 0.0F);
        this.headTop = new BookwormModelRenderer(this, 0, 15, "headTop");
        this.headTop.setRotationPoint(0.0F, -3.5F, -7.0F);
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

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.6F, 0.6F, 0.6F);
            GlStateManager.translate(0.0F, 20.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.body.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

        if (entity instanceof EntityTuftedDeer && !((EntityTuftedDeer) entity).isAsleep()) {
            this.head.rotateAngleX = (headPitch / (180F / (float) Math.PI)) + (float) (-48 / (180 / Math.PI));
            this.neck.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        }
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * -0.06F) * f1 * 0.5F + 1.05F;
        this.head.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.9F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (entity.isInWater()) {
            f = (float)entity.ticksExisted;
            f1 = 0.3F;
        }

        if (entity.isSprinting()) {
            speed = 1.0F;
            degree = 0.5F;
            this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + 1.05F;
            this.head.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.9F;
            this.tail.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 0.3F) * f1 * 0.5F + 1.0F;
            this.leftShoulder.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.15F;
            this.leftArm.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.25F;
            this.rightShoulder.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.15F;
            this.rightArm.rotateAngleX = MathHelper.cos(3.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.25F;
            this.leftHip.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + -0.2F;
            this.leftThigh.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.9F;
            this.leftLeg.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.7F;
            this.rightHip.rotateAngleX = MathHelper.cos(5.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + -0.2F;
            this.rightThigh.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.9F;
            this.rightLeg.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.7F;
            this.body.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F;

        } else {
            speed = 2.0F;
            degree = 1.0F;
            this.leftShoulder.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + 0.1F;
            this.leftArm.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + -0.15F;
            this.leftFrontHoof.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F;
            this.rightShoulder.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + 0.1F;
            this.rightArm.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + -0.15F;
            this.rightFrontHoof.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F;
            this.leftHip.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + -0.15F;
            this.leftThigh.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -0.9F) * f1 * 0.5F + 0.9F;
            this.leftLeg.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -0.5F) * f1 * 0.5F + -0.8F;
            this.rightHip.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + -0.15F;
            this.rightThigh.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 0.9F) * f1 * 0.5F + 0.9F;
            this.rightLeg.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 0.5F) * f1 * 0.5F + -0.8F;
            this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * -0.06F) * f1 * 0.5F + 1.05F;
            this.head.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.6F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.9F;
        }
    }
}
