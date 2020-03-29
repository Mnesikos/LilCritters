package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelSmallClawedOtter;
import com.github.mnesikos.lilcritters.entity.EntitySmallClawedOtter;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderSmallClawedOtter extends RenderLivingZAWA<EntitySmallClawedOtter> {
    private static final ResourceLocation OTTER_1 = new ResourceLocation(Ref.MODID + ":textures/entity/small_clawed_otter/small_clawed_otter_1.png");
    private static final ResourceLocation OTTER_2 = new ResourceLocation(Ref.MODID + ":textures/entity/small_clawed_otter/small_clawed_otter_2.png");
    private static final ResourceLocation OTTER_3 = new ResourceLocation(Ref.MODID + ":textures/entity/small_clawed_otter/small_clawed_otter_3.png");
    private static final ResourceLocation OTTER_4 = new ResourceLocation(Ref.MODID + ":textures/entity/small_clawed_otter/small_clawed_otter_4.png");

    public RenderSmallClawedOtter(RenderManager rendermanager) {
        super(rendermanager, new ModelSmallClawedOtter(), 0.4F);
    }

    @Override
    protected void preRenderCallback(EntitySmallClawedOtter entity, float partialTickTime) {
        float scale = 1.0F +
                (float)entity.getSizeMultiplier() * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.1F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySmallClawedOtter entity) {
        return this.getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int variant) {
        switch (variant) {
            case 0:
            default:
                return OTTER_1;
            case 1:
                return OTTER_2;
            case 2:
                return OTTER_3;
            case 3:
                return OTTER_4;
        }
    }
}
