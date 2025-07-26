package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.PrairieDogEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class PrairieDogModel extends ZawaBaseModel<PrairieDogEntity> {
    public ModelPart Hips;
    public ModelPart Body;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Rear;
    public ModelPart Belly;
    public ModelPart ArmLeft;
    public ModelPart ArmRight;
    public ModelPart Neck;
    public ModelPart ForeArmLeft;
    public ModelPart HandLeft;
    public ModelPart ForeArmRight;
    public ModelPart HandRight;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart Nose;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart TailBase;
    public ModelPart Tail1;
    public ModelPart Tail2;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Hips);
        return parts;
    }

    public PrairieDogModel(ModelPart root) {
        this.Hips = root.getChild("Hips");
        this.Body = this.Hips.getChild("Body");
        this.ArmLeft = this.Body.getChild("ArmLeft");
        this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
        this.HandLeft = this.ForeArmLeft.getChild("HandLeft");

        this.Neck = this.Body.getChild("Neck");
        this.Head = this.Neck.getChild("Head");
        this.EarRight = this.Head.getChild("EarRight");

        this.EarLeft = this.Head.getChild("EarLeft");

        this.Snout = this.Head.getChild("Snout");
        this.Nose = this.Snout.getChild("Nose");

        this.Belly = this.Body.getChild("Belly");

        this.ArmRight = this.Body.getChild("ArmRight");
        this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
        this.HandRight = this.ForeArmRight.getChild("HandRight");

        this.ThighRight = this.Hips.getChild("ThighRight");
        this.LegRight = this.ThighRight.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");

        this.Rear = this.Hips.getChild("Rear");
        this.TailBase = this.Rear.getChild("TailBase");
        this.Tail1 = this.TailBase.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");

        this.ThighLeft = this.Hips.getChild("ThighLeft");
        this.LegLeft = this.ThighLeft.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Hips = partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.0F, 5.0F, 5.0F, 4.0F), PartPose.offset(0.0F, 20.4F, 0.0F));
        PartDefinition Body = Hips.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(31, 7).addBox(-2.0F, -0.1F, -3.0F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.3F, -2.0F, 0.11728612207217244F, 0.0F, 0.0F));
        PartDefinition ArmLeft = Body.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.41F, 3.0F, -2.0F, 0.11676252795710604F, 0.0F, 0.0F));
        PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
        PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 29).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.5F, -0.5F, 0.618021085468031F, 0.0F, 0.0F));

        PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 3).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.0F, -2.5F, -0.5059709461584144F, 0.0F, 0.0F));
        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(1, 19).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -1.6F, 0.5199336001480773F, 0.0F, 0.0F));
        PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(11, 19).mirror(true).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -0.9F, -0.2F, 0.35028757554893974F, 0.46705011182842415F, 0.0F));

        PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(11, 19).addBox(0.0F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -0.9F, -0.2F, 0.35028757554893974F, -0.46705011182842415F, 0.0F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(10, 14).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.9F, -0.8F, 0.15568337060947474F, 0.0F, 0.0F));
        PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(2, 15).addBox(-0.5F, -0.8F, -0.7F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, 0.38920840987893F, 0.0F, 0.0F));

        PartDefinition Belly = Body.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(44, 3).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 3.8F, 0.2F, -0.27366763203903305F, 0.0F, 0.0F));

        PartDefinition ArmRight = Body.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.41F, 3.0F, -2.0F, 0.11676252795710604F, 0.0F, 0.0F));
        PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(0, 29).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 2.0F, 0.5F, -0.8196066007575706F, 0.0F, 0.0F));
        PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 29).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.5F, -0.5F, 0.618021085468031F, 0.0F, 0.0F));

        PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 16).mirror(true).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(-2.0F, 0.1F, 0.4F));
        PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(16, 22).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.7740534966278743F, 0.0F, 0.0F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 23).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.5F, 0.4F, -0.8196066007575706F, 0.0F, 0.0F));

        PartDefinition Rear = Hips.addOrReplaceChild("Rear", CubeListBuilder.create().texOffs(28, 19).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, -0.194604204939465F, 0.0F, 0.0F));
        PartDefinition TailBase = Rear.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(11, 27).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.1F, 0.6F, -0.6806784082777886F, 0.0F, 0.0F));
        PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(20, 28).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 1.4F, 0.5764822306284383F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(27, 28).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.01F, 0.5F, 1.5F, 0.18203784630933073F, 0.0F, 0.0F));

        PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 16).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 3.0F, 3.0F), PartPose.offset(2.0F, 0.1F, 0.4F));
        PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 2.0F, -1.0F, 0.7740534966278743F, 0.0F, 0.0F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 23).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, 0.4F, -0.8196066007575706F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void setupAnim(PrairieDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}
