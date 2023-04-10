package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.BoxTurtleModel;
import com.github.mnesikos.lilcritters.entity.BoxTurtleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BoxTurtleRenderer extends ZawaMobRenderer<BoxTurtleEntity, BoxTurtleModel> {
    public BoxTurtleRenderer(EntityRendererManager manager) {
        super(manager, new BoxTurtleModel(), 0.2F);
    }

    @Override
    protected void scale(BoxTurtleEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.6F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(BoxTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount + 10];
        for (int i = 0; i < 10; i++) {
            adultTextures[i * 2] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + "_male.png");
        }
        for (int i = 10; i < variantCount; i++)
            adultTextures[i + 10] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(BoxTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount + 10];
        for (int i = 0; i < 10; i++) {
            babyTextures[i * 2] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + "_female.png");
            babyTextures[i * 2 + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + "_male.png");
        }
        for (int i = 10; i < variantCount; i++)
            babyTextures[i + 10] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/box_turtle/box_turtle_" + (i + 1) + ".png");
    }

    @Override
    public ResourceLocation getTextureLocation(BoxTurtleEntity entity) {
        int variantCount = entity.getTotalVariants();
        int variant = entity.getVariant();
        if (variant >= variantCount) {
            return UNKNOWN_VARIANT;

        } else if (entity.isBaby()) {
            if (this.getBabyTexture() == null && (this.getBabyTextures() == null || this.getBabyTextures().length != variantCount + 10))
                this.setupBabyTextures(entity);

            if (this.getBabyTexture() != null) return this.getBabyTexture();
            else if (variant < 10) return this.getBabyTextures()[variant * 2 + entity.getGender().ordinal()];
            else return this.getBabyTextures()[variant + 10];

        } else {
            if (this.getAdultTextures() == null || this.getAdultTextures().length != variantCount + 10)
                this.setupAdultTextures(entity);

            if (variant < 10) return this.getAdultTextures()[variant * 2 + entity.getGender().ordinal()];
            else return this.getAdultTextures()[variant + 10];
        }
    }
}
