package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.GuineaPigEntity;
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

public class GuineaPigModel extends ZawaBaseModel<GuineaPigEntity> {
    public ModelPart Hips;
    public ModelPart Chest;
    public ModelPart Rear;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart ChestUnder;
    public ModelPart Neck;
    public ModelPart ArmLeft;
    public ModelPart ArmRight;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart TopSnout;
    public ModelPart ForeArmLeft;
    public ModelPart HandLeft;
    public ModelPart ForeArmRight;
    public ModelPart HandRight;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Hips);
        }

        return this.parts;
    }

    public GuineaPigModel(ModelPart root) {
        this.Hips = root.getChild("Hips");
        this.Chest = this.Hips.getChild("Chest");
        this.ChestUnder = this.Chest.getChild("ChestUnder");

        this.Neck = this.Chest.getChild("Neck");
        this.Head = this.Neck.getChild("Head");
        this.Snout = this.Head.getChild("Snout");
        this.TopSnout = this.Snout.getChild("TopSnout");

        this.EarLeft = this.Head.getChild("EarLeft");

        this.EarRight = this.Head.getChild("EarRight");

        this.ArmRight = this.Chest.getChild("ArmRight");
        this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
        this.HandRight = this.ForeArmRight.getChild("HandRight");

        this.ArmLeft = this.Chest.getChild("ArmLeft");
        this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
        this.HandLeft = this.ForeArmLeft.getChild("HandLeft");

        this.Rear = this.Hips.getChild("Rear");

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

        PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, -2.5F, -2.0F, 5, 5, 4), PartPose.offsetAndRotation(0.0F, 20.5F, 0.0F, 0.045553093477052F, 0.0F, 0.0F));
        PartDefinition Chest = Hips.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.1F, -2.5F, 4, 4, 3), PartPose.offsetAndRotation(0.0F, -2.3F, -1.9F, 0.136659280431156F, 0.0F, 0.0F));
        PartDefinition ChestUnder = Chest.addOrReplaceChild("ChestUnder", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, 0.8F, -2.0F, 4, 1, 2), PartPose.offsetAndRotation(0.0F, 3.0F, -0.25F, -0.27314402793711257F, 0.0F, 0.0F));

        PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 3).addBox(-1.0F, 0.3F, -1.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, 0.1F, -2.5F, -0.4553564018453205F, 0.0F, 0.0F));
        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, 1.5F, -0.3F, 0.36425021489121656F, 0.0F, 0.0F));
        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(5, 3).addBox(-1.0F, -1.5F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 0.9F, -0.7F, 0.136659280431156F, 0.0F, 0.0F));
        PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(6, 0).addBox(-1.0F, -1.0F, -2.0F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, -0.8F, 0.02F, 0.136659280431156F, 0.0F, 0.0F));

        PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 2).mirror(true).addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(1.0F, -1.0F, 0.5F, -0.22759093446006054F, 0.22759093446006054F, 0.5009094953223726F));

        PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.5F, -0.22759093446006054F, -0.22759093446006054F, -0.5009094953223726F));

        PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1), PartPose.offsetAndRotation(-1.3F, 2.9F, -2.0F, 0.27314402793711257F, 0.0F, 0.0F));
        PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.8196066167365371F, 0.0F, 0.0F));
        PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 29).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.1F, 0.5F, -0.5F, 0.40980330836826856F, 0.0F, 0.0F));

        PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1), PartPose.offsetAndRotation(1.3F, 2.9F, -2.0F, 0.27314402793711257F, 0.0F, 0.0F));
        PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(0, 29).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.8196066167365371F, 0.0F, 0.0F));
        PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 29).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.1F, 0.5F, -0.5F, 0.5009094953223726F, 0.0F, 0.0F));

        PartDefinition Rear = Hips.addOrReplaceChild("Rear", CubeListBuilder.create().texOffs(18, 9).addBox(-2.0F, -0.5F, 0.0F, 4, 5, 2), PartPose.offsetAndRotation(0.0F, -2.0F, 1.5F, -0.18203784098300857F, 0.0F, 0.0F));

        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3), PartPose.offset(-2.0F, 0.2F, 1.2F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2), PartPose.offsetAndRotation(-0.1F, 2.0F, -1.0F, 0.7740535232594852F, 0.0F, 0.0F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(0.1F, 1.5F, 0.4F, -0.8196066167365371F, 0.0F, 0.0F));

        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 16).mirror(true).addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3), PartPose.offset(2.0F, 0.2F, 1.2F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(16, 22).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.7740535232594852F, 0.0F, 0.0F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 23).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.4F, -0.8196066167365371F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(GuineaPigEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.36F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.36F;
        this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.EarRight.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.46F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 6.0f, degree = 0.8f;

        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
        }

        this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.27F;
        this.ForeArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
        this.HandLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
        this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
        this.LegLeft.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.77F;
        this.FootLeft.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
        this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
        this.LegRight.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.77F;
        this.FootRight.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
        this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.27F;
        this.ForeArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
        this.HandRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.5F;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.46F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.36F;
        this.EarLeft.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.EarRight.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.Hips.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 20F;
    }
}
