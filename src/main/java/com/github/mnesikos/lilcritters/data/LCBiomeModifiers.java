package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.config.ZawaSpawnCategory;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LCBiomeModifiers extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder().add(ForgeRegistries.Keys.BIOME_MODIFIERS, (context) -> ZawaSpawnCategory.bootstrap(context, LilCritters.MOD_ID));

    public LCBiomeModifiers(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(LilCritters.MOD_ID));
    }

    @Override
    public String getName() {
        return "Biome Modifier Registries: " + LilCritters.MOD_ID;
    }
}
