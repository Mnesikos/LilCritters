package com.github.mnesikos.lilcritters.item;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;

public class LCItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, LilCritters.MOD_ID);

    public static final RegistryObject<Item> MYSTERY_SNAIL = REGISTRAR.register("mystery_snail", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));
}
