package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BoxTurtleEntity;
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

public class BoxTurtleModel extends ZawaBaseModel<BoxTurtleEntity> {
    public ModelPart Shell;
    public ModelPart ShellFront;
    public ModelPart ShellBack;
    public ModelPart LeftLip;
    public ModelPart RightLip;
    public ModelPart Belly;
    public ModelPart LeftFrontLip;
    public ModelPart RightFrontLip;
    public ModelPart LeftTopLip;
    public ModelPart RightTopLip;
    public ModelPart Neck;
    public ModelPart LeftArm;
    public ModelPart RightArm;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart Mouth;
    public ModelPart Nose;
    public ModelPart SnoutFront;
    public ModelPart LeftForeArm;
    public ModelPart LeftHand;
    public ModelPart RightForeArm;
    public ModelPart RightHand;
    public ModelPart LeftBackLip2;
    public ModelPart RightBackLip2;
    public ModelPart LeftBackLip1;
    public ModelPart RightBackLip1;
    public ModelPart LeftLeg;
    public ModelPart RightLeg;
    public ModelPart LeftFoot;
    public ModelPart RightFoot;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Shell);
        }

        return this.parts;
    }

    public BoxTurtleModel(ModelPart root) {
        this.Shell = root.getChild("Shell");
        this.LeftTopLip = this.ShellFront.getChild("LeftTopLip");
        this.LeftHand = this.LeftForeArm.getChild("LeftHand");
        this.LeftFoot = this.LeftLeg.getChild("LeftFoot");
        this.Belly = this.Shell.getChild("Belly");
        this.LeftFrontLip = this.ShellFront.getChild("LeftFrontLip");
        this.LeftBackLip1 = this.ShellBack.getChild("LeftBackLip1");
        this.ShellFront = this.Shell.getChild("ShellFront");
        this.Neck = this.ShellFront.getChild("Neck");
        this.RightHand = this.RightForeArm.getChild("RightHand");
        this.LeftArm = this.ShellFront.getChild("LeftArm");
        this.RightArm = this.ShellFront.getChild("RightArm");
        this.RightLeg = this.ShellBack.getChild("RightLeg");
        this.LeftLeg = this.ShellBack.getChild("LeftLeg");
        this.RightBackLip1 = this.ShellBack.getChild("RightBackLip1");
        this.RightLip = this.Shell.getChild("RightLip");
        this.LeftBackLip2 = this.ShellBack.getChild("LeftBackLip2");
        this.RightTopLip = this.ShellFront.getChild("RightTopLip");
        this.LeftLip = this.Shell.getChild("LeftLip");
        this.ShellBack = this.Shell.getChild("ShellBack");
        this.Mouth = this.Head.getChild("Mouth");
        this.Head = this.Neck.getChild("Head");
        this.RightFrontLip = this.ShellFront.getChild("RightFrontLip");
        this.LeftForeArm = this.LeftArm.getChild("LeftForeArm");
        this.RightBackLip2 = this.ShellBack.getChild("RightBackLip2");
        this.RightFoot = this.RightLeg.getChild("RightFoot");
        this.SnoutFront = this.Snout.getChild("SnoutFront");
        this.RightForeArm = this.RightArm.getChild("RightForeArm");
        this.Snout = this.Head.getChild("Snout");
        this.Nose = this.Snout.getChild("Nose");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("LeftTopLip", CubeListBuilder.create().texOffs(51, 26).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.6829473549475088F, 0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(31, 15).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 1.6F, -1.3F, 0.18203784630933073F, 0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(23, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -0.6F, 1.8F, -0.3642502295386026F, -0.0911061832922575F, 0.0F));
        partDefinition.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(39, 31).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 2.2F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftFrontLip", CubeListBuilder.create().texOffs(41, 20).addBox(0.0F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 2.2F, -2.2F, 0.27314402127920984F, 0.7285004590772052F, 0.0F));
        partDefinition.addOrReplaceChild("LeftBackLip1", CubeListBuilder.create().texOffs(38, 16).addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 4.8F, 0.4098033003787853F, 0.13665927909957545F, 0.0F));
        partDefinition.addOrReplaceChild("ShellFront", CubeListBuilder.create().texOffs(25, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.45535640450848164F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 3.3F, -2.2F, -0.6829473549475088F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(34, 24).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 1.6F, -1.3F, 0.18203784630933073F, -0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("Shell", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -2.5F, -2.5F, 7.0F, 5.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 19.2F, 0.0F, -0.04555309164612875F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(18, 11).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(1.8F, 4.0F, -2.2F, 0.0911061832922575F, -0.500909508638178F, 0.0F));
        partDefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(18, 18).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-1.8F, 4.0F, -2.2F, 0.0911061832922575F, 0.500909508638178F, 0.0F));
        partDefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 27).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.9F, 3.4F, 3.4F, -0.45535640450848164F, -0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.9F, 3.4F, 3.4F, -0.45535640450848164F, 0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("RightBackLip1", CubeListBuilder.create().texOffs(47, 16).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, 4.8F, 0.4098033003787853F, -0.13665927909957545F, 0.0F));
        partDefinition.addOrReplaceChild("RightLip", CubeListBuilder.create().texOffs(51, 16).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(-3.5F, 1.8F, 0.0F, 0.0F, 0.0F, -0.9105382388075086F));
        partDefinition.addOrReplaceChild("LeftBackLip2", CubeListBuilder.create().texOffs(41, 10).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 2.0F, 3.0F, -0.27314402127920984F, 0.6829473549475088F, -0.27314402127920984F));
        partDefinition.addOrReplaceChild("RightTopLip", CubeListBuilder.create().texOffs(55, 23).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.6829473549475088F, -0.18203784630933073F, 0.0F));
        partDefinition.addOrReplaceChild("LeftLip", CubeListBuilder.create().texOffs(51, 9).addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F), PartPose.offsetAndRotation(3.5F, 1.8F, 0.0F, 0.0F, 0.0F, 0.9105382388075086F));
        partDefinition.addOrReplaceChild("ShellBack", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 2.5F, -0.7285004590772052F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -0.5F, -0.27314402127920984F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -4.5F, 0.27314402127920984F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightFrontLip", CubeListBuilder.create().texOffs(46, 20).addBox(-1.0F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 2.2F, -2.2F, 0.27314402127920984F, -0.7285004590772052F, 0.0F));
        partDefinition.addOrReplaceChild("LeftForeArm", CubeListBuilder.create().texOffs(28, 10).addBox(-0.9F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.9105382388075086F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightBackLip2", CubeListBuilder.create().texOffs(46, 10).addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 2.0F, 3.0F, -0.27314402127920984F, -0.7285004590772052F, 0.27314402127920984F));
        partDefinition.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(37, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -0.6F, 1.8F, -0.3642502295386026F, 0.0911061832922575F, 0.0F));
        partDefinition.addOrReplaceChild("SnoutFront", CubeListBuilder.create().texOffs(11, 21).addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -0.1F, 0.13665927909957545F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("RightForeArm", CubeListBuilder.create().texOffs(31, 19).addBox(-1.1F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.9105382388075086F, 0.0F, 0.0F));
        partDefinition.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, -0.2F, -0.3F));
        partDefinition.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(9, 26).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -1.0F, -1.2F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(BoxTurtleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.27F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.68F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 10.0f;
        float degree = 2.0f;
        this.LeftArm.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.09F;
        this.LeftForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.91F;
        this.LeftHand.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.18F;
        this.LeftLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.46F;
        this.LeftFoot.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.36F;
        this.RightArm.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.09F;
        this.RightForeArm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.91F;
        this.RightHand.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.18F;
        this.RightLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.46F;
        this.RightFoot.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.36F;
        this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Shell.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.8F * limbSwingAmount + 19F;
    }
}
