package com.github.mnesikos.lilcritters.client.model.pose;

import com.github.mnesikos.lilcritters.client.model.ModelTreeSquirrel;

/**
 * Tree Squirrel Sleep - Mnesikos
 * Created using Tabula 7.1.0
 */
public class ModelTreeSquirrelSleep extends ModelTreeSquirrel {

    public ModelTreeSquirrelSleep() {
        this.textureWidth = 96;
        this.textureHeight = 64;
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail5.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(tail5, -0.10471975511965977F, 0.0F, 0.0F);
        this.rightThigh.mirror = true;
        this.rightThigh.setRotationPoint(-2.5F, 3.5F, 5.8F);
        this.rightThigh.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(rightThigh, -1.6755160819145563F, 0.3490658503988659F, -0.06981317007977318F);
        this.rightEar.mirror = true;
        this.rightEar.setRotationPoint(-1.5F, -1.4F, -1.5F);
        this.rightEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightEar, 0.03490658503988659F, -0.2792526803190927F, 0.0F);
        this.tail6.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.tail6.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(tail6, -0.13962634015954636F, 0.0F, 0.0F);
        this.rightHand.mirror = true;
        this.rightHand.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.rightHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rightHand, 1.6406094968746698F, 0.0F, -0.03490658503988659F);
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(-0.01F, 5.2F, 0.5F);
        this.rightFoot.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.3141592653589793F, -0.10471975511965977F, 0.0F);
        this.butt.setRotationPoint(0.0F, -3.5F, 4.0F);
        this.butt.addBox(-3.5F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(butt, -0.13962634015954636F, 0.0F, 0.0F);
        this.nose.setRotationPoint(0.0F, -0.6F, -0.1F);
        this.nose.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(nose, 0.13962634015954636F, 0.0F, 0.0F);
        this.tail1.setRotationPoint(0.0F, 2.1F, 6.2F);
        this.tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(tail1, -0.41887902047863906F, 0.0F, 0.0F);
        this.leftBicep.setRotationPoint(2.0F, -1.0F, -1.5F);
        this.leftBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftBicep, -0.9075712110370513F, -0.06981317007977318F, -0.06981317007977318F);
        this.snout.setRotationPoint(0.0F, -1.1F, -3.9F);
        this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(snout, 0.22689280275926282F, 0.0F, 0.0F);
        this.leftThigh.setRotationPoint(2.5F, 3.5F, 5.8F);
        this.leftThigh.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(leftThigh, -1.6755160819145563F, -0.3490658503988659F, 0.06981317007977318F);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(tail3, 0.20943951023931953F, 0.0F, 0.0F);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail4.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(tail4, -0.10471975511965977F, 0.0F, 0.0F);
        this.leftHand.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.leftHand.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(leftHand, 1.6406094968746698F, 0.0F, 0.20943951023931953F);
        this.tail2.setRotationPoint(0.0F, 0.2F, 3.0F);
        this.tail2.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(tail2, 0.2792526803190927F, 0.0F, 0.0F);
        this.rightTuft.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.rightTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.leftForearm.setRotationPoint(0.0F, 5.0F, 1.3F);
        this.leftForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftForearm, -0.7853981633974483F, 0.13962634015954636F, 0.20943951023931953F);
        this.rightForearm.mirror = true;
        this.rightForearm.setRotationPoint(0.0F, 5.0F, 1.3F);
        this.rightForearm.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightForearm, -0.7853981633974483F, -0.13962634015954636F, -0.20943951023931953F);
        this.rightBicep.mirror = true;
        this.rightBicep.setRotationPoint(-2.0F, -1.0F, -1.5F);
        this.rightBicep.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightBicep, -0.9075712110370513F, 0.06981317007977318F, 0.06981317007977318F);
        this.head.setRotationPoint(0.0F, -0.3F, -3.0F);
        this.head.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head, 0.2617993877991494F, 0.0F, 0.13962634015954636F);
        this.leftFoot.setRotationPoint(-0.01F, 5.2F, 0.5F);
        this.leftFoot.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.3141592653589793F, 0.10471975511965977F, 0.0F);
        this.body.setRotationPoint(0.0F, 22.1F, -1.5F);
        this.body.addBox(-3.0F, -3.5F, -4.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(body, 0.06981317007977318F, 0.0F, 0.0F);
        this.lowerChest.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.lowerChest.addBox(-2.0F, -2.0F, -5.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(lowerChest, -0.4886921905584123F, 0.0F, 0.0F);
        this.leftEar.setRotationPoint(1.5F, -1.4F, -1.5F);
        this.leftEar.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftEar, 0.03490658503988659F, 0.2792526803190927F, 0.0F);
        this.neck.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(neck, -0.017453292519943295F, 0.0F, 0.06981317007977318F);
        this.leftTuft.mirror = true;
        this.leftTuft.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.leftTuft.addBox(0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F);
        this.rightLeg.mirror = true;
        this.rightLeg.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.rightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rightLeg, 1.3962634015954636F, -0.03490658503988659F, -0.20943951023931953F);
        this.leftLeg.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.leftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(leftLeg, 1.3962634015954636F, 0.03490658503988659F, 0.20943951023931953F);
        this.chin.setRotationPoint(0.0F, 2.0F, -0.4F);
        this.chin.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(chin, -0.3490658503988659F, 0.0F, 0.0F);
        this.tail4.addChild(this.tail5);
        this.butt.addChild(this.rightThigh);
        this.head.addChild(this.rightEar);
        this.tail5.addChild(this.tail6);
        this.rightForearm.addChild(this.rightHand);
        this.rightLeg.addChild(this.rightFoot);
        this.body.addChild(this.butt);
        this.snout.addChild(this.nose);
        this.butt.addChild(this.tail1);
        this.body.addChild(this.leftBicep);
        this.head.addChild(this.snout);
        this.butt.addChild(this.leftThigh);
        this.tail2.addChild(this.tail3);
        this.tail3.addChild(this.tail4);
        this.leftForearm.addChild(this.leftHand);
        this.tail1.addChild(this.tail2);
        this.rightEar.addChild(this.rightTuft);
        this.leftBicep.addChild(this.leftForearm);
        this.rightBicep.addChild(this.rightForearm);
        this.body.addChild(this.rightBicep);
        this.neck.addChild(this.head);
        this.leftLeg.addChild(this.leftFoot);
        this.neck.addChild(this.lowerChest);
        this.head.addChild(this.leftEar);
        this.body.addChild(this.neck);
        this.leftEar.addChild(this.leftTuft);
        this.rightThigh.addChild(this.rightLeg);
        this.leftThigh.addChild(this.leftLeg);
        this.snout.addChild(this.chin);
    }
}
