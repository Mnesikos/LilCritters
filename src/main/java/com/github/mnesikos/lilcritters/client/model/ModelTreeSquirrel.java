package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntityTreeSquirrel;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import net.soggymustache.bookworm.util.BookwormUtils;
import org.zawamod.configuration.ZAWAConfig;

public class ModelTreeSquirrel extends BookwormModelBase {
    protected BookwormModelRenderer body;
    protected BookwormModelRenderer neck;
    protected BookwormModelRenderer leftBicep;
    protected BookwormModelRenderer rightBicep;
    protected BookwormModelRenderer butt;
    protected BookwormModelRenderer head;
    protected BookwormModelRenderer lowerChest;
    protected BookwormModelRenderer leftEar;
    protected BookwormModelRenderer rightEar;
    protected BookwormModelRenderer snout;
    protected BookwormModelRenderer leftTuft;
    protected BookwormModelRenderer rightTuft;
    protected BookwormModelRenderer nose;
    protected BookwormModelRenderer chin;
    protected BookwormModelRenderer leftForearm;
    protected BookwormModelRenderer leftHand;
    protected BookwormModelRenderer rightForearm;
    protected BookwormModelRenderer rightHand;
    protected BookwormModelRenderer leftThigh;
    protected BookwormModelRenderer rightThigh;
    protected BookwormModelRenderer tail1;
    protected BookwormModelRenderer leftLeg;
    protected BookwormModelRenderer leftFoot;
    protected BookwormModelRenderer rightLeg;
    protected BookwormModelRenderer rightFoot;
    protected BookwormModelRenderer tail2;
    protected BookwormModelRenderer tail3;
    protected BookwormModelRenderer tail4;
    protected BookwormModelRenderer tail5;
    protected BookwormModelRenderer tail6;

    public ModelTreeSquirrel() {
        this.textureWidth = 96;
        this.textureHeight = 64;
        this.leftThigh = new BookwormModelRenderer(this, 7, 47, "leftThigh");
        this.leftThigh.setRotationPoint(2.5F, 2.6F, 5.8F);
        this.leftThigh.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(leftThigh, -0.06981317007977318F, -0.13962634015954636F, 0.0F);
        this.tail4 = new BookwormModelRenderer(this, 52, 10, "tail4");
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail4.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(tail4, 0.5585053606381855F, 0.0F, 0.0F);
        this.chin = new BookwormModelRenderer(this, 10, 30, "chin");
        this.chin.setRotationPoint(0.0F, 2.0F, -0.4F);
        this.chin.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(chin, -0.3490658503988659F, 0.0F, 0.0F);
        this.rightFoot = new BookwormModelRenderer(this, 29, 47, "rightFoot");
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(-0.01F, 5.0F, 1.5F);
        this.rightFoot.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(rightFoot, -0.7330382858376184F, 0.06981317007977318F, -0.03490658503988659F);
        this.rightLeg = new BookwormModelRenderer(this, 21, 47, "rightLeg");
        this.rightLeg.mirror = true;
        this.rightLeg.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.rightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rightLeg, 0.9424777960769379F, 0.0F, 0.0F);
        this.leftLeg = new BookwormModelRenderer(this, 21, 47, "leftLeg");
        this.leftLeg.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.leftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(leftLeg, 0.9424777960769379F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 0, "head");
        this.head.setRotationPoint(0.0F, -0.3F, -3.0F);
        this.head.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0.41887902047863906F, 0.0F, 0.0F);
        this.snout = new BookwormModelRenderer(this, 0, 31, "snout");
        this.snout.setRotationPoint(0.0F, -1.1F, -3.9F);
        this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(snout, 0.22689280275926282F, 0.0F, 0.0F);
        this.leftFoot = new BookwormModelRenderer(this, 29, 47, "leftFoot");
        this.leftFoot.setRotationPoint(-0.01F, 5.0F, 1.5F);
        this.leftFoot.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(leftFoot, -0.7330382858376184F, -0.06981317007977318F, 0.03490658503988659F);
        this.rightBicep = new BookwormModelRenderer(this, 9, 37, "rightBicep");
        this.rightBicep.mirror = true;
        this.rightBicep.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.rightBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightBicep, 0.20943951023931953F, -0.06981317007977318F, 0.06981317007977318F);
        this.rightTuft = new BookwormModelRenderer(this, 20, 0, "rightTuft");
        this.rightTuft.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.rightTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.tail6 = new BookwormModelRenderer(this, 52, 0, "tail6");
        this.tail6.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.tail6.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(tail6, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftHand = new BookwormModelRenderer(this, 29, 37, "leftHand");
        this.leftHand.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.leftHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(leftHand, 0.41887902047863906F, 0.06981317007977318F, 0.03490658503988659F);
        this.tail1 = new BookwormModelRenderer(this, 52, 38, "tail1");
        this.tail1.setRotationPoint(0.0F, 2.1F, 6.2F);
        this.tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(tail1, 1.117010721276371F, 0.0F, 0.0F);
        this.rightEar = new BookwormModelRenderer(this, 14, 0, "rightEar");
        this.rightEar.mirror = true;
        this.rightEar.setRotationPoint(-1.5F, -1.4F, -1.5F);
        this.rightEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightEar, 0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.rightHand = new BookwormModelRenderer(this, 29, 37, "rightHand");
        this.rightHand.mirror = true;
        this.rightHand.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.rightHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rightHand, 0.41887902047863906F, -0.06981317007977318F, -0.03490658503988659F);
        this.tail5 = new BookwormModelRenderer(this, 52, 4, "tail5");
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail5.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(tail5, 0.20943951023931953F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 10, "neck");
        this.neck.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.6283185307179586F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 52, 29, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.2F, 3.0F);
        this.tail2.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(tail2, 0.41887902047863906F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 21, 0, "body");
        this.body.setRotationPoint(0.0F, 19.7F, -2.5F);
        this.body.addBox(-3.0F, -3.5F, -4.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(body, 0.2792526803190927F, 0.0F, 0.0F);
        this.leftEar = new BookwormModelRenderer(this, 14, 0, "leftEar");
        this.leftEar.setRotationPoint(1.5F, -1.4F, -1.5F);
        this.leftEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftEar, 0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.leftTuft = new BookwormModelRenderer(this, 20, 0, "leftTuft");
        this.leftTuft.mirror = true;
        this.leftTuft.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.leftTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.leftBicep = new BookwormModelRenderer(this, 9, 37, "leftBicep");
        this.leftBicep.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.leftBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftBicep, 0.20943951023931953F, 0.06981317007977318F, -0.06981317007977318F);
        this.lowerChest = new BookwormModelRenderer(this, 0, 18, "lowerChest");
        this.lowerChest.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.lowerChest.addBox(-2.0F, -2.0F, -5.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(lowerChest, -0.4886921905584123F, 0.0F, 0.0F);
        this.leftForearm = new BookwormModelRenderer(this, 21, 37, "leftForearm");
        this.leftForearm.setRotationPoint(0.0F, 5.0F, 1.3F);
        this.leftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftForearm, -0.9075712110370513F, -0.06981317007977318F, 0.06981317007977318F);
        this.nose = new BookwormModelRenderer(this, 0, 27, "nose");
        this.nose.setRotationPoint(0.0F, -0.6F, -0.1F);
        this.nose.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
        this.butt = new BookwormModelRenderer(this, 21, 15, "butt");
        this.butt.setRotationPoint(0.0F, -3.5F, 4.0F);
        this.butt.addBox(-3.5F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(butt, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail3 = new BookwormModelRenderer(this, 52, 18, "tail3");
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(tail3, 0.3490658503988659F, 0.0F, 0.0F);
        this.rightForearm = new BookwormModelRenderer(this, 21, 37, "rightForearm");
        this.rightForearm.mirror = true;
        this.rightForearm.setRotationPoint(0.0F, 5.0F, 1.3F);
        this.rightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightForearm, -0.9075712110370513F, 0.06981317007977318F, -0.06981317007977318F);
        this.rightThigh = new BookwormModelRenderer(this, 7, 47, "rightThigh");
        this.rightThigh.mirror = true;
        this.rightThigh.setRotationPoint(-2.5F, 2.6F, 5.8F);
        this.rightThigh.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(rightThigh, -0.06981317007977318F, 0.13962634015954636F, 0.0F);
        this.butt.addChild(this.leftThigh);
        this.tail3.addChild(this.tail4);
        this.snout.addChild(this.chin);
        this.rightLeg.addChild(this.rightFoot);
        this.rightThigh.addChild(this.rightLeg);
        this.leftThigh.addChild(this.leftLeg);
        this.neck.addChild(this.head);
        this.head.addChild(this.snout);
        this.leftLeg.addChild(this.leftFoot);
        this.body.addChild(this.rightBicep);
        this.rightEar.addChild(this.rightTuft);
        this.tail5.addChild(this.tail6);
        this.leftForearm.addChild(this.leftHand);
        this.butt.addChild(this.tail1);
        this.head.addChild(this.rightEar);
        this.rightForearm.addChild(this.rightHand);
        this.tail4.addChild(this.tail5);
        this.body.addChild(this.neck);
        this.tail1.addChild(this.tail2);
        this.head.addChild(this.leftEar);
        this.leftEar.addChild(this.leftTuft);
        this.body.addChild(this.leftBicep);
        this.neck.addChild(this.lowerChest);
        this.leftBicep.addChild(this.leftForearm);
        this.snout.addChild(this.nose);
        this.body.addChild(this.butt);
        this.tail2.addChild(this.tail3);
        this.rightBicep.addChild(this.rightForearm);
        this.butt.addChild(this.rightThigh);

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 26.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.body.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, Entity entity) {
        if (entity != null) {
            super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
            this.reset();

            float globalSpeed = 1f;
            float globalDegree = 1.2f;
            float globalHeight = 1.5f;
            if (this.isChild) {
                globalSpeed = 0.7f;
                globalDegree = 0.8f;
                globalHeight = 1.0f;
            }

            if (entity instanceof EntityTreeSquirrel) {
                EntityTreeSquirrel squirrel = (EntityTreeSquirrel) entity;
                this.head.rotateAngleX = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
                this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);

                if (!squirrel.isRiding()) {

                    if (squirrel.isInWater()) {
                        limbSwing = squirrel.isChild() ? (float) entity.ticksExisted * 3f : (float) entity.ticksExisted;
                        limbSwingAmount = 1.0F;

                        this.rightBicep.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 0.7f) + -0.3f;
                        this.leftBicep.rotateAngleX = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 0.7f) + -0.3f;
                        this.rightForearm.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 2f) + -1f;
                        this.leftForearm.rotateAngleX = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 2f) + -1f;
                        this.rightHand.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + -1f) + 0.8f;
                        this.leftHand.rotateAngleX = 1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + -1f) + 0.8f;

                        this.rightThigh.rotateAngleX = 1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 0f) + 0f;
                        this.leftThigh.rotateAngleX = -1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 0f) + 0f;
                        this.rightLeg.rotateAngleX = -1f * limbSwingAmount * (0.33f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 1.5f) + 1.16f;
                        this.leftLeg.rotateAngleX = 1f * limbSwingAmount * (0.33f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 1.5f) + 1.16f;
                        this.rightFoot.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + -0.6f) + -0.2f;
                        this.leftFoot.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + -0.6f) + -0.2f;

                        this.neck.rotateAngleX = -0.67f;
                        this.head.rotateAngleX = 0.3f;
                        this.tail1.rotateAngleY = 1f * limbSwingAmount * (0.02f * globalDegree) * MathHelper.cos(limbSwing * (0.3f * globalSpeed) + 0f);
                        this.tail1.rotateAngleX = 0f;
                        this.tail2.rotateAngleX = 0.2f;
                        this.tail3.rotateAngleX = this.tail4.rotateAngleX = this.tail5.rotateAngleX = this.tail6.rotateAngleX = 0.1f;

                    } else if (!squirrel.getIsSitting() && BookwormUtils.isEntityMoving(squirrel)) {
                        this.body.rotationPointY = (float) -Math.abs((Math.sin(limbSwing * (0.5f * globalSpeed)) * limbSwingAmount * (6.0f * globalHeight))) + 20.5f;
                        this.body.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0.1f;
                        this.butt.rotateAngleX = 1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 1.3f) + -0.5f;

                        this.rightBicep.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0.7f) + -0.3f;
                        this.leftBicep.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0.7f) + -0.3f;
                        this.rightForearm.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 2f) + -1f;
                        this.leftForearm.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 2f) + -1f;
                        this.rightHand.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + -1f) + 0.8f;
                        this.leftHand.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + -1f) + 0.8f;

                        this.rightThigh.rotateAngleX = -1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0f;
                        this.leftThigh.rotateAngleX = -1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0f;
                        this.rightLeg.rotateAngleX = 1f * limbSwingAmount * (0.33f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 1.5f) + 1.16f;
                        this.leftLeg.rotateAngleX = 1f * limbSwingAmount * (0.33f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 1.5f) + 1.16f;
                        this.rightFoot.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + -0.6f) + -0.2f;
                        this.leftFoot.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + -0.6f) + -0.2f;

                        this.neck.rotateAngleX = -1f * limbSwingAmount * (0.3f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + -0.5f;
                        this.head.rotateAngleX = -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0.3f;
                        this.tail1.rotateAngleX =
                                1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 2f) + 0.3f;
                        this.tail2.rotateAngleX = this.tail3.rotateAngleX =
                                1f * limbSwingAmount * (0.3f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0.2f;
                        this.tail4.rotateAngleX = this.tail5.rotateAngleX = this.tail6.rotateAngleX =
                                -1f * limbSwingAmount * (0.2f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 2f) + 0f;

                    } else if (ZAWAConfig.clientOptions.livingAnimations && !BookwormUtils.isEntityMoving(squirrel) && !squirrel.getIsSitting()) {
                        limbSwing = (float) squirrel.ticksExisted;
                        limbSwingAmount = 0.3F;
                        this.tail1.rotateAngleX = 0.24f * limbSwingAmount * (0.08f * globalDegree) * MathHelper.cos(limbSwing * (0.08f * globalSpeed) + 12.0f) + 1.0f;
                        this.tail4.rotateAngleX = 0.24f * limbSwingAmount * (0.16f * globalDegree) * MathHelper.cos(limbSwing * (0.08f * globalSpeed) + 6.0f) + 0.52f;
                        this.neck.rotateAngleX = 0.5f * limbSwingAmount * (0.16f * globalDegree) * MathHelper.cos(limbSwing * (0.06f * globalSpeed) + 14.0f) + -0.6f;

                    } else if (!BookwormUtils.isEntityMoving(squirrel) && squirrel.getIsSitting()) {
                        this.loadPosedModel(ModEntityPoses.SQUIRREL_SIT);
                        limbSwing = (float) squirrel.ticksExisted;
                        limbSwingAmount = 0.3F;
                        this.head.rotateAngleX = 1f * limbSwingAmount * (0.26f * 1.2f) * MathHelper.cos(limbSwing * (0.8f * 1f) + 0.0f) + 1.4f;
                        this.chin.rotateAngleX = 1f * limbSwingAmount * (0.6f * 1.2f) * MathHelper.cos(limbSwing * (0.8f * 1f) + 2.0f);

                    }
                }
            }
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    protected void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}