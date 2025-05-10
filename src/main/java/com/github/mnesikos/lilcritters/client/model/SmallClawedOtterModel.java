package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SmallClawedOtterEntity;
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
public class SmallClawedOtterModel extends ZawaBaseModel<SmallClawedOtterEntity> {
    public ModelPart body;
    public ModelPart neck;
    public ModelPart upperArmRight;
    public ModelPart upperArmLeft;
    public ModelPart bellyPoint;
    public ModelPart face;
    public ModelPart lowerChest;
    public ModelPart earRight;
    public ModelPart earLeft;
    public ModelPart snout;
    public ModelPart nose;
    public ModelPart chin;
    public ModelPart lowerArmRight;
    public ModelPart handRight;
    public ModelPart lowerArmLeft;
    public ModelPart handLeft;
    public ModelPart back;
    public ModelPart tail1;
    public ModelPart upperLegLeft;
    public ModelPart upperLegRight;
    public ModelPart tail2;
    public ModelPart tail3;
    public ModelPart lowerLegLeft;
    public ModelPart footLeft;
    public ModelPart lowerLegRight;
    public ModelPart footRight;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public SmallClawedOtterModel(ModelPart root) {
        this.body = root.getChild("body");
        this.lowerLegLeft = this.upperLegLeft.getChild("lowerLegLeft");
        this.bellyPoint = this.body.getChild("bellyPoint");
        this.upperLegLeft = this.back.getChild("upperLegLeft");
        this.lowerLegRight = this.upperLegRight.getChild("lowerLegRight");
        this.handLeft = this.lowerArmLeft.getChild("handLeft");
        this.upperArmLeft = this.body.getChild("upperArmLeft");
        this.nose = this.snout.getChild("nose");
        this.footLeft = this.lowerLegLeft.getChild("footLeft");
        this.tail1 = this.back.getChild("tail1");
        this.face = this.neck.getChild("face");
        this.snout = this.face.getChild("snout");
        this.lowerArmRight = this.upperArmRight.getChild("lowerArmRight");
        this.lowerArmLeft = this.upperArmLeft.getChild("lowerArmLeft");
        this.upperLegRight = this.back.getChild("upperLegRight");
        this.back = this.bellyPoint.getChild("back");
        this.tail2 = this.tail1.getChild("tail2");
        this.lowerChest = this.neck.getChild("lowerChest");
        this.neck = this.body.getChild("neck");
        this.handRight = this.lowerArmRight.getChild("handRight");
        this.upperArmRight = this.body.getChild("upperArmRight");
        this.chin = this.snout.getChild("chin");
        this.earRight = this.face.getChild("earRight");
        this.tail3 = this.tail2.getChild("tail3");
        this.earLeft = this.face.getChild("earLeft");
        this.footRight = this.lowerLegRight.getChild("footRight");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("lowerLegLeft", CubeListBuilder.create().texOffs(42, 16).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.9424777960769379F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("bellyPoint", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0, 0, 0), PartPose.offset(0.0F, 2.5F, 4.0F));
        partDefinition.addOrReplaceChild("upperLegLeft", CubeListBuilder.create().texOffs(33, 18).addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3), PartPose.offsetAndRotation(1.7F, 2.2F, 2.5F, 0.06981317007977318F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("lowerLegRight", CubeListBuilder.create().texOffs(42, 16).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.9424777960769379F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("handLeft", CubeListBuilder.create().texOffs(38, 7).addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3), PartPose.offsetAndRotation(-0.01F, 2.8F, -0.6F, 0.5235987755982988F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("upperArmLeft", CubeListBuilder.create().texOffs(39, 0).addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3), PartPose.offsetAndRotation(2.1F, -1.0F, -2.0F, 0.03490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, -0.5F, -1.2F, 0.22689280275926282F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("footLeft", CubeListBuilder.create().texOffs(41, 21).addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4), PartPose.offsetAndRotation(-0.01F, 2.6F, 1.1F, -0.7330382858376184F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.5F, 0.0F, 4, 3, 4), PartPose.offsetAndRotation(0.0F, 1.7F, 4.3F, -0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -2.5F, -4.0F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, 0.2F, -3.0F, 0.20943951023931953F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(43, 11).addBox(-1.5F, 0.0F, -3.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, -1.2F, -2.7F, 0.017453292519943295F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("lowerArmRight", CubeListBuilder.create().texOffs(51, 3).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 4.0F, 1.4F, -0.6981317007977318F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("lowerArmLeft", CubeListBuilder.create().texOffs(51, 3).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 4.0F, 1.4F, -0.6981317007977318F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("upperLegRight", CubeListBuilder.create().texOffs(33, 18).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3), PartPose.offsetAndRotation(-1.7F, 2.2F, 2.5F, 0.06981317007977318F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("back", CubeListBuilder.create().texOffs(23, 8).addBox(-2.5F, 0.0F, 0.0F, 5, 5, 5), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(16, 23).addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.41887902047863906F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("lowerChest", CubeListBuilder.create().texOffs(12, 16).addBox(-1.5F, -2.0F, -5.0F, 3, 2, 5), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.3490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(20, 0).addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4), PartPose.offsetAndRotation(0.0F, -0.5F, -2.0F, -0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("handRight", CubeListBuilder.create().texOffs(38, 7).mirror(true).addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3), PartPose.offsetAndRotation(0.01F, 2.8F, -0.6F, 0.5235987755982988F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("upperArmRight", CubeListBuilder.create().texOffs(39, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3), PartPose.offsetAndRotation(-2.1F, -1.0F, -2.0F, 0.03490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("chin", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, 1.8F, -1.2F, -0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("earRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(-1.5F, -1.8F, -1.8F, 0.0F, 0.3490658503988659F, 0.41887902047863906F));
        partDefinition.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(26, 23).addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.20943951023931953F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -4.0F, 6, 5, 8), PartPose.offsetAndRotation(0.0F, 20.1F, -1.0F, 0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("earLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(1.5F, -1.8F, -1.8F, 0.0F, -0.3490658503988659F, -0.41887902047863906F));
        partDefinition.addOrReplaceChild("footRight", CubeListBuilder.create().texOffs(41, 21).mirror(true).addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4), PartPose.offsetAndRotation(0.01F, 2.6F, 1.1F, -0.7330382858376184F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(SmallClawedOtterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.face.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
        this.face.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.28F;
        this.earLeft.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.4F;
        this.earRight.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + 0.4F;
        this.tail1.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.42F;
        this.tail2.xRot = Mth.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + 0.42F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed, degree;

        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 2.0F;
            degree = 0.9F;
            this.body.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.04F;
            this.back.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F + -0.2F;
            this.neck.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.face.xRot = Mth.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.tail1.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail2.xRot = Mth.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail3.xRot = Mth.cos(-3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
//            this.body.y = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.4F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperArmLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerArmLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.4F;
            this.handLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 2.4F;
//            this.upperArmLeft.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperArmRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerArmRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.4F;
            this.handRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 2.4F;
//            this.upperArmRight.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperLegLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerLegLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.footLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 1.2F;
//            this.upperLegLeft.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.upperLegRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 1.0F;
            this.lowerLegRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.footRight.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 1.2F;
//            this.upperLegRight.z = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F + -0.1F;

        } else {
            speed = ((SmallClawedOtterEntity) entity).isBaby() ? 2.0F : 4.0F;
            degree = ((SmallClawedOtterEntity) entity).isBaby() ? 0.4F : 0.5F;
            this.upperArmLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.lowerArmLeft.xRot = Mth.cos(0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.handLeft.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.4F;
            this.upperArmRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.lowerArmRight.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.handRight.xRot = Mth.cos(2.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.4F;
            this.upperLegLeft.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.3F;
            this.lowerLegLeft.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.96F;
            this.footLeft.xRot = Mth.cos(-1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.82F;
            this.upperLegRight.xRot = Mth.cos(-0.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.3F;
            this.lowerLegRight.xRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.6F) * limbSwingAmount * 0.5F + 0.96F;
            this.footRight.xRot = Mth.cos(-2.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.82F;
            this.body.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.14F;
            this.back.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.4F) * limbSwingAmount * 0.5F + -0.4F;
            this.neck.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + -0.3F;
            this.face.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.4F) * limbSwingAmount * 0.5F + -0.2F;
            this.tail2.xRot = Mth.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.8F) * limbSwingAmount * 0.5F + 0.1F;
            this.tail3.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.2F;
        }
    }
}
