package com.github.mnesikos.lilcritters.item;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.ZawaAquaticEggItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

public class LCItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, LilCritters.MOD_ID);

    public static final RegistryObject<Item> MYSTERY_SNAIL = REGISTRAR.register("mystery_snail", () -> new Item(new Item.Properties().tab(Zawa.ITEMS_GROUP)));

    public static final RegistryObject<Item> BANDED_PENGUIN_EGG = REGISTRAR.register("banded_penguin_egg", () -> new ZawaEggItem(LCEntities.BANDED_PENGUIN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BOX_TURTLE_EGG = REGISTRAR.register("box_turtle_egg", () -> new ZawaEggItem(LCEntities.BOX_TURTLE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BULLFROG_FROGSPAWN = REGISTRAR.register("bullfrog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.BULLFROG, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> DART_FROG_FROGSPAWN = REGISTRAR.register("dart_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.DART_FROG, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> DWARF_CROCODILE_EGG = REGISTRAR.register("dwarf_crocodile_egg", () -> new ZawaEggItem(LCEntities.DWARF_CROCODILE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> PACMAN_FROG_FROGSPAWN = REGISTRAR.register("pacman_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.PACMAN_FROG, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> POND_SLIDER_EGG = REGISTRAR.register("pond_slider_egg", () -> new ZawaEggItem(LCEntities.POND_SLIDER, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> PUMPKIN_TOADLET_EGG = REGISTRAR.register("pumpkin_toadlet_egg", () -> new ZawaEggItem(LCEntities.PUMPKIN_TOADLET, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> TOMATO_FROG_FROGSPAWN = REGISTRAR.register("tomato_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.TOMATO_FROG, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> TREE_MONITOR_EGG = REGISTRAR.register("tree_monitor_egg", () -> new ZawaEggItem(LCEntities.TREE_MONITOR, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
}
