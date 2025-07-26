package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.block.LCBlocks;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Collectors;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCBlockLoot extends VanillaBlockLoot {
    @Override
    protected void generate() {
        for (String plush : PLUSHIES_LIST) dropSelf(LCBlocks.PLUSHIES.get(plush).get());
        dropSelf(LCBlocks.LOW_BARRIER_FENCE.get());
        for (int i = 0; i < 16; i++) dropSelf(LCBlocks.IGLOO_HIDES.get(DyeColor.byId(i).getName()).get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(LilCritters.MOD_ID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
