package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SmallClawedOtterEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class SmallClawedOtterModel extends ZawaBaseModel<SmallClawedOtterEntity> {
    public ZawaModelRenderer body;
    public ZawaModelRenderer neck;
    public ZawaModelRenderer upperArmRight;
    public ZawaModelRenderer upperArmLeft;
    public ZawaModelRenderer bellyPoint;
    public ZawaModelRenderer face;
    public ZawaModelRenderer lowerChest;
    public ZawaModelRenderer earRight;
    public ZawaModelRenderer earLeft;
    public ZawaModelRenderer snout;
    public ZawaModelRenderer nose;
    public ZawaModelRenderer chin;
    public ZawaModelRenderer lowerArmRight;
    public ZawaModelRenderer handRight;
    public ZawaModelRenderer lowerArmLeft;
    public ZawaModelRenderer handLeft;
    public ZawaModelRenderer back;
    public ZawaModelRenderer tail1;
    public ZawaModelRenderer upperLegLeft;
    public ZawaModelRenderer upperLegRight;
    public ZawaModelRenderer tail2;
    public ZawaModelRenderer tail3;
    public ZawaModelRenderer lowerLegLeft;
    public ZawaModelRenderer footLeft;
    public ZawaModelRenderer lowerLegRight;
    public ZawaModelRenderer footRight;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public SmallClawedOtterModel() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.lowerLegLeft = new ZawaModelRenderer(this, 42, 16);
        this.lowerLegLeft.setPos(0.0F, 4.0F, -1.5F);
        this.lowerLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerLegLeft, 0.9424777960769379F, 0.0F, 0.0F);
        this.bellyPoint = new ZawaModelRenderer(this, 0, 0);
        this.bellyPoint.setPos(0.0F, 2.5F, 4.0F);
        this.bellyPoint.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.upperLegLeft = new ZawaModelRenderer(this, 33, 18);
        this.upperLegLeft.setPos(1.7F, 2.2F, 2.5F);
        this.upperLegLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperLegLeft, 0.06981317007977318F, 0.0F, 0.0F);
        this.lowerLegRight = new ZawaModelRenderer(this, 42, 16);
        this.lowerLegRight.mirror = true;
        this.lowerLegRight.setPos(0.0F, 4.0F, -1.5F);
        this.lowerLegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerLegRight, 0.9424777960769379F, 0.0F, 0.0F);
        this.handLeft = new ZawaModelRenderer(this, 38, 7);
        this.handLeft.setPos(-0.01F, 2.8F, -0.6F);
        this.handLeft.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handLeft, 0.5235987755982988F, 0.0F, 0.0F);
        this.upperArmLeft = new ZawaModelRenderer(this, 39, 0);
        this.upperArmLeft.setPos(2.1F, -1.0F, -2.0F);
        this.upperArmLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperArmLeft, 0.03490658503988659F, 0.0F, 0.0F);
        this.nose = new ZawaModelRenderer(this, 34, 0);
        this.nose.setPos(0.0F, -0.5F, -1.2F);
        this.nose.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(nose, 0.22689280275926282F, 0.0F, 0.0F);
        this.footLeft = new ZawaModelRenderer(this, 41, 21);
        this.footLeft.setPos(-0.01F, 2.6F, 1.1F);
        this.footLeft.addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4, 0.0F);
        this.setRotateAngle(footLeft, -0.7330382858376184F, 0.0F, 0.0F);
        this.tail1 = new ZawaModelRenderer(this, 0, 21);
        this.tail1.setPos(0.0F, 1.7F, 4.3F);
        this.tail1.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(tail1, -0.41887902047863906F, 0.0F, 0.0F);
        this.face = new ZawaModelRenderer(this, 0, 13);
        this.face.setPos(0.0F, 0.2F, -3.0F);
        this.face.addBox(-2.0F, -2.5F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(face, 0.20943951023931953F, 0.0F, 0.0F);
        this.snout = new ZawaModelRenderer(this, 43, 11);
        this.snout.setPos(0.0F, -1.2F, -2.7F);
        this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(snout, 0.017453292519943295F, 0.0F, 0.0F);
        this.lowerArmRight = new ZawaModelRenderer(this, 51, 3);
        this.lowerArmRight.mirror = true;
        this.lowerArmRight.setPos(0.0F, 4.0F, 1.4F);
        this.lowerArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerArmRight, -0.6981317007977318F, 0.0F, 0.0F);
        this.lowerArmLeft = new ZawaModelRenderer(this, 51, 3);
        this.lowerArmLeft.setPos(0.0F, 4.0F, 1.4F);
        this.lowerArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lowerArmLeft, -0.6981317007977318F, 0.0F, 0.0F);
        this.upperLegRight = new ZawaModelRenderer(this, 33, 18);
        this.upperLegRight.mirror = true;
        this.upperLegRight.setPos(-1.7F, 2.2F, 2.5F);
        this.upperLegRight.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperLegRight, 0.06981317007977318F, 0.0F, 0.0F);
        this.back = new ZawaModelRenderer(this, 23, 8);
        this.back.setPos(0.0F, -5.0F, 0.0F);
        this.back.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(back, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail2 = new ZawaModelRenderer(this, 16, 23);
        this.tail2.setPos(0.0F, 0.0F, 3.5F);
        this.tail2.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(tail2, 0.41887902047863906F, 0.0F, 0.0F);
        this.lowerChest = new ZawaModelRenderer(this, 12, 16);
        this.lowerChest.setPos(0.0F, 3.0F, -1.0F);
        this.lowerChest.addBox(-1.5F, -2.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(lowerChest, -0.3490658503988659F, 0.0F, 0.0F);
        this.neck = new ZawaModelRenderer(this, 20, 0);
        this.neck.setPos(0.0F, -0.5F, -2.0F);
        this.neck.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.2792526803190927F, 0.0F, 0.0F);
        this.handRight = new ZawaModelRenderer(this, 38, 7);
        this.handRight.mirror = true;
        this.handRight.setPos(0.01F, 2.8F, -0.6F);
        this.handRight.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handRight, 0.5235987755982988F, 0.0F, 0.0F);
        this.upperArmRight = new ZawaModelRenderer(this, 39, 0);
        this.upperArmRight.mirror = true;
        this.upperArmRight.setPos(-2.1F, -1.0F, -2.0F);
        this.upperArmRight.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(upperArmRight, 0.03490658503988659F, 0.0F, 0.0F);
        this.chin = new ZawaModelRenderer(this, 48, 0);
        this.chin.setPos(0.0F, 1.8F, -1.2F);
        this.chin.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
        this.setRotateAngle(chin, -0.13962634015954636F, 0.0F, 0.0F);
        this.earRight = new ZawaModelRenderer(this, 0, 0);
        this.earRight.mirror = true;
        this.earRight.setPos(-1.5F, -1.8F, -1.8F);
        this.earRight.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earRight, 0.0F, 0.3490658503988659F, 0.41887902047863906F);
        this.tail3 = new ZawaModelRenderer(this, 26, 23);
        this.tail3.setPos(0.0F, 0.0F, 3.5F);
        this.tail3.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(tail3, 0.20943951023931953F, 0.0F, 0.0F);
        this.body = new ZawaModelRenderer(this, 0, 0);
        this.body.setPos(0.0F, 20.1F, -1.0F);
        this.body.addBox(-3.0F, -2.5F, -4.0F, 6, 5, 8, 0.0F);
        this.setRotateAngle(body, 0.13962634015954636F, 0.0F, 0.0F);
        this.earLeft = new ZawaModelRenderer(this, 0, 0);
        this.earLeft.setPos(1.5F, -1.8F, -1.8F);
        this.earLeft.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.0F, -0.3490658503988659F, -0.41887902047863906F);
        this.footRight = new ZawaModelRenderer(this, 41, 21);
        this.footRight.mirror = true;
        this.footRight.setPos(0.01F, 2.6F, 1.1F);
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

        this.saveBase();
    }

    @Override
    public void setupAnim(SmallClawedOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.face.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
        this.face.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.28F;
        this.earLeft.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.4F;
        this.earRight.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + 0.4F;
        this.tail1.xRot = MathHelper.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.42F;
        this.tail2.xRot = MathHelper.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + 0.42F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed, degree;

        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 2.0F;
            degree = 0.9F;
            this.body.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.04F;
            this.back.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F + -0.2F;
            this.neck.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.face.xRot = MathHelper.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.tail1.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail2.xRot = MathHelper.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail3.xRot = MathHelper.cos(-3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
//            this.body.y = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.4F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperArmLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerArmLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.4F;
            this.handLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 2.4F;
//            this.upperArmLeft.z = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperArmRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerArmRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.4F;
            this.handRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 2.4F;
//            this.upperArmRight.z = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperLegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerLegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.footLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 1.2F;
//            this.upperLegLeft.z = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperLegRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerLegRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.footRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 1.2F;
//            this.upperLegRight.z = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;

        } else {
            speed = ((SmallClawedOtterEntity) entity).isBaby() ? 2.0F : 4.0F;
            degree = ((SmallClawedOtterEntity) entity).isBaby() ? 0.4F : 0.5F;
            this.upperArmLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.lowerArmLeft.xRot = MathHelper.cos(0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.handLeft.xRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.4F;
            this.upperArmRight.xRot = MathHelper.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.lowerArmRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.handRight.xRot = MathHelper.cos(2.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.4F;
            this.upperLegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.3F;
            this.lowerLegLeft.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.96F;
            this.footLeft.xRot = MathHelper.cos(-1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.82F;
            this.upperLegRight.xRot = MathHelper.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.3F;
            this.lowerLegRight.xRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.96F;
            this.footRight.xRot = MathHelper.cos(-2.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.82F;
            this.body.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.14F;
            this.back.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.4F) * limbSwingAmount * 0.5F + -0.4F;
            this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.face.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.4F) * limbSwingAmount * 0.5F + -0.2F;
            this.tail2.xRot = MathHelper.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.8F) * limbSwingAmount * 0.5F + 0.1F;
            this.tail3.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.2F;
        }
    }
}
