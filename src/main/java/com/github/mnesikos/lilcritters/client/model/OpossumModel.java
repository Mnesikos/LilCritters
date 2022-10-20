package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.OpossumEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;

public abstract class OpossumModel extends ZawaBaseModel<OpossumEntity> {
    public ModelRenderer chest;
    public ModelRenderer body;
    public ModelRenderer leftshoulder;
    public ModelRenderer rightshoulder;
    public ModelRenderer Neck;
    public ModelRenderer tailbase;
    public ModelRenderer leftthigh;
    public ModelRenderer rightthigh;
    public ModelRenderer tailmiddle;
    public ModelRenderer tailend;
    public ModelRenderer legleft;
    public ModelRenderer footleft;
    public ModelRenderer legright;
    public ModelRenderer footright;
    public ModelRenderer leftarm;
    public ModelRenderer lefthand;
    public ModelRenderer rightarm;
    public ModelRenderer righthand;
    public ModelRenderer head;
    public ModelRenderer mouth;
    public ModelRenderer lips;
    public ModelRenderer rightear;
    public ModelRenderer leftear;
    public ModelRenderer snout;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.chest);
        }

        return this.parts;
    }

    public static class Adult extends OpossumModel {
        public ModelRenderer hips;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.tailend = new ModelRenderer(this, 53, 13);
            this.tailend.setPos(0.0F, 0.5F, 3.5F);
            this.tailend.addBox(-0.5F, -0.4F, 0.0F, 1, 1, 4, 0.0F);
            this.setRotateAngle(tailend, 0.41887902047863906F, 0.0F, 0.0F);
            this.legleft = new ModelRenderer(this, 44, 10);
            this.legleft.mirror = true;
            this.legleft.setPos(-0.02F, 2.5F, -1.0F);
            this.legleft.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
            this.setRotateAngle(legleft, 0.45378560551852565F, 0.0F, 0.0F);
            this.tailmiddle = new ModelRenderer(this, 53, 7);
            this.tailmiddle.setPos(0.0F, 0.0F, 3.5F);
            this.tailmiddle.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
            this.setRotateAngle(tailmiddle, 0.2792526803190927F, 0.0F, 0.0F);
            this.rightthigh = new ModelRenderer(this, 43, 15);
            this.rightthigh.setPos(-1.9F, 1.6F, 0.9F);
            this.rightthigh.addBox(-1.0F, -0.5F, -1.5F, 2, 4, 3, 0.0F);
            this.setRotateAngle(rightthigh, -0.20943951023931953F, 0.0F, 0.0F);
            this.righthand = new ModelRenderer(this, 4, 10);
            this.righthand.setPos(0.02F, 2.4F, -1.5F);
            this.righthand.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(righthand, 0.13962634015954636F, 0.0F, 0.0F);
            this.rightarm = new ModelRenderer(this, 4, 13);
            this.rightarm.setPos(0.02F, 2.0F, 1.0F);
            this.rightarm.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(rightarm, -0.45378560551852565F, 0.0F, 0.0F);
            this.rightshoulder = new ModelRenderer(this, 4, 19);
            this.rightshoulder.setPos(-1.8F, 0.8F, 0.0F);
            this.rightshoulder.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(rightshoulder, 0.22689280275926282F, 0.0F, 0.0F);
            this.leftshoulder = new ModelRenderer(this, 4, 19);
            this.leftshoulder.mirror = true;
            this.leftshoulder.setPos(1.8F, 0.8F, 0.0F);
            this.leftshoulder.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(leftshoulder, 0.22689280275926282F, 0.0F, 0.0F);
            this.legright = new ModelRenderer(this, 44, 10);
            this.legright.setPos(0.02F, 2.5F, -1.0F);
            this.legright.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
            this.setRotateAngle(legright, 0.45378560551852565F, 0.0F, 0.0F);
            this.lefthand = new ModelRenderer(this, 4, 10);
            this.lefthand.mirror = true;
            this.lefthand.setPos(-0.02F, 2.4F, -1.5F);
            this.lefthand.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(lefthand, 0.13962634015954636F, 0.0F, 0.0F);
            this.leftear = new ModelRenderer(this, 6, 4);
            this.leftear.mirror = true;
            this.leftear.setPos(2.0F, -1.4F, 0.7F);
            this.leftear.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
            this.setRotateAngle(leftear, 0.3490658503988659F, -0.20943951023931953F, -1.0471975511965976F);
            this.body = new ModelRenderer(this, 16, 21);
            this.body.setPos(0.0F, -1.6F, 1.0F);
            this.body.addBox(-3.0F, -0.5F, -0.5F, 6, 5, 6, 0.0F);
            this.setRotateAngle(body, -0.08726646259971647F, 0.0F, 0.0F);
            this.rightear = new ModelRenderer(this, 6, 4);
            this.rightear.setPos(-2.0F, -1.4F, 0.7F);
            this.rightear.addBox(-1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F);
            this.setRotateAngle(rightear, 0.3490658503988659F, 0.20943951023931953F, 1.0471975511965976F);
            this.mouth = new ModelRenderer(this, 28, 1);
            this.mouth.setPos(0.0F, 0.2F, -1.4F);
            this.mouth.addBox(-1.0F, -0.5F, -2.5F, 2, 2, 3, 0.0F);
            this.setRotateAngle(mouth, 0.13962634015954636F, 0.0F, 0.0F);
            this.lips = new ModelRenderer(this, 13, 3);
            this.lips.setPos(0.0F, 1.5F, -1.2F);
            this.lips.addBox(-0.5F, -0.4F, -2.0F, 1, 1, 2, 0.0F);
            this.chest = new ModelRenderer(this, 0, 24);
            this.chest.setPos(0.0F, 18.5F, -2.5F);
            this.chest.addBox(-2.5F, -2.0F, -1.5F, 5, 5, 3, 0.0F);
            this.setRotateAngle(chest, 0.08726646259971647F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 22, 14);
            this.Neck.setPos(0.0F, -1.5F, -1.0F);
            this.Neck.addBox(-1.5F, -0.5F, -2.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(Neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.footleft = new ModelRenderer(this, 44, 7);
            this.footleft.mirror = true;
            this.footleft.setPos(-0.02F, 2.4F, 0.0F);
            this.footleft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(footleft, -0.13962634015954636F, 0.0F, 0.0F);
            this.footright = new ModelRenderer(this, 44, 7);
            this.footright.setPos(0.02F, 2.4F, 0.0F);
            this.footright.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
            this.setRotateAngle(footright, -0.13962634015954636F, 0.0F, 0.0F);
            this.snout = new ModelRenderer(this, 19, 2);
            this.snout.setPos(0.0F, -0.1F, -0.1F);
            this.snout.addBox(-0.5F, -1.0F, -2.5F, 1, 1, 3, 0.0F);
            this.setRotateAngle(snout, 0.22689280275926282F, 0.0F, 0.0F);
            this.hips = new ModelRenderer(this, 40, 24);
            this.hips.setPos(0.0F, 0.1F, 5.0F);
            this.hips.addBox(-2.5F, -0.5F, -0.5F, 5, 5, 3, 0.0F);
            this.setRotateAngle(hips, -0.08726646259971647F, 0.0F, 0.0F);
            this.leftthigh = new ModelRenderer(this, 43, 15);
            this.leftthigh.mirror = true;
            this.leftthigh.setPos(2.4F, 1.6F, 0.9F);
            this.leftthigh.addBox(-1.0F, -0.5F, -1.5F, 2, 4, 3, 0.0F);
            this.setRotateAngle(leftthigh, -0.20943951023931953F, 0.0F, 0.0F);
            this.head = new ModelRenderer(this, 21, 7);
            this.head.setPos(0.0F, 1.5F, -2.5F);
            this.head.addBox(-2.0F, -2.0F, -1.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(head, 0.17453292519943295F, 0.0F, 0.0F);
            this.tailbase = new ModelRenderer(this, 52, 0);
            this.tailbase.setPos(0.0F, 0.0F, 2.0F);
            this.tailbase.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F);
            this.setRotateAngle(tailbase, -0.7330382858376184F, 0.0F, 0.0F);
            this.leftarm = new ModelRenderer(this, 4, 13);
            this.leftarm.mirror = true;
            this.leftarm.setPos(-0.02F, 2.0F, 1.0F);
            this.leftarm.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(leftarm, -0.45378560551852565F, 0.0F, 0.0F);
            this.tailmiddle.addChild(this.tailend);
            this.leftthigh.addChild(this.legleft);
            this.tailbase.addChild(this.tailmiddle);
            this.hips.addChild(this.rightthigh);
            this.rightarm.addChild(this.righthand);
            this.rightshoulder.addChild(this.rightarm);
            this.chest.addChild(this.rightshoulder);
            this.chest.addChild(this.leftshoulder);
            this.rightthigh.addChild(this.legright);
            this.leftarm.addChild(this.lefthand);
            this.head.addChild(this.leftear);
            this.chest.addChild(this.body);
            this.head.addChild(this.rightear);
            this.head.addChild(this.mouth);
            this.head.addChild(this.lips);
            this.chest.addChild(this.Neck);
            this.legleft.addChild(this.footleft);
            this.legright.addChild(this.footright);
            this.mouth.addChild(this.snout);
            this.body.addChild(this.hips);
            this.hips.addChild(this.leftthigh);
            this.Neck.addChild(this.head);
            this.hips.addChild(this.tailbase);
            this.leftshoulder.addChild(this.leftarm);

            this.saveBase();
        }

        @Override
        public void setupAnim(OpossumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.17F;
            this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.2F;
            this.tailbase.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.73F;
            this.tailbase.yRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
            this.tailend.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.42F;
            this.leftear.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount - 1.05F;
            this.rightear.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.5f;
            if (entity.isInWater()) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.leftshoulder.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.22F;
            this.leftarm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.45F;
            this.lefthand.xRot = MathHelper.cos(0.8F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.16F;
            this.rightshoulder.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.22F;
            this.rightarm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.45F;
            this.righthand.xRot = MathHelper.cos(0.8F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.16F;
            this.leftthigh.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.21F;
            this.legleft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.45F;
            this.footleft.xRot = MathHelper.cos(1.4F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.16F;
            this.rightthigh.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.21F;
            this.legright.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.45F;
            this.footright.xRot = MathHelper.cos(1.4F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.16F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.18F;
            this.tailbase.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.74F;
            this.tailbase.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.tailend.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.4F;
            this.chest.y = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.5F * limbSwingAmount + 18.5F;
        }
    }

    public static class Child extends OpossumModel {
        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.footright = new ModelRenderer(this, 24, 4);
            this.footright.setPos(0.02F, 1.5F, 0.5F);
            this.footright.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(footright, -0.13962634015954636F, 0.0F, 0.0F);
            this.tailbase = new ModelRenderer(this, 23, 0);
            this.tailbase.setPos(0.0F, 0.0F, 2.0F);
            this.tailbase.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(tailbase, -0.7330382858376184F, 0.0F, 0.0F);
            this.snout = new ModelRenderer(this, 10, 0);
            this.snout.setPos(0.0F, -0.2F, 0.1F);
            this.snout.addBox(-0.5F, -1.0F, -2.5F, 1, 1, 3, 0.0F);
            this.setRotateAngle(snout, 0.22689280275926282F, 0.0F, 0.0F);
            this.leftshoulder = new ModelRenderer(this, 0, 7);
            this.leftshoulder.mirror = true;
            this.leftshoulder.setPos(1.3F, -0.2F, -0.2F);
            this.leftshoulder.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.setRotateAngle(leftshoulder, 0.22689280275926282F, 0.0F, 0.0F);
            this.footleft = new ModelRenderer(this, 24, 4);
            this.footleft.mirror = true;
            this.footleft.setPos(-0.02F, 1.5F, 0.5F);
            this.footleft.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(footleft, -0.13962634015954636F, 0.0F, 0.0F);
            this.rightarm = new ModelRenderer(this, 0, 4);
            this.rightarm.setPos(0.02F, 2.0F, 0.5F);
            this.rightarm.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(rightarm, -0.45378560551852565F, 0.0F, 0.0F);
            this.legleft = new ModelRenderer(this, 25, 7);
            this.legleft.mirror = true;
            this.legleft.setPos(-0.02F, 1.7F, -0.7F);
            this.legleft.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(legleft, 0.45378560551852565F, 0.0F, 0.0F);
            this.leftear = new ModelRenderer(this, 0, 0);
            this.leftear.mirror = true;
            this.leftear.setPos(1.0F, -1.0F, -0.3F);
            this.leftear.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(leftear, 0.3490658503988659F, -0.20943951023931953F, -1.0471975511965976F);
            this.leftarm = new ModelRenderer(this, 0, 4);
            this.leftarm.mirror = true;
            this.leftarm.setPos(-0.02F, 2.0F, 0.5F);
            this.leftarm.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(leftarm, -0.45378560551852565F, 0.0F, 0.0F);
            this.leftthigh = new ModelRenderer(this, 26, 13);
            this.leftthigh.mirror = true;
            this.leftthigh.setPos(1.7F, 1.7F, 0.8F);
            this.leftthigh.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(leftthigh, -0.05235987755982988F, 0.0F, 0.0F);
            this.rightshoulder = new ModelRenderer(this, 0, 7);
            this.rightshoulder.setPos(-1.3F, -0.2F, -0.2F);
            this.rightshoulder.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.setRotateAngle(rightshoulder, 0.22689280275926282F, 0.0F, 0.0F);
            this.tailend = new ModelRenderer(this, 19, 15);
            this.tailend.setPos(-0.02F, 0.5F, 3.0F);
            this.tailend.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
            this.setRotateAngle(tailend, 0.41887902047863906F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 16, 3);
            this.Neck.setPos(0.0F, -0.4F, -0.4F);
            this.Neck.addBox(-1.0F, -1.5F, -1.5F, 2, 3, 2, 0.0F);
            this.setRotateAngle(Neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.lips = new ModelRenderer(this, 4, 0);
            this.lips.setPos(0.0F, 0.3F, -0.9F);
            this.lips.addBox(-0.5F, -0.4F, -1.2F, 1, 1, 2, 0.0F);
            this.setRotateAngle(lips, -0.13962634015954636F, 0.0F, 0.0F);
            this.tailmiddle = new ModelRenderer(this, 11, 15);
            this.tailmiddle.setPos(0.0F, 0.5F, 1.5F);
            this.tailmiddle.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
            this.setRotateAngle(tailmiddle, 0.2792526803190927F, 0.0F, 0.0F);
            this.chest = new ModelRenderer(this, 0, 10);
            this.chest.setPos(0.0F, 20.1F, -2.5F);
            this.chest.addBox(-1.5F, -2.0F, -1.0F, 3, 4, 4, 0.0F);
            this.setRotateAngle(chest, 0.08726646259971647F, 0.0F, 0.0F);
            this.body = new ModelRenderer(this, 14, 8);
            this.body.setPos(0.0F, -1.4F, 3.2F);
            this.body.addBox(-2.0F, -0.5F, -0.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(body, -0.3665191429188092F, 0.0F, 0.0F);
            this.rightthigh = new ModelRenderer(this, 26, 13);
            this.rightthigh.setPos(-1.7F, 1.7F, 0.8F);
            this.rightthigh.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(rightthigh, -0.05235987755982988F, 0.0F, 0.0F);
            this.legright = new ModelRenderer(this, 25, 7);
            this.legright.setPos(0.02F, 1.7F, -0.7F);
            this.legright.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(legright, 0.45378560551852565F, 0.0F, 0.0F);
            this.head = new ModelRenderer(this, 4, 4);
            this.head.setPos(0.0F, -0.1F, -1.3F);
            this.head.addBox(-1.5F, -1.5F, -2.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(head, 0.17453292519943295F, 0.0F, 0.0F);
            this.mouth = new ModelRenderer(this, 15, 0);
            this.mouth.setPos(0.0F, 0.6F, -1.5F);
            this.mouth.addBox(-1.0F, -0.5F, -2.3F, 2, 1, 2, 0.0F);
            this.setRotateAngle(mouth, 0.13962634015954636F, 0.0F, 0.0F);
            this.righthand = new ModelRenderer(this, 0, 2);
            this.righthand.setPos(0.02F, 1.5F, -0.6F);
            this.righthand.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(righthand, 0.13962634015954636F, 0.0F, 0.0F);
            this.lefthand = new ModelRenderer(this, 0, 2);
            this.lefthand.mirror = true;
            this.lefthand.setPos(-0.02F, 1.5F, -0.6F);
            this.lefthand.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(lefthand, 0.13962634015954636F, 0.0F, 0.0F);
            this.rightear = new ModelRenderer(this, 0, 0);
            this.rightear.setPos(-1.0F, -1.0F, -0.3F);
            this.rightear.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
            this.setRotateAngle(rightear, 0.3490658503988659F, 0.20943951023931953F, 1.0471975511965976F);
            this.legright.addChild(this.footright);
            this.body.addChild(this.tailbase);
            this.mouth.addChild(this.snout);
            this.chest.addChild(this.leftshoulder);
            this.legleft.addChild(this.footleft);
            this.rightshoulder.addChild(this.rightarm);
            this.leftthigh.addChild(this.legleft);
            this.head.addChild(this.leftear);
            this.leftshoulder.addChild(this.leftarm);
            this.body.addChild(this.leftthigh);
            this.chest.addChild(this.rightshoulder);
            this.tailmiddle.addChild(this.tailend);
            this.chest.addChild(this.Neck);
            this.mouth.addChild(this.lips);
            this.tailbase.addChild(this.tailmiddle);
            this.chest.addChild(this.body);
            this.body.addChild(this.rightthigh);
            this.rightthigh.addChild(this.legright);
            this.Neck.addChild(this.head);
            this.head.addChild(this.mouth);
            this.rightarm.addChild(this.righthand);
            this.leftarm.addChild(this.lefthand);
            this.head.addChild(this.rightear);

            this.saveBase();
        }

        @Override
        public void setupAnim(OpossumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.17F;
            this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.2F;
            this.tailbase.xRot = MathHelper.cos(limbSwing * speed * 0.05F) * degree * 0.1F * limbSwingAmount - 0.73F;
            this.tailbase.yRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount;
            this.tailend.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount + 0.42F;
            this.leftear.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.2F * limbSwingAmount - 1.05F;
            this.rightear.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.2F * limbSwingAmount + 1.05F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 4.0f;
            float degree = 0.5f;
            if (entity.isInWater()) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            this.leftshoulder.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.22F;
            this.leftarm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.45F;
            this.lefthand.xRot = MathHelper.cos(0.8F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.16F;
            this.rightshoulder.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.22F;
            this.rightarm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.45F;
            this.righthand.xRot = MathHelper.cos(0.8F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.16F;
            this.leftthigh.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.05F;
            this.legleft.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount + 0.45F;
            this.footleft.xRot = MathHelper.cos(1.4F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount - 0.16F;
            this.rightthigh.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.05F;
            this.legright.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount + 0.45F;
            this.footright.xRot = MathHelper.cos(1.4F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount - 0.16F;
            this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.2F * limbSwingAmount - 0.18F;
            this.tailbase.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.2F * limbSwingAmount - 0.74F;
            this.tailbase.yRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.4F * limbSwingAmount;
            this.tailend.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.4F;
            this.chest.y = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.5F * limbSwingAmount + 20.1F;
        }
    }
}