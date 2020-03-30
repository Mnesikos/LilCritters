package com.github.mnesikos.lilcritters.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * BandedPenguin - hey google & Mnesikos
 * Created using Tabula 7.1.0
 */
public class ModelBandedPenguin extends ZAWAModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer hips;
    public BookwormModelRenderer chest;
    public BookwormModelRenderer LeftFlipper1;
    public BookwormModelRenderer RightFlipper1;
    public BookwormModelRenderer LeftThigh;
    public BookwormModelRenderer RightThigh;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer Toe1L;
    public BookwormModelRenderer Toe2L;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer FootRight;
    public BookwormModelRenderer Toe1R;
    public BookwormModelRenderer Toe2R;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer Tail3;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer head;
    public BookwormModelRenderer Jaw;
    public BookwormModelRenderer Beak1;
    public BookwormModelRenderer BeakTip;
    public BookwormModelRenderer Beak2;
    public BookwormModelRenderer LeftFlipper2;
    public BookwormModelRenderer LeftFlipper3;
    public BookwormModelRenderer RightFlipper2;
    public BookwormModelRenderer RightFlipper3;

    public ModelBandedPenguin() {
        this.textureWidth = 48;
        this.textureHeight = 32;
        this.hips = new BookwormModelRenderer(this, 0, 18, "hips");
        this.hips.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.hips.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(hips, -0.13962634015954636F, 0.0F, 0.0F);
        this.Jaw = new BookwormModelRenderer(this, 33, 0, "Jaw");
        this.Jaw.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.Jaw.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Jaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.LeftFlipper3 = new BookwormModelRenderer(this, 21, 27, "LeftFlipper3");
        this.LeftFlipper3.setRotationPoint(-0.02F, 3.5F, -2.5F);
        this.LeftFlipper3.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftFlipper3, 0.2792526803190927F, 0.0F, 0.0F);
        this.chest = new BookwormModelRenderer(this, 18, 0, "chest");
        this.chest.setRotationPoint(0.0F, -2.6F, 0.0F);
        this.chest.addBox(-2.5F, -2.5F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(chest, -0.3839724354387525F, 0.0F, 0.0F);
        this.LeftThigh = new BookwormModelRenderer(this, 0, 26, "LeftThigh");
        this.LeftThigh.setRotationPoint(1.8F, 1.0F, 0.0F);
        this.LeftThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(LeftThigh, -0.3490658503988659F, 0.0F, 0.0F);
        this.FootRight = new BookwormModelRenderer(this, 13, 27, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FootRight, 0.17453292519943295F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 0, "head");
        this.head.setRotationPoint(0.0F, -3.0F, -0.3F);
        this.head.addBox(-2.0F, -3.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0.10471975511965977F, 0.0F, 0.0F);
        this.Toe1R = new BookwormModelRenderer(this, 13, 27, "Toe1R");
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.2F, 0.1F, 0.1F);
        this.Toe1R.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe1R, -0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.FootLeft = new BookwormModelRenderer(this, 13, 27, "FootLeft");
        this.FootLeft.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FootLeft, 0.17453292519943295F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 9, "neck");
        this.neck.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.neck.addBox(-1.5F, -4.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(neck, -0.20943951023931953F, 0.0F, 0.0F);
        this.Tail3 = new BookwormModelRenderer(this, 34, 24, "Tail3");
        this.Tail3.setRotationPoint(0.0F, 0.3F, -0.2F);
        this.Tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Tail3, 0.24434609527920614F, 0.0F, 0.0F);
        this.RightFlipper1 = new BookwormModelRenderer(this, 20, 21, "RightFlipper1");
        this.RightFlipper1.mirror = true;
        this.RightFlipper1.setRotationPoint(-2.5F, -2.7F, 0.0F);
        this.RightFlipper1.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightFlipper1, -0.20943951023931953F, 0.0F, 0.20943951023931953F);
        this.RightThigh = new BookwormModelRenderer(this, 0, 26, "RightThigh");
        this.RightThigh.mirror = true;
        this.RightThigh.setRotationPoint(-1.8F, 1.0F, 0.0F);
        this.RightThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(RightThigh, -0.3490658503988659F, 0.0F, 0.0F);
        this.Toe1L = new BookwormModelRenderer(this, 13, 27, "Toe1L");
        this.Toe1L.setRotationPoint(0.2F, 0.1F, 0.1F);
        this.Toe1L.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe1L, -0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.Beak2 = new BookwormModelRenderer(this, 13, 0, "Beak2");
        this.Beak2.mirror = true;
        this.Beak2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak2.addBox(-0.6F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.Beak1 = new BookwormModelRenderer(this, 13, 0, "Beak1");
        this.Beak1.setRotationPoint(0.0F, -2.0F, -1.9F);
        this.Beak1.addBox(-0.4F, 0.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Beak1, 0.10471975511965977F, 0.0F, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 33, 9, "Tail1");
        this.Tail1.setRotationPoint(0.0F, 1.5F, 2.5F);
        this.Tail1.addBox(-2.0F, 0.0F, -0.1F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Tail1, -1.0471975511965976F, 0.0F, 0.0F);
        this.RightFlipper2 = new BookwormModelRenderer(this, 30, 21, "RightFlipper2");
        this.RightFlipper2.mirror = true;
        this.RightFlipper2.setRotationPoint(-0.3F, 3.0F, 1.5F);
        this.RightFlipper2.addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(RightFlipper2, -0.2792526803190927F, 0.0F, 0.0F);
        this.LegLeft = new BookwormModelRenderer(this, 10, 26, "LegLeft");
        this.LegLeft.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegLeft, -0.13962634015954636F, 0.0F, 0.0F);
        this.RightFlipper3 = new BookwormModelRenderer(this, 21, 27, "RightFlipper3");
        this.RightFlipper3.mirror = true;
        this.RightFlipper3.setRotationPoint(0.02F, 3.5F, -2.5F);
        this.RightFlipper3.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RightFlipper3, 0.2792526803190927F, 0.0F, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 10, 26, "LegRight");
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LegRight, -0.13962634015954636F, 0.0F, 0.0F);
        this.BeakTip = new BookwormModelRenderer(this, 0, 0, "BeakTip");
        this.BeakTip.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.45378560551852565F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 15, 8, "body");
        this.body.setRotationPoint(0.0F, 18.3F, 0.0F);
        this.body.addBox(-3.0F, -3.5F, -3.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(body, 0.45378560551852565F, 0.0F, 0.0F);
        this.Toe2R = new BookwormModelRenderer(this, 13, 27, "Toe2R");
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(-0.2F, 0.1F, 0.1F);
        this.Toe2R.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe2R, -0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 36, 19, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.Tail2.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.20943951023931953F, 0.0F, 0.0F);
        this.LeftFlipper2 = new BookwormModelRenderer(this, 30, 21, "LeftFlipper2");
        this.LeftFlipper2.setRotationPoint(0.3F, 3.0F, 1.5F);
        this.LeftFlipper2.addBox(-0.5F, 0.0F, -3.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(LeftFlipper2, -0.2792526803190927F, 0.0F, 0.0F);
        this.Toe2L = new BookwormModelRenderer(this, 13, 27, "Toe2L");
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.1F);
        this.Toe2L.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Toe2L, -0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.LeftFlipper1 = new BookwormModelRenderer(this, 20, 21, "LeftFlipper1");
        this.LeftFlipper1.setRotationPoint(2.5F, -2.7F, 0.0F);
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

        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(f, f1, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.4D, 0.4D, 0.4D);
            GlStateManager.translate(0.0F, 40.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();

        } else
            this.body.render(scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        this.head.rotateAngleX = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI)) - (!entity.isInWater() ? 0.0F : 1.4F);
        if (!entity.isInWater())
            this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.chest.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.38F;
        this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.05F) * f1 * 0.5F + -0.2F;
        this.Tail1.rotateAngleX = MathHelper.cos(-1.2F + (f * speed * 0.1F) + (float) Math.PI) * (degree * 0.5F) * f1 * 0.5F + -1.2F;
        this.LeftFlipper1.rotateAngleX = MathHelper.cos(-1.0F + (f * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + -0.21F;
        this.LeftFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.12F) * f1 * 0.5F + -0.21F;
        this.RightFlipper1.rotateAngleX = MathHelper.cos(-1.0F + (f * speed * 0.1F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + -0.21F;
        this.RightFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * -0.12F) * f1 * 0.5F + 0.21F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (!entity.isRiding()) {
            if (entity.isInWater()) {
                f = (float)entity.ticksExisted;
                f1 = 0.25F;
                speed = 1.2F;
                degree = 1.0F;
                this.body.rotateAngleX = MathHelper.cos((float) Math.PI) * (-12.5F) * f1 * 0.5F;
                this.hips.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F;
                this.LeftThigh.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F;
                this.FootLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * f1 * 0.5F;
                this.RightThigh.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F;
                this.FootRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -10.0F) * f1 * 0.5F;
                this.Tail1.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + -1.6F;
                this.chest.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + -0.2F;
                this.head.rotateAngleX = MathHelper.cos(1.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -0.6F) * f1 * 0.5F + -1.0F;
                this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + -0.2F;
                this.LeftFlipper1.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 4.0F) * f1 * 0.5F + -1.4F;
                this.LeftFlipper1.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * f1 * 0.5F + -0.5F;
                this.LeftFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -8.0F) * f1 * 0.5F + -0.8F;
                this.RightFlipper1.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -4.0F) * f1 * 0.5F + 1.4F;
                this.RightFlipper1.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 12.0F) * f1 * 0.5F + -0.5F;
                this.RightFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 8.0F) * f1 * 0.5F + 0.8F;

            } else if (!entity.isOverWater()){
                speed = this.isChild ? 3.0F : 6.0F;
                degree = this.isChild ? 2.0F : 1.6F;
                this.LeftThigh.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 1.5F) * f1 * 0.5F + -0.3F;
                this.FootLeft.rotateAngleX = MathHelper.cos(-0.8F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.6F) * f1 * 0.5F + 0.2F;
                this.RightThigh.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -1.5F) * f1 * 0.5F + -0.3F;
                this.FootRight.rotateAngleX = MathHelper.cos(-0.8F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.6F) * f1 * 0.5F + 0.2F;
                this.LeftFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F + -0.2F;
                this.LeftFlipper1.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.2F;
                this.RightFlipper1.rotateAngleZ = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * -0.4F) * f1 * 0.5F + 0.2F;
                this.RightFlipper1.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.2F;
                this.body.rotateAngleZ = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F;
                this.body.offsetY = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.02F;
                this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + -0.2F;
                this.chest.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + -0.4F;
                this.head.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + 0.1F;
                this.Tail1.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F + -1.0F;
                this.Tail1.rotateAngleY = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -0.4F) * f1 * 0.5F;
            }
        }
    }

    @Override
    protected void performSleepAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performSleepAnimation(f, f1, f2, f3, f4, f5, entity);
    }
}