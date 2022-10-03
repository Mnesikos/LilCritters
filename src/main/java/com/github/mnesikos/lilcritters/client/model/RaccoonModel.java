package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.RaccoonEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

public class RaccoonModel extends ZawaBaseModel<RaccoonEntity> {
    public ZawaModelRenderer Body;
    public ZawaModelRenderer Butt;
    public ZawaModelRenderer neck;
    public ZawaModelRenderer chestLower;
    public ZawaModelRenderer RightBicep;
    public ZawaModelRenderer LeftBicep;
    public ZawaModelRenderer tail1;
    public ZawaModelRenderer LeftThigh;
    public ZawaModelRenderer bellyLower;
    public ZawaModelRenderer RightThigh;
    public ZawaModelRenderer tail2;
    public ZawaModelRenderer tail3;
    public ZawaModelRenderer tail4;
    public ZawaModelRenderer tail5;
    public ZawaModelRenderer LeftUpperLeg;
    public ZawaModelRenderer LeftLeg;
    public ZawaModelRenderer LeftFoot;
    public ZawaModelRenderer RightUpperLeg;
    public ZawaModelRenderer RightLeg;
    public ZawaModelRenderer RightFoot;
    public ZawaModelRenderer neckLower;
    public ZawaModelRenderer Head;
    public ZawaModelRenderer Snout;
    public ZawaModelRenderer LeftEar;
    public ZawaModelRenderer RightEar;
    public ZawaModelRenderer LeftCheek;
    public ZawaModelRenderer RightCheek;
    public ZawaModelRenderer Chin;
    public ZawaModelRenderer Nose;
    public ZawaModelRenderer NoseEnd;
    public ZawaModelRenderer RightForearm;
    public ZawaModelRenderer RightHand;
    public ZawaModelRenderer LeftForearm;
    public ZawaModelRenderer LeftHand;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public RaccoonModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.bellyLower = new ZawaModelRenderer(this, 0, 31);
        this.bellyLower.setPos(0.0F, 3.0F, 6.1F);
        this.bellyLower.addBox(-3.0F, -1.0F, -6.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(bellyLower, 0.13962634015954636F, 0.0F, 0.0F);
        this.RightCheek = new ZawaModelRenderer(this, 30, 50);
        this.RightCheek.mirror = true;
        this.RightCheek.setPos(0.0F, 0.95F, -2.0F);
        this.RightCheek.addBox(-4.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(RightCheek, 0.0F, 0.4363323129985824F, 0.17453292519943295F);
        this.Chin = new ZawaModelRenderer(this, 52, 16);
        this.Chin.setPos(0.0F, -0.2F, -0.8F);
        this.Chin.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Chin, -0.2617993877991494F, 0.0F, 0.0F);
        this.NoseEnd = new ZawaModelRenderer(this, 26, 0);
        this.NoseEnd.setPos(0.0F, 0.4F, -0.1F);
        this.NoseEnd.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.LeftBicep = new ZawaModelRenderer(this, 40, 14);
        this.LeftBicep.setPos(2.0F, -0.5F, -2.8F);
        this.LeftBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftBicep, 0.08726646259971647F, 0.08726646259971647F, 0.0F);
        this.tail1 = new ZawaModelRenderer(this, 15, 22);
        this.tail1.setPos(0.0F, -0.5F, 7.0F);
        this.tail1.addBox(-3.0F, -3.0F, -1.5F, 6, 6, 3, 0.0F);
        this.setRotateAngle(tail1, -0.03490658503988659F, 0.0F, 0.0F);
        this.LeftFoot = new ZawaModelRenderer(this, 25, 2);
        this.LeftFoot.setPos(0.01F, 2.0F, -1.0F);
        this.LeftFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftFoot, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.neckLower = new ZawaModelRenderer(this, 0, 38);
        this.neckLower.setPos(0.0F, 1.5F, -4.0F);
        this.neckLower.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 6, 0.0F);
        this.setRotateAngle(neckLower, -0.22689280275926282F, 0.0F, 0.0F);
        this.Snout = new ZawaModelRenderer(this, 0, 46);
        this.Snout.setPos(0.0F, 1.6F, -2.5F);
        this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.tail4 = new ZawaModelRenderer(this, 0, 23);
        this.tail4.setPos(0.0F, 0.0F, 6.0F);
        this.tail4.addBox(-2.0F, -2.0F, -1.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(tail4, -0.17453292519943295F, 0.0F, 0.0F);
        this.Nose = new ZawaModelRenderer(this, 0, 51);
        this.Nose.setPos(0.0F, -2.1F, -2.5F);
        this.Nose.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Nose, 0.2617993877991494F, 0.0F, 0.0F);
        this.RightBicep = new ZawaModelRenderer(this, 40, 14);
        this.RightBicep.mirror = true;
        this.RightBicep.setPos(-2.0F, -0.5F, -2.8F);
        this.RightBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightBicep, 0.08726646259971647F, -0.08726646259971647F, 0.0F);
        this.Head = new ZawaModelRenderer(this, 14, 42);
        this.Head.setPos(0.0F, -0.5F, -2.5F);
        this.Head.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.2617993877991494F, 0.0F, 0.0F);
        this.LeftThigh = new ZawaModelRenderer(this, 33, 22);
        this.LeftThigh.setPos(3.7F, -0.5F, 4.5F);
        this.LeftThigh.addBox(-2.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftThigh, -0.17453292519943295F, -0.08726646259971647F, -0.08726646259971647F);
        this.tail2 = new ZawaModelRenderer(this, 24, 32);
        this.tail2.setPos(0.0F, 0.0F, 1.5F);
        this.tail2.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tail2, -0.12217304763960307F, 0.0F, 0.0F);
        this.RightLeg = new ZawaModelRenderer(this, 49, 0);
        this.RightLeg.mirror = true;
        this.RightLeg.setPos(-0.02F, 3.0F, 2.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.RightForearm = new ZawaModelRenderer(this, 18, 31);
        this.RightForearm.mirror = true;
        this.RightForearm.setPos(0.0F, 4.5F, 1.0F);
        this.RightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightForearm, -0.4363323129985824F, 0.0F, 0.0F);
        this.Butt = new ZawaModelRenderer(this, 28, 0);
        this.Butt.setPos(0.0F, 0.0F, 2.0F);
        this.Butt.addBox(-3.5F, -4.0F, 0.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(Butt, -0.2617993877991494F, 0.0F, 0.0F);
        this.chestLower = new ZawaModelRenderer(this, 18, 14);
        this.chestLower.setPos(0.0F, 2.5F, -3.5F);
        this.chestLower.addBox(-2.5F, -1.8F, 0.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(chestLower, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftCheek = new ZawaModelRenderer(this, 30, 50);
        this.LeftCheek.setPos(0.0F, 0.95F, -2.0F);
        this.LeftCheek.addBox(0.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(LeftCheek, 0.0F, -0.4363323129985824F, -0.17453292519943295F);
        this.Body = new ZawaModelRenderer(this, 0, 0);
        this.Body.setPos(0.0F, 17.8F, 0.0F);
        this.Body.addBox(-3.0F, -3.5F, -4.0F, 6, 6, 8, 0.0F);
        this.setRotateAngle(Body, 0.08726646259971647F, 0.0F, 0.0F);
        this.tail5 = new ZawaModelRenderer(this, 0, 0);
        this.tail5.setPos(0.0F, 0.2F, 2.0F);
        this.tail5.addBox(-1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail5, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightUpperLeg = new ZawaModelRenderer(this, 20, 0);
        this.RightUpperLeg.mirror = true;
        this.RightUpperLeg.setPos(1.0F, 5.0F, -1.0F);
        this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RightUpperLeg, 0.9599310885968813F, 0.0F, 0.0F);
        this.LeftLeg = new ZawaModelRenderer(this, 49, 0);
        this.LeftLeg.setPos(0.02F, 3.0F, 2.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LeftLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.LeftEar = new ZawaModelRenderer(this, 0, 5);
        this.LeftEar.setPos(1.3F, -2.7F, 0.0F);
        this.LeftEar.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, -0.17453292519943295F, 0.2617993877991494F);
        this.RightHand = new ZawaModelRenderer(this, 12, 38);
        this.RightHand.mirror = true;
        this.RightHand.setPos(-0.01F, 3.8F, -1.0F);
        this.RightHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightHand, 0.2617993877991494F, 0.0F, 0.0F);
        this.RightEar = new ZawaModelRenderer(this, 0, 5);
        this.RightEar.mirror = true;
        this.RightEar.setPos(-1.3F, -2.7F, 0.0F);
        this.RightEar.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.17453292519943295F, -0.2617993877991494F);
        this.tail3 = new ZawaModelRenderer(this, 37, 37);
        this.tail3.setPos(0.0F, -0.3F, 3.5F);
        this.tail3.addBox(-3.0F, -2.5F, -1.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(tail3, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightFoot = new ZawaModelRenderer(this, 25, 2);
        this.RightFoot.mirror = true;
        this.RightFoot.setPos(-0.01F, 2.0F, -1.0F);
        this.RightFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightFoot, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.LeftUpperLeg = new ZawaModelRenderer(this, 20, 0);
        this.LeftUpperLeg.setPos(-1.0F, 5.0F, -1.0F);
        this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LeftUpperLeg, 0.9599310885968813F, 0.0F, 0.0F);
        this.LeftForearm = new ZawaModelRenderer(this, 18, 31);
        this.LeftForearm.setPos(0.0F, 4.5F, 1.0F);
        this.LeftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LeftForearm, -0.4363323129985824F, 0.0F, 0.0F);
        this.LeftHand = new ZawaModelRenderer(this, 12, 38);
        this.LeftHand.setPos(0.01F, 3.8F, -1.0F);
        this.LeftHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftHand, 0.2617993877991494F, 0.0F, 0.0F);
        this.neck = new ZawaModelRenderer(this, 0, 14);
        this.neck.setPos(0.0F, -0.5F, -4.0F);
        this.neck.addBox(-2.0F, -2.5F, -3.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(neck, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightThigh = new ZawaModelRenderer(this, 33, 22);
        this.RightThigh.mirror = true;
        this.RightThigh.setPos(-3.7F, -0.5F, 4.5F);
        this.RightThigh.addBox(-0.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RightThigh, -0.17453292519943295F, 0.08726646259971647F, 0.08726646259971647F);
        this.Butt.addChild(this.bellyLower);
        this.Head.addChild(this.RightCheek);
        this.Snout.addChild(this.Chin);
        this.Nose.addChild(this.NoseEnd);
        this.Body.addChild(this.LeftBicep);
        this.Butt.addChild(this.tail1);
        this.LeftLeg.addChild(this.LeftFoot);
        this.neck.addChild(this.neckLower);
        this.Head.addChild(this.Snout);
        this.tail3.addChild(this.tail4);
        this.Snout.addChild(this.Nose);
        this.Body.addChild(this.RightBicep);
        this.neck.addChild(this.Head);
        this.Butt.addChild(this.LeftThigh);
        this.tail1.addChild(this.tail2);
        this.RightUpperLeg.addChild(this.RightLeg);
        this.RightBicep.addChild(this.RightForearm);
        this.Body.addChild(this.Butt);
        this.Body.addChild(this.chestLower);
        this.Head.addChild(this.LeftCheek);
        this.tail4.addChild(this.tail5);
        this.RightThigh.addChild(this.RightUpperLeg);
        this.LeftUpperLeg.addChild(this.LeftLeg);
        this.Head.addChild(this.LeftEar);
        this.RightForearm.addChild(this.RightHand);
        this.Head.addChild(this.RightEar);
        this.tail2.addChild(this.tail3);
        this.RightLeg.addChild(this.RightFoot);
        this.LeftThigh.addChild(this.LeftUpperLeg);
        this.LeftBicep.addChild(this.LeftForearm);
        this.LeftForearm.addChild(this.LeftHand);
        this.Body.addChild(this.neck);
        this.Butt.addChild(this.RightThigh);

        this.saveBase();
    }

    @Override
    public void setupAnim(RaccoonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.Head.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0f;
        float degree = 1.0f;
        this.neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.18F;
        this.Head.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.1F) * degree * -0.05F * limbSwingAmount + 0.26F;
        this.LeftEar.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.26F;
        this.RightEar.zRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.26F;
        this.tail1.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.04F;
        this.tail3.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.18F;
        this.tail4.xRot = MathHelper.cos(-0.5F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.1F;
        this.tail5.xRot = MathHelper.cos(-1.0F + limbSwing * speed * 0.1F) * degree * 0.05F * limbSwingAmount - 0.1F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 4.0f;
        float degree = 0.5f;
        if (entity.isInWater()) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
        }
        if (((RaccoonEntity) entity).isBaby())
            this.neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.40F;
        else
            this.neck.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.17F;

        this.LeftBicep.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount;
        this.LeftForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount - 0.5F;
        this.LeftHand.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount + 0.3F;
        this.RightBicep.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount;
        this.RightForearm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.5F * limbSwingAmount - 0.5F;
        this.RightHand.xRot = MathHelper.cos(0.5F + limbSwing * speed * 0.2F) * degree * 1.5F * limbSwingAmount + 0.3F;
        this.LeftThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * 2.0F * limbSwingAmount;
        this.LeftLeg.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 1.0F;
        this.LeftFoot.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.2F;
        this.RightThigh.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.2F) * degree * -2.0F * limbSwingAmount;
        this.RightLeg.xRot = MathHelper.cos(3.5F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount - 1.0F;
        this.RightFoot.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.2F;
        this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount + 0.2F;
//        this.Body.y = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.01F;
        this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.05F * limbSwingAmount + 0.14F;
        this.Body.zRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 0.1F * limbSwingAmount;
        this.LeftUpperLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 1.0F;
        this.RightUpperLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 1.0F;
        this.tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.1F;
        this.tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * degree * 0.1F * limbSwingAmount - 0.1F;
        this.tail4.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * degree * -0.05F * limbSwingAmount - 0.1F;
        this.tail5.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.4F) * degree * -0.1F * limbSwingAmount - 0.1F;
    }
}
