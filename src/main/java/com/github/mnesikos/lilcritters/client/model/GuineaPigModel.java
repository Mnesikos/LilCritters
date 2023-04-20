package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.GuineaPigEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;

public class GuineaPigModel extends ZawaBaseModel<GuineaPigEntity> {
    public ModelRenderer Hips;
    public ModelRenderer Chest;
    public ModelRenderer Rear;
    public ModelRenderer ThighLeft;
    public ModelRenderer ThighRight;
    public ModelRenderer ChestUnder;
    public ModelRenderer Neck;
    public ModelRenderer ArmLeft;
    public ModelRenderer ArmRight;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer EarLeft;
    public ModelRenderer EarRight;
    public ModelRenderer TopSnout;
    public ModelRenderer ForeArmLeft;
    public ModelRenderer HandLeft;
    public ModelRenderer ForeArmRight;
    public ModelRenderer HandRight;
    public ModelRenderer LegLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer LegRight;
    public ModelRenderer FootRight;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Hips);
        }

        return this.parts;
    }

    public GuineaPigModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.ChestUnder = new ModelRenderer(this, 0, 23);
        this.ChestUnder.setPos(0.0F, 3.0F, -0.25F);
        this.ChestUnder.addBox(-2.0F, 0.8F, -2.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(ChestUnder, -0.27314402793711257F, 0.0F, 0.0F);
        this.LegRight = new ModelRenderer(this, 16, 22);
        this.LegRight.setPos(-0.1F, 2.0F, -1.0F);
        this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegRight, 0.7740535232594852F, 0.0F, 0.0F);
        this.Chest = new ModelRenderer(this, 0, 16);
        this.Chest.setPos(0.0F, -2.3F, -1.9F);
        this.Chest.addBox(-2.0F, -0.1F, -2.5F, 4, 4, 3, 0.0F);
        this.setRotateAngle(Chest, 0.136659280431156F, 0.0F, 0.0F);
        this.FootLeft = new ModelRenderer(this, 22, 23);
        this.FootLeft.mirror = true;
        this.FootLeft.setPos(-0.1F, 1.5F, 0.4F);
        this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, -0.8196066167365371F, 0.0F, 0.0F);
        this.Rear = new ModelRenderer(this, 18, 9);
        this.Rear.setPos(0.0F, -2.0F, 1.5F);
        this.Rear.addBox(-2.0F, -0.5F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(Rear, -0.18203784098300857F, 0.0F, 0.0F);
        this.ThighRight = new ModelRenderer(this, 16, 16);
        this.ThighRight.setPos(-2.0F, 0.2F, 1.2F);
        this.ThighRight.addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3, 0.0F);
        this.Neck = new ModelRenderer(this, 22, 3);
        this.Neck.setPos(0.0F, 0.1F, -2.5F);
        this.Neck.addBox(-1.0F, 0.3F, -1.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Neck, -0.4553564018453205F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 13, 0);
        this.Head.setPos(0.0F, 1.5F, -0.3F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.36425021489121656F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 5, 3);
        this.Snout.setPos(0.0F, 0.9F, -0.7F);
        this.Snout.addBox(-1.0F, -1.5F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.136659280431156F, 0.0F, 0.0F);
        this.HandLeft = new ModelRenderer(this, 4, 29);
        this.HandLeft.mirror = true;
        this.HandLeft.setPos(-0.1F, 0.5F, -0.5F);
        this.HandLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandLeft, 0.5009094953223726F, 0.0F, 0.0F);
        this.ForeArmLeft = new ModelRenderer(this, 0, 29);
        this.ForeArmLeft.mirror = true;
        this.ForeArmLeft.setPos(0.0F, 2.0F, 0.5F);
        this.ForeArmLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ForeArmLeft, -0.8196066167365371F, 0.0F, 0.0F);
        this.ArmRight = new ModelRenderer(this, 0, 26);
        this.ArmRight.setPos(-1.3F, 2.9F, -2.0F);
        this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmRight, 0.27314402793711257F, 0.0F, 0.0F);
        this.TopSnout = new ModelRenderer(this, 6, 0);
        this.TopSnout.setPos(0.0F, -0.8F, 0.02F);
        this.TopSnout.addBox(-1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(TopSnout, 0.136659280431156F, 0.0F, 0.0F);
        this.Hips = new ModelRenderer(this, 0, 7);
        this.Hips.setPos(0.0F, 20.5F, 0.0F);
        this.Hips.addBox(-2.5F, -2.5F, -2.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Hips, 0.045553093477052F, 0.0F, 0.0F);
        this.EarLeft = new ModelRenderer(this, 0, 2);
        this.EarLeft.mirror = true;
        this.EarLeft.setPos(1.0F, -1.0F, 0.5F);
        this.EarLeft.addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(EarLeft, -0.22759093446006054F, 0.22759093446006054F, 0.5009094953223726F);
        this.ArmLeft = new ModelRenderer(this, 0, 26);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setPos(1.3F, 2.9F, -2.0F);
        this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmLeft, 0.27314402793711257F, 0.0F, 0.0F);
        this.ThighLeft = new ModelRenderer(this, 16, 16);
        this.ThighLeft.mirror = true;
        this.ThighLeft.setPos(2.0F, 0.2F, 1.2F);
        this.ThighLeft.addBox(-1.0F, -0.5F, -1.5F, 2, 3, 3, 0.0F);
        this.FootRight = new ModelRenderer(this, 22, 23);
        this.FootRight.setPos(0.1F, 1.5F, 0.4F);
        this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, -0.8196066167365371F, 0.0F, 0.0F);
        this.EarRight = new ModelRenderer(this, 0, 0);
        this.EarRight.setPos(-1.0F, -1.0F, 0.5F);
        this.EarRight.addBox(-0.5F, -0.8F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(EarRight, -0.22759093446006054F, -0.22759093446006054F, -0.5009094953223726F);
        this.HandRight = new ModelRenderer(this, 4, 29);
        this.HandRight.setPos(0.1F, 0.5F, -0.5F);
        this.HandRight.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandRight, 0.40980330836826856F, 0.0F, 0.0F);
        this.ForeArmRight = new ModelRenderer(this, 0, 29);
        this.ForeArmRight.setPos(0.0F, 2.0F, 0.5F);
        this.ForeArmRight.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ForeArmRight, -0.8196066167365371F, 0.0F, 0.0F);
        this.LegLeft = new ModelRenderer(this, 16, 22);
        this.LegLeft.mirror = true;
        this.LegLeft.setPos(0.1F, 2.0F, -1.0F);
        this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegLeft, 0.7740535232594852F, 0.0F, 0.0F);
        this.Chest.addChild(this.ChestUnder);
        this.ThighRight.addChild(this.LegRight);
        this.Hips.addChild(this.Chest);
        this.LegLeft.addChild(this.FootLeft);
        this.Hips.addChild(this.Rear);
        this.Hips.addChild(this.ThighRight);
        this.Chest.addChild(this.Neck);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.Snout);
        this.ForeArmLeft.addChild(this.HandLeft);
        this.ArmLeft.addChild(this.ForeArmLeft);
        this.Chest.addChild(this.ArmRight);
        this.Snout.addChild(this.TopSnout);
        this.Head.addChild(this.EarLeft);
        this.Chest.addChild(this.ArmLeft);
        this.Hips.addChild(this.ThighLeft);
        this.LegRight.addChild(this.FootRight);
        this.Head.addChild(this.EarRight);
        this.ForeArmRight.addChild(this.HandRight);
        this.ArmRight.addChild(this.ForeArmRight);
        this.ThighLeft.addChild(this.LegLeft);
        this.saveBase();
    }

    @Override
    public void setupAnim(GuineaPigEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.36F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0f;
        float degree = 1.0f;
        this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.36F;
        this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.EarRight.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.46F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 6.0f, degree = 0.8f;

        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
        }

        this.ArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.27F;
        this.ForeArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
        this.HandLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
        this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount;
        this.LegLeft.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.77F;
        this.FootLeft.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.82F;
        this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount;
        this.LegRight.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.77F;
        this.FootRight.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
        this.ArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.27F;
        this.ForeArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.82F;
        this.HandRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.5F;
        this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.46F;
        this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.36F;
        this.EarLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.EarRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.23F;
        this.Hips.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 20F;
    }
}
