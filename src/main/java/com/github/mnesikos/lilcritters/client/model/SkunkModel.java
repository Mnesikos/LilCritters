package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SkunkEntity;
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
public class SkunkModel extends ZawaBaseModel<SkunkEntity> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart LeftBicep;
    public ModelPart RightBicep;
    public ModelPart Butt;
    public ModelPart Head;
    public ModelPart LowerChest;
    public ModelPart LeftEar;
    public ModelPart RightEar;
    public ModelPart Snout;
    public ModelPart Nose;
    public ModelPart Chin;
    public ModelPart LeftForearm;
    public ModelPart LeftHand;
    public ModelPart RightForearm;
    public ModelPart RightHand;
    public ModelPart LeftThigh;
    public ModelPart RightThigh;
    public ModelPart tail1;
    public ModelPart LeftLeg;
    public ModelPart LeftFoot;
    public ModelPart RightLeg;
    public ModelPart RightFoot;
    public ModelPart tail2;
    public ModelPart tail3;
    public ModelPart tail4;
    public ModelPart tail5;
    public ModelPart tail6;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public SkunkModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftBicep = this.Body.getChild("LeftBicep");
        this.LeftForearm = this.LeftBicep.getChild("LeftForearm");
        this.LeftHand = this.LeftForearm.getChild("LeftHand");

        this.RightBicep = this.Body.getChild("RightBicep");
        this.RightForearm = this.RightBicep.getChild("RightForearm");
        this.RightHand = this.RightForearm.getChild("RightHand");

        this.Neck = this.Body.getChild("Neck");
        this.LowerChest = this.Neck.getChild("LowerChest");

        this.Head = this.Neck.getChild("Head");
        this.LeftEar = this.Head.getChild("LeftEar");

        this.Snout = this.Head.getChild("Snout");
        this.Chin = this.Snout.getChild("Chin");

        this.Nose = this.Snout.getChild("Nose");

        this.RightEar = this.Head.getChild("RightEar");

        this.Butt = this.Body.getChild("Butt");
        this.tail1 = this.Butt.getChild("tail1");
        this.tail2 = this.tail1.getChild("tail2");
        this.tail3 = this.tail2.getChild("tail3");
        this.tail4 = this.tail3.getChild("tail4");
        this.tail5 = this.tail4.getChild("tail5");
        this.tail6 = this.tail5.getChild("tail6");

        this.RightThigh = this.Butt.getChild("RightThigh");
        this.RightLeg = this.RightThigh.getChild("RightLeg");
        this.RightFoot = this.RightLeg.getChild("RightFoot");

        this.LeftThigh = this.Butt.getChild("LeftThigh");
        this.LeftLeg = this.LeftThigh.getChild("LeftLeg");
        this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(22, 0).addBox(-4.0F, -4.5F, -4.5F, 8, 9, 9), PartPose.offsetAndRotation(0.0F, 14.2F, -3.2F, 0.13962634015954636F, 0.0F, 0.0F));
        PartDefinition LeftBicep = Body.addOrReplaceChild("LeftBicep", CubeListBuilder.create().texOffs(9, 42).addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(3.0F, -0.5F, -3.3F, 0.10471975511965977F, 0.0F, 0.0F));
        PartDefinition LeftForearm = LeftBicep.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(21, 38).addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3), PartPose.offsetAndRotation(-0.02F, 5.3F, 1.8F, -0.3490658503988659F, 0.0F, 0.0F));
        PartDefinition LeftHand = LeftForearm.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(29, 42).addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4), PartPose.offsetAndRotation(-0.02F, 4.8F, -1.6F, 0.10471975511965977F, 0.0F, 0.0F));

        PartDefinition RightBicep = Body.addOrReplaceChild("RightBicep", CubeListBuilder.create().texOffs(9, 42).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(-3.0F, -0.5F, -3.3F, 0.10471975511965977F, 0.0F, 0.0F));
        PartDefinition RightForearm = RightBicep.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(21, 38).mirror(true).addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3), PartPose.offsetAndRotation(0.02F, 5.3F, 1.8F, -0.3490658503988659F, 0.0F, 0.0F));
        PartDefinition RightHand = RightForearm.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(29, 42).mirror(true).addBox(-1.5F, -0.5F, -2.5F, 3, 1, 4), PartPose.offsetAndRotation(0.02F, 4.8F, -1.6F, 0.10471975511965977F, 0.0F, 0.0F));

        PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -2.0F, -5.0F, 6, 5, 5), PartPose.offsetAndRotation(0.0F, -2.3F, -2.5F, -0.13962634015954636F, 0.0F, 0.0F));
        PartDefinition LowerChest = Neck.addOrReplaceChild("LowerChest", CubeListBuilder.create().texOffs(0, 21).addBox(-2.5F, -3.0F, -4.6F, 5, 3, 5), PartPose.offsetAndRotation(0.0F, 5.3F, -0.5F, -0.5410520681182421F, 0.0F, 0.0F));

        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -5.3F, 5, 5, 6), PartPose.offsetAndRotation(0.0F, -0.2F, -4.5F, 0.20943951023931953F, 0.0F, 0.0F));
        PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, -2.0F, -0.5F, 2, 2, 1), PartPose.offsetAndRotation(0.9F, -0.9F, -2.5F, -0.20943951023931953F, -0.3490658503988659F, 0.3490658503988659F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, 0.0F, -4.0F, 4, 3, 4), PartPose.offsetAndRotation(0.0F, -0.6F, -4.3F, 0.06981317007977318F, 0.0F, 0.0F));
        PartDefinition Chin = Snout.addOrReplaceChild("Chin", CubeListBuilder.create().texOffs(10, 31).addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3), PartPose.offsetAndRotation(0.0F, 2.7F, 0.2F, -0.10471975511965977F, 0.0F, 0.0F));

        PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, 0.0F, -3.0F, 3, 1, 3), PartPose.offsetAndRotation(0.0F, -1.1F, -0.3F, 0.3839724354387525F, 0.0F, 0.0F));

        PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-2.0F, -2.0F, -0.5F, 2, 2, 1), PartPose.offsetAndRotation(-0.9F, -0.9F, -2.5F, -0.20943951023931953F, 0.3490658503988659F, -0.3490658503988659F));

        PartDefinition Butt = Body.addOrReplaceChild("Butt", CubeListBuilder.create().texOffs(22, 18).addBox(-4.5F, 0.0F, 0.0F, 9, 9, 11), PartPose.offsetAndRotation(0.0F, -4.5F, 4.0F, -0.20943951023931953F, 0.0F, 0.0F));
        PartDefinition tail1 = Butt.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(66, 49).addBox(-3.5F, -2.5F, 0.0F, 7, 5, 5), PartPose.offsetAndRotation(0.0F, 2.6F, 8.4F, 1.4660765716752369F, 0.0F, 0.0F));
        PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(64, 38).addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6), PartPose.offsetAndRotation(0.0F, 0.2F, 4.0F, 0.24434609527920614F, 0.0F, 0.0F));
        PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(62, 25).addBox(-4.5F, -3.0F, 0.0F, 9, 6, 7), PartPose.offsetAndRotation(0.0F, 0.0F, 4.4F, -0.5585053606381855F, 0.0F, 0.0F));
        PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(64, 14).addBox(-4.0F, -2.5F, 0.0F, 8, 5, 6), PartPose.offsetAndRotation(0.0F, 0.0F, 5.3F, -0.6981317007977318F, 0.0F, 0.0F));
        PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(67, 6).addBox(-3.5F, -2.0F, 0.0F, 7, 4, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.4886921905584123F, 0.0F, 0.0F));
        PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(70, 0).addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3), PartPose.offsetAndRotation(0.0F, 0.1F, 2.5F, -0.41887902047863906F, 0.0F, 0.0F));

        PartDefinition RightThigh = Butt.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(7, 52).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3, 6, 5), PartPose.offsetAndRotation(-3.5F, 4.4F, 8.0F, -0.13962634015954636F, 0.0F, 0.0F));
        PartDefinition RightLeg = RightThigh.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(23, 50).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3), PartPose.offsetAndRotation(0.02F, 5.5F, -2.5F, 0.8028514559173915F, 0.0F, 0.0F));
        PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(32, 47).mirror(true).addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5), PartPose.offsetAndRotation(0.02F, 6.0F, 1.8F, -0.593411945678072F, 0.0F, 0.0F));

        PartDefinition LeftThigh = Butt.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(7, 52).addBox(-1.5F, 0.0F, -2.5F, 3, 6, 5), PartPose.offsetAndRotation(3.5F, 4.4F, 8.0F, -0.13962634015954636F, 0.0F, 0.0F));
        PartDefinition LeftLeg = LeftThigh.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(23, 50).addBox(-1.5F, 0.0F, 0.0F, 3, 6, 3), PartPose.offsetAndRotation(-0.02F, 5.5F, -2.5F, 0.8028514559173915F, 0.0F, 0.0F));
        PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(32, 47).addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5), PartPose.offsetAndRotation(-0.02F, 6.0F, 1.8F, -0.593411945678072F, 0.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 96, 64);
    }

    @Override
    public void setupAnim(SkunkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);

    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0F;
        float degree = 1.0F;
        this.Neck.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.14F;
        this.Head.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + 0.21F;
        this.LeftEar.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.36F;
        this.RightEar.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.36F;
        this.tail1.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + 0.4F;
        this.tail3.xRot = Mth.cos(0.5F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.56F;
        this.tail5.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.48F;

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed;
        float degree;

        if (isSwimming) {
            limbSwing = (float)entity.tickCount;
            limbSwingAmount = 0.3F;
        }

        if (entity.isSprinting()) {
            speed = ((SkunkEntity) entity).isBaby() ? 2.0F : 4.0F;
            degree = 0.6F;
            this.LeftBicep.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftForearm.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.LeftHand.xRot = Mth.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightBicep.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightForearm.xRot = Mth.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.RightHand.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftThigh.xRot = Mth.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.LeftLeg.xRot = Mth.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.LeftFoot.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.RightThigh.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.RightLeg.xRot = Mth.cos(5.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.RightFoot.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.Neck.xRot = Mth.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.8F) * limbSwingAmount * 0.5F + -0.12F;
            this.Head.xRot = Mth.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.0F) * limbSwingAmount * 0.5F + 1.5F;
            this.tail3.xRot = Mth.cos(2.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + 0.2F;
//            this.Body.y = Mth.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.04F;
            this.Body.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F + 0.18F;
            this.Body.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.Butt.xRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F + -0.2F;
            this.tail4.xRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;

        } else {
            speed = ((SkunkEntity) entity).isBaby() ? 4.0F : 8.0F;
            degree = ((SkunkEntity) entity).isBaby() ? 1.0F : 1.2F;
            this.LeftBicep.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftForearm.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.LeftHand.xRot = Mth.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightBicep.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.RightForearm.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.35F;
            this.RightHand.xRot = Mth.cos(0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.LeftThigh.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.LeftLeg.xRot = Mth.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.LeftFoot.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.RightThigh.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F + -0.14F;
            this.RightLeg.xRot = Mth.cos(3.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.8F;
            this.RightFoot.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.12F;
            this.Head.xRot = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.2F;
            this.tail1.xRot = Mth.cos(1.5F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.5F;
            this.tail3.xRot = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.55F;
            this.tail5.xRot = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + -0.5F;
//            this.Body.y = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.04F;
            this.Body.xRot = Mth.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + 0.14F;
            this.Body.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
        }
    }
}
