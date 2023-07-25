package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.CapybaraModel;
import com.github.mnesikos.lilcritters.entity.CapybaraEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CapybaraRenderer extends ZawaMobRenderer<CapybaraEntity, CapybaraModel> {

    public CapybaraRenderer(EntityRendererManager manager) {
        super(manager, new CapybaraModel.Adult(), new CapybaraModel.Child(), 0.4F);
    }
}