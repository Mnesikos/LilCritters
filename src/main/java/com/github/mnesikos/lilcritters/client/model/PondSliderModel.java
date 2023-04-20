package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.PondSliderEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;

public class PondSliderModel extends ZawaBaseModel<PondSliderEntity> {
    public ModelRenderer Shell;
    public ModelRenderer ShellFront;
    public ModelRenderer ShellBack;
    public ModelRenderer Belly;
    public ModelRenderer LeftLip;
    public ModelRenderer RightLip;
    public ModelRenderer LeftTopLip;
    public ModelRenderer LeftFrontLip;
    public ModelRenderer RightTopLip;
    public ModelRenderer RightFrontLip;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Neck;
    public ModelRenderer LeftForeArm;
    public ModelRenderer LeftHand;
    public ModelRenderer RightForeArm;
    public ModelRenderer RightHand;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer Mouth;
    public ModelRenderer Nose;
    public ModelRenderer SnoutFront;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftBackLip2;
    public ModelRenderer RightBackLip2;
    public ModelRenderer LeftBackLip1;
    public ModelRenderer RightBackLip1;
    public ModelRenderer Tail;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightFoot;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Shell);
        }

        return this.parts;
    }

    public PondSliderModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.LeftTopLip = new ModelRenderer(this, 51, 26);
        this.LeftTopLip.setPos(0.0F, 0.0F, -2.0F);
        this.LeftTopLip.addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftTopLip, 0.6829473549475088F, 0.11222466790717915F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 25);
        this.Snout.setPos(0.0F, -0.2F, -0.3F);
        this.Snout.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 18, 18);
        this.RightArm.setPos(-1.8F, 2.2F, -1.7F);
        this.RightArm.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightArm, 0.20943951023931953F, 0.24434609527920614F, 0.0F);
        this.LeftBackLip1 = new ModelRenderer(this, 38, 16);
        this.LeftBackLip1.setPos(0.0F, -0.6F, 3.8F);
        this.LeftBackLip1.addBox(0.1F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(LeftBackLip1, 0.4098033003787853F, 0.13665927909957545F, 0.10471975511965977F);
        this.Tail = new ModelRenderer(this, 31, 10);
        this.Tail.setPos(0.0F, 0.5F, 2.4F);
        this.Tail.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.6981317007977318F, 0.0F, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 23, 25);
        this.LeftFoot.setPos(0.1F, -0.6F, 1.8F);
        this.LeftFoot.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFoot, -0.3490658503988659F, -0.08726646259971647F, 0.0F);
        this.Mouth = new ModelRenderer(this, 13, 17);
        this.Mouth.setPos(0.0F, 1.4F, -0.5F);
        this.Mouth.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.27314402127920984F, 0.0F, 0.0F);
        this.LeftBackLip2 = new ModelRenderer(this, 41, 10);
        this.LeftBackLip2.setPos(3.0F, 1.5F, 2.0F);
        this.LeftBackLip2.addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftBackLip2, -0.43022365395869955F, 0.6829473549475088F, -0.43022365395869955F);
        this.Shell = new ModelRenderer(this, 0, 0);
        this.Shell.setPos(0.0F, 20.4F, 0.0F);
        this.Shell.addBox(-3.5F, -1.9F, -2.5F, 7.0F, 3.0F, 5.0F, 0.0F, 0.1F, 0.0F);
        this.LeftLip = new ModelRenderer(this, 48, 8);
        this.LeftLip.setPos(3.5F, 1.0F, 0.0F);
        this.LeftLip.addBox(0.0F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLip, 0.0F, 0.0F, 0.9105382388075086F);
        this.RightBackLip2 = new ModelRenderer(this, 46, 10);
        this.RightBackLip2.setPos(-3.0F, 1.5F, 2.0F);
        this.RightBackLip2.addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightBackLip2, -0.43022365395869955F, -0.7285004590772052F, 0.43022365395869955F);
        this.RightTopLip = new ModelRenderer(this, 55, 23);
        this.RightTopLip.setPos(0.0F, 0.0F, -2.0F);
        this.RightTopLip.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightTopLip, 0.6829473549475088F, -0.11222466790717915F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 19);
        this.Head.setPos(0.0F, 0.2F, -4.5F);
        this.Head.addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.27314402127920984F, 0.0F, 0.0F);
        this.LeftForeArm = new ModelRenderer(this, 31, 19);
        this.LeftForeArm.setPos(0.0F, -1.0F, -3.0F);
        this.LeftForeArm.addBox(-0.9F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftForeArm, 0.9075712110370513F, 0.0F, 0.0F);
        this.RightBackLip1 = new ModelRenderer(this, 47, 16);
        this.RightBackLip1.setPos(0.0F, -0.6F, 3.8F);
        this.RightBackLip1.addBox(-3.1F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(RightBackLip1, 0.4098033003787853F, -0.13665927909957545F, -0.10471975511965977F);
        this.RightFoot = new ModelRenderer(this, 37, 28);
        this.RightFoot.setPos(-0.1F, -0.6F, 1.8F);
        this.RightFoot.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFoot, -0.3490658503988659F, 0.08726646259971647F, 0.0F);
        this.Belly = new ModelRenderer(this, 37, 31);
        this.Belly.setPos(0.0F, 0.9F, 0.0F);
        this.Belly.addBox(-2.5F, -1.0F, -4.0F, 5.0F, 2.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Belly, -0.03490658503988659F, 0.0F, 0.0F);
        this.RightLeg = new ModelRenderer(this, 28, 27);
        this.RightLeg.setPos(-2.0F, 2.6F, 2.1F);
        this.RightLeg.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg, -0.7853981633974483F, -0.17453292519943295F, 0.0F);
        this.SnoutFront = new ModelRenderer(this, 11, 21);
        this.SnoutFront.setPos(0.0F, -1.3F, -0.1F);
        this.SnoutFront.addBox(-0.6F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutFront, 0.13665927909957545F, 0.0F, 0.0F);
        this.RightFrontLip = new ModelRenderer(this, 46, 20);
        this.RightFrontLip.setPos(-3.1F, 1.7F, -2.0F);
        this.RightFrontLip.addBox(-1.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFrontLip, 0.3953170689188129F, -0.7285004590772052F, -0.13962634015954636F);
        this.LeftHand = new ModelRenderer(this, 34, 24);
        this.LeftHand.setPos(0.3F, 1.6F, -1.3F);
        this.LeftHand.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftHand, 0.17453292519943295F, 0.17453292519943295F, 0.0F);
        this.ShellBack = new ModelRenderer(this, 44, 0);
        this.ShellBack.setPos(0.0F, -2.0F, 2.5F);
        this.ShellBack.addBox(-3.0F, 0.1F, 0.0F, 6.0F, 3.0F, 3.0F, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(ShellBack, -0.3839724354387525F, 0.0F, 0.0F);
        this.RightHand = new ModelRenderer(this, 34, 24);
        this.RightHand.setPos(-0.3F, 1.6F, -1.3F);
        this.RightHand.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightHand, 0.17453292519943295F, -0.17453292519943295F, 0.0F);
        this.ShellFront = new ModelRenderer(this, 25, 0);
        this.ShellFront.setPos(0.0F, -2.0F, -2.5F);
        this.ShellFront.addBox(-3.0F, 0.2F, -3.0F, 6.0F, 3.0F, 3.0F, 0.0F, 0.2F, -0.1F);
        this.setRotateAngle(ShellFront, 0.3141592653589793F, 0.0F, 0.0F);
        this.RightForeArm = new ModelRenderer(this, 31, 19);
        this.RightForeArm.setPos(0.0F, -1.0F, -3.0F);
        this.RightForeArm.addBox(-1.1F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightForeArm, 0.9075712110370513F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 9, 26);
        this.Nose.setPos(0.0F, -1.0F, -1.2F);
        this.Nose.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.RightLip = new ModelRenderer(this, 46, 18);
        this.RightLip.setPos(-3.5F, 1.0F, 0.0F);
        this.RightLip.addBox(-1.0F, 0.0F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightLip, 0.0F, 0.0F, -0.9105382388075086F);
        this.LeftFrontLip = new ModelRenderer(this, 41, 20);
        this.LeftFrontLip.setPos(3.1F, 1.7F, -2.0F);
        this.LeftFrontLip.addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFrontLip, 0.3953170689188129F, 0.7285004590772052F, 0.13962634015954636F);
        this.Neck = new ModelRenderer(this, 0, 11);
        this.Neck.setPos(0.0F, 2.3F, -1.7F);
        this.Neck.addBox(-1.0F, -1.5F, -4.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.4211479338588457F, 0.0F, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 14, 26);
        this.LeftLeg.setPos(2.0F, 2.6F, 2.1F);
        this.LeftLeg.addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg, -0.7853981633974483F, 0.17453292519943295F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 18, 18);
        this.LeftArm.setPos(1.8F, 2.2F, -1.7F);
        this.LeftArm.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftArm, 0.20943951023931953F, -0.24434609527920614F, 0.0F);
        this.ShellFront.addChild(this.LeftTopLip);
        this.Head.addChild(this.Snout);
        this.ShellFront.addChild(this.RightArm);
        this.ShellBack.addChild(this.LeftBackLip1);
        this.ShellBack.addChild(this.Tail);
        this.LeftLeg.addChild(this.LeftFoot);
        this.Head.addChild(this.Mouth);
        this.ShellBack.addChild(this.LeftBackLip2);
        this.Shell.addChild(this.LeftLip);
        this.ShellBack.addChild(this.RightBackLip2);
        this.ShellFront.addChild(this.RightTopLip);
        this.Neck.addChild(this.Head);
        this.LeftArm.addChild(this.LeftForeArm);
        this.ShellBack.addChild(this.RightBackLip1);
        this.RightLeg.addChild(this.RightFoot);
        this.Shell.addChild(this.Belly);
        this.ShellBack.addChild(this.RightLeg);
        this.Snout.addChild(this.SnoutFront);
        this.ShellFront.addChild(this.RightFrontLip);
        this.LeftForeArm.addChild(this.LeftHand);
        this.Shell.addChild(this.ShellBack);
        this.RightForeArm.addChild(this.RightHand);
        this.Shell.addChild(this.ShellFront);
        this.RightArm.addChild(this.RightForeArm);
        this.Snout.addChild(this.Nose);
        this.Shell.addChild(this.RightLip);
        this.ShellFront.addChild(this.LeftFrontLip);
        this.ShellFront.addChild(this.Neck);
        this.ShellBack.addChild(this.LeftLeg);
        this.ShellFront.addChild(this.LeftArm);
        this.saveBase();
    }

    @Override
    public void setupAnim(PondSliderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
        this.Neck.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * 0.1F * limbSwingAmount - 0.42F;
        this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.1F) * degree * -0.1F * limbSwingAmount + 0.27F;
    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.loadBase();
        float speed = 10.0f;
        float degree = 2.0f;
        this.LeftArm.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.21F;
        this.LeftForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.9F;
        this.LeftHand.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.17F;
        this.LeftLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.78F;
        this.LeftFoot.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.35F;
        this.RightArm.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.21F;
        this.RightForeArm.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount + 0.9F;
        this.RightHand.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount + 0.17F;
        this.RightLeg.xRot = MathHelper.cos(limbSwing * speed * 0.2F) * degree * 1.0F * limbSwingAmount - 0.78F;
        this.RightFoot.xRot = MathHelper.cos(-2.0F + limbSwing * speed * 0.2F) * degree * -1.0F * limbSwingAmount - 0.35F;
        this.Neck.yRot = MathHelper.cos(1.0F + limbSwing * speed * 0.2F) * degree * -0.2F * limbSwingAmount;
        this.Head.yRot = MathHelper.cos(2.0F + limbSwing * speed * 0.2F) * degree * 0.2F * limbSwingAmount;
        this.Shell.y = MathHelper.cos(limbSwing * speed * 0.4F) * degree * 0.8F * limbSwingAmount + 20.4F;
    }
}
