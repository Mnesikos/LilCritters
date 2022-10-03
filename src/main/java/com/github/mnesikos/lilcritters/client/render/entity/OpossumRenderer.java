package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.OpossumModel;
import com.github.mnesikos.lilcritters.entity.OpossumEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OpossumRenderer extends ZawaMobRenderer<OpossumEntity, OpossumModel> {
    public OpossumRenderer(EntityRendererManager manager) {
        super(manager, new OpossumModel(), 0.4F);
    }

    @Override
    protected void scale(OpossumEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.5F, 0.5F, 0.5F);
            matrixStack.translate(0.0F, 26.0F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.5F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.24F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(OpossumEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/opossum/opossum_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(OpossumEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/opossum/opossum_" + (i + 1) + ".png");
    }
}