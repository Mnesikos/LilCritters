package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelBoxTurtle;
import com.github.mnesikos.lilcritters.entity.EntityBoxTurtle;
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
public class RenderBoxTurtle extends RenderLivingZAWA<EntityBoxTurtle> {
    private static final ResourceLocation COMMON = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_1.png");
    private static final ResourceLocation DESERT = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_2.png");
    private static final ResourceLocation EASTERN = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_3.png");
    private static final ResourceLocation GULF = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_4.png");
    private static final ResourceLocation THREETOED = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_5.png");

    private static final ResourceLocation BLINK_1 = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_blink_1.png");
    private static final ResourceLocation BLINK_2 = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_blink_2.png");
    private static final ResourceLocation BLINK_3 = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_blink_3.png");
    private static final ResourceLocation BLINK_4 = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_blink_4.png");
    private static final ResourceLocation BLINK_5 = new ResourceLocation(Ref.MODID, "textures/entity/boxturtle/box_turtle_blink_5.png");

    public RenderBoxTurtle(RenderManager render) {
        super(render, new ModelBoxTurtle(), 0.3F);
    }

    @Override
    protected void preRenderCallback(EntityBoxTurtle entity, float partialTickTime) {
        float scale = 0.7F + (ModuleManager.GENDER.getGender(entity).equals(Gender.FEMALE) ? 0.02f : 0f) + (float) ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.01F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityBoxTurtle entity) {
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
            case 4:
                return BLINK_5;
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoxTurtle entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0:
            default:
                return COMMON;
            case 1:
                return DESERT;
            case 2:
                return EASTERN;
            case 3:
                return GULF;
            case 4:
                return THREETOED;
        }
    }
}
