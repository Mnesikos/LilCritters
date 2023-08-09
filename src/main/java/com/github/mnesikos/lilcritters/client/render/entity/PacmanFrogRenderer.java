package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.PacmanFrogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PacmanFrogRenderer extends ZawaMobRenderer<PacmanFrogEntity, ZawaFrogBaseModel<PacmanFrogEntity>> {
    public PacmanFrogRenderer(EntityRendererManager manager) {
        super(manager, new LargeFrogModel<>(), new ZawaFrogBaseModel.Tadpole<>(), 0.2F);
    }
}
