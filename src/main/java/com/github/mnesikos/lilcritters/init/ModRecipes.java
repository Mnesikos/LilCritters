package com.github.mnesikos.lilcritters.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.ACORN, new ItemStack(ModItems.ROASTED_ACORN, 1, 0), 0.5F);
	}
}
