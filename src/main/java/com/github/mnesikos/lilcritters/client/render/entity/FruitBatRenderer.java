package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.FruitBatModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.FruitBatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class FruitBatRenderer extends ZawaMobRenderer<FruitBatEntity, FruitBatModel> {
    private final FruitBatModel baseModel;
    private final FruitBatModel restingModel;

    public FruitBatRenderer(EntityRendererProvider.Context context) {
        super(context, new FruitBatModel.Adult(context.bakeLayer(LCModelLayers.FRUIT_BAT)), 0.3F);
        this.baseModel = adultModel;
        this.restingModel = new FruitBatModel.Resting(context.bakeLayer(LCModelLayers.FRUIT_BAT_RESTING));
    }

    @Override
    protected void scale(FruitBatEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void render(FruitBatEntity entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
//        if (entity.isResting()) model = restingModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getBabyTexture(FruitBatEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/fruit_bat/fruit_bat_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(FruitBatEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/fruit_bat/fruit_bat_" + (i + 1) + ".png");
    }
}
