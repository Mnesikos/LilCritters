package com.github.mnesikos.lilcritters.util;

import com.github.mnesikos.lilcritters.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.zawamod.entity.core.DietHandler;

import java.util.ArrayList;
import java.util.List;

public class DietHandlerLC {
    public static final List<ItemStack> AQUATIC_CARNIVORE = new ArrayList<>();
    public static final List<ItemStack> DEER = new ArrayList<>();

    public static void registerFoodItems() {
        AQUATIC_CARNIVORE.addAll(DietHandler.PISCIVORE);
        AQUATIC_CARNIVORE.addAll(DietHandler.SHELLFISH);
        DEER.addAll(DietHandler.GRAZER);
        DEER.addAll(DietHandler.LEAF_EATER);
        DEER.add(new ItemStack(Items.STICK));
        DEER.add(new ItemStack(Blocks.REEDS));
        DietHandler.CARNIVORE_FISH.addAll(DietHandler.SMALL_CARNIVORE);
        DietHandler.CARNIVORE_FISH.addAll(DietHandler.PISCIVORE);
        DietHandler.OMNIVORE.add(new ItemStack(ModItems.PINE_CONE));

        DietHandler.fix(AQUATIC_CARNIVORE);
        DietHandler.fix(DEER);
        DietHandler.fix(DietHandler.CARNIVORE_FISH);
        DietHandler.fix(DietHandler.OMNIVORE);
    }
}
