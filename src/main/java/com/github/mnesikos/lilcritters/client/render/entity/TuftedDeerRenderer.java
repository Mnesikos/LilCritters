package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.TuftedDeerModel;
import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.entity.base.ZawaBaseEntity;

public class TuftedDeerRenderer extends ZawaMobRenderer<TuftedDeerEntity, TuftedDeerModel> {
    private final TuftedDeerModel adultModel;
    private final TuftedDeerModel babyModel;

    public TuftedDeerRenderer(EntityRendererManager manager) {
        super(manager, new TuftedDeerModel.Adult(), 0.4F);
        adultModel = model;
        babyModel = new TuftedDeerModel.Child();
    }

    @Override
    public void render(TuftedDeerEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(TuftedDeerEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = (entity.getGender() == ZawaBaseEntity.Gender.FEMALE) ? 0.85F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(TuftedDeerEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount * 2];
        for (int i = 0; i < variantCount; i++) {
            adultTextures[i * 2] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_" + (i + 1) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_" + (i + 1) + "_male.png");
        }
    }

    @Override
    public void setupBabyTextures(TuftedDeerEntity entity) {
        babyTexture = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/tufted_deer/tufted_deer_baby.png");
    }

    @Override
    public ResourceLocation getTextureLocation(TuftedDeerEntity entity) {
        if (!entity.isBaby()) {
            int variantCount = entity.getTotalVariants();
            int variant = entity.getVariant();
            if (variant >= variantCount) {
                return UNKNOWN_VARIANT;
            } else {
                if (this.getAdultTextures() == null || this.getAdultTextures().length != variantCount * 2) {
                    this.setupAdultTextures(entity);
                }

                return this.getAdultTextures()[variant * 2 + entity.getGender().ordinal()];
            }
        } else {
            return super.getTextureLocation(entity);
        }
    }
}