package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelSkunk;
import com.github.mnesikos.lilcritters.entity.EntitySkunk;
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
public class RenderSkunk extends RenderLivingZAWA<EntitySkunk> {
    private static final ResourceLocation STRIPED = new ResourceLocation(Ref.MODID, "textures/entity/skunk/skunk_1.png");
    private static final ResourceLocation HOODED = new ResourceLocation(Ref.MODID, "textures/entity/skunk/skunk_2.png");

    private static final ResourceLocation BLINK = new ResourceLocation(Ref.MODID, "textures/entity/skunk/skunk_blink.png");

    public RenderSkunk(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkunk(), 0.4F);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntitySkunk entity) {
        return BLINK;
    }

    @Override
    protected void preRenderCallback(EntitySkunk entity, float partialTickTime) {
        float scale = 0.4F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.01f : 0f) +
                (float)ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F, 0.0F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySkunk entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0:
            default:
                return STRIPED;
            case 1:
                return HOODED;
        }
    }
}
