package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.data.PackOutput;
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
    }
}
