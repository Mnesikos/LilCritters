package com.github.mnesikos.lilcritters.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mnesikos.lilcritters.items.CrittersItemBase;
import com.github.mnesikos.lilcritters.items.ItemCrittersFood;
import com.github.mnesikos.lilcritters.items.ItemSpawnEggLC;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();

	@GameRegistry.ObjectHolder("lilcritters:acorn")
	public static final Item ACORN = new ItemCrittersFood(2, 0.2F, false, "acorn");
	@GameRegistry.ObjectHolder("lilcritters:roasted_acorn")
	public static final Item ROASTED_ACORN = new ItemCrittersFood(4, 0.5F, false, "roasted_acorn");
	@GameRegistry.ObjectHolder("lilcritters:pine_cone")
    public static final Item PINE_CONE = new CrittersItemBase("pine_cone");

	@GameRegistry.ObjectHolder("lilcritters:rodent_kibble")
	public static final Item RODENT_KIBBLE = new CrittersItemBase("rodent_kibble");
	@GameRegistry.ObjectHolder("lilcritters:rodent_vial")
	public static final Item RODENT_VIAL = new CrittersItemBase("rodent_vial");

	public static final Item BANDED_PENGUIN_SPAWN_EGG = new ItemSpawnEggLC("banded_penguin");
	public static final Item BOX_TURTLE_SPAWN_EGG = new ItemSpawnEggLC("box_turtle");
	public static final Item DWARF_CROCODILE_SPAWN_EGG = new ItemSpawnEggLC("dwarf_crocodile");
	public static final Item OPOSSUM_SPAWN_EGG = new ItemSpawnEggLC("opossum");
	public static final Item RACCOON_SPAWN_EGG = new ItemSpawnEggLC("raccoon");
	public static final Item SKUNK_SPAWN_EGG = new ItemSpawnEggLC("skunk");
	public static final Item SMALL_CLAWED_OTTER_SPAWN_EGG = new ItemSpawnEggLC("small_clawed_otter");
	public static final Item TREE_SQUIRREL_SPAWN_EGG = new ItemSpawnEggLC("tree_squirrel");
	public static final Item TUFTED_DEER_SPAWN_EGG = new ItemSpawnEggLC("tufted_deer");

	public static void register() {
		OreDictionary.registerOre("cropAcorn", ACORN);
		OreDictionary.registerOre("listAllnut", ACORN);
		OreDictionary.registerOre("foodRoastedAcorn", ROASTED_ACORN);

		OreDictionary.registerOre("cropPineCone", PINE_CONE);
		OreDictionary.registerOre("listAllnut", PINE_CONE);
	}
}
