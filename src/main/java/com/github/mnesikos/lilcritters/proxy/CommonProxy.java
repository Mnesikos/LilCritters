package com.github.mnesikos.lilcritters.proxy;

import com.github.mnesikos.lilcritters.event.CrittersEventHandler;
import com.github.mnesikos.lilcritters.init.ModBlocks;
import com.github.mnesikos.lilcritters.init.ModEntities;
import com.github.mnesikos.lilcritters.init.ModItems;

import com.github.mnesikos.lilcritters.init.ModRecipes;
import com.github.mnesikos.lilcritters.util.ModFoodGroups;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static CreativeTabs LILCRITTERS;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CrittersEventHandler());
		LILCRITTERS = new CreativeTabs(Ref.MODID + ".tab") {
			@Override
			@SideOnly(Side.CLIENT)
			public ItemStack getTabIconItem() {
				return new ItemStack(ModItems.ACORN);
			}
			@Override
			@SideOnly(Side.CLIENT)
			public void displayAllRelevantItems(NonNullList<ItemStack> itemList) {
				super.displayAllRelevantItems(itemList);
				for (EntityList.EntityEggInfo eggInfo : EntityList.ENTITY_EGGS.values()) {
					if (eggInfo.spawnedID.getResourceDomain().equals(Ref.MODID)) {
						ItemStack itemstack = new ItemStack(Items.SPAWN_EGG, 1);
						ItemMonsterPlacer.applyEntityIdToItemStack(itemstack, eggInfo.spawnedID);
						itemList.add(itemstack);
					}
				}
			}
		};
		ModEntities.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		ModItems.register();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ModFoodGroups.registerFoodGroups();
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
}
