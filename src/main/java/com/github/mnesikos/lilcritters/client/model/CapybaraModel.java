package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;

public abstract class CapybaraModel extends ZawaBaseModel<CapybaraEntity> {
    public ModelRenderer Chest;
    public ModelRenderer Neck;
    public ModelRenderer Hips;
    public ModelRenderer LeftThigh;
    public ModelRenderer RightThigh;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer RightFoot;
    public ModelRenderer Head;
    public ModelRenderer Mouth;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftHand;
    public ModelRenderer RightArm;
    public ModelRenderer RightHand;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Chest);
        }

        return this.parts;
    }

    public CapybaraModel() {
    }

    public static class Adult extends CapybaraModel {
        public ModelRenderer Torso;
        public ModelRenderer LeftArmBase;
        public ModelRenderer RightArmBase;
        public ModelRenderer LeftLeg;
        public ModelRenderer RightLeg;
        public ModelRenderer Snout;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Head = new ModelRenderer(this, 0, 51);
            this.Head.setPos(0.0F, 0.3F, -3.9F);
            this.Head.addBox(-2.5F, -1.0F, -6.0F, 5, 6, 7, 0.0F);
            this.setRotateAngle(Head, 0.6283185307179586F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 16);
            this.Chest.setPos(0.0F, 13.7F, -3.5F);
            this.Chest.addBox(-3.5F, -4.0F, -3.0F, 7, 8, 6, 0.0F);
            this.setRotateAngle(Chest, -0.13962634015954636F, 0.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this, 13, 9);
            this.LeftLeg.setPos(0.0F, 3.9F, 0.8F);
            this.LeftLeg.addBox(-1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(LeftLeg, -0.4886921905584123F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 44, 13);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.0F, 3.5F, 0.0F);
            this.RightHand.addBox(-1.5F, -0.5F, -2.2F, 3, 2, 3, 0.0F);
            this.setRotateAngle(RightHand, 0.10471975511965977F, 0.0F, 0.0F);
            this.Torso = new ModelRenderer(this, 19, 24);
            this.Torso.setPos(0.0F, -3.9F, 1.0F);
            this.Torso.addBox(-4.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
            this.setRotateAngle(Torso, 0.22689280275926282F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 0, 0);
            this.LeftEar.setPos(2.4F, -0.2F, -0.4F);
            this.LeftEar.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(LeftEar, -0.2792526803190927F, 0.2792526803190927F, 0.06981317007977318F);
            this.RightEar = new ModelRenderer(this, 0, 0);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-2.4F, -0.2F, -0.4F);
            this.RightEar.addBox(0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(RightEar, -0.2792526803190927F, -0.2792526803190927F, -0.06981317007977318F);
            this.Hips = new ModelRenderer(this, 0, 37);
            this.Hips.setPos(0.0F, 0.1F, 7.6F);
            this.Hips.addBox(-3.5F, 0.0F, 0.0F, 7, 8, 5, 0.0F);
            this.setRotateAngle(Hips, -0.3490658503988659F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 44, 19);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-3.6F, 3.1F, 2.2F);
            this.RightThigh.addBox(-0.9F, -0.8F, -2.5F, 5, 6, 5, 0.0F);
            this.setRotateAngle(RightThigh, 0.017453292519943295F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 0, 9);
            this.LeftFoot.setPos(0.0F, 2.0F, 0.0F);
            this.LeftFoot.addBox(-1.5F, 0.0F, -2.2F, 3, 2, 3, 0.0F);
            this.setRotateAngle(LeftFoot, 0.13962634015954636F, 0.0F, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 47, 2);
            this.LeftUpperLeg.setPos(2.4F, 4.2F, -1.7F);
            this.LeftUpperLeg.addBox(-1.5F, -0.5F, -0.5F, 3, 5, 3, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.593411945678072F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 47, 2);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.7F, 4.2F, -1.7F);
            this.RightUpperLeg.addBox(-1.5F, -0.5F, -0.5F, 3, 5, 3, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.593411945678072F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 0, 9);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(0.0F, 2.0F, 0.0F);
            this.RightFoot.addBox(-1.5F, 0.0F, -2.2F, 3, 2, 3, 0.0F);
            this.setRotateAngle(RightFoot, 0.13962634015954636F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 35, 20);
            this.Mouth.setPos(0.0F, 3.9F, -5.5F);
            this.Mouth.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
            this.LeftThigh = new ModelRenderer(this, 44, 19);
            this.LeftThigh.setPos(0.4F, 3.1F, 2.2F);
            this.LeftThigh.addBox(-0.9F, -0.8F, -2.5F, 5, 6, 5, 0.0F);
            this.setRotateAngle(LeftThigh, 0.017453292519943295F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 37, 8);
            this.RightArm.mirror = true;
            this.RightArm.setPos(0.0F, 5.7F, -0.2F);
            this.RightArm.addBox(-1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(RightArm, -0.20943951023931953F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 19, 45);
            this.Neck.setPos(0.0F, -2.9F, -2.5F);
            this.Neck.addBox(-3.0F, -1.0F, -3.5F, 6, 6, 6, 0.0F);
            this.setRotateAngle(Neck, -0.47123889803846897F, 0.0F, 0.0F);
            this.RightLeg = new ModelRenderer(this, 13, 9);
            this.RightLeg.mirror = true;
            this.RightLeg.setPos(0.0F, 3.9F, 0.8F);
            this.RightLeg.addBox(-1.0F, -0.5F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(RightLeg, -0.4886921905584123F, 0.0F, 0.0F);
            this.LeftArmBase = new ModelRenderer(this, 21, 0);
            this.LeftArmBase.setPos(2.7F, -0.3F, 0.0F);
            this.LeftArmBase.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
            this.setRotateAngle(LeftArmBase, 0.22689280275926282F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 44, 13);
            this.LeftHand.setPos(0.0F, 3.5F, 0.0F);
            this.LeftHand.addBox(-1.5F, -0.5F, -2.2F, 3, 2, 3, 0.0F);
            this.setRotateAngle(LeftHand, 0.10471975511965977F, 0.0F, 0.0F);
            this.RightArmBase = new ModelRenderer(this, 21, 0);
            this.RightArmBase.mirror = true;
            this.RightArmBase.setPos(-2.7F, -0.3F, 0.0F);
            this.RightArmBase.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
            this.setRotateAngle(RightArmBase, 0.22689280275926282F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 37, 8);
            this.LeftArm.setPos(0.0F, 5.7F, -0.2F);
            this.LeftArm.addBox(-1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(LeftArm, -0.20943951023931953F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 13);
            this.Snout.setPos(0.0F, -0.8F, -6.4F);
            this.Snout.addBox(-2.0F, 0.0F, -1.7F, 4, 5, 3, 0.0F);
            this.setRotateAngle(Snout, 0.10471975511965977F, 0.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.LeftUpperLeg.addChild(this.LeftLeg);
            this.RightArm.addChild(this.RightHand);
            this.Chest.addChild(this.Torso);
            this.Head.addChild(this.LeftEar);
            this.Head.addChild(this.RightEar);
            this.Torso.addChild(this.Hips);
            this.Hips.addChild(this.RightThigh);
            this.LeftLeg.addChild(this.LeftFoot);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.RightLeg.addChild(this.RightFoot);
            this.Head.addChild(this.Mouth);
            this.Hips.addChild(this.LeftThigh);
            this.RightArmBase.addChild(this.RightArm);
            this.Chest.addChild(this.Neck);
            this.RightUpperLeg.addChild(this.RightLeg);
            this.Chest.addChild(this.LeftArmBase);
            this.LeftArm.addChild(this.LeftHand);
            this.Chest.addChild(this.RightArmBase);
            this.LeftArmBase.addChild(this.LeftArm);
            this.Head.addChild(this.Snout);

            this.saveBase();
        }

        @Override
        public void setupAnim(CapybaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.63F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.RightEar.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.47F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 6.0f, degree = 0.8f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.LeftArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.15F;
            this.LeftArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.29F;
            this.LeftHand.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.LeftThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.2F;
            this.LeftUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.5F;
            this.LeftLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.5F;
            this.LeftFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount;
            this.RightThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.2F;
            this.RightUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.5F;
            this.RightLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.5F;
            this.RightFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount;
            this.RightArmBase.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.15F;
            this.RightArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.29F;
            this.RightHand.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.5F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.RightEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.28F;
            this.Chest.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 13.7F;
        }
    }

    public static class Child extends CapybaraModel {
        public ModelRenderer Body;
        public ModelRenderer LeftLowerLeg;
        public ModelRenderer RightLowerLeg;
        public ModelRenderer LeftForearm;
        public ModelRenderer RightForearm;
        public ModelRenderer Nose;

        public Child() {
            this.texWidth = 48;
            this.texHeight = 32;
            this.LeftThigh = new ModelRenderer(this, 31, 9);
            this.LeftThigh.setPos(1.8F, 1.2F, 1.6F);
            this.LeftThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
            this.setRotateAngle(LeftThigh, 0.08726646259971647F, 0.0F, 0.0F);
            this.LeftLowerLeg = new ModelRenderer(this, 29, 21);
            this.LeftLowerLeg.setPos(-0.1F, 1.8F, 1.8F);
            this.LeftLowerLeg.addBox(-1.0F, 0.0F, -1.9F, 2, 3, 2, 0.0F);
            this.setRotateAngle(LeftLowerLeg, -0.6806784082777886F, 0.0F, 0.0F);
            this.Nose = new ModelRenderer(this, 0, 17);
            this.Nose.setPos(0.0F, -0.4F, -2.0F);
            this.Nose.addBox(-1.0F, 0.0F, -1.5F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Nose, 0.13962634015954636F, 0.0F, 0.0F);
            this.RightUpperLeg = new ModelRenderer(this, 28, 16);
            this.RightUpperLeg.mirror = true;
            this.RightUpperLeg.setPos(0.1F, 2.5F, -1.5F);
            this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(RightUpperLeg, 0.5235987755982988F, 0.0F, 0.0F);
            this.LeftHand = new ModelRenderer(this, 19, 0);
            this.LeftHand.setPos(-0.1F, 1.7F, -0.2F);
            this.LeftHand.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(LeftHand, 0.06981317007977318F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 16, 7);
            this.Chest.setPos(0.0F, 18.6F, -1.5F);
            this.Chest.addBox(-2.0F, -2.0F, -1.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(Chest, -0.2617993877991494F, 0.0F, 0.0F);
            this.RightForearm = new ModelRenderer(this, 20, 21);
            this.RightForearm.mirror = true;
            this.RightForearm.setPos(0.1F, 2.8F, 0.1F);
            this.RightForearm.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(RightForearm, -0.13962634015954636F, 0.0F, 0.0F);
            this.RightArm = new ModelRenderer(this, 18, 15);
            this.RightArm.mirror = true;
            this.RightArm.setPos(-1.6F, 0.0F, -0.2F);
            this.RightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(RightArm, 0.3490658503988659F, 0.0F, 0.0F);
            this.RightThigh = new ModelRenderer(this, 31, 9);
            this.RightThigh.mirror = true;
            this.RightThigh.setPos(-1.8F, 1.2F, 1.6F);
            this.RightThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
            this.setRotateAngle(RightThigh, 0.08726646259971647F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 22);
            this.Mouth.setPos(0.0F, 1.4F, -1.5F);
            this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
            this.LeftUpperLeg = new ModelRenderer(this, 28, 16);
            this.LeftUpperLeg.setPos(-0.1F, 2.5F, -1.5F);
            this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(LeftUpperLeg, 0.5235987755982988F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 10);
            this.Head.setPos(0.01F, 0.7F, -2.3F);
            this.Head.addBox(-1.5F, -0.5F, -2.0F, 3, 3, 3, 0.0F);
            this.setRotateAngle(Head, 0.6108652381980153F, 0.0F, 0.0F);
            this.RightEar = new ModelRenderer(this, 14, 0);
            this.RightEar.mirror = true;
            this.RightEar.setPos(-1.5F, 0.2F, 0.4F);
            this.RightEar.addBox(0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(RightEar, -0.41887902047863906F, -0.2792526803190927F, -0.06981317007977318F);
            this.Neck = new ModelRenderer(this, 8, 19);
            this.Neck.setPos(0.0F, -1.9F, -0.7F);
            this.Neck.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(Neck, -0.3839724354387525F, 0.0F, 0.0F);
            this.RightLowerLeg = new ModelRenderer(this, 29, 21);
            this.RightLowerLeg.mirror = true;
            this.RightLowerLeg.setPos(0.1F, 1.8F, 1.8F);
            this.RightLowerLeg.addBox(-1.0F, 0.0F, -1.9F, 2, 3, 2, 0.0F);
            this.setRotateAngle(RightLowerLeg, -0.6806784082777886F, 0.0F, 0.0F);
            this.LeftEar = new ModelRenderer(this, 14, 0);
            this.LeftEar.setPos(1.5F, 0.2F, 0.4F);
            this.LeftEar.addBox(-1.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(LeftEar, -0.41887902047863906F, 0.2792526803190927F, 0.06981317007977318F);
            this.LeftForearm = new ModelRenderer(this, 20, 21);
            this.LeftForearm.setPos(-0.1F, 2.8F, 0.1F);
            this.LeftForearm.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(LeftForearm, -0.13962634015954636F, 0.0F, 0.0F);
            this.RightFoot = new ModelRenderer(this, 40, 0);
            this.RightFoot.mirror = true;
            this.RightFoot.setPos(0.1F, 2.4F, -1.0F);
            this.RightFoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(RightFoot, 0.22689280275926282F, 0.0F, 0.0F);
            this.RightHand = new ModelRenderer(this, 19, 0);
            this.RightHand.mirror = true;
            this.RightHand.setPos(0.1F, 1.7F, -0.2F);
            this.RightHand.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(RightHand, 0.06981317007977318F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, -2.0F, -0.2F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5, 5, 4, 0.0F);
            this.setRotateAngle(Body, 0.3839724354387525F, 0.0F, 0.0F);
            this.LeftArm = new ModelRenderer(this, 18, 15);
            this.LeftArm.setPos(1.6F, 0.0F, -0.2F);
            this.LeftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(LeftArm, 0.3490658503988659F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 29, 1);
            this.Hips.setPos(0.0F, 0.1F, 3.7F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
            this.setRotateAngle(Hips, -0.2792526803190927F, 0.0F, 0.0F);
            this.LeftFoot = new ModelRenderer(this, 40, 0);
            this.LeftFoot.setPos(-0.1F, 2.4F, -1.0F);
            this.LeftFoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(LeftFoot, 0.22689280275926282F, 0.0F, 0.0F);
            this.Hips.addChild(this.LeftThigh);
            this.LeftUpperLeg.addChild(this.LeftLowerLeg);
            this.Head.addChild(this.Nose);
            this.RightThigh.addChild(this.RightUpperLeg);
            this.LeftForearm.addChild(this.LeftHand);
            this.RightArm.addChild(this.RightForearm);
            this.Chest.addChild(this.RightArm);
            this.Hips.addChild(this.RightThigh);
            this.Head.addChild(this.Mouth);
            this.LeftThigh.addChild(this.LeftUpperLeg);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.RightEar);
            this.Chest.addChild(this.Neck);
            this.RightUpperLeg.addChild(this.RightLowerLeg);
            this.Head.addChild(this.LeftEar);
            this.LeftArm.addChild(this.LeftForearm);
            this.RightLowerLeg.addChild(this.RightFoot);
            this.RightForearm.addChild(this.RightHand);
            this.Chest.addChild(this.Body);
            this.Chest.addChild(this.LeftArm);
            this.Body.addChild(this.Hips);
            this.LeftLowerLeg.addChild(this.LeftFoot);

            this.saveBase();
        }

        @Override
        public void setupAnim(CapybaraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.61F;
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Head.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.05F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.RightEar.xRot = MathHelper.cos(-1.5F + limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.4F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f, degree = 0.8f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.LeftArm.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.35F;
            this.LeftHand.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.LeftThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * 1.5F * limbSwingAmount + 0.09F;
            this.LeftUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount + 0.52F;
            this.LeftFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.RightThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.1F) * degree * -1.5F * limbSwingAmount + 0.09F;
            this.RightUpperLeg.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount + 0.52F;
            this.RightFoot.xRot = MathHelper.cos(-2.5F + limbSwing * speed * -0.1F) * degree * -1.0F * limbSwingAmount + 0.23F;
            this.RightArm.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount + 0.35F;
            this.RightHand.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount + 0.23F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount - 0.4F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount + 0.65F;
            this.LeftEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.RightEar.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.2F) * degree * -0.1F * limbSwingAmount - 0.4F;
            this.Chest.y = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.8F * limbSwingAmount + 18.6F;
            this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * 1.0F * limbSwingAmount - 0.15F;
            this.RightForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -1.0F * limbSwingAmount - 0.15F;
            this.LeftLowerLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * -0.8F * limbSwingAmount - 0.7F;
            this.RightLowerLeg.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.1F) * degree * 0.8F * limbSwingAmount - 0.7F;
        }
    }
}
