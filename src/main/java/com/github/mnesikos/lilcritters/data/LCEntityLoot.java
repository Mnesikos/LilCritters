package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.world.item.ZawaItems;

import java.util.Map;
import java.util.stream.Stream;

public class LCEntityLoot extends VanillaEntityLoot {
    @Override
    public void generate() {
        add(LCEntities.AMERICAN_BADGER.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.BANDED_PENGUIN.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.FEATHER, 1))));
        add(LCEntities.BEARDED_DRAGON.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.BOX_TURTLE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.BULLFROG.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.BURROWING_OWL.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.FEATHER, 1))));
        add(LCEntities.CAPYBARA.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 2)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.DART_FROG.get(), LootTable.lootTable());
        add(LCEntities.DWARF_CROCODILE.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 2)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.LEATHER, 1))));
        add(LCEntities.FRUIT_BAT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.GUINEA_PIG.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.MYSTERY_SNAIL.get(), createSingleItemTable(LCItems.MYSTERY_SNAIL.get()));
        add(LCEntities.OPOSSUM.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.PACMAN_FROG.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.POND_SLIDER.get(), LootTable.lootTable());
        add(LCEntities.PRAIRIE_DOG.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.PUMPKIN_TOADLET.get(), LootTable.lootTable());
        add(LCEntities.RACCOON.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.SKUNK.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.SMALL_CLAWED_OTTER.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.SNAPPING_TURTLE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.SUGAR_GLIDER.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.TOMATO_FROG.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.TREE_MONITOR.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
        add(LCEntities.TREE_SQUIRREL.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(LCEntities.TUFTED_DEER.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 2)
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(addItemWithLooting(Items.BONE, 1))));
    }

    public static LootTable.Builder createSingleItemTable(ItemLike item) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(item)));
    }

    public static LootTable.Builder createCookedItemTable(ItemLike item, int maxCount) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, maxCount)))
                .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))));
    }

    public LootPoolEntryContainer.Builder<?> addItemWithLooting(ItemLike item, int maxCount) {
        return LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, maxCount)))
                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)));
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(LilCritters.MOD_ID))
                .map(Map.Entry::getValue);
    }
}
