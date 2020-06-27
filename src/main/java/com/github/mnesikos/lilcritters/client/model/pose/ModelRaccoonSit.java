package com.github.mnesikos.lilcritters.client.model.pose;

import com.github.mnesikos.lilcritters.client.model.ModelRaccoon;

/**
 * Raccoon Sitting - Bolcko
 * Created using Tabula 7.1.0
 */
public class ModelRaccoonSit extends ModelRaccoon {

    public ModelRaccoonSit() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.neck.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.neck.addBox(-2.0F, -2.5F, -3.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(neck, -0.4363323129985824F, 0.0F, 0.0F);
        this.bellyLower.setRotationPoint(0.0F, 3.0F, 6.1F);
        this.bellyLower.addBox(-3.0F, -1.0F, -6.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(bellyLower, 0.13962634015954636F, 0.0F, 0.0F);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addBox(-2.0F, -2.0F, -1.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(tail4, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightEar.mirror = true;
        this.RightEar.setRotationPoint(-1.3F, -2.7F, 0.0F);
        this.RightEar.addBox(-2.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.17453292519943295F, -0.2617993877991494F);
        this.chestLower.setRotationPoint(0.0F, 2.5F, -3.5F);
        this.chestLower.addBox(-2.5F, -1.8F, 0.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(chestLower, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftCheek.setRotationPoint(0.0F, 0.95F, -2.0F);
        this.LeftCheek.addBox(0.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(LeftCheek, 0.0F, -0.4363323129985824F, -0.17453292519943295F);
        this.LeftFoot.setRotationPoint(0.01F, 2.0F, -1.0F);
        this.LeftFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftFoot, 0.6981317007977318F, 0.0F, 0.0F);
        this.Head.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.Head.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.9599310885968813F, 0.0F, 0.0F);
        this.LeftUpperLeg.setRotationPoint(-1.0F, 5.0F, -1.0F);
        this.LeftUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LeftUpperLeg, 1.3962634015954636F, 0.0F, 0.0F);
        this.LeftLeg.setRotationPoint(0.02F, 3.0F, 2.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LeftLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.LeftHand.setRotationPoint(0.01F, 3.8F, -1.0F);
        this.LeftHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(LeftHand, 2.8797932657906435F, 0.0F, 0.0F);
        this.tail3.setRotationPoint(0.0F, -0.3F, 3.5F);
        this.tail3.addBox(-3.0F, -2.5F, -1.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(tail3, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightCheek.mirror = true;
        this.RightCheek.setRotationPoint(0.0F, 0.95F, -2.0F);
        this.RightCheek.addBox(-4.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(RightCheek, 0.0F, 0.4363323129985824F, 0.17453292519943295F);
        this.Body.setRotationPoint(0.0F, 16.7F, -3.2F);
        this.Body.addBox(-3.0F, -3.5F, -4.0F, 6, 6, 8, 0.0F);
        this.setRotateAngle(Body, -0.40142572795869574F, 0.0F, 0.0F);
        this.LeftForearm.setRotationPoint(0.0F, 4.5F, 1.0F);
        this.LeftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LeftForearm, -1.0471975511965976F, 0.0F, 0.0F);
        this.LeftEar.setRotationPoint(1.3F, -2.7F, 0.0F);
        this.LeftEar.addBox(-1.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, -0.17453292519943295F, 0.2617993877991494F);
        this.Nose.setRotationPoint(0.0F, -2.1F, -2.5F);
        this.Nose.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Nose, 0.2617993877991494F, 0.0F, 0.0F);
        this.RightForearm.mirror = true;
        this.RightForearm.setRotationPoint(0.0F, 4.5F, 1.0F);
        this.RightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightForearm, -1.1344640137963142F, 0.0F, 0.0F);
        this.neckLower.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.neckLower.addBox(-1.5F, -2.0F, -0.5F, 3, 2, 6, 0.0F);
        this.setRotateAngle(neckLower, -0.22689280275926282F, 0.0F, 0.0F);
        this.RightBicep.mirror = true;
        this.RightBicep.setRotationPoint(-2.0F, -0.5F, -2.8F);
        this.RightBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RightBicep, 0.6981317007977318F, -0.3490658503988659F, 0.0F);
        this.Butt.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Butt.addBox(-3.5F, -4.0F, 0.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(Butt, -0.5235987755982988F, 0.0F, 0.0F);
        this.LeftBicep.setRotationPoint(2.0F, -0.5F, -2.8F);
        this.LeftBicep.addBox(-1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LeftBicep, 0.6981317007977318F, 0.3490658503988659F, 0.0F);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.tail2.addBox(-2.5F, -2.5F, -1.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(tail2, 0.6841690667817772F, 0.0F, 0.0F);
        this.RightLeg.mirror = true;
        this.RightLeg.setRotationPoint(-0.02F, 3.0F, 2.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RightLeg, -0.9599310885968813F, 0.0F, 0.0F);
        this.NoseEnd.setRotationPoint(0.0F, 0.4F, -0.1F);
        this.NoseEnd.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.RightHand.mirror = true;
        this.RightHand.setRotationPoint(-0.01F, 3.8F, -1.0F);
        this.RightHand.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightHand, 2.8797932657906435F, 0.0F, 0.0F);
        this.tail1.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.tail1.addBox(-3.0F, -3.0F, -1.5F, 6, 6, 3, 0.0F);
        this.setRotateAngle(tail1, 0.45378560551852565F, 0.0F, 0.0F);
        this.tail5.setRotationPoint(0.0F, 0.2F, 2.0F);
        this.tail5.addBox(-1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail5, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightUpperLeg.mirror = true;
        this.RightUpperLeg.setRotationPoint(1.0F, 5.0F, -1.0F);
        this.RightUpperLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RightUpperLeg, 1.3962634015954636F, 0.0F, 0.0F);
        this.LeftThigh.setRotationPoint(3.7F, -0.5F, 4.5F);
        this.LeftThigh.addBox(-2.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LeftThigh, -0.17453292519943295F, -0.08726646259971647F, -0.08726646259971647F);
        this.RightThigh.mirror = true;
        this.RightThigh.setRotationPoint(-3.7F, -0.5F, 4.5F);
        this.RightThigh.addBox(-0.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RightThigh, -0.17453292519943295F, 0.08726646259971647F, 0.08726646259971647F);
        this.Snout.setRotationPoint(0.0F, 1.6F, -2.5F);
        this.Snout.addBox(-1.5F, -2.0F, -2.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.RightFoot.mirror = true;
        this.RightFoot.setRotationPoint(-0.01F, 2.0F, -1.0F);
        this.RightFoot.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(RightFoot, 0.6981317007977318F, 0.0F, 0.0F);
        this.Chin.setRotationPoint(0.0F, -0.2F, -0.8F);
        this.Chin.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Chin, -0.2617993877991494F, 0.0F, 0.0F);
        this.Body.addChild(this.neck);
        this.Butt.addChild(this.bellyLower);
        this.tail3.addChild(this.tail4);
        this.Head.addChild(this.RightEar);
        this.Body.addChild(this.chestLower);
        this.Head.addChild(this.LeftCheek);
        this.LeftLeg.addChild(this.LeftFoot);
        this.neck.addChild(this.Head);
        this.LeftThigh.addChild(this.LeftUpperLeg);
        this.LeftUpperLeg.addChild(this.LeftLeg);
        this.LeftForearm.addChild(this.LeftHand);
        this.tail2.addChild(this.tail3);
        this.Head.addChild(this.RightCheek);
        this.LeftBicep.addChild(this.LeftForearm);
        this.Head.addChild(this.LeftEar);
        this.Snout.addChild(this.Nose);
        this.RightBicep.addChild(this.RightForearm);
        this.neck.addChild(this.neckLower);
        this.Body.addChild(this.RightBicep);
        this.Body.addChild(this.Butt);
        this.Body.addChild(this.LeftBicep);
        this.tail1.addChild(this.tail2);
        this.RightUpperLeg.addChild(this.RightLeg);
        this.Nose.addChild(this.NoseEnd);
        this.RightForearm.addChild(this.RightHand);
        this.Butt.addChild(this.tail1);
        this.tail4.addChild(this.tail5);
        this.RightThigh.addChild(this.RightUpperLeg);
        this.Butt.addChild(this.LeftThigh);
        this.Butt.addChild(this.RightThigh);
        this.Head.addChild(this.Snout);
        this.RightLeg.addChild(this.RightFoot);
        this.Snout.addChild(this.Chin);
    }
}
