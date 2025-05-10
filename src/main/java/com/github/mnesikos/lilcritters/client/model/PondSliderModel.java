package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.PondSliderEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class PondSliderModel extends ZawaBaseModel<PondSliderEntity> {
    public ModelPart Shell;
    public ModelPart ShellFront;
    public ModelPart ShellBack;
    public ModelPart Belly;
    public ModelPart LeftLip;
    public ModelPart RightLip;
    public ModelPart LeftTopLip;
    public ModelPart LeftFrontLip;
    public ModelPart RightTopLip;
    public ModelPart RightFrontLip;
    public ModelPart LeftArm;
    public ModelPart RightArm;
    public ModelPart Neck;
    public ModelPart LeftForeArm;
    public ModelPart LeftHand;
    public ModelPart RightForeArm;
    public ModelPart RightHand;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart Mouth;
    public ModelPart Nose;
    public ModelPart SnoutFront;
    public ModelPart LeftLeg;
    public ModelPart RightLeg;
    public ModelPart LeftBackLip2;
    public ModelPart RightBackLip2;
    public ModelPart LeftBackLip1;
    public ModelPart RightBackLip1;
    public ModelPart Tail;
    public ModelPart LeftFoot;
    public ModelPart RightFoot;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Shell);
        }

        return this.parts;
    }

    public PondSliderModel(ModelPart root) {
        this.Shell = root.getChild("Shell");
        this.LeftTopLip = this.ShellFront.getChild("LeftTopLip");
        this.Snout = this.Head.getChild("Snout");
        this.RightArm = this.ShellFront.getChild("RightArm");
        this.LeftBackLip1 = this.ShellBack.getChild("LeftBackLip1");
        this.Tail = this.ShellBack.getChild("Tail");
        this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
        this.Mouth = this.Head.getChild("Mouth");
        this.LeftBackLip2 = this.ShellBack.getChild("LeftBackLip2");
        this.LeftLip = this.Shell.getChild("LeftLip");
        this.RightBackLip2 = this.ShellBack.getChild("RightBackLip2");
        this.RightTopLip = this.ShellFront.getChild("RightTopLip");
        this.Head = this.Neck.getChild("Head");
        this.LeftForeArm = this.LeftArm.getChild("LeftForeArm");
        this.RightBackLip1 = this.ShellBack.getChild("RightBackLip1");
        this.RightFoot = this.RightLeg.getChild("RightFoot");
        this.Belly = this.Shell.getChild("Belly");
        this.RightLeg = this.ShellBack.getChild("RightLeg");
        this.SnoutFront = this.Snout.getChild("SnoutFront");
        this.RightFrontLip = this.ShellFront.getChild("RightFrontLip");
        this.LeftHand = this.LeftForeArm.getChild("LeftHand");
        this.ShellBack = this.Shell.getChild("ShellBack");
        this.RightHand = this.RightForeArm.getChild("RightHand");
        this.ShellFront = this.Shell.getChild("ShellFront");
        this.RightForeArm = this.RightArm.getChild("RightForeArm");
        this.Nose = this.Snout.getChild("Nose");
        this.RightLip = this.Shell.getChild("RightLip");
        this.LeftFrontLip = this.ShellFront.getChild("LeftFrontLip");
        this.Neck = this.ShellFront.getChild("Neck");
        this.LeftLeg = this.ShellBack.getChild("LeftLeg");
        this.LeftArm = this.ShellFront.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("LeftTopLip", CubeListBuilder.create().texOffs(51, 26).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.6829473549475088F, 0.11222466790717915F, 0.0F));
        partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, -0.2F, -0.3F));
        partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(18, 18).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.8F, 2.2F, -1.7F, 0.20943951023931953F, 0.24434609527920614F, 0.0F));
        partDefinition.addOrReplaceChild("LeftBackLip1", CubeListBuilder.create().texOffs(38, 16).addBox(0.1F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.8F, 0.4098033003787853F, 0.13665927909957545F, 0.10471975511965977F));
        partDefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(31, 10).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 2.4F, 0.6981317007977318F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(23, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -0.6F, 1.8F, -0.3490658503988659F, -0.08726646259971647F, 0.0F));
        partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftBackLip2", CubeListBuilder.create().texOffs(41, 10).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 1.5F, 2.0F, -0.43022365395869955F, 0.6829473549475088F, -0.43022365395869955F));
        partDefinition.addOrReplaceChild("Shell", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.9F, -2.5F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offset(0.0F, 20.4F, 0.0F));
        partDefinition.addOrReplaceChild("LeftLip", CubeListBuilder.create().texOffs(48, 8).addBox(0.0F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(3.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.9105382388075086F));
        partDefinition.addOrReplaceChild("RightBackLip2", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 1.5F, 2.0F, -0.43022365395869955F, -0.7285004590772052F, 0.43022365395869955F));
        partDefinition.addOrReplaceChild("RightTopLip", CubeListBuilder.create().texOffs(55, 23).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.6829473549475088F, -0.11222466790717915F, 0.0F));
        partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -4.5F, 0.27314402127920984F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftForeArm", CubeListBuilder.create().texOffs(31, 19).addBox(-0.9F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.9075712110370513F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightBackLip1", CubeListBuilder.create().texOffs(47, 16).addBox(-3.1F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 3.8F, 0.4098033003787853F, -0.13665927909957545F, -0.10471975511965977F));
        partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(37, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -0.6F, 1.8F, -0.3490658503988659F, 0.08726646259971647F, 0.0F));
        partDefinition.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(37, 31).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 0.9F, 0.0F, -0.03490658503988659F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 27).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-2.0F, 2.6F, 2.1F, -0.7853981633974483F, -0.17453292519943295F, 0.0F));
        partDefinition.addOrReplaceChild("SnoutFront", CubeListBuilder.create().texOffs(11, 21).addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.13665927909957545F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightFrontLip", CubeListBuilder.create().texOffs(46, 20).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-3.1F, 1.7F, -2.0F, 0.3953170689188129F, -0.7285004590772052F, -0.13962634015954636F));
        partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 1.6F, -1.3F, 0.17453292519943295F, 0.17453292519943295F, 0.0F));
        partDefinition.addOrReplaceChild("ShellBack", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, 0.1F, 0.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.1F, 0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 2.5F, -0.3839724354387525F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 1.6F, -1.3F, 0.17453292519943295F, -0.17453292519943295F, 0.0F));
        partDefinition.addOrReplaceChild("ShellFront", CubeListBuilder.create().texOffs(25, 0).addBox(-3.0F, 0.2F, -3.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F, 0.2F, -0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.5F, 0.3141592653589793F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(31, 19).addBox(-1.1F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.9075712110370513F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(9, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -1.0F, -1.2F));
        partDefinition.addOrReplaceChild("RightLip", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(-3.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.9105382388075086F));
        partDefinition.addOrReplaceChild("LeftFrontLip", CubeListBuilder.create().texOffs(41, 20).addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(3.1F, 1.7F, -2.0F, 0.3953170689188129F, 0.7285004590772052F, 0.13962634015954636F));
        partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 2.3F, -1.7F, -0.4211479338588457F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(2.0F, 2.6F, 2.1F, -0.7853981633974483F, 0.17453292519943295F, 0.0F));
        partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(18, 18).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.8F, 2.2F, -1.7F, 0.20943951023931953F, -0.24434609527920614F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(PondSliderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.27F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.42F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 10.0f;
        float degree = 2.0f;
        this.LeftArm.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.21F;
        this.LeftForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.9F;
        this.LeftHand.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.17F;
        this.LeftLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.78F;
        this.LeftFoot.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
        this.RightArm.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.21F;
        this.RightForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.9F;
        this.RightHand.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.17F;
        this.RightLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.78F;
        this.RightFoot.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
        this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Shell.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.8F * limbSwingAmount + 20.4F;
    }
}
