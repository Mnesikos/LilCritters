package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.TreeMonitorModel;
import com.github.mnesikos.lilcritters.entity.TreeMonitorEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeMonitorRenderer extends ZawaMobRenderer<TreeMonitorEntity, TreeMonitorModel> {
    public TreeMonitorRenderer(EntityRendererManager manager) {
        super(manager, new TreeMonitorModel(), 0.5F);
    }

    @Override
    protected void scale(TreeMonitorEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 1.0F;
        matrixStack.scale(scale, scale, scale);
//        matrixStack.translate(0.0F, -0.15F * scale, 0.0F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(TreeMonitorEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tree_monitor/tree_monitor_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TreeMonitorEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tree_monitor/tree_monitor_" + (i + 1) + ".png");
    }
}
