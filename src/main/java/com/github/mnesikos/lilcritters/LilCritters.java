package com.github.mnesikos.lilcritters;

import com.github.mnesikos.lilcritters.client.model.LCModelLayers;
import com.github.mnesikos.lilcritters.data.LCBlockLoot;
import com.github.mnesikos.lilcritters.data.LCEntityLoot;
import com.github.mnesikos.lilcritters.data.LCRecipeProvider;
import com.github.mnesikos.lilcritters.data.LCTagsProviders;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import com.github.mnesikos.lilcritters.sounds.LCSounds;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.data.DataGenerator;
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

    public LilCritters() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        LCEntities.REGISTRY.initialize();
        LCItems.REGISTRAR.register(bus);
        LCSounds.REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::gatherData);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            LCItems.REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
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
//        LCTagsProviders.LCBlockTagsProvider blockTagsProvider = new LCTagsProviders.LCBlockTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper());
//        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
//        dataGenerator.addProvider(event.includeServer(), new LCTagsProviders.LCEntityTypeTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(
//                new LootTableProvider.SubProviderEntry(LCBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(LCEntityLoot::new, LootContextParamSets.ENTITY))));
//        dataGenerator.addProvider(event.includeServer(), new LCRecipeProvider(packOutput));
    }

    private void setupClient(final FMLClientSetupEvent event) {
        LCEntities.registerRenderers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : LCModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}
