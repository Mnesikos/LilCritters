package com.github.mnesikos.lilcritters.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.oredict.OreDictionary;
import org.zawamod.entity.core.BreedItems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModFoodGroups {
    public static List<Item> seeds = new ArrayList();
    public static List<Item> nuts = new ArrayList();
    public static List<Item> vegetation = new ArrayList();

    public static void registerFoodGroups() {
        seeds.add(Items.MELON_SEEDS);
        seeds.add(Items.PUMPKIN_SEEDS);
        seeds.add(Items.WHEAT_SEEDS);
        seeds.add(Items.BEETROOT_SEEDS);
        NonNullList<ItemStack> seedDictionary = OreDictionary.getOres("listAllseed");
        Iterator seedIterator = seedDictionary.iterator();
        while(seedIterator.hasNext()) {
            ItemStack stack = (ItemStack) seedIterator.next();
            seeds.add(stack.getItem());
        }

        NonNullList<ItemStack> nutDictionary = OreDictionary.getOres("listAllnut");
        Iterator nutIterator = nutDictionary.iterator();
        while (nutIterator.hasNext()) {
            ItemStack stack = (ItemStack) nutIterator.next();
            nuts.add(stack.getItem());
        }

        vegetation.add(Item.getItemFromBlock(Blocks.TALLGRASS));
        NonNullList<ItemStack> leafDictionary = OreDictionary.getOres("treeLeaves");
        Iterator leafIterator = leafDictionary.iterator();
        while (leafIterator.hasNext()) {
            ItemStack stack = (ItemStack) leafIterator.next();
            vegetation.add(stack.getItem());
        }
        NonNullList<ItemStack> stickDictionary = OreDictionary.getOres("stickWood");
        Iterator stickIterator = stickDictionary.iterator();
        while (stickIterator.hasNext()) {
            ItemStack stack = (ItemStack) stickIterator.next();
            vegetation.add(stack.getItem());
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
