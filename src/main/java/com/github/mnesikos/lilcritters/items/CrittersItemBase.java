package com.github.mnesikos.lilcritters.items;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.init.ModItems;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.item.Item;

public class CrittersItemBase extends Item {

    public CrittersItemBase(String name) {
        setUnlocalizedName(Ref.MODID + "." + name);
        setRegistryName(Ref.MODID + ":" + name);
        setCreativeTab(LilCritters.PROXY.LILCRITTERS);
        ModItems.ITEMS.add(this);
    }
}
