package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelTuftedDeer;
import com.github.mnesikos.lilcritters.entity.EntityTuftedDeer;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.common.entity.data.Gender;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

@SideOnly(Side.CLIENT)
public class RenderTuftedDeer extends RenderLivingZAWA<EntityTuftedDeer> {
    private static final ResourceLocation deer1 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_1.png");
    private static final ResourceLocation deer2 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_2.png");
    private static final ResourceLocation deer3 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_3.png");
    private static final ResourceLocation deer4 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_4.png");
    private static final ResourceLocation deer5 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_5.png");
    private static final ResourceLocation deer6 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_6.png");
    private static final ResourceLocation deer7 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_7.png");
    private static final ResourceLocation deer8 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_8.png");
    private static final ResourceLocation fawn1 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_baby_1.png");
    private static final ResourceLocation fawn2 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_baby_2.png");
    private static final ResourceLocation fawn3 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_baby_3.png");
    private static final ResourceLocation fawn4 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_baby_4.png");

    private static final ResourceLocation BLINK_1 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_blink_12_baby1.png");
    private static final ResourceLocation BLINK_2 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_blink_34_baby2.png");
    private static final ResourceLocation BLINK_3 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_blink_56_baby3.png");
    private static final ResourceLocation BLINK_4 = new ResourceLocation(Ref.MODID, "textures/entity/tufteddeer/tufted_deer_blink_78_baby4.png");

    public RenderTuftedDeer(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelTuftedDeer(), 0.4F);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityTuftedDeer entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0:
            default:
                return BLINK_1;
            case 1:
                return BLINK_2;
            case 2:
                return BLINK_3;
            case 3:
                return BLINK_4;
        }
    }

    @Override
    protected void preRenderCallback(EntityTuftedDeer entity, float partialTickTime) {
        float scale = 0.5F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.002f : 0f) +
                (float)ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.6F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityTuftedDeer entity) {
        if (entity.isChild()) {
            switch (ModuleManager.VARIANT.getVariant(entity)) {
                case 0:
                default:
                    return fawn1;
                case 1:
                    return fawn2;
                case 2:
                    return fawn3;
                case 3:
                    return fawn4;
            }
        } else if (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE)) {
            switch (ModuleManager.VARIANT.getVariant(entity)) {
                case 0:
                default:
                    return deer1;
                case 1:
                    return deer3;
                case 2:
                    return deer5;
                case 3:
                    return deer7;
            }
        } else {
            switch (ModuleManager.VARIANT.getVariant(entity)) {
                case 0:
                default:
                    return deer2;
                case 1:
                    return deer4;
                case 2:
                    return deer6;
                case 3:
                    return deer8;
            }
        }
    }
}