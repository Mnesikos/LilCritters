package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.MysterySnailEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class MysterySnailModel extends ZawaBaseAmbientModel<MysterySnailEntity> {
    public ModelPart Body;
    public ModelPart Shell1;
    public ModelPart Head;
    public ModelPart Shell2;
    public ModelPart RightAntennae1;
    public ModelPart RightAntennae2;
    public ModelPart LeftAntennae1;
    public ModelPart LeftAntennae2;
    private Iterable<ModelPart> parts;

    public Iterable<ModelPart> parts() {
        if (parts == null) parts = ImmutableList.of(Body);
        return parts;
    }

    public MysterySnailModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.Head = this.Body.getChild("Head");
        this.RightAntennae2 = this.Head.getChild("RightAntennae2");

        this.LeftAntennae1 = this.Head.getChild("LeftAntennae1");

        this.RightAntennae1 = this.Head.getChild("RightAntennae1");

        this.LeftAntennae2 = this.Head.getChild("LeftAntennae2");

        this.Shell1 = this.Body.getChild("Shell1");
        this.Shell2 = this.Shell1.getChild("Shell2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, -3.5F, 3, 2, 8), PartPose.offset(0.0F, 23.0F, 0.0F));
        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1), PartPose.offsetAndRotation(0.0F, 0.2F, -2.8F, 0.20943951023931953F, 0.0F, 0.0F));
        PartDefinition RightAntennae2 = Head.addOrReplaceChild("RightAntennae2", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1, 0, 2), PartPose.offsetAndRotation(-0.7F, 0.5F, -0.3F, -0.13962634015954636F, 0.2792526803190927F, -0.13962634015954636F));

        PartDefinition LeftAntennae1 = Head.addOrReplaceChild("LeftAntennae1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -0.5F, 0, 3, 1), PartPose.offsetAndRotation(1.0F, 0.0F, -0.5F, 0.6981317007977318F, 0.3490658503988659F, 0.2792526803190927F));

        PartDefinition RightAntennae1 = Head.addOrReplaceChild("RightAntennae1", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(0.0F, -3.0F, -0.5F, 0, 3, 1), PartPose.offsetAndRotation(-1.0F, 0.0F, -0.5F, 0.6981317007977318F, -0.3490658503988659F, -0.2792526803190927F));

        PartDefinition LeftAntennae2 = Head.addOrReplaceChild("LeftAntennae2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -2.0F, 1, 0, 2), PartPose.offsetAndRotation(0.7F, 0.5F, -0.3F, -0.13962634015954636F, -0.2792526803190927F, 0.13962634015954636F));

        PartDefinition Shell1 = Body.addOrReplaceChild("Shell1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -5.0F, 0.0F, 5, 5, 7), PartPose.offsetAndRotation(0.0F, 0.0F, -3.6F, 0.08726646259971647F, -0.06981317007977318F, 0.0F));
        PartDefinition Shell2 = Shell1.addOrReplaceChild("Shell2", CubeListBuilder.create().texOffs(17, 0).addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3), PartPose.offsetAndRotation(-0.5F, -2.8F, 5.6F, -0.06981317007977318F, -0.2792526803190927F, -0.06981317007977318F));

        return LayerDefinition.create(meshDefinition, 32, 32);
    }

    @Override
    public void setupAnim(MysterySnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
