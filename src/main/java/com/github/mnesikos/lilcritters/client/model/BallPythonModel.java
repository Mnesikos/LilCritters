package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BallPythonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class BallPythonModel extends ZawaBaseModel<BallPythonEntity> {
    public ModelPart Base;
    public ModelPart Head;
    public ModelPart Neck;
    public ModelPart Jaw;
    public ModelPart Snout;
    public ModelPart Mouth;
    public ModelPart SnoutTop;
    public ModelPart EyeLeft;
    public ModelPart EyeRight;
    public ModelPart Nose;
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart TailBase;
    public ModelPart Tail1;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart Tail4;
    public ModelPart Tail5;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Base);
        return parts;
    }

    public BallPythonModel(ModelPart root) {
        this.Base = root.getChild("Base");
        this.Neck = this.Base.getChild("Neck");
        this.Chest = this.Neck.getChild("Chest");
        this.Body = this.Chest.getChild("Body");
        this.TailBase = this.Body.getChild("TailBase");
        this.Tail1 = this.TailBase.getChild("Tail1");
        this.Tail2 = this.Tail1.getChild("Tail2");
        this.Tail3 = this.Tail2.getChild("Tail3");
        this.Tail4 = this.Tail3.getChild("Tail4");
        this.Tail5 = this.Tail4.getChild("Tail5");

        this.Head = this.Base.getChild("Head");
        this.Jaw = this.Head.getChild("Jaw");
        this.Mouth = this.Jaw.getChild("Mouth");

        this.Snout = this.Head.getChild("Snout");
        this.SnoutTop = this.Snout.getChild("SnoutTop");
        this.Nose = this.SnoutTop.getChild("Nose");

        this.EyeRight = this.Snout.getChild("EyeRight");

        this.EyeLeft = this.Snout.getChild("EyeLeft");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Base = partDefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), PartPose.offset(0.0F, 22.5F, -10.5F));
        PartDefinition Neck = Base.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 3.0F, 5.0F), PartPose.offset(0.0F, -0.8F, -0.2F));
        PartDefinition Chest = Neck.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 3.0F, 6.0F), PartPose.offset(0.0F, -0.05F, 4.0F));
        PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 7.0F), PartPose.offset(0.0F, -0.05F, 6.0F));
        PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(36, 11).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 8.0F), PartPose.offsetAndRotation(0.0F, -0.05F, 6.0F, 0.017453292519943295F, 0.0F, 0.0F));
        PartDefinition Tail1 = TailBase.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(38, 22).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 3.0F, 7.0F), PartPose.offsetAndRotation(0.05F, -0.05F, 7.0F, -0.017453292519943295F, 0.0F, 0.0F));
        PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(14, 22).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 7.0F), PartPose.offset(0.0F, 0.05F, 6.5F));
        PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(16, 13).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 3.0F, 6.0F), PartPose.offset(0.0F, 0.05F, 6.5F));
        PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(28, 6).addBox(-1.5F, -0.1F, 0.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.5F, -0.03490658503988659F, 0.0F, 0.0F));
        PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(21, 5).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 4.5F, -0.03490658503988659F, 0.0F, 0.0F));

        PartDefinition Head = Base.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.3F, -1.0F, 0.17453292519943295F, 0.0F, 0.0F));
        PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(13, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.01F, 1.0F, 1.0F, -0.0712094321497881F, 0.0F, 0.0F));
        PartDefinition Mouth = Jaw.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, -0.10698868514462322F, 0.0F, 0.0F));

        PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(11, 4).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 1.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.10698868514462322F, 0.0F, 0.0F));
        PartDefinition SnoutTop = Snout.addOrReplaceChild("SnoutTop", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.1F, 0.1424188642995762F, 0.0F, 0.0F));
        PartDefinition Nose = SnoutTop.addOrReplaceChild("Nose", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.05F, 0.0F, -1.5F, 0.4626867886984384F, 0.0F, 0.0F));

        PartDefinition EyeRight = Snout.addOrReplaceChild("EyeRight", CubeListBuilder.create().texOffs(0, 4).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, 0.2F, 0.0F, 0.0F, -0.21362829644936432F, 0.0F));

        PartDefinition EyeLeft = Snout.addOrReplaceChild("EyeLeft", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(1.2F, 0.2F, 0.0F, 0.0F, 0.21362829644936432F, 0.0F));

        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    @Override
    public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }
}
