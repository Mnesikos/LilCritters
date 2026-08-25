package com.github.mnesikos.lilcritters;

import com.github.mnesikos.lilcritters.block.LCBlocks;
import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.data.*;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import com.github.mnesikos.lilcritters.sounds.LCSounds;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.zawamod.zawa.Zawa;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

@Mod(LilCritters.MOD_ID)
public class LilCritters {
    public static final String MOD_ID = "lilcritters";
    public static final String[] PLUSHIES_LIST = new String[]{"opossum", "skunk", "squirrel"};

    public LilCritters() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        LCEntities.REGISTRY.initialize();
        LCItems.ITEMS_REGISTRAR.register(bus);
        LCItems.DECORATIONS_REGISTRAR.register(bus);
        LCBlocks.REGISTRAR.register(bus);
        LCSounds.REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::gatherData);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            LCItems.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.DECORATIONS_GROUP.getKey()) {
            LCItems.DECORATIONS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.ENTITIES_GROUP.getKey()) {
            LCEntities.REGISTRY.itemRegistrar.getEntries().forEach(item -> event.accept(item.get()));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        LCEntities.registerSpawnPlacements();
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        dataGenerator.addProvider(event.includeClient(), new LCBlockModels(packOutput, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeClient(), new LCBlockStates(packOutput, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeClient(), new LCItemModels(packOutput, event.getExistingFileHelper()));

        dataGenerator.addProvider(event.includeServer(), (DataProvider.Factory<LCBiomeModifiers>) output -> new LCBiomeModifiers(output, event.getLookupProvider()));
        LCTagsProviders.LCBlockTagsProvider blockTagsProvider = new LCTagsProviders.LCBlockTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper());
        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
        dataGenerator.addProvider(event.includeServer(), new LCTagsProviders.LCItemTagsProvider(packOutput, event.getLookupProvider(), blockTagsProvider, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeServer(), new LCTagsProviders.LCEntityTypeTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(LCBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(LCEntityLoot::new, LootContextParamSets.ENTITY))));
        dataGenerator.addProvider(event.includeServer(), new LCRecipeProvider(packOutput));
    }

    private void setupClient(final FMLClientSetupEvent event) {
        LCEntities.registerRenderers();
        LCBlocks.setRenderLayers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : LCModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}
