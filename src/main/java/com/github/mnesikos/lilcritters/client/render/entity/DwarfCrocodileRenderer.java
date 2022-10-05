package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.DwarfCrocodileModel;
import com.github.mnesikos.lilcritters.entity.DwarfCrocodileEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class DwarfCrocodileRenderer extends ZawaMobRenderer<DwarfCrocodileEntity, DwarfCrocodileModel> {
    public DwarfCrocodileRenderer(EntityRendererManager manager) {
        super(manager, new DwarfCrocodileModel(), 0.8F);
    }

    @Override
    protected void scale(DwarfCrocodileEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(DwarfCrocodileEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/dwarf_crocodile/dwarf_crocodile_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(DwarfCrocodileEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/dwarf_crocodile/dwarf_crocodile_" + (i + 1) + ".png");
    }
}
