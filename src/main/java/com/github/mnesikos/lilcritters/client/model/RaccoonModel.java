package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.RaccoonEntity;
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

public class RaccoonModel extends ZawaBaseModel<RaccoonEntity> {
    public ModelPart Body;
    public ModelPart Butt;
    public ModelPart neck;
    public ModelPart chestLower;
    public ModelPart RightBicep;
    public ModelPart LeftBicep;
    public ModelPart tail1;
    public ModelPart LeftThigh;
    public ModelPart bellyLower;
    public ModelPart RightThigh;
    public ModelPart tail2;
    public ModelPart tail3;
    public ModelPart tail4;
    public ModelPart tail5;
    public ModelPart LeftUpperLeg;
    public ModelPart LeftLeg;
    public ModelPart LeftFoot;
    public ModelPart RightUpperLeg;
    public ModelPart RightLeg;
    public ModelPart RightFoot;
    public ModelPart neckLower;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart LeftEar;
    public ModelPart RightEar;
    public ModelPart LeftCheek;
    public ModelPart RightCheek;
    public ModelPart Chin;
    public ModelPart Nose;
    public ModelPart NoseEnd;
    public ModelPart RightForearm;
    public ModelPart RightHand;
    public ModelPart LeftForearm;
    public ModelPart LeftHand;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public RaccoonModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.LeftBicep = this.Body.getChild("LeftBicep");
        this.LeftForearm = this.LeftBicep.getChild("LeftForearm");
        this.LeftHand = this.LeftForearm.getChild("LeftHand");

        this.RightBicep = this.Body.getChild("RightBicep");
        this.RightForearm = this.RightBicep.getChild("RightForearm");
        this.RightHand = this.RightForearm.getChild("RightHand");

        this.Butt = this.Body.getChild("Butt");
        this.bellyLower = this.Butt.getChild("bellyLower");

        this.tail1 = this.Butt.getChild("tail1");
        this.tail2 = this.tail1.getChild("tail2");
        this.tail3 = this.tail2.getChild("tail3");
        this.tail4 = this.tail3.getChild("tail4");
        this.tail5 = this.tail4.getChild("tail5");

        this.LeftThigh = this.Butt.getChild("LeftThigh");
        this.LeftUpperLeg = this.LeftThigh.getChild("LeftUpperLeg");
        this.LeftLeg = this.LeftUpperLeg.getChild("LeftLeg");
        this.LeftFoot = this.LeftLeg.getChild("LeftFoot");

        this.RightThigh = this.Butt.getChild("RightThigh");
        this.RightUpperLeg = this.RightThigh.getChild("RightUpperLeg");
        this.RightLeg = this.RightUpperLeg.getChild("RightLeg");
        this.RightFoot = this.RightLeg.getChild("RightFoot");

        this.chestLower = this.Body.getChild("chestLower");

        this.neck = this.Body.getChild("neck");
        this.neckLower = this.neck.getChild("neckLower");

        this.Head = this.neck.getChild("Head");
        this.RightCheek = this.Head.getChild("RightCheek");

        this.Snout = this.Head.getChild("Snout");
        this.Chin = this.Snout.getChild("Chin");

        this.Nose = this.Snout.getChild("Nose");
        this.NoseEnd = this.Nose.getChild("NoseEnd");

        this.LeftCheek = this.Head.getChild("LeftCheek");

        this.LeftEar = this.Head.getChild("LeftEar");

        this.RightEar = this.Head.getChild("RightEar");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.5F, -4.0F, 6, 6, 8), PartPose.offsetAndRotation(0.0F, 17.8F, 0.0F, 0.08726646259971647F, 0.0F, 0.0F));
        PartDefinition LeftBicep = Body.addOrReplaceChild("LeftBicep", CubeListBuilder.create().texOffs(40, 14).addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3), PartPose.offsetAndRotation(2.0F, -0.5F, -2.8F, 0.08726646259971647F, 0.08726646259971647F, 0.0F));
        PartDefinition LeftForearm = LeftBicep.addOrReplaceChild("LeftForearm", CubeListBuilder.create().texOffs(18, 31).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 1.0F, -0.4363323129985824F, 0.0F, 0.0F));
        PartDefinition LeftHand = LeftForearm.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(12, 38).addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3), PartPose.offsetAndRotation(0.01F, 3.8F, -1.0F, 0.2617993877991494F, 0.0F, 0.0F));

        PartDefinition RightBicep = Body.addOrReplaceChild("RightBicep", CubeListBuilder.create().texOffs(40, 14).mirror(true).addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3), PartPose.offsetAndRotation(-2.0F, -0.5F, -2.8F, 0.08726646259971647F, -0.08726646259971647F, 0.0F));
        PartDefinition RightForearm = RightBicep.addOrReplaceChild("RightForearm", CubeListBuilder.create().texOffs(18, 31).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 1.0F, -0.4363323129985824F, 0.0F, 0.0F));
        PartDefinition RightHand = RightForearm.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(12, 38).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3), PartPose.offsetAndRotation(-0.01F, 3.8F, -1.0F, 0.2617993877991494F, 0.0F, 0.0F));

        PartDefinition Butt = Body.addOrReplaceChild("Butt", CubeListBuilder.create().texOffs(28, 0).addBox(-3.5F, -4.0F, 0.0F, 7, 7, 7), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.2617993877991494F, 0.0F, 0.0F));
        PartDefinition bellyLower = Butt.addOrReplaceChild("bellyLower", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -1.0F, -6.0F, 6, 1, 6), PartPose.offsetAndRotation(0.0F, 3.0F, 6.1F, 0.13962634015954636F, 0.0F, 0.0F));

        PartDefinition tail1 = Butt.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(15, 22).addBox(-3.0F, -3.0F, -1.5F, 6, 6, 3), PartPose.offsetAndRotation(0.0F, -0.5F, 7.0F, -0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(24, 32).addBox(-2.5F, -2.5F, -1.5F, 5, 5, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, -0.12217304763960307F, 0.0F, 0.0F));
        PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(37, 37).addBox(-3.0F, -2.5F, -1.0F, 6, 6, 7), PartPose.offsetAndRotation(0.0F, -0.3F, 3.5F, -0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -2.0F, -1.0F, 4, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 0.2F, 2.0F, -0.17453292519943295F, 0.0F, 0.0F));

        PartDefinition LeftThigh = Butt.addOrReplaceChild("LeftThigh", CubeListBuilder.create().texOffs(33, 22).addBox(-2.5F, -1.0F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(3.7F, -0.5F, 4.5F, -0.17453292519943295F, -0.08726646259971647F, -0.08726646259971647F));
        PartDefinition LeftUpperLeg = LeftThigh.addOrReplaceChild("LeftUpperLeg", CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2), PartPose.offsetAndRotation(-1.0F, 5.0F, -1.0F, 0.9599310885968813F, 0.0F, 0.0F));
        PartDefinition LeftLeg = LeftUpperLeg.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.02F, 3.0F, 2.0F, -0.9599310885968813F, 0.0F, 0.0F));
        PartDefinition LeftFoot = LeftLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create().texOffs(25, 2).addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3), PartPose.offsetAndRotation(0.01F, 2.0F, -1.0F, 0.3490658503988659F, 0.0F, 0.08726646259971647F));

        PartDefinition RightThigh = Butt.addOrReplaceChild("RightThigh", CubeListBuilder.create().texOffs(33, 22).mirror(true).addBox(-0.5F, -1.0F, -2.0F, 3, 6, 4), PartPose.offsetAndRotation(-3.7F, -0.5F, 4.5F, -0.17453292519943295F, 0.08726646259971647F, 0.08726646259971647F));
        PartDefinition RightUpperLeg = RightThigh.addOrReplaceChild("RightUpperLeg", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2), PartPose.offsetAndRotation(1.0F, 5.0F, -1.0F, 0.9599310885968813F, 0.0F, 0.0F));
        PartDefinition RightLeg = RightUpperLeg.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(49, 0).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.02F, 3.0F, 2.0F, -0.9599310885968813F, 0.0F, 0.0F));
        PartDefinition RightFoot = RightLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create().texOffs(25, 2).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3), PartPose.offsetAndRotation(-0.01F, 2.0F, -1.0F, 0.3490658503988659F, 0.0F, -0.08726646259971647F));

        PartDefinition chestLower = Body.addOrReplaceChild("chestLower", CubeListBuilder.create().texOffs(18, 14).addBox(-2.5F, -1.8F, 0.0F, 5, 2, 6), PartPose.offsetAndRotation(0.0F, 2.5F, -3.5F, -0.17453292519943295F, 0.0F, 0.0F));

        PartDefinition neck = Body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -2.5F, -3.5F, 4, 4, 5), PartPose.offsetAndRotation(0.0F, -0.5F, -4.0F, -0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition neckLower = neck.addOrReplaceChild("neckLower", CubeListBuilder.create().texOffs(0, 38).addBox(-1.5F, -2.0F, -0.5F, 3, 2, 6), PartPose.offsetAndRotation(0.0F, 1.5F, -4.0F, -0.22689280275926282F, 0.0F, 0.0F));

        PartDefinition Head = neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 42).addBox(-2.5F, -2.5F, -3.0F, 5, 5, 4), PartPose.offsetAndRotation(0.0F, -0.5F, -2.5F, 0.2617993877991494F, 0.0F, 0.0F));
        PartDefinition RightCheek = Head.addOrReplaceChild("RightCheek", CubeListBuilder.create().texOffs(30, 50).mirror(true).addBox(-4.0F, -2.0F, -1.0F, 4, 4, 2), PartPose.offsetAndRotation(0.0F, 0.95F, -2.0F, 0.0F, 0.4363323129985824F, 0.17453292519943295F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 46).addBox(-1.5F, -2.0F, -2.5F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, 1.6F, -2.5F, 0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition Chin = Snout.addOrReplaceChild("Chin", CubeListBuilder.create().texOffs(52, 16).addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, -0.2F, -0.8F, -0.2617993877991494F, 0.0F, 0.0F));

        PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.0F, -0.5F, 2, 2, 4), PartPose.offsetAndRotation(0.0F, -2.1F, -2.5F, 0.2617993877991494F, 0.0F, 0.0F));
        PartDefinition NoseEnd = Nose.addOrReplaceChild("NoseEnd", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1), PartPose.offset(0.0F, 0.4F, -0.1F));

        PartDefinition LeftCheek = Head.addOrReplaceChild("LeftCheek", CubeListBuilder.create().texOffs(30, 50).addBox(0.0F, -2.0F, -1.0F, 4, 4, 2), PartPose.offsetAndRotation(0.0F, 0.95F, -2.0F, 0.0F, -0.4363323129985824F, -0.17453292519943295F));

        PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -1.0F, -1.0F, 3, 2, 1), PartPose.offsetAndRotation(1.3F, -2.7F, 0.0F, 0.0F, -0.17453292519943295F, 0.2617993877991494F));

        PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(0, 5).mirror(true).addBox(-2.0F, -1.0F, -1.0F, 3, 2, 1), PartPose.offsetAndRotation(-1.3F, -2.7F, 0.0F, 0.0F, 0.17453292519943295F, -0.2617993877991494F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void setupAnim(RaccoonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.Head.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.18F;
        this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 0.26F;
        this.LeftEar.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.26F;
        this.RightEar.zRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.26F;
        this.tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.04F;
        this.tail3.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.18F;
        this.tail4.xRot = Mth.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.1F;
        this.tail5.xRot = Mth.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.1F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 4.0f;
        float degree = 0.5f;
        if (entity.isInWater()) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
        }
        if (((RaccoonEntity) entity).isBaby())
            this.neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.40F;
        else
            this.neck.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.17F;

        this.LeftBicep.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount;
        this.LeftForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.5F;
        this.LeftHand.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.3F;
        this.RightBicep.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount;
        this.RightForearm.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.5F;
        this.RightHand.xRot = Mth.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.3F;
        this.LeftThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 1.0F;
        this.LeftFoot.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
        this.RightThigh.xRot = Mth.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 1.0F;
        this.RightFoot.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.2F;
//        this.Body.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.01F;
        this.Body.xRot = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.14F;
        this.Body.zRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount;
        this.LeftUpperLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 1.0F;
        this.RightUpperLeg.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 1.0F;
        this.tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.1F;
        this.tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.1F;
        this.tail4.xRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.1F;
        this.tail5.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.1F;
    }
}
