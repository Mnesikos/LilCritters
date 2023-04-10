package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.PondSliderModel;
import com.github.mnesikos.lilcritters.entity.PondSliderEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PondSliderRenderer extends ZawaMobRenderer<PondSliderEntity, PondSliderModel> {
    public PondSliderRenderer(EntityRendererManager manager) {
        super(manager, new PondSliderModel(), 0.3F);
    }

    @Override
    protected void scale(PondSliderEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(PondSliderEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/pond_slider/pond_slider_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(PondSliderEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/pond_slider/pond_slider_" + (i + 1) + ".png");
    }
}
