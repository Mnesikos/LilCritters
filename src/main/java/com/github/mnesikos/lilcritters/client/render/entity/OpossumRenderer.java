package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.OpossumModel;
import com.github.mnesikos.lilcritters.entity.OpossumEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class OpossumRenderer extends ZawaMobRenderer<OpossumEntity, OpossumModel> {
    private final OpossumModel adultModel;
    private final OpossumModel babyModel;

    public OpossumRenderer(EntityRendererManager manager) {
        super(manager, new OpossumModel.Adult(), 0.4F);
        adultModel = model;
        babyModel = new OpossumModel.Child();
    }

    @Override
    public void render(OpossumEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(OpossumEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.7F, 0.7F, 0.7F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(OpossumEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/opossum/opossum_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(OpossumEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/opossum/opossum_baby_" + (i + 1) + ".png");
    }
}
