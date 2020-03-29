package com.github.mnesikos.lilcritters.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * opossum - fisk
 * Created using Tabula 7.1.0
 */
public class ModelOpossum extends ZAWAModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer bodyRear;
    public BookwormModelRenderer neck1;
    public BookwormModelRenderer armLeft;
    public BookwormModelRenderer armRight;
    public BookwormModelRenderer thighLeft;
    public BookwormModelRenderer thighRight;
    public BookwormModelRenderer belly;
    public BookwormModelRenderer rump;
    public BookwormModelRenderer tailBase;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer neckUnder;
    public BookwormModelRenderer head;
    public BookwormModelRenderer earLeft;
    public BookwormModelRenderer earRight;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer nose;
    public BookwormModelRenderer lowerJaw;
    public BookwormModelRenderer arm2Left;
    public BookwormModelRenderer handLeft;
    public BookwormModelRenderer arm2Right;
    public BookwormModelRenderer handRight;
    public BookwormModelRenderer legLeft;
    public BookwormModelRenderer footLeft;
    public BookwormModelRenderer legRight;
    public BookwormModelRenderer footRight;

    public ModelOpossum() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.earLeft = new BookwormModelRenderer(this, 0, 0, "earLeft");
        this.earLeft.setRotationPoint(0.8F, -0.6F, -1.7F);
        this.earLeft.addBox(0.0F, -3.5F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.3141592653589793F, -0.3490658503988659F, 0.2792526803190927F);
        this.armRight = new BookwormModelRenderer(this, 27, 28, "armRight");
        this.armRight.mirror = true;
        this.armRight.setRotationPoint(-2.7F, -0.3F, -3.1F);
        this.armRight.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armRight, 0.20943951023931953F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 38, 0, "head");
        this.head.setRotationPoint(0.0F, 3.4F, -3.0F);
        this.head.addBox(-3.0F, -3.0F, -5.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(head, 0.10471975511965977F, 0.0F, 0.0F);
        this.handRight = new BookwormModelRenderer(this, 28, 15, "handRight");
        this.handRight.mirror = true;
        this.handRight.setRotationPoint(0.0F, 3.7F, -1.5F);
        this.handRight.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handRight, 0.06981317007977318F, 0.0F, 0.17453292519943295F);
        this.thighLeft = new BookwormModelRenderer(this, 26, 36, "thighLeft");
        this.thighLeft.setRotationPoint(3.4F, -0.3F, 7.5F);
        this.thighLeft.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 43, 17, "tail2");
        this.tail2.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.tail2.addBox(-1.02F, -2.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail2, 0.3141592653589793F, 0.0F, 0.0F);
        this.arm2Right = new BookwormModelRenderer(this, 39, 28, "arm2Right");
        this.arm2Right.mirror = true;
        this.arm2Right.setRotationPoint(0.0F, 4.2F, 1.2F);
        this.arm2Right.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm2Right, -0.3141592653589793F, 0.0F, -0.17453292519943295F);
        this.legRight = new BookwormModelRenderer(this, 44, 35, "legRight");
        this.legRight.mirror = true;
        this.legRight.setRotationPoint(0.0F, 4.5F, -1.8F);
        this.legRight.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legRight, -1.2566370614359172F, 0.0F, -0.10471975511965977F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 18.5F, -2.0F);
        this.body.addBox(-4.0F, -4.0F, -3.5F, 8, 8, 7, 0.0F);
        this.setRotateAngle(body, 0.03490658503988659F, 0.0F, 0.0F);
        this.thighRight = new BookwormModelRenderer(this, 26, 36, "thighRight");
        this.thighRight.mirror = true;
        this.thighRight.setRotationPoint(-3.4F, -0.3F, 7.5F);
        this.thighRight.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.rump = new BookwormModelRenderer(this, 0, 31, "rump");
        this.rump.setRotationPoint(0.0F, 0.2F, 5.9F);
        this.rump.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 5, 0.0F);
        this.setRotateAngle(rump, -0.5585053606381855F, 0.0F, 0.0F);
        this.earRight = new BookwormModelRenderer(this, 0, 0, "earRight");
        this.earRight.mirror = true;
        this.earRight.setRotationPoint(-0.8F, -0.6F, -1.7F);
        this.earRight.addBox(-2.0F, -3.5F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earRight, 0.3141592653589793F, 0.3490658503988659F, -0.2792526803190927F);
        this.arm2Left = new BookwormModelRenderer(this, 39, 28, "arm2Left");
        this.arm2Left.setRotationPoint(0.0F, 4.2F, 1.2F);
        this.arm2Left.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm2Left, -0.3141592653589793F, 0.0F, 0.17453292519943295F);
        this.nose = new BookwormModelRenderer(this, 33, 14, "nose");
        this.nose.setRotationPoint(0.0F, -1.1F, -5.3F);
        this.nose.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(nose, 0.19198621771937624F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 43, 17, "tail1");
        this.tail1.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail1, -0.17453292519943295F, 0.0F, 0.0F);
        this.belly = new BookwormModelRenderer(this, 40, 46, "belly");
        this.belly.setRotationPoint(0.0F, 1.8F, -1.5F);
        this.belly.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(belly, -0.2792526803190927F, 0.0F, 0.0F);
        this.bodyRear = new BookwormModelRenderer(this, 0, 15, "bodyRear");
        this.bodyRear.setRotationPoint(0.0F, -4.7F, 3.3F);
        this.bodyRear.addBox(-4.5F, 0.0F, 0.0F, 9, 10, 6, 0.0F);
        this.setRotateAngle(bodyRear, -0.10471975511965977F, 0.0F, 0.0F);
        this.snout = new BookwormModelRenderer(this, 30, 21, "snout");
        this.snout.setRotationPoint(0.0F, -0.8F, 0.8F);
        this.snout.addBox(-1.5F, 0.0F, -10.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(snout, 0.03490658503988659F, 0.0F, 0.0F);
        this.footLeft = new BookwormModelRenderer(this, 47, 28, "footLeft");
        this.footLeft.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.footLeft.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(footLeft, 1.2217304763960306F, 0.06981317007977318F, 0.0F);
        this.neck1 = new BookwormModelRenderer(this, 3, 47, "neck1");
        this.neck1.setRotationPoint(0.0F, -3.3F, -1.6F);
        this.neck1.addBox(-3.5F, -0.0F, -4.0F, 7, 4, 5, 0.0F);
        this.setRotateAngle(neck1, -0.06981317007977318F, 0.0F, 0.0F);
        this.handLeft = new BookwormModelRenderer(this, 28, 15, "handLeft");
        this.handLeft.setRotationPoint(0.0F, 3.7F, -1.5F);
        this.handLeft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handLeft, 0.06981317007977318F, 0.0F, -0.17453292519943295F);
        this.legLeft = new BookwormModelRenderer(this, 44, 35, "legLeft");
        this.legLeft.setRotationPoint(0.0F, 4.5F, -1.8F);
        this.legLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legLeft, -1.2566370614359172F, 0.0F, 0.10471975511965977F);
        this.tailBase = new BookwormModelRenderer(this, 26, 54, "tailBase");
        this.tailBase.setRotationPoint(0.0F, 5.0F, 0.8F);
        this.tailBase.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tailBase, 0.3141592653589793F, 0.0F, 0.0F);
        this.footRight = new BookwormModelRenderer(this, 47, 28, "footRight");
        this.footRight.mirror = true;
        this.footRight.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.footRight.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(footRight, 1.2217304763960306F, -0.06981317007977318F, 0.0F);
        this.armLeft = new BookwormModelRenderer(this, 27, 28, "armLeft");
        this.armLeft.setRotationPoint(2.7F, -0.3F, -3.1F);
        this.armLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armLeft, 0.20943951023931953F, 0.0F, 0.0F);
        this.neckUnder = new BookwormModelRenderer(this, 3, 56, "neckUnder");
        this.neckUnder.setRotationPoint(0.0F, 5.4F, -4.7F);
        this.neckUnder.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(neckUnder, -0.3490658503988659F, 0.0F, 0.0F);
        this.lowerJaw = new BookwormModelRenderer(this, 43, 12, "lowerJaw");
        this.lowerJaw.setRotationPoint(0.0F, 1.7F, -5.8F);
        this.lowerJaw.addBox(-1.0F, 0.0F, -3.5F, 2, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.10471975511965977F, 0.0F, 0.0F);
        this.head.addChild(this.earLeft);
        this.body.addChild(this.armRight);
        this.neck1.addChild(this.head);
        this.arm2Right.addChild(this.handRight);
        this.body.addChild(this.thighLeft);
        this.tail1.addChild(this.tail2);
        this.armRight.addChild(this.arm2Right);
        this.thighRight.addChild(this.legRight);
        this.body.addChild(this.thighRight);
        this.bodyRear.addChild(this.rump);
        this.head.addChild(this.earRight);
        this.armLeft.addChild(this.arm2Left);
        this.snout.addChild(this.nose);
        this.tailBase.addChild(this.tail1);
        this.body.addChild(this.belly);
        this.body.addChild(this.bodyRear);
        this.head.addChild(this.snout);
        this.legLeft.addChild(this.footLeft);
        this.body.addChild(this.neck1);
        this.arm2Left.addChild(this.handLeft);
        this.thighLeft.addChild(this.legLeft);
        this.rump.addChild(this.tailBase);
        this.legRight.addChild(this.footRight);
        this.body.addChild(this.armLeft);
        this.neck1.addChild(this.neckUnder);
        this.snout.addChild(this.lowerJaw);

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 26.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.body.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        this.head.rotateAngleX = (headPitch / (180F / (float)Math.PI)) + (float)(24 / (180 / Math.PI));
        this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.neck1.rotateAngleX = MathHelper.cos((f * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.07F;
        this.tail1.rotateAngleX = MathHelper.cos((f * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.17F;
        this.tail1.rotateAngleY = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F;
        this.tail2.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.3F) * f1 * 0.5F + 0.31F;
        this.earLeft.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + 0.28F;
        this.earRight.rotateAngleZ = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.28F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (!entity.isRiding()) {
            speed = 4.0F;
            degree = 1.0F;
            if (entity.isInWater()) {
                f = (float)entity.ticksExisted;
                f1 = 0.3F;
                speed = 1.0F;
            }
            this.armLeft.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.21F;
            this.arm2Left.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.31F;
            this.handLeft.rotateAngleX = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.1F;
            this.armRight.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.21F;
            this.arm2Right.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.31F;
            this.handRight.rotateAngleX = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.1F;
            this.thighLeft.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F;
            this.legLeft.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -1.24F;
            this.footLeft.rotateAngleX = MathHelper.cos(1.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 1.23F;
            this.thighRight.rotateAngleX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
            this.legRight.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -1.24F;
            this.footRight.rotateAngleX = MathHelper.cos(1.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 1.23F;
            this.neck1.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F + -0.07F;
            this.tail1.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F + -0.16F;
            this.body.offsetY = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + -0.02F;
            this.tail1.rotateAngleY = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F;
            this.tail2.rotateAngleX = MathHelper.cos((f * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * f1 * 0.5F + 0.28F;
        }
    }

    @Override
    protected void performSleepAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performSleepAnimation(f, f1, f2, f3, f4, f5, entity);
    }
}