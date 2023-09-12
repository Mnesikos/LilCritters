package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class LCEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(LilCritters.MOD_ID, Zawa.ENTITIES_GROUP);

    public static final RegistryObject<EntityType<BandedPenguinEntity>> BANDED_PENGUIN = REGISTRY.builder(BandedPenguinEntity::new, EntityClassification.CREATURE)
            .attributes(BandedPenguinEntity::registerBandedPenguinAttributes)
            .renderer(() -> BandedPenguinRenderer::new)
            .spawn(ZawaSpawnCategory.COASTAL_DESERT, 5, 4, 8)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.8F).clientTrackingRange(10))
            .build("banded_penguin");

    public static final RegistryObject<EntityType<BoxTurtleEntity>> BOX_TURTLE = REGISTRY.builder(BoxTurtleEntity::new, EntityClassification.CREATURE)
            .attributes(BoxTurtleEntity::registerBoxTurtleAttributes)
            .renderer(() -> BoxTurtleRenderer::new)
            .spawnVariant(BoxTurtleEntity.VARIANT_SPAWNS, 5, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build("box_turtle");

    public static final RegistryObject<EntityType<BullfrogEntity>> BULLFROG = REGISTRY.builder(BullfrogEntity::new, EntityClassification.CREATURE)
            .attributes(BullfrogEntity::registerBullfrogAttributes)
            .renderer(() -> BullfrogRenderer::new)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("bullfrog");

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = REGISTRY.builder(CapybaraEntity::new, EntityClassification.CREATURE)
            .attributes(CapybaraEntity::registerCapybaraAttributes)
            .renderer(() -> CapybaraRenderer::new)
            .spawn(ZawaSpawnCategory.DRY_RAINFOREST, 10, 3, 6)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
            .build("capybara");

    public static final RegistryObject<EntityType<DartFrogEntity>> DART_FROG = REGISTRY.builder(DartFrogEntity::new, EntityClassification.CREATURE)
            .attributes(DartFrogEntity::registerDartFrogAttributes)
            .renderer(() -> DartFrogRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build("dart_frog");

    public static final RegistryObject<EntityType<DwarfCrocodileEntity>> DWARF_CROCODILE = REGISTRY.builder(DwarfCrocodileEntity::new, EntityClassification.CREATURE)
            .attributes(DwarfCrocodileEntity::registerDwarfCrocodileAttributes)
            .renderer(() -> DwarfCrocodileRenderer::new)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(1.0F, 0.5F).clientTrackingRange(10))
            .build("dwarf_crocodile");

    public static final RegistryObject<EntityType<GuineaPigEntity>> GUINEA_PIG = REGISTRY.builder(GuineaPigEntity::new, EntityClassification.CREATURE)
            .attributes(GuineaPigEntity::registerGuineaPigAttributes)
            .renderer(() -> GuineaPigRenderer::new)
            .spawn(ZawaSpawnCategory.TROPICAL_ALPINE, 15, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build("guinea_pig");

    public static final RegistryObject<EntityType<MysterySnailEntity>> MYSTERY_SNAIL = REGISTRY.builder(MysterySnailEntity::new, EntityClassification.WATER_AMBIENT)
            .attributes(MysterySnailEntity::registerMysterySnailAttributes)
            .renderer(() -> MysterySnailRenderer::new)
            .spawns(10, 2, 6, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.FAST_FRESH_WATER)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
            .build("mystery_snail");

    public static final RegistryObject<EntityType<OpossumEntity>> OPOSSUM = REGISTRY.builder(OpossumEntity::new, EntityClassification.CREATURE)
            .attributes(OpossumEntity::registerOpossumAttributes)
            .renderer(() -> OpossumRenderer::new)
            .spawnVariant(OpossumEntity.VARIANT_SPAWNS, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build("opossum");

    public static final RegistryObject<EntityType<PacmanFrogEntity>> PACMAN_FROG = REGISTRY.builder(PacmanFrogEntity::new, EntityClassification.CREATURE)
            .attributes(PacmanFrogEntity::registerPacmanFrogAttributes)
            .renderer(() -> PacmanFrogRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("pacman_frog");

    public static final RegistryObject<EntityType<PondSliderEntity>> POND_SLIDER = REGISTRY.builder(PondSliderEntity::new, EntityClassification.CREATURE)
            .attributes(PondSliderEntity::registerPondSliderAttributes)
            .renderer(() -> PondSliderRenderer::new)
            .spawn(ZawaSpawnCategory.WET_FOREST, 10, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("pond_slider");

    public static final RegistryObject<EntityType<PumpkinToadletEntity>> PUMPKIN_TOADLET = REGISTRY.builder(PumpkinToadletEntity::new, EntityClassification.CREATURE)
            .attributes(PumpkinToadletEntity::registerPumpkinToadletAttributes)
            .renderer(() -> PumpkinToadletRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build("pumpkin_toadlet");

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = REGISTRY.builder(RaccoonEntity::new, EntityClassification.CREATURE)
            .attributes(RaccoonEntity::registerRaccoonAttributes)
            .renderer(() -> RaccoonRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 15, 2, 4)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.6F).clientTrackingRange(10))
            .build("raccoon");

    public static final RegistryObject<EntityType<SkunkEntity>> SKUNK = REGISTRY.builder(SkunkEntity::new, EntityClassification.CREATURE)
            .attributes(SkunkEntity::registerSkunkAttributes)
            .renderer(() -> SkunkRenderer::new)
            .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.TEMPERATE_FOREST)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build("skunk");

    public static final RegistryObject<EntityType<SmallClawedOtterEntity>> SMALL_CLAWED_OTTER = REGISTRY.builder(SmallClawedOtterEntity::new, EntityClassification.CREATURE)
            .attributes(SmallClawedOtterEntity::registerSmallClawedOtterAttributes)
            .renderer(() -> SmallClawedOtterRenderer::new)
            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 5, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10))
            .build("small_clawed_otter");

    public static final RegistryObject<EntityType<TomatoFrogEntity>> TOMATO_FROG = REGISTRY.builder(TomatoFrogEntity::new, EntityClassification.CREATURE)
            .attributes(TomatoFrogEntity::registerTomatoFrogAttributes)
            .renderer(() -> TomatoFrogRenderer::new)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("tomato_frog");

    public static final RegistryObject<EntityType<TreeMonitorEntity>> TREE_MONITOR = REGISTRY.builder(TreeMonitorEntity::new, EntityClassification.CREATURE)
            .attributes(TreeMonitorEntity::registerTreeMonitorAttributes)
            .renderer(() -> TreeMonitorRenderer::new)
            .spawn(ZawaSpawnCategory.WET_RAINFOREST, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build("tree_monitor");

    public static final RegistryObject<EntityType<TreeSquirrelEntity>> TREE_SQUIRREL = REGISTRY.builder(TreeSquirrelEntity::new, EntityClassification.CREATURE)
            .attributes(TreeSquirrelEntity::registerTreeSquirrelAttributes)
            .renderer(() -> TreeSquirrelRenderer::new)
            .spawnVariant(TreeSquirrelEntity.VARIANT_SPAWNS, 15, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build("tree_squirrel");

    public static final RegistryObject<EntityType<TuftedDeerEntity>> TUFTED_DEER = REGISTRY.builder(TuftedDeerEntity::new, EntityClassification.CREATURE)
            .attributes(TuftedDeerEntity::registerTuftedDeerAttributes)
            .renderer(() -> TuftedDeerRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_ALPINE, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.8F, 1.2F).clientTrackingRange(10))
            .build("tufted_deer");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(BANDED_PENGUIN.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(BOX_TURTLE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(BULLFROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(CAPYBARA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(DART_FROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(DWARF_CROCODILE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(GUINEA_PIG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MYSTERY_SNAIL.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseAmbientEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(OPOSSUM.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(PACMAN_FROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(POND_SLIDER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(PUMPKIN_TOADLET.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(RACCOON.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SKUNK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SMALL_CLAWED_OTTER.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(TOMATO_FROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TREE_MONITOR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TREE_SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TUFTED_DEER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }
}
