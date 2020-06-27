package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntitySkunk;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Skunk - Mnesikos
 * Created using Tabula 7.1.0
 */
public class ModelSkunk extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer LeftBicep;
    public BookwormModelRenderer RightBicep;
    public BookwormModelRenderer Butt;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer LowerChest;
    public BookwormModelRenderer LeftEar;
    public BookwormModelRenderer RightEar;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer Nose;
    public BookwormModelRenderer Chin;
    public BookwormModelRenderer LeftForearm;
    public BookwormModelRenderer LeftHand;
    public BookwormModelRenderer RightForearm;
    public BookwormModelRenderer RightHand;
    public BookwormModelRenderer LeftThigh;
    public BookwormModelRenderer RightThigh;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer LeftLeg;
    public BookwormModelRenderer LeftFoot;
    public BookwormModelRenderer RightLeg;
    public BookwormModelRenderer RightFoot;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer tail4;
    public BookwormModelRenderer tail5;
    public BookwormModelRenderer tail6;

    public ModelSkunk() {
        this.textureWidth = 96;
        this.textureHeight = 64;
        this.LeftBicep = new BookwormModelRenderer(this, 9, 42, "LeftBicep");
        this.LeftBicep.setRotationPoint(3.0F, -0.5F, -3.3F);
        this.LeftBicep.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftBicep, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightBicep = new BookwormModelRenderer(this, 9, 42, "RightBicep");
        this.RightBicep.mirror = true;
        this.RightBicep.setRotationPoint(-3.0F, -0.5F, -3.3F);
        this.RightBicep.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RightBicep, 0.10471975511965977F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 22, 0, "Body");
        this.Body.setRotationPoint(0.0F, 14.2F, -3.2F);
        this.Body.addBox(-4.0F, -4.5F, -4.5F, 8, 9, 9, 0.0F);
        this.setRotateAngle(Body, 0.13962634015954636F, 0.0F, 0.0F);
        this.LeftForearm = new BookwormModelRenderer(this, 21, 38, "LeftForearm");
        this.LeftForearm.setRotationPoint(-0.02F, 5.3F, 1.8F);
        this.LeftForearm.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftForearm, -0.3490658503988659F, 0.0F, 0.0F);
        this.tail5 = new BookwormModelRenderer(this, 67, 6, "tail5");
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail5.addBox(-3.5F, -2.0F, 0.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(tail5, -0.4886921905584123F, 0.0F, 0.0F);
        this.LowerChest = new BookwormModelRenderer(this, 0, 21, "LowerChest");
        this.LowerChest.setRotationPoint(0.0F, 5.3F, -0.5F);
        this.LowerChest.addBox(-2.5F, -3.0F, -4.6F, 5, 3, 5, 0.0F);
        this.setRotateAngle(LowerChest, -0.5410520681182421F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 64, 38, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.2F, 4.0F);
        this.tail2.addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(tail2, 0.24434609527920614F, 0.0F, 0.0F);
        this.Chin = new BookwormModelRenderer(this, 10, 31, "Chin");
        this.Chin.setRotationPoint(0.0F, 2.7F, 0.2F);
        this.Chin.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Chin, -0.10471975511965977F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 11, "Neck");
        this.Neck.setRotationPoint(0.0F, -2.3F, -2.5F);
        this.Neck.addBox(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(Neck, -0.13962634015954636F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 66, 49, "tail1");
        this.tail1.setRotationPoint(0.0F, 2.6F, 8.4F);
        this.tail1.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 5, 0.0F);
        this.setRotateAngle(tail1, 1.4660765716752369F, 0.0F, 0.0F);
        this.tail4 = new BookwormModelRenderer(this, 64, 14, "tail4");
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.3F);
        this.tail4.addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(tail4, -0.6981317007977318F, 0.0F, 0.0F);
        this.LeftHand = new BookwormModelRenderer(this, 29, 42, "LeftHand");
        this.LeftHand.setRotationPoint(-0.02F, 4.8F, -1.6F);
        this.LeftHand.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4, 0.0F);
        this.setRotateAngle(LeftHand, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightThigh = new BookwormModelRenderer(this, 7, 52, "RightThigh");
        this.RightThigh.mirror = true;
        this.RightThigh.setRotationPoint(-3.5F, 4.4F, 8.0F);
        this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
        this.setRotateAngle(RightThigh, -0.13962634015954636F, 0.0F, 0.0F);
        this.LeftEar = new BookwormModelRenderer(this, 16, 0, "LeftEar");
        this.LeftEar.setRotationPoint(0.9F, -0.9F, -2.5F);
        this.LeftEar.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, -0.20943951023931953F, -0.3490658503988659F, 0.3490658503988659F);
        this.LeftFoot = new BookwormModelRenderer(this, 32, 47, "LeftFoot");
        this.LeftFoot.setRotationPoint(-0.02F, 6.0F, 1.8F);
        this.LeftFoot.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(LeftFoot, -0.593411945678072F, 0.0F, 0.0F);
        this.RightFoot = new BookwormModelRenderer(this, 32, 47, "RightFoot");
        this.RightFoot.mirror = true;
        this.RightFoot.setRotationPoint(0.02F, 6.0F, 1.8F);
        this.RightFoot.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(RightFoot, -0.593411945678072F, 0.0F, 0.0F);
        this.Butt = new BookwormModelRenderer(this, 22, 18, "Butt");
        this.Butt.setRotationPoint(0.0F, -4.5F, 4.0F);
        this.Butt.addBox(-4.5F, 0.0F, 0.0F, 9, 9, 11, 0.0F);
        this.setRotateAngle(Butt, -0.20943951023931953F, 0.0F, 0.0F);
        this.tail6 = new BookwormModelRenderer(this, 70, 0, "tail6");
        this.tail6.setRotationPoint(0.0F, 0.1F, 2.5F);
        this.tail6.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(tail6, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail3 = new BookwormModelRenderer(this, 62, 25, "tail3");
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail3.addBox(-4.5F, -3.0F, 0.0F, 9, 6, 7, 0.0F);
        this.setRotateAngle(tail3, -0.5585053606381855F, 0.0F, 0.0F);
        this.RightForearm = new BookwormModelRenderer(this, 21, 38, "RightForearm");
        this.RightForearm.mirror = true;
        this.RightForearm.setRotationPoint(0.02F, 5.3F, 1.8F);
        this.RightForearm.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightForearm, -0.3490658503988659F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 0, 35, "Snout");
        this.Snout.setRotationPoint(0.0F, -0.6F, -4.3F);
        this.Snout.addBox(-2.0F, 0.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Snout, 0.06981317007977318F, 0.0F, 0.0F);
        this.RightLeg = new BookwormModelRenderer(this, 23, 50, "RightLeg");
        this.RightLeg.mirror = true;
        this.RightLeg.setRotationPoint(0.02F, 5.5F, -2.5F);
        this.RightLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(RightLeg, 0.8028514559173915F, 0.0F, 0.0F);
        this.Nose = new BookwormModelRenderer(this, 0, 30, "Nose");
        this.Nose.setRotationPoint(0.0F, -1.1F, -0.3F);
        this.Nose.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Nose, 0.3839724354387525F, 0.0F, 0.0F);
        this.LeftLeg = new BookwormModelRenderer(this, 23, 50, "LeftLeg");
        this.LeftLeg.setRotationPoint(-0.02F, 5.5F, -2.5F);
        this.LeftLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(LeftLeg, 0.8028514559173915F, 0.0F, 0.0F);
        this.RightHand = new BookwormModelRenderer(this, 29, 42, "RightHand");
        this.RightHand.mirror = true;
        this.RightHand.setRotationPoint(0.02F, 4.8F, -1.6F);
        this.RightHand.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4, 0.0F);
        this.setRotateAngle(RightHand, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightEar = new BookwormModelRenderer(this, 16, 0, "RightEar");
        this.RightEar.mirror = true;
        this.RightEar.setRotationPoint(-0.9F, -0.9F, -2.5F);
        this.RightEar.addBox(-2.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, -0.20943951023931953F, 0.3490658503988659F, -0.3490658503988659F);
        this.Head = new BookwormModelRenderer(this, 0, 0, "Head");
        this.Head.setRotationPoint(0.0F, -0.2F, -4.5F);
        this.Head.addBox(-2.5F, -2.0F, -5.3F, 5, 5, 6, 0.0F);
        this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
        this.LeftThigh = new BookwormModelRenderer(this, 7, 52, "LeftThigh");
        this.LeftThigh.setRotationPoint(3.5F, 4.4F, 8.0F);
        this.LeftThigh.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
        this.setRotateAngle(LeftThigh, -0.13962634015954636F, 0.0F, 0.0F);
        this.Body.addChild(this.LeftBicep);
        this.Body.addChild(this.RightBicep);
        this.LeftBicep.addChild(this.LeftForearm);
        this.tail4.addChild(this.tail5);
        this.Neck.addChild(this.LowerChest);
        this.tail1.addChild(this.tail2);
        this.Snout.addChild(this.Chin);
        this.Body.addChild(this.Neck);
        this.Butt.addChild(this.tail1);
        this.tail3.addChild(this.tail4);
        this.LeftForearm.addChild(this.LeftHand);
        this.Butt.addChild(this.RightThigh);
        this.Head.addChild(this.LeftEar);
        this.LeftLeg.addChild(this.LeftFoot);
        this.RightLeg.addChild(this.RightFoot);
        this.Body.addChild(this.Butt);
        this.tail5.addChild(this.tail6);
        this.tail2.addChild(this.tail3);
        this.RightBicep.addChild(this.RightForearm);
        this.Head.addChild(this.Snout);
        this.RightThigh.addChild(this.RightLeg);
        this.Snout.addChild(this.Nose);
        this.LeftThigh.addChild(this.LeftLeg);
        this.RightForearm.addChild(this.RightHand);
        this.Head.addChild(this.RightEar);
        this.Neck.addChild(this.Head);
        this.Butt.addChild(this.LeftThigh);

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.4F, 0.4F, 0.4F);
            GlStateManager.translate(0.0F, 36.0F * scale, 0.0F);
            this.Body.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.Body.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

        if (entity instanceof EntitySkunk && !((EntitySkunk) entity).isAsleep()) {
            this.Head.rotateAngleX = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
            this.Head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        }
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.Neck.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.14F;
        this.Head.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + 0.21F;
        this.LeftEar.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + 0.36F;
        this.RightEar.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.36F;
        this.tail1.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * f1 * 0.5F + 0.4F;
        this.tail3.rotateAngleX = MathHelper.cos(0.5F + (f * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * f1 * 0.5F + -0.56F;
        this.tail5.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.48F;
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
            speed = this.isChild ? 2.0F : 4.0F;
            degree = this.isChild ? 0.6F : 0.6F;
            this.LeftBicep.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * f1 * 0.5F + 0.1F;
            this.LeftForearm.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.35F;
            this.LeftHand.rotateAngleX = MathHelper.cos(0.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.1F;
            this.RightBicep.rotateAngleX = MathHelper.cos(1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * f1 * 0.5F + 0.1F;
            this.RightForearm.rotateAngleX = MathHelper.cos(2.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.35F;
            this.RightHand.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.1F;
            this.LeftThigh.rotateAngleX = MathHelper.cos(-1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * f1 * 0.5F + -0.14F;
            this.LeftLeg.rotateAngleX = MathHelper.cos(3.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.8F;
            this.LeftFoot.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.6F;
            this.RightThigh.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * f1 * 0.5F + -0.14F;
            this.RightLeg.rotateAngleX = MathHelper.cos(5.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.8F;
            this.RightFoot.rotateAngleX = MathHelper.cos(1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.6F;
            this.Neck.rotateAngleX = MathHelper.cos(-1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -0.8F) * f1 * 0.5F + -0.12F;
            this.Head.rotateAngleX = MathHelper.cos(-2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + 0.2F;
            this.tail1.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + 1.5F;
            this.tail3.rotateAngleX = MathHelper.cos(2.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F + 0.2F;
            this.Body.offsetY = MathHelper.cos(-2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F + -0.04F;
            this.Body.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * f1 * 0.5F + 0.18F;
            this.Body.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F;
            this.Butt.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * f1 * 0.5F + -0.2F;
            this.tail4.rotateAngleX = MathHelper.cos(3.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.2F;

        } else {
            speed = this.isChild ? 4.0F : 8.0F;
            degree = this.isChild ? 1.0F : 1.2F;
            this.LeftBicep.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + 0.1F;
            this.LeftForearm.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.35F;
            this.LeftHand.rotateAngleX = MathHelper.cos(0.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.1F;
            this.RightBicep.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + 0.1F;
            this.RightForearm.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + -0.35F;
            this.RightHand.rotateAngleX = MathHelper.cos(0.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + 0.1F;
            this.LeftThigh.rotateAngleX = MathHelper.cos(1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F + -0.14F;
            this.LeftLeg.rotateAngleX = MathHelper.cos(3.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.8F;
            this.LeftFoot.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.6F;
            this.RightThigh.rotateAngleX = MathHelper.cos(1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F + -0.14F;
            this.RightLeg.rotateAngleX = MathHelper.cos(3.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.8F;
            this.RightFoot.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.6F;
            this.Neck.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.12F;
            this.Head.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + 0.2F;
            this.tail1.rotateAngleX = MathHelper.cos(1.5F + (f * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + 0.5F;
            this.tail3.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + -0.55F;
            this.tail5.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.4F) * f1 * 0.5F + -0.5F;
            this.Body.offsetY = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.04F;
            this.Body.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + 0.14F;
            this.Body.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F;
        }
    }
}
