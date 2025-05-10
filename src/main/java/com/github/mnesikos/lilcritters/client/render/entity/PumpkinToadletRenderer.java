package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.client.model.SmallFrogModel;
import com.github.mnesikos.lilcritters.entity.PumpkinToadletEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PumpkinToadletRenderer extends ZawaMobRenderer<PumpkinToadletEntity, ZawaFrogBaseModel<PumpkinToadletEntity>> {
    public PumpkinToadletRenderer(EntityRendererProvider.Context context) {
        super(context, new SmallFrogModel<>(context.bakeLayer(LCModelLayers.PUMPKIN_TOADLET)), 0.1F);
    }

    @Override
    protected void scale(PumpkinToadletEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.2F : 0.4F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupBabyTextures(PumpkinToadletEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/pumpkin_toadlet/pumpkin_toadlet_" + (i + 1) + ".png");
    }
}
