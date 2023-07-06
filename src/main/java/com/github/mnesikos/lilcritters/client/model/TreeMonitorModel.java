package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TreeMonitorEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public class TreeMonitorModel extends ZawaBaseModel<TreeMonitorEntity> {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer UpperArmLeft;
    public ModelRenderer Hips;
    public ModelRenderer UpperArmRight;
    public ModelRenderer Head;
    public ModelRenderer NeckLower1;
    public ModelRenderer Snout;
    public ModelRenderer Mouth;
    public ModelRenderer Nose;
    public ModelRenderer NeckLower1_1;
    public ModelRenderer ArmLeft;
    public ModelRenderer HandLeft;
    public ModelRenderer FingerLeft1;
    public ModelRenderer FingerLeft2;
    public ModelRenderer ThighLeft;
    public ModelRenderer Tail1;
    public ModelRenderer ThighRight;
    public ModelRenderer LegLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer ToeLeft1;
    public ModelRenderer ToeLeft2;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer LegRight;
    public ModelRenderer FootRight;
    public ModelRenderer ToeRight1;
    public ModelRenderer ToeRight2;
    public ModelRenderer ArmRight;
    public ModelRenderer HandRight;
    public ModelRenderer FingerRight1;
    public ModelRenderer FingerRight2;
    private Iterable<ModelRenderer> parts;

    @Override
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public TreeMonitorModel() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.Nose = new ModelRenderer(this, 0, 0);
        this.Nose.setPos(0.0F, -0.5F, -2.7F);
        this.Nose.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Nose, 0.3490658503988659F, 0.0F, 0.0F);
        this.ThighRight = new ModelRenderer(this, 18, 18);
        this.ThighRight.mirror = true;
        this.ThighRight.setPos(-2.0F, 1.1F, 1.0F);
        this.ThighRight.addBox(0.0F, 0.0F, -0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.03490658503988659F, 0.6108652381980153F, 0.8726646259971648F);
        this.LegRight = new ModelRenderer(this, 26, 19);
        this.LegRight.mirror = true;
        this.LegRight.setPos(0.5F, 2.0F, -0.19F);
        this.LegRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, 0.8726646259971648F, 0.0F, -0.2617993877991494F);
        this.FingerLeft2 = new ModelRenderer(this, 25, 14);
        this.FingerLeft2.setPos(-0.5F, 0.0F, 0.5F);
        this.FingerLeft2.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FingerLeft2, 0.0F, 0.3490658503988659F, 0.0F);
        this.ArmRight = new ModelRenderer(this, 21, 14);
        this.ArmRight.mirror = true;
        this.ArmRight.setPos(0.5F, 2.0F, 1.21F);
        this.ArmRight.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(ArmRight, -0.3490658503988659F, 0.0F, -0.6981317007977318F);
        this.Hips = new ModelRenderer(this, 0, 14);
        this.Hips.setPos(0.0F, -2.0F, 5.5F);
        this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Hips, -0.10471975511965977F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 20, 0);
        this.Neck.setPos(0.0F, -0.3F, -3.5F);
        this.Neck.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.20943951023931953F, 0.0F, 0.0F);
        this.ToeLeft2 = new ModelRenderer(this, 29, 14);
        this.ToeLeft2.setPos(-0.5F, 0.0F, 0.5F);
        this.ToeLeft2.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ToeLeft2, -0.05235987755982988F, 0.3490658503988659F, 0.0F);
        this.FingerLeft1 = new ModelRenderer(this, 25, 14);
        this.FingerLeft1.setPos(0.5F, 0.0F, 0.5F);
        this.FingerLeft1.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FingerLeft1, 0.0F, -0.3490658503988659F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 23);
        this.Tail1.setPos(0.0F, 2.0F, 4.7F);
        this.Tail1.addBox(-1.5F, -1.6F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(Tail1, -0.06981317007977318F, 0.0F, 0.0F);
        this.ThighLeft = new ModelRenderer(this, 18, 18);
        this.ThighLeft.mirror = true;
        this.ThighLeft.setPos(2.0F, 1.1F, 1.0F);
        this.ThighLeft.addBox(-2.0F, 0.0F, -0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.03490658503988659F, -0.6108652381980153F, -0.8726646259971648F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 20.0F, -2.0F);
        this.Body.addBox(-2.5F, -2.0F, -4.5F, 5, 4, 10, 0.0F);
        this.setRotateAngle(Body, -0.017453292519943295F, 0.0F, 0.0F);
        this.NeckLower1 = new ModelRenderer(this, 36, 0);
        this.NeckLower1.setPos(0.0F, 2.2F, 0.5F);
        this.NeckLower1.addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F);
        this.Mouth = new ModelRenderer(this, 44, 9);
        this.Mouth.setPos(0.0F, 0.2F, 0.2F);
        this.Mouth.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
        this.UpperArmRight = new ModelRenderer(this, 13, 14);
        this.UpperArmRight.mirror = true;
        this.UpperArmRight.setPos(-2.5F, -0.5F, -4.0F);
        this.UpperArmRight.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(UpperArmRight, 0.2617993877991494F, 0.08726646259971647F, 0.8726646259971648F);
        this.FootLeft = new ModelRenderer(this, 31, 16);
        this.FootLeft.mirror = true;
        this.FootLeft.setPos(-0.5F, 2.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, -0.22689280275926282F, 0.0F, 0.3490658503988659F);
        this.ToeLeft1 = new ModelRenderer(this, 29, 14);
        this.ToeLeft1.setPos(0.5F, 0.0F, 0.5F);
        this.ToeLeft1.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ToeLeft1, 0.05235987755982988F, -0.3490658503988659F, 0.0F);
        this.ArmLeft = new ModelRenderer(this, 21, 14);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setPos(-0.5F, 2.0F, 1.21F);
        this.ArmLeft.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(ArmLeft, -0.3490658503988659F, 0.0F, 0.6981317007977318F);
        this.FootRight = new ModelRenderer(this, 31, 16);
        this.FootRight.mirror = true;
        this.FootRight.setPos(0.5F, 2.5F, 0.0F);
        this.FootRight.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, -0.22689280275926282F, 0.0F, -0.3490658503988659F);
        this.HandLeft = new ModelRenderer(this, 25, 16);
        this.HandLeft.mirror = true;
        this.HandLeft.setPos(-0.5F, 2.5F, -0.6F);
        this.HandLeft.addBox(-0.5F, -0.01F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.19198621771937624F, 0.0F, 0.17453292519943295F);
        this.Tail2 = new ModelRenderer(this, 18, 23);
        this.Tail2.setPos(0.0F, 0.0F, 5.7F);
        this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Tail2, 0.06981317007977318F, 0.0F, 0.0F);
        this.HandRight = new ModelRenderer(this, 25, 16);
        this.HandRight.mirror = true;
        this.HandRight.setPos(0.5F, 2.5F, -0.6F);
        this.HandRight.addBox(-0.5F, -0.01F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(HandRight, 0.19198621771937624F, 0.0F, -0.17453292519943295F);
        this.FingerRight1 = new ModelRenderer(this, 25, 14);
        this.FingerRight1.setPos(0.5F, 0.0F, 0.5F);
        this.FingerRight1.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FingerRight1, 0.0F, -0.3490658503988659F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 4);
        this.Snout.setPos(0.0F, 0.1F, -3.2F);
        this.Snout.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Snout, 0.03490658503988659F, 0.0F, 0.0F);
        this.ToeRight1 = new ModelRenderer(this, 29, 14);
        this.ToeRight1.setPos(0.5F, 0.0F, 0.5F);
        this.ToeRight1.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ToeRight1, 0.05235987755982988F, -0.3490658503988659F, 0.0F);
        this.FingerRight2 = new ModelRenderer(this, 25, 14);
        this.FingerRight2.setPos(-0.5F, 0.0F, 0.5F);
        this.FingerRight2.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FingerRight2, 0.0F, 0.3490658503988659F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 28, 19);
        this.Tail3.setPos(0.0F, 0.0F, 5.7F);
        this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail3, 0.08726646259971647F, 0.0F, 0.0F);
        this.UpperArmLeft = new ModelRenderer(this, 13, 14);
        this.UpperArmLeft.mirror = true;
        this.UpperArmLeft.setPos(2.5F, -0.5F, -4.0F);
        this.UpperArmLeft.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(UpperArmLeft, 0.2617993877991494F, -0.08726646259971647F, -0.8726646259971648F);
        this.Head = new ModelRenderer(this, 30, 7);
        this.Head.setPos(0.0F, -0.2F, -3.3F);
        this.Head.addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.2792526803190927F, 0.0F, 0.0F);
        this.LegLeft = new ModelRenderer(this, 26, 19);
        this.LegLeft.mirror = true;
        this.LegLeft.setPos(-0.5F, 2.0F, -0.19F);
        this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, 0.8726646259971648F, 0.0F, 0.2617993877991494F);
        this.ToeRight2 = new ModelRenderer(this, 29, 14);
        this.ToeRight2.setPos(-0.5F, 0.0F, 0.5F);
        this.ToeRight2.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(ToeRight2, -0.05235987755982988F, 0.3490658503988659F, 0.0F);
        this.NeckLower1_1 = new ModelRenderer(this, 40, 5);
        this.NeckLower1_1.setPos(0.0F, 0.0F, -4.0F);
        this.NeckLower1_1.addBox(-1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(NeckLower1_1, -0.2792526803190927F, 0.0F, 0.0F);
        this.Snout.addChild(this.Nose);
        this.Hips.addChild(this.ThighRight);
        this.ThighRight.addChild(this.LegRight);
        this.HandLeft.addChild(this.FingerLeft2);
        this.UpperArmRight.addChild(this.ArmRight);
        this.Body.addChild(this.Hips);
        this.Body.addChild(this.Neck);
        this.FootLeft.addChild(this.ToeLeft2);
        this.HandLeft.addChild(this.FingerLeft1);
        this.Hips.addChild(this.Tail1);
        this.Hips.addChild(this.ThighLeft);
        this.Neck.addChild(this.NeckLower1);
        this.Snout.addChild(this.Mouth);
        this.Body.addChild(this.UpperArmRight);
        this.LegLeft.addChild(this.FootLeft);
        this.FootLeft.addChild(this.ToeLeft1);
        this.UpperArmLeft.addChild(this.ArmLeft);
        this.LegRight.addChild(this.FootRight);
        this.ArmLeft.addChild(this.HandLeft);
        this.Tail1.addChild(this.Tail2);
        this.ArmRight.addChild(this.HandRight);
        this.HandRight.addChild(this.FingerRight1);
        this.Head.addChild(this.Snout);
        this.FootRight.addChild(this.ToeRight1);
        this.HandRight.addChild(this.FingerRight2);
        this.Tail2.addChild(this.Tail3);
        this.Body.addChild(this.UpperArmLeft);
        this.Neck.addChild(this.Head);
        this.ThighLeft.addChild(this.LegLeft);
        this.FootRight.addChild(this.ToeRight2);
        this.NeckLower1.addChild(this.NeckLower1_1);

    }

    @Override
    public void setupAnim(TreeMonitorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.28F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0f;
        float degree = 1.0f;
        this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.08F) * degree * 0.1F * limbSwingAmount;
        this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.16F) * degree * 0.05F * limbSwingAmount - 0.07F;
        this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.21F;
        this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.28F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 4.0f;
        float degree = 0.7f;
        this.UpperArmLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.26F;
        this.ArmLeft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
        this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
        this.ThighLeft.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.03F;
        this.LegLeft.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.87F;
        this.FootLeft.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.23F;
        this.UpperArmRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.26F;
        this.ArmRight.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
        this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
        this.ThighRight.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.03F;
        this.LegRight.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.87F;
        this.FootRight.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.23F;
        this.Body.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Hips.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail1.yRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail2.yRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Tail3.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
    }
}
