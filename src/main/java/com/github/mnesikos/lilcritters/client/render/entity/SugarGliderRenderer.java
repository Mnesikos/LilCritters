package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.SugarGliderModel;
import com.github.mnesikos.lilcritters.entity.SugarGliderEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class SugarGliderRenderer extends ZawaMobRenderer<SugarGliderEntity, SugarGliderModel> {
    public SugarGliderRenderer(EntityRendererProvider.Context context) {
        super(context, new SugarGliderModel.Adult(context.bakeLayer(LCModelLayers.SUGAR_GLIDER)), 0.3F);
        this.flyingModel = new SugarGliderModel.Gliding(context.bakeLayer(LCModelLayers.SUGAR_GLIDER_GLIDING));
    }

    @Override
    protected void scale(SugarGliderEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(SugarGliderEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/sugar_glider/sugar_glider_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];

    }

    @Override
    public void setupBabyTextures(SugarGliderEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/sugar_glider/sugar_glider_" + (i + 1) + ".png");
    }
}
