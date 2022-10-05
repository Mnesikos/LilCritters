package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.SkunkModel;
import com.github.mnesikos.lilcritters.entity.SkunkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SkunkRenderer extends ZawaMobRenderer<SkunkEntity, SkunkModel> {
    public SkunkRenderer(EntityRendererManager manager) {
        super(manager, new SkunkModel(), 0.4F);
    }

    @Override
    protected void scale(SkunkEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.2F : 0.4F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(SkunkEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/skunk/skunk_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(SkunkEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/skunk/skunk_" + (i + 1) + ".png");
    }
}
