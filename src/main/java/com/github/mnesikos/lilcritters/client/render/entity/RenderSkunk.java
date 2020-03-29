package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelSkunk;
import com.github.mnesikos.lilcritters.entity.EntitySkunk;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderSkunk extends RenderLivingZAWA<EntitySkunk> {
    private static final ResourceLocation STRIPED = new ResourceLocation(Ref.MODID + ":textures/entity/skunk/skunk_1.png");
    private static final ResourceLocation HOODED = new ResourceLocation(Ref.MODID + ":textures/entity/skunk/skunk_2.png");

    public RenderSkunk(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkunk(), 0.4F);
    }

    @Override
    protected void preRenderCallback(EntitySkunk entity, float partialTickTime) {
        float scale = 0.4F + (entity.getGender() == Gender.MALE ? 0.01f : 0f) +
                (float)entity.getSizeMultiplier() * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, 0.0F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySkunk entity) {
        return getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int variant) {
        switch (variant) {
            case 0:
            default:
                return STRIPED;
            case 1:
                return HOODED;
        }
    }
}
