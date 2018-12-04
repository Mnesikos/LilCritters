package com.github.mnesikos.lilcritters.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import org.zawamod.entity.core.BreedItems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModFoodGroups {
    private static List<Item> seeds = new ArrayList<>();
    private static List<Item> nuts = new ArrayList<>();
    private static List<Item> vegetation = new ArrayList<>();

    public static void registerFoodGroups() {
        seeds.add(Items.MELON_SEEDS);
        seeds.add(Items.PUMPKIN_SEEDS);
        seeds.add(Items.WHEAT_SEEDS);
        seeds.add(Items.BEETROOT_SEEDS);
        NonNullList<ItemStack> seedDictionary = OreDictionary.getOres("listAllseed");
        for (ItemStack stk : seedDictionary) {
            seeds.add(stk.getItem());
        }

        NonNullList<ItemStack> nutDictionary = OreDictionary.getOres("listAllnut");
        for (ItemStack stk : nutDictionary) {
            nuts.add(stk.getItem());
        }
        if (Loader.isModLoaded("dynamictrees")) {
            for (Item itm : ForgeRegistries.ITEMS.getValuesCollection()) {
                if (itm.getRegistryName().getResourceDomain().equals("dynamictrees") &&
                        itm.getRegistryName().getResourcePath().contains("seed")) {
                    nuts.add(itm);
                }
            }
        }

        vegetation.add(Item.getItemFromBlock(Blocks.TALLGRASS));
        NonNullList<ItemStack> leafDictionary = OreDictionary.getOres("treeLeaves");
        for (ItemStack stk : leafDictionary) {
            vegetation.add(stk.getItem());
        }
        NonNullList<ItemStack> stickDictionary = OreDictionary.getOres("stickWood");
        for (ItemStack stk : stickDictionary) {
            vegetation.add(stk.getItem());
        }
    }

    public static boolean SeedItems(ItemStack stack) {
        Iterator seedsItr = seeds.iterator();
        Item i;
        do {
            if (!seedsItr.hasNext()) {
                return false;
            }

            i = (Item)seedsItr.next();
        } while(stack.getItem() != i);

        return true;
    }

    public static boolean NutItems(ItemStack stack) {
        Iterator nutsItr = nuts.iterator();
        Item i;
        do {
            if (!nutsItr.hasNext()) {
                return false;
            }

            i = (Item)nutsItr.next();
        } while(stack.getItem() != i);

        return true;
    }

    public static boolean VegetationItems(ItemStack stack) {
        Iterator vegetationItr = vegetation.iterator();
        Item i;
        do {
            if (!vegetationItr.hasNext()) {
                return false;
            }

            i = (Item)vegetationItr.next();
        } while(stack.getItem() != i);


        Iterator herbivoreIterator = BreedItems.herbivore.iterator();
        do {
            if (!herbivoreIterator.hasNext()) {
                return false;
            }

            i = (Item)herbivoreIterator.next();
        } while(stack.getItem() != i);

        return true;
    }
}
