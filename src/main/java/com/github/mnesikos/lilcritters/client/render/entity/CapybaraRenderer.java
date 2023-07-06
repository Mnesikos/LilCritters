package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.CapybaraModel;
import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapybaraRenderer extends ZawaMobRenderer<CapybaraEntity, CapybaraModel> {

    public CapybaraRenderer(EntityRendererManager manager) {
        super(manager, new CapybaraModel.Adult(), new CapybaraModel.Child(), 0.4F);
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