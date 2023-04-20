package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.entity.DartFrogEntity;
import com.github.mnesikos.lilcritters.entity.PumpkinToadletEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.renderer.entity.model.ZawaBaseModel;

public class SmallFrogModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelRenderer Body;
    public ModelRenderer Hips;
    public ModelRenderer Head;
    public ModelRenderer ArmLeft;
    public ModelRenderer ArmRight;
    public ModelRenderer ThighLeft;
    public ModelRenderer ThighRight;
    public ModelRenderer LegLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer LegRight;
    public ModelRenderer FootRight;
    public ModelRenderer Forehead;
    public ModelRenderer Snout;
    public ModelRenderer HeadUnder;
    public ModelRenderer EyeLeft;
    public ModelRenderer EyeRight;
    public ModelRenderer SnoutLeft;
    public ModelRenderer SnoutRight;
    public ModelRenderer Mouth;
    public ModelRenderer ForearmLeft;
    public ModelRenderer HandLeft;
    public ModelRenderer ForearmRight;
    public ModelRenderer HandRight;
    private Iterable<ModelRenderer> parts;

    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public SmallFrogModel() {
        this.texWidth = 24;
        this.texHeight = 16;
        this.ArmRight = new ModelRenderer(this, 0, 11);
        this.ArmRight.mirror = true;
        this.ArmRight.setPos(-1.5F, 0.3F, -2.0F);
        this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ArmRight, 1.3613568165555772F, -0.6457718232379019F, 0.0F);
        this.ThighLeft = new ModelRenderer(this, 16, 4);
        this.ThighLeft.setPos(1.3F, 0.0F, 1.3F);
        this.ThighLeft.addBox(-0.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ThighLeft, 0.0F, 1.0471975511965976F, 0.0F);
        this.Forehead = new ModelRenderer(this, 10, 5);
        this.Forehead.setPos(0.0F, -0.7F, -0.05F);
        this.Forehead.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Forehead, -0.15707963267948966F, 0.0F, 0.0F);
        this.ThighRight = new ModelRenderer(this, 16, 4);
        this.ThighRight.mirror = true;
        this.ThighRight.setPos(-1.3F, 0.0F, 1.3F);
        this.ThighRight.addBox(-2.5F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ThighRight, 0.0F, -1.0471975511965976F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 5);
        this.Head.setPos(0.0F, -0.8F, -1.7F);
        this.Head.addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.5585053606381855F, 0.0F, 0.0F);
        this.ForearmLeft = new ModelRenderer(this, 4, 11);
        this.ForearmLeft.mirror = true;
        this.ForearmLeft.setPos(-0.2F, 1.8F, -0.5F);
        this.ForearmLeft.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmLeft, 1.1344640137963142F, -0.08726646259971647F, 0.22689280275926282F);
        this.ArmLeft = new ModelRenderer(this, 0, 11);
        this.ArmLeft.mirror = true;
        this.ArmLeft.setPos(1.5F, 0.3F, -2.0F);
        this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ArmLeft, 1.3613568165555772F, 0.6457718232379019F, 0.0F);
        this.LegRight = new ModelRenderer(this, 18, 6);
        this.LegRight.mirror = true;
        this.LegRight.setPos(-2.0F, 0.1F, 0.5F);
        this.LegRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegRight, 0.0F, -0.45378560551852565F, 0.0F);
        this.EyeRight = new ModelRenderer(this, 9, 0);
        this.EyeRight.mirror = true;
        this.EyeRight.setPos(-1.0F, 0.3F, -2.0F);
        this.EyeRight.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(EyeRight, -0.17453292519943295F, -0.5585053606381855F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.mirror = true;
        this.Body.setPos(0.0F, 22.5F, 1.0F);
        this.Body.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Body, -0.40142572795869574F, 0.0F, 0.0F);
        this.ForearmRight = new ModelRenderer(this, 4, 11);
        this.ForearmRight.mirror = true;
        this.ForearmRight.setPos(0.2F, 1.8F, -0.5F);
        this.ForearmRight.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ForearmRight, 1.1344640137963142F, 0.08726646259971647F, -0.22689280275926282F);
        this.SnoutRight = new ModelRenderer(this, 6, 8);
        this.SnoutRight.mirror = true;
        this.SnoutRight.setPos(-1.0F, 0.02F, -0.8F);
        this.SnoutRight.addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutRight, 0.0F, -0.41887902047863906F, 0.0F);
        this.FootLeft = new ModelRenderer(this, 16, 8);
        this.FootLeft.setPos(-2.0F, 0.0F, -0.5F);
        this.FootLeft.addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootLeft, 0.0F, -0.08726646259971647F, 0.5410520681182421F);
        this.Mouth = new ModelRenderer(this, 12, 11);
        this.Mouth.setPos(0.0F, 0.0F, -1.4F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Mouth, -0.03490658503988659F, 0.0F, 0.0F);
        this.LegLeft = new ModelRenderer(this, 18, 6);
        this.LegLeft.setPos(2.0F, 0.1F, 0.5F);
        this.LegLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegLeft, 0.0F, 0.45378560551852565F, 0.0F);
        this.Hips = new ModelRenderer(this, 12, 0);
        this.Hips.setPos(0.0F, -0.5F, 0.5F);
        this.Hips.addBox(-1.5F, -0.5F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.2792526803190927F, 0.0F, 0.0F);
        this.SnoutLeft = new ModelRenderer(this, 6, 8);
        this.SnoutLeft.setPos(1.0F, 0.02F, -0.8F);
        this.SnoutLeft.addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(SnoutLeft, 0.0F, 0.41887902047863906F, 0.0F);
        this.FootRight = new ModelRenderer(this, 16, 8);
        this.FootRight.mirror = true;
        this.FootRight.setPos(2.0F, 0.0F, -0.5F);
        this.FootRight.addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FootRight, 0.0F, 0.08726646259971647F, -0.5410520681182421F);
        this.Snout = new ModelRenderer(this, 0, 8);
        this.Snout.setPos(0.0F, 0.0F, -2.0F);
        this.Snout.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(Snout, -0.17453292519943295F, 0.0F, 0.0F);
        this.EyeLeft = new ModelRenderer(this, 9, 0);
        this.EyeLeft.setPos(0.9F, 0.3F, -2.0F);
        this.EyeLeft.addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(EyeLeft, -0.17453292519943295F, 0.5585053606381855F, 0.0F);
        this.HandLeft = new ModelRenderer(this, 8, 11);
        this.HandLeft.mirror = true;
        this.HandLeft.setPos(0.0F, -1.5F, 0.7F);
        this.HandLeft.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(HandLeft, -0.593411945678072F, 0.0F, 0.0F);
        this.HeadUnder = new ModelRenderer(this, 8, 8);
        this.HeadUnder.setPos(0.0F, 0.5F, -0.57F);
        this.HeadUnder.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HeadUnder, -0.22689280275926282F, 0.0F, 0.0F);
        this.HandRight = new ModelRenderer(this, 8, 11);
        this.HandRight.mirror = true;
        this.HandRight.setPos(0.0F, -1.5F, 0.7F);
        this.HandRight.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(HandRight, -0.593411945678072F, 0.0F, 0.0F);
        this.Body.addChild(this.ArmRight);
        this.Hips.addChild(this.ThighLeft);
        this.Head.addChild(this.Forehead);
        this.Hips.addChild(this.ThighRight);
        this.Body.addChild(this.Head);
        this.ArmLeft.addChild(this.ForearmLeft);
        this.Body.addChild(this.ArmLeft);
        this.ThighRight.addChild(this.LegRight);
        this.Forehead.addChild(this.EyeRight);
        this.ArmRight.addChild(this.ForearmRight);
        this.Snout.addChild(this.SnoutRight);
        this.LegLeft.addChild(this.FootLeft);
        this.HeadUnder.addChild(this.Mouth);
        this.ThighLeft.addChild(this.LegLeft);
        this.Body.addChild(this.Hips);
        this.Snout.addChild(this.SnoutLeft);
        this.LegRight.addChild(this.FootRight);
        this.Head.addChild(this.Snout);
        this.Forehead.addChild(this.EyeLeft);
        this.ForearmLeft.addChild(this.HandLeft);
        this.Head.addChild(this.HeadUnder);
        this.ForearmRight.addChild(this.HandRight);
        this.saveBase();
    }

    @Override
    public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.56F;
    }

    @Override
    public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    public static class PumpkinToadlet extends SmallFrogModel<PumpkinToadletEntity> {
        public PumpkinToadlet() {
            super();
        }
    }

    public static class DartFrog extends SmallFrogModel<DartFrogEntity> {
        public DartFrog() {
            super();
        }
    }
}
