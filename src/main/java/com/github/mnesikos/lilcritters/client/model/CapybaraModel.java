package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
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

public abstract class CapybaraModel extends ZawaBaseModel<CapybaraEntity> {
    public ModelPart Chest;
    public ModelPart Neck;
    public ModelPart Hips;
    public ModelPart LeftThigh;
    public ModelPart RightThigh;
    public ModelPart LeftUpperLeg;
    public ModelPart LeftFoot;
    public ModelPart RightUpperLeg;
    public ModelPart RightFoot;
    public ModelPart Head;
    public ModelPart Mouth;
    public ModelPart RightEar;
    public ModelPart LeftEar;
    public ModelPart LeftArm;
    public ModelPart LeftHand;
    public ModelPart RightArm;
    public ModelPart RightHand;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Chest);
        }

        return this.parts;
    }

    public CapybaraModel() {
    }

    public static class Adult extends CapybaraModel {
        public ModelPart Torso;
        public ModelPart LeftArmBase;
        public ModelPart RightArmBase;
        public ModelPart LeftLeg;
        public ModelPart RightLeg;
        public ModelPart Snout;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Head = this.Neck.getChild("Head");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.RightHand = this.RightArm.getChild("RightHand");
            this.Torso = this.Chest.getChild("Torso");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.RightEar = this.Head.getChild("RightEar");
            this.Hips = this.Torso.getChild("Hips");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.Mouth = this.Head.getChild("Mouth");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.Neck = this.Chest.getChild("Neck");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.LeftHand = this.LeftArm.getChild("LeftHand");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.Snout = this.Head.getChild("Snout");

            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -1.0F, -6.0F, 5, 6, 7), PartPose.offsetAndRotation(0.0F, 0.3F, -3.9F, 0.6283185307179586F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, -4.0F, -3.0F, 7, 8, 6), PartPose.offsetAndRotation(0.0F, 13.7F, -3.5F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(13, 9).addBox(-1.0F, -0.5F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 3.9F, 0.8F, -0.4886921905584123F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(44, 13).mirror(true).addBox(-1.5F, -0.5F, -2.2F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(19, 24).addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8), PartPose.offsetAndRotation(0.0F, -3.9F, 1.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(2.4F, -0.2F, -0.4F, -0.2792526803190927F, 0.2792526803190927F, 0.06981317007977318F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -2.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(-2.4F, -0.2F, -0.4F, -0.2792526803190927F, -0.2792526803190927F, -0.06981317007977318F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 37).addBox(-3.5F, 0.0F, 0.0F, 7, 8, 5), PartPose.offsetAndRotation(0.0F, 0.1F, 7.6F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(44, 19).mirror(true).addBox(-0.9F, -0.8F, -2.5F, 5, 6, 5), PartPose.offsetAndRotation(-3.6F, 3.1F, 2.2F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, 0.0F, -2.2F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(47, 2).addBox(-1.5F, -0.5F, -0.5F, 3, 5, 3), PartPose.offsetAndRotation(2.4F, 4.2F, -1.7F, 0.593411945678072F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(47, 2).mirror(true).addBox(-1.5F, -0.5F, -0.5F, 3, 5, 3), PartPose.offsetAndRotation(0.7F, 4.2F, -1.7F, 0.593411945678072F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(-1.5F, 0.0F, -2.2F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(35, 20).addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2), PartPose.offset(0.0F, 3.9F, -5.5F));
            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(44, 19).addBox(-0.9F, -0.8F, -2.5F, 5, 6, 5), PartPose.offsetAndRotation(0.4F, 3.1F, 2.2F, 0.017453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(37, 8).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 5.7F, -0.2F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(19, 45).addBox(-3.0F, -1.0F, -3.5F, 6, 6, 6), PartPose.offsetAndRotation(0.0F, -2.9F, -2.5F, -0.47123889803846897F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(13, 9).mirror(true).addBox(-1.0F, -0.5F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 3.9F, 0.8F, -0.4886921905584123F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(21, 0).addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(2.7F, -0.3F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(44, 13).addBox(-1.5F, -0.5F, -2.2F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(-2.7F, -0.3F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(37, 8).addBox(-1.0F, -0.5F, -1.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 5.7F, -0.2F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(22, 13).addBox(-2.0F, 0.0F, -1.7F, 4, 5, 3), PartPose.offsetAndRotation(0.0F, -0.8F, -6.4F, 0.10471975511965977F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(CapybaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.63F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.RightEar.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.47F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 6.0f, degree = 0.8f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.LeftArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.15F;
            this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.29F;
            this.LeftHand.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.LeftThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.2F;
            this.LeftUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.5F;
            this.LeftLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.5F;
            this.LeftFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
            this.RightThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.2F;
            this.RightUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.5F;
            this.RightLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
            this.RightFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount;
            this.RightArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.15F;
            this.RightArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.29F;
            this.RightHand.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.5F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.RightEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.Chest.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 13.7F;
        }
    }

    public static class Child extends CapybaraModel {
        public ModelPart Body;
        public ModelPart LeftLowerLeg;
        public ModelPart RightLowerLeg;
        public ModelPart LeftForearm;
        public ModelPart RightForearm;
        public ModelPart Nose;

        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.LeftLowerLeg = this.LeftUpperLeg.getChild("LeftLowerLeg");
            this.Nose = this.Head.getChild("Nose");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.RightForearm = this.RightArm.getChild("RightForearm");
            this.RightArm = this.Chest.getChild("RightArm");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.Mouth = this.Head.getChild("Mouth");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.Head = this.Neck.getChild("Head");
            this.RightEar = this.Head.getChild("RightEar");
            this.Neck = this.Chest.getChild("Neck");
            this.RightLowerLeg = this.RightUpperLeg.getChild("RightLowerLeg");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.RightFoot = this.RightLowerLeg.getChild("RightFoot");
            this.RightHand = this.RightForearm.getChild("RightHand");
            this.Body = this.Chest.getChild("Body");
            this.LeftArm = this.Chest.getChild("LeftArm");
            this.Hips = this.Body.getChild("Hips");
            this.LeftFoot = this.LeftLowerLeg.getChild("LeftFoot");

            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(31, 9).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(1.8F, 1.2F, 1.6F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftLowerLeg", CubeListBuilder.create().texOffs(29, 21).addBox(-1.0F, 0.0F, -1.9F, 2, 3, 2), PartPose.offsetAndRotation(-0.1F, 1.8F, 1.8F, -0.6806784082777886F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.5F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(28, 16).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(0.1F, 2.5F, -1.5F, 0.5235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(19, 0).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(-0.1F, 1.7F, -0.2F, 0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(16, 7).addBox(-2.0F, -2.0F, -1.5F, 4, 4, 3), PartPose.offsetAndRotation(0.0F, 18.6F, -1.5F, -0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(20, 21).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(0.1F, 2.8F, 0.1F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(18, 15).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(-1.6F, 0.0F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(31, 9).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(-1.8F, 1.2F, 1.6F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offset(0.0F, 1.4F, -1.5F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.1F, 2.5F, -1.5F, 0.5235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.5F, -2.0F, 3, 3, 3), PartPose.offsetAndRotation(0.01F, 0.7F, -2.3F, 0.6108652381980153F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(14, 0).mirror(true).addBox(0.0F, -1.0F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(-1.5F, 0.2F, 0.4F, -0.41887902047863906F, -0.2792526803190927F, -0.06981317007977318F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, -1.9F, -0.7F, -0.3839724354387525F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLowerLeg", CubeListBuilder.create().texOffs(29, 21).mirror(true).addBox(-1.0F, 0.0F, -1.9F, 2, 3, 2), PartPose.offsetAndRotation(0.1F, 1.8F, 1.8F, -0.6806784082777886F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(1.5F, 0.2F, 0.4F, -0.41887902047863906F, 0.2792526803190927F, 0.06981317007977318F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(20, 21).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.1F, 2.8F, 0.1F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(40, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(0.1F, 2.4F, -1.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(19, 0).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(0.1F, 1.7F, -0.2F, 0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, 0.0F, 5, 5, 4), PartPose.offsetAndRotation(0.0F, -2.0F, -0.2F, 0.3839724354387525F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(18, 15).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(1.6F, 0.0F, -0.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(29, 1).addBox(-2.0F, 0.0F, 0.0F, 4, 4, 3), PartPose.offsetAndRotation(0.0F, 0.1F, 3.7F, -0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(-0.1F, 2.4F, -1.0F, 0.22689280275926282F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(CapybaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.61F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = Mth.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.RightEar.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.4F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 4.0f, degree = 0.8f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.LeftArm.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.35F;
            this.LeftHand.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.LeftThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.09F;
            this.LeftUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.52F;
            this.LeftFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.RightThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.09F;
            this.RightUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.52F;
            this.RightFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.RightArm.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
            this.RightHand.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.4F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.RightEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Chest.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 18.6F;
            this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.15F;
            this.RightForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.15F;
            this.LeftLowerLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.7F;
            this.RightLowerLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.7F;
        }
    }
}
