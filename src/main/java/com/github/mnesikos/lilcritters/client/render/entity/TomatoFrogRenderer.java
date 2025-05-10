package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.TomatoFrogEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class TomatoFrogRenderer extends ZawaMobRenderer<TomatoFrogEntity, ZawaFrogBaseModel<TomatoFrogEntity>> {
    public TomatoFrogRenderer(EntityRendererProvider.Context context) {
        super(context, new LargeFrogModel<>(), new ZawaFrogBaseModel.Tadpole<>(), 0.2F);
    }
}
