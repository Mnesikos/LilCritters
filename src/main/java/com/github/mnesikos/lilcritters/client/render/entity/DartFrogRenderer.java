package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.SmallFrogModel;
import com.github.mnesikos.lilcritters.entity.DartFrogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DartFrogRenderer extends ZawaMobRenderer<DartFrogEntity, ZawaFrogBaseModel<DartFrogEntity>> {
    public DartFrogRenderer(EntityRendererManager manager) {
        super(manager, new SmallFrogModel<>(), new ZawaFrogBaseModel.Tadpole<>(), 0.2F);
    }

    @Override
    protected void scale(DartFrogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
