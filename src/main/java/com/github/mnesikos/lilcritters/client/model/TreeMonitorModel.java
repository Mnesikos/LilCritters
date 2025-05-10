package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TreeMonitorEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class TreeMonitorModel extends ZawaBaseModel<TreeMonitorEntity> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart UpperArmLeft;
    public ModelPart Hips;
    public ModelPart UpperArmRight;
    public ModelPart Head;
    public ModelPart NeckLower1;
    public ModelPart Snout;
    public ModelPart Mouth;
    public ModelPart Nose;
    public ModelPart NeckLower1_1;
    public ModelPart ArmLeft;
    public ModelPart HandLeft;
    public ModelPart FingerLeft1;
    public ModelPart FingerLeft2;
    public ModelPart ThighLeft;
    public ModelPart Tail1;
    public ModelPart ThighRight;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart ToeLeft1;
    public ModelPart ToeLeft2;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart ToeRight1;
    public ModelPart ToeRight2;
    public ModelPart ArmRight;
    public ModelPart HandRight;
    public ModelPart FingerRight1;
    public ModelPart FingerRight2;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public TreeMonitorModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Hips = this.Body.getChild("Hips");
        this.ThighRight = this.Hips.getChild("ThighRight");
        this.LegRight = this.ThighRight.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");
        this.ToeRight1 = this.FootRight.getChild("ToeRight1");

        this.ToeRight2 = this.FootRight.getChild("ToeRight2");

        this.Tail1 = this.Hips.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.Tail3 = this.Tail2.getChild("Tail3");

        this.ThighLeft = this.Hips.getChild("ThighLeft");
        this.LegLeft = this.ThighLeft.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
        this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

        this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

        this.Neck = this.Body.getChild("Neck");
        this.NeckLower1 = this.Neck.getChild("NeckLower1");
        this.NeckLower1_1 = this.NeckLower1.getChild("NeckLower1_1");

        this.Head = this.Neck.getChild("Head");
        this.Snout = this.Head.getChild("Snout");
        this.Nose = this.Snout.getChild("Nose");

        this.Mouth = this.Snout.getChild("Mouth");

        this.UpperArmRight = this.Body.getChild("UpperArmRight");
        this.ArmRight = this.UpperArmRight.getChild("ArmRight");
        this.HandRight = this.ArmRight.getChild("HandRight");
        this.FingerRight1 = this.HandRight.getChild("FingerRight1");

        this.FingerRight2 = this.HandRight.getChild("FingerRight2");

        this.UpperArmLeft = this.Body.getChild("UpperArmLeft");
        this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
        this.HandLeft = this.ArmLeft.getChild("HandLeft");
        this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

        this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -4.5F, 5, 4, 10), PartPose.offsetAndRotation(0.0F, 20.0F, -2.0F, -0.017453292519943295F, 0.0F, 0.0F));
        PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, 0.0F, 0.0F, 4, 4, 5), PartPose.offsetAndRotation(0.0F, -2.0F, 5.5F, -0.10471975511965977F, 0.0F, 0.0F));
        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(18, 18).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2, 2, 2), PartPose.offsetAndRotation(-2.0F, 1.1F, 1.0F, 0.03490658503988659F, 0.6108652381980153F, 0.8726646259971648F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(26, 19).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1, 3, 1), PartPose.offsetAndRotation(0.5F, 2.0F, -0.19F, 0.8726646259971648F, 0.0F, -0.2617993877991494F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(31, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(0.5F, 2.5F, 0.0F, -0.22689280275926282F, 0.0F, -0.3490658503988659F));
        PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(29, 14).addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));

        PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(29, 14).addBox(0.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));

        PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -1.6F, 0.0F, 3, 3, 6), PartPose.offsetAndRotation(0.0F, 2.0F, 4.7F, -0.06981317007977318F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(18, 23).addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6), PartPose.offsetAndRotation(0.0F, 0.0F, 5.7F, 0.06981317007977318F, 0.0F, 0.0F));
        PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(28, 19).addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.0F, 0.0F, 5.7F, 0.08726646259971647F, 0.0F, 0.0F));

        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(18, 18).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2, 2, 2), PartPose.offsetAndRotation(2.0F, 1.1F, 1.0F, 0.03490658503988659F, -0.6108652381980153F, -0.8726646259971648F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(26, 19).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.19F, 0.8726646259971648F, 0.0F, 0.2617993877991494F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(31, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(-0.5F, 2.5F, 0.0F, -0.22689280275926282F, 0.0F, 0.3490658503988659F));
        PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(29, 14).addBox(0.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));

        PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(29, 14).addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));

        PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4), PartPose.offsetAndRotation(0.0F, -0.3F, -3.5F, -0.20943951023931953F, 0.0F, 0.0F));
        PartDefinition NeckLower1 = Neck.addOrReplaceChild("NeckLower1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4), PartPose.offset(0.0F, 2.2F, 0.5F));
        PartDefinition NeckLower1_1 = NeckLower1.addOrReplaceChild("NeckLower1_1", CubeListBuilder.create().texOffs(40, 5).addBox(-1.0F, -1.0F, -3.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.2792526803190927F, 0.0F, 0.0F));

        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 7).addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, -0.2F, -3.3F, 0.2792526803190927F, 0.0F, 0.0F));
        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 0.1F, -3.2F, 0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, -0.5F, -2.7F, 0.3490658503988659F, 0.0F, 0.0F));

        PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(44, 9).addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.06981317007977318F, 0.0F, 0.0F));

        PartDefinition UpperArmRight = Body.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(0.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(-2.5F, -0.5F, -4.0F, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F));
        PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(21, 14).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1, 3, 1), PartPose.offsetAndRotation(0.5F, 2.0F, 1.21F, -0.3490658503988659F, 0.0F, -0.6981317007977318F));
        PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(0.5F, 2.5F, -0.6F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));
        PartDefinition FingerRight1 = HandRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

        PartDefinition FingerRight2 = HandRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

        PartDefinition UpperArmLeft = Body.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(13, 14).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(2.5F, -0.5F, -4.0F, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F));
        PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(21, 14).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1), PartPose.offsetAndRotation(-0.5F, 2.0F, 1.21F, -0.3490658503988659F, 0.0F, 0.6981317007977318F));
        PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(25, 16).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(-0.5F, 2.5F, -0.6F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));
        PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(25, 14).addBox(0.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));

        PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(TreeMonitorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.28F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.07F;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.21F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.28F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 4.0f;
        float degree = 0.7f;
        this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.26F;
        this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
        this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
        this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.03F;
        this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.87F;
        this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.23F;
        this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.26F;
        this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
        this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
        this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.03F;
        this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.87F;
        this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.23F;
        this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
    }
}
