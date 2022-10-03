package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.TuftedDeerModel;
import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TuftedDeerRenderer extends ZawaMobRenderer<TuftedDeerEntity, TuftedDeerModel> {
    public TuftedDeerRenderer(EntityRendererManager manager) {
        super(manager, new TuftedDeerModel(), 0.4F);
    }

    @Override
    protected void scale(TuftedDeerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.6F, 0.6F, 0.6F);
            matrixStack.translate(0.0F, 20.0F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.5F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.6F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(TuftedDeerEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount * 2];
        for (int i = 0; i < variantCount; i++) {
            adultTextures[i * 2] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_" + (i + 1) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_" + (i + 1) + "_male.png");
        }
    }

    @Override
    public void setupBabyTextures(TuftedDeerEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_baby_" + (i + 1) + ".png");
    }
}