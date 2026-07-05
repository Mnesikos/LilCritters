package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.DwarfCrocodileModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.DwarfCrocodileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class DwarfCrocodileRenderer extends ZawaMobRenderer<DwarfCrocodileEntity, DwarfCrocodileModel> {
    public DwarfCrocodileRenderer(EntityRendererProvider.Context context) {
        super(context, new DwarfCrocodileModel(context.bakeLayer(LCModelLayers.DWARF_CROCODILE)), 0.8F);
    }

    @Override
    protected void scale(DwarfCrocodileEntity entity, PoseStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.5F, 0.5F, 0.5F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(DwarfCrocodileEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/dwarf_crocodile/dwarf_crocodile_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(DwarfCrocodileEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/dwarf_crocodile/dwarf_crocodile_" + (i + 1) + ".png");
    }
}
