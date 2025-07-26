package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.BurrowingOwlModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.BurrowingOwlEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BurrowingOwlRenderer extends ZawaMobRenderer<BurrowingOwlEntity, BurrowingOwlModel> {
    public BurrowingOwlRenderer(EntityRendererProvider.Context context) {
        super(context, new BurrowingOwlModel.Adult(context.bakeLayer(LCModelLayers.BURROWING_OWL_ADULT)),  new BurrowingOwlModel.Child(context.bakeLayer(LCModelLayers.BURROWING_OWL_CHILD)), 0.2F);
    }

    @Override
    protected void scale(BurrowingOwlEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
