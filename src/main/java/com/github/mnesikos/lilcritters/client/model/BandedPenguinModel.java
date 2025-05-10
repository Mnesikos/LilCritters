package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BandedPenguinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.model.ZawaBaseModel;

@OnlyIn(Dist.CLIENT)
public class BandedPenguinModel extends ZawaBaseModel<BandedPenguinEntity> {
    public ModelPart body;
    public ModelPart hips;
    public ModelPart chest;
    public ModelPart LeftFlipper1;
    public ModelPart RightFlipper1;
    public ModelPart LeftThigh;
    public ModelPart RightThigh;
    public ModelPart Tail1;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart Toe1L;
    public ModelPart Toe2L;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart Toe1R;
    public ModelPart Toe2R;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart neck;
    public ModelPart head;
    public ModelPart Jaw;
    public ModelPart Beak1;
    public ModelPart BeakTip;
    public ModelPart Beak2;
    public ModelPart LeftFlipper2;
    public ModelPart LeftFlipper3;
    public ModelPart RightFlipper2;
    public ModelPart RightFlipper3;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public BandedPenguinModel(ModelPart root) {
        this.body = root.getChild("body");
        this.hips = this.body.getChild("hips");
        this.Jaw = this.head.getChild("Jaw");
        this.LeftFlipper3 = this.LeftFlipper2.getChild("LeftFlipper3");
        this.chest = this.body.getChild("chest");
        this.LeftThigh = this.hips.getChild("LeftThigh");
        this.FootRight = this.LegRight.getChild("FootRight");
        this.head = this.neck.getChild("head");
        this.Toe1R = this.FootRight.getChild("Toe1R");
        this.FootLeft = this.LegLeft.getChild("FootLeft");
        this.neck = this.chest.getChild("neck");
        this.Tail3 = this.Tail1.getChild("Tail3");
        this.RightFlipper1 = this.body.getChild("RightFlipper1");
        this.RightThigh = this.hips.getChild("RightThigh");
        this.Toe1L = this.FootLeft.getChild("Toe1L");
        this.Beak2 = this.Beak1.getChild("Beak2");
        this.Beak1 = this.head.getChild("Beak1");
        this.Tail1 = this.hips.getChild("Tail1");
        this.RightFlipper2 = this.RightFlipper1.getChild("RightFlipper2");
        this.LegLeft = this.LeftThigh.getChild("LegLeft");
        this.RightFlipper3 = this.RightFlipper2.getChild("RightFlipper3");
        this.LegRight = this.RightThigh.getChild("LegRight");
        this.BeakTip = this.Beak1.getChild("BeakTip");
        this.Toe2R = this.FootRight.getChild("Toe2R");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.LeftFlipper2 = this.LeftFlipper1.getChild("LeftFlipper2");
        this.Toe2L = this.FootLeft.getChild("Toe2L");
        this.LeftFlipper1 = this.body.getChild("LeftFlipper1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(33, 0).addBox(-0.5F, 0.0F, -3.0F, 1, 1, 4), PartPose.offsetAndRotation(0.0F, -1.0F, -2.5F, -0.03490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFlipper3", CubeListBuilder.create().texOffs(21, 27).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2), PartPose.offsetAndRotation(-0.02F, 3.5F, -2.5F, 0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(18, 0).addBox(-2.5F, -2.5F, -2.5F, 5, 3, 5), PartPose.offsetAndRotation(0.0F, -2.6F, 0.0F, -0.3839724354387525F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(1.8F, 1.0F, 0.0F, -0.3490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(13, 27).mirror(true).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.17453292519943295F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -2.5F, 4, 4, 5), PartPose.offsetAndRotation(0.0F, -3.0F, -0.3F, 0.10471975511965977F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(13, 27).mirror(true).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.2F, 0.1F, 0.1F, -0.03490658503988659F, -0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.17453292519943295F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -4.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.20943951023931953F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4), PartPose.offsetAndRotation(0.0F, 0.3F, -0.2F, 0.24434609527920614F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightFlipper1", CubeListBuilder.create().texOffs(20, 21).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(-2.5F, -2.7F, 0.0F, -0.20943951023931953F, 0.0F, 0.20943951023931953F));
        partDefinition.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(0, 26).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(-1.8F, 1.0F, 0.0F, -0.3490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(0.2F, 0.1F, 0.1F, -0.03490658503988659F, -0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("Beak2", CubeListBuilder.create().texOffs(13, 0).mirror(true).addBox(-0.6F, 0.0F, -4.0F, 1, 1, 4), PartPose.offset(0.0F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Beak1", CubeListBuilder.create().texOffs(13, 0).addBox(-0.4F, 0.0F, -4.0F, 1, 1, 4), PartPose.offsetAndRotation(0.0F, -2.0F, -1.9F, 0.10471975511965977F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(33, 9).addBox(-2.0F, 0.0F, -0.1F, 4, 3, 2), PartPose.offsetAndRotation(0.0F, 1.5F, 2.5F, -1.0471975511965976F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightFlipper2", CubeListBuilder.create().texOffs(30, 21).mirror(true).addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3), PartPose.offsetAndRotation(-0.3F, 3.0F, 1.5F, -0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightFlipper3", CubeListBuilder.create().texOffs(21, 27).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2), PartPose.offsetAndRotation(0.02F, 3.5F, -2.5F, 0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(10, 26).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.13962634015954636F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.45378560551852565F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(15, 8).addBox(-3.0F, -3.5F, -3.0F, 6, 7, 6), PartPose.offsetAndRotation(0.0F, 18.3F, 0.0F, 0.45378560551852565F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(13, 27).mirror(true).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.1F, -0.03490658503988659F, 0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(36, 19).addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 1.5F, 0.5F, 0.20943951023931953F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFlipper2", CubeListBuilder.create().texOffs(30, 21).addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3), PartPose.offsetAndRotation(0.3F, 3.0F, 1.5F, -0.2792526803190927F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(13, 27).addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.1F, -0.03490658503988659F, 0.2792526803190927F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFlipper1", CubeListBuilder.create().texOffs(20, 21).addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3), PartPose.offsetAndRotation(2.5F, -2.7F, 0.0F, -0.20943951023931953F, 0.0F, -0.20943951023931953F));

        return LayerDefinition.create(meshDefinition, 48, 32);
    }

    @Override
    public void setupAnim(BandedPenguinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI)) - (!entity.isInWater() ? 0.0F : 1.4F);
        if (!entity.isSwimming()) this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0F;
        float degree = 1.0F;
        this.chest.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.38F;
        this.neck.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.2F;
        this.Tail1.xRot = Mth.cos(-1.2F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.5F) * limbSwingAmount * 0.5F + -1.2F;
        this.LeftFlipper1.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.21F;
        this.LeftFlipper1.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.12F) * limbSwingAmount * 0.5F + -0.21F;
        this.RightFlipper1.xRot = Mth.cos(-1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.21F;
        this.RightFlipper1.zRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.12F) * limbSwingAmount * 0.5F + 0.21F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed;
        float degree;
        
        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.25F;
            speed = 1.2F;
            degree = 1.0F;
            this.body.xRot = Mth.cos((float) Math.PI) * (-12.5F) * limbSwingAmount * 0.5F;
            this.hips.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.LeftThigh.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.FootLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * limbSwingAmount * 0.5F;
            this.RightThigh.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.FootRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * limbSwingAmount * 0.5F;
            this.Tail1.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -1.6F;
            this.chest.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.head.xRot = Mth.cos(1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.6F) * limbSwingAmount * 0.5F + -1.0F;
            this.neck.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.LeftFlipper1.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + -1.4F;
            this.LeftFlipper1.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.LeftFlipper1.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -8.0F) * limbSwingAmount * 0.5F + -0.8F;
            this.RightFlipper1.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + 1.4F;
            this.RightFlipper1.xRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.RightFlipper1.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 8.0F) * limbSwingAmount * 0.5F + 0.8F;

        } else {
            speed = ((BandedPenguinEntity) entity).isBaby() ? 3.0F : 6.0F;
            degree = ((BandedPenguinEntity) entity).isBaby() ? 2.0F : 1.6F;
            this.LeftThigh.xRot = Mth.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.5F) * limbSwingAmount * 0.5F + -0.3F;
            this.FootLeft.xRot = Mth.cos(-0.8F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.6F) * limbSwingAmount * 0.5F + 0.2F;
            this.RightThigh.xRot = Mth.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.5F) * limbSwingAmount * 0.5F + -0.3F;
            this.FootRight.xRot = Mth.cos(-0.8F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.2F;
            this.LeftFlipper1.zRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.2F;
            this.LeftFlipper1.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.RightFlipper1.zRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + 0.2F;
            this.RightFlipper1.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.body.zRot = Mth.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
//            this.body.y = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.02F;
            this.neck.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.2F;
            this.chest.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.4F;
            this.head.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + 0.1F;
            this.Tail1.xRot = Mth.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -1.0F;
            this.Tail1.yRot = Mth.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
        }
    }
}