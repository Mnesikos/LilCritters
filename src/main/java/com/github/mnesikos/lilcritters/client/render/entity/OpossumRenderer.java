package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.OpossumModel;
import com.github.mnesikos.lilcritters.entity.OpossumEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OpossumRenderer extends ZawaMobRenderer<OpossumEntity, OpossumModel> {
    public OpossumRenderer(EntityRendererProvider manager) {
        super(manager, new OpossumModel.Adult(), new OpossumModel.Child(), 0.4F);
    }

    @Override
    protected void scale(OpossumEntity entity, PoseStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.7F, 0.7F, 0.7F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
