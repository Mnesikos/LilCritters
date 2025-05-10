package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
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
import net.minecraft.client.model.geom.ModelPart;

public abstract class TuftedDeerModel extends ZawaBaseModel<TuftedDeerEntity> {
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart LeftArmBase;
    public ModelPart RightArmBase;
    public ModelPart Neck;
    public ModelPart Hips;
    public ModelPart LeftThigh;
    public ModelPart RightThigh;
    public ModelPart Tail;
    public ModelPart LeftUpperLeg;
    public ModelPart LeftLeg;
    public ModelPart LeftFoot;
    public ModelPart RightUpperLeg;
    public ModelPart RightLeg;
    public ModelPart RightFoot;
    public ModelPart LeftArm;
    public ModelPart LeftForearm;
    public ModelPart LeftHand;
    public ModelPart RightArm;
    public ModelPart RightForeArm;
    public ModelPart RightHand;
    public ModelPart Head;
    public ModelPart Muzzle;
    public ModelPart LeftEar;
    public ModelPart RightEar;
    public ModelPart Tuft;
    public ModelPart Mouth;
    public ModelPart TopSnout;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Chest);
        }

        return this.parts;
    }

    public TuftedDeerModel() {
    }

    public static class Adult extends TuftedDeerModel {
        public ModelPart NeckLower;
        public ModelPart LeftAntler;
        public ModelPart RightAntler;
        public ModelPart LeftFang;
        public ModelPart RightFang;
        
        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.RightFang = this.Muzzle.getChild("RightFang");
            this.Tail = this.Hips.getChild("Tail");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.LeftAntler = this.Head.getChild("LeftAntler");
            this.RightAntler = this.Head.getChild("RightAntler");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.Head = this.Neck.getChild("Head");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.Neck = this.Chest.getChild("Neck");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.Tuft = this.Head.getChild("Tuft");
            this.TopSnout = this.Muzzle.getChild("TopSnout");
            this.LeftFang = this.Muzzle.getChild("LeftFang");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.Mouth = this.Muzzle.getChild("Mouth");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightEar = this.Head.getChild("RightEar");
            this.NeckLower = this.Neck.getChild("NeckLower");
            this.Hips = this.Body.getChild("Hips");
            this.Body = this.Chest.getChild("Body");
            this.RightHand = this.RightForeArm.getChild("RightHand");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.LeftEar = this.Head.getChild("LeftEar");
            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(48, 27).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offset(0.1F, 3.0F, -2.5F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offsetAndRotation(0.1F, 3.8F, -1.2F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFang", CubeListBuilder.create().texOffs(0, 2).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.45F, 1.7F, -1.8F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(22, 27).addBox(-1.0F, 0.0F, -0.5F, 2, 5, 1), PartPose.offsetAndRotation(0.0F, 0.4F, 4.5F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(34, 21).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(-1.9F, 0.5F, 0.5F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 33).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(-0.1F, 4.0F, 2.5F, -0.3141592653589793F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, 0.1F, -3.0F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, -0.1F, -3.4F, 0.10471975511965977F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftAntler", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(1.3F, -1.0F, -2.0F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightAntler", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(-1.3F, -1.0F, -2.0F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(48, 27).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offset(-0.1F, 3.0F, -2.5F));
            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(24, 29).addBox(-1.5F, 0.0F, -2.5F, 3, 6, 4), PartPose.offsetAndRotation(2.2F, 3.3F, 2.0F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -4.0F, 4, 4, 5), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, 1.117010721276371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(48, 21).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, 5.0F, 1.6F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 5).addBox(-1.5F, -2.5F, -4.0F, 3, 4, 5), PartPose.offsetAndRotation(0.0F, -1.2F, -1.7F, -0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 21).addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, 5.0F, 1.6F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(35, 0).addBox(-1.5F, -0.2F, 0.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(35, 9).addBox(-3.0F, -4.0F, -2.0F, 6, 7, 5), PartPose.offsetAndRotation(0.0F, 12.9F, -5.0F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3), PartPose.offsetAndRotation(0.0F, -0.8F, -0.5F, 0.2617993877991494F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFang", CubeListBuilder.create().texOffs(0, 2).addBox(0.0F, 0.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(0.45F, 1.7F, -1.8F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(24, 29).mirror(true).addBox(-1.5F, 0.0F, -2.5F, 3, 6, 4), PartPose.offsetAndRotation(-2.2F, 3.1F, 2.0F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 33).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.1F, 4.0F, 2.5F, -0.3141592653589793F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -0.2F, -2.6F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 2.1F, -0.2F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(34, 21).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(1.9F, 0.5F, 0.5F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(38, 30).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3), PartPose.offsetAndRotation(0.0F, 6.0F, -2.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(0.0F, -2.0F, -1.0F, 1, 3, 2), PartPose.offsetAndRotation(-2.0F, -0.3F, -0.2F, -0.8028514559173915F, -0.3490658503988659F, -0.10471975511965977F));
            partDefinition.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -2.0F, 0.0F, 2, 2, 7), PartPose.offsetAndRotation(0.0F, 2.0F, -4.5F, -0.12217304763960307F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, 0.0F, 0.0F, 6, 7, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F, 0.0F, 0.0F, 7, 8, 10), PartPose.offsetAndRotation(0.0F, -4.0F, 0.5F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offset(-0.1F, 3.8F, 0.8F));
            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offset(0.1F, 3.8F, 0.8F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(0, 14).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offsetAndRotation(-0.1F, 3.8F, -1.2F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(38, 30).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3), PartPose.offsetAndRotation(0.0F, 6.0F, -2.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -2.0F, -1.0F, 1, 3, 2), PartPose.offsetAndRotation(2.0F, -0.3F, -0.2F, -0.8028514559173915F, 0.3490658503988659F, 0.10471975511965977F));

            return LayerDefinition.create(meshDefinition, 64, 48);
        }

        @Override
        public void setupAnim(TuftedDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.12F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed, degree;

            if (isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 8.0f;
                degree = 0.2f;
                this.LeftArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.LeftHand.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.24F;
                this.LeftUpperLeg.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
                this.LeftLeg.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.LeftFoot.xRot = Mth.cos(-3.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightThigh.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
                this.RightLeg.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.RightFoot.xRot = Mth.cos(-3.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightArmBase.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.RightForeArm.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightHand.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.7F;
                this.Head.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.Tail.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.4F * limbSwingAmount + 3.1F;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.1F) * degree * 6F * limbSwingAmount + 10.95F;
                this.Chest.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount - 0.21F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.45F * limbSwingAmount + 0.25F;

            } else {
                speed = 6.0f;
                degree = 0.5f;
                this.LeftArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.LeftHand.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.24F;
                this.LeftUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.5F * limbSwingAmount + 0.35F;
                this.LeftLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.31F;
                this.LeftFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.05F;
                this.RightThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.5F * limbSwingAmount + 0.35F;
                this.RightLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.RightFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.07F;
                this.RightForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.RightHand.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.7F;
                this.Head.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.Tail.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 0.28F;
                this.Neck.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.25F * limbSwingAmount;
                this.Head.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.25F * limbSwingAmount;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.02F * limbSwingAmount + 11F;
                this.Chest.xRot = -0.21F;
                this.Body.xRot = 0.24F;
            }
        }
    }

    public static class Child extends TuftedDeerModel {
        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.LeftHand = this.LeftForearm.getChild("LeftHand");
            this.LeftEar = this.Head.getChild("LeftEar");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.RightThigh = this.Hips.getChild("RightThigh");
            this.RightArm = this.RightArmBase.getChild("RightArm");
            this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
            this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
            this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
            this.LeftForearm = this.LeftArm.getChild("LeftForearm");
            this.Tail = this.Hips.getChild("Tail");
            this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
            this.RightFoot = this.RightLeg.getChild("RightFoot");
            this.LeftArmBase = this.Chest.getChild("LeftArmBase");
            this.Mouth = this.Muzzle.getChild("Mouth");
            this.LeftThigh = this.Hips.getChild("LeftThigh");
            this.Muzzle = this.Head.getChild("Muzzle");
            this.Tuft = this.Head.getChild("Tuft");
            this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
            this.RightForeArm = this.RightArm.getChild("RightForeArm");
            this.Hips = this.Body.getChild("Hips");
            this.Body = this.Chest.getChild("Body");
            this.RightEar = this.Head.getChild("RightEar");
            this.RightArmBase = this.Chest.getChild("RightArmBase");
            this.TopSnout = this.Muzzle.getChild("TopSnout");
            this.LeftArm = this.LeftArmBase.getChild("LeftArm");
            this.RightHand = this.RightForeArm.getChild("RightHand");
            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offset(0.1F, 1.8F, 0.9F));
            partDefinition.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -1.5F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -0.8028514559173915F, 0.5585053606381855F, 0.10471975511965977F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 4).addBox(-1.0F, -1.5F, -2.0F, 2, 3, 4), PartPose.offsetAndRotation(0.0F, -0.9F, -2.0F, -0.6981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.5F, -3.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, -0.9F, -2.9F, 1.117010721276371F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(18, 16).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(-1.3F, 2.3F, 0.4F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 12).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.02F, 3.0F, 1.0F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(36, 16).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.02F, 2.0F, 2.0F, -0.3141592653589793F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offsetAndRotation(0.1F, 2.8F, -1.1F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(36, 16).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(-0.02F, 2.0F, 2.0F, -0.3141592653589793F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(36, 12).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offset(0.02F, 2.0F, -2.0F));
            partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 18).addBox(-1.0F, 0.0F, -0.5F, 2, 3, 1), PartPose.offsetAndRotation(0.0F, 0.4F, 2.5F, 0.41887902047863906F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.1F, 3.0F, -1.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offsetAndRotation(-0.1F, 2.8F, -1.1F, 0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArmBase", CubeListBuilder.create().texOffs(20, 11).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(1.1F, 0.6F, 0.1F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 4).addBox(-0.5F, -0.2F, -1.6F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 0.7F, -0.2F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(1.3F, 2.3F, 0.4F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 0.9F, -2.4F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Tuft", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.2F, 0.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(28, 16).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(0.1F, 3.0F, -1.2F, 0.3490658503988659F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(36, 12).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offset(-0.02F, 2.0F, -2.0F));
            partDefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(28, 4).addBox(-1.5F, -2.0F, -1.5F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 17.1F, -3.0F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, 0.0F, 0.0F, 4, 5, 6), PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, 0.24434609527920614F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(0.0F, -1.5F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -0.8028514559173915F, -0.5585053606381855F, -0.10471975511965977F));
            partDefinition.addOrReplaceChild("RightArmBase", CubeListBuilder.create().texOffs(20, 11).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(-1.1F, 0.6F, 0.1F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, -1.4F, -0.2F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.02F, 3.0F, 1.0F, -0.06981317007977318F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(31, 0).mirror(true).addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2), PartPose.offset(-0.1F, 1.8F, 0.9F));

            return LayerDefinition.create(meshDefinition, 48, 32);
        }

        @Override
        public void setupAnim(TuftedDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.12F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed, degree;

            if (isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 6.0f;
                degree = 0.2f;
                this.LeftArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.LeftHand.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.17F;
                this.LeftUpperLeg.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
                this.LeftLeg.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.LeftFoot.xRot = Mth.cos(-3.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightThigh.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
                this.RightLeg.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.RightFoot.xRot = Mth.cos(-3.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightArmBase.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.RightForeArm.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightHand.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.7F;
                this.Head.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.Tail.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.4F * limbSwingAmount + 3.1F;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.1F) * degree * 6F * limbSwingAmount + 15.95f;
                this.Chest.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount - 0.21F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.45F * limbSwingAmount + 0.25F;

            } else {
                speed = 6.0f;
                degree = 0.5f;
                this.LeftArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.07F;
                this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.LeftHand.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.17F;
                this.LeftUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.5F * limbSwingAmount + 0.35F;
                this.LeftLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.31F;
                this.LeftFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.05F;
                this.RightThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.5F * limbSwingAmount + 0.35F;
                this.RightLeg.xRot = Mth.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.31F;
                this.RightFoot.xRot = Mth.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount + 0.05F;
                this.RightArmBase.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.07F;
                this.RightForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.RightHand.xRot = Mth.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.Neck.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.7F;
                this.Head.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.Tail.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 0.42F;
                this.Neck.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.25F * limbSwingAmount;
                this.Head.yRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.25F * limbSwingAmount;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.02F * limbSwingAmount + 16F;
                this.Chest.xRot = -0.21F;
                this.Body.xRot = 0.24F;
            }
        }
    }
}
