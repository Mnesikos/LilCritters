package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.DwarfCrocodileEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class DwarfCrocodileModel extends ZawaBaseModel<DwarfCrocodileEntity> {
    public ZawaModelRenderer body;
    public ZawaModelRenderer tail1;
    public ZawaModelRenderer thighLeft;
    public ZawaModelRenderer thighRight;
    public ZawaModelRenderer torso;
    public ZawaModelRenderer tail2;
    public ZawaModelRenderer tail3;
    public ZawaModelRenderer tailSpikeRight;
    public ZawaModelRenderer tailSpikeLeft;
    public ZawaModelRenderer tail4;
    public ZawaModelRenderer upperLegLeft;
    public ZawaModelRenderer footLeft;
    public ZawaModelRenderer upperLegRight;
    public ZawaModelRenderer footRight;
    public ZawaModelRenderer chest;
    public ZawaModelRenderer neck;
    public ZawaModelRenderer upperArmLeft;
    public ZawaModelRenderer upperArmRight;
    public ZawaModelRenderer head;
    public ZawaModelRenderer cheekRight;
    public ZawaModelRenderer cheekLeft;
    public ZawaModelRenderer snout;
    public ZawaModelRenderer chin;
    public ZawaModelRenderer noseRight;
    public ZawaModelRenderer noseBridge;
    public ZawaModelRenderer snout2;
    public ZawaModelRenderer noseLeft;
    public ZawaModelRenderer mouth;
    public ZawaModelRenderer armLeft;
    public ZawaModelRenderer handLeft;
    public ZawaModelRenderer armRight;
    public ZawaModelRenderer handRight;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.body);
        }

        return this.parts;
    }

    public DwarfCrocodileModel() {
        this.texWidth = 64;
        this.texHeight = 48;
        this.noseLeft = new ZawaModelRenderer(this, 0, 17);
        this.noseLeft.mirror = true;
        this.noseLeft.setPos(0.0F, 0.0F, 0.0F);
        this.noseLeft.addBox(-0.6F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.thighLeft = new ZawaModelRenderer(this, 0, 0);
        this.thighLeft.setPos(2.7F, 1.4F, 2.0F);
        this.thighLeft.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(thighLeft, 0.0F, -0.06981317007977318F, 0.8726646259971648F);
        this.handLeft = new ZawaModelRenderer(this, 0, 22);
        this.handLeft.setPos(-1.0F, 2.3F, 0.0F);
        this.handLeft.addBox(-1.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(handLeft, -0.03490658503988659F, 1.5707963267948966F, 0.06981317007977318F);
        this.upperLegLeft = new ZawaModelRenderer(this, 0, 4);
        this.upperLegLeft.setPos(2.0F, -1.0F, 0.02F);
        this.upperLegLeft.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperLegLeft, 0.0F, 0.0F, 0.6283185307179586F);
        this.neck = new ZawaModelRenderer(this, 0, 28);
        this.neck.setPos(0.0F, 2.4F, -2.0F);
        this.neck.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, 0.06981317007977318F, 0.0F, 0.0F);
        this.noseRight = new ZawaModelRenderer(this, 0, 17);
        this.noseRight.setPos(0.0F, -0.4F, -5.5F);
        this.noseRight.addBox(-1.4F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(noseRight, 0.5235987755982988F, 0.0F, 0.0F);
        this.footRight = new ZawaModelRenderer(this, 16, 13);
        this.footRight.mirror = true;
        this.footRight.setPos(-2.0F, 1.0F, 0.0F);
        this.footRight.addBox(-0.5F, -1.0F, -2.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(footRight, 0.03490658503988659F, 0.0F, -0.06981317007977318F);
        this.snout = new ZawaModelRenderer(this, 16, 28);
        this.snout.setPos(0.0F, 1.0F, -1.1F);
        this.snout.addBox(-1.5F, -0.4F, -5.0F, 3, 1, 5, 0.0F);
        this.upperLegRight = new ZawaModelRenderer(this, 0, 4);
        this.upperLegRight.mirror = true;
        this.upperLegRight.setPos(-2.0F, -1.0F, 0.02F);
        this.upperLegRight.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperLegRight, 0.0F, 0.0F, -0.6283185307179586F);
        this.chest = new ZawaModelRenderer(this, 47, 24);
        this.chest.setPos(0.0F, 0.0F, -4.0F);
        this.chest.addBox(-2.5F, 0.0F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(chest, 0.03490658503988659F, 0.0F, 0.0F);
        this.body = new ZawaModelRenderer(this, 0, 0);
        this.body.setPos(0.0F, 19.0F, 4.0F);
        this.body.addBox(-3.5F, -1.7F, -4.5F, 7, 5, 8, 0.0F);
        this.setRotateAngle(body, -0.08726646259971647F, 0.0F, 0.0F);
        this.tailSpikeLeft = new ZawaModelRenderer(this, 0, 13);
        this.tailSpikeLeft.setPos(2.0F, -1.2F, -1.0F);
        this.tailSpikeLeft.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.setRotateAngle(tailSpikeLeft, -0.10471975511965977F, -0.10471975511965977F, 0.0F);
        this.mouth = new ZawaModelRenderer(this, 27, 24);
        this.mouth.setPos(0.0F, -0.5F, -1.1F);
        this.mouth.addBox(-1.0F, -0.3F, -4.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(mouth, -0.03490658503988659F, 0.0F, 0.0F);
        this.tail1 = new ZawaModelRenderer(this, 22, 0);
        this.tail1.setPos(0.0F, -0.99F, 1.7F);
        this.tail1.addBox(-3.0F, -0.56F, -0.4F, 6, 4, 4, 0.0F);
        this.setRotateAngle(tail1, -0.10471975511965977F, 0.0F, 0.0F);
        this.upperArmLeft = new ZawaModelRenderer(this, 54, 14);
        this.upperArmLeft.setPos(1.7F, 2.8F, -1.2F);
        this.upperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperArmLeft, -0.06981317007977318F, 0.0F, -0.6283185307179586F);
        this.cheekRight = new ZawaModelRenderer(this, 40, 9);
        this.cheekRight.setPos(-1.5F, -1.0F, -0.72F);
        this.cheekRight.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(cheekRight, 0.0F, -0.10471975511965977F, -0.12217304763960307F);
        this.handRight = new ZawaModelRenderer(this, 0, 22);
        this.handRight.mirror = true;
        this.handRight.setPos(1.0F, 2.3F, 0.0F);
        this.handRight.addBox(-2.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(handRight, -0.03490658503988659F, -1.5707963267948966F, -0.06981317007977318F);
        this.armLeft = new ZawaModelRenderer(this, 52, 20);
        this.armLeft.setPos(0.98F, 2.0F, 0.02F);
        this.armLeft.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, 0.5235987755982988F);
        this.chin = new ZawaModelRenderer(this, 0, 19);
        this.chin.setPos(0.0F, 2.2F, -0.2F);
        this.chin.addBox(-1.5F, -0.5F, -1.3F, 3, 1, 2, 0.0F);
        this.tail4 = new ZawaModelRenderer(this, 24, 17);
        this.tail4.setPos(0.0F, 0.52F, 7.4F);
        this.tail4.addBox(-1.5F, -0.53F, -0.3F, 3, 1, 6, 0.0F);
        this.setRotateAngle(tail4, 0.017453292519943295F, 0.0F, 0.0F);
        this.head = new ZawaModelRenderer(this, 16, 18);
        this.head.setPos(0.0F, -1.0F, -3.0F);
        this.head.addBox(-1.5F, -0.9F, -1.6F, 3, 3, 2, 0.0F);
        this.setRotateAngle(head, -0.03490658503988659F, 0.0F, 0.0F);
        this.thighRight = new ZawaModelRenderer(this, 0, 0);
        this.thighRight.mirror = true;
        this.thighRight.setPos(-2.7F, 1.4F, 2.0F);
        this.thighRight.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(thighRight, 0.0F, 0.06981317007977318F, -0.8726646259971648F);
        this.tailSpikeRight = new ZawaModelRenderer(this, 0, 13);
        this.tailSpikeRight.setPos(-2.0F, -1.2F, -1.0F);
        this.tailSpikeRight.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.setRotateAngle(tailSpikeRight, -0.10471975511965977F, 0.10471975511965977F, 0.0F);
        this.upperArmRight = new ZawaModelRenderer(this, 54, 14);
        this.upperArmRight.mirror = true;
        this.upperArmRight.setPos(-1.7F, 2.8F, -1.2F);
        this.upperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperArmRight, -0.06981317007977318F, 0.0F, 0.6283185307179586F);
        this.tail3 = new ZawaModelRenderer(this, 37, 9);
        this.tail3.setPos(0.0F, 0.8F, 4.5F);
        this.tail3.addBox(-2.0F, -0.4F, -0.5F, 4, 2, 9, 0.0F);
        this.setRotateAngle(tail3, 0.017453292519943295F, 0.0F, 0.0F);
        this.noseBridge = new ZawaModelRenderer(this, 44, 20);
        this.noseBridge.setPos(0.0F, -1.3F, -0.3F);
        this.noseBridge.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(noseBridge, 0.4886921905584123F, 0.0F, 0.0F);
        this.cheekLeft = new ZawaModelRenderer(this, 40, 9);
        this.cheekLeft.mirror = true;
        this.cheekLeft.setPos(1.5F, -1.0F, -0.72F);
        this.cheekLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(cheekLeft, 0.0F, 0.10471975511965977F, 0.12217304763960307F);
        this.snout2 = new ZawaModelRenderer(this, 16, 28);
        this.snout2.setPos(-0.02F, -0.8F, 0.0F);
        this.snout2.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(snout2, 0.06981317007977318F, 0.0F, 0.0F);
        this.armRight = new ZawaModelRenderer(this, 52, 20);
        this.armRight.mirror = true;
        this.armRight.setPos(-0.98F, 2.0F, 0.02F);
        this.armRight.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, -0.5235987755982988F);
        this.torso = new ZawaModelRenderer(this, 42, 0);
        this.torso.setPos(0.0F, -1.7F, -4.5F);
        this.torso.addBox(-3.0F, 0.0F, -4.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(torso, 0.15707963267948966F, 0.0F, 0.0F);
        this.tail2 = new ZawaModelRenderer(this, 24, 8);
        this.tail2.setPos(0.0F, 0.4F, 2.1F);
        this.tail2.addBox(-2.5F, -0.5F, -0.2F, 5, 3, 6, 0.0F);
        this.setRotateAngle(tail2, 0.03490658503988659F, 0.0F, 0.0F);
        this.footLeft = new ZawaModelRenderer(this, 16, 13);
        this.footLeft.setPos(2.0F, 1.0F, 0.0F);
        this.footLeft.addBox(-0.5F, -1.0F, -2.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(footLeft, 0.03490658503988659F, 0.0F, 0.06981317007977318F);
        this.noseRight.addChild(this.noseLeft);
        this.body.addChild(this.thighLeft);
        this.armLeft.addChild(this.handLeft);
        this.thighLeft.addChild(this.upperLegLeft);
        this.chest.addChild(this.neck);
        this.snout.addChild(this.noseRight);
        this.upperLegRight.addChild(this.footRight);
        this.head.addChild(this.snout);
        this.thighRight.addChild(this.upperLegRight);
        this.torso.addChild(this.chest);
        this.tail2.addChild(this.tailSpikeLeft);
        this.chin.addChild(this.mouth);
        this.body.addChild(this.tail1);
        this.chest.addChild(this.upperArmLeft);
        this.head.addChild(this.cheekRight);
        this.armRight.addChild(this.handRight);
        this.upperArmLeft.addChild(this.armLeft);
        this.head.addChild(this.chin);
        this.tail3.addChild(this.tail4);
        this.neck.addChild(this.head);
        this.body.addChild(this.thighRight);
        this.tail2.addChild(this.tailSpikeRight);
        this.chest.addChild(this.upperArmRight);
        this.tail2.addChild(this.tail3);
        this.snout.addChild(this.noseBridge);
        this.head.addChild(this.cheekLeft);
        this.snout.addChild(this.snout2);
        this.upperArmRight.addChild(this.armRight);
        this.body.addChild(this.torso);
        this.tail1.addChild(this.tail2);
        this.upperLegLeft.addChild(this.footLeft);
        
        this.saveBase();
    }

    @Override
    public void setupAnim(DwarfCrocodileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.neck.xRot = (headPitch / (180F / (float) Math.PI)) + (float) (1 / (180 / Math.PI));
        this.head.yRot = netHeadYaw / (180F / (float) Math.PI);

    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0F;
        float degree = 1.0F;
        this.neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.08F) * limbSwingAmount * 0.5F + 0.07F;
        this.tail1.yRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
        this.tail4.yRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed;
        float degree;

        if (isSwimming) {
            limbSwing = (float)entity.tickCount;
            limbSwingAmount = 0.3F;
            speed = 1.0F;
            degree = 1.0F;
            this.body.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.body.x = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * limbSwingAmount * 0.5F;
            this.torso.yRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F;
            this.chest.yRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * limbSwingAmount * 0.5F;
            this.neck.yRot = MathHelper.cos(3.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F;
            this.tail1.yRot = MathHelper.cos(-0.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail2.yRot = MathHelper.cos(-1.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail3.yRot = MathHelper.cos(-1.5F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F;
            this.tail4.yRot = MathHelper.cos(-2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * limbSwingAmount * 0.5F;
            this.upperArmRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * limbSwingAmount * 0.5F;
            this.thighLeft.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 8.0F) * limbSwingAmount * 0.5F;
            this.footLeft.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F;
            this.thighRight.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -8.0F) * limbSwingAmount * 0.5F;
            this.footRight.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handLeft.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.handLeft.zRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handLeft.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;
            this.handRight.yRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * limbSwingAmount * 0.5F;
            this.handRight.zRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * limbSwingAmount * 0.5F;
            this.handRight.xRot = MathHelper.cos((limbSwing * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * limbSwingAmount * 0.5F;

        } else {
            speed = ((DwarfCrocodileEntity) entity).isBaby() ? 6.0F : 12.0F;
            degree = ((DwarfCrocodileEntity) entity).isBaby() ? 2.0F : 3.0F;
            this.body.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.torso.yRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.chest.yRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * limbSwingAmount * 0.5F;
            this.neck.yRot = MathHelper.cos(1.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * limbSwingAmount * 0.5F;
            this.tail1.yRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.tail2.yRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * limbSwingAmount * 0.5F;
            this.tail3.yRot = MathHelper.cos(1.2F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * limbSwingAmount * 0.5F;
            this.tail4.yRot = MathHelper.cos(1.6F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.xRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F;
            this.upperArmLeft.zRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.armLeft.zRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.5F;
            this.upperArmRight.xRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F;
            this.upperArmRight.zRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.armRight.zRot = MathHelper.cos(0.4F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.5F;
            this.thighLeft.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.9F;
            this.upperLegLeft.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + 0.6F;
            this.thighRight.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.9F;
            this.upperLegRight.zRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.6F;
            this.body.y = MathHelper.cos(0.8F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.02F;
            this.thighRight.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.footRight.yRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + 0.1F;
            this.thighLeft.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * limbSwingAmount * 0.5F + -0.1F;
            this.footLeft.yRot = MathHelper.cos(0.8F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * limbSwingAmount * 0.5F + -0.1F;

        }
    }
}
