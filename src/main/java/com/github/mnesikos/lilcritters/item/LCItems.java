package com.github.mnesikos.lilcritters.item;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.block.LCBlocks;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import net.minecraft.Util;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.world.item.PlushBlockItem;
import org.zawamod.zawa.world.item.ZawaAquaticEggItem;
import org.zawamod.zawa.world.item.ZawaEggItem;

import java.util.ArrayList;
import java.util.List;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCItems {
    public static final DeferredRegister<Item> ITEMS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, LilCritters.MOD_ID);
    public static final DeferredRegister<Item> DECORATIONS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, LilCritters.MOD_ID);

    public static final List<RegistryObject<Item>> PLUSHIES = Util.make(new ArrayList<>(), list -> {
        for (String plush : PLUSHIES_LIST)
            list.add(DECORATIONS_REGISTRAR.register(plush + "_plush", () -> new PlushBlockItem(LCBlocks.PLUSHIES.get(plush).get(), new Item.Properties())));
    });

    public static final RegistryObject<Item> MYSTERY_SNAIL = ITEMS_REGISTRAR.register("mystery_snail", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BANDED_PENGUIN_EGG = ITEMS_REGISTRAR.register("banded_penguin_egg", () -> new ZawaEggItem(LCEntities.BANDED_PENGUIN, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BOX_TURTLE_EGG = ITEMS_REGISTRAR.register("box_turtle_egg", () -> new ZawaEggItem(LCEntities.BOX_TURTLE, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BULLFROG_FROGSPAWN = ITEMS_REGISTRAR.register("bullfrog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.BULLFROG, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DART_FROG_FROGSPAWN = ITEMS_REGISTRAR.register("dart_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.DART_FROG, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DWARF_CROCODILE_EGG = ITEMS_REGISTRAR.register("dwarf_crocodile_egg", () -> new ZawaEggItem(LCEntities.DWARF_CROCODILE, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PACMAN_FROG_FROGSPAWN = ITEMS_REGISTRAR.register("pacman_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.PACMAN_FROG, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> POND_SLIDER_EGG = ITEMS_REGISTRAR.register("pond_slider_egg", () -> new ZawaEggItem(LCEntities.POND_SLIDER, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PUMPKIN_TOADLET_EGG = ITEMS_REGISTRAR.register("pumpkin_toadlet_egg", () -> new ZawaEggItem(LCEntities.PUMPKIN_TOADLET, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> TOMATO_FROG_FROGSPAWN = ITEMS_REGISTRAR.register("tomato_frog_frogspawn", () -> new ZawaAquaticEggItem(LCEntities.TOMATO_FROG, new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> TREE_MONITOR_EGG = ITEMS_REGISTRAR.register("tree_monitor_egg", () -> new ZawaEggItem(LCEntities.TREE_MONITOR, new Item.Properties().stacksTo(16)));
}
