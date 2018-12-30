package com.github.mnesikos.lilcritters.init;

import java.util.ArrayList;
import java.util.List;

import com.github.mnesikos.lilcritters.items.CrittersItemBase;
import com.github.mnesikos.lilcritters.items.ItemCrittersFood;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();

	//public static final Item tree_squirrel_egg = new ItemCrittersSpawnEgg("tree_squirrel");

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

	public static void register() {
		OreDictionary.registerOre("cropAcorn", ACORN);
		OreDictionary.registerOre("listAllnut", ACORN);
		OreDictionary.registerOre("foodRoastedAcorn", ROASTED_ACORN);

		OreDictionary.registerOre("cropPineCone", PINE_CONE);
		OreDictionary.registerOre("listAllnut", PINE_CONE);
	}
}
