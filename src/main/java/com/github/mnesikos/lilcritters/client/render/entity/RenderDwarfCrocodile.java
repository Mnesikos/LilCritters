package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelDwarfCrocodile;
import com.github.mnesikos.lilcritters.entity.EntityDwarfCrocodile;
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
public class RenderDwarfCrocodile extends RenderLivingZAWA<EntityDwarfCrocodile> {
    private static final ResourceLocation DWARF_CROC_1 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_1.png");
    private static final ResourceLocation DWARF_CROC_2 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_2.png");
    private static final ResourceLocation DWARF_CROC_3 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_3.png");

    private static final ResourceLocation BLINK_1 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_blink_1.png");
    private static final ResourceLocation BLINK_2 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_blink_2.png");
    private static final ResourceLocation BLINK_3 = new ResourceLocation(Ref.MODID, "textures/entity/dwarf_crocodile/dwarf_crocodile_blink_3.png");

    public RenderDwarfCrocodile(RenderManager rendermanager) {
        super(rendermanager, new ModelDwarfCrocodile(), 0.8F);
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityDwarfCrocodile entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0:
            default:
                return BLINK_1;
            case 1:
                return BLINK_2;
            case 2:
                return BLINK_3;
        }
    }

    @Override
    protected void preRenderCallback(EntityDwarfCrocodile entity, float partialTickTime) {
        float scale = 1.0F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.01f : 0f) +
                (float) ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDwarfCrocodile entity) {
        int variant = ModuleManager.VARIANT.getVariant(entity);
        switch (variant) {
            case 0:
            default:
                return DWARF_CROC_1;
            case 1:
                return DWARF_CROC_2;
            case 2:
                return DWARF_CROC_3;
        }
    }
}
