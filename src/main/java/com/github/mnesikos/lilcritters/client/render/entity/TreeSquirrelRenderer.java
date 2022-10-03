package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.TreeSquirrelModel;
import com.github.mnesikos.lilcritters.entity.TreeSquirrelEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeSquirrelRenderer extends ZawaMobRenderer<TreeSquirrelEntity, TreeSquirrelModel> {
    public TreeSquirrelRenderer(EntityRendererManager manager) {
        super(manager, new TreeSquirrelModel(), 0.2F);
    }

    @Override
    protected void scale(TreeSquirrelEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.5F, 0.5F, 0.5F);
            matrixStack.translate(0.0F, 26.0F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.4F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.46F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(TreeSquirrelEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/tree_squirrel/tree_squirrel_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(TreeSquirrelEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/tree_squirrel/tree_squirrel_" + (i + 1) + ".png");
    }
}