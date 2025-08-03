package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.SugarGliderEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class SugarGliderModel extends ZawaBaseModel<SugarGliderEntity> {
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart ArmLeft;
    public ModelPart Neck;
    public ModelPart ArmRight;
    public ModelPart WingRight;
    public ModelPart WingLeft;
    public ModelPart Tail1;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart ForeArmLeft;
    public ModelPart HandLeft;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart Nose;
    public ModelPart Mouth;
    public ModelPart ForeArmRight;
    public ModelPart HandRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Chest);
        return parts;
    }

    public static class Adult extends SugarGliderModel {
        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.WingLeft = this.Chest.getChild("WingLeft");

            this.WingRight = this.Chest.getChild("WingRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
            this.HandRight = this.ForeArmRight.getChild("HandRight");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
            this.HandLeft = this.ForeArmLeft.getChild("HandLeft");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-0.05F, 21.5F, -2.0F, 0.039269908169872414F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(18, 7).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, -1.5F, 1.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(12, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.5F, 2.0F, -0.18779743150933148F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.5F, 1.0F, -0.21781708265940905F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(12, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.5F, 2.0F, -0.18779743150933148F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(12, 10).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, 1.0F, -0.21781708265940905F, 0.0F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(22, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.7F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(20, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.7F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition WingLeft = Chest.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(0.7F, -1.3F, -2.0F, 0.0F, 0.0F, -0.1563815016444822F));

            PartDefinition WingRight = Chest.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 24).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-0.7F, -1.3F, -2.0F, 0.0F, 0.0F, 0.1563815016444822F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -1.8F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.5F, -2.0F, 0.7822565654175363F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 5).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.17610372418938894F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(7, 6).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(9, 9).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.4F, 1.5F, 0.04555309164612875F, 0.4300491170387584F, 0.18203784630933073F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(9, 9).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.4F, 1.5F, 0.04555309164612875F, -0.4300491170387584F, -0.18203784630933073F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(4, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.2F, -1.0F, -2.0F, 0.18779743150933148F, 0.0F, 0.0F));
            PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(4, 13).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, -0.27366763203903305F));
            PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 10).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.5F, -1.0F, 0.21781708265940905F, 0.0F, 0.27366763203903305F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(4, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.2F, -1.0F, -2.0F, 0.18779743150933148F, 0.0F, 0.0F));
            PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(4, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, 0.27366763203903305F));
            PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 10).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, -1.0F, 0.21781708265940905F, 0.0F, -0.27366763203903305F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
    }

    public static class Gliding extends SugarGliderModel {
        public Gliding(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.WingRight = this.Chest.getChild("WingRight");

            this.WingLeft = this.Chest.getChild("WingLeft");

            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.ForeArmLeft = this.ArmLeft.getChild("ForeArmLeft");
            this.HandLeft = this.ForeArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.Nose = this.Snout.getChild("Nose");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.ForeArmRight = this.ArmRight.getChild("ForeArmRight");
            this.HandRight = this.ForeArmRight.getChild("HandRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(-0.05F, 21.5F, -2.0F, 0.039269908169872414F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(18, 7).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, -1.5F, 1.5F, -0.0781907508222411F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(12, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 1.5F, 2.0F, -0.18779743150933148F, 0.0F, -1.2217304763960306F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 13).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(12, 10).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.5F, 1.0F, 0.5640904089182451F, 0.0F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(22, 13).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, -0.3186971254089062F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(22, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.7F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(20, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.01F, 0.0F, 2.7F, 0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(12, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 1.5F, 2.0F, -0.18779743150933148F, 0.0F, 1.2217304763960306F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 13).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, -1.0F, 0.45378560551852565F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(12, 10).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, 1.0F, 0.5640904089182451F, 0.0F, 0.0F));

            PartDefinition WingRight = Chest.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(1.5F, -1.3F, -2.0F, 0.0F, 0.0F, -1.2217304763960306F));

            PartDefinition WingLeft = Chest.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 24).mirror(true).addBox(1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offsetAndRotation(-1.5F, -1.3F, -2.0F, 0.0F, 0.0F, 1.2217304763960306F));

            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(4, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(1.1F, -0.2F, -2.0F, 0.18779743150933148F, 0.0F, -1.2217304763960306F));
            PartDefinition ForeArmLeft = ArmLeft.addOrReplaceChild("ForeArmLeft", CubeListBuilder.create().texOffs(4, 13).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, 0.27366763203903305F));
            PartDefinition HandLeft = ForeArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(4, 10).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 1.5F, -1.0F, 0.8042477512769202F, 0.0F, -0.27366763203903305F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -1.8F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, -2.0F, -0.6646214111173737F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.01F, 0.5F, -2.0F, 0.7822565654175363F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(9, 9).mirror(true).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -0.4F, 1.5F, 0.04555309164612875F, 0.4300491170387584F, 0.18203784630933073F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 5).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.17610372418938894F, 0.0F, 0.0F));

            PartDefinition Nose = Snout.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(7, 6).addBox(-0.5F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -0.1F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(9, 9).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -0.4F, 1.5F, 0.04555309164612875F, -0.4300491170387584F, -0.18203784630933073F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(4, 19).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, -0.2F, -2.0F, 0.18779743150933148F, 0.0F, 1.2217304763960306F));
            PartDefinition ForeArmRight = ArmRight.addOrReplaceChild("ForeArmRight", CubeListBuilder.create().texOffs(4, 13).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.02F, 2.0F, 1.0F, -0.45378560551852565F, 0.0F, -0.27366763203903305F));
            PartDefinition HandRight = ForeArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(4, 10).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.1F, 1.5F, -1.0F, 0.8042477512769202F, 0.0F, 0.27366763203903305F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(SugarGliderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
    }
}
