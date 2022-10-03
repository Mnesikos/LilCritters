package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.RaccoonModel;
import com.github.mnesikos.lilcritters.entity.RaccoonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RaccoonRenderer extends ZawaMobRenderer<RaccoonEntity, RaccoonModel> {
    public RaccoonRenderer(EntityRendererManager manager) {
        super(manager, new RaccoonModel(), 0.5F);
    }

    @Override
    protected void scale(RaccoonEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.6F, 0.6F, 0.6F);
            matrixStack.translate(0.0F, 17.0F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.8F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.1F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(RaccoonEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/raccoon/raccoon_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(RaccoonEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/raccoon/raccoon_" + (i + 1) + ".png");
    }
}