package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.AmericanBadgerModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.AmericanBadgerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AmericanBadgerRenderer extends ZawaMobRenderer<AmericanBadgerEntity, AmericanBadgerModel> {
    public AmericanBadgerRenderer(EntityRendererProvider.Context context) {
        super(context, new AmericanBadgerModel(context.bakeLayer(LCModelLayers.AMERICAN_BADGER)), 0.5F);
    }

    @Override
    protected void scale(AmericanBadgerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(AmericanBadgerEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/american_badger/american_badger_" + (i + 1) + ".png");
    }
}
