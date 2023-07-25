package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.TreeSquirrelModel;
import com.github.mnesikos.lilcritters.entity.TreeSquirrelEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TreeSquirrelRenderer extends ZawaMobRenderer<TreeSquirrelEntity, TreeSquirrelModel> {
    public TreeSquirrelRenderer(EntityRendererManager manager) {
        super(manager, new TreeSquirrelModel(), 0.2F);
    }

    @Override
    protected void scale(TreeSquirrelEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.2F : 0.4F;
        matrixStack.scale(scale, scale, scale);
        matrixStack.translate(0.0F, -0.46F * scale, 0.0F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(TreeSquirrelEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tree_squirrel/tree_squirrel_" + (i + 1) + ".png");
    }
}
