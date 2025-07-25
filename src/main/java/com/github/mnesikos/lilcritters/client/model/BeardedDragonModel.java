package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BeardedDragonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class BeardedDragonModel extends ZawaBaseModel<BeardedDragonEntity> {
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart UpperArmRight;
    public ModelPart UpperArmLeft;
    public ModelPart Hips;
    public ModelPart Tail1;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart ToeLeft1;
    public ModelPart ToeLeft2;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart ToeRight2;
    public ModelPart ToeRight1;
    public ModelPart Head;
    public ModelPart Forehead;
    public ModelPart HeadSpikeRight;
    public ModelPart HeadSpikeLeft;
    public ModelPart HeadUnder;
    public ModelPart EyeRight;
    public ModelPart EyeLeft;
    public ModelPart Snout;
    public ModelPart SnoutRight;
    public ModelPart SnoutLeft;
    public ModelPart Mouth;
    public ModelPart ArmRight;
    public ModelPart HandRight;
    public ModelPart FingerRight2;
    public ModelPart FingerRight1;
    public ModelPart ArmLeft;
    public ModelPart HandLeft;
    public ModelPart FingerLeft1;
    public ModelPart FingerLeft2;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Chest);
        return parts;
    }

    public BeardedDragonModel(ModelPart root) {
        this.Chest = root.getChild("Chest");
        this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
        this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
        this.HandLeft = this.ArmLeft.getChild("HandLeft");
        this.FingerLeft2 = this.HandLeft.getChild("FingerLeft2");

        this.FingerLeft1 = this.HandLeft.getChild("FingerLeft1");

        this.UpperArmRight = this.Chest.getChild("UpperArmRight");
        this.ArmRight = this.UpperArmRight.getChild("ArmRight");
        this.HandRight = this.ArmRight.getChild("HandRight");
        this.FingerRight1 = this.HandRight.getChild("FingerRight1");

        this.FingerRight2 = this.HandRight.getChild("FingerRight2");

        this.Neck = this.Chest.getChild("Neck");
        this.Head = this.Neck.getChild("Head");
        this.Forehead = this.Head.getChild("Forehead");
        this.EyeRight = this.Forehead.getChild("EyeRight");

        this.Snout = this.Forehead.getChild("Snout");
        this.SnoutRight = this.Snout.getChild("SnoutRight");

        this.SnoutLeft = this.Snout.getChild("SnoutLeft");

        this.EyeLeft = this.Forehead.getChild("EyeLeft");

        this.HeadUnder = this.Head.getChild("HeadUnder");
        this.Mouth = this.HeadUnder.getChild("Mouth");

        this.HeadSpikeLeft = this.Head.getChild("HeadSpikeLeft");

        this.HeadSpikeRight = this.Head.getChild("HeadSpikeRight");

        this.Body = this.Chest.getChild("Body");
        this.Hips = this.Body.getChild("Hips");
        this.Tail1 = this.Hips.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.Tail3 = this.Tail2.getChild("Tail3");

        this.ThighLeft = this.Hips.getChild("ThighLeft");
        this.LegLeft = this.ThighLeft.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
        this.ToeLeft1 = this.FootLeft.getChild("ToeLeft1");

        this.ToeLeft2 = this.FootLeft.getChild("ToeLeft2");

        this.ThighRight = this.Hips.getChild("ThighRight");
        this.LegRight = this.ThighRight.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");
        this.ToeRight2 = this.FootRight.getChild("ToeRight2");

        this.ToeRight1 = this.FootRight.getChild("ToeRight1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -2.0F, -1.5F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 20.1F, -4.0F, -0.08726646259971647F, 0.0F, 0.0F));
        PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(0, 23).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.5F, -0.5F, -1.3F, 0.3490658503988659F, 0.20943951023931953F, -0.8726646259971648F));
        PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(8, 23).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 2.0F, 1.21F, -0.5235987755982988F, 0.0F, 0.6981317007977318F));
        PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 2.5F, -0.6F, 0.19198621771937624F, 0.0F, 0.17453292519943295F));

        PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(0, 23).mirror(true).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.5F, -0.5F, -1.3F, 0.3490658503988659F, -0.20943951023931953F, 0.8726646259971648F));
        PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(8, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 2.0F, 1.21F, -0.5235987755982988F, 0.0F, -0.6981317007977318F));
        PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.5F, -0.01F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 2.5F, -0.6F, 0.19198621771937624F, 0.0F, -0.17453292519943295F));

        PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.2F, 0.13665927909957545F, 0.0F, 0.0F));
        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.04F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.7F, 0.2792526803190927F, 0.0F, 0.0F));
        PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(11, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.2F, -0.05F, -0.15707963267948966F, 0.0F, 0.0F));
        PartDefinition EyeRight = Forehead.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(19, 0).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.6F, 0.52F, -2.8F, 0.13962634015954636F, -0.20943951023931953F, 0.06981317007977318F));

        PartDefinition Snout = Forehead.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(11, 3).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, -2.0F, 0.3490658503988659F, 0.0F, 0.0F));
        PartDefinition SnoutRight = Snout.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(20, 2).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.4F, 0.12F, -2.8F, 0.0F, 1.2915436464758039F, 0.0F));

        PartDefinition SnoutLeft = Snout.addOrReplaceChild("SnoutLeft", CubeListBuilder.create().texOffs(20, 2).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.4F, 0.12F, -2.8F, 0.0F, -1.2915436464758039F, 0.0F));

        PartDefinition EyeLeft = Forehead.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.6F, 0.52F, -2.8F, 0.13962634015954636F, 0.20943951023931953F, -0.06981317007977318F));

        PartDefinition HeadUnder = Head.addOrReplaceChild("HeadUnder", CubeListBuilder.create().texOffs(0, 5).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.7F, -0.6F, -0.22689280275926282F, 0.0F, 0.0F));
        PartDefinition Mouth = HeadUnder.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(9, 10).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -1.9F, -0.03490658503988659F, 0.0F, 0.0F));

        PartDefinition HeadSpikeLeft = Head.addOrReplaceChild("HeadSpikeLeft", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.9F, 0.5F, -2.5F, 0.0F, 0.4886921905584123F, 0.0F));

        PartDefinition HeadSpikeRight = Head.addOrReplaceChild("HeadSpikeRight", CubeListBuilder.create().texOffs(26, 0).mirror(true).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, 0.5F, -2.5F, 0.0F, -0.4886921905584123F, 0.0F));

        PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(13, 9).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 1.0F, 0.0911061832922575F, 0.0F, 0.0F));
        PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(16, 19).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.18203784630933073F, 0.0F, 0.0F));
        PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, -0.27314402127920984F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(31, 7).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.2275909337942703F, 0.0F, 0.0F));
        PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(25, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 5.0F, 0.2275909337942703F, 0.0F, 0.0F));

        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.7F, 0.4F, 1.0F, 0.03490658503988659F, -0.2792526803190927F, -0.6981317007977318F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 26).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 2.0F, -0.19F, 1.0122909661567112F, 0.0F, 0.2617993877991494F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(6, 27).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.5F, 2.5F, 0.0F, -0.6283185307179586F, 0.0F, 0.3490658503988659F));

        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.7F, 0.4F, 1.0F, 0.03490658503988659F, 0.2792526803190927F, 0.6981317007977318F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 26).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 2.0F, -0.19F, 1.0122909661567112F, 0.0F, -0.2617993877991494F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(6, 27).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.5F, 2.5F, 0.0F, -0.6283185307179586F, 0.0F, -0.3490658503988659F));

        PartDefinition ToeRight2 = FootRight.addOrReplaceChild("ToeRight2", CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));
        PartDefinition FingerRight1 = HandRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));
        PartDefinition FingerLeft2 = HandLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(4, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, 0.0F, 0.3490658503988659F, 0.0F));
        PartDefinition FingerLeft1 = HandLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));
        PartDefinition ToeRight1 = FootRight.addOrReplaceChild("ToeRight1", CubeListBuilder.create().texOffs(8, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));
        PartDefinition ToeLeft1 = FootLeft.addOrReplaceChild("ToeLeft1", CubeListBuilder.create().texOffs(8, 30).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.05235987755982988F, -0.3490658503988659F, 0.0F));
        PartDefinition ToeLeft2 = FootLeft.addOrReplaceChild("ToeLeft2", CubeListBuilder.create().texOffs(12, 30).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.5F, -0.05235987755982988F, 0.3490658503988659F, 0.0F));
        PartDefinition FingerRight2 = HandRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(4, 30).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, 0.0F, 0.5F, 0.0F, -0.3490658503988659F, 0.0F));

        return LayerDefinition.create(meshDefinition, 48, 32);
    }

    @Override
    public void setupAnim(BeardedDragonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
        this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.273F;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.136F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.28F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 5.0f;
        float degree = 0.7f;
        this.UpperArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.349F;
        this.ArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.523F;
        this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.191F;
        this.ThighLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.034F;
        this.LegLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 1.012F;
        this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.628F;
        this.UpperArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.349F;
        this.ArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.523F;
        this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.191F;
        this.ThighRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.034F;
        this.LegRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 1.012F;
        this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.628F;
        this.Body.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Hips.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail1.yRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail2.yRot = Mth.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail3.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
    }
}
