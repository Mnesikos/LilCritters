package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelOpossum;
import com.github.mnesikos.lilcritters.entity.EntityOpossum;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;

@SideOnly(Side.CLIENT)
public class RenderOpossum extends RenderLivingZAWA<EntityOpossum> {
    private static final ResourceLocation OPOSSUM_1 = new ResourceLocation(Ref.MODID + ":textures/entity/opossum/opossum_1.png");

    public RenderOpossum(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelOpossum(), 0.4F);
    }

    @Override
    protected void preRenderCallback(EntityOpossum entity, float partialTickTime) {
        float scale = 0.5F + (entity.getGender() == Gender.MALE ? 0.01f : 0f) +
                (float)entity.getSizeMultiplier() * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.24F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityOpossum entity) {
        return this.getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int i) {
        switch (i) {
            case 0:
            default:
                return OPOSSUM_1;
        }
    }
}
