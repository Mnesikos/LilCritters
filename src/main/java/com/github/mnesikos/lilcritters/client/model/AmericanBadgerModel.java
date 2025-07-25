package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.AmericanBadgerEntity;
import com.github.mnesikos.lilcritters.entity.RaccoonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class AmericanBadgerModel extends ZawaBaseModel<AmericanBadgerEntity> {
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart ArmLeft;
    public ModelPart ArmRight;
    public ModelPart Hips;
    public ModelPart Tail1;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Tail2;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart Head;
    public ModelPart NeckLower;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart CheekLeft;
    public ModelPart CheekRight;
    public ModelPart EarRight;
    public ModelPart Mouth;
    public ModelPart TopSnout;
    public ModelPart Nose;
    public ModelPart ForearmLeft;
    public ModelPart HandLeft;
    public ModelPart ForearmRight;
    public ModelPart HandRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Chest);
        return parts;
    }

    public AmericanBadgerModel(ModelPart root) {
        this.Chest = root.getChild("Chest");
        this.ArmLeft = this.Chest.getChild("ArmLeft");
        this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
        this.HandLeft = this.ForearmLeft.getChild("HandLeft");

        this.ArmRight = this.Chest.getChild("ArmRight");
        this.ForearmRight = this.ArmRight.getChild("ForearmRight");
        this.HandRight = this.ForearmRight.getChild("HandRight");

        this.Neck = this.Chest.getChild("Neck");
        this.Head = this.Neck.getChild("Head");
        this.Mouth = this.Head.getChild("Mouth");

        this.CheekRight = this.Head.getChild("CheekRight");

        this.Snout = this.Head.getChild("Snout");
        this.TopSnout = this.Snout.getChild("TopSnout");
        this.Nose = this.TopSnout.getChild("Nose");

        this.EarLeft = this.Head.getChild("EarLeft");

        this.EarRight = this.Head.getChild("EarRight");

        this.CheekLeft = this.Head.getChild("CheekLeft");

        this.NeckLower = this.Neck.getChild("NeckLower");

        this.Body = this.Chest.getChild("Body");
        this.Hips = this.Body.getChild("Hips");
        this.Tail1 = this.Hips.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");

        this.ThighRight = this.Hips.getChild("ThighRight");
        this.LegRight = this.ThighRight.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");

        this.ThighLeft = this.Hips.getChild("ThighLeft");
        this.LegLeft = this.ThighLeft.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 17.7F, -3.0F, 0.03909537541112055F, 0.0F, 0.0F));
        PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(22, 0).addBox(-1.4F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(2.0F, 1.0F, -0.9F, 0.19547687289441354F, 0.0F, 0.0F));
        PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(22, 7).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.2F, 3.0F, 1.5F, -0.46914448828868976F, 0.0F, 0.27366763203903305F));
        PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(26, 13).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.3F, 2.2F, -1.9F, 0.27366763203903305F, 0.0781907508222411F, -0.19547687289441354F));

        PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(-1.6F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-2.0F, 1.0F, -0.9F, 0.19547687289441354F, 0.0F, 0.0F));
        PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(22, 7).mirror(true).addBox(-1.0F, -0.1F, -3.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 3.0F, 1.5F, -0.46914448828868976F, 0.0F, -0.27366763203903305F));
        PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(26, 13).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.3F, 2.2F, -1.9F, 0.27366763203903305F, -0.0781907508222411F, 0.19547687289441354F));

        PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 3.0F, 4.0F), PartPose.offset(0.0F, -0.9F, -2.5F));
        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 53).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -2.6F, 0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(21, 49).addBox(-1.0F, -1.0F, -1.7F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -2.0F, -0.27366763203903305F, 0.0F, 0.0F));

        PartDefinition CheekRight = Head.addOrReplaceChild("CheekRight", CubeListBuilder.create().texOffs(16, 49).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.5F, -1.1F, -1.9F, 0.0F, 0.0F, 0.3127630032889644F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(12, 41).addBox(-1.5F, -2.1F, -2.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, -1.8F, -0.23457224414434488F, 0.0F, 0.0F));
        PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 45).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -3.1F, -0.6F, 0.5864306020384839F, 0.0F, 0.0F));
        PartDefinition Nose = TopSnout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(22, 41).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F, -0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1563815016444822F, 0.0F, 0.0F));

        PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(20, 44).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.9F, -0.8F, 0.5F, -0.23457224414434488F, 0.8210028961170991F, -0.03909537541112055F));

        PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(20, 44).mirror(true).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-0.9F, -0.8F, 0.5F, -0.23457224414434488F, -0.8210028961170991F, 0.03909537541112055F));

        PartDefinition CheekLeft = Head.addOrReplaceChild("CheekLeft", CubeListBuilder.create().texOffs(16, 49).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.5F, -1.1F, -1.9F, 0.0F, 0.0F, -0.3127630032889644F));

        PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(12, 34).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 7.0F, 5.0F), PartPose.offset(0.0F, -3.2F, 1.0F));
        PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 24).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 5.0F, -0.3127630032889644F, 0.0F, 0.0F));
        PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, 4.0F, -0.3127630032889644F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.27366763203903305F, 0.0F, 0.0F));

        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(26, 17).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.6F, 1.5F, 2.0F, 0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(22, 26).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6255260065779288F, 0.0F, 0.0F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 32).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.9F, 1.3F, -0.46914448828868976F, 0.0F, 0.0F));

        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(26, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.6F, 1.5F, 2.0F, 0.1563815016444822F, 0.0F, 0.0F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(22, 26).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 5.0F, -2.0F, 0.6255260065779288F, 0.0F, 0.0F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 32).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.9F, 1.3F, -0.46914448828868976F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(AmericanBadgerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float)Math.PI)) + 0.156F;
        this.Head.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount;
        this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 0.156F;
        this.EarLeft.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.039F;
        this.EarRight.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.039F;
        this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.312F;
        this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount + 0.273F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 4.0f;
        float degree = 0.3f;
        if (entity.isInWater()) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
        }

        this.Chest.y = Mth.sin(limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 17.7F;
        this.Chest.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.039F;
        this.Chest.zRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount + 0.156F;
        this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.195F;
        this.ForearmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + -0.469F;
        this.HandLeft.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.273F;
        this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.195F;
        this.ForearmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + -0.469F;
        this.HandRight.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.273F;
        this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.156F;
        this.LegLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.625F;
//        this.LegLeft.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
        this.FootLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + -0.469F;
        this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.156F;
        this.LegRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.625F;
//        this.LegRight.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount + 0.625F;
        this.FootRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + -0.469F;
        this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount - 0.312F;
//        this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.4F * limbSwingAmount + 0.273F;
    }
}
