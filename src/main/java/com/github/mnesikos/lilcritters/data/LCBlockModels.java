package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class LCBlockModels extends BlockModelProvider {
    public LCBlockModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LilCritters.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (int i = 0; i < 16; i++) {
            String colorName = DyeColor.byId(i).getName();
            singleTexture(colorName + "_igloo_hide", modLoc("block/igloo_hide"), "7", modLoc("block/" + colorName + "_igloo_hide"));
        }
    }
}
