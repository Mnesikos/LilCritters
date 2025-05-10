package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.MysterySnailModel;
import com.github.mnesikos.lilcritters.entity.MysterySnailEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MysterySnailRenderer extends ZawaMobRenderer<MysterySnailEntity, MysterySnailModel> {
    public MysterySnailRenderer(EntityRendererProvider.Context context) {
        super(context, new MysterySnailModel(context.bakeLayer(LCModelLayers.MYSTERY_SNAIL)), 0.3F);
    }

    @Override
    protected void scale(MysterySnailEntity entity, PoseStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
