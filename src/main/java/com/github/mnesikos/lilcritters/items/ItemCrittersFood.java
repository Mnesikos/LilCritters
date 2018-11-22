package com.github.mnesikos.lilcritters.items;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.init.ModItems;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.item.ItemFood;

public class ItemCrittersFood extends ItemFood {

    public ItemCrittersFood(int amount, float saturation, boolean isWolfFood, String name) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(Ref.MODID + "." + name);
        setRegistryName(Ref.MODID + ":" + name);
        setCreativeTab(LilCritters.PROXY.LILCRITTERS);
        ModItems.ITEMS.add(this);
    }
}
