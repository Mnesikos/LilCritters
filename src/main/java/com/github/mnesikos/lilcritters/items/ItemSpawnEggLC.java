package com.github.mnesikos.lilcritters.items;

import com.github.mnesikos.lilcritters.init.ModItems;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.util.ResourceLocation;
import org.zawamod.entity.painting.EntityZooPainting;
import org.zawamod.init.items.ItemCustomSpawnEgg;

public class ItemSpawnEggLC extends ItemCustomSpawnEgg {
    public ItemSpawnEggLC(String unloc, EntityZooPainting.EnumArt art) {
        super(unloc, Ref.MODID, art);
        this.setRegistryName(new ResourceLocation(Ref.MODID, unloc));
        ModItems.ITEMS.add(this);
    }

    public ItemSpawnEggLC(String u) {
        super(u, Ref.MODID);
        this.setRegistryName(new ResourceLocation(Ref.MODID, u));
        ModItems.ITEMS.add(this);
    }
}
