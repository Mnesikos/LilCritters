package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.SnappingTurtleModel;
import com.github.mnesikos.lilcritters.entity.SnappingTurtleEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class SnappingTurtleRenderer extends ZawaMobRenderer<SnappingTurtleEntity, SnappingTurtleModel> {
    public SnappingTurtleRenderer(EntityRendererProvider.Context context) {
        super(context, new SnappingTurtleModel(context.bakeLayer(LCModelLayers.SNAPPING_TURTLE)), 0.4F);
    }

    @Override
    protected void scale(SnappingTurtleEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(SnappingTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/snapping_turtle/snapping_turtle_" + (i + 1) + ".png");
    }
}
