package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.FruitBatEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class FruitBatModel extends ZawaBaseModel<FruitBatEntity> {
    public ModelPart Chest;
    public ModelPart Neck;
    public ModelPart Body;
    public ModelPart UpperArmLeft;
    public ModelPart UpperArmRight;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart SnoutTop;
    public ModelPart Mouth;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart ArmLeft;
    public ModelPart lMembrane3;
    public ModelPart FingerLeft;
    public ModelPart FingerLeftLeft;
    public ModelPart FingerMiddleLeft;
    public ModelPart FingerRightLeft;
    public ModelPart ArmRight;
    public ModelPart rMembrane3;
    public ModelPart FingerRight;
    public ModelPart FingerLeftRight;
    public ModelPart FingerMiddleRight;
    public ModelPart FingerRightRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Chest);
        return parts;
    }

    public static class Adult extends FruitBatModel {
        public ModelPart lMembrane;
        public ModelPart lMembrane1;
        public ModelPart lMembrane2;
        public ModelPart rMembrane;
        public ModelPart rMembrane1;
        public ModelPart rMembrane2;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.lMembrane3 = this.UpperArmLeft.getChild("lMembrane3");

            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.FingerMiddleLeft = this.ArmLeft.getChild("FingerMiddleLeft");
            this.lMembrane1 = this.FingerMiddleLeft.getChild("lMembrane1");

            this.FingerLeftLeft = this.ArmLeft.getChild("FingerLeftLeft");
            this.lMembrane = this.FingerLeftLeft.getChild("lMembrane");

            this.FingerRightLeft = this.ArmLeft.getChild("FingerRightLeft");
            this.lMembrane2 = this.FingerRightLeft.getChild("lMembrane2");

            this.FingerLeft = this.ArmLeft.getChild("FingerLeft");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.rMembrane3 = this.UpperArmRight.getChild("rMembrane3");

            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.FingerLeftRight = this.ArmRight.getChild("FingerLeftRight");
            this.rMembrane = this.FingerLeftRight.getChild("rMembrane");

            this.FingerMiddleRight = this.ArmRight.getChild("FingerMiddleRight");
            this.rMembrane1 = this.FingerMiddleRight.getChild("rMembrane1");

            this.FingerRightRight = this.ArmRight.getChild("FingerRightRight");
            this.rMembrane2 = this.FingerRightRight.getChild("rMembrane2");

            this.FingerRight = this.ArmRight.getChild("FingerRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Body = this.Chest.getChild("Body");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, 0.0F, -0.5F, 9.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(2.5F, -1.0F, -2.0F, -0.19530233597447247F, 0.23457224414434488F, 0.0F));
            PartDefinition lMembrane3 = UpperArmLeft.addOrReplaceChild("lMembrane3", CubeListBuilder.create().texOffs(-13, 48).addBox(-1.5F, 0.2F, 0.0F, 10.0F, 0.0F, 16.0F), PartPose.offset(0.0F, -0.04F, 0.0F));

            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 40).addBox(-0.3F, 0.0F, -0.5F, 11.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(9.0F, 0.02F, 0.0F, 0.0F, 0.7037167490777915F, 0.0F));
            PartDefinition FingerMiddleLeft = ArmLeft.addOrReplaceChild("FingerMiddleLeft", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0F, -0.5F, 20.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.01F, 0.0F, 0.0F, -1.1730357742864224F, 0.0F));
            PartDefinition lMembrane1 = FingerMiddleLeft.addOrReplaceChild("lMembrane1", CubeListBuilder.create().texOffs(12, 35).addBox(-0.6F, 0.2F, 0.0F, 19.0F, 0.0F, 13.0F), PartPose.offset(0.0F, -0.04F, 0.0F));

            PartDefinition FingerLeftLeft = ArmLeft.addOrReplaceChild("FingerLeftLeft", CubeListBuilder.create().texOffs(18, 12).addBox(0.0F, 0.0F, -0.5F, 22.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, -0.0F, 0.0F, 0.0F, -0.7819074915776542F, 0.0F));
            PartDefinition lMembrane = FingerLeftLeft.addOrReplaceChild("lMembrane", CubeListBuilder.create().texOffs(17, 27).addBox(-0.5F, 0.2F, 0.0F, 19.0F, 0.0F, 8.0F), PartPose.offset(3.0F, -0.04F, 0.0F));

            PartDefinition FingerRightLeft = ArmLeft.addOrReplaceChild("FingerRightLeft", CubeListBuilder.create().texOffs(26, 3).addBox(0.0F, 0.0F, -0.5F, 18.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.02F, 0.0F, 0.0F, -1.8767525233642137F, 0.0F));
            PartDefinition lMembrane2 = FingerRightLeft.addOrReplaceChild("lMembrane2", CubeListBuilder.create().texOffs(8, 48).addBox(0.4F, 0.2F, 0.0F, 20.0F, 0.0F, 16.0F), PartPose.offset(-0.2F, -0.04F, 0.3F));

            PartDefinition FingerLeft = ArmLeft.addOrReplaceChild("FingerLeft", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.02F, 0.0F, 0.0F, 0.5475098009980072F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(0, 35).mirror(true).addBox(-9.0F, 0.0F, -0.5F, 9.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-2.5F, -1.0F, -2.0F, -0.19530233597447247F, -0.23457224414434488F, 0.0F));
            PartDefinition rMembrane3 = UpperArmRight.addOrReplaceChild("rMembrane3", CubeListBuilder.create().texOffs(-13, 48).mirror(true).addBox(-8.5F, 0.2F, 0.0F, 10.0F, 0.0F, 16.0F), PartPose.offset(0.0F, -0.04F, 0.0F));

            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 40).mirror(true).addBox(-10.7F, 0.0F, -0.5F, 11.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-9.0F, 0.02F, 0.0F, 0.0F, -0.7037167490777915F, 0.0F));
            PartDefinition FingerLeftRight = ArmRight.addOrReplaceChild("FingerLeftRight", CubeListBuilder.create().texOffs(18, 12).mirror(true).addBox(-22.0F, 0.0F, -0.5F, 22.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, -0.0F, 0.0F, 0.0F, 0.7819074915776542F, 0.0F));
            PartDefinition rMembrane = FingerLeftRight.addOrReplaceChild("rMembrane", CubeListBuilder.create().texOffs(17, 27).mirror(true).addBox(-18.5F, 0.2F, 0.0F, 19.0F, 0.0F, 8.0F), PartPose.offset(-3.0F, -0.04F, 0.0F));

            PartDefinition FingerMiddleRight = ArmRight.addOrReplaceChild("FingerMiddleRight", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(-20.0F, 0.0F, -0.5F, 20.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.01F, 0.0F, 0.0F, 1.1730357742864224F, 0.0F));
            PartDefinition rMembrane1 = FingerMiddleRight.addOrReplaceChild("rMembrane1", CubeListBuilder.create().texOffs(12, 35).mirror(true).addBox(-18.4F, 0.2F, 0.0F, 19.0F, 0.0F, 13.0F), PartPose.offset(0.0F, -0.04F, 0.0F));

            PartDefinition FingerRightRight = ArmRight.addOrReplaceChild("FingerRightRight", CubeListBuilder.create().texOffs(26, 3).mirror(true).addBox(-18.0F, 0.0F, -0.5F, 18.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.02F, 0.0F, 0.0F, 1.8767525233642137F, 0.0F));
            PartDefinition rMembrane2 = FingerRightRight.addOrReplaceChild("rMembrane2", CubeListBuilder.create().texOffs(8, 48).mirror(true).addBox(-19.6F, 0.2F, 0.0F, 20.0F, 0.0F, 16.0F), PartPose.offset(0.2F, -0.04F, 0.3F));

            PartDefinition FingerRight = ArmRight.addOrReplaceChild("FingerRight", CubeListBuilder.create().texOffs(0, 45).mirror(true).addBox(-3.5F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.02F, 0.0F, 0.0F, -0.5475098009980072F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 21).addBox(-2.4F, 0.0F, -4.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.11728612207217244F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(29, 14).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 2.5F, -5.0F, 0.23457224414434488F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -1.5F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(15, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.5F, 1.0F, 0.0F, 0.5473352640780661F, 0.4300491170387584F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.5F, 1.0F, 0.0F, -0.5473352640780661F, -0.4300491170387584F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 4.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 0.5F, 4.5F, -0.35185837453889574F, 0.5473352640780661F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3909537457888271F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 15).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 0.5F, 4.5F, -0.35185837453889574F, -0.5473352640780661F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(50, 20).mirror(true).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.27366763203903305F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(42, 18).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3909537457888271F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }

    public static class Resting extends FruitBatModel {
        public Resting(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.SnoutTop = this.Snout.getChild("SnoutTop");

            this.UpperArmLeft = this.Chest.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.FingerMiddleLeft = this.ArmLeft.getChild("FingerMiddleLeft");

            this.FingerLeft = this.ArmLeft.getChild("FingerLeft");

            this.FingerLeftLeft = this.ArmLeft.getChild("FingerLeftLeft");

            this.FingerRightLeft = this.ArmLeft.getChild("FingerRightLeft");

            this.lMembrane3 = this.UpperArmLeft.getChild("lMembrane3");

            this.Body = this.Chest.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.UpperArmRight = this.Chest.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.FingerLeftRight = this.ArmRight.getChild("FingerLeftRight");

            this.FingerMiddleRight = this.ArmRight.getChild("FingerMiddleRight");

            this.FingerRight = this.ArmRight.getChild("FingerRight");

            this.FingerRightRight = this.ArmRight.getChild("FingerRightRight");

            this.rMembrane3 = this.UpperArmRight.getChild("rMembrane3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 7.0F), PartPose.offsetAndRotation(0.0F, 24.5F, 0.0F, 1.5707963267948966F, 3.141592653589793F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 21).addBox(-2.4F, 0.0F, -4.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.5F, -2.5F, 0.5082398928281348F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(29, 14).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -4.0F, 1.0555751236166873F, 0.0F, 0.0F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.5F, 1.0F, 0.0F, -0.5473352640780661F, -0.4300491170387584F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.5F, 1.0F, 0.0F, 0.5473352640780661F, 0.4300491170387584F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -1.5F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(15, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, -0.27366763203903305F, 0.0F, 0.0F));

            PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.1F, 0.19547687289441354F, 0.0F, 0.0F));

            PartDefinition UpperArmLeft = Chest.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, 0.0F, -0.5F, 9.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(3.0F, -2.0F, -2.0F, 0.31311207712884653F, -1.250528435685548F, 1.0946705281561322F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(0, 40).mirror(true).addBox(0.3F, 0.0F, -0.5F, 11.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(9.0F, 0.02F, 0.0F, 0.0F, 2.5802947022325506F, 0.0F));
            PartDefinition FingerMiddleLeft = ArmLeft.addOrReplaceChild("FingerMiddleLeft", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(0.0F, 0.0F, -0.5F, 20.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.01F, 0.0F, 0.0F, -2.543119370260025F, 0.0F));

            PartDefinition FingerLeft = ArmLeft.addOrReplaceChild("FingerLeft", CubeListBuilder.create().texOffs(0, 45).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.02F, 0.0F, 0.0F, -1.7591173690640511F, 0.0F));

            PartDefinition FingerLeftLeft = ArmLeft.addOrReplaceChild("FingerLeftLeft", CubeListBuilder.create().texOffs(18, 12).mirror(true).addBox(0.0F, 0.0F, -0.5F, 22.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, -0.0F, 0.0F, 0.0F, -2.699151581682787F, 0.0F));

            PartDefinition FingerRightLeft = ArmLeft.addOrReplaceChild("FingerRightLeft", CubeListBuilder.create().texOffs(26, 3).mirror(true).addBox(0.0F, 0.0F, -0.5F, 18.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(10.5F, 0.02F, 0.0F, 0.0F, -2.8169613061924044F, 0.0F));

            PartDefinition lMembrane3 = UpperArmLeft.addOrReplaceChild("lMembrane3", CubeListBuilder.create().texOffs(-13, 48).addBox(-2.5F, 0.5F, 0.0F, 10.0F, 0.0F, 16.0F), PartPose.offsetAndRotation(2.0F, -0.04F, 0.0F, 0.0F, 1.3292428222347474F, 0.0F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 5.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 4.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(50, 15).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(-2.0F, 0.5F, 4.5F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(50, 20).mirror(true).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.27366763203903305F, 0.17453292519943295F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(42, 18).mirror(true).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3909537457888271F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(50, 15).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(2.0F, 0.5F, 4.5F, -0.35185837453889574F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(50, 20).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 3.0F, 0.27366763203903305F, -0.17453292519943295F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.3909537457888271F, 0.0F, 0.0F));

            PartDefinition UpperArmRight = Chest.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(0, 35).mirror(true).addBox(-9.0F, 0.0F, -0.5F, 9.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, -2.0F, -2.0F, 0.31311207712884653F, 1.250528435685548F, -1.0946705281561322F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(0, 40).mirror(true).addBox(-10.7F, 0.0F, -0.5F, 11.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-9.0F, 0.02F, 0.0F, 0.0F, -2.5802947022325506F, 0.0F));
            PartDefinition FingerLeftRight = ArmRight.addOrReplaceChild("FingerLeftRight", CubeListBuilder.create().texOffs(18, 12).mirror(true).addBox(-22.0F, 0.0F, -0.5F, 22.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, -0.0F, 0.0F, 0.0F, 2.699151581682787F, 0.0F));

            PartDefinition FingerMiddleRight = ArmRight.addOrReplaceChild("FingerMiddleRight", CubeListBuilder.create().texOffs(22, 0).mirror(true).addBox(-20.0F, 0.0F, -0.5F, 20.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.01F, 0.0F, 0.0F, 2.543119370260025F, 0.0F));

            PartDefinition FingerRight = ArmRight.addOrReplaceChild("FingerRight", CubeListBuilder.create().texOffs(0, 45).mirror(true).addBox(-3.5F, 0.0F, -0.5F, 4.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.02F, 0.0F, 0.0F, 1.7591173690640511F, 0.0F));

            PartDefinition FingerRightRight = ArmRight.addOrReplaceChild("FingerRightRight", CubeListBuilder.create().texOffs(26, 3).mirror(true).addBox(-18.0F, 0.0F, -0.5F, 18.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-10.5F, 0.02F, 0.0F, 0.0F, 2.8169613061924044F, 0.0F));

            PartDefinition rMembrane3 = UpperArmRight.addOrReplaceChild("rMembrane3", CubeListBuilder.create().texOffs(-13, 48).mirror(true).addBox(-7.5F, 0.5F, 0.2F, 10.0F, 0.0F, 16.0F), PartPose.offsetAndRotation(-2.0F, -0.04F, 0.0F, 0.0F, -1.3292428222347474F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

        }
    }
}
