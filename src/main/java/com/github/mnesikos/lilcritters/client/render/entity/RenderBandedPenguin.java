package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelBandedPenguin;
import com.github.mnesikos.lilcritters.entity.EntityBandedPenguin;
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
public class RenderBandedPenguin extends RenderLivingZAWA<EntityBandedPenguin> {
    private static final ResourceLocation MAGELLANIC = new ResourceLocation(Ref.MODID + ":textures/entity/banded_penguin/banded_penguin_1.png");
    private static final ResourceLocation HUMBOLDT = new ResourceLocation(Ref.MODID + ":textures/entity/banded_penguin/banded_penguin_2.png");
    private static final ResourceLocation GALAPAGOS = new ResourceLocation(Ref.MODID + ":textures/entity/banded_penguin/banded_penguin_3.png");
    private static final ResourceLocation AFRICAN = new ResourceLocation(Ref.MODID + ":textures/entity/banded_penguin/banded_penguin_4.png");
    private static final ResourceLocation BABY = new ResourceLocation(Ref.MODID + ":textures/entity/banded_penguin/banded_penguin_baby.png");

    public RenderBandedPenguin(RenderManager rendermanager) {
        super(rendermanager, new ModelBandedPenguin(), 0.2F);
    }

    @Override
    protected void preRenderCallback(EntityBandedPenguin entity, float partialTickTime) {
        float scale = 0.7F + (entity.getGender() == Gender.MALE ? 0.01f : 0f) +
                (float)entity.getSizeMultiplier() * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.2F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBandedPenguin entity) {
        return entity.isChild() ? BABY : this.getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int variant) {
        switch (variant) {
            case 0:
            default:
                return MAGELLANIC;
            case 1:
                return HUMBOLDT;
            case 2:
                return GALAPAGOS;
            case 3:
                return AFRICAN;
        }
    }
}
