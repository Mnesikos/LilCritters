package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.TreeMonitorModel;
import com.github.mnesikos.lilcritters.entity.TreeMonitorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeMonitorRenderer extends ZawaMobRenderer<TreeMonitorEntity, TreeMonitorModel> {
    public TreeMonitorRenderer(EntityRendererProvider.Context context) {
        super(context, new TreeMonitorModel(), 0.3F);
    }

    @Override
    protected void scale(TreeMonitorEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(TreeMonitorEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tree_monitor/tree_monitor_" + (i + 1) + ".png");
    }
}
