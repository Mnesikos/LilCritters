package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.CapybaraModel;
import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapybaraRenderer extends ZawaMobRenderer<CapybaraEntity, CapybaraModel> {
    public CapybaraRenderer(EntityRendererProvider.Context context) {
        super(context, new CapybaraModel.Adult(), new CapybaraModel.Child(), 0.4F);
    }
}