package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.MysterySnailEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import org.zawamod.zawa.client.model.ZawaBaseAmbientModel;

public class MysterySnailModel extends ZawaBaseAmbientModel<MysterySnailEntity> {
    public ModelRenderer Body;
    public ModelRenderer Shell1;
    public ModelRenderer Head;
    public ModelRenderer Shell2;
    public ModelRenderer RightAntennae1;
    public ModelRenderer RightAntennae2;
    public ModelRenderer LeftAntennae1;
    public ModelRenderer LeftAntennae2;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (parts == null) parts = ImmutableList.of(Body);
        return parts;
    }

    public MysterySnailModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.Head = new ModelRenderer(this, 0, 4);
        this.Head.setPos(0.0F, 0.2F, -2.8F);
        this.Head.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Head, 0.20943951023931953F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 12);
        this.Body.setPos(0.0F, 23.0F, 0.0F);
        this.Body.addBox(-1.5F, -1.0F, -3.5F, 3, 2, 8, 0.0F);
        this.RightAntennae2 = new ModelRenderer(this, 0, 0);
        this.RightAntennae2.mirror = true;
        this.RightAntennae2.setPos(-0.7F, 0.5F, -0.3F);
        this.RightAntennae2.addBox(-0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F);
        this.setRotateAngle(RightAntennae2, -0.13962634015954636F, 0.2792526803190927F, -0.13962634015954636F);
        this.LeftAntennae1 = new ModelRenderer(this, 0, 0);
        this.LeftAntennae1.setPos(1.0F, 0.0F, -0.5F);
        this.LeftAntennae1.addBox(0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F);
        this.setRotateAngle(LeftAntennae1, 0.6981317007977318F, 0.3490658503988659F, 0.2792526803190927F);
        this.Shell1 = new ModelRenderer(this, 0, 0);
        this.Shell1.setPos(0.0F, 0.0F, -3.6F);
        this.Shell1.addBox(-2.5F, -5.0F, 0.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Shell1, 0.08726646259971647F, -0.06981317007977318F, 0.0F);
        this.Shell2 = new ModelRenderer(this, 17, 0);
        this.Shell2.setPos(-0.5F, -2.8F, 5.6F);
        this.Shell2.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(Shell2, -0.06981317007977318F, -0.2792526803190927F, -0.06981317007977318F);
        this.RightAntennae1 = new ModelRenderer(this, 0, 0);
        this.RightAntennae1.mirror = true;
        this.RightAntennae1.setPos(-1.0F, 0.0F, -0.5F);
        this.RightAntennae1.addBox(0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F);
        this.setRotateAngle(RightAntennae1, 0.6981317007977318F, -0.3490658503988659F, -0.2792526803190927F);
        this.LeftAntennae2 = new ModelRenderer(this, 0, 0);
        this.LeftAntennae2.setPos(0.7F, 0.5F, -0.3F);
        this.LeftAntennae2.addBox(-0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F);
        this.setRotateAngle(LeftAntennae2, -0.13962634015954636F, -0.2792526803190927F, 0.13962634015954636F);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.RightAntennae2);
        this.Head.addChild(this.LeftAntennae1);
        this.Body.addChild(this.Shell1);
        this.Shell1.addChild(this.Shell2);
        this.Head.addChild(this.RightAntennae1);
        this.Head.addChild(this.LeftAntennae2);
    }

    @Override
    public void setupAnim(MysterySnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
