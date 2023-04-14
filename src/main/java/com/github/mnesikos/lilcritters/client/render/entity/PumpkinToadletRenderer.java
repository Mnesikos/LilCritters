package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.SmallFrogModel;
import com.github.mnesikos.lilcritters.entity.PumpkinToadletEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PumpkinToadletRenderer extends ZawaMobRenderer<PumpkinToadletEntity, SmallFrogModel.PumpkinToadlet> {
    public PumpkinToadletRenderer(EntityRendererManager manager) {
        super(manager, new SmallFrogModel.PumpkinToadlet(), 0.1F);
    }

    @Override
    protected void scale(PumpkinToadletEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.2F : 0.4F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(PumpkinToadletEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/pumpkin_toadlet/pumpkin_toadlet_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(PumpkinToadletEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/pumpkin_toadlet/pumpkin_toadlet_" + (i + 1) + ".png");
    }
}