package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public abstract class TuftedDeerModel extends ZawaBaseModel<TuftedDeerEntity> {
    public ModelRenderer Chest;
    public ModelRenderer Body;
    public ModelRenderer LeftArmBase;
    public ModelRenderer RightArmBase;
    public ModelRenderer Neck;
    public ModelRenderer Hips;
    public ModelRenderer LeftThigh;
    public ModelRenderer RightThigh;
    public ModelRenderer Tail;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer RightFoot;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftForearm;
    public ModelRenderer LeftHand;
    public ModelRenderer RightArm;
    public ModelRenderer RightForeArm;
    public ModelRenderer RightHand;
    public ModelRenderer Head;
    public ModelRenderer Muzzle;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer Tuft;
    public ModelRenderer Mouth;
    public ModelRenderer TopSnout;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Chest);
        }

        return this.parts;
    }

    public TuftedDeerModel() {
    }

    public static class Adult extends TuftedDeerModel {
        public ModelRenderer NeckLower;
        public ModelRenderer LeftAntler;
        public ModelRenderer RightAntler;
        public ModelRenderer LeftFang;
        public ModelRenderer RightFang;
        
        public Adult() {
            this.texWidth = 64;
            this.texHeight = 48;
            this.RightForeArm = new ModelRenderer(this, 48, 27);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(0.1F, 3.0F, -2.5F);
            this.RightForeArm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 14);
            this.LeftFoot.setPos(0.1F, 3.8F, -1.2F);
            this.LeftFoot.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.setRotateAngle(LeftFoot, 0.05235987755982988F, 0.0F, 0.0F);
            this.RightFang = new ModelRenderer(this, 0, 2);
            this.RightFang.mirror = true;
            this.RightFang.setPos(-0.45F, 1.7F, -1.8F);
            this.RightFang.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(RightFang, 0.13962634015954636F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 22, 27);
            this.Tail.setPos(0.0F, 0.4F, 4.5F);
            this.Tail.addBox(-1.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
            this.setRotateAngle(Tail, 0.2792526803190927F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 34, 21);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.9F, 0.5F, 0.5F);
            this.RightArmBase.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(RightArmBase, 0.2792526803190927F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 48, 33);
            this.LeftLeg.setPos(-0.1F, 4.0F, 2.5F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(LeftLeg, -0.3141592653589793F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 23, 0);
            this.Muzzle.setPos(0.0F, -0.1F, -3.4F);
            this.Muzzle.addBox(-1.5F, 0.1F, -3.0F, 3, 2, 3, 0.0F);
            this.setRotateAngle(Muzzle, 0.10471975511965977F, 0.0F, 0.0F);
            this.LeftAntler = new ModelRenderer(this, 0, 0);
            this.LeftAntler.setPos(1.3F, -1.0F, -2.0F);
            this.LeftAntler.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(LeftAntler, -0.3490658503988659F, 0.0F, 0.0F);
            this.RightAntler = new ModelRenderer(this, 0, 0);
            this.RightAntler.mirror = true;
            this.RightAntler.setPos(-1.3F, -1.0F, -2.0F);
            this.RightAntler.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(RightAntler, -0.3490658503988659F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 48, 27);
            this.LeftForearm.setPos(-0.1F, 3.0F, -2.5F);
            this.LeftForearm.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 24, 29);
            this.LeftThigh.setPos(2.2F, 3.3F, 2.0F);
            this.LeftThigh.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 4, 0.0F);
            this.setRotateAngle(LeftThigh, 0.24434609527920614F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -2.0F, -5.0F);
            this.Head.addBox(-2.0F, -1.0F, -4.0F, 4, 4, 5, 0.0F);
            this.setRotateAngle(Head, 1.117010721276371F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 48, 21);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.0F, 5.0F, 1.6F);
            this.RightArm.addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(RightArm, -0.06981317007977318F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 24, 5);
            this.Neck.setPos(0.0F, -1.2F, -1.7F);
            this.Neck.addBox(-1.5F, -2.5F, -4.0F, 3, 4, 5, 0.0F);
            this.setRotateAngle(Neck, -0.6981317007977318F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 48, 21);
            this.LeftArm.setPos(0.0F, 5.0F, 1.6F);
            this.LeftArm.addBox(-1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(LeftArm, -0.06981317007977318F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 35, 0);
            this.Tuft.setPos(0.0F, -1.0F, -4.0F);
            this.Tuft.addBox(-1.5F, -0.2F, 0.0F, 3, 3, 4, 0.0F);
            this.setRotateAngle(Tuft, 0.13962634015954636F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 35, 9);
            this.Chest.setPos(0.0F, 12.9F, -5.0F);
            this.Chest.addBox(-3.0F, -4.0F, -2.0F, 6, 7, 5, 0.0F);
            this.setRotateAngle(Chest, -0.20943951023931953F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 13, 0);
            this.TopSnout.setPos(0.0F, -0.8F, -0.5F);
            this.TopSnout.addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
            this.setRotateAngle(TopSnout, 0.2617993877991494F, 0.0F, 0.0F);
            this.LeftFang = new ModelRenderer(this, 0, 2);
            this.LeftFang.setPos(0.45F, 1.7F, -1.8F);
            this.LeftFang.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(LeftFang, 0.13962634015954636F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 24, 29);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-2.2F, 3.1F, 2.0F);
            this.RightThigh.addBox(-1.5F, 0.0F, -2.5F, 3, 6, 4, 0.0F);
            this.setRotateAngle(RightThigh, 0.24434609527920614F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 48, 33);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.1F, 4.0F, 2.5F);
            this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(RightLeg, -0.3141592653589793F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 18, 5);
            this.Mouth.setPos(0.0F, 2.1F, -0.2F);
            this.Mouth.addBox(-1.0F, -0.2F, -2.6F, 2, 1, 3, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 34, 21);
            this.LeftArmBase.setPos(1.9F, 0.5F, 0.5F);
            this.LeftArmBase.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.2792526803190927F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 38, 30);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.3490658503988659F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 9);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.0F, -0.3F, -0.2F);
            this.RightEar.addBox(0.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(RightEar, -0.8028514559173915F, -0.3490658503988659F, -0.10471975511965977F);
            this.NeckLower = new ModelRenderer(this, 42, 0);
            this.NeckLower.setPos(0.0F, 2.0F, -4.5F);
            this.NeckLower.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 7, 0.0F);
            this.setRotateAngle(NeckLower, -0.12217304763960307F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 27);
            this.Hips.setPos(0.0F, 0.0F, 10.0F);
            this.Hips.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 5, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 9);
            this.Body.setPos(0.0F, -4.0F, 0.5F);
            this.Body.addBox(-3.5F, 0.0F, 0.0F, 7, 8, 10, 0.0F);
            this.setRotateAngle(Body, 0.24434609527920614F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 0, 14);
            this.RightHand.mirror = true;
            this.RightHand.setPos(-0.1F, 3.8F, 0.8F);
            this.RightHand.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.LeftHand = new ModelRenderer(this, 0, 14);
            this.LeftHand.setPos(0.1F, 3.8F, 0.8F);
            this.LeftHand.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.RightFoot = new ModelRenderer(this, 0, 14);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 3.8F, -1.2F);
            this.RightFoot.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.setRotateAngle(RightFoot, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 38, 30);
            this.LeftUpperLeg.setPos(0.0F, 6.0F, -2.2F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.3490658503988659F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 9);
            this.LeftEar.setPos(2.0F, -0.3F, -0.2F);
            this.LeftEar.addBox(-1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(LeftEar, -0.8028514559173915F, 0.3490658503988659F, 0.10471975511965977F);
            this.RightArm.addChild(this.RightForeArm);
            this.LeftLeg.addChild(this.LeftFoot);
            this.Muzzle.addChild(this.RightFang);
            this.Hips.addChild(this.Tail);
            this.Chest.addChild(this.RightArmBase);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.Head.addChild(this.Muzzle);
            this.Head.addChild(this.LeftAntler);
            this.Head.addChild(this.RightAntler);
            this.LeftArm.addChild(this.LeftForearm);
            this.Hips.addChild(this.LeftThigh);
            this.Neck.addChild(this.Head);
            this.RightArmBase.addChild(this.RightArm);
            this.Chest.addChild(this.Neck);
            this.LeftArmBase.addChild(this.LeftArm);
            this.Head.addChild(this.Tuft);
            this.Muzzle.addChild(this.TopSnout);
            this.Muzzle.addChild(this.LeftFang);
            this.Hips.addChild(this.RightThigh);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Muzzle.addChild(this.Mouth);
            this.Chest.addChild(this.LeftArmBase);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.Head.addChild(this.RightEar);
            this.Neck.addChild(this.NeckLower);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Body);
            this.RightForeArm.addChild(this.RightHand);
            this.LeftForearm.addChild(this.LeftHand);
            this.RightLeg.addChild(this.RightFoot);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Head.addChild(this.LeftEar);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuftedDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.12F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed, degree;

            if (isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 2.0f;
                degree = 1.0f;
                this.LeftArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.1F;
                this.LeftArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.LeftHand.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.3F;
                this.LeftUpperLeg.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
                this.LeftLeg.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.LeftFoot.xRot = MathHelper.cos(-3.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightThigh.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.3F;
                this.RightUpperLeg.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
                this.RightLeg.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.RightFoot.xRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightArmBase.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.1F;
                this.RightArm.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.RightForeArm.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.RightHand.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.7F;
                this.Head.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.Tail.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.4F * limbSwingAmount + 3.1F;
                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.05F;
                this.Chest.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount - 0.21F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.45F * limbSwingAmount + 0.25F;

            } else {
                speed = 2.0f;
                degree = 1.0f;
                this.LeftArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.LeftHand.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.24F;
                this.LeftUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.5F * limbSwingAmount + 0.5F;
                this.LeftLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.5F;
                this.LeftFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.RightThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.5F * limbSwingAmount + 0.5F;
                this.RightLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.RightFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.15F;
                this.RightForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.25F;
                this.RightHand.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.7F;
                this.Head.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.Tail.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 0.28F;
                this.Neck.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.25F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.25F * limbSwingAmount;
                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.02F * limbSwingAmount;
            }
        }
    }

    public static class Child extends TuftedDeerModel {
        public Child() {
            this.texWidth = 48;
            this.texHeight = 32;
            this.LeftHand = new ModelRenderer(this, 31, 0);
            this.LeftHand.setPos(0.1F, 1.8F, 0.9F);
            this.LeftHand.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 7);
            this.LeftEar.setPos(1.5F, 0.0F, 0.0F);
            this.LeftEar.addBox(-1.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(LeftEar, -0.8028514559173915F, 0.5585053606381855F, 0.10471975511965977F);
            this.Neck = new ModelRenderer(this, 16, 4);
            this.Neck.setPos(0.0F, -0.9F, -2.0F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(Neck, -0.6981317007977318F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 0);
            this.Head.setPos(0.0F, -0.9F, -2.9F);
            this.Head.addBox(-1.5F, -0.5F, -3.0F, 3, 3, 4, 0.0F);
            this.setRotateAngle(Head, 1.117010721276371F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 18, 16);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-1.3F, 2.3F, 0.4F);
            this.RightThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
            this.setRotateAngle(RightThigh, 0.17453292519943295F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 28, 12);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.02F, 3.0F, 1.0F);
            this.RightArm.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(RightArm, -0.06981317007977318F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 36, 16);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.02F, 2.0F, 2.0F);
            this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(RightLeg, -0.3141592653589793F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 31, 0);
            this.LeftFoot.setPos(0.1F, 2.8F, -1.1F);
            this.LeftFoot.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.setRotateAngle(LeftFoot, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 36, 16);
            this.LeftLeg.setPos(-0.02F, 2.0F, 2.0F);
            this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(LeftLeg, -0.3141592653589793F, 0.0F, 0.0F);
            this.LeftForearm = new ModelRenderer(this, 36, 12);
            this.LeftForearm.setPos(0.02F, 2.0F, -2.0F);
            this.LeftForearm.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.Tail = new ModelRenderer(this, 12, 18);
            this.Tail.setPos(0.0F, 0.4F, 2.5F);
            this.Tail.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F);
            this.setRotateAngle(Tail, 0.41887902047863906F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 28, 16);
            this.LeftUpperLeg.setPos(-0.1F, 3.0F, -1.2F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.3490658503988659F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 31, 0);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(-0.1F, 2.8F, -1.1F);
            this.RightFoot.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.setRotateAngle(RightFoot, 0.05235987755982988F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 20, 11);
            this.LeftArmBase.setPos(1.1F, 0.6F, 0.1F);
            this.LeftArmBase.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.2792526803190927F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 14, 4);
            this.Mouth.setPos(0.0F, 0.7F, -0.2F);
            this.Mouth.addBox(-0.5F, -0.2F, -1.6F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Mouth, -0.06981317007977318F, 0.0F, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 18, 16);
            this.LeftThigh.setPos(1.3F, 2.3F, 0.4F);
            this.LeftThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
            this.setRotateAngle(LeftThigh, 0.17453292519943295F, 0.0F, 0.0F);
            this.Muzzle = new ModelRenderer(this, 16, 0);
            this.Muzzle.setPos(0.0F, 0.9F, -2.4F);
            this.Muzzle.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Muzzle, 0.13962634015954636F, 0.0F, 0.0F);
            this.Tuft = new ModelRenderer(this, 24, 0);
            this.Tuft.setPos(0.0F, -0.4F, -3.0F);
            this.Tuft.addBox(-1.0F, -0.2F, 0.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(Tuft, 0.13962634015954636F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 28, 16);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.1F, 3.0F, -1.2F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.3490658503988659F, 0.0F, 0.0F);
            this.RightForeArm = new ModelRenderer(this, 36, 12);
            this.RightForeArm.mirror = true;
            this.RightForeArm.setPos(-0.02F, 2.0F, -2.0F);
            this.RightForeArm.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 18);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Hips, -0.2792526803190927F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 28, 4);
            this.Chest.setPos(0.0F, 17.1F, -3.0F);
            this.Chest.addBox(-1.5F, -2.0F, -1.5F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Chest, -0.20943951023931953F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 7);
            this.Body.setPos(0.0F, -2.0F, 0.5F);
            this.Body.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 6, 0.0F);
            this.setRotateAngle(Body, 0.24434609527920614F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 0, 7);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, 0.0F, 0.0F);
            this.RightEar.addBox(0.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(RightEar, -0.8028514559173915F, -0.5585053606381855F, -0.10471975511965977F);
            this.RightArmBase = new ModelRenderer(this, 20, 11);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-1.1F, 0.6F, 0.1F);
            this.RightArmBase.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(RightArmBase, 0.2792526803190927F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 0);
            this.TopSnout.setPos(0.0F, -1.4F, -0.2F);
            this.TopSnout.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(TopSnout, 0.13962634015954636F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 28, 12);
            this.LeftArm.setPos(-0.02F, 3.0F, 1.0F);
            this.LeftArm.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(LeftArm, -0.06981317007977318F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 31, 0);
            this.RightHand.mirror = true;
            this.RightHand.setPos(-0.1F, 1.8F, 0.9F);
            this.RightHand.addBox(-1.0F, -0.2F, -1.3F, 2, 1, 2, 0.0F);
            this.LeftForearm.addChild(this.LeftHand);
            this.Head.addChild(this.LeftEar);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.Hips.addChild(this.RightThigh);
            this.RightArmBase.addChild(this.RightArm);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.LeftArm.addChild(this.LeftForearm);
            this.Hips.addChild(this.Tail);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.RightLeg.addChild(this.RightFoot);
            this.Chest.addChild(this.LeftArmBase);
            this.Muzzle.addChild(this.Mouth);
            this.Hips.addChild(this.LeftThigh);
            this.Head.addChild(this.Muzzle);
            this.Head.addChild(this.Tuft);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.RightArm.addChild(this.RightForeArm);
            this.Body.addChild(this.Hips);
            this.Chest.addChild(this.Body);
            this.Head.addChild(this.RightEar);
            this.Chest.addChild(this.RightArmBase);
            this.Muzzle.addChild(this.TopSnout);
            this.LeftArmBase.addChild(this.LeftArm);
            this.RightForeArm.addChild(this.RightHand);
            this.saveBase();
        }

        @Override
        public void setupAnim(TuftedDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 1.12F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed, degree = 0.8F;

            if (isSwimming) {
                limbSwing = (float)entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting()) {
                speed = 2.0f;
                this.LeftArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.1F;
                this.LeftArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.LeftHand.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.3F;
                this.LeftUpperLeg.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
                this.LeftLeg.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.LeftFoot.xRot = MathHelper.cos(-3.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightThigh.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -1.8F * limbSwingAmount + 0.3F;
                this.RightUpperLeg.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.5F;
                this.RightLeg.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.RightFoot.xRot = MathHelper.cos(-3.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightArmBase.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 1.8F * limbSwingAmount + 0.1F;
                this.RightArm.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.RightForeArm.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.RightHand.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.7F;
                this.Head.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.8F;
                this.Tail.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.4F * limbSwingAmount + 3.1F;
                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.05F;
                this.Chest.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount - 0.21F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.45F * limbSwingAmount + 0.25F;

            } else {
                speed = 2.0f;
                this.LeftArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.28F;
                this.LeftArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 0.6F * limbSwingAmount - 0.15F;
                this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.25F;
                this.LeftHand.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.LeftThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.24F;
                this.LeftUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.5F * limbSwingAmount + 0.5F;
                this.LeftLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.5F;
                this.LeftFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
                this.RightThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.24F;
                this.RightUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.5F * limbSwingAmount + 0.5F;
                this.RightLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
                this.RightFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount;
                this.RightArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.28F;
                this.RightArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.6F * limbSwingAmount - 0.15F;
                this.RightForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.25F;
                this.RightHand.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount;
                this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.7F;
                this.Head.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 1.12F;
                this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.RightEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.8F;
                this.Tail.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount + 0.28F;
                this.Neck.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.25F * limbSwingAmount;
                this.Head.yRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.25F * limbSwingAmount;
                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.02F * limbSwingAmount;
            }
        }
    }
}
