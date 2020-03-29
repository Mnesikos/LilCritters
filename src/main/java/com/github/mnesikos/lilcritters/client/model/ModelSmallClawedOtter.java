package com.github.mnesikos.lilcritters.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Small Clawed Otter - Hjeshed & Mnesikos
 * Created using Tabula 7.1.0
 */
public class ModelSmallClawedOtter extends ZAWAModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer upperArmRight;
    public BookwormModelRenderer upperArmLeft;
    public BookwormModelRenderer bellyPoint;
    public BookwormModelRenderer face;
    public BookwormModelRenderer lowerChest;
    public BookwormModelRenderer earRight;
    public BookwormModelRenderer earLeft;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer nose;
    public BookwormModelRenderer chin;
    public BookwormModelRenderer lowerArmRight;
    public BookwormModelRenderer handRight;
    public BookwormModelRenderer lowerArmLeft;
    public BookwormModelRenderer handLeft;
    public BookwormModelRenderer back;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer upperLegLeft;
    public BookwormModelRenderer upperLegRight;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer lowerLegLeft;
    public BookwormModelRenderer footLeft;
    public BookwormModelRenderer lowerLegRight;
    public BookwormModelRenderer footRight;

    public ModelSmallClawedOtter() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.lowerLegLeft = new BookwormModelRenderer(this, 42, 16, "lowerLegLeft");
        this.lowerLegLeft.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.lowerLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerLegLeft, 0.9424777960769379F, 0.0F, 0.0F);
        this.bellyPoint = new BookwormModelRenderer(this, 0, 0, "bellyPoint");
        this.bellyPoint.setRotationPoint(0.0F, 2.5F, 4.0F);
        this.bellyPoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.upperLegLeft = new BookwormModelRenderer(this, 33, 18, "upperLegLeft");
        this.upperLegLeft.setRotationPoint(1.7F, 2.2F, 2.5F);
        this.upperLegLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperLegLeft, 0.06981317007977318F, 0.0F, 0.0F);
        this.lowerLegRight = new BookwormModelRenderer(this, 42, 16, "lowerLegRight");
        this.lowerLegRight.mirror = true;
        this.lowerLegRight.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.lowerLegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerLegRight, 0.9424777960769379F, 0.0F, 0.0F);
        this.handLeft = new BookwormModelRenderer(this, 38, 7, "handLeft");
        this.handLeft.setRotationPoint(-0.01F, 2.8F, -0.6F);
        this.handLeft.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handLeft, 0.5235987755982988F, 0.0F, 0.0F);
        this.upperArmLeft = new BookwormModelRenderer(this, 39, 0, "upperArmLeft");
        this.upperArmLeft.setRotationPoint(2.1F, -1.0F, -2.0F);
        this.upperArmLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperArmLeft, 0.03490658503988659F, 0.0F, 0.0F);
        this.nose = new BookwormModelRenderer(this, 34, 0, "nose");
        this.nose.setRotationPoint(0.0F, -0.5F, -1.2F);
        this.nose.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(nose, 0.22689280275926282F, 0.0F, 0.0F);
        this.footLeft = new BookwormModelRenderer(this, 41, 21, "footLeft");
        this.footLeft.setRotationPoint(-0.01F, 2.6F, 1.1F);
        this.footLeft.addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4, 0.0F);
        this.setRotateAngle(footLeft, -0.7330382858376184F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 0, 21, "tail1");
        this.tail1.setRotationPoint(0.0F, 1.7F, 4.3F);
        this.tail1.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(tail1, -0.41887902047863906F, 0.0F, 0.0F);
        this.face = new BookwormModelRenderer(this, 0, 13, "face");
        this.face.setRotationPoint(0.0F, 0.2F, -3.0F);
        this.face.addBox(-2.0F, -2.5F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(face, 0.20943951023931953F, 0.0F, 0.0F);
        this.snout = new BookwormModelRenderer(this, 43, 11, "snout");
        this.snout.setRotationPoint(0.0F, -1.2F, -2.7F);
        this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(snout, 0.017453292519943295F, 0.0F, 0.0F);
        this.lowerArmRight = new BookwormModelRenderer(this, 51, 3, "lowerArmRight");
        this.lowerArmRight.mirror = true;
        this.lowerArmRight.setRotationPoint(0.0F, 4.0F, 1.4F);
        this.lowerArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerArmRight, -0.6981317007977318F, 0.0F, 0.0F);
        this.lowerArmLeft = new BookwormModelRenderer(this, 51, 3, "lowerArmLeft");
        this.lowerArmLeft.setRotationPoint(0.0F, 4.0F, 1.4F);
        this.lowerArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerArmLeft, -0.6981317007977318F, 0.0F, 0.0F);
        this.upperLegRight = new BookwormModelRenderer(this, 33, 18, "upperLegRight");
        this.upperLegRight.mirror = true;
        this.upperLegRight.setRotationPoint(-1.7F, 2.2F, 2.5F);
        this.upperLegRight.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperLegRight, 0.06981317007977318F, 0.0F, 0.0F);
        this.back = new BookwormModelRenderer(this, 23, 8, "back");
        this.back.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.back.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(back, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 16, 23, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail2.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(tail2, 0.41887902047863906F, 0.0F, 0.0F);
        this.lowerChest = new BookwormModelRenderer(this, 12, 16, "lowerChest");
        this.lowerChest.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.lowerChest.addBox(-1.5F, -2.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(lowerChest, -0.3490658503988659F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 20, 0, "neck");
        this.neck.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.neck.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.2792526803190927F, 0.0F, 0.0F);
        this.handRight = new BookwormModelRenderer(this, 38, 7, "handRight");
        this.handRight.mirror = true;
        this.handRight.setRotationPoint(0.01F, 2.8F, -0.6F);
        this.handRight.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handRight, 0.5235987755982988F, 0.0F, 0.0F);
        this.upperArmRight = new BookwormModelRenderer(this, 39, 0, "upperArmRight");
        this.upperArmRight.mirror = true;
        this.upperArmRight.setRotationPoint(-2.1F, -1.0F, -2.0F);
        this.upperArmRight.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperArmRight, 0.03490658503988659F, 0.0F, 0.0F);
        this.chin = new BookwormModelRenderer(this, 48, 0, "chin");
        this.chin.setRotationPoint(0.0F, 1.8F, -1.2F);
        this.chin.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
        this.setRotateAngle(chin, -0.13962634015954636F, 0.0F, 0.0F);
        this.earRight = new BookwormModelRenderer(this, 0, 0, "earRight");
        this.earRight.mirror = true;
        this.earRight.setRotationPoint(-1.5F, -1.8F, -1.8F);
        this.earRight.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earRight, 0.0F, 0.3490658503988659F, 0.41887902047863906F);
        this.tail3 = new BookwormModelRenderer(this, 26, 23, "tail3");
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail3.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail3, 0.20943951023931953F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 20.1F, -1.0F);
        this.body.addBox(-3.0F, -2.5F, -4.0F, 6, 5, 8, 0.0F);
        this.setRotateAngle(body, 0.13962634015954636F, 0.0F, 0.0F);
        this.earLeft = new BookwormModelRenderer(this, 0, 0, "earLeft");
        this.earLeft.setRotationPoint(1.5F, -1.8F, -1.8F);
        this.earLeft.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.0F, -0.3490658503988659F, -0.41887902047863906F);
        this.footRight = new BookwormModelRenderer(this, 41, 21, "footRight");
        this.footRight.mirror = true;
        this.footRight.setRotationPoint(0.01F, 2.6F, 1.1F);
        this.footRight.addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4, 0.0F);
        this.setRotateAngle(footRight, -0.7330382858376184F, 0.0F, 0.0F);
        this.upperLegLeft.addChild(this.lowerLegLeft);
        this.body.addChild(this.bellyPoint);
        this.back.addChild(this.upperLegLeft);
        this.upperLegRight.addChild(this.lowerLegRight);
        this.lowerArmLeft.addChild(this.handLeft);
        this.body.addChild(this.upperArmLeft);
        this.snout.addChild(this.nose);
        this.lowerLegLeft.addChild(this.footLeft);
        this.back.addChild(this.tail1);
        this.neck.addChild(this.face);
        this.face.addChild(this.snout);
        this.upperArmRight.addChild(this.lowerArmRight);
        this.upperArmLeft.addChild(this.lowerArmLeft);
        this.back.addChild(this.upperLegRight);
        this.bellyPoint.addChild(this.back);
        this.tail1.addChild(this.tail2);
        this.neck.addChild(this.lowerChest);
        this.body.addChild(this.neck);
        this.lowerArmRight.addChild(this.handRight);
        this.body.addChild(this.upperArmRight);
        this.snout.addChild(this.chin);
        this.face.addChild(this.earRight);
        this.tail2.addChild(this.tail3);
        this.face.addChild(this.earLeft);
        this.lowerLegRight.addChild(this.footRight);

        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(f, f1, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.6D, 0.6D, 0.6D);
            GlStateManager.translate(0.0F, 17.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();
        } else
            this.body.render(scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        this.face.rotateAngleX = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.face.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.28F;
        this.earLeft.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F + -0.4F;
        this.earRight.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * -0.4F) * f1 * 0.5F + 0.4F;
        this.tail1.rotateAngleX = MathHelper.cos((f * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.42F;
        this.tail2.rotateAngleX = MathHelper.cos((f * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + 0.42F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (!entity.isRiding()) {
            if (entity.isInWater()) {
                f = (float)entity.ticksExisted;
                f1 = 0.3F;
                speed = 2.0F;
                degree = 0.9F;
                this.body.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + 0.04F;
                this.back.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * f1 * 0.5F + -0.2F;
                this.neck.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.face.rotateAngleX = MathHelper.cos(2.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.1F;
                this.tail1.rotateAngleX = MathHelper.cos(-1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.tail2.rotateAngleX = MathHelper.cos(-2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.tail3.rotateAngleX = MathHelper.cos(-3.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.body.offsetY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 1.4F) * f1 * 0.5F + -0.1F;
                this.upperArmLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 1.0F;
                this.lowerArmLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.4F;
                this.handLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 2.4F;
                this.upperArmLeft.offsetZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.1F;
                this.upperArmRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 1.0F;
                this.lowerArmRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.4F;
                this.handRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 2.4F;
                this.upperArmRight.offsetZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.1F;
                this.upperLegLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 1.0F;
                this.lowerLegLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 0.6F;
                this.footLeft.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 1.2F;
                this.upperLegLeft.offsetZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.1F;
                this.upperLegRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 1.0F;
                this.lowerLegRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + 0.6F;
                this.footRight.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 1.2F;
                this.upperLegRight.offsetZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F + -0.1F;

            } else {
                speed = this.isChild ? 2.0F : 4.0F;
                degree = this.isChild ? 0.4F : 0.5F;
                this.upperArmLeft.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.3F;
                this.lowerArmLeft.rotateAngleX = MathHelper.cos(0.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.6F;
                this.handLeft.rotateAngleX = MathHelper.cos(3.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + 0.4F;
                this.upperArmRight.rotateAngleX = MathHelper.cos(-0.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.3F;
                this.lowerArmRight.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.6F;
                this.handRight.rotateAngleX = MathHelper.cos(2.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + 0.4F;
                this.upperLegLeft.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.3F;
                this.lowerLegLeft.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * f1 * 0.5F + 0.96F;
                this.footLeft.rotateAngleX = MathHelper.cos(-1.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.82F;
                this.upperLegRight.rotateAngleX = MathHelper.cos(-0.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.3F;
                this.lowerLegRight.rotateAngleX = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * f1 * 0.5F + 0.96F;
                this.footRight.rotateAngleX = MathHelper.cos(-2.2F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.82F;
                this.body.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 1.6F) * f1 * 0.5F + 0.14F;
                this.back.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.4F) * f1 * 0.5F + -0.4F;
                this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + -0.3F;
                this.face.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + 0.2F;
                this.tail1.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -1.4F) * f1 * 0.5F + -0.2F;
                this.tail2.rotateAngleX = MathHelper.cos(-0.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -1.8F) * f1 * 0.5F + 0.1F;
                this.tail3.rotateAngleX = MathHelper.cos(-1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.2F;

            }
        }
    }

    @Override
    protected void performSleepAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performSleepAnimation(f, f1, f2, f3, f4, f5, entity);
    }
}
