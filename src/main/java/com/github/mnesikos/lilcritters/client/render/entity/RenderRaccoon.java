package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelRaccoon;
import com.github.mnesikos.lilcritters.entity.EntityRaccoon;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderRaccoon extends RenderLivingZAWA<EntityRaccoon> {
    private static final ResourceLocation RACCOON_1 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_1.png");
    private static final ResourceLocation RACCOON_2 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_2.png");
    private static final ResourceLocation RACCOON_3 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_3.png");
    private static final ResourceLocation RACCOON_4 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_4.png");
    private static final ResourceLocation RACCOON_5 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_5.png");
    private static final ResourceLocation RACCOON_6 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_6.png");

    private static final ResourceLocation BLINK_125 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_blink_125.png");
    private static final ResourceLocation BLINK_3 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_blink_3.png");
    private static final ResourceLocation BLINK_4 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_blink_4.png");
    private static final ResourceLocation BLINK_6 = new ResourceLocation(Ref.MODID, "textures/entity/raccoon/raccoon_blink_6.png");

    public RenderRaccoon(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelRaccoon(), 0.5F);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityRaccoon entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0: default:
            case 1:
            case 4:
                return BLINK_125;
            case 2:
                return BLINK_3;
            case 3:
                return BLINK_4;
            case 5:
                return BLINK_6;
        }
    }

    @Override
    protected void preRenderCallback(EntityRaccoon entity, float partialTickTime) {
        float scale = 0.8F +
                (float) ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, -0.1F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityRaccoon entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0: default:
                return RACCOON_1;
            case 1:
                return RACCOON_2;
            case 2:
                return RACCOON_3;
            case 3:
                return RACCOON_4;
            case 4:
                return RACCOON_5;
            case 5:
                return RACCOON_6;
        }
    }
}
