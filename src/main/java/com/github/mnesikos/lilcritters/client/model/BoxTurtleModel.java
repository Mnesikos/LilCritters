package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.BoxTurtleEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;
import org.zawamod.zawa.client.renderer.entity.model.ZawaModelRenderer;

@OnlyIn(Dist.CLIENT)
public class BoxTurtleModel extends ZawaBaseModel<BoxTurtleEntity> {
    protected ZawaModelRenderer shell;
    protected ZawaModelRenderer shellTop;
    protected ZawaModelRenderer shellFront;
    protected ZawaModelRenderer shellRight;
    protected ZawaModelRenderer shellLeft;
    protected ZawaModelRenderer shellBack;
    protected ZawaModelRenderer frontRightLeg;
    protected ZawaModelRenderer frontLeftLeg;
    protected ZawaModelRenderer backRightLeg;
    protected ZawaModelRenderer backLeftLeg;
    protected ZawaModelRenderer shellBottom;
    protected ZawaModelRenderer headLipTop;
    protected ZawaModelRenderer neck;
    protected ZawaModelRenderer headLipBottom;
    protected ZawaModelRenderer headLipLeft;
    protected ZawaModelRenderer headLipRight;
    protected ZawaModelRenderer head;
    protected ZawaModelRenderer nose;
    protected ZawaModelRenderer mouth;
    protected ZawaModelRenderer lipRight;
    protected ZawaModelRenderer lipLeft;
    protected ZawaModelRenderer backLip;
    protected ZawaModelRenderer tail;
    protected ZawaModelRenderer backLipRight;
    protected ZawaModelRenderer backLipLeft;
    protected ZawaModelRenderer frontRightFoot;
    protected ZawaModelRenderer frontLeftFoot;
    protected ZawaModelRenderer backRightFoot;
    protected ZawaModelRenderer backLeftFoot;
    protected ZawaModelRenderer shellBottomRight;
    protected ZawaModelRenderer shellBottomLeft;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.shell);
        }

        return this.parts;
    }

    public BoxTurtleModel() {
        this.texWidth = 64;
        this.texHeight = 32;
        this.shell = new ZawaModelRenderer(this, 0, 6);
        this.shell.setPos(0.0F, 19.7F, 0.0F);
        this.shell.addBox(-4.0F, -2.0F, -4.0F, 8, 4, 8, 0.0F);
        this.lipRight = new ZawaModelRenderer(this, 33, 14);
        this.lipRight.mirror = true;
        this.lipRight.setPos(-0.2F, 0.7F, 0.0F);
        this.lipRight.addBox(-1.0F, 0.0F, -3.9F, 1, 1, 8, 0.0F);
        this.backLipLeft = new ZawaModelRenderer(this, 54, 2);
        this.backLipLeft.setPos(1.5F, -1.0F, 0.48F);
        this.backLipLeft.addBox(0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(backLipLeft, 0.0F, 0.0F, 0.2792526803190927F);
        this.shellBottom = new ZawaModelRenderer(this, 9, 23);
        this.shellBottom.setPos(0.0F, 2.0F, 0.0F);
        this.shellBottom.addBox(-2.0F, 0.0F, -4.0F, 4, 1, 8, 0.0F);
        this.headLipRight = new ZawaModelRenderer(this, 25, 1);
        this.headLipRight.mirror = true;
        this.headLipRight.setPos(-1.5F, -1.0F, -0.48F);
        this.headLipRight.addBox(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(headLipRight, 0.0F, 0.0F, -0.2792526803190927F);
        this.neck = new ZawaModelRenderer(this, 18, 2);
        this.neck.setPos(0.0F, 1.1F, -1.0F);
        this.neck.addBox(-1.0F, -1.0F, -1.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck, -0.10471975511965977F, 0.0F, 0.0F);
        this.backRightLeg = new ZawaModelRenderer(this, 8, 18);
        this.backRightLeg.mirror = true;
        this.backRightLeg.setPos(-1.8F, 0.7F, 4.7F);
        this.backRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backRightLeg, -0.6108652381980153F, 2.96705972839036F, 0.0F);
        this.headLipLeft = new ZawaModelRenderer(this, 25, 1);
        this.headLipLeft.setPos(1.5F, -1.0F, -0.48F);
        this.headLipLeft.addBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(headLipLeft, 0.0F, 0.0F, 0.2792526803190927F);
        this.headLipTop = new ZawaModelRenderer(this, 18, 0);
        this.headLipTop.setPos(0.0F, 0.3F, -0.5F);
        this.headLipTop.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        this.shellBack = new ZawaModelRenderer(this, 36, 0);
        this.shellBack.setPos(0.0F, 0.4F, 3.5F);
        this.shellBack.addBox(-3.5F, -1.5F, 0.0F, 7, 3, 1, 0.0F);
        this.mouth = new ZawaModelRenderer(this, 12, 4);
        this.mouth.setPos(0.0F, 0.5F, 0.0F);
        this.mouth.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(mouth, 0.06981317007977318F, 0.0F, 0.0F);
        this.backLeftFoot = new ZawaModelRenderer(this, 8, 22);
        this.backLeftFoot.setPos(-0.02F, 2.0F, 0.0F);
        this.backLeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backLeftFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.shellBottomRight = new ZawaModelRenderer(this, 34, 24);
        this.shellBottomRight.mirror = true;
        this.shellBottomRight.setPos(-2.0F, 1.0F, 0.0F);
        this.shellBottomRight.addBox(-2.0F, -1.0F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(shellBottomRight, 0.0F, 0.0F, 0.5235987755982988F);
        this.backLeftLeg = new ZawaModelRenderer(this, 8, 18);
        this.backLeftLeg.setPos(1.8F, 0.7F, 4.7F);
        this.backLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.6108652381980153F, 3.3161255787892263F, 0.0F);
        this.frontLeftLeg = new ZawaModelRenderer(this, 0, 18);
        this.frontLeftLeg.setPos(2.2F, 0.7F, -4.6F);
        this.frontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontLeftLeg, -0.6108652381980153F, -0.5235987755982988F, 0.0F);
        this.backLipRight = new ZawaModelRenderer(this, 54, 2);
        this.backLipRight.mirror = true;
        this.backLipRight.setPos(-1.5F, -1.0F, 0.48F);
        this.backLipRight.addBox(-2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(backLipRight, 0.0F, 0.0F, -0.2792526803190927F);
        this.lipLeft = new ZawaModelRenderer(this, 33, 14);
        this.lipLeft.setPos(0.2F, 0.7F, 0.0F);
        this.lipLeft.addBox(0.0F, 0.0F, -3.9F, 1, 1, 8, 0.0F);
        this.frontRightFoot = new ZawaModelRenderer(this, 0, 22);
        this.frontRightFoot.mirror = true;
        this.frontRightFoot.setPos(-0.02F, 2.0F, 0.0F);
        this.frontRightFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontRightFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.shellBottomLeft = new ZawaModelRenderer(this, 34, 24);
        this.shellBottomLeft.setPos(2.0F, 1.0F, 0.0F);
        this.shellBottomLeft.addBox(0.0F, -1.0F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(shellBottomLeft, 0.0F, 0.0F, -0.5235987755982988F);
        this.shellRight = new ZawaModelRenderer(this, 25, 12);
        this.shellRight.mirror = true;
        this.shellRight.setPos(-3.5F, 0.4F, 0.0F);
        this.shellRight.addBox(-1.0F, -1.5F, -3.5F, 1, 3, 7, 0.0F);
        this.headLipBottom = new ZawaModelRenderer(this, 28, 2);
        this.headLipBottom.setPos(0.0F, 1.5F, -0.5F);
        this.headLipBottom.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
        this.frontLeftFoot = new ZawaModelRenderer(this, 0, 22);
        this.frontLeftFoot.setPos(0.02F, 2.0F, 0.0F);
        this.frontLeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(frontLeftFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.backRightFoot = new ZawaModelRenderer(this, 8, 22);
        this.backRightFoot.mirror = true;
        this.backRightFoot.setPos(0.02F, 2.0F, 0.0F);
        this.backRightFoot.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(backRightFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.backLip = new ZawaModelRenderer(this, 52, 0);
        this.backLip.setPos(0.0F, 0.7F, 0.5F);
        this.backLip.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F);
        this.shellLeft = new ZawaModelRenderer(this, 25, 12);
        this.shellLeft.setPos(3.5F, 0.4F, 0.0F);
        this.shellLeft.addBox(0.0F, -1.5F, -3.5F, 1, 3, 7, 0.0F);
        this.shellTop = new ZawaModelRenderer(this, 24, 4);
        this.shellTop.setPos(0.0F, -1.9F, 0.0F);
        this.shellTop.addBox(-3.5F, -1.0F, -3.5F, 7, 1, 7, 0.0F);
        this.nose = new ZawaModelRenderer(this, 12, 0);
        this.nose.setPos(0.0F, -0.1F, -2.7F);
        this.nose.addBox(-1.0F, -1.4F, -1.3F, 2, 2, 2, 0.0F);
        this.setRotateAngle(nose, 0.08726646259971647F, 0.0F, 0.0F);
        this.head = new ZawaModelRenderer(this, 0, 0);
        this.head.setPos(0.0F, 0.3F, -1.0F);
        this.head.addBox(-1.5F, -1.7F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.20943951023931953F, 0.0F, 0.0F);
        this.tail = new ZawaModelRenderer(this, 50, 2);
        this.tail.setPos(0.0F, 1.0F, 0.5F);
        this.tail.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(tail, -0.2792526803190927F, 0.0F, 0.0F);
        this.shellFront = new ZawaModelRenderer(this, 36, 0);
        this.shellFront.setPos(0.0F, 0.4F, -3.5F);
        this.shellFront.addBox(-3.5F, -1.5F, -1.0F, 7, 3, 1, 0.0F);
        this.frontRightLeg = new ZawaModelRenderer(this, 0, 18);
        this.frontRightLeg.mirror = true;
        this.frontRightLeg.setPos(-2.2F, 0.7F, -4.6F);
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

        this.saveBase();
    }

    @Override
    public void setupAnim(BoxTurtleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.neck.xRot = (headPitch / (180F / (float)Math.PI)) - 0.10471975511965977F;
        this.neck.yRot = netHeadYaw / (180F / (float)Math.PI);
    }

    @Override
    public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
        this.loadBase();
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float globalSpeed = 6.0f;
        float globalDegree = 2.0f;
        float globalHeight = 4.0f;
        if (((BoxTurtleEntity) entity).isBaby()) {
            globalSpeed = 2f;
            globalDegree = 2f;
            globalHeight = 1f;
        }
        if (isSwimming) {
            limbSwing = (float)entity.tickCount / 10F;
            limbSwingAmount = 0.1F;
        }

        // TODO this pretty broken when the turtle is smacked/on a lead
//        this.shell.y = (float) -Math.abs((Math.sin(limbSwing * (0.5f * globalSpeed) + 1.0F) * limbSwingAmount * (0.5f * globalHeight))) + 19.7f;
        this.neck.xRot = 1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + -0.1F;
        this.head.xRot = -1f * limbSwingAmount * (0.05f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + 0.2F;
        this.tail.xRot = -1f * limbSwingAmount * (0.1f * globalDegree) * MathHelper.cos(limbSwing * (1f * globalSpeed) + 0f) + -0.28F;

        this.frontLeftLeg.xRot = 1f * limbSwingAmount * (1f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + -0.6F;
        this.frontLeftFoot.xRot = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 1f) + 0.5F;
        this.frontRightLeg.xRot = -1f * limbSwingAmount * (1f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + -0.6F;
        this.frontRightFoot.xRot = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 1f) + 0.5F;

        this.backRightLeg.xRot = -1f * limbSwingAmount * (1f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + -0.6F;
        this.backRightLeg.zRot = 1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + 0.0F;
        this.backRightFoot.xRot = -1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 1f) + 0.5F;
        this.backLeftLeg.xRot = 1f * limbSwingAmount * (1f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + -0.6F;
        this.backLeftLeg.zRot = 1f * limbSwingAmount * (0.5f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 0f) + 0.0F;
        this.backLeftFoot.xRot = 1f * limbSwingAmount * (0.4f * globalDegree) * MathHelper.cos(limbSwing * (0.5f * globalSpeed) + 1f) + 0.5F;
    }
}
