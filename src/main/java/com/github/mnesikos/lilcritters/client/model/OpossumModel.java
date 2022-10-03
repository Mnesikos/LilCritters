package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.OpossumEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class OpossumModel extends ZawaBaseModel<OpossumEntity> {
    public ZawaModelRenderer body;
    public ZawaModelRenderer bodyRear;
    public ZawaModelRenderer neck1;
    public ZawaModelRenderer armLeft;
    public ZawaModelRenderer armRight;
    public ZawaModelRenderer thighLeft;
    public ZawaModelRenderer thighRight;
    public ZawaModelRenderer belly;
    public ZawaModelRenderer rump;
    public ZawaModelRenderer tailBase;
    public ZawaModelRenderer tail1;
    public ZawaModelRenderer tail2;
    public ZawaModelRenderer neckUnder;
    public ZawaModelRenderer head;
    public ZawaModelRenderer earLeft;
    public ZawaModelRenderer earRight;
    public ZawaModelRenderer snout;
    public ZawaModelRenderer nose;
    public ZawaModelRenderer lowerJaw;
    public ZawaModelRenderer arm2Left;
    public ZawaModelRenderer handLeft;
    public ZawaModelRenderer arm2Right;
    public ZawaModelRenderer handRight;
    public ZawaModelRenderer legLeft;
    public ZawaModelRenderer footLeft;
    public ZawaModelRenderer legRight;
    public ZawaModelRenderer footRight;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public OpossumModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.earLeft = new ZawaModelRenderer(this, 0, 0);
        this.earLeft.setPos(0.8F, -0.6F, -1.7F);
        this.earLeft.addBox(0.0F, -3.5F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.3141592653589793F, -0.3490658503988659F, 0.2792526803190927F);
        this.armRight = new ZawaModelRenderer(this, 27, 28);
        this.armRight.mirror = true;
        this.armRight.setPos(-2.7F, -0.3F, -3.1F);
        this.armRight.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armRight, 0.20943951023931953F, 0.0F, 0.0F);
        this.head = new ZawaModelRenderer(this, 38, 0);
        this.head.setPos(0.0F, 3.4F, -3.0F);
        this.head.addBox(-3.0F, -3.0F, -5.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(head, 0.10471975511965977F, 0.0F, 0.0F);
        this.handRight = new ZawaModelRenderer(this, 28, 15);
        this.handRight.mirror = true;
        this.handRight.setPos(0.0F, 3.7F, -1.5F);
        this.handRight.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handRight, 0.06981317007977318F, 0.0F, 0.17453292519943295F);
        this.thighLeft = new ZawaModelRenderer(this, 26, 36);
        this.thighLeft.setPos(3.4F, -0.3F, 7.5F);
        this.thighLeft.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.tail2 = new ZawaModelRenderer(this, 43, 17);
        this.tail2.setPos(0.0F, 1.0F, 7.0F);
        this.tail2.addBox(-1.02F, -2.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail2, 0.3141592653589793F, 0.0F, 0.0F);
        this.arm2Right = new ZawaModelRenderer(this, 39, 28);
        this.arm2Right.mirror = true;
        this.arm2Right.setPos(0.0F, 4.2F, 1.2F);
        this.arm2Right.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm2Right, -0.3141592653589793F, 0.0F, -0.17453292519943295F);
        this.legRight = new ZawaModelRenderer(this, 44, 35);
        this.legRight.mirror = true;
        this.legRight.setPos(0.0F, 4.5F, -1.8F);
        this.legRight.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legRight, -1.2566370614359172F, 0.0F, -0.10471975511965977F);
        this.body = new ZawaModelRenderer(this, 0, 0);
        this.body.setPos(0.0F, 18.5F, -2.0F);
        this.body.addBox(-4.0F, -4.0F, -3.5F, 8, 8, 7, 0.0F);
        this.setRotateAngle(body, 0.03490658503988659F, 0.0F, 0.0F);
        this.thighRight = new ZawaModelRenderer(this, 26, 36);
        this.thighRight.mirror = true;
        this.thighRight.setPos(-3.4F, -0.3F, 7.5F);
        this.thighRight.addBox(-2.0F, -2.0F, -2.0F, 4, 7, 4, 0.0F);
        this.rump = new ZawaModelRenderer(this, 0, 31);
        this.rump.setPos(0.0F, 0.2F, 5.9F);
        this.rump.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 5, 0.0F);
        this.setRotateAngle(rump, -0.5585053606381855F, 0.0F, 0.0F);
        this.earRight = new ZawaModelRenderer(this, 0, 0);
        this.earRight.mirror = true;
        this.earRight.setPos(-0.8F, -0.6F, -1.7F);
        this.earRight.addBox(-2.0F, -3.5F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earRight, 0.3141592653589793F, 0.3490658503988659F, -0.2792526803190927F);
        this.arm2Left = new ZawaModelRenderer(this, 39, 28);
        this.arm2Left.setPos(0.0F, 4.2F, 1.2F);
        this.arm2Left.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(arm2Left, -0.3141592653589793F, 0.0F, 0.17453292519943295F);
        this.nose = new ZawaModelRenderer(this, 33, 14);
        this.nose.setPos(0.0F, -1.1F, -5.3F);
        this.nose.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(nose, 0.19198621771937624F, 0.0F, 0.0F);
        this.tail1 = new ZawaModelRenderer(this, 43, 17);
        this.tail1.setPos(0.0F, 1.0F, 4.0F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail1, -0.17453292519943295F, 0.0F, 0.0F);
        this.belly = new ZawaModelRenderer(this, 40, 46);
        this.belly.setPos(0.0F, 1.8F, -1.5F);
        this.belly.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(belly, -0.2792526803190927F, 0.0F, 0.0F);
        this.bodyRear = new ZawaModelRenderer(this, 0, 15);
        this.bodyRear.setPos(0.0F, -4.7F, 3.3F);
        this.bodyRear.addBox(-4.5F, 0.0F, 0.0F, 9, 10, 6, 0.0F);
        this.setRotateAngle(bodyRear, -0.10471975511965977F, 0.0F, 0.0F);
        this.snout = new ZawaModelRenderer(this, 30, 21);
        this.snout.setPos(0.0F, -0.8F, 0.8F);
        this.snout.addBox(-1.5F, 0.0F, -10.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(snout, 0.03490658503988659F, 0.0F, 0.0F);
        this.footLeft = new ZawaModelRenderer(this, 47, 28);
        this.footLeft.setPos(0.0F, -1.0F, 3.5F);
        this.footLeft.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(footLeft, 1.2217304763960306F, 0.06981317007977318F, 0.0F);
        this.neck1 = new ZawaModelRenderer(this, 3, 47);
        this.neck1.setPos(0.0F, -3.3F, -1.6F);
        this.neck1.addBox(-3.5F, -0.0F, -4.0F, 7, 4, 5, 0.0F);
        this.setRotateAngle(neck1, -0.06981317007977318F, 0.0F, 0.0F);
        this.handLeft = new ZawaModelRenderer(this, 28, 15);
        this.handLeft.setPos(0.0F, 3.7F, -1.5F);
        this.handLeft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(handLeft, 0.06981317007977318F, 0.0F, -0.17453292519943295F);
        this.legLeft = new ZawaModelRenderer(this, 44, 35);
        this.legLeft.setPos(0.0F, 4.5F, -1.8F);
        this.legLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legLeft, -1.2566370614359172F, 0.0F, 0.10471975511965977F);
        this.tailBase = new ZawaModelRenderer(this, 26, 54);
        this.tailBase.setPos(0.0F, 5.0F, 0.8F);
        this.tailBase.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tailBase, 0.3141592653589793F, 0.0F, 0.0F);
        this.footRight = new ZawaModelRenderer(this, 47, 28);
        this.footRight.mirror = true;
        this.footRight.setPos(0.0F, -1.0F, 3.5F);
        this.footRight.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(footRight, 1.2217304763960306F, -0.06981317007977318F, 0.0F);
        this.armLeft = new ZawaModelRenderer(this, 27, 28);
        this.armLeft.setPos(2.7F, -0.3F, -3.1F);
        this.armLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armLeft, 0.20943951023931953F, 0.0F, 0.0F);
        this.neckUnder = new ZawaModelRenderer(this, 3, 56);
        this.neckUnder.setPos(0.0F, 5.4F, -4.7F);
        this.neckUnder.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(neckUnder, -0.3490658503988659F, 0.0F, 0.0F);
        this.lowerJaw = new ZawaModelRenderer(this, 43, 12);
        this.lowerJaw.setPos(0.0F, 1.7F, -5.8F);
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

        this.saveBase();
    }

    @Override
    public void setupAnim(OpossumEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.head.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (24 / (180 / Math.PI));
        this.head.yRot = netHeadYaw / (180F / (float) Math.PI);

    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck1.xRot = MathHelper.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.07F;
        this.tail1.xRot = MathHelper.cos((limbSwing * speed * 0.05F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.17F;
        this.tail1.yRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
        this.tail2.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F + 0.31F;
        this.earLeft.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + 0.28F;
        this.earRight.zRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.28F;

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 4.0F;
        float degree = 1.0F;
        if (entity.isInWater()) {
            limbSwing = (float) entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
        }
        this.armLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.21F;
        this.arm2Left.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.31F;
        this.handLeft.xRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.1F;
        this.armRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.21F;
        this.arm2Right.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.31F;
        this.handRight.xRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.1F;
        this.thighLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F;
        this.legLeft.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -1.24F;
        this.footLeft.xRot = MathHelper.cos(1.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 1.23F;
        this.thighRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
        this.legRight.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -1.24F;
        this.footRight.xRot = MathHelper.cos(1.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 1.23F;
        this.neck1.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F + -0.07F;
        this.tail1.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F + -0.16F;
//        this.body.y = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.02F;
        this.tail1.yRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
        this.tail2.xRot = MathHelper.cos((limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + 0.28F;
    }
}