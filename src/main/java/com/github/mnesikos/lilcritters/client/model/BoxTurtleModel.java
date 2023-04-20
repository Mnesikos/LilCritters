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

public class BoxTurtleModel extends ZawaBaseModel<BoxTurtleEntity> {
    public ModelRenderer Shell;
    public ModelRenderer ShellFront;
    public ModelRenderer ShellBack;
    public ModelRenderer LeftLip;
    public ModelRenderer RightLip;
    public ModelRenderer Belly;
    public ModelRenderer LeftFrontLip;
    public ModelRenderer RightFrontLip;
    public ModelRenderer LeftTopLip;
    public ModelRenderer RightTopLip;
    public ModelRenderer Neck;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer Mouth;
    public ModelRenderer Nose;
    public ModelRenderer SnoutFront;
    public ModelRenderer LeftForeArm;
    public ModelRenderer LeftHand;
    public ModelRenderer RightForeArm;
    public ModelRenderer RightHand;
    public ModelRenderer LeftBackLip2;
    public ModelRenderer RightBackLip2;
    public ModelRenderer LeftBackLip1;
    public ModelRenderer RightBackLip1;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightFoot;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Shell);
        }

        return this.parts;
    }

    public BoxTurtleModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.LeftTopLip = new ModelRenderer(this, 51, 26);
        this.LeftTopLip.setPos(0.0F, 0.0F, -2.5F);
        this.LeftTopLip.addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftTopLip, 0.6829473549475088F, 0.18203784630933073F, 0.0F);
        this.LeftHand = new ModelRenderer(this, 31, 15);
        this.LeftHand.setPos(0.3F, 1.6F, -1.3F);
        this.LeftHand.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftHand, 0.18203784630933073F, 0.18203784630933073F, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 23, 25);
        this.LeftFoot.setPos(0.1F, -0.6F, 1.8F);
        this.LeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFoot, -0.3642502295386026F, -0.0911061832922575F, 0.0F);
        this.Belly = new ModelRenderer(this, 39, 31);
        this.Belly.setPos(0.0F, 2.2F, 0.0F);
        this.Belly.addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Belly, -0.04555309164612875F, 0.0F, 0.0F);
        this.LeftFrontLip = new ModelRenderer(this, 41, 20);
        this.LeftFrontLip.setPos(3.0F, 2.2F, -2.2F);
        this.LeftFrontLip.addBox(0.0F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFrontLip, 0.27314402127920984F, 0.7285004590772052F, 0.0F);
        this.LeftBackLip1 = new ModelRenderer(this, 38, 16);
        this.LeftBackLip1.setPos(0.0F, -0.4F, 4.8F);
        this.LeftBackLip1.addBox(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftBackLip1, 0.4098033003787853F, 0.13665927909957545F, 0.0F);
        this.ShellFront = new ModelRenderer(this, 25, 0);
        this.ShellFront.setPos(0.0F, -2.5F, -2.5F);
        this.ShellFront.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ShellFront, 0.45535640450848164F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 11);
        this.Neck.setPos(0.0F, 3.3F, -2.2F);
        this.Neck.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.6829473549475088F, 0.0F, 0.0F);
        this.RightHand = new ModelRenderer(this, 34, 24);
        this.RightHand.setPos(-0.3F, 1.6F, -1.3F);
        this.RightHand.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightHand, 0.18203784630933073F, -0.18203784630933073F, 0.0F);
        this.Shell = new ModelRenderer(this, 0, 0);
        this.Shell.setPos(0.0F, 19.2F, 0.0F);
        this.Shell.addBox(-3.5F, -2.5F, -2.5F, 7.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Shell, -0.04555309164612875F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 18, 11);
        this.LeftArm.setPos(1.8F, 4.0F, -2.2F);
        this.LeftArm.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftArm, 0.0911061832922575F, -0.500909508638178F, 0.0F);
        this.RightArm = new ModelRenderer(this, 18, 18);
        this.RightArm.setPos(-1.8F, 4.0F, -2.2F);
        this.RightArm.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightArm, 0.0911061832922575F, 0.500909508638178F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 28, 27);
        this.RightLeg.setPos(-1.9F, 3.4F, 3.4F);
        this.RightLeg.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg, -0.45535640450848164F, -0.18203784630933073F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 14, 26);
        this.LeftLeg.setPos(1.9F, 3.4F, 3.4F);
        this.LeftLeg.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg, -0.45535640450848164F, 0.18203784630933073F, 0.0F);
        this.RightBackLip1 = new ModelRenderer(this, 47, 16);
        this.RightBackLip1.setPos(0.0F, -0.4F, 4.8F);
        this.RightBackLip1.addBox(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightBackLip1, 0.4098033003787853F, -0.13665927909957545F, 0.0F);
        this.RightLip = new ModelRenderer(this, 51, 16);
        this.RightLip.setPos(-3.5F, 1.8F, 0.0F);
        this.RightLip.addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLip, 0.0F, 0.0F, -0.9105382388075086F);
        this.LeftBackLip2 = new ModelRenderer(this, 41, 10);
        this.LeftBackLip2.setPos(3.0F, 2.0F, 3.0F);
        this.LeftBackLip2.addBox(-1.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftBackLip2, -0.27314402127920984F, 0.6829473549475088F, -0.27314402127920984F);
        this.RightTopLip = new ModelRenderer(this, 55, 23);
        this.RightTopLip.setPos(0.0F, 0.0F, -2.5F);
        this.RightTopLip.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightTopLip, 0.6829473549475088F, -0.18203784630933073F, 0.0F);
        this.LeftLip = new ModelRenderer(this, 51, 9);
        this.LeftLip.setPos(3.5F, 1.8F, 0.0F);
        this.LeftLip.addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLip, 0.0F, 0.0F, 0.9105382388075086F);
        this.ShellBack = new ModelRenderer(this, 44, 0);
        this.ShellBack.setPos(0.0F, -2.5F, 2.5F);
        this.ShellBack.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ShellBack, -0.7285004590772052F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 13, 17);
        this.Mouth.setPos(0.0F, 1.4F, -0.5F);
        this.Mouth.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.27314402127920984F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 19);
        this.Head.setPos(0.0F, 0.2F, -4.5F);
        this.Head.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.27314402127920984F, 0.0F, 0.0F);
        this.RightFrontLip = new ModelRenderer(this, 46, 20);
        this.RightFrontLip.setPos(-3.0F, 2.2F, -2.2F);
        this.RightFrontLip.addBox(-1.0F, -2.5F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFrontLip, 0.27314402127920984F, -0.7285004590772052F, 0.0F);
        this.LeftForeArm = new ModelRenderer(this, 28, 10);
        this.LeftForeArm.setPos(0.0F, -1.0F, -3.0F);
        this.LeftForeArm.addBox(-0.9F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftForeArm, 0.9105382388075086F, 0.0F, 0.0F);
        this.RightBackLip2 = new ModelRenderer(this, 46, 10);
        this.RightBackLip2.setPos(-3.0F, 2.0F, 3.0F);
        this.RightBackLip2.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightBackLip2, -0.27314402127920984F, -0.7285004590772052F, 0.27314402127920984F);
        this.RightFoot = new ModelRenderer(this, 37, 28);
        this.RightFoot.setPos(-0.1F, -0.6F, 1.8F);
        this.RightFoot.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFoot, -0.3642502295386026F, 0.0911061832922575F, 0.0F);
        this.SnoutFront = new ModelRenderer(this, 11, 21);
        this.SnoutFront.setPos(0.0F, -1.3F, -0.1F);
        this.SnoutFront.addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutFront, 0.13665927909957545F, 0.0F, 0.0F);
        this.RightForeArm = new ModelRenderer(this, 31, 19);
        this.RightForeArm.setPos(0.0F, -1.0F, -3.0F);
        this.RightForeArm.addBox(-1.1F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightForeArm, 0.9105382388075086F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 25);
        this.Snout.setPos(0.0F, -0.2F, -0.3F);
        this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 9, 26);
        this.Nose.setPos(0.0F, -1.0F, -1.2F);
        this.Nose.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.ShellFront.addChild(this.LeftTopLip);
        this.LeftForeArm.addChild(this.LeftHand);
        this.LeftLeg.addChild(this.LeftFoot);
        this.Shell.addChild(this.Belly);
        this.ShellFront.addChild(this.LeftFrontLip);
        this.ShellBack.addChild(this.LeftBackLip1);
        this.Shell.addChild(this.ShellFront);
        this.ShellFront.addChild(this.Neck);
        this.RightForeArm.addChild(this.RightHand);
        this.ShellFront.addChild(this.LeftArm);
        this.ShellFront.addChild(this.RightArm);
        this.ShellBack.addChild(this.RightLeg);
        this.ShellBack.addChild(this.LeftLeg);
        this.ShellBack.addChild(this.RightBackLip1);
        this.Shell.addChild(this.RightLip);
        this.ShellBack.addChild(this.LeftBackLip2);
        this.ShellFront.addChild(this.RightTopLip);
        this.Shell.addChild(this.LeftLip);
        this.Shell.addChild(this.ShellBack);
        this.Head.addChild(this.Mouth);
        this.Neck.addChild(this.Head);
        this.ShellFront.addChild(this.RightFrontLip);
        this.LeftArm.addChild(this.LeftForeArm);
        this.ShellBack.addChild(this.RightBackLip2);
        this.RightLeg.addChild(this.RightFoot);
        this.Snout.addChild(this.SnoutFront);
        this.RightArm.addChild(this.RightForeArm);
        this.Head.addChild(this.Snout);
        this.Snout.addChild(this.Nose);
        this.saveBase();
    }

    @Override
    public void setupAnim(BoxTurtleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.27F;
        this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
        this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.5F;
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 1.0f;
        float degree = 1.0f;
        this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.68F;
        this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 10.0f;
        float degree = 2.0f;
        this.LeftArm.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.09F;
        this.LeftForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.91F;
        this.LeftHand.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.18F;
        this.LeftLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.46F;
        this.LeftFoot.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.36F;
        this.RightArm.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.09F;
        this.RightForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.91F;
        this.RightHand.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.18F;
        this.RightLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.46F;
        this.RightFoot.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.36F;
        this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Shell.y = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.8F * limbSwingAmount + 19F;
    }
}
