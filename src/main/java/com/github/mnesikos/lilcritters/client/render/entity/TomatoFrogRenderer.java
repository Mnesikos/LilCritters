package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.TomatoFrogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TomatoFrogRenderer extends ZawaMobRenderer<TomatoFrogEntity, LargeFrogModel.TomatoFrog> {
    public TomatoFrogRenderer(EntityRendererManager manager) {
        super(manager, new LargeFrogModel.TomatoFrog(), 0.2F);
    }

    @Override
    protected void scale(TomatoFrogEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(TomatoFrogEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tomato_frog/tomato_frog_" + (i + 1) + ".png");
    }
}
