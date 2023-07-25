package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.SmallFrogModel;
import com.github.mnesikos.lilcritters.entity.DartFrogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DartFrogRenderer extends ZawaMobRenderer<DartFrogEntity, SmallFrogModel.DartFrog> {
    public DartFrogRenderer(EntityRendererManager manager) {
        super(manager, new SmallFrogModel.DartFrog(), 0.2F);
    }

    @Override
    protected void scale(DartFrogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(DartFrogEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/dart_frog/dart_frog_" + (i + 1) + ".png");
    }
}
