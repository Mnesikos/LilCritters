package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCItemModels extends ItemModelProvider {
    public LCItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LilCritters.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (String plush : PLUSHIES_LIST) withExistingParent(plush + "_plush", modLoc("block/" + plush + "_plush"));
        withExistingParent("low_barrier_fence", modLoc("block/low_barrier_fence_inventory"));
        withExistingParent("burrow_hide", modLoc("block/burrow_hide"));
        for (int i = 0; i < 16; i++) {
            String colorName = DyeColor.byId(i).getName();
            withExistingParent(colorName + "_igloo_hide", modLoc("block/" + colorName + "_igloo_hide"));
        }
        withExistingParent("small_animal_water_bottle", modLoc("block/small_animal_water_bottle"));
    }
}
