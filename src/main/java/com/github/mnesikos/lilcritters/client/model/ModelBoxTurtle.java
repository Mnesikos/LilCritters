package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.EntityBoxTurtle;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import net.soggymustache.bookworm.util.BookwormUtils;
import org.zawamod.configuration.ZAWAConfig;

/**
 * Box Turtle - Mr. Mubbs
 * Created using Tabula 5.1.0
 */
public class ModelBoxTurtle extends BookwormModelBase {
    private BookwormModelRenderer shell;
    private BookwormModelRenderer shellTop;
    private BookwormModelRenderer shellFront;
    private BookwormModelRenderer shellRight;
    private BookwormModelRenderer shellLeft;
    private BookwormModelRenderer shellBack;
    private BookwormModelRenderer frontRightLeg;
    private BookwormModelRenderer frontLeftLeg;
    private BookwormModelRenderer backRightLeg;
    private BookwormModelRenderer backLeftLeg;
    private BookwormModelRenderer shellBottom;
    private BookwormModelRenderer headLipTop;
    private BookwormModelRenderer neck;
    private BookwormModelRenderer headLipBottom;
    private BookwormModelRenderer headLipLeft;
    private BookwormModelRenderer headLipRight;
    private BookwormModelRenderer head;
    private BookwormModelRenderer nose;
    private BookwormModelRenderer mouth;
    private BookwormModelRenderer lipRight;
    private BookwormModelRenderer lipLeft;
    private BookwormModelRenderer backLip;
    private BookwormModelRenderer tail;
    private BookwormModelRenderer backLipRight;
    private BookwormModelRenderer backLipLeft;
    private BookwormModelRenderer frontRightFoot;
    private BookwormModelRenderer frontLeftFoot;
    private BookwormModelRenderer backRightFoot;
    private BookwormModelRenderer backLeftFoot;
    private BookwormModelRenderer shellBottomRight;
    private BookwormModelRenderer shellBottomLeft;

    public ModelBoxTurtle() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shell = new BookwormModelRenderer(this, 0, 6, "shell");
        this.shell.setRotationPoint(0.0F, 19.7F, 0.0F);
        this.shell.addBox(-4.0F, -2.0F, -4.0F, 8, 4, 8, 0.0F);
        this.lipRight = new BookwormModelRenderer(this, 33, 14, "lipRight");
        this.lipRight.mirror = true;
        this.lipRight.setRotationPoint(-0.2F, 0.7F, 0.0F);
        this.lipRight.addBox(-1.0F, 0.0F, -3.9F, 1, 1, 8, 0.0F);
        this.backLipLeft = new BookwormModelRenderer(this, 54, 2, "backLipLeft");
        this.backLipLeft.setRotationPoint(1.5F, -1.0F, 0.48F);
        this.backLipLeft.addBox(0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(backLipLeft, 0.0F, 0.0F, 0.2792526803190927F);
        this.shellBottom = new BookwormModelRenderer(this, 9, 23, "shellBottom");
        this.shellBottom.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shellBottom.addBox(-2.0F, 0.0F, -4.0F, 4, 1, 8, 0.0F);
        this.headLipRight = new BookwormModelRenderer(this, 25, 1, "headLipRight");
        this.headLipRight.mirror = true;
        this.headLipRight.setRotationPoint(-1.5F, -1.0F, -0.48F);
        this.headLipRight.addBox(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(headLipRight, 0.0F, 0.0F, -0.2792526803190927F);
        this.neck = new BookwormModelRenderer(this, 18, 2, "neck");
        this.neck.setRotationPoint(0.0F, 1.1F, -1.0F);
        this.neck.addBox(-1.0F, -1.0F, -1.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck, -0.10471975511965977F, 0.0F, 0.0F);
        this.backRightLeg = new BookwormModelRenderer(this, 8, 18, "backRightLeg");
        this.backRightLeg.mirror = true;
        this.backRightLeg.setRotationPoint(-1.8F, 0.7F, 4.7F);
        this.backRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backRightLeg, -0.6108652381980153F, 2.96705972839036F, 0.0F);
        this.headLipLeft = new BookwormModelRenderer(this, 25, 1, "headLipLeft");
        this.headLipLeft.setRotationPoint(1.5F, -1.0F, -0.48F);
        this.headLipLeft.addBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(headLipLeft, 0.0F, 0.0F, 0.2792526803190927F);
        this.headLipTop = new BookwormModelRenderer(this, 18, 0, "headLipTop");
        this.headLipTop.setRotationPoint(0.0F, 0.3F, -0.5F);
        this.headLipTop.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        this.shellBack = new BookwormModelRenderer(this, 36, 0, "shellBack");
        this.shellBack.setRotationPoint(0.0F, 0.4F, 3.5F);
        this.shellBack.addBox(-3.5F, -1.5F, 0.0F, 7, 3, 1, 0.0F);
        this.mouth = new BookwormModelRenderer(this, 12, 4, "mouth");
        this.mouth.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.mouth.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(mouth, 0.06981317007977318F, 0.0F, 0.0F);
        this.backLeftFoot = new BookwormModelRenderer(this, 8, 22, "backLeftFoot");
        this.backLeftFoot.setRotationPoint(-0.02F, 2.0F, 0.0F);
        this.backLeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backLeftFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.shellBottomRight = new BookwormModelRenderer(this, 34, 24, "shellBottomRight");
        this.shellBottomRight.mirror = true;
        this.shellBottomRight.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.shellBottomRight.addBox(-2.0F, -1.0F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(shellBottomRight, 0.0F, 0.0F, 0.5235987755982988F);
        this.backLeftLeg = new BookwormModelRenderer(this, 8, 18, "backLeftLeg");
        this.backLeftLeg.setRotationPoint(1.8F, 0.7F, 4.7F);
        this.backLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.6108652381980153F, 3.3161255787892263F, 0.0F);
        this.frontLeftLeg = new BookwormModelRenderer(this, 0, 18, "frontLeftLeg");
        this.frontLeftLeg.setRotationPoint(2.2F, 0.7F, -4.6F);
        this.frontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontLeftLeg, -0.6108652381980153F, -0.5235987755982988F, 0.0F);
        this.backLipRight = new BookwormModelRenderer(this, 54, 2, "backLipRight");
        this.backLipRight.mirror = true;
        this.backLipRight.setRotationPoint(-1.5F, -1.0F, 0.48F);
        this.backLipRight.addBox(-2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(backLipRight, 0.0F, 0.0F, -0.2792526803190927F);
        this.lipLeft = new BookwormModelRenderer(this, 33, 14, "lipLeft");
        this.lipLeft.setRotationPoint(0.2F, 0.7F, 0.0F);
        this.lipLeft.addBox(0.0F, 0.0F, -3.9F, 1, 1, 8, 0.0F);
        this.frontRightFoot = new BookwormModelRenderer(this, 0, 22, "frontRightFoot");
        this.frontRightFoot.mirror = true;
        this.frontRightFoot.setRotationPoint(-0.02F, 2.0F, 0.0F);
        this.frontRightFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontRightFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.shellBottomLeft = new BookwormModelRenderer(this, 34, 24, "shellBottomLeft");
        this.shellBottomLeft.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.shellBottomLeft.addBox(0.0F, -1.0F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(shellBottomLeft, 0.0F, 0.0F, -0.5235987755982988F);
        this.shellRight = new BookwormModelRenderer(this, 25, 12, "shellRight");
        this.shellRight.mirror = true;
        this.shellRight.setRotationPoint(-3.5F, 0.4F, 0.0F);
        this.shellRight.addBox(-1.0F, -1.5F, -3.5F, 1, 3, 7, 0.0F);
        this.headLipBottom = new BookwormModelRenderer(this, 28, 2, "headLipBottom");
        this.headLipBottom.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.headLipBottom.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.frontLeftFoot = new BookwormModelRenderer(this, 0, 22, "frontLeftFoot");
        this.frontLeftFoot.setRotationPoint(0.02F, 2.0F, 0.0F);
        this.frontLeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontLeftFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.backRightFoot = new BookwormModelRenderer(this, 8, 22, "backRightFoot");
        this.backRightFoot.mirror = true;
        this.backRightFoot.setRotationPoint(0.02F, 2.0F, 0.0F);
        this.backRightFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backRightFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.backLip = new BookwormModelRenderer(this, 52, 0, "backLip");
        this.backLip.setRotationPoint(0.0F, 0.7F, 0.5F);
        this.backLip.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.shellLeft = new BookwormModelRenderer(this, 25, 12, "shellLeft");
        this.shellLeft.setRotationPoint(3.5F, 0.4F, 0.0F);
        this.shellLeft.addBox(0.0F, -1.5F, -3.5F, 1, 3, 7, 0.0F);
        this.shellTop = new BookwormModelRenderer(this, 24, 4, "shellTop");
        this.shellTop.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.shellTop.addBox(-3.5F, -1.0F, -3.5F, 7, 1, 7, 0.0F);
        this.nose = new BookwormModelRenderer(this, 12, 0, "nose");
        this.nose.setRotationPoint(0.0F, -0.1F, -2.7F);
        this.nose.addBox(-1.0F, -1.4F, -1.3F, 2, 2, 2, 0.0F);
        this.setRotateAngle(nose, 0.08726646259971647F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 0, 0, "head");
        this.head.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.head.addBox(-1.5F, -1.7F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.20943951023931953F, 0.0F, 0.0F);
        this.tail = new BookwormModelRenderer(this, 50, 2, "tail");
        this.tail.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.tail.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(tail, -0.2792526803190927F, 0.0F, 0.0F);
        this.shellFront = new BookwormModelRenderer(this, 36, 0, "shellFront");
        this.shellFront.setRotationPoint(0.0F, 0.4F, -3.5F);
        this.shellFront.addBox(-3.5F, -1.5F, -1.0F, 7, 3, 1, 0.0F);
        this.frontRightLeg = new BookwormModelRenderer(this, 0, 18, "frontRightLeg");
        this.frontRightLeg.mirror = true;
        this.frontRightLeg.setRotationPoint(-2.2F, 0.7F, -4.6F);
        this.frontRightLeg.addBox(-1.0F, 0.0F, -0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontRightLeg, -0.6108652381980153F, 0.5235987755982988F, -0.0F);
        this.shellRight.addChild(this.lipRight);
        this.backLip.addChild(this.backLipLeft);
        this.shell.addChild(this.shellBottom);
        this.headLipTop.addChild(this.headLipRight);
        this.shellFront.addChild(this.neck);
        this.shell.addChild(this.backRightLeg);
        this.headLipTop.addChild(this.headLipLeft);
        this.shellFront.addChild(this.headLipTop);
        this.shell.addChild(this.shellBack);
        this.nose.addChild(this.mouth);
        this.backLeftLeg.addChild(this.backLeftFoot);
        this.shellBottom.addChild(this.shellBottomRight);
        this.shell.addChild(this.backLeftLeg);
        this.shell.addChild(this.frontLeftLeg);
        this.backLip.addChild(this.backLipRight);
        this.shellLeft.addChild(this.lipLeft);
        this.frontRightLeg.addChild(this.frontRightFoot);
        this.shellBottom.addChild(this.shellBottomLeft);
        this.shell.addChild(this.shellRight);
        this.shellFront.addChild(this.headLipBottom);
        this.frontLeftLeg.addChild(this.frontLeftFoot);
        this.backRightLeg.addChild(this.backRightFoot);
        this.shellBack.addChild(this.backLip);
        this.shell.addChild(this.shellLeft);
        this.shell.addChild(this.shellTop);
        this.head.addChild(this.nose);
        this.neck.addChild(this.head);
        this.shellBack.addChild(this.tail);
        this.shell.addChild(this.shellFront);
        this.shell.addChild(this.frontRightLeg);

        this.save();
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.7F, 0.7F, 0.7F);
            GlStateManager.translate(0.0F, 9.6F * scale, 0.0F);
            this.shell.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.shell.render(scale);
        }
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        if (entity != null) {
            super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
            this.reset();

            float globalSpeed = 10f;
            float globalDegree = 10f;
            float globalHeight = 1f;
            if (this.isChild) {
                globalSpeed = 1f;
                globalDegree = 1f;
                globalHeight = 1f;
            }

            if (entity instanceof EntityBoxTurtle) {
                EntityBoxTurtle turtle = (EntityBoxTurtle) entity;
                this.neck.rotateAngleX = (headPitch / (180F / (float)Math.PI)) - 0.10471975511965977F;
                this.neck.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);

                if (!turtle.isRiding()) {
                    if (turtle.isInWater()) {
                        limbSwing = (float)entity.ticksExisted;
                        limbSwingAmount = 1.0F;
                    }

                    if (BookwormUtils.isEntityMoving(turtle)) {
                        this.shell.rotationPointY = (float) -Math.abs((Math.sin(limbSwing * (0.2f * globalSpeed) + 1.0F) * limbSwingAmount * (0.2f * globalHeight))) + 19.7f;
                        this.neck.rotateAngleX = 1f * limbSwingAmount * (0.04f * globalDegree) * MathHelper.cos(limbSwing * (0.4f * globalSpeed) + 0f) + -0.1F;
                        this.head.rotateAngleX = -1f * limbSwingAmount * (0.02f * globalDegree) * MathHelper.cos(limbSwing * (0.4f * globalSpeed) + 0f) + 0.2F;
                        this.tail.rotateAngleX = -1f * limbSwingAmount * (0.04f * globalDegree) * MathHelper.cos(limbSwing * (0.4f * globalSpeed) + 0f) + -0.28F;

                        this.frontLeftLeg.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 0f) + -0.6F;
                        this.frontLeftFoot.rotateAngleX = -1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 1f) + 0.5F;
                        this.frontRightLeg.rotateAngleX = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 0f) + -0.6F;
                        this.frontRightFoot.rotateAngleX = 1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 1f) + 0.5F;
                        this.backRightLeg.rotateAngleX = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 0f) + -0.6F;
                        this.backRightFoot.rotateAngleX = -1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 1f) + 0.5F;
                        this.backLeftLeg.rotateAngleX = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 0f) + -0.6F;
                        this.backLeftFoot.rotateAngleX = 1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (0.2f * globalSpeed) + 1f) + 0.5F;

                    } else if (ZAWAConfig.livingAnimations && !BookwormUtils.isEntityMoving(turtle)) {
                        // TODO

                    }
                }
            }
        } else {
            return;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    protected void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
