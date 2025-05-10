package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.OpossumEntity;
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

public abstract class OpossumModel extends ZawaBaseModel<OpossumEntity> {
    public ModelPart chest;
    public ModelPart body;
    public ModelPart leftshoulder;
    public ModelPart rightshoulder;
    public ModelPart Neck;
    public ModelPart tailbase;
    public ModelPart leftthigh;
    public ModelPart rightthigh;
    public ModelPart tailmiddle;
    public ModelPart tailend;
    public ModelPart legleft;
    public ModelPart footleft;
    public ModelPart legright;
    public ModelPart footright;
    public ModelPart leftarm;
    public ModelPart lefthand;
    public ModelPart rightarm;
    public ModelPart righthand;
    public ModelPart head;
    public ModelPart mouth;
    public ModelPart lips;
    public ModelPart rightear;
    public ModelPart leftear;
    public ModelPart snout;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.chest);
        }

        return this.parts;
    }

    public static class Adult extends OpossumModel {
        public ModelPart hips;

        public Adult(ModelPart root) {
            this.chest = root.getChild("chest");
            this.tailend = this.tailmiddle.getChild("tailend");
            this.legleft = this.leftthigh.getChild("legleft");
            this.tailmiddle = this.tailbase.getChild("tailmiddle");
            this.rightthigh = this.hips.getChild("rightthigh");
            this.righthand = this.rightarm.getChild("righthand");
            this.rightarm = this.rightshoulder.getChild("rightarm");
            this.rightshoulder = this.chest.getChild("rightshoulder");
            this.leftshoulder = this.chest.getChild("leftshoulder");
            this.legright = this.rightthigh.getChild("legright");
            this.lefthand = this.leftarm.getChild("lefthand");
            this.leftear = this.head.getChild("leftear");
            this.body = this.chest.getChild("body");
            this.rightear = this.head.getChild("rightear");
            this.mouth = this.head.getChild("mouth");
            this.lips = this.head.getChild("lips");
            this.Neck = this.chest.getChild("Neck");
            this.footleft = this.legleft.getChild("footleft");
            this.footright = this.legright.getChild("footright");
            this.snout = this.mouth.getChild("snout");
            this.hips = this.body.getChild("hips");
            this.leftthigh = this.hips.getChild("leftthigh");
            this.head = this.Neck.getChild("head");
            this.tailbase = this.hips.getChild("tailbase");
            this.leftarm = this.leftshoulder.getChild("leftarm");

            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("tailend", CubeListBuilder.create().texOffs(53, 13).addBox(-0.5F, -0.4F, 0.0F, 1, 1, 4), PartPose.offsetAndRotation(0.0F, 0.5F, 3.5F, 0.41887902047863906F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(44, 10).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2), PartPose.offsetAndRotation(-0.02F, 2.5F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("tailmiddle", CubeListBuilder.create().texOffs(53, 7).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightthigh", CubeListBuilder.create().texOffs(43, 15).addBox(-1.0F, -0.5F, -1.5F, 2, 4, 3), PartPose.offsetAndRotation(-1.9F, 1.6F, 0.9F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(4, 10).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(0.02F, 2.4F, -1.5F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(4, 13).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightshoulder", CubeListBuilder.create().texOffs(4, 19).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.8F, 0.8F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftshoulder", CubeListBuilder.create().texOffs(4, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.8F, 0.8F, 0.0F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(44, 10).addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2), PartPose.offsetAndRotation(0.02F, 2.5F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(4, 10).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(-0.02F, 2.4F, -1.5F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(6, 4).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1), PartPose.offsetAndRotation(2.0F, -1.4F, 0.7F, 0.3490658503988659F, -0.20943951023931953F, -1.0471975511965976F));
            partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 21).addBox(-3.0F, -0.5F, -0.5F, 6, 5, 6), PartPose.offsetAndRotation(0.0F, -1.6F, 1.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(6, 4).addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1), PartPose.offsetAndRotation(-2.0F, -1.4F, 0.7F, 0.3490658503988659F, 0.20943951023931953F, 1.0471975511965976F));
            partDefinition.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(28, 1).addBox(-1.0F, -0.5F, -2.5F, 2, 2, 3), PartPose.offsetAndRotation(0.0F, 0.2F, -1.4F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("lips", CubeListBuilder.create().texOffs(13, 3).addBox(-0.5F, -0.4F, -2.0F, 1, 1, 2), PartPose.offset(0.0F, 1.5F, -1.2F));
            partDefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 24).addBox(-2.5F, -2.0F, -1.5F, 5, 5, 3), PartPose.offsetAndRotation(0.0F, 18.5F, -2.5F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(22, 14).addBox(-1.5F, -0.5F, -2.5F, 3, 4, 3), PartPose.offsetAndRotation(0.0F, -1.5F, -1.0F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(44, 7).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(-0.02F, 2.4F, 0.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(44, 7).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(0.02F, 2.4F, 0.0F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -1.0F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, -0.1F, -0.1F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(40, 24).addBox(-2.5F, -0.5F, -0.5F, 5, 5, 3), PartPose.offsetAndRotation(0.0F, 0.1F, 5.0F, -0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftthigh", CubeListBuilder.create().texOffs(43, 15).mirror(true).addBox(-1.0F, -0.5F, -1.5F, 2, 4, 3), PartPose.offsetAndRotation(2.4F, 1.6F, 0.9F, -0.20943951023931953F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 7).addBox(-2.0F, -2.0F, -1.5F, 4, 4, 3), PartPose.offsetAndRotation(0.0F, 1.5F, -2.5F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("tailbase", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.7330382858376184F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(4, 13).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(OpossumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.17F;
            this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.2F;
            this.tailbase.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.73F;
            this.tailbase.yRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
            this.tailend.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.42F;
            this.leftear.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount - 1.05F;
            this.rightear.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 4.0f;
            float degree = 0.5f;
            if (entity.isInWater()) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.leftshoulder.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.22F;
            this.leftarm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.45F;
            this.lefthand.xRot = Mth.cos(0.8F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.16F;
            this.rightshoulder.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.22F;
            this.rightarm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.45F;
            this.righthand.xRot = Mth.cos(0.8F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.16F;
            this.leftthigh.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.21F;
            this.legleft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.45F;
            this.footleft.xRot = Mth.cos(1.4F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.16F;
            this.rightthigh.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.21F;
            this.legright.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.45F;
            this.footright.xRot = Mth.cos(1.4F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.16F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.18F;
            this.tailbase.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.74F;
            this.tailbase.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.tailend.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.4F;
            this.chest.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.5F * limbSwingAmount + 18.5F;
        }
    }

    public static class Child extends OpossumModel {
        public Child(ModelPart root) {
            this.chest = root.getChild("chest");
            this.footright = this.legright.getChild("footright");
            this.tailbase = this.body.getChild("tailbase");
            this.snout = this.mouth.getChild("snout");
            this.leftshoulder = this.chest.getChild("leftshoulder");
            this.footleft = this.legleft.getChild("footleft");
            this.rightarm = this.rightshoulder.getChild("rightarm");
            this.legleft = this.leftthigh.getChild("legleft");
            this.leftear = this.head.getChild("leftear");
            this.leftarm = this.leftshoulder.getChild("leftarm");
            this.leftthigh = this.body.getChild("leftthigh");
            this.rightshoulder = this.chest.getChild("rightshoulder");
            this.tailend = this.tailmiddle.getChild("tailend");
            this.Neck = this.chest.getChild("Neck");
            this.lips = this.mouth.getChild("lips");
            this.tailmiddle = this.tailbase.getChild("tailmiddle");
            this.body = this.chest.getChild("body");
            this.rightthigh = this.body.getChild("rightthigh");
            this.legright = this.rightthigh.getChild("legright");
            this.head = this.Neck.getChild("head");
            this.mouth = this.head.getChild("mouth");
            this.righthand = this.rightarm.getChild("righthand");
            this.lefthand = this.leftarm.getChild("lefthand");
            this.rightear = this.head.getChild("rightear");

            }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            partDefinition.addOrReplaceChild("footright", CubeListBuilder.create().texOffs(24, 4).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.02F, 1.5F, 0.5F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("tailbase", CubeListBuilder.create().texOffs(23, 0).addBox(-1.0F, -0.5F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.7330382858376184F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -1.0F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, -0.2F, 0.1F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftshoulder", CubeListBuilder.create().texOffs(0, 7).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1), PartPose.offsetAndRotation(1.3F, -0.2F, -0.2F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("footleft", CubeListBuilder.create().texOffs(24, 4).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(-0.02F, 1.5F, 0.5F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.02F, 2.0F, 0.5F, -0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(25, 7).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(-0.02F, 1.7F, -0.7F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -0.5F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(1.0F, -1.0F, -0.3F, 0.3490658503988659F, -0.20943951023931953F, -1.0471975511965976F));
            partDefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 4).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(-0.02F, 2.0F, 0.5F, -0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("leftthigh", CubeListBuilder.create().texOffs(26, 13).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(1.7F, 1.7F, 0.8F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightshoulder", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1), PartPose.offsetAndRotation(-1.3F, -0.2F, -0.2F, 0.22689280275926282F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("tailend", CubeListBuilder.create().texOffs(19, 15).addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3), PartPose.offsetAndRotation(-0.02F, 0.5F, 3.0F, 0.41887902047863906F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(16, 3).addBox(-1.0F, -1.5F, -1.5F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, -0.4F, -0.4F, -0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("lips", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, -0.4F, -1.2F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 0.3F, -0.9F, -0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("tailmiddle", CubeListBuilder.create().texOffs(11, 15).addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.2792526803190927F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -2.0F, -1.0F, 3, 4, 4), PartPose.offsetAndRotation(0.0F, 20.1F, -2.5F, 0.08726646259971647F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(14, 8).addBox(-2.0F, -0.5F, -0.5F, 4, 4, 3), PartPose.offsetAndRotation(0.0F, -1.4F, 3.2F, -0.3665191429188092F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightthigh", CubeListBuilder.create().texOffs(26, 13).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(-1.7F, 1.7F, 0.8F, -0.05235987755982988F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(25, 7).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(0.02F, 1.7F, -0.7F, 0.45378560551852565F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(4, 4).addBox(-1.5F, -1.5F, -2.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, -0.1F, -1.3F, 0.17453292519943295F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -0.5F, -2.3F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, 0.6F, -1.5F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.02F, 1.5F, -0.6F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(0, 2).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.02F, 1.5F, -0.6F, 0.13962634015954636F, 0.0F, 0.0F));
            partDefinition.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.3F, 0.3490658503988659F, 0.20943951023931953F, 1.0471975511965976F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(OpossumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.17F;
            this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.2F;
            this.tailbase.xRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.73F;
            this.tailbase.yRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
            this.tailend.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.42F;
            this.leftear.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount - 1.05F;
            this.rightear.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
                float speed = 4.0f;
            float degree = 0.5f;
            if (entity.isInWater()) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.leftshoulder.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.22F;
            this.leftarm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.45F;
            this.lefthand.xRot = Mth.cos(0.8F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.16F;
            this.rightshoulder.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.22F;
            this.rightarm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.45F;
            this.righthand.xRot = Mth.cos(0.8F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.16F;
            this.leftthigh.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.05F;
            this.legleft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.45F;
            this.footleft.xRot = Mth.cos(1.4F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.16F;
            this.rightthigh.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.05F;
            this.legright.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.45F;
            this.footright.xRot = Mth.cos(1.4F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.16F;
            this.Neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.18F;
            this.tailbase.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.74F;
            this.tailbase.yRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.tailend.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.4F;
            this.chest.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.5F * limbSwingAmount + 20.1F;
        }
    }
}