package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntityRaccoon;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

public class ModelRaccoon extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Butt;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer chestLower;
    public BookwormModelRenderer RightBicep;
    public BookwormModelRenderer LeftBicep;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer LeftThigh;
    public BookwormModelRenderer bellyLower;
    public BookwormModelRenderer RightThigh;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer tail4;
    public BookwormModelRenderer tail5;
    public BookwormModelRenderer LeftUpperLeg;
    public BookwormModelRenderer LeftLeg;
    public BookwormModelRenderer LeftFoot;
    public BookwormModelRenderer RightUpperLeg;
    public BookwormModelRenderer RightLeg;
    public BookwormModelRenderer RightFoot;
    public BookwormModelRenderer neckLower;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer LeftEar;
    public BookwormModelRenderer RightEar;
    public BookwormModelRenderer LeftCheek;
    public BookwormModelRenderer RightCheek;
    public BookwormModelRenderer Chin;
    public BookwormModelRenderer Nose;
    public BookwormModelRenderer NoseEnd;
    public BookwormModelRenderer RightForearm;
    public BookwormModelRenderer RightHand;
    public BookwormModelRenderer LeftForearm;
    public BookwormModelRenderer LeftHand;

    public ModelRaccoon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.bellyLower = new BookwormModelRenderer(this, 0, 31, "bellyLower");
        this.bellyLower.setRotationPoint(0.0F, 3.0F, 6.1F);
        this.bellyLower.addBox(-3.0F, -1.0F, -6.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(bellyLower, 0.13962634015954636F, 0.0F, 0.0F);
        this.RightCheek = new BookwormModelRenderer(this, 30, 50, "RightCheek");
        this.RightCheek.mirror = true;
        this.RightCheek.setRotationPoint(0.0F, 0.95F, -2.0F);
        this.RightCheek.addBox(-4.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(RightCheek, 0.0F, 0.4363323129985824F, 0.17453292519943295F);
        this.Chin = new BookwormModelRenderer(this, 52, 16, "Chin");
        this.Chin.setRotationPoint(0.0F, -0.2F, -0.8F);
        this.Chin.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Chin, -0.2617993877991494F, 0.0F, 0.0F);
        this.NoseEnd = new BookwormModelRenderer(this, 26, 0, "NoseEnd");
        this.NoseEnd.setRotationPoint(0.0F, 0.4F, -0.1F);
        this.NoseEnd.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.LeftBicep = new BookwormModelRenderer(this, 40, 14, "LeftBicep");
        this.LeftBicep.setRotationPoint(2.0F, -0.5F, -2.8F);
        this.LeftBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftBicep, 0.08726646259971647F, 0.08726646259971647F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 15, 22, "tail1");
        this.tail1.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.tail1.addBox(-3.0F, -3.0F, -1.5F, 6, 6, 3, 0.0F);
        this.setRotateAngle(tail1, -0.03490658503988659F, 0.0F, 0.0F);
        this.LeftFoot = new BookwormModelRenderer(this, 25, 2, "LeftFoot");
        this.LeftFoot.setRotationPoint(0.01F, 2.0F, -1.0F);
        this.LeftFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftFoot, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.neckLower = new BookwormModelRenderer(this, 0, 38, "neckLower");
        this.neckLower.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.neckLower.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 6, 0.0F);
        this.setRotateAngle(neckLower, -0.22689280275926282F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 0, 46, "Snout");
        this.Snout.setRotationPoint(0.0F, 1.6F, -2.5F);
        this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.tail4 = new BookwormModelRenderer(this, 0, 23, "tail4");
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addBox(-2.0F, -2.0F, -1.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(tail4, -0.17453292519943295F, 0.0F, 0.0F);
        this.Nose = new BookwormModelRenderer(this, 0, 51, "Nose");
        this.Nose.setRotationPoint(0.0F, -2.1F, -2.5F);
        this.Nose.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Nose, 0.2617993877991494F, 0.0F, 0.0F);
        this.RightBicep = new BookwormModelRenderer(this, 40, 14, "RightBicep");
        this.RightBicep.mirror = true;
        this.RightBicep.setRotationPoint(-2.0F, -0.5F, -2.8F);
        this.RightBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightBicep, 0.08726646259971647F, -0.08726646259971647F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 14, 42, "Head");
        this.Head.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.Head.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.2617993877991494F, 0.0F, 0.0F);
        this.LeftThigh = new BookwormModelRenderer(this, 33, 22, "LeftThigh");
        this.LeftThigh.setRotationPoint(3.7F, -0.5F, 4.5F);
        this.LeftThigh.addBox(-2.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftThigh, -0.17453292519943295F, -0.08726646259971647F, -0.08726646259971647F);
        this.tail2 = new BookwormModelRenderer(this, 24, 32, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.tail2.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tail2, -0.12217304763960307F, 0.0F, 0.0F);
        this.RightLeg = new BookwormModelRenderer(this, 49, 0, "RightLeg");
        this.RightLeg.mirror = true;
        this.RightLeg.setRotationPoint(-0.02F, 3.0F, 2.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.RightForearm = new BookwormModelRenderer(this, 18, 31, "RightForearm");
        this.RightForearm.mirror = true;
        this.RightForearm.setRotationPoint(0.0F, 4.5F, 1.0F);
        this.RightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightForearm, -0.4363323129985824F, 0.0F, 0.0F);
        this.Butt = new BookwormModelRenderer(this, 28, 0, "Butt");
        this.Butt.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Butt.addBox(-3.5F, -4.0F, 0.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(Butt, -0.2617993877991494F, 0.0F, 0.0F);
        this.chestLower = new BookwormModelRenderer(this, 18, 14, "chestLower");
        this.chestLower.setRotationPoint(0.0F, 2.5F, -3.5F);
        this.chestLower.addBox(-2.5F, -1.8F, 0.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(chestLower, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftCheek = new BookwormModelRenderer(this, 30, 50, "LeftCheek");
        this.LeftCheek.setRotationPoint(0.0F, 0.95F, -2.0F);
        this.LeftCheek.addBox(0.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(LeftCheek, 0.0F, -0.4363323129985824F, -0.17453292519943295F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 17.8F, 0.0F);
        this.Body.addBox(-3.0F, -3.5F, -4.0F, 6, 6, 8, 0.0F);
        this.setRotateAngle(Body, 0.08726646259971647F, 0.0F, 0.0F);
        this.tail5 = new BookwormModelRenderer(this, 0, 0, "tail5");
        this.tail5.setRotationPoint(0.0F, 0.2F, 2.0F);
        this.tail5.addBox(-1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail5, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightUpperLeg = new BookwormModelRenderer(this, 20, 0, "RightUpperLeg");
        this.RightUpperLeg.mirror = true;
        this.RightUpperLeg.setRotationPoint(1.0F, 5.0F, -1.0F);
        this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RightUpperLeg, 0.9599310885968813F, 0.0F, 0.0F);
        this.LeftLeg = new BookwormModelRenderer(this, 49, 0, "LeftLeg");
        this.LeftLeg.setRotationPoint(0.02F, 3.0F, 2.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LeftLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.LeftEar = new BookwormModelRenderer(this, 0, 5, "LeftEar");
        this.LeftEar.setRotationPoint(1.3F, -2.7F, 0.0F);
        this.LeftEar.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, -0.17453292519943295F, 0.2617993877991494F);
        this.RightHand = new BookwormModelRenderer(this, 12, 38, "RightHand");
        this.RightHand.mirror = true;
        this.RightHand.setRotationPoint(-0.01F, 3.8F, -1.0F);
        this.RightHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightHand, 0.2617993877991494F, 0.0F, 0.0F);
        this.RightEar = new BookwormModelRenderer(this, 0, 5, "RightEar");
        this.RightEar.mirror = true;
        this.RightEar.setRotationPoint(-1.3F, -2.7F, 0.0F);
        this.RightEar.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.17453292519943295F, -0.2617993877991494F);
        this.tail3 = new BookwormModelRenderer(this, 37, 37, "tail3");
        this.tail3.setRotationPoint(0.0F, -0.3F, 3.5F);
        this.tail3.addBox(-3.0F, -2.5F, -1.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(tail3, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightFoot = new BookwormModelRenderer(this, 25, 2, "RightFoot");
        this.RightFoot.mirror = true;
        this.RightFoot.setRotationPoint(-0.01F, 2.0F, -1.0F);
        this.RightFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightFoot, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.LeftUpperLeg = new BookwormModelRenderer(this, 20, 0, "LeftUpperLeg");
        this.LeftUpperLeg.setRotationPoint(-1.0F, 5.0F, -1.0F);
        this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LeftUpperLeg, 0.9599310885968813F, 0.0F, 0.0F);
        this.LeftForearm = new BookwormModelRenderer(this, 18, 31, "LeftForearm");
        this.LeftForearm.setRotationPoint(0.0F, 4.5F, 1.0F);
        this.LeftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LeftForearm, -0.4363323129985824F, 0.0F, 0.0F);
        this.LeftHand = new BookwormModelRenderer(this, 12, 38, "LeftHand");
        this.LeftHand.setRotationPoint(0.01F, 3.8F, -1.0F);
        this.LeftHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftHand, 0.2617993877991494F, 0.0F, 0.0F);
        this.neck = new BookwormModelRenderer(this, 0, 14, "neck");
        this.neck.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.neck.addBox(-2.0F, -2.5F, -3.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(neck, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightThigh = new BookwormModelRenderer(this, 33, 22, "RightThigh");
        this.RightThigh.mirror = true;
        this.RightThigh.setRotationPoint(-3.7F, -0.5F, 4.5F);
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

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.6F, 0.6F, 0.6F);
            GlStateManager.translate(0.0F, 17.0F * scale, 0.0F);
            this.Body.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.Body.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

        if (entity instanceof EntityRaccoon && !((EntityRaccoon) entity).isAsleep()) {
            this.Head.rotateAngleX = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
            this.Head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
        }
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0f;
        degree = 1.0f;
        this.neck.rotateAngleX = MathHelper.cos(f * speed * 0.1F) * degree * 0.05F * f1 - 0.18F;
        this.Head.rotateAngleX = MathHelper.cos(1.0F + f * speed * 0.1F) * degree * -0.05F * f1 + 0.26F;
        this.LeftEar.rotateAngleZ = MathHelper.cos(f * speed * 0.1F) * degree * -0.1F * f1 + 0.26F;
        this.RightEar.rotateAngleZ = MathHelper.cos(f * speed * 0.1F) * degree * 0.1F * f1 - 0.26F;
        this.tail1.rotateAngleX = MathHelper.cos(2.0F + f * speed * 0.1F) * degree * 0.05F * f1 - 0.04F;
        this.tail3.rotateAngleX = MathHelper.cos(f * speed * 0.1F) * degree * 0.05F * f1 - 0.18F;
        this.tail4.rotateAngleX = MathHelper.cos(-0.5F + f * speed * 0.1F) * degree * 0.05F * f1 - 0.1F;
        this.tail5.rotateAngleX = MathHelper.cos(-1.0F + f * speed * 0.1F) * degree * 0.05F * f1 - 0.1F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (!entity.isRiding()) {
            speed = 4.0f;
            degree = 0.5f;
            if (entity.isInWater()) {
                f = (float) entity.ticksExisted;
                f1 = 0.3F;
                speed = 1.0F;
            }
            if (this.isChild)
                this.neck.rotateAngleX = MathHelper.cos(f * speed * 0.4F) * degree * 0.1F * f1 - 0.40F;
            else
                this.neck.rotateAngleX = MathHelper.cos(f * speed * 0.4F) * degree * 0.1F * f1 - 0.17F;

            this.LeftBicep.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 2.0F * f1;
            this.LeftForearm.rotateAngleX = MathHelper.cos(1.0F + f * speed * 0.2F) * degree * 1.5F * f1 - 0.5F;
            this.LeftHand.rotateAngleX = MathHelper.cos(0.5F + f * speed * 0.2F) * degree * -1.5F * f1 + 0.3F;
            this.RightBicep.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * -2.0F * f1;
            this.RightForearm.rotateAngleX = MathHelper.cos(1.0F + f * speed * 0.2F) * degree * -1.5F * f1 - 0.5F;
            this.RightHand.rotateAngleX = MathHelper.cos(0.5F + f * speed * 0.2F) * degree * 1.5F * f1 + 0.3F;
            this.LeftThigh.rotateAngleX = MathHelper.cos(1.5F + f * speed * 0.2F) * degree * 2.0F * f1;
            this.LeftLeg.rotateAngleX = MathHelper.cos(3.5F + f * speed * 0.2F) * degree * 0.2F * f1 - 1.0F;
            this.LeftFoot.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * -1.0F * f1 + 0.2F;
            this.RightThigh.rotateAngleX = MathHelper.cos(1.5F + f * speed * 0.2F) * degree * -2.0F * f1;
            this.RightLeg.rotateAngleX = MathHelper.cos(3.5F + f * speed * 0.2F) * degree * 0.2F * f1 - 1.0F;
            this.RightFoot.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 1.0F * f1 + 0.2F;
            this.Head.rotateAngleX = MathHelper.cos(f * speed * 0.4F) * degree * -0.1F * f1 + 0.2F;
            this.Body.offsetY = MathHelper.cos(f * speed * 0.4F) * degree * 0.1F * f1 - 0.01F;
            this.Body.rotateAngleX = MathHelper.cos(f * speed * 0.4F) * degree * 0.05F * f1 + 0.14F;
            this.Body.rotateAngleZ = MathHelper.cos(f * speed * 0.2F) * degree * 0.1F * f1;
            this.LeftUpperLeg.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * 1.0F * f1 + 1.0F;
            this.RightUpperLeg.rotateAngleX = MathHelper.cos(f * speed * 0.2F) * degree * -1.0F * f1 + 1.0F;
            this.tail1.rotateAngleX = MathHelper.cos(1.0F + f * speed * 0.4F) * degree * 0.1F * f1 - 0.1F;
            this.tail2.rotateAngleX = MathHelper.cos(2.0F + f * speed * 0.4F) * degree * 0.1F * f1 - 0.1F;
            this.tail4.rotateAngleX = MathHelper.cos(3.0F + f * speed * 0.4F) * degree * -0.05F * f1 - 0.1F;
            this.tail5.rotateAngleX = MathHelper.cos(4.0F + f * speed * 0.4F) * degree * -0.1F * f1 - 0.1F;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
