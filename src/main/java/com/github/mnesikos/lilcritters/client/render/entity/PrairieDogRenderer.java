package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.PrairieDogModel;
import com.github.mnesikos.lilcritters.entity.PrairieDogEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class PrairieDogRenderer extends ZawaMobRenderer<PrairieDogEntity, PrairieDogModel> {
    private final PrairieDogModel baseModel;
    private final PrairieDogModel standingModel;

    public PrairieDogRenderer(EntityRendererProvider.Context context) {
        super(context, new PrairieDogModel(context.bakeLayer(LCModelLayers.PRAIRIE_DOG)), 0.2F);
        baseModel = adultModel;
        standingModel = new PrairieDogModel.Standing(context.bakeLayer(LCModelLayers.PRAIRIE_DOG_STANDING));
    }

    @Override
    protected void scale(PrairieDogEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void render(PrairieDogEntity entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
        if (!entity.isBaby()) adultModel = entity.getSitAmount(partialTicks) > 0.0F ? standingModel : baseModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getBabyTexture(PrairieDogEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/prairie_dog/prairie_dog_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(PrairieDogEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/prairie_dog/prairie_dog_" + (i + 1) + ".png");
    }
}
