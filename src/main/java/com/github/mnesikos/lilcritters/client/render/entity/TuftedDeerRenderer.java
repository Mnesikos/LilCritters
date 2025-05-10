package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.TuftedDeerModel;
import com.github.mnesikos.lilcritters.entity.TuftedDeerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class TuftedDeerRenderer extends ZawaMobRenderer<TuftedDeerEntity, TuftedDeerModel> {
    public TuftedDeerRenderer(EntityRendererProvider manager) {
        super(manager, new TuftedDeerModel.Adult(), new TuftedDeerModel.Child(), 0.4F);
    }

    @Override
    protected void scale(TuftedDeerEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = (entity.getGender() == ZawaBaseEntity.Gender.FEMALE) ? 0.85F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}