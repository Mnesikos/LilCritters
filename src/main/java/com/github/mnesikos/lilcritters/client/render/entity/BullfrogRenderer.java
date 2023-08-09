package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.model.LargeFrogModel;
import com.github.mnesikos.lilcritters.entity.BullfrogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BullfrogRenderer extends ZawaMobRenderer<BullfrogEntity, ZawaFrogBaseModel<BullfrogEntity>> {
    public BullfrogRenderer(EntityRendererManager manager) {
        super(manager, new LargeFrogModel<>(), new ZawaFrogBaseModel.Tadpole<>(), 0.2F);
    }

    @Override
    protected boolean hasBabyVariants(BullfrogEntity entity) {
        return false;
    }

    @Override
    public void setupAdultTextures(BullfrogEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount + 1];
        for (int i = 0; i < 1; i++) {
            adultTextures[i * 2] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/bullfrog/bullfrog_" + (i) + "_female.png");
            adultTextures[i * 2 + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/bullfrog/bullfrog_" + (i) + "_male.png");
        }
        for (int i = 1; i < variantCount; i++)
            adultTextures[i + 1] = new ResourceLocation(LilCritters.MOD_ID, "textures/entity/bullfrog/bullfrog_" + (i) + ".png");
    }

    @Override
    public ResourceLocation getTextureLocation(BullfrogEntity entity) {
        int variantCount = entity.getTotalVariants();
        int variant = entity.getVariant();
        if (variant >= variantCount) {
            return UNKNOWN_VARIANT;

        } else if (entity.isBaby()) {
            if (this.getBabyTexture() == null && (this.getBabyTextures() == null || this.getBabyTextures().length != variantCount + 1))
                this.setupBabyTextures(entity);
            return this.getBabyTexture(entity, variant);
        } else {
            if (this.getAdultTextures() == null || this.getAdultTextures().length != variantCount + 1)
                this.setupAdultTextures(entity);

            if (variant < 1) return this.getAdultTextures()[variant * 2 + entity.getGender().ordinal()];
            else return this.getAdultTextures()[variant + 1];
        }
    }
}
