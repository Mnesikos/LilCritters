package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.SmallClawedOtterModel;
import com.github.mnesikos.lilcritters.entity.SmallClawedOtterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SmallClawedOtterRenderer extends ZawaMobRenderer<SmallClawedOtterEntity, SmallClawedOtterModel> {
    public SmallClawedOtterRenderer(EntityRendererManager manager) {
        super(manager, new SmallClawedOtterModel(), 0.4F);
    }

    @Override
    protected void scale(SmallClawedOtterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        matrixStack.translate(0.0F, -0.16F * scale, 0.0F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(SmallClawedOtterEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/small_clawed_otter/small_clawed_otter_" + (i + 1) + ".png");
    }
}
