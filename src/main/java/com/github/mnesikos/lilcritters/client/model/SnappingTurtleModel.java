package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SnappingTurtleEntity;
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

public class SnappingTurtleModel extends ZawaBaseModel<SnappingTurtleEntity> {
    public ModelPart Shell;
    public ModelPart Belly;
    public ModelPart LeftLip;
    public ModelPart LipMiddleFront;
    public ModelPart LipMiddleBack;
    public ModelPart ArmLeft;
    public ModelPart LegLeft;
    public ModelPart Tail1;
    public ModelPart Neck;
    public ModelPart Connection1;
    public ModelPart Connection3;
    public ModelPart Connection4;
    public ModelPart Connection5;
    public ModelPart LegRight;
    public ModelPart LeftLip_1;
    public ModelPart ArmRight;
    public ModelPart LipTopLeftFront;
    public ModelPart LipTopRightFront;
    public ModelPart LipLeftFront;
    public ModelPart LipRightFront;
    public ModelPart LipTopLeftBack;
    public ModelPart LipTopRightBack;
    public ModelPart LipLeftBack;
    public ModelPart LipRightBack;
    public ModelPart ForeArmLeft;
    public ModelPart HandLeft;
    public ModelPart FootLeft;
    public ModelPart Tail2;
    public ModelPart Head;
    public ModelPart Jaw;
    public ModelPart Beak;
    public ModelPart CommonSnapperEyeLeft;
    public ModelPart AlligatorSnapperEyeLeft;
    public ModelPart CommonSnapperEyeRight;
    public ModelPart AlligatorSnapperEyeRight;
    public ModelPart Mouth;
    public ModelPart Beak1;
    public ModelPart Beak2;
    public ModelPart SpikeRight1;
    public ModelPart SpikeMiddle1;
    public ModelPart SpikeLeft1;
    public ModelPart SpikeRight3;
    public ModelPart SpikeMiddle3;
    public ModelPart SpikeLeft3;
    public ModelPart SpikeRight4;
    public ModelPart SpikeMiddle4;
    public ModelPart SpikeLeft4;
    public ModelPart SpikeRight5;
    public ModelPart SpikeMiddle5;
    public ModelPart SpikeLeft5;
    public ModelPart FootRight;
    public ModelPart ForeArmRight;
    public ModelPart HandRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Shell);

        return parts;
    }

    public SnappingTurtleModel(ModelPart root) {
        this.Shell = root.getChild("Shell");
        this.Connection5 = this.Shell.getChild("Connection5");
        this.SpikeLeft5 = this.Connection5.getChild("SpikeLeft5");

        this.SpikeMiddle5 = this.Connection5.getChild("SpikeMiddle5");

        this.SpikeRight5 = this.Connection5.getChild("SpikeRight5");

        this.ArmRight = this.Shell.getChild("ArmRight");
        this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
        this.HandRight = this.ForeArmRight.getChild("HandRight");

        this.LipMiddleFront = this.Shell.getChild("LipMiddleFront");
        this.LipTopLeftFront = this.LipMiddleFront.getChild("LipTopLeftFront");
        this.LipLeftFront = this.LipTopLeftFront.getChild("LipLeftFront");

        this.LipTopRightFront = this.LipMiddleFront.getChild("LipTopRightFront");
        this.LipRightFront = this.LipTopRightFront.getChild("LipRightFront");

        this.LeftLip_1 = this.Shell.getChild("LeftLip_1");

        this.Belly = this.Shell.getChild("Belly");

        this.LeftLip = this.Shell.getChild("LeftLip");

        this.ArmLeft = this.Shell.getChild("ArmLeft");
        this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
        this.HandLeft = this.ForeArmLeft.getChild("HandLeft");

        this.LegRight = this.Shell.getChild("LegRight");
        this.FootRight = this.LegRight.getChild("FootRight");

        this.Connection4 = this.Shell.getChild("Connection4");
        this.SpikeLeft4 = this.Connection4.getChild("SpikeLeft4");

        this.SpikeRight4 = this.Connection4.getChild("SpikeRight4");

        this.SpikeMiddle4 = this.Connection4.getChild("SpikeMiddle4");

        this.Neck = this.Shell.getChild("Neck");
        this.Head = this.Neck.getChild("Head");
        this.CommonSnapperEyeRight = this.Head.getChild("CommonSnapperEyeRight");

        this.AlligatorSnapperEyeRight = this.Head.getChild("AlligatorSnapperEyeRight");

        this.Jaw = this.Head.getChild("Jaw");
        this.Mouth = this.Jaw.getChild("Mouth");

        this.CommonSnapperEyeLeft = this.Head.getChild("CommonSnapperEyeLeft");

        this.Beak = this.Head.getChild("Beak");
        this.Beak1 = this.Beak.getChild("Beak1");
        this.Beak2 = this.Beak1.getChild("Beak2");

        this.AlligatorSnapperEyeLeft = this.Head.getChild("AlligatorSnapperEyeLeft");

        this.Tail1 = this.Shell.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");

        this.Connection1 = this.Shell.getChild("Connection1");
        this.SpikeRight1 = this.Connection1.getChild("SpikeRight1");

        this.SpikeLeft1 = this.Connection1.getChild("SpikeLeft1");

        this.SpikeMiddle1 = this.Connection1.getChild("SpikeMiddle1");

        this.Connection3 = this.Shell.getChild("Connection3");
        this.SpikeLeft3 = this.Connection3.getChild("SpikeLeft3");

        this.SpikeMiddle3 = this.Connection3.getChild("SpikeMiddle3");

        this.SpikeRight3 = this.Connection3.getChild("SpikeRight3");

        this.LegLeft = this.Shell.getChild("LegLeft");
        this.FootLeft = this.LegLeft.getChild("FootLeft");

        this.LipMiddleBack = this.Shell.getChild("LipMiddleBack");
        this.LipTopLeftBack = this.LipMiddleBack.getChild("LipTopLeftBack");
        this.LipLeftBack = this.LipTopLeftBack.getChild("LipLeftBack");

        this.LipTopRightBack = this.LipMiddleBack.getChild("LipTopRightBack");
        this.LipRightBack = this.LipTopRightBack.getChild("LipRightBack");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Shell = partDefinition.addOrReplaceChild("Shell", CubeListBuilder.create().texOffs(20, 0).addBox(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 12.0F), PartPose.offset(0.0F, 20.0F, 0.0F));
        PartDefinition Connection5 = Shell.addOrReplaceChild("Connection5", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 9.5F));
        PartDefinition SpikeLeft5 = Connection5.addOrReplaceChild("SpikeLeft5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeMiddle5 = Connection5.addOrReplaceChild("SpikeMiddle5", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeRight5 = Connection5.addOrReplaceChild("SpikeRight5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition ArmRight = Shell.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-3.0F, 1.0F, -5.0F, 0.36582099523904493F, 0.24434609527920614F, 0.0F));
        PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(0, 49).addBox(-1.6F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -3.0F, 1.0250318617067866F, 0.0F, 0.0F));
        PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(3, 38).addBox(-1.5F, -1.8F, -1.0F, 3.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 1.5F, -2.1F, 0.1354375539495016F, 0.020943951856169794F, 0.0F));

        PartDefinition LipMiddleFront = Shell.addOrReplaceChild("LipMiddleFront", CubeListBuilder.create().texOffs(17, 0).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.1F, -5.6F, -0.5473352640780661F, 0.0F, 0.0F));
        PartDefinition LipTopLeftFront = LipMiddleFront.addOrReplaceChild("LipTopLeftFront", CubeListBuilder.create().texOffs(20, 3).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(1.5F, 0.01F, -0.25F, 0.0F, -0.5082398928281348F, 0.0F));
        PartDefinition LipLeftFront = LipTopLeftFront.addOrReplaceChild("LipLeftFront", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.5F, 0.5F, -1.5F, 0.7819074915776542F, 0.0F, -0.5864306020384839F));

        PartDefinition LipTopRightFront = LipMiddleFront.addOrReplaceChild("LipTopRightFront", CubeListBuilder.create().texOffs(20, 3).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-1.5F, 0.01F, -0.25F, 0.0F, 0.5082398928281348F, 0.0F));
        PartDefinition LipRightFront = LipTopRightFront.addOrReplaceChild("LipRightFront", CubeListBuilder.create().texOffs(10, 0).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, 0.5F, -1.5F, 0.7819074915776542F, 0.0F, 0.5864306020384839F));

        PartDefinition LeftLip_1 = Shell.addOrReplaceChild("LeftLip_1", CubeListBuilder.create().texOffs(4, 10).addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F), PartPose.offsetAndRotation(-5.5F, 1.0F, 0.01F, 0.0F, 0.0F, -0.5864306020384839F));

        PartDefinition Belly = Shell.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(24, 15).addBox(-4.5F, 0.0F, -5.5F, 9.0F, 2.0F, 11.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.03490658503988659F, 0.0F, 0.001745329278001762F));

        PartDefinition LeftLip = Shell.addOrReplaceChild("LeftLip", CubeListBuilder.create().texOffs(4, 10).addBox(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F), PartPose.offsetAndRotation(5.5F, 1.0F, 0.01F, 0.0F, 0.0F, 0.5864306020384839F));

        PartDefinition ArmLeft = Shell.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 42).mirror(true).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(3.0F, 1.0F, -5.0F, 0.36582099523904493F, -0.24434609527920614F, 0.0F));
        PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(0, 49).mirror(true).addBox(-1.4F, 0.0F, -3.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -1.5F, -3.0F, 1.0250318617067866F, 0.0F, 0.0F));
        PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(3, 38).mirror(true).addBox(-1.5F, -1.8F, -1.0F, 3.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 1.5F, -2.1F, 0.1354375539495016F, -0.020943951856169794F, 0.0F));

        PartDefinition LegRight = Shell.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 30).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-3.5F, 1.0F, 4.5F, -1.1763519424757891F, 0.0F, 0.17453292519943295F));
        PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(11, 38).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, -0.6F, 2.7F, -0.1926843487543837F, 0.3839724354387525F, 0.6981317007977318F));

        PartDefinition Connection4 = Shell.addOrReplaceChild("Connection4", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 6.5F));
        PartDefinition SpikeLeft4 = Connection4.addOrReplaceChild("SpikeLeft4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeRight4 = Connection4.addOrReplaceChild("SpikeRight4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeMiddle4 = Connection4.addOrReplaceChild("SpikeMiddle4", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition Neck = Shell.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(48, 32).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -6.0F, 0.21327923925423897F, 0.0F, 0.0F));
        PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(29, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -3.5F, -0.27366763203903305F, 0.0F, 0.0F));
        PartDefinition CommonSnapperEyeRight = Head.addOrReplaceChild("CommonSnapperEyeRight", CubeListBuilder.create().texOffs(46, 33).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.5F, -2.0F, 0.19547687289441354F, -0.27366763203903305F, 0.0F));

        PartDefinition AlligatorSnapperEyeRight = Head.addOrReplaceChild("AlligatorSnapperEyeRight", CubeListBuilder.create().texOffs(42, 34).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.7F, 0.2F, -1.6F, 0.19547687289441354F, -0.27366763203903305F, 0.0F));

        PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(50, 40).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offset(0.0F, 1.0F, 2.0F));
        PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(40, 41).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -2.9F, -0.19896752806945084F, 0.0F, 0.0F));

        PartDefinition CommonSnapperEyeLeft = Head.addOrReplaceChild("CommonSnapperEyeLeft", CubeListBuilder.create().texOffs(46, 33).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.5F, -2.0F, 0.19547687289441354F, 0.27366763203903305F, 0.0F));

        PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(40, 29).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -1.3F, 0.3127630032889644F, 0.0F, 0.0F));
        PartDefinition Beak1 = Beak.addOrReplaceChild("Beak1", CubeListBuilder.create().texOffs(50, 28).addBox(-0.5F, -0.4F, -0.3F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.7428121536172364F, 0.0F, 0.0F));
        PartDefinition Beak2 = Beak1.addOrReplaceChild("Beak2", CubeListBuilder.create().texOffs(55, 28).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.01F, 0.2F, 0.0F, 1.0164797856562695F, 0.0F, 0.0F));

        PartDefinition AlligatorSnapperEyeLeft = Head.addOrReplaceChild("AlligatorSnapperEyeLeft", CubeListBuilder.create().texOffs(42, 34).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.7F, 0.2F, -1.6F, 0.19547687289441354F, 0.27366763203903305F, 0.0F));

        PartDefinition Tail1 = Shell.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.8F, 5.5F, -0.39112828270876815F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.23457224414434488F, 0.0F, 0.0F));

        PartDefinition Connection1 = Shell.addOrReplaceChild("Connection1", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 0.0F));
        PartDefinition SpikeRight1 = Connection1.addOrReplaceChild("SpikeRight1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, -1.6F, -5.5F, -0.9068730633572871F, 0.0F, 0.0F));

        PartDefinition SpikeLeft1 = Connection1.addOrReplaceChild("SpikeLeft1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(3.0F, -1.6F, -5.5F, -0.9068730633572871F, 0.0F, 0.0F));

        PartDefinition SpikeMiddle1 = Connection1.addOrReplaceChild("SpikeMiddle1", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -5.5F, -0.9066985597268595F, 0.0F, 0.0F));

        PartDefinition Connection3 = Shell.addOrReplaceChild("Connection3", CubeListBuilder.create().texOffs(0, 60).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offset(0.0F, 0.4F, 3.5F));
        PartDefinition SpikeLeft3 = Connection3.addOrReplaceChild("SpikeLeft3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeMiddle3 = Connection3.addOrReplaceChild("SpikeMiddle3", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(0.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition SpikeRight3 = Connection3.addOrReplaceChild("SpikeRight3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F), PartPose.offsetAndRotation(-3.0F, -1.6F, -5.5F, -0.5864306020384839F, 0.0F, 0.0F));

        PartDefinition LegLeft = Shell.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 30).mirror(true).addBox(-1.5F, -2.0F, -1.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(3.5F, 1.0F, 4.5F, -1.1763519424757891F, 0.0F, -0.17453292519943295F));
        PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(11, 38).mirror(true).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, -0.6F, 2.7F, -0.1926843487543837F, -0.3839724354387525F, -0.6981317007977318F));

        PartDefinition LipMiddleBack = Shell.addOrReplaceChild("LipMiddleBack", CubeListBuilder.create().texOffs(17, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.1F, 6.0F, 0.3909537457888271F, 0.0F, 0.0F));
        PartDefinition LipTopLeftBack = LipMiddleBack.addOrReplaceChild("LipTopLeftBack", CubeListBuilder.create().texOffs(20, 3).addBox(0.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(2.5F, 0.01F, 2.0F, 0.0F, 0.5082398928281348F, 0.0F));
        PartDefinition LipLeftBack = LipTopLeftBack.addOrReplaceChild("LipLeftBack", CubeListBuilder.create().texOffs(10, 0).addBox(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(2.5F, 0.5F, -0.2F, -0.7826056392574184F, 0.0F, -0.5473352640780661F));

        PartDefinition LipTopRightBack = LipMiddleBack.addOrReplaceChild("LipTopRightBack", CubeListBuilder.create().texOffs(20, 3).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-2.5F, 0.01F, 2.0F, 0.0F, -0.5082398928281348F, 0.0F));
        PartDefinition LipRightBack = LipTopRightBack.addOrReplaceChild("LipRightBack", CubeListBuilder.create().texOffs(10, 0).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, 0.5F, -0.2F, -0.7826056392574184F, 0.0F, 0.5473352640780661F));

        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 1.0f;
        float degree = 1.0f;
        this.Neck.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.21F;
        this.Head.xRot = Mth.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.27F;
        this.Tail1.yRot = Mth.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float speed = 8.0f;
        float degree = 2.0f;
        this.ArmLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.37F;
        this.ForeArmLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 1.03F;
        this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.14F;
        this.LegLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 1.18F;
        this.FootLeft.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.19F;
        this.ArmRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.37F;
        this.ForeArmRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 1.03F;
        this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.14F;
        this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 1.18F;
        this.FootRight.xRot = Mth.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.19F;
        this.Neck.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Shell.y = Mth.cos(limbSwing * speed * 0.4F) * degree * 0.8F * limbSwingAmount + 20F;
        this.Tail1.yRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.4F * limbSwingAmount;
        this.Tail2.yRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.3F * limbSwingAmount;
    }
}
