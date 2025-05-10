package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TreeSquirrelEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import net.minecraft.client.model.geom.ModelPart;

@OnlyIn(Dist.CLIENT)
public class TreeSquirrelModel extends ZawaBaseModel<TreeSquirrelEntity> {
    protected ModelPart body;
    protected ModelPart neck;
    protected ModelPart leftBicep;
    protected ModelPart rightBicep;
    protected ModelPart butt;
    protected ModelPart head;
    protected ModelPart lowerChest;
    protected ModelPart leftEar;
    protected ModelPart rightEar;
    protected ModelPart snout;
    protected ModelPart leftTuft;
    protected ModelPart rightTuft;
    protected ModelPart nose;
    protected ModelPart chin;
    protected ModelPart leftForearm;
    protected ModelPart leftHand;
    protected ModelPart rightForearm;
    protected ModelPart rightHand;
    protected ModelPart leftThigh;
    protected ModelPart rightThigh;
    protected ModelPart tail1;
    protected ModelPart leftLeg;
    protected ModelPart leftFoot;
    protected ModelPart rightLeg;
    protected ModelPart rightFoot;
    protected ModelPart tail2;
    protected ModelPart tail3;
    protected ModelPart tail4;
    protected ModelPart tail5;
    protected ModelPart tail6;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public TreeSquirrelModel(ModelPart root) {
        this.body = root.getChild("body");
        this.leftThigh = this.butt.getChild("leftThigh");
        this.tail4 = this.tail3.getChild("tail4");
        this.chin = this.snout.getChild("chin");
        this.rightFoot = this.rightLeg.getChild("rightFoot");
        this.rightLeg = this.rightThigh.getChild("rightLeg");
        this.leftLeg = this.leftThigh.getChild("leftLeg");
        this.head = this.neck.getChild("head");
        this.snout = this.head.getChild("snout");
        this.leftFoot = this.leftLeg.getChild("leftFoot");
        this.rightBicep = this.body.getChild("rightBicep");
        this.rightTuft = this.rightEar.getChild("rightTuft");
        this.tail6 = this.tail5.getChild("tail6");
        this.leftHand = this.leftForearm.getChild("leftHand");
        this.tail1 = this.butt.getChild("tail1");
        this.rightEar = this.head.getChild("rightEar");
        this.rightHand = this.rightForearm.getChild("rightHand");
        this.tail5 = this.tail4.getChild("tail5");
        this.neck = this.body.getChild("neck");
        this.tail2 = this.tail1.getChild("tail2");
        this.leftEar = this.head.getChild("leftEar");
        this.leftTuft = this.leftEar.getChild("leftTuft");
        this.leftBicep = this.body.getChild("leftBicep");
        this.lowerChest = this.neck.getChild("lowerChest");
        this.leftForearm = this.leftBicep.getChild("leftForearm");
        this.nose = this.snout.getChild("nose");
        this.butt = this.body.getChild("butt");
        this.tail3 = this.tail2.getChild("tail3");
        this.rightForearm = this.rightBicep.getChild("rightForearm");
        this.rightThigh = this.butt.getChild("rightThigh");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("leftThigh", CubeListBuilder.create().texOffs(7, 47).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(2.5F, 2.6F, 5.8F, -0.06981317007977318F, -0.13962634015954636F, 0.0F));
        partDefinition.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(52, 10).addBox(-3.0F, -2.0F, 0.0F, 6, 4, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, 0.5585053606381855F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("chin", CubeListBuilder.create().texOffs(10, 30).addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, 2.0F, -0.4F, -0.3490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(29, 47).mirror(true).addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4), PartPose.offsetAndRotation(-0.01F, 5.0F, 1.5F, -0.7330382858376184F, 0.06981317007977318F, -0.03490658503988659F));
        partDefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(21, 47).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, 0.9424777960769379F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(21, 47).addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, 0.9424777960769379F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5), PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, 0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, -1.1F, -3.9F, 0.22689280275926282F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(29, 47).addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4), PartPose.offsetAndRotation(-0.01F, 5.0F, 1.5F, -0.7330382858376184F, -0.06981317007977318F, 0.03490658503988659F));
        partDefinition.addOrReplaceChild("rightBicep", CubeListBuilder.create().texOffs(9, 37).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, 0.20943951023931953F, -0.06981317007977318F, 0.06981317007977318F));
        partDefinition.addOrReplaceChild("rightTuft", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -2.0F, -0.5F, 0, 2, 1), PartPose.offset(0.0F, -1.7F, 0.0F));
        partDefinition.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, 0.1F, 2.0F, 0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(29, 37).addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 3.8F, -0.5F, 0.41887902047863906F, 0.06981317007977318F, 0.03490658503988659F));
        partDefinition.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(52, 38).addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4), PartPose.offsetAndRotation(0.0F, 2.1F, 6.2F, 1.117010721276371F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("rightEar", CubeListBuilder.create().texOffs(14, 0).mirror(true).addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(-1.5F, -1.4F, -1.5F, 0.03490658503988659F, -0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(29, 37).mirror(true).addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 3.8F, -0.5F, 0.41887902047863906F, -0.06981317007977318F, -0.03490658503988659F));
        partDefinition.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(52, 4).addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.20943951023931953F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.6283185307179586F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(52, 29).addBox(-3.0F, -2.5F, 0.0F, 6, 5, 4), PartPose.offsetAndRotation(0.0F, 0.2F, 3.0F, 0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 0).addBox(-3.0F, -3.5F, -4.0F, 6, 7, 8), PartPose.offsetAndRotation(0.0F, 19.7F, -2.5F, 0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("leftEar", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(1.5F, -1.4F, -1.5F, 0.03490658503988659F, 0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("leftTuft", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(0.0F, -2.0F, -0.5F, 0, 2, 1), PartPose.offset(0.0F, -1.7F, 0.0F));
        partDefinition.addOrReplaceChild("leftBicep", CubeListBuilder.create().texOffs(9, 37).addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3), PartPose.offsetAndRotation(2.0F, -1.0F, -2.0F, 0.20943951023931953F, 0.06981317007977318F, -0.06981317007977318F));
        partDefinition.addOrReplaceChild("lowerChest", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.0F, -5.0F, 4, 2, 6), PartPose.offsetAndRotation(0.0F, 4.0F, 0.5F, -0.4886921905584123F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("leftForearm", CubeListBuilder.create().texOffs(21, 37).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 5.0F, 1.3F, -0.9075712110370513F, -0.06981317007977318F, 0.06981317007977318F));
        partDefinition.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, 0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("butt", CubeListBuilder.create().texOffs(21, 15).addBox(-3.5F, 0.0F, 0.0F, 7, 7, 8), PartPose.offsetAndRotation(0.0F, -3.5F, 4.0F, -0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(52, 18).addBox(-3.5F, -2.5F, 0.0F, 7, 5, 6), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("rightForearm", CubeListBuilder.create().texOffs(21, 37).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 5.0F, 1.3F, -0.9075712110370513F, 0.06981317007977318F, -0.06981317007977318F));
        partDefinition.addOrReplaceChild("rightThigh", CubeListBuilder.create().texOffs(7, 47).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(-2.5F, 2.6F, 5.8F, -0.06981317007977318F, 0.13962634015954636F, 0.0F));

        return LayerDefinition.create(meshDefinition, 96, 64);
    }

    @Override
    public void setupAnim(TreeSquirrelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float globalSpeed = 1f;
        float globalDegree = 1.2f;
        if (((TreeSquirrelEntity) entity).isBaby()) {
            globalSpeed = 0.7f;
            globalDegree = 0.8f;
        }

        this.tail1.xRot = 0.24f * limbSwingAmount * (0.08f * globalDegree) * Mth.cos(limbSwing * (0.08f * globalSpeed) + 12.0f) + 1.0f;
        this.tail4.xRot = 0.24f * limbSwingAmount * (0.16f * globalDegree) * Mth.cos(limbSwing * (0.08f * globalSpeed) + 6.0f) + 0.52f;
        this.neck.xRot = 0.5f * limbSwingAmount * (0.16f * globalDegree) * Mth.cos(limbSwing * (0.06f * globalSpeed) + 14.0f) + -0.6f;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

            this.rightBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 0.7f) + -0.3f;
            this.leftBicep.xRot = -1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 0.7f) + -0.3f;
            this.rightForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 2f) + -1f;
            this.leftForearm.xRot = -1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 2f) + -1f;
            this.rightHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (0.3f * speed) + -1f) + 0.8f;
            this.leftHand.xRot = 1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (0.3f * speed) + -1f) + 0.8f;

            this.rightThigh.xRot = 1f * limbSwingAmount * (0.5f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 0f) + 0f;
            this.leftThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 0f) + 0f;
            this.rightLeg.xRot = -1f * limbSwingAmount * (0.33f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 1.5f) + 1.16f;
            this.leftLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 1.5f) + 1.16f;
            this.rightFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (0.3f * speed) + -0.6f) + -0.2f;
            this.leftFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (0.3f * speed) + -0.6f) + -0.2f;

            this.neck.xRot = -0.67f;
            this.head.xRot = 0.3f;
            this.tail1.yRot = 1f * limbSwingAmount * (0.02f * degree) * Mth.cos(limbSwing * (0.3f * speed) + 0f);
            this.tail1.xRot = 0f;
            this.tail2.xRot = 0.2f;
            this.tail3.xRot = this.tail4.xRot = this.tail5.xRot = this.tail6.xRot = 0.1f;

        } else {
//            this.body.y = (float) -Math.abs((Math.sin(limbSwing * (0.5f * speed)) * limbSwingAmount * (6.0f * height))) + 20.5f;
            this.body.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (speed) + 0f) + 0.1f;
            this.butt.xRot = 1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + 1.3f) + -0.5f;

            this.rightBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (speed) + 0.7f) + -0.3f;
            this.leftBicep.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (speed) + 0.7f) + -0.3f;
            this.rightForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (speed) + 2f) + -1f;
            this.leftForearm.xRot = 1f * limbSwingAmount * (0.4f * degree) * Mth.cos(limbSwing * (speed) + 2f) + -1f;
            this.rightHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + -1f) + 0.8f;
            this.leftHand.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + -1f) + 0.8f;

            this.rightThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * Mth.cos(limbSwing * (speed) + 0f) + 0f;
            this.leftThigh.xRot = -1f * limbSwingAmount * (0.5f * degree) * Mth.cos(limbSwing * (speed) + 0f) + 0f;
            this.rightLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * Mth.cos(limbSwing * (speed) + 1.5f) + 1.16f;
            this.leftLeg.xRot = 1f * limbSwingAmount * (0.33f * degree) * Mth.cos(limbSwing * (speed) + 1.5f) + 1.16f;
            this.rightFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + -0.6f) + -0.2f;
            this.leftFoot.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + -0.6f) + -0.2f;

            this.neck.xRot = -1f * limbSwingAmount * (0.3f * degree) * Mth.cos(limbSwing * (speed) + 0f) + -0.5f;
            this.head.xRot = -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + 0f) + 0.3f;
            this.tail1.xRot =
                    1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + 2f) + 0.3f;
            this.tail2.xRot = this.tail3.xRot =
                    1f * limbSwingAmount * (0.3f * degree) * Mth.cos(limbSwing * (speed) + 0f) + 0.2f;
            this.tail4.xRot = this.tail5.xRot = this.tail6.xRot =
                    -1f * limbSwingAmount * (0.2f * degree) * Mth.cos(limbSwing * (speed) + 2f) + 0f;
        }
    }
}