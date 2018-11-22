package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelBoxTurtle;
import com.github.mnesikos.lilcritters.entity.EntityBoxTurtle;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.Gender;

@SideOnly(Side.CLIENT)
public class RenderBoxTurtle extends RenderLivingZAWA<EntityBoxTurtle> {
    private static final ResourceLocation COMMON = new ResourceLocation(Ref.MODID + ":textures/entity/boxturtle/box_turtle_1.png");
    private static final ResourceLocation DESERT = new ResourceLocation(Ref.MODID + ":textures/entity/boxturtle/box_turtle_2.png");
    private static final ResourceLocation EASTERN = new ResourceLocation(Ref.MODID + ":textures/entity/boxturtle/box_turtle_3.png");
    private static final ResourceLocation GULF = new ResourceLocation(Ref.MODID + ":textures/entity/boxturtle/box_turtle_4.png");
    private static final ResourceLocation THREETOED = new ResourceLocation(Ref.MODID + ":textures/entity/boxturtle/box_turtle_5.png");

    public RenderBoxTurtle(RenderManager render) {
        super(render, new ModelBoxTurtle(), 0.3F);
    }

    @Override
    protected void preRenderCallback(EntityBoxTurtle entity, float partialTickTime) {
        float scale = 0.7F + (entity.getGender() == Gender.FEMALE ? 0.02f : 0f) +
                (float)entity.getSizeMultiplier() * (entity.getEntityWorld().rand.nextInt(1) == 0 ? 0.01f : -0.01f);
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.01F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoxTurtle entity) {
        return this.getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int i) {
        switch (i) {
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
