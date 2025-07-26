package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BurrowingOwlEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BurrowingOwlModel extends ZawaBaseModel<BurrowingOwlEntity> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Head;
    public ModelPart Nose;
    public ModelPart Beak;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart FingerLeft1;
    public ModelPart FingerLeft2;
    public ModelPart FingerLeft3;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart FingerRight1;
    public ModelPart FingerRight2;
    public ModelPart FingerRight3;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Body);
        return parts;
    }

    public static class Adult extends BurrowingOwlModel {
        public ModelPart Wing1Left;
        public ModelPart Tail1;
        public ModelPart Wing1Right;
        public ModelPart BeakL;
        public ModelPart BeakR;
        public ModelPart Wing2Left;
        public ModelPart Tail2;
        public ModelPart TailRight;
        public ModelPart TailLeft;
        public ModelPart Wing2Right;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Nose = this.Head.getChild("Nose");
            this.BeakL = this.Nose.getChild("BeakL");

            this.Beak = this.Nose.getChild("Beak");

            this.BeakR = this.Nose.getChild("BeakR");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.TailRight = this.Tail2.getChild("TailRight");

            this.TailLeft = this.Tail2.getChild("TailLeft");

            this.FingerRight3 = this.FootRight.getChild("FingerRight3");
            this.FingerRight2 = this.FootRight.getChild("FingerRight2");
            this.FingerLeft2 = this.FootLeft.getChild("FingerLeft2");
            this.FingerLeft3 = this.FootLeft.getChild("FingerLeft3");
            this.FingerLeft1 = this.FootLeft.getChild("FingerLeft1");
            this.FingerRight1 = this.FootRight.getChild("FingerRight1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 16.6F, 0.0F, 0.6653194922181108F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(0, 16).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.7F, 1.2F, -1.5F, -0.3520329114588368F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 20).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.05F, 3.5F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(2.6F, -3.2F, 1.5F, -1.7201964681550337F, 0.0F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(0, 9).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, 0.0F, -0.27366763203903305F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.7F, 1.2F, -1.5F, -0.3520329114588368F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.05F, 3.5F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(26, 0).addBox(-1.9F, -1.5F, 0.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(44, 11).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 2.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(40, 11).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition BeakL = Nose.addOrReplaceChild("BeakL", CubeListBuilder.create().texOffs(36, 9).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.2F, 2.9F, 0.3F, 0.5462880425584197F, 0.0F, 0.13665927909957545F));

            PartDefinition Beak = Nose.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.1F, 0.5462880425584197F, 0.0F, 0.0F));

            PartDefinition BeakR = Nose.addOrReplaceChild("BeakR", CubeListBuilder.create().texOffs(35, 12).mirror(true).addBox(-0.5F, -0.1F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, 2.9F, 0.3F, 0.5462880425584197F, 0.0F, -0.13665927909957545F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(-2.6F, -3.2F, 1.5F, -1.7201964681550337F, 0.0F, 0.0F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, 0.0F, 0.27366763203903305F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(14, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 2.5F, -0.3909537457888271F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(17, 4).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.0F, -0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition TailRight = Tail2.addOrReplaceChild("TailRight", CubeListBuilder.create().texOffs(21, 9).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.1F, 0.0F, -0.03909537541112055F, -0.19547687289441354F));

            PartDefinition TailLeft = Tail2.addOrReplaceChild("TailLeft", CubeListBuilder.create().texOffs(21, 9).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 0.0F, -0.1F, 0.0F, 0.03909537541112055F, 0.19547687289441354F));

            PartDefinition FingerRight3 = FootRight.addOrReplaceChild("FingerRight3", CubeListBuilder.create().texOffs(10, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.5F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition FingerRight2 = FootRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(9, 26).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 0.1F, 0.1F, 0.0F, -0.46914448828868976F, 0.0F));
            PartDefinition FingerLeft2 = FootLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(9, 26).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 0.1F, 0.1F, 0.0F, -0.46914448828868976F, 0.0F));
            PartDefinition FingerLeft3 = FootLeft.addOrReplaceChild("FingerLeft3", CubeListBuilder.create().texOffs(10, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.5F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition FingerLeft1 = FootLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(9, 26).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.1F, 0.0F, 0.46914448828868976F, 0.0F));
            PartDefinition FingerRight1 = FootRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(9, 26).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.1F, 0.0F, 0.46914448828868976F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(BurrowingOwlEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0F;
            float degree = 1.0F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * degree * 0.1F * limbSwingAmount * 0.5F - 0.351F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F + (float) Math.PI) * degree * -0.1F * limbSwingAmount * 0.5F - 0.234F;
            this.Tail2.xRot = Mth.cos(limbSwing * speed * 0.1F + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount - 0.23F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.8F;
            float degree = 0.5F;
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
                speed *= 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {
                speed *= 0.5F;
                degree *= 0.5F;
                this.ThighLeft.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount - 0.352F;
                this.LegLeft.xRot = Mth.cos(1.0F + (limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount - 0.3F;
                this.FootLeft.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.5F) * limbSwingAmount + 0.1F;
                this.ThighRight.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.5F) * limbSwingAmount - 0.352F;
                this.LegRight.xRot = Mth.cos(1.0F + (limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount - 0.3F;
                this.FootRight.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount + 0.1F;
                this.Wing1Left.yRot = -1F;
                this.Wing1Right.yRot = 1F;
                this.Wing1Left.zRot = -0.4F;
                this.Wing1Right.zRot = 0.4F;

            } else {
                this.ThighLeft.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount - 0.352F;
                this.LegLeft.xRot = Mth.cos(1.0F + (limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount - 0.3F;
                this.FootLeft.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.5F) * limbSwingAmount + 0.1F;
                this.ThighRight.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.5F) * limbSwingAmount - 0.352F;
                this.LegRight.xRot = Mth.cos(1.0F + (limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount - 0.3F;
                this.FootRight.xRot = Mth.cos((limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * 2.5F) * limbSwingAmount + 0.1F;
            }

            this.Body.xRot = Mth.cos((limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount + 0.665F;
            this.Body.zRot = Mth.sin(1.0F + (limbSwing * speed * 1.2F) + (float) Math.PI) * (degree * -0.6F) * limbSwingAmount;
            this.Body.y = Mth.sin(3.0F + (limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * 2F) * limbSwingAmount + 16.0F;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount - 0.351F;
            this.Neck.y = Mth.sin((3.0F + limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * -2F) * limbSwingAmount - 3.5F;
            this.Tail1.xRot = Mth.cos(2.0F + (limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount;
            this.Tail2.xRot = Mth.cos(2.0F + (limbSwing * speed * 2.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount + 0.1F;
        }
    }

    public static class Child extends BurrowingOwlModel {
        public ModelPart Tail;
        public ModelPart WingRight;
        public ModelPart WingLeft;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Nose = this.Head.getChild("Nose");
            this.Beak = this.Nose.getChild("Beak");

            this.Tail = this.Body.getChild("Tail");

            this.WingRight = this.Body.getChild("WingRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.FingerLeft1 = this.FootLeft.getChild("FingerLeft1");
            this.FingerRight2 = this.FootRight.getChild("FingerRight2");
            this.FingerRight1 = this.FootRight.getChild("FingerRight1");
            this.FingerLeft2 = this.FootLeft.getChild("FingerLeft2");
            this.FingerRight3 = this.FootRight.getChild("FingerRight3");
            this.FingerLeft3 = this.FootLeft.getChild("FingerLeft3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 20.6F, 0.0F, -0.5473352640780661F, 0.0F, 0.0F));
            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(24, 7).addBox(-1.0F, 0.1F, -0.7F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.7037167490777915F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.01F, -1.0F, 0.0F, -0.03909537541112055F, 0.0F, 0.0F));
            PartDefinition Nose = Head.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition Beak = Nose.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(12, 2).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.46914448828868976F, 0.0F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.5F, 2.0F, -0.5869542460878207F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(16, 0).mirror(true).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, -0.1F, -1.0F, -0.03909537541112055F, 0.0781907508222411F, -0.1563815016444822F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(10, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.9F, 1.0F, 1.0F, 0.9773843811168246F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(14, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.7F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(10, 8).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 0.6F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(10, 6).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.9F, 1.0F, 1.0F, 0.9773843811168246F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(14, 6).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.7F, 0.0F, -0.6255260065779288F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(10, 8).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 0.6F, 0.0F, 0.35185837453889574F, 0.0F, 0.0F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.5F, -0.1F, -1.0F, -0.03909537541112055F, -0.0781907508222411F, 0.1563815016444822F));

            PartDefinition FingerLeft1 = FootLeft.addOrReplaceChild("FingerLeft1", CubeListBuilder.create().texOffs(11, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.1F, 0.0F, 0.46914448828868976F, 0.0F));
            PartDefinition FingerRight2 = FootRight.addOrReplaceChild("FingerRight2", CubeListBuilder.create().texOffs(11, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.1F, 0.1F, 0.0F, -0.46914448828868976F, 0.0F));
            PartDefinition FingerRight1 = FootRight.addOrReplaceChild("FingerRight1", CubeListBuilder.create().texOffs(11, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.1F, 0.0F, 0.46914448828868976F, 0.0F));
            PartDefinition FingerLeft2 = FootLeft.addOrReplaceChild("FingerLeft2", CubeListBuilder.create().texOffs(11, 9).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.1F, 0.1F, 0.1F, 0.0F, -0.46914448828868976F, 0.0F));
            PartDefinition FingerRight3 = FootRight.addOrReplaceChild("FingerRight3", CubeListBuilder.create().texOffs(18, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.0F, -0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition FingerLeft3 = FootLeft.addOrReplaceChild("FingerLeft3", CubeListBuilder.create().texOffs(18, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.01F, 0.0F, 0.0F, -0.19547687289441354F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 16);
        }

        @Override
        public void setupAnim(BurrowingOwlEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.yRot = (float) Math.toRadians(netHeadYaw) * 0.5F;
            this.Head.xRot = (float) Math.toRadians(headPitch) - 0.0390F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        }
    }
}
