package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.BeardedDragonModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.BeardedDragonEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class BeardedDragonRenderer extends ZawaMobRenderer<BeardedDragonEntity, BeardedDragonModel> {
    public BeardedDragonRenderer(EntityRendererProvider.Context context) {
        super(context, new BeardedDragonModel(context.bakeLayer(LCModelLayers.BEARDED_DRAGON)), 0.3F);
    }

    @Override
    protected void scale(BeardedDragonEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.3F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(BeardedDragonEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/bearded_dragon/bearded_dragon_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(BeardedDragonEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/bearded_dragon/bearded_dragon_" + (i + 1) + ".png");
    }
}
