package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.SmallClawedOtterModel;
import com.github.mnesikos.lilcritters.entity.SmallClawedOtterEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SmallClawedOtterRenderer extends ZawaMobRenderer<SmallClawedOtterEntity, SmallClawedOtterModel> {
    public SmallClawedOtterRenderer(EntityRendererManager manager) {
        super(manager, new SmallClawedOtterModel(), 0.4F);
    }

    @Override
    protected void scale(SmallClawedOtterEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.6F, 0.6F, 0.6F);
            matrixStack.translate(0.0F, 16.8F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.6F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.12F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(SmallClawedOtterEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/small_clawed_otter/small_clawed_otter_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(SmallClawedOtterEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/small_clawed_otter/small_clawed_otter_" + (i + 1) + ".png");
    }
}
