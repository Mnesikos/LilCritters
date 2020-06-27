package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelBandedPenguin;
import com.github.mnesikos.lilcritters.entity.EntityBandedPenguin;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.common.entity.data.Gender;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderBandedPenguin extends RenderLivingZAWA<EntityBandedPenguin> {
    private static final ResourceLocation MAGELLANIC = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_1.png");
    private static final ResourceLocation HUMBOLDT = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_2.png");
    private static final ResourceLocation GALAPAGOS = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_3.png");
    private static final ResourceLocation AFRICAN = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_4.png");
    private static final ResourceLocation BABY = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_baby.png");

    private static final ResourceLocation BLINK = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_blink.png");
    private static final ResourceLocation BLINK_BABY = new ResourceLocation(Ref.MODID, "textures/entity/banded_penguin/banded_penguin_blink_baby.png");

    public RenderBandedPenguin(RenderManager rendermanager) {
        super(rendermanager, new ModelBandedPenguin(), 0.2F);
    }

    @Override
    protected void preRenderCallback(EntityBandedPenguin entity, float partialTickTime) {
        float scale = 0.7F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.01f : 0f) +
                (float)ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.2F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityBandedPenguin entity) {
        if(entity.isChild())
            return BLINK_BABY;
        else
            return BLINK;
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBandedPenguin entity) {
        if (entity.isChild())
            return BABY;
        else {
            int variant = ModuleManager.VARIANT.getVariant(entity);
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
}
