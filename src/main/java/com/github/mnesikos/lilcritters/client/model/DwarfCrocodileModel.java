package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.DwarfCrocodileEntity;
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
public class DwarfCrocodileModel extends ZawaBaseModel<DwarfCrocodileEntity> {
    public ModelPart body;
    public ModelPart tail1;
    public ModelPart thighLeft;
    public ModelPart thighRight;
    public ModelPart torso;
    public ModelPart tail2;
    public ModelPart tail3;
    public ModelPart tailSpikeRight;
    public ModelPart tailSpikeLeft;
    public ModelPart tail4;
    public ModelPart upperLegLeft;
    public ModelPart footLeft;
    public ModelPart upperLegRight;
    public ModelPart footRight;
    public ModelPart chest;
    public ModelPart neck;
    public ModelPart upperArmLeft;
    public ModelPart upperArmRight;
    public ModelPart head;
    public ModelPart cheekRight;
    public ModelPart cheekLeft;
    public ModelPart snout;
    public ModelPart chin;
    public ModelPart noseRight;
    public ModelPart noseBridge;
    public ModelPart snout2;
    public ModelPart noseLeft;
    public ModelPart mouth;
    public ModelPart armLeft;
    public ModelPart handLeft;
    public ModelPart armRight;
    public ModelPart handRight;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public DwarfCrocodileModel(ModelPart root) {
        this.body = root.getChild("body");
        this.thighLeft = this.body.getChild("thighLeft");
        this.upperLegLeft = this.thighLeft.getChild("upperLegLeft");
        this.footLeft = this.upperLegLeft.getChild("footLeft");

        this.tail1 = this.body.getChild("tail1");
        this.tail2 = this.tail1.getChild("tail2");
        this.tailSpikeLeft = this.tail2.getChild("tailSpikeLeft");

        this.tailSpikeRight = this.tail2.getChild("tailSpikeRight");

        this.tail3 = this.tail2.getChild("tail3");
        this.tail4 = this.tail3.getChild("tail4");

        this.thighRight = this.body.getChild("thighRight");
        this.upperLegRight = this.thighRight.getChild("upperLegRight");
        this.footRight = this.upperLegRight.getChild("footRight");

        this.torso = this.body.getChild("torso");
        this.chest = this.torso.getChild("chest");
        this.neck = this.chest.getChild("neck");
        this.head = this.neck.getChild("head");
        this.snout = this.head.getChild("snout");
        this.noseRight = this.snout.getChild("noseRight");
        this.noseLeft = this.noseRight.getChild("noseLeft");

        this.noseBridge = this.snout.getChild("noseBridge");

        this.snout2 = this.snout.getChild("snout2");

        this.cheekRight = this.head.getChild("cheekRight");

        this.chin = this.head.getChild("chin");
        this.mouth = this.chin.getChild("mouth");

        this.cheekLeft = this.head.getChild("cheekLeft");

        this.upperArmLeft = this.chest.getChild("upperArmLeft");
        this.armLeft = this.upperArmLeft.getChild("armLeft");
        this.handLeft = this.armLeft.getChild("handLeft");

        this.upperArmRight = this.chest.getChild("upperArmRight");
        this.armRight = this.upperArmRight.getChild("armRight");
        this.handRight = this.armRight.getChild("handRight");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition body = partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.7F, -4.5F, 7, 5, 8), PartPose.offsetAndRotation(0.0F, 19.0F, 4.0F, -0.08726646259971647F, 0.0F, 0.0F));
        PartDefinition thighLeft = body.addOrReplaceChild("thighLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(2.7F, 1.4F, 2.0F, 0.0F, -0.06981317007977318F, 0.8726646259971648F));
        PartDefinition upperLegLeft = thighLeft.addOrReplaceChild("upperLegLeft", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(2.0F, -1.0F, 0.02F, 0.0F, 0.0F, 0.6283185307179586F));
        PartDefinition footLeft = upperLegLeft.addOrReplaceChild("footLeft", CubeListBuilder.create().texOffs(16, 13).addBox(-0.5F, -1.0F, -2.0F, 1, 2, 3), PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.03490658503988659F, 0.0F, 0.06981317007977318F));

        PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(22, 0).addBox(-3.0F, -0.56F, -0.4F, 6, 4, 4), PartPose.offsetAndRotation(0.0F, -0.99F, 1.7F, -0.10471975511965977F, 0.0F, 0.0F));
        PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(24, 8).addBox(-2.5F, -0.5F, -0.2F, 5, 3, 6), PartPose.offsetAndRotation(0.0F, 0.4F, 2.1F, 0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition tailSpikeLeft = tail2.addOrReplaceChild("tailSpikeLeft", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14), PartPose.offsetAndRotation(2.0F, -1.2F, -1.0F, -0.10471975511965977F, -0.10471975511965977F, 0.0F));

        PartDefinition tailSpikeRight = tail2.addOrReplaceChild("tailSpikeRight", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14), PartPose.offsetAndRotation(-2.0F, -1.2F, -1.0F, -0.10471975511965977F, 0.10471975511965977F, 0.0F));

        PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(37, 9).addBox(-2.0F, -0.4F, -0.5F, 4, 2, 9), PartPose.offsetAndRotation(0.0F, 0.8F, 4.5F, 0.017453292519943295F, 0.0F, 0.0F));
        PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(24, 17).addBox(-1.5F, -0.53F, -0.3F, 3, 1, 6), PartPose.offsetAndRotation(0.0F, 0.52F, 7.4F, 0.017453292519943295F, 0.0F, 0.0F));

        PartDefinition thighRight = body.addOrReplaceChild("thighRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-2.7F, 1.4F, 2.0F, 0.0F, 0.06981317007977318F, -0.8726646259971648F));
        PartDefinition upperLegRight = thighRight.addOrReplaceChild("upperLegRight", CubeListBuilder.create().texOffs(0, 4).mirror(true).addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-2.0F, -1.0F, 0.02F, 0.0F, 0.0F, -0.6283185307179586F));
        PartDefinition footRight = upperLegRight.addOrReplaceChild("footRight", CubeListBuilder.create().texOffs(16, 13).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 1, 2, 3), PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.03490658503988659F, 0.0F, -0.06981317007977318F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, 0.0F, -4.0F, 6, 5, 4), PartPose.offsetAndRotation(0.0F, -1.7F, -4.5F, 0.15707963267948966F, 0.0F, 0.0F));
        PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(47, 24).addBox(-2.5F, 0.0F, -3.0F, 5, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -2.0F, -3.0F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, 2.4F, -2.0F, 0.06981317007977318F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(16, 18).addBox(-1.5F, -0.9F, -1.6F, 3, 3, 2), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, -0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(16, 28).addBox(-1.5F, -0.4F, -5.0F, 3, 1, 5), PartPose.offset(0.0F, 1.0F, -1.1F));
        PartDefinition noseRight = snout.addOrReplaceChild("noseRight", CubeListBuilder.create().texOffs(0, 17).addBox(-1.4F, 0.0F, 0.0F, 2, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -5.5F, 0.5235987755982988F, 0.0F, 0.0F));
        PartDefinition noseLeft = noseRight.addOrReplaceChild("noseLeft", CubeListBuilder.create().texOffs(0, 17).mirror(true).addBox(-0.6F, 0.0F, 0.0F, 2, 1, 1), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition noseBridge = snout.addOrReplaceChild("noseBridge", CubeListBuilder.create().texOffs(44, 20).addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, -1.3F, -0.3F, 0.4886921905584123F, 0.0F, 0.0F));

        PartDefinition snout2 = snout.addOrReplaceChild("snout2", CubeListBuilder.create().texOffs(16, 28).addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5), PartPose.offsetAndRotation(-0.02F, -0.8F, 0.0F, 0.06981317007977318F, 0.0F, 0.0F));

        PartDefinition cheekRight = head.addOrReplaceChild("cheekRight", CubeListBuilder.create().texOffs(40, 9).addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2), PartPose.offsetAndRotation(-1.5F, -1.0F, -0.72F, 0.0F, -0.10471975511965977F, -0.12217304763960307F));

        PartDefinition chin = head.addOrReplaceChild("chin", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -0.5F, -1.3F, 3, 1, 2), PartPose.offset(0.0F, 2.2F, -0.2F));
        PartDefinition mouth = chin.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(27, 24).addBox(-1.0F, -0.3F, -4.5F, 2, 1, 7), PartPose.offsetAndRotation(0.0F, -0.5F, -1.1F, -0.03490658503988659F, 0.0F, 0.0F));

        PartDefinition cheekLeft = head.addOrReplaceChild("cheekLeft", CubeListBuilder.create().texOffs(40, 9).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2), PartPose.offsetAndRotation(1.5F, -1.0F, -0.72F, 0.0F, 0.10471975511965977F, 0.12217304763960307F));

        PartDefinition upperArmLeft = chest.addOrReplaceChild("upperArmLeft", CubeListBuilder.create().texOffs(54, 14).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.7F, 2.8F, -1.2F, -0.06981317007977318F, 0.0F, -0.6283185307179586F));
        PartDefinition armLeft = upperArmLeft.addOrReplaceChild("armLeft", CubeListBuilder.create().texOffs(52, 20).addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(0.98F, 2.0F, 0.02F, 0.0F, 0.0F, 0.5235987755982988F));
        PartDefinition handLeft = armLeft.addOrReplaceChild("handLeft", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.5F, -1.0F, 3, 1, 2), PartPose.offsetAndRotation(-1.0F, 2.3F, 0.0F, -0.03490658503988659F, 1.5707963267948966F, 0.06981317007977318F));

        PartDefinition upperArmRight = chest.addOrReplaceChild("upperArmRight", CubeListBuilder.create().texOffs(54, 14).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.7F, 2.8F, -1.2F, -0.06981317007977318F, 0.0F, 0.6283185307179586F));
        PartDefinition armRight = upperArmRight.addOrReplaceChild("armRight", CubeListBuilder.create().texOffs(52, 20).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.98F, 2.0F, 0.02F, 0.0F, 0.0F, -0.5235987755982988F));
        PartDefinition handRight = armRight.addOrReplaceChild("handRight", CubeListBuilder.create().texOffs(0, 22).mirror(true).addBox(-2.0F, -0.5F, -1.0F, 3, 1, 2), PartPose.offsetAndRotation(1.0F, 2.3F, 0.0F, -0.03490658503988659F, -1.5707963267948966F, -0.06981317007977318F));

        return LayerDefinition.create(meshDefinition, 64, 48);
    }

    @Override
    public void setupAnim(DwarfCrocodileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.neck.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (1 / (180 / Math.PI));
        this.head.yRot = netHeadYaw / (180F / (float) Math.PI);

    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.08F) * limbSwingAmount * 0.5F + 0.07F;
        this.tail1.yRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
        this.tail4.yRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed;
        float degree;

        if (isSwimming) {
            limbSwing = (float)entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
            degree = 1.0F;
            this.body.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
//            this.body.x = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.torso.yRot = Mth.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F;
            this.chest.yRot = Mth.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F;
            this.neck.yRot = Mth.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail1.yRot = Mth.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail2.yRot = Mth.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail3.yRot = Mth.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F;
            this.tail4.yRot = Mth.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * limbSwingAmount * 0.5F;
            this.upperArmRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * limbSwingAmount * 0.5F;
            this.thighLeft.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 8.0F) * limbSwingAmount * 0.5F;
            this.footLeft.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F;
            this.thighRight.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -8.0F) * limbSwingAmount * 0.5F;
            this.footRight.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handLeft.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.handLeft.zRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handLeft.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handRight.yRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.handRight.zRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F;
            this.handRight.xRot = Mth.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;

        } else {
            speed = ((DwarfCrocodileEntity) entity).isBaby() ? 6.0F : 12.0F;
            degree = ((DwarfCrocodileEntity) entity).isBaby() ? 2.0F : 3.0F;
            this.body.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.torso.yRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.chest.yRot = Mth.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.neck.yRot = Mth.cos(1.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail1.yRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.tail2.yRot = Mth.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.tail3.yRot = Mth.cos(1.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
            this.tail4.yRot = Mth.cos(1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.xRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.zRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.armLeft.zRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.5F;
            this.upperArmRight.xRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F;
            this.upperArmRight.zRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.armRight.zRot = Mth.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.thighLeft.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.9F;
            this.upperLegLeft.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.thighRight.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.9F;
            this.upperLegRight.zRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
//            this.body.y = Mth.cos(0.8F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.02F;
            this.thighRight.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.footRight.yRot = Mth.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.thighLeft.yRot = Mth.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.footLeft.yRot = Mth.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.1F;

        }
    }
}
