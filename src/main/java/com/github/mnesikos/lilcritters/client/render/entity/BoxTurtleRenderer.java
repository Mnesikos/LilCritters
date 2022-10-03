package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.BoxTurtleModel;
import com.github.mnesikos.lilcritters.entity.BoxTurtleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BoxTurtleRenderer extends ZawaMobRenderer<BoxTurtleEntity, BoxTurtleModel> {
    public BoxTurtleRenderer(EntityRendererManager manager) {
        super(manager, new BoxTurtleModel(), 0.3F);
    }

    @Override
    protected void scale(BoxTurtleEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) {
            matrixStack.scale(0.7F, 0.7F, 0.7F);
            matrixStack.translate(0.0F, 9.6F * entity.getScale(), 0.0F);
        } else {
            float scale = 0.7F;
            matrixStack.scale(scale, scale, scale);
            matrixStack.translate(0.0F, -0.01F * scale, 0.0F);
        }
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(BoxTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(BoxTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(Zawa.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + ".png");
    }
}
