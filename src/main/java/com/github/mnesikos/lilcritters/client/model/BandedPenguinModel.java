package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BandedPenguinEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class BandedPenguinModel extends ZawaBaseModel<BandedPenguinEntity> {
    public ZawaModelRenderer body;
    public ZawaModelRenderer hips;
    public ZawaModelRenderer chest;
    public ZawaModelRenderer LeftFlipper1;
    public ZawaModelRenderer RightFlipper1;
    public ZawaModelRenderer LeftThigh;
    public ZawaModelRenderer RightThigh;
    public ZawaModelRenderer Tail1;
    public ZawaModelRenderer LegLeft;
    public ZawaModelRenderer FootLeft;
    public ZawaModelRenderer Toe1L;
    public ZawaModelRenderer Toe2L;
    public ZawaModelRenderer LegRight;
    public ZawaModelRenderer FootRight;
    public ZawaModelRenderer Toe1R;
    public ZawaModelRenderer Toe2R;
    public ZawaModelRenderer Tail2;
    public ZawaModelRenderer Tail3;
    public ZawaModelRenderer neck;
    public ZawaModelRenderer head;
    public ZawaModelRenderer Jaw;
    public ZawaModelRenderer Beak1;
    public ZawaModelRenderer BeakTip;
    public ZawaModelRenderer Beak2;
    public ZawaModelRenderer LeftFlipper2;
    public ZawaModelRenderer LeftFlipper3;
    public ZawaModelRenderer RightFlipper2;
    public ZawaModelRenderer RightFlipper3;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public BandedPenguinModel() {
        this.texWidth = 48;
        this.texHeight = 32;
        this.hips = new ZawaModelRenderer(this, 0, 18);
        this.hips.setPos(0.0F, 3.0F, 0.0F);
        this.hips.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(hips, -0.13962634015954636F, 0.0F, 0.0F);
        this.Jaw = new ZawaModelRenderer(this, 33, 0);
        this.Jaw.setPos(0.0F, -1.0F, -2.5F);
        this.Jaw.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Jaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.LeftFlipper3 = new ZawaModelRenderer(this, 21, 27);
        this.LeftFlipper3.setPos(-0.02F, 3.5F, -2.5F);
        this.LeftFlipper3.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftFlipper3, 0.2792526803190927F, 0.0F, 0.0F);
        this.chest = new ZawaModelRenderer(this, 18, 0);
        this.chest.setPos(0.0F, -2.6F, 0.0F);
        this.chest.addBox(-2.5F, -2.5F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(chest, -0.3839724354387525F, 0.0F, 0.0F);
        this.LeftThigh = new ZawaModelRenderer(this, 0, 26);
        this.LeftThigh.setPos(1.8F, 1.0F, 0.0F);
        this.LeftThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(LeftThigh, -0.3490658503988659F, 0.0F, 0.0F);
        this.FootRight = new ZawaModelRenderer(this, 13, 27);
        this.FootRight.mirror = true;
        this.FootRight.setPos(0.0F, 2.0F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FootRight, 0.17453292519943295F, 0.0F, 0.0F);
        this.head = new ZawaModelRenderer(this, 0, 0);
        this.head.setPos(0.0F, -3.0F, -0.3F);
        this.head.addBox(-2.0F, -3.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0.10471975511965977F, 0.0F, 0.0F);
        this.Toe1R = new ZawaModelRenderer(this, 13, 27);
        this.Toe1R.mirror = true;
        this.Toe1R.setPos(0.2F, 0.1F, 0.1F);
        this.Toe1R.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe1R, -0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.FootLeft = new ZawaModelRenderer(this, 13, 27);
        this.FootLeft.setPos(0.0F, 2.0F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FootLeft, 0.17453292519943295F, 0.0F, 0.0F);
        this.neck = new ZawaModelRenderer(this, 0, 9);
        this.neck.setPos(0.0F, -1.0F, 0.0F);
        this.neck.addBox(-1.5F, -4.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(neck, -0.20943951023931953F, 0.0F, 0.0F);
        this.Tail3 = new ZawaModelRenderer(this, 34, 24);
        this.Tail3.setPos(0.0F, 0.3F, -0.2F);
        this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Tail3, 0.24434609527920614F, 0.0F, 0.0F);
        this.RightFlipper1 = new ZawaModelRenderer(this, 20, 21);
        this.RightFlipper1.mirror = true;
        this.RightFlipper1.setPos(-2.5F, -2.7F, 0.0F);
        this.RightFlipper1.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightFlipper1, -0.20943951023931953F, 0.0F, 0.20943951023931953F);
        this.RightThigh = new ZawaModelRenderer(this, 0, 26);
        this.RightThigh.mirror = true;
        this.RightThigh.setPos(-1.8F, 1.0F, 0.0F);
        this.RightThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightThigh, -0.3490658503988659F, 0.0F, 0.0F);
        this.Toe1L = new ZawaModelRenderer(this, 13, 27);
        this.Toe1L.setPos(0.2F, 0.1F, 0.1F);
        this.Toe1L.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe1L, -0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.Beak2 = new ZawaModelRenderer(this, 13, 0);
        this.Beak2.mirror = true;
        this.Beak2.setPos(0.0F, 0.0F, 0.0F);
        this.Beak2.addBox(-0.6F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.Beak1 = new ZawaModelRenderer(this, 13, 0);
        this.Beak1.setPos(0.0F, -2.0F, -1.9F);
        this.Beak1.addBox(-0.4F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Beak1, 0.10471975511965977F, 0.0F, 0.0F);
        this.Tail1 = new ZawaModelRenderer(this, 33, 9);
        this.Tail1.setPos(0.0F, 1.5F, 2.5F);
        this.Tail1.addBox(-2.0F, 0.0F, -0.1F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Tail1, -1.0471975511965976F, 0.0F, 0.0F);
        this.RightFlipper2 = new ZawaModelRenderer(this, 30, 21);
        this.RightFlipper2.mirror = true;
        this.RightFlipper2.setPos(-0.3F, 3.0F, 1.5F);
        this.RightFlipper2.addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(RightFlipper2, -0.2792526803190927F, 0.0F, 0.0F);
        this.LegLeft = new ZawaModelRenderer(this, 10, 26);
        this.LegLeft.setPos(0.0F, 2.0F, 0.0F);
        this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegLeft, -0.13962634015954636F, 0.0F, 0.0F);
        this.RightFlipper3 = new ZawaModelRenderer(this, 21, 27);
        this.RightFlipper3.mirror = true;
        this.RightFlipper3.setPos(0.02F, 3.5F, -2.5F);
        this.RightFlipper3.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RightFlipper3, 0.2792526803190927F, 0.0F, 0.0F);
        this.LegRight = new ZawaModelRenderer(this, 10, 26);
        this.LegRight.mirror = true;
        this.LegRight.setPos(0.0F, 2.0F, 0.0F);
        this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegRight, -0.13962634015954636F, 0.0F, 0.0F);
        this.BeakTip = new ZawaModelRenderer(this, 0, 0);
        this.BeakTip.setPos(0.0F, 0.0F, -4.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.45378560551852565F, 0.0F, 0.0F);
        this.body = new ZawaModelRenderer(this, 15, 8);
        this.body.setPos(0.0F, 18.3F, 0.0F);
        this.body.addBox(-3.0F, -3.5F, -3.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(body, 0.45378560551852565F, 0.0F, 0.0F);
        this.Toe2R = new ZawaModelRenderer(this, 13, 27);
        this.Toe2R.mirror = true;
        this.Toe2R.setPos(-0.2F, 0.1F, 0.1F);
        this.Toe2R.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe2R, -0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.Tail2 = new ZawaModelRenderer(this, 36, 19);
        this.Tail2.setPos(0.0F, 1.5F, 0.5F);
        this.Tail2.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.20943951023931953F, 0.0F, 0.0F);
        this.LeftFlipper2 = new ZawaModelRenderer(this, 30, 21);
        this.LeftFlipper2.setPos(0.3F, 3.0F, 1.5F);
        this.LeftFlipper2.addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(LeftFlipper2, -0.2792526803190927F, 0.0F, 0.0F);
        this.Toe2L = new ZawaModelRenderer(this, 13, 27);
        this.Toe2L.setPos(-0.2F, 0.1F, 0.1F);
        this.Toe2L.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe2L, -0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.LeftFlipper1 = new ZawaModelRenderer(this, 20, 21);
        this.LeftFlipper1.setPos(2.5F, -2.7F, 0.0F);
        this.LeftFlipper1.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(LeftFlipper1, -0.20943951023931953F, 0.0F, -0.20943951023931953F);
        this.body.addChild(this.hips);
        this.head.addChild(this.Jaw);
        this.LeftFlipper2.addChild(this.LeftFlipper3);
        this.body.addChild(this.chest);
        this.hips.addChild(this.LeftThigh);
        this.LegRight.addChild(this.FootRight);
        this.neck.addChild(this.head);
        this.FootRight.addChild(this.Toe1R);
        this.LegLeft.addChild(this.FootLeft);
        this.chest.addChild(this.neck);
        this.Tail1.addChild(this.Tail3);
        this.body.addChild(this.RightFlipper1);
        this.hips.addChild(this.RightThigh);
        this.FootLeft.addChild(this.Toe1L);
        this.Beak1.addChild(this.Beak2);
        this.head.addChild(this.Beak1);
        this.hips.addChild(this.Tail1);
        this.RightFlipper1.addChild(this.RightFlipper2);
        this.LeftThigh.addChild(this.LegLeft);
        this.RightFlipper2.addChild(this.RightFlipper3);
        this.RightThigh.addChild(this.LegRight);
        this.Beak1.addChild(this.BeakTip);
        this.FootRight.addChild(this.Toe2R);
        this.Tail1.addChild(this.Tail2);
        this.LeftFlipper1.addChild(this.LeftFlipper2);
        this.FootLeft.addChild(this.Toe2L);
        this.body.addChild(this.LeftFlipper1);

        this.saveBase();
    }

    @Override
    public void setupAnim(BandedPenguinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI)) - (!entity.isInWater() ? 0.0F : 1.4F);
        if (!entity.isSwimming()) this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.chest.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.38F;
        this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.2F;
        this.Tail1.xRot = MathHelper.cos(-1.2F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.5F) * limbSwingAmount * 0.5F + -1.2F;
        this.LeftFlipper1.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.21F;
        this.LeftFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.12F) * limbSwingAmount * 0.5F + -0.21F;
        this.RightFlipper1.xRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.21F;
        this.RightFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.12F) * limbSwingAmount * 0.5F + 0.21F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed;
        float degree;
        
        if (isSwimming) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.25F;
            speed = 1.2F;
            degree = 1.0F;
            this.body.xRot = MathHelper.cos((float) Math.PI) * (-12.5F) * limbSwingAmount * 0.5F;
            this.hips.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.LeftThigh.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.FootLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * limbSwingAmount * 0.5F;
            this.RightThigh.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.FootRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * limbSwingAmount * 0.5F;
            this.Tail1.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -1.6F;
            this.chest.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.head.xRot = MathHelper.cos(1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.6F) * limbSwingAmount * 0.5F + -1.0F;
            this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.LeftFlipper1.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * limbSwingAmount * 0.5F + -1.4F;
            this.LeftFlipper1.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.LeftFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -8.0F) * limbSwingAmount * 0.5F + -0.8F;
            this.RightFlipper1.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * limbSwingAmount * 0.5F + 1.4F;
            this.RightFlipper1.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.RightFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 8.0F) * limbSwingAmount * 0.5F + 0.8F;

        } else {
            speed = ((BandedPenguinEntity) entity).isBaby() ? 3.0F : 6.0F;
            degree = ((BandedPenguinEntity) entity).isBaby() ? 2.0F : 1.6F;
            this.LeftThigh.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.5F) * limbSwingAmount * 0.5F + -0.3F;
            this.FootLeft.xRot = MathHelper.cos(-0.8F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.6F) * limbSwingAmount * 0.5F + 0.2F;
            this.RightThigh.xRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -1.5F) * limbSwingAmount * 0.5F + -0.3F;
            this.FootRight.xRot = MathHelper.cos(-0.8F + (limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 1.6F) * limbSwingAmount * 0.5F + 0.2F;
            this.LeftFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -0.2F;
            this.LeftFlipper1.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.RightFlipper1.zRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F + 0.2F;
            this.RightFlipper1.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.2F;
            this.body.zRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
//            this.body.y = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.02F;
            this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.2F;
            this.chest.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.4F;
            this.head.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + 0.1F;
            this.Tail1.xRot = MathHelper.cos((limbSwing * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F + -1.0F;
            this.Tail1.yRot = MathHelper.cos((limbSwing * speed * 0.3F) + (float) Math.PI) * (degree * -0.4F) * limbSwingAmount * 0.5F;
        }
    }
}