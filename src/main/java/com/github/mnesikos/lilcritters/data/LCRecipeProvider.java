package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.block.LCBlocks;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.world.item.ZawaItems;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class LCRecipeProvider extends RecipeProvider {
    public LCRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        shapedRecipeResult(consumer,
                LCBlocks.LOW_BARRIER_FENCE.get(), 3, ImmutableList.of("AGA", "AGA"), ImmutableMap.<Character, Ingredient>builder()
                        .put('A', Ingredient.of(Blocks.POLISHED_ANDESITE))
                        .put('G', Ingredient.of(Blocks.GLASS_PANE)).build());

        shapedRecipeResult(consumer, LCBlocks.BURROW_HIDE.get(), 3, ImmutableList.of(" G ", "G G"), ImmutableMap.<Character, Ingredient>builder()
                .put('G', Ingredient.of(ItemTags.DIRT)).build());

        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            shapedRecipeResult(consumer,  color.getName() + "_dyed_igloo_hide",
                    LCBlocks.IGLOO_HIDES.get(color.getName()).get(), 1, ImmutableList.of(" G ", "GDG"), ImmutableMap.<Character, Ingredient>builder()
                            .put('G', Ingredient.of(Blocks.GLASS_PANE))
                            .put('D', Ingredient.of(color.getTag())).build());
        }

        shapedRecipeResult(consumer,
                LCBlocks.SMALL_ANIMAL_WATER_BOTTLE.get(), 1, ImmutableList.of("G ", "G ", "GN"), ImmutableMap.<Character, Ingredient>builder()
                        .put('G', Ingredient.of(Blocks.GLASS_PANE))
                        .put('N', Ingredient.of(Items.IRON_NUGGET)).build());

        shapedRecipeResult(consumer,
                LCBlocks.PLUSHIES.get("opossum").get(), 1, ImmutableList.of("GLG", "WSW", "WPW"), ImmutableMap.<Character, Ingredient>builder()
                        .put('G', Ingredient.of(Blocks.GRAY_WOOL))
                        .put('L', Ingredient.of(Blocks.LIGHT_GRAY_WOOL))
                        .put('W', Ingredient.of(Blocks.WHITE_WOOL))
                        .put('P', Ingredient.of(Blocks.PINK_WOOL))
                        .put('S', Ingredient.of(Items.BAMBOO, ZawaItems.BLACK_BAMBOO.get(), ZawaItems.YELLOW_BAMBOO.get())).build());
        shapedRecipeResult(consumer,
                LCBlocks.PLUSHIES.get("skunk").get(), 1, ImmutableList.of("WBW", "WSW", "BPB"), ImmutableMap.<Character, Ingredient>builder()
                        .put('B', Ingredient.of(Blocks.BLACK_WOOL))
                        .put('W', Ingredient.of(Blocks.WHITE_WOOL))
                        .put('P', Ingredient.of(Blocks.PINK_WOOL))
                        .put('S', Ingredient.of(Items.BAMBOO, ZawaItems.BLACK_BAMBOO.get(), ZawaItems.YELLOW_BAMBOO.get())).build());
        shapedRecipeResult(consumer,
                LCBlocks.PLUSHIES.get("squirrel").get(), 1, ImmutableList.of("GLG", "LSL", "LGL"), ImmutableMap.<Character, Ingredient>builder()
                        .put('G', Ingredient.of(Blocks.GRAY_WOOL))
                        .put('L', Ingredient.of(Blocks.LIGHT_GRAY_WOOL))
                        .put('S', Ingredient.of(Items.BAMBOO, ZawaItems.BLACK_BAMBOO.get(), ZawaItems.YELLOW_BAMBOO.get())).build());
    }

    public static void shapedRecipeResult(Consumer<FinishedRecipe> consumer, ItemLike iItemProvider, int outputNum, List<String> recipe, Map<Character, Ingredient> recipeMapKey) {
        shapedRecipeResult(consumer, ForgeRegistries.ITEMS.getKey(iItemProvider.asItem()).getPath(), iItemProvider, outputNum, recipe, recipeMapKey);
    }

    public static void shapedRecipeResult(Consumer<FinishedRecipe> consumer, String id, ItemLike iItemProvider, int outputNum, List<String> recipe, Map<Character, Ingredient> recipeMapKey) {
        consumer.accept(new ShapedRecipeBuilder.Result(
                new ResourceLocation(LilCritters.MOD_ID, id),
                iItemProvider.asItem(),
                outputNum,
                LilCritters.MOD_ID,
                CraftingBookCategory.MISC,
                recipe,
                recipeMapKey,
                null,
                null,
                false
        ) {
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }
        });
    }
}
