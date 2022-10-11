package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.CapybaraModel;
import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.entity.base.ZawaBaseEntity;

public class CapybaraRenderer extends ZawaMobRenderer<CapybaraEntity, CapybaraModel> {
    private final CapybaraModel adultModel;
    private final CapybaraModel babyModel;

    public CapybaraRenderer(EntityRendererManager manager) {
        super(manager, new CapybaraModel.Adult(), 0.4F);
        adultModel = model;
        babyModel = new CapybaraModel.Child();
    }

    @Override
    public void render(CapybaraEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(CapybaraEntity entity, MatrixStack matrixStack, float partialTickTime) {
//        matrixStack.scale(0.9F, 0.9F, 0.9F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(CapybaraEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/capybara/capybara_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(CapybaraEntity entity) {
        babyTexture = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/capybara/capybara_baby.png");
    }
}