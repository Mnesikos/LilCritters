package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SkunkEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class SkunkModel extends ZawaBaseModel<SkunkEntity> {
    public ZawaModelRenderer Body;
    public ZawaModelRenderer Neck;
    public ZawaModelRenderer LeftBicep;
    public ZawaModelRenderer RightBicep;
    public ZawaModelRenderer Butt;
    public ZawaModelRenderer Head;
    public ZawaModelRenderer LowerChest;
    public ZawaModelRenderer LeftEar;
    public ZawaModelRenderer RightEar;
    public ZawaModelRenderer Snout;
    public ZawaModelRenderer Nose;
    public ZawaModelRenderer Chin;
    public ZawaModelRenderer LeftForearm;
    public ZawaModelRenderer LeftHand;
    public ZawaModelRenderer RightForearm;
    public ZawaModelRenderer RightHand;
    public ZawaModelRenderer LeftThigh;
    public ZawaModelRenderer RightThigh;
    public ZawaModelRenderer tail1;
    public ZawaModelRenderer LeftLeg;
    public ZawaModelRenderer LeftFoot;
    public ZawaModelRenderer RightLeg;
    public ZawaModelRenderer RightFoot;
    public ZawaModelRenderer tail2;
    public ZawaModelRenderer tail3;
    public ZawaModelRenderer tail4;
    public ZawaModelRenderer tail5;
    public ZawaModelRenderer tail6;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public SkunkModel() {
        this.texWidth = 96;
        this.texHeight = 64;
        this.LeftBicep = new ZawaModelRenderer(this, 9, 42);
        this.LeftBicep.setPos(3.0F, -0.5F, -3.3F);
        this.LeftBicep.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftBicep, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightBicep = new ZawaModelRenderer(this, 9, 42);
        this.RightBicep.mirror = true;
        this.RightBicep.setPos(-3.0F, -0.5F, -3.3F);
        this.RightBicep.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RightBicep, 0.10471975511965977F, 0.0F, 0.0F);
        this.Body = new ZawaModelRenderer(this, 22, 0);
        this.Body.setPos(0.0F, 14.2F, -3.2F);
        this.Body.addBox(-4.0F, -4.5F, -4.5F, 8, 9, 9, 0.0F);
        this.setRotateAngle(Body, 0.13962634015954636F, 0.0F, 0.0F);
        this.LeftForearm = new ZawaModelRenderer(this, 21, 38);
        this.LeftForearm.setPos(-0.02F, 5.3F, 1.8F);
        this.LeftForearm.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftForearm, -0.3490658503988659F, 0.0F, 0.0F);
        this.tail5 = new ZawaModelRenderer(this, 67, 6);
        this.tail5.setPos(0.0F, 0.0F, 5.0F);
        this.tail5.addBox(-3.5F, -2.0F, 0.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(tail5, -0.4886921905584123F, 0.0F, 0.0F);
        this.LowerChest = new ZawaModelRenderer(this, 0, 21);
        this.LowerChest.setPos(0.0F, 5.3F, -0.5F);
        this.LowerChest.addBox(-2.5F, -3.0F, -4.6F, 5, 3, 5, 0.0F);
        this.setRotateAngle(LowerChest, -0.5410520681182421F, 0.0F, 0.0F);
        this.tail2 = new ZawaModelRenderer(this, 64, 38);
        this.tail2.setPos(0.0F, 0.2F, 4.0F);
        this.tail2.addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(tail2, 0.24434609527920614F, 0.0F, 0.0F);
        this.Chin = new ZawaModelRenderer(this, 10, 31);
        this.Chin.setPos(0.0F, 2.7F, 0.2F);
        this.Chin.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Chin, -0.10471975511965977F, 0.0F, 0.0F);
        this.Neck = new ZawaModelRenderer(this, 0, 11);
        this.Neck.setPos(0.0F, -2.3F, -2.5F);
        this.Neck.addBox(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(Neck, -0.13962634015954636F, 0.0F, 0.0F);
        this.tail1 = new ZawaModelRenderer(this, 66, 49);
        this.tail1.setPos(0.0F, 2.6F, 8.4F);
        this.tail1.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 5, 0.0F);
        this.setRotateAngle(tail1, 1.4660765716752369F, 0.0F, 0.0F);
        this.tail4 = new ZawaModelRenderer(this, 64, 14);
        this.tail4.setPos(0.0F, 0.0F, 5.3F);
        this.tail4.addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(tail4, -0.6981317007977318F, 0.0F, 0.0F);
        this.LeftHand = new ZawaModelRenderer(this, 29, 42);
        this.LeftHand.setPos(-0.02F, 4.8F, -1.6F);
        this.LeftHand.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4, 0.0F);
        this.setRotateAngle(LeftHand, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightThigh = new ZawaModelRenderer(this, 7, 52);
        this.RightThigh.mirror = true;
        this.RightThigh.setPos(-3.5F, 4.4F, 8.0F);
        this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
        this.setRotateAngle(RightThigh, -0.13962634015954636F, 0.0F, 0.0F);
        this.LeftEar = new ZawaModelRenderer(this, 16, 0);
        this.LeftEar.setPos(0.9F, -0.9F, -2.5F);
        this.LeftEar.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, -0.20943951023931953F, -0.3490658503988659F, 0.3490658503988659F);
        this.LeftFoot = new ZawaModelRenderer(this, 32, 47);
        this.LeftFoot.setPos(-0.02F, 6.0F, 1.8F);
        this.LeftFoot.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(LeftFoot, -0.593411945678072F, 0.0F, 0.0F);
        this.RightFoot = new ZawaModelRenderer(this, 32, 47);
        this.RightFoot.mirror = true;
        this.RightFoot.setPos(0.02F, 6.0F, 1.8F);
        this.RightFoot.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(RightFoot, -0.593411945678072F, 0.0F, 0.0F);
        this.Butt = new ZawaModelRenderer(this, 22, 18);
        this.Butt.setPos(0.0F, -4.5F, 4.0F);
        this.Butt.addBox(-4.5F, 0.0F, 0.0F, 9, 9, 11, 0.0F);
        this.setRotateAngle(Butt, -0.20943951023931953F, 0.0F, 0.0F);
        this.tail6 = new ZawaModelRenderer(this, 70, 0);
        this.tail6.setPos(0.0F, 0.1F, 2.5F);
        this.tail6.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(tail6, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail3 = new ZawaModelRenderer(this, 62, 25);
        this.tail3.setPos(0.0F, 0.0F, 4.4F);
        this.tail3.addBox(-4.5F, -3.0F, 0.0F, 9, 6, 7, 0.0F);
        this.setRotateAngle(tail3, -0.5585053606381855F, 0.0F, 0.0F);
        this.RightForearm = new ZawaModelRenderer(this, 21, 38);
        this.RightForearm.mirror = true;
        this.RightForearm.setPos(0.02F, 5.3F, 1.8F);
        this.RightForearm.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightForearm, -0.3490658503988659F, 0.0F, 0.0F);
        this.Snout = new ZawaModelRenderer(this, 0, 35);
        this.Snout.setPos(0.0F, -0.6F, -4.3F);
        this.Snout.addBox(-2.0F, 0.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Snout, 0.06981317007977318F, 0.0F, 0.0F);
        this.RightLeg = new ZawaModelRenderer(this, 23, 50);
        this.RightLeg.mirror = true;
        this.RightLeg.setPos(0.02F, 5.5F, -2.5F);
        this.RightLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(RightLeg, 0.8028514559173915F, 0.0F, 0.0F);
        this.Nose = new ZawaModelRenderer(this, 0, 30);
        this.Nose.setPos(0.0F, -1.1F, -0.3F);
        this.Nose.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Nose, 0.3839724354387525F, 0.0F, 0.0F);
        this.LeftLeg = new ZawaModelRenderer(this, 23, 50);
        this.LeftLeg.setPos(-0.02F, 5.5F, -2.5F);
        this.LeftLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(LeftLeg, 0.8028514559173915F, 0.0F, 0.0F);
        this.RightHand = new ZawaModelRenderer(this, 29, 42);
        this.RightHand.mirror = true;
        this.RightHand.setPos(0.02F, 4.8F, -1.6F);
        this.RightHand.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4, 0.0F);
        this.setRotateAngle(RightHand, 0.10471975511965977F, 0.0F, 0.0F);
        this.RightEar = new ZawaModelRenderer(this, 16, 0);
        this.RightEar.mirror = true;
        this.RightEar.setPos(-0.9F, -0.9F, -2.5F);
        this.RightEar.addBox(-2.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, -0.20943951023931953F, 0.3490658503988659F, -0.3490658503988659F);
        this.Head = new ZawaModelRenderer(this, 0, 0);
        this.Head.setPos(0.0F, -0.2F, -4.5F);
        this.Head.addBox(-2.5F, -2.0F, -5.3F, 5, 5, 6, 0.0F);
        this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
        this.LeftThigh = new ZawaModelRenderer(this, 7, 52);
        this.LeftThigh.setPos(3.5F, 4.4F, 8.0F);
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

        this.saveBase();
    }

    @Override
    public void setupAnim(SkunkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);

    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.Neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.14F;
        this.Head.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + 0.21F;
        this.LeftEar.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.36F;
        this.RightEar.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.36F;
        this.tail1.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + 0.4F;
        this.tail3.xRot = MathHelper.cos(0.5F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.56F;
        this.tail5.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.48F;

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed;
        float degree;

        if (isSwimming) {
            limbSwing = (float)entity.tickCount;
            limbSwingAmount = 0.3F;
        }

        if (entity.isSprinting()) {
            speed = ((SkunkEntity) entity).isBaby() ? 2.0F : 4.0F;
            degree = 0.6F;
            this.LeftBicep.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftForearm.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.LeftHand.xRot = MathHelper.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightBicep.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightForearm.xRot = MathHelper.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.RightHand.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftThigh.xRot = MathHelper.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.LeftLeg.xRot = MathHelper.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.LeftFoot.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.RightThigh.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.RightLeg.xRot = MathHelper.cos(5.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.RightFoot.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.Neck.xRot = MathHelper.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.8F) * limbSwingAmount * 0.5F + -0.12F;
            this.Head.xRot = MathHelper.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 1.5F;
            this.tail3.xRot = MathHelper.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + 0.2F;
//            this.Body.y = MathHelper.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.04F;
            this.Body.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F + 0.18F;
            this.Body.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Butt.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F + -0.2F;
            this.tail4.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;

        } else {
            speed = ((SkunkEntity) entity).isBaby() ? 4.0F : 8.0F;
            degree = ((SkunkEntity) entity).isBaby() ? 1.0F : 1.2F;
            this.LeftBicep.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftForearm.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.LeftHand.xRot = MathHelper.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightBicep.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightForearm.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.RightHand.xRot = MathHelper.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftThigh.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.LeftLeg.xRot = MathHelper.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.LeftFoot.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.RightThigh.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.RightLeg.xRot = MathHelper.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.RightFoot.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.Neck.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.12F;
            this.Head.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = MathHelper.cos(1.5F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.5F;
            this.tail3.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.55F;
            this.tail5.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + -0.5F;
//            this.Body.y = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.04F;
            this.Body.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + 0.14F;
            this.Body.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
        }
    }
}
