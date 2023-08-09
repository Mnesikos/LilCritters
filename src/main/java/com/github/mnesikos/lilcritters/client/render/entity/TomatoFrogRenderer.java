package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.TomatoFrogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TomatoFrogRenderer extends ZawaMobRenderer<TomatoFrogEntity, ZawaFrogBaseModel<TomatoFrogEntity>> {
    public TomatoFrogRenderer(EntityRendererManager manager) {
        super(manager, new LargeFrogModel<>(), new ZawaFrogBaseModel.Tadpole<>(), 0.2F);
    }
}
