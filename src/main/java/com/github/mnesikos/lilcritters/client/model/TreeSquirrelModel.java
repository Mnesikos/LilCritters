package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TreeSquirrelEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class TreeSquirrelModel extends ZawaBaseModel<TreeSquirrelEntity> {
    protected ZawaModelRenderer body;
    protected ZawaModelRenderer neck;
    protected ZawaModelRenderer leftBicep;
    protected ZawaModelRenderer rightBicep;
    protected ZawaModelRenderer butt;
    protected ZawaModelRenderer head;
    protected ZawaModelRenderer lowerChest;
    protected ZawaModelRenderer leftEar;
    protected ZawaModelRenderer rightEar;
    protected ZawaModelRenderer snout;
    protected ZawaModelRenderer leftTuft;
    protected ZawaModelRenderer rightTuft;
    protected ZawaModelRenderer nose;
    protected ZawaModelRenderer chin;
    protected ZawaModelRenderer leftForearm;
    protected ZawaModelRenderer leftHand;
    protected ZawaModelRenderer rightForearm;
    protected ZawaModelRenderer rightHand;
    protected ZawaModelRenderer leftThigh;
    protected ZawaModelRenderer rightThigh;
    protected ZawaModelRenderer tail1;
    protected ZawaModelRenderer leftLeg;
    protected ZawaModelRenderer leftFoot;
    protected ZawaModelRenderer rightLeg;
    protected ZawaModelRenderer rightFoot;
    protected ZawaModelRenderer tail2;
    protected ZawaModelRenderer tail3;
    protected ZawaModelRenderer tail4;
    protected ZawaModelRenderer tail5;
    protected ZawaModelRenderer tail6;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public TreeSquirrelModel() {
        this.texWidth = 96;
        this.texHeight = 64;
        this.leftThigh = new ZawaModelRenderer(this, 7, 47);
        this.leftThigh.setPos(2.5F, 2.6F, 5.8F);
        this.leftThigh.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(leftThigh, -0.06981317007977318F, -0.13962634015954636F, 0.0F);
        this.tail4 = new ZawaModelRenderer(this, 52, 10);
        this.tail4.setPos(0.0F, 0.0F, 4.5F);
        this.tail4.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(tail4, 0.5585053606381855F, 0.0F, 0.0F);
        this.chin = new ZawaModelRenderer(this, 10, 30);
        this.chin.setPos(0.0F, 2.0F, -0.4F);
        this.chin.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(chin, -0.3490658503988659F, 0.0F, 0.0F);
        this.rightFoot = new ZawaModelRenderer(this, 29, 47);
        this.rightFoot.mirror = true;
        this.rightFoot.setPos(-0.01F, 5.0F, 1.5F);
        this.rightFoot.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(rightFoot, -0.7330382858376184F, 0.06981317007977318F, -0.03490658503988659F);
        this.rightLeg = new ZawaModelRenderer(this, 21, 47);
        this.rightLeg.mirror = true;
        this.rightLeg.setPos(0.0F, 5.0F, -1.5F);
        this.rightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rightLeg, 0.9424777960769379F, 0.0F, 0.0F);
        this.leftLeg = new ZawaModelRenderer(this, 21, 47);
        this.leftLeg.setPos(0.0F, 5.0F, -1.5F);
        this.leftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(leftLeg, 0.9424777960769379F, 0.0F, 0.0F);
        this.head = new ZawaModelRenderer(this, 0, 0);
        this.head.setPos(0.0F, -0.3F, -3.0F);
        this.head.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0.41887902047863906F, 0.0F, 0.0F);
        this.snout = new ZawaModelRenderer(this, 0, 31);
        this.snout.setPos(0.0F, -1.1F, -3.9F);
        this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(snout, 0.22689280275926282F, 0.0F, 0.0F);
        this.leftFoot = new ZawaModelRenderer(this, 29, 47);
        this.leftFoot.setPos(-0.01F, 5.0F, 1.5F);
        this.leftFoot.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(leftFoot, -0.7330382858376184F, -0.06981317007977318F, 0.03490658503988659F);
        this.rightBicep = new ZawaModelRenderer(this, 9, 37);
        this.rightBicep.mirror = true;
        this.rightBicep.setPos(-2.0F, -1.0F, -2.0F);
        this.rightBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightBicep, 0.20943951023931953F, -0.06981317007977318F, 0.06981317007977318F);
        this.rightTuft = new ZawaModelRenderer(this, 20, 0);
        this.rightTuft.setPos(0.0F, -1.7F, 0.0F);
        this.rightTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.tail6 = new ZawaModelRenderer(this, 52, 0);
        this.tail6.setPos(0.0F, 0.1F, 2.0F);
        this.tail6.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(tail6, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftHand = new ZawaModelRenderer(this, 29, 37);
        this.leftHand.setPos(0.0F, 3.8F, -0.5F);
        this.leftHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(leftHand, 0.41887902047863906F, 0.06981317007977318F, 0.03490658503988659F);
        this.tail1 = new ZawaModelRenderer(this, 52, 38);
        this.tail1.setPos(0.0F, 2.1F, 6.2F);
        this.tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(tail1, 1.117010721276371F, 0.0F, 0.0F);
        this.rightEar = new ZawaModelRenderer(this, 14, 0);
        this.rightEar.mirror = true;
        this.rightEar.setPos(-1.5F, -1.4F, -1.5F);
        this.rightEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightEar, 0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.rightHand = new ZawaModelRenderer(this, 29, 37);
        this.rightHand.mirror = true;
        this.rightHand.setPos(0.0F, 3.8F, -0.5F);
        this.rightHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rightHand, 0.41887902047863906F, -0.06981317007977318F, -0.03490658503988659F);
        this.tail5 = new ZawaModelRenderer(this, 52, 4);
        this.tail5.setPos(0.0F, 0.0F, 3.0F);
        this.tail5.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(tail5, 0.20943951023931953F, 0.0F, 0.0F);
        this.neck = new ZawaModelRenderer(this, 0, 10);
        this.neck.setPos(0.0F, -1.0F, -2.0F);
        this.neck.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.6283185307179586F, 0.0F, 0.0F);
        this.tail2 = new ZawaModelRenderer(this, 52, 29);
        this.tail2.setPos(0.0F, 0.2F, 3.0F);
        this.tail2.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(tail2, 0.41887902047863906F, 0.0F, 0.0F);
        this.body = new ZawaModelRenderer(this, 21, 0);
        this.body.setPos(0.0F, 19.7F, -2.5F);
        this.body.addBox(-3.0F, -3.5F, -4.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(body, 0.2792526803190927F, 0.0F, 0.0F);
        this.leftEar = new ZawaModelRenderer(this, 14, 0);
        this.leftEar.setPos(1.5F, -1.4F, -1.5F);
        this.leftEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftEar, 0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.leftTuft = new ZawaModelRenderer(this, 20, 0);
        this.leftTuft.mirror = true;
        this.leftTuft.setPos(0.0F, -1.7F, 0.0F);
        this.leftTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.leftBicep = new ZawaModelRenderer(this, 9, 37);
        this.leftBicep.setPos(2.0F, -1.0F, -2.0F);
        this.leftBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftBicep, 0.20943951023931953F, 0.06981317007977318F, -0.06981317007977318F);
        this.lowerChest = new ZawaModelRenderer(this, 0, 18);
        this.lowerChest.setPos(0.0F, 4.0F, 0.5F);
        this.lowerChest.addBox(-2.0F, -2.0F, -5.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(lowerChest, -0.4886921905584123F, 0.0F, 0.0F);
        this.leftForearm = new ZawaModelRenderer(this, 21, 37);
        this.leftForearm.setPos(0.0F, 5.0F, 1.3F);
        this.leftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftForearm, -0.9075712110370513F, -0.06981317007977318F, 0.06981317007977318F);
        this.nose = new ZawaModelRenderer(this, 0, 27);
        this.nose.setPos(0.0F, -0.6F, -0.1F);
        this.nose.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
        this.butt = new ZawaModelRenderer(this, 21, 15);
        this.butt.setPos(0.0F, -3.5F, 4.0F);
        this.butt.addBox(-3.5F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(butt, -0.41887902047863906F, 0.0F, 0.0F);
        this.tail3 = new ZawaModelRenderer(this, 52, 18);
        this.tail3.setPos(0.0F, 0.0F, 3.0F);
        this.tail3.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(tail3, 0.3490658503988659F, 0.0F, 0.0F);
        this.rightForearm = new ZawaModelRenderer(this, 21, 37);
        this.rightForearm.mirror = true;
        this.rightForearm.setPos(0.0F, 5.0F, 1.3F);
        this.rightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightForearm, -0.9075712110370513F, 0.06981317007977318F, -0.06981317007977318F);
        this.rightThigh = new ZawaModelRenderer(this, 7, 47);
        this.rightThigh.mirror = true;
        this.rightThigh.setPos(-2.5F, 2.6F, 5.8F);
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

        this.saveBase();
    }

    @Override
    public void setupAnim(TreeSquirrelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float globalSpeed = 1f;
        float globalDegree = 1.2f;
        if (((TreeSquirrelEntity) entity).isBaby()) {
            globalSpeed = 0.7f;
            globalDegree = 0.8f;
        }

        this.tail1.xRot = 0.24f * limbSwingAmount * (0.08f * globalDegree) * MathHelper.cos(limbSwing * (0.08f * globalSpeed) + 12.0f) + 1.0f;
        this.tail4.xRot = 0.24f * limbSwingAmount * (0.16f * globalDegree) * MathHelper.cos(limbSwing * (0.08f * globalSpeed) + 6.0f) + 0.52f;
        this.neck.xRot = 0.5f * limbSwingAmount * (0.16f * globalDegree) * MathHelper.cos(limbSwing * (0.06f * globalSpeed) + 14.0f) + -0.6f;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1f;
        float degree = 1.2f;
        float height = 1.5f;
        if (((TreeSquirrelEntity) entity).isBaby()) {
            speed = 0.7f;
            degree = 0.8f;
            height = 1.0f;
        }

        if (isSwimming) {
            limbSwing = ((TreeSquirrelEntity) entity).isBaby() ? (float) entity.tickCount * 3f : (float) entity.tickCount;
            limbSwingAmount = 1.0F;

            this.rightBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 0.7f) + -0.3f;
            this.leftBicep.xRot = -1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 0.7f) + -0.3f;
            this.rightForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 2f) + -1f;
            this.leftForearm.xRot = -1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 2f) + -1f;
            this.rightHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + -1f) + 0.8f;
            this.leftHand.xRot = 1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + -1f) + 0.8f;

            this.rightThigh.xRot = 1f * limbSwingAmount * (0.5f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 0f) + 0f;
            this.leftThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 0f) + 0f;
            this.rightLeg.xRot = -1f * limbSwingAmount * (0.33f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 1.5f) + 1.16f;
            this.leftLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 1.5f) + 1.16f;
            this.rightFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + -0.6f) + -0.2f;
            this.leftFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + -0.6f) + -0.2f;

            this.neck.xRot = -0.67f;
            this.head.xRot = 0.3f;
            this.tail1.yRot = 1f * limbSwingAmount * (0.02f * degree) * MathHelper.cos(limbSwing * (0.3f * speed) + 0f);
            this.tail1.xRot = 0f;
            this.tail2.xRot = 0.2f;
            this.tail3.xRot = this.tail4.xRot = this.tail5.xRot = this.tail6.xRot = 0.1f;

        } else {
//            this.body.y = (float) -Math.abs((Math.sin(limbSwing * (0.5f * speed)) * limbSwingAmount * (6.0f * height))) + 20.5f;
            this.body.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + 0.1f;
            this.butt.xRot = 1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + 1.3f) + -0.5f;

            this.rightBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (speed) + 0.7f) + -0.3f;
            this.leftBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (speed) + 0.7f) + -0.3f;
            this.rightForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (speed) + 2f) + -1f;
            this.leftForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * MathHelper.cos(limbSwing * (speed) + 2f) + -1f;
            this.rightHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + -1f) + 0.8f;
            this.leftHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + -1f) + 0.8f;

            this.rightThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + 0f;
            this.leftThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + 0f;
            this.rightLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * MathHelper.cos(limbSwing * (speed) + 1.5f) + 1.16f;
            this.leftLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * MathHelper.cos(limbSwing * (speed) + 1.5f) + 1.16f;
            this.rightFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + -0.6f) + -0.2f;
            this.leftFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + -0.6f) + -0.2f;

            this.neck.xRot = -1f * limbSwingAmount * (0.3f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + -0.5f;
            this.head.xRot = -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + 0.3f;
            this.tail1.xRot =
                    1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + 2f) + 0.3f;
            this.tail2.xRot = this.tail3.xRot =
                    1f * limbSwingAmount * (0.3f * degree) * MathHelper.cos(limbSwing * (speed) + 0f) + 0.2f;
            this.tail4.xRot = this.tail5.xRot = this.tail6.xRot =
                    -1f * limbSwingAmount * (0.2f * degree) * MathHelper.cos(limbSwing * (speed) + 2f) + 0f;
        }
    }
}