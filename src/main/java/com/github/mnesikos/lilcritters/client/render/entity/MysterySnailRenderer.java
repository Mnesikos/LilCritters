package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.MysterySnailModel;
import com.github.mnesikos.lilcritters.entity.MysterySnailEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MysterySnailRenderer extends ZawaMobRenderer<MysterySnailEntity, MysterySnailModel> {
    public MysterySnailRenderer(EntityRendererManager manager) {
        super(manager, new MysterySnailModel(), 0.3F);
    }

    @Override
    protected void scale(MysterySnailEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
