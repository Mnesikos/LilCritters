package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntityDwarfCrocodile;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Dwarf Crocodile - Hjeshed
 * Created using Tabula 7.1.0
 */
public class ModelDwarfCrocodile extends ZAWAModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer tail1;
    public BookwormModelRenderer thighLeft;
    public BookwormModelRenderer thighRight;
    public BookwormModelRenderer torso;
    public BookwormModelRenderer tail2;
    public BookwormModelRenderer tail3;
    public BookwormModelRenderer tailSpikeRight;
    public BookwormModelRenderer tailSpikeLeft;
    public BookwormModelRenderer tail4;
    public BookwormModelRenderer upperLegLeft;
    public BookwormModelRenderer footLeft;
    public BookwormModelRenderer upperLegRight;
    public BookwormModelRenderer footRight;
    public BookwormModelRenderer chest;
    public BookwormModelRenderer neck;
    public BookwormModelRenderer upperArmLeft;
    public BookwormModelRenderer upperArmRight;
    public BookwormModelRenderer head;
    public BookwormModelRenderer cheekRight;
    public BookwormModelRenderer cheekLeft;
    public BookwormModelRenderer snout;
    public BookwormModelRenderer chin;
    public BookwormModelRenderer noseRight;
    public BookwormModelRenderer noseBridge;
    public BookwormModelRenderer snout2;
    public BookwormModelRenderer noseLeft;
    public BookwormModelRenderer mouth;
    public BookwormModelRenderer armLeft;
    public BookwormModelRenderer handLeft;
    public BookwormModelRenderer armRight;
    public BookwormModelRenderer handRight;

    public ModelDwarfCrocodile() {
        this.textureWidth = 64;
        this.textureHeight = 48;
        this.noseLeft = new BookwormModelRenderer(this, 0, 17, "noseLeft");
        this.noseLeft.mirror = true;
        this.noseLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.noseLeft.addBox(-0.6F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.thighLeft = new BookwormModelRenderer(this, 0, 0, "thighLeft");
        this.thighLeft.setRotationPoint(2.7F, 1.4F, 2.0F);
        this.thighLeft.addBox(0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(thighLeft, 0.0F, -0.06981317007977318F, 0.8726646259971648F);
        this.handLeft = new BookwormModelRenderer(this, 0, 22, "handLeft");
        this.handLeft.setRotationPoint(-1.0F, 2.3F, 0.0F);
        this.handLeft.addBox(-1.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(handLeft, -0.03490658503988659F, 1.5707963267948966F, 0.06981317007977318F);
        this.upperLegLeft = new BookwormModelRenderer(this, 0, 4, "upperLegLeft");
        this.upperLegLeft.setRotationPoint(2.0F, -1.0F, 0.02F);
        this.upperLegLeft.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperLegLeft, 0.0F, 0.0F, 0.6283185307179586F);
        this.neck = new BookwormModelRenderer(this, 0, 28, "neck");
        this.neck.setRotationPoint(0.0F, 2.4F, -2.0F);
        this.neck.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(neck, 0.06981317007977318F, 0.0F, 0.0F);
        this.noseRight = new BookwormModelRenderer(this, 0, 17, "noseRight");
        this.noseRight.setRotationPoint(0.0F, -0.4F, -5.5F);
        this.noseRight.addBox(-1.4F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(noseRight, 0.5235987755982988F, 0.0F, 0.0F);
        this.footRight = new BookwormModelRenderer(this, 16, 13, "footRight");
        this.footRight.mirror = true;
        this.footRight.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.footRight.addBox(-0.5F, -1.0F, -2.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(footRight, 0.03490658503988659F, 0.0F, -0.06981317007977318F);
        this.snout = new BookwormModelRenderer(this, 16, 28, "snout");
        this.snout.setRotationPoint(0.0F, 1.0F, -1.1F);
        this.snout.addBox(-1.5F, -0.4F, -5.0F, 3, 1, 5, 0.0F);
        this.upperLegRight = new BookwormModelRenderer(this, 0, 4, "upperLegRight");
        this.upperLegRight.mirror = true;
        this.upperLegRight.setRotationPoint(-2.0F, -1.0F, 0.02F);
        this.upperLegRight.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperLegRight, 0.0F, 0.0F, -0.6283185307179586F);
        this.chest = new BookwormModelRenderer(this, 47, 24, "chest");
        this.chest.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.chest.addBox(-2.5F, 0.0F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(chest, 0.03490658503988659F, 0.0F, 0.0F);
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.body.addBox(-3.5F, -1.7F, -4.5F, 7, 5, 8, 0.0F);
        this.setRotateAngle(body, -0.08726646259971647F, 0.0F, 0.0F);
        this.tailSpikeLeft = new BookwormModelRenderer(this, 0, 13, "tailSpikeLeft");
        this.tailSpikeLeft.setRotationPoint(2.0F, -1.2F, -1.0F);
        this.tailSpikeLeft.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.setRotateAngle(tailSpikeLeft, -0.10471975511965977F, -0.10471975511965977F, 0.0F);
        this.mouth = new BookwormModelRenderer(this, 27, 24, "mouth");
        this.mouth.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.mouth.addBox(-1.0F, -0.3F, -4.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(mouth, -0.03490658503988659F, 0.0F, 0.0F);
        this.tail1 = new BookwormModelRenderer(this, 22, 0, "tail1");
        this.tail1.setRotationPoint(0.0F, -0.99F, 1.7F);
        this.tail1.addBox(-3.0F, -0.56F, -0.4F, 6, 4, 4, 0.0F);
        this.setRotateAngle(tail1, -0.10471975511965977F, 0.0F, 0.0F);
        this.upperArmLeft = new BookwormModelRenderer(this, 54, 14, "upperArmLeft");
        this.upperArmLeft.setRotationPoint(1.7F, 2.8F, -1.2F);
        this.upperArmLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperArmLeft, -0.06981317007977318F, 0.0F, -0.6283185307179586F);
        this.cheekRight = new BookwormModelRenderer(this, 40, 9, "cheekRight");
        this.cheekRight.setRotationPoint(-1.5F, -1.0F, -0.72F);
        this.cheekRight.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(cheekRight, 0.0F, -0.10471975511965977F, -0.12217304763960307F);
        this.handRight = new BookwormModelRenderer(this, 0, 22, "handRight");
        this.handRight.mirror = true;
        this.handRight.setRotationPoint(1.0F, 2.3F, 0.0F);
        this.handRight.addBox(-2.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(handRight, -0.03490658503988659F, -1.5707963267948966F, -0.06981317007977318F);
        this.armLeft = new BookwormModelRenderer(this, 52, 20, "armLeft");
        this.armLeft.setRotationPoint(0.98F, 2.0F, 0.02F);
        this.armLeft.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, 0.5235987755982988F);
        this.chin = new BookwormModelRenderer(this, 0, 19, "chin");
        this.chin.setRotationPoint(0.0F, 2.2F, -0.2F);
        this.chin.addBox(-1.5F, -0.5F, -1.3F, 3, 1, 2, 0.0F);
        this.tail4 = new BookwormModelRenderer(this, 24, 17, "tail4");
        this.tail4.setRotationPoint(0.0F, 0.52F, 7.4F);
        this.tail4.addBox(-1.5F, -0.53F, -0.3F, 3, 1, 6, 0.0F);
        this.setRotateAngle(tail4, 0.017453292519943295F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 16, 18, "head");
        this.head.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head.addBox(-1.5F, -0.9F, -1.6F, 3, 3, 2, 0.0F);
        this.setRotateAngle(head, -0.03490658503988659F, 0.0F, 0.0F);
        this.thighRight = new BookwormModelRenderer(this, 0, 0, "thighRight");
        this.thighRight.mirror = true;
        this.thighRight.setRotationPoint(-2.7F, 1.4F, 2.0F);
        this.thighRight.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(thighRight, 0.0F, 0.06981317007977318F, -0.8726646259971648F);
        this.tailSpikeRight = new BookwormModelRenderer(this, 0, 13, "tailSpikeRight");
        this.tailSpikeRight.setRotationPoint(-2.0F, -1.2F, -1.0F);
        this.tailSpikeRight.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.setRotateAngle(tailSpikeRight, -0.10471975511965977F, 0.10471975511965977F, 0.0F);
        this.upperArmRight = new BookwormModelRenderer(this, 54, 14, "upperArmRight");
        this.upperArmRight.mirror = true;
        this.upperArmRight.setRotationPoint(-1.7F, 2.8F, -1.2F);
        this.upperArmRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(upperArmRight, -0.06981317007977318F, 0.0F, 0.6283185307179586F);
        this.tail3 = new BookwormModelRenderer(this, 37, 9, "tail3");
        this.tail3.setRotationPoint(0.0F, 0.8F, 4.5F);
        this.tail3.addBox(-2.0F, -0.4F, -0.5F, 4, 2, 9, 0.0F);
        this.setRotateAngle(tail3, 0.017453292519943295F, 0.0F, 0.0F);
        this.noseBridge = new BookwormModelRenderer(this, 44, 20, "noseBridge");
        this.noseBridge.setRotationPoint(0.0F, -1.3F, -0.3F);
        this.noseBridge.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(noseBridge, 0.4886921905584123F, 0.0F, 0.0F);
        this.cheekLeft = new BookwormModelRenderer(this, 40, 9, "cheekLeft");
        this.cheekLeft.mirror = true;
        this.cheekLeft.setRotationPoint(1.5F, -1.0F, -0.72F);
        this.cheekLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(cheekLeft, 0.0F, 0.10471975511965977F, 0.12217304763960307F);
        this.snout2 = new BookwormModelRenderer(this, 16, 28, "snout2");
        this.snout2.setRotationPoint(-0.02F, -0.8F, 0.0F);
        this.snout2.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(snout2, 0.06981317007977318F, 0.0F, 0.0F);
        this.armRight = new BookwormModelRenderer(this, 52, 20, "armRight");
        this.armRight.mirror = true;
        this.armRight.setRotationPoint(-0.98F, 2.0F, 0.02F);
        this.armRight.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, -0.5235987755982988F);
        this.torso = new BookwormModelRenderer(this, 42, 0, "torso");
        this.torso.setRotationPoint(0.0F, -1.7F, -4.5F);
        this.torso.addBox(-3.0F, 0.0F, -4.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(torso, 0.15707963267948966F, 0.0F, 0.0F);
        this.tail2 = new BookwormModelRenderer(this, 24, 8, "tail2");
        this.tail2.setRotationPoint(0.0F, 0.4F, 2.1F);
        this.tail2.addBox(-2.5F, -0.5F, -0.2F, 5, 3, 6, 0.0F);
        this.setRotateAngle(tail2, 0.03490658503988659F, 0.0F, 0.0F);
        this.footLeft = new BookwormModelRenderer(this, 16, 13, "footLeft");
        this.footLeft.setRotationPoint(2.0F, 1.0F, 0.0F);
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
        
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(f, f1, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.6D, 0.6D, 0.6D);
            GlStateManager.translate(0.0F, 16.0F * scale, 0.0F);
            this.body.render(scale);
            GlStateManager.popMatrix();
        } else
            this.body.render(scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

        if (entity instanceof EntityDwarfCrocodile && !((EntityDwarfCrocodile) entity).isAsleep()) {
            this.neck.rotateAngleX = (headPitch / (180F / (float) Math.PI)) + (float) (1 / (180 / Math.PI));
            this.head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        }
    }

    @Override
    protected void performIdleAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performIdleAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        speed = 1.0F;
        degree = 1.0F;
        this.neck.rotateAngleX = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.08F) * f1 * 0.5F + 0.07F;
        this.tail1.rotateAngleY = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F;
        this.tail4.rotateAngleY = MathHelper.cos((f * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();

        if (!entity.isRiding()) {
            if (entity.isInWater()) {
                f = (float)entity.ticksExisted;
                f1 = 0.3F;
                speed = 1.0F;
                degree = 1.0F;
                this.body.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.body.offsetX = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -0.2F) * f1 * 0.5F;
                this.torso.rotateAngleY = MathHelper.cos(1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * f1 * 0.5F;
                this.chest.rotateAngleY = MathHelper.cos(2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.6F) * f1 * 0.5F;
                this.neck.rotateAngleY = MathHelper.cos(3.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F;
                this.tail1.rotateAngleY = MathHelper.cos(-0.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * f1 * 0.5F;
                this.tail2.rotateAngleY = MathHelper.cos(-1.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * f1 * 0.5F;
                this.tail3.rotateAngleY = MathHelper.cos(-1.5F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F;
                this.tail4.rotateAngleY = MathHelper.cos(-2.0F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F;
                this.upperArmLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * f1 * 0.5F;
                this.upperArmRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -5.0F) * f1 * 0.5F;
                this.thighLeft.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 8.0F) * f1 * 0.5F;
                this.footLeft.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * f1 * 0.5F;
                this.thighRight.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -8.0F) * f1 * 0.5F;
                this.footRight.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * f1 * 0.5F;
                this.handLeft.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F;
                this.handLeft.rotateAngleZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * f1 * 0.5F;
                this.handLeft.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * f1 * 0.5F;
                this.handRight.rotateAngleY = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 0.0F) * f1 * 0.5F;
                this.handRight.rotateAngleZ = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * 12.0F) * f1 * 0.5F;
                this.handRight.rotateAngleX = MathHelper.cos((f * speed * 0.0F) + (float) Math.PI) * (degree * -12.0F) * f1 * 0.5F;

            } else {
                speed = this.isChild ? 6.0F : 12.0F;
                degree = this.isChild ? 2.0F : 3.0F;
                this.body.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F;
                this.torso.rotateAngleY = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F;
                this.chest.rotateAngleY = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.2F) * f1 * 0.5F;
                this.neck.rotateAngleY = MathHelper.cos(1.2F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.8F) * f1 * 0.5F;
                this.tail1.rotateAngleY = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F;
                this.tail2.rotateAngleY = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.4F) * f1 * 0.5F;
                this.tail3.rotateAngleY = MathHelper.cos(1.2F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.3F) * f1 * 0.5F;
                this.tail4.rotateAngleY = MathHelper.cos(1.6F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F;
                this.upperArmLeft.rotateAngleX = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 3.0F) * f1 * 0.5F;
                this.upperArmLeft.rotateAngleZ = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.6F;
                this.armLeft.rotateAngleZ = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.5F;
                this.upperArmRight.rotateAngleX = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -3.0F) * f1 * 0.5F;
                this.upperArmRight.rotateAngleZ = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.6F;
                this.armRight.rotateAngleZ = MathHelper.cos(0.4F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.5F;
                this.thighLeft.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.9F;
                this.upperLegLeft.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + 0.6F;
                this.thighRight.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.9F;
                this.upperLegRight.rotateAngleZ = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.6F;
                this.body.offsetY = MathHelper.cos(0.8F + (f * speed * 0.4F) + (float) Math.PI) * (degree * 0.05F) * f1 * 0.5F + -0.02F;
                this.thighRight.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.1F;
                this.footRight.rotateAngleY = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + 0.1F;
                this.thighLeft.rotateAngleY = MathHelper.cos((f * speed * 0.2F) + (float) Math.PI) * (degree * 2.0F) * f1 * 0.5F + -0.1F;
                this.footLeft.rotateAngleY = MathHelper.cos(0.8F + (f * speed * 0.2F) + (float) Math.PI) * (degree * -2.0F) * f1 * 0.5F + -0.1F;

            }
        }
    }
}
