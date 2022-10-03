package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.BandedPenguinModel;
import com.github.mnesikos.lilcritters.entity.BandedPenguinEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BandedPenguinRenderer extends ZawaMobRenderer<BandedPenguinEntity, BandedPenguinModel> {
    public BandedPenguinRenderer(EntityRendererManager manager) {
        super(manager, new BandedPenguinModel(), 0.2F);
    }

    @Override
    protected void scale(BandedPenguinEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.4F, 0.4F, 0.4F);
            matrixStack.translate(0.0F, 40.0F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.7F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.2F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(BandedPenguinEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/banded_penguin/banded_penguin_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(BandedPenguinEntity entity) {
        babyTexture = new ResourceLocation(Zawa.MOD_ID, "textures/entity/banded_penguin/banded_penguin_baby.png");
    }
}