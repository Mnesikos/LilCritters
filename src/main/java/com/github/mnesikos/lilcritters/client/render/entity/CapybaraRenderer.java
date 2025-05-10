package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.CapybaraModel;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapybaraRenderer extends ZawaMobRenderer<CapybaraEntity, CapybaraModel> {
    public CapybaraRenderer(EntityRendererProvider.Context context) {
        super(context, new CapybaraModel.Adult(context.bakeLayer(LCModelLayers.CAPYBARA_ADULT)), new CapybaraModel.Child(context.bakeLayer(LCModelLayers.CAPYBARA_CHILD)), 0.4F);
    }
}