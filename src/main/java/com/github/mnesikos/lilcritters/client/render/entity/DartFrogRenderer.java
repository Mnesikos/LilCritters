package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.SmallFrogModel;
import com.github.mnesikos.lilcritters.entity.DartFrogEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DartFrogRenderer extends ZawaMobRenderer<DartFrogEntity, ZawaFrogBaseModel<DartFrogEntity>> {
    public DartFrogRenderer(EntityRendererProvider.Context context) {
        super(context, new SmallFrogModel<>(context.bakeLayer(LCModelLayers.DART_FROG_ADULT)), new ZawaFrogBaseModel.Tadpole<>(context.bakeLayer(LCModelLayers.DART_FROG_CHILD)), 0.2F);
    }

    @Override
    protected void scale(DartFrogEntity entity, PoseStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
