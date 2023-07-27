package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.GuineaPigModel;
import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.GuineaPigEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class GuineaPigRenderer extends ZawaMobRenderer<GuineaPigEntity, GuineaPigModel> {
    public GuineaPigRenderer(EntityRendererManager manager) {
        super(manager, new GuineaPigModel(), 0.2F);
    }

    @Override
    protected void scale(GuineaPigEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.4F : 0.8F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(GuineaPigEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(LilCritters.MOD_ID, "textures/entity/guinea_pig/guinea_pig_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(GuineaPigEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/guinea_pig/guinea_pig_" + (i + 1) + ".png");
    }
}
