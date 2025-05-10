package com.github.mnesikos.lilcritters.client.model;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.world.entity.JumpingEntity;

public class SmallFrogModel<E extends Entity> extends ZawaFrogBaseModel<E> {
    public ModelPart Hips;
    public ModelPart Head;
    public ModelPart ArmLeft;
    public ModelPart ArmRight;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart Forehead;
    public ModelPart Snout;
    public ModelPart HeadUnder;
    public ModelPart EyeLeft;
    public ModelPart EyeRight;
    public ModelPart SnoutLeft;
    public ModelPart SnoutRight;
    public ModelPart Mouth;
    public ModelPart ForearmLeft;
    public ModelPart HandLeft;
    public ModelPart ForearmRight;
    public ModelPart HandRight;
    private float jumpRotation;

    public SmallFrogModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.ArmRight = this.Body.getChild("ArmRight");
        this.ForearmRight = this.ArmRight.getChild("ForearmRight");
        this.HandRight = this.ForearmRight.getChild("HandRight");

        this.Head = this.Body.getChild("Head");
        this.Forehead = this.Head.getChild("Forehead");
        this.EyeRight = this.Forehead.getChild("EyeRight");

        this.EyeLeft = this.Forehead.getChild("EyeLeft");

        this.Snout = this.Head.getChild("Snout");
        this.SnoutRight = this.Snout.getChild("SnoutRight");

        this.SnoutLeft = this.Snout.getChild("SnoutLeft");

        this.HeadUnder = this.Head.getChild("HeadUnder");
        this.Mouth = this.HeadUnder.getChild("Mouth");

        this.ArmLeft = this.Body.getChild("ArmLeft");
        this.ForearmLeft = this.ArmLeft.getChild("ForearmLeft");
        this.HandLeft = this.ForearmLeft.getChild("HandLeft");

        this.Hips = this.Body.getChild("Hips");
        this.ThighLeft = this.Hips.getChild("ThighLeft");
        this.LegLeft = this.ThighLeft.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");

        this.ThighRight = this.Hips.getChild("ThighRight");
        this.LegRight = this.ThighRight.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.2F, 0.2F, 0.0F)), PartPose.offsetAndRotation(0.0F, 22.5F, 1.0F, -0.40142572795869574F, 0.0F, 0.0F));
        PartDefinition ArmRight = Body.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 11).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, 0.3F, -2.0F, 1.3613568165555772F, -0.6457718232379019F, 0.0F));
        PartDefinition ForearmRight = ArmRight.addOrReplaceChild("ForearmRight", CubeListBuilder.create().texOffs(4, 11).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 1.8F, -0.5F, 1.1344640137963142F, 0.08726646259971647F, -0.22689280275926282F));
        PartDefinition HandRight = ForearmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(8, 11).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.7F, -0.593411945678072F, 0.0F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.7F, 0.5585053606381855F, 0.0F, 0.0F));
        PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(10, 5).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.05F, -0.15707963267948966F, 0.0F, 0.0F));
        PartDefinition EyeRight = Forehead.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(9, 0).mirror(true).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.3F, -2.0F, -0.17453292519943295F, -0.5585053606381855F, 0.0F));

        PartDefinition EyeLeft = Forehead.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.9F, 0.3F, -2.0F, -0.17453292519943295F, 0.5585053606381855F, 0.0F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition SnoutRight = Snout.addOrReplaceChild("SnoutRight", CubeListBuilder.create().texOffs(6, 8).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.02F, -0.8F, 0.0F, -0.41887902047863906F, 0.0F));

        PartDefinition SnoutLeft = Snout.addOrReplaceChild("SnoutLeft", CubeListBuilder.create().texOffs(6, 8).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.02F, -0.8F, 0.0F, 0.41887902047863906F, 0.0F));

        PartDefinition HeadUnder = Head.addOrReplaceChild("HeadUnder", CubeListBuilder.create().texOffs(8, 8).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.57F, -0.22689280275926282F, 0.0F, 0.0F));
        PartDefinition Mouth = HeadUnder.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.4F, -0.03490658503988659F, 0.0F, 0.0F));

        PartDefinition ArmLeft = Body.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 11).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.5F, 0.3F, -2.0F, 1.3613568165555772F, 0.6457718232379019F, 0.0F));
        PartDefinition ForearmLeft = ArmLeft.addOrReplaceChild("ForearmLeft", CubeListBuilder.create().texOffs(4, 11).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 1.8F, -0.5F, 1.1344640137963142F, -0.08726646259971647F, 0.22689280275926282F));
        PartDefinition HandLeft = ForearmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(8, 11).mirror(true).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 0.7F, -0.593411945678072F, 0.0F, 0.0F));

        PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.2792526803190927F, 0.0F, 0.0F));
        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 4).addBox(-0.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 0.0F, 1.3F, 0.0F, 1.0471975511965976F, 0.0F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(18, 6).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 0.1F, 0.5F, 0.0F, 0.45378560551852565F, 0.0F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(16, 8).addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, -0.5F, 0.0F, -0.08726646259971647F, 0.5410520681182421F));

        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 4).mirror(true).addBox(-2.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 0.0F, 1.3F, 0.0F, -1.0471975511965976F, 0.0F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(18, 6).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.1F, 0.5F, 0.0F, -0.45378560551852565F, 0.0F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(16, 8).mirror(true).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 0.0F, -0.5F, 0.0F, 0.08726646259971647F, -0.5410520681182421F));

        return LayerDefinition.create(meshDefinition, 24, 16);
    }

    @Override
    public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.56F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.xRot = Mth.cos(limbSwing * 0.1F) * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entity instanceof JumpingEntity) {
            float f = ageInTicks - (float) entity.tickCount;
            this.jumpRotation = Mth.sin(((JumpingEntity) entity).getJumpCompletion(f) * (float) Math.PI);
            this.ThighLeft.xRot = this.jumpRotation * 1.2f;
            this.ThighLeft.zRot = this.jumpRotation * 1.2f;
            this.ThighRight.xRot = this.jumpRotation * 1.2f;
            this.ThighRight.zRot = -this.jumpRotation * 1.2f;
            this.FootLeft.zRot = this.jumpRotation * 0.9f + 0.54F;
            this.FootRight.zRot = -this.jumpRotation * 0.9f - 0.54F;
            this.ArmLeft.xRot = -this.jumpRotation * 1.2f + 1.36F;
            this.ArmLeft.yRot = -this.jumpRotation * 0.7f + 0.64F;
            this.ArmRight.xRot = -this.jumpRotation * 1.2f + 1.36F;
            this.ArmRight.yRot = this.jumpRotation * 0.7f - 0.64F;
            this.ForearmLeft.xRot = this.jumpRotation * 0.7f + 1.134F;
            this.ForearmRight.xRot = this.jumpRotation * 0.7f + 1.134F;
        }
    }

    @Override
    public void prepareMobModel(E entity, float speed, float walkSpeed, float partialTick) {
        super.prepareMobModel(entity, speed, walkSpeed, partialTick);
        if (entity instanceof JumpingEntity)
            this.jumpRotation = Mth.sin(((JumpingEntity) entity).getJumpCompletion(partialTick) * (float) Math.PI);
    }
}
