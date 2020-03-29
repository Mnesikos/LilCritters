package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelDwarfCrocodile;
import com.github.mnesikos.lilcritters.entity.EntityDwarfCrocodile;
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
public class RenderDwarfCrocodile extends RenderLivingZAWA<EntityDwarfCrocodile> {
    private static final ResourceLocation DWARF_CROC_1 = new ResourceLocation(Ref.MODID + ":textures/entity/dwarf_crocodile/dwarf_crocodile_1.png");
    private static final ResourceLocation DWARF_CROC_2 = new ResourceLocation(Ref.MODID + ":textures/entity/dwarf_crocodile/dwarf_crocodile_2.png");
    private static final ResourceLocation DWARF_CROC_3 = new ResourceLocation(Ref.MODID + ":textures/entity/dwarf_crocodile/dwarf_crocodile_3.png");

    public RenderDwarfCrocodile(RenderManager rendermanager) {
        super(rendermanager, new ModelDwarfCrocodile(), 0.8F);
    }

    @Override
    protected void preRenderCallback(EntityDwarfCrocodile entity, float partialTickTime) {
        float scale = 1.0F + (entity.getGender() == Gender.MALE ? 0.01f : 0f) +
                (float)entity.getSizeMultiplier() * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        super.preRenderCallback(entity, partialTickTime);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDwarfCrocodile entity) {
        return this.getTextureOfVar(entity.getAnimalType());
    }

    @Override
    public ResourceLocation getTextureOfVar(int variant) {
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
