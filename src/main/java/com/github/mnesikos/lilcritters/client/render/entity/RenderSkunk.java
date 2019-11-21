package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.entity.EntitySkunk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderSkunk extends RenderLivingZAWA<EntitySkunk> {
    public RenderSkunk(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySkunk entity) {
        return null;
    }
}
