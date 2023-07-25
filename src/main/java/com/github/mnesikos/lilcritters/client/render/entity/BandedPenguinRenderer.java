package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.BandedPenguinModel;
import com.github.mnesikos.lilcritters.entity.BandedPenguinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BandedPenguinRenderer extends ZawaMobRenderer<BandedPenguinEntity, BandedPenguinModel> {
    public BandedPenguinRenderer(EntityRendererManager manager) {
        super(manager, new BandedPenguinModel(), 0.2F);
    }

    @Override
    protected void scale(BandedPenguinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        matrixStack.translate(0.0F, -0.2F * scale, 0.0F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean hasBabyVariants(BandedPenguinEntity entity) {
        return false;
    }
}
