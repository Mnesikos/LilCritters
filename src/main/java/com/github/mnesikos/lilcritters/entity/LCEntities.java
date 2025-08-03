package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class LCEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(LilCritters.MOD_ID);

    public static final RegistryObject<EntityType<AmericanBadgerEntity>> AMERICAN_BADGER = REGISTRY.builder(AmericanBadgerEntity::new, MobCategory.CREATURE)
            .attributes(AmericanBadgerEntity::registerAmericanBadgerAttributes)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.6F).clientTrackingRange(10))
            .build("american_badger");

    public static final RegistryObject<EntityType<BallPythonEntity>> BALL_PYTHON = REGISTRY.builder(BallPythonEntity::new, MobCategory.CREATURE)
            .attributes(BallPythonEntity::registerBallPythonAttributes)
//            .spawn(ZawaSpawnCategory.COASTAL_DESERT, 5, 4, 8)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.8F).clientTrackingRange(10)) // todo
            .build("ball_python");

    public static final RegistryObject<EntityType<BandedPenguinEntity>> BANDED_PENGUIN = REGISTRY.builder(BandedPenguinEntity::new, MobCategory.CREATURE)
            .attributes(BandedPenguinEntity::registerBandedPenguinAttributes)
            .spawn(ZawaSpawnCategory.COASTAL_DESERT, 5, 4, 8)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.8F).clientTrackingRange(10))
            .build("banded_penguin");

    public static final RegistryObject<EntityType<BeardedDragonEntity>> BEARDED_DRAGON = REGISTRY.builder(BeardedDragonEntity::new, MobCategory.CREATURE)
            .attributes(BeardedDragonEntity::registerBeardedDragonAttributes)
            .spawns(5, 1, 3, ZawaSpawnCategory.HOT_DESERT, ZawaSpawnCategory.DRY_SAVANNA, ZawaSpawnCategory.DRY_FOREST)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build("bearded_dragon");

    public static final RegistryObject<EntityType<BoxTurtleEntity>> BOX_TURTLE = REGISTRY.builder(BoxTurtleEntity::new, MobCategory.CREATURE)
            .attributes(BoxTurtleEntity::registerBoxTurtleAttributes)
            .spawnVariant(BoxTurtleEntity.VARIANT_SPAWNS, 5, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build("box_turtle");

    public static final RegistryObject<EntityType<BullfrogEntity>> BULLFROG = REGISTRY.builder(BullfrogEntity::new, MobCategory.CREATURE)
            .attributes(BullfrogEntity::registerBullfrogAttributes)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("bullfrog");

    public static final RegistryObject<EntityType<BurrowingOwlEntity>> BURROWING_OWL = REGISTRY.builder(BurrowingOwlEntity::new, MobCategory.CREATURE)
            .attributes(BurrowingOwlEntity::registerBurrowingOwlAttributes)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 5, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.6F).clientTrackingRange(10))
            .build("burrowing_owl");

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = REGISTRY.builder(CapybaraEntity::new, MobCategory.CREATURE)
            .attributes(CapybaraEntity::registerCapybaraAttributes)
            .spawn(ZawaSpawnCategory.DRY_RAINFOREST, 10, 3, 6)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
            .build("capybara");

    public static final RegistryObject<EntityType<DartFrogEntity>> DART_FROG = REGISTRY.builder(DartFrogEntity::new, MobCategory.CREATURE)
            .attributes(DartFrogEntity::registerDartFrogAttributes)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build("dart_frog");

    public static final RegistryObject<EntityType<DwarfCrocodileEntity>> DWARF_CROCODILE = REGISTRY.builder(DwarfCrocodileEntity::new, MobCategory.CREATURE)
            .attributes(DwarfCrocodileEntity::registerDwarfCrocodileAttributes)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(1.0F, 0.5F).clientTrackingRange(10))
            .build("dwarf_crocodile");

    public static final RegistryObject<EntityType<FruitBatEntity>> FRUIT_BAT = REGISTRY.builder(FruitBatEntity::new, MobCategory.CREATURE)
            .attributes(FruitBatEntity::registerFruitBatAttributes)
//            .spawn(ZawaSpawnCategory.TROPICAL_ALPINE, 15, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10)) // todo
            .build("fruit_bat");

    public static final RegistryObject<EntityType<GuineaPigEntity>> GUINEA_PIG = REGISTRY.builder(GuineaPigEntity::new, MobCategory.CREATURE)
            .attributes(GuineaPigEntity::registerGuineaPigAttributes)
            .spawn(ZawaSpawnCategory.TROPICAL_ALPINE, 15, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build("guinea_pig");

    public static final RegistryObject<EntityType<MysterySnailEntity>> MYSTERY_SNAIL = REGISTRY.builder(MysterySnailEntity::new, MobCategory.WATER_AMBIENT)
            .attributes(MysterySnailEntity::registerMysterySnailAttributes)
            .spawns(10, 2, 6, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.FAST_FRESH_WATER)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
            .build("mystery_snail");

    public static final RegistryObject<EntityType<OpossumEntity>> OPOSSUM = REGISTRY.builder(OpossumEntity::new, MobCategory.CREATURE)
            .attributes(OpossumEntity::registerOpossumAttributes)
            .spawnVariant(OpossumEntity.VARIANT_SPAWNS, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build("opossum");

    public static final RegistryObject<EntityType<PacmanFrogEntity>> PACMAN_FROG = REGISTRY.builder(PacmanFrogEntity::new, MobCategory.CREATURE)
            .attributes(PacmanFrogEntity::registerPacmanFrogAttributes)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("pacman_frog");

    public static final RegistryObject<EntityType<PondSliderEntity>> POND_SLIDER = REGISTRY.builder(PondSliderEntity::new, MobCategory.CREATURE)
            .attributes(PondSliderEntity::registerPondSliderAttributes)
            .spawn(ZawaSpawnCategory.WET_FOREST, 10, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("pond_slider");

    public static final RegistryObject<EntityType<PrairieDogEntity>> PRAIRIE_DOG = REGISTRY.builder(PrairieDogEntity::new, MobCategory.CREATURE)
            .attributes(PrairieDogEntity::registerPrairieDogAttributes)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 15, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
            .build("prairie_dog");

    public static final RegistryObject<EntityType<PumpkinToadletEntity>> PUMPKIN_TOADLET = REGISTRY.builder(PumpkinToadletEntity::new, MobCategory.CREATURE)
            .attributes(PumpkinToadletEntity::registerPumpkinToadletAttributes)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build("pumpkin_toadlet");

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = REGISTRY.builder(RaccoonEntity::new, MobCategory.CREATURE)
            .attributes(RaccoonEntity::registerRaccoonAttributes)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 15, 2, 4)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.6F).clientTrackingRange(10))
            .build("raccoon");

    public static final RegistryObject<EntityType<SkunkEntity>> SKUNK = REGISTRY.builder(SkunkEntity::new, MobCategory.CREATURE)
            .attributes(SkunkEntity::registerSkunkAttributes)
            .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.TEMPERATE_FOREST)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build("skunk");

    public static final RegistryObject<EntityType<SmallClawedOtterEntity>> SMALL_CLAWED_OTTER = REGISTRY.builder(SmallClawedOtterEntity::new, MobCategory.CREATURE)
            .attributes(SmallClawedOtterEntity::registerSmallClawedOtterAttributes)
            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 5, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10))
            .build("small_clawed_otter");

    public static final RegistryObject<EntityType<SnappingTurtleEntity>> SNAPPING_TURTLE = REGISTRY.builder(SnappingTurtleEntity::new, MobCategory.CREATURE)
            .attributes(SnappingTurtleEntity::registerSnappingTurtleAttributes)
//            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 5, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10)) // todo
            .build("snapping_turtle");

    public static final RegistryObject<EntityType<SugarGliderEntity>> SUGAR_GLIDER = REGISTRY.builder(SugarGliderEntity::new, MobCategory.CREATURE)
            .attributes(SugarGliderEntity::registerSugarGliderAttributes)
//            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 5, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10)) // todo
            .build("sugar_glider");

    public static final RegistryObject<EntityType<TomatoFrogEntity>> TOMATO_FROG = REGISTRY.builder(TomatoFrogEntity::new, MobCategory.CREATURE)
            .attributes(TomatoFrogEntity::registerTomatoFrogAttributes)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build("tomato_frog");

    public static final RegistryObject<EntityType<TreeMonitorEntity>> TREE_MONITOR = REGISTRY.builder(TreeMonitorEntity::new, MobCategory.CREATURE)
            .attributes(TreeMonitorEntity::registerTreeMonitorAttributes)
            .spawn(ZawaSpawnCategory.WET_RAINFOREST, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build("tree_monitor");

    public static final RegistryObject<EntityType<TreeSquirrelEntity>> TREE_SQUIRREL = REGISTRY.builder(TreeSquirrelEntity::new, MobCategory.CREATURE)
            .attributes(TreeSquirrelEntity::registerTreeSquirrelAttributes)
            .spawnVariant(TreeSquirrelEntity.VARIANT_SPAWNS, 15, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build("tree_squirrel");

    public static final RegistryObject<EntityType<TuftedDeerEntity>> TUFTED_DEER = REGISTRY.builder(TuftedDeerEntity::new, MobCategory.CREATURE)
            .attributes(TuftedDeerEntity::registerTuftedDeerAttributes)
            .spawn(ZawaSpawnCategory.TEMPERATE_ALPINE, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.8F, 1.2F).clientTrackingRange(10))
            .build("tufted_deer");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(AMERICAN_BADGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BALL_PYTHON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BANDED_PENGUIN.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(BEARDED_DRAGON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(BOX_TURTLE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(BULLFROG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(BURROWING_OWL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(CAPYBARA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(DART_FROG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(DWARF_CROCODILE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(FRUIT_BAT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(GUINEA_PIG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MYSTERY_SNAIL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseAmbientEntity::checkAquaticSpawnRules);
        SpawnPlacements.register(OPOSSUM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(PACMAN_FROG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(POND_SLIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(PRAIRIE_DOG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(PUMPKIN_TOADLET.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(RACCOON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SKUNK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(SMALL_CLAWED_OTTER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(SNAPPING_TURTLE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        SpawnPlacements.register(SUGAR_GLIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(TOMATO_FROG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(TREE_MONITOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(TREE_SQUIRREL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        SpawnPlacements.register(TUFTED_DEER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }

    public static void registerRenderers() {
        EntityRenderers.register(AMERICAN_BADGER.get(), AmericanBadgerRenderer::new);
        EntityRenderers.register(BALL_PYTHON.get(), BallPythonRenderer::new);
        EntityRenderers.register(BANDED_PENGUIN.get(), BandedPenguinRenderer::new);
        EntityRenderers.register(BEARDED_DRAGON.get(), BeardedDragonRenderer::new);
        EntityRenderers.register(BOX_TURTLE.get(), BoxTurtleRenderer::new);
        EntityRenderers.register(BULLFROG.get(), BullfrogRenderer::new);
        EntityRenderers.register(BURROWING_OWL.get(), BurrowingOwlRenderer::new);
        EntityRenderers.register(CAPYBARA.get(), CapybaraRenderer::new);
        EntityRenderers.register(DART_FROG.get(), DartFrogRenderer::new);
        EntityRenderers.register(DWARF_CROCODILE.get(), DwarfCrocodileRenderer::new);
        EntityRenderers.register(FRUIT_BAT.get(), FruitBatRenderer::new);
        EntityRenderers.register(GUINEA_PIG.get(), GuineaPigRenderer::new);
        EntityRenderers.register(MYSTERY_SNAIL.get(), MysterySnailRenderer::new);
        EntityRenderers.register(OPOSSUM.get(), OpossumRenderer::new);
        EntityRenderers.register(PACMAN_FROG.get(), PacmanFrogRenderer::new);
        EntityRenderers.register(POND_SLIDER.get(), PondSliderRenderer::new);
        EntityRenderers.register(PRAIRIE_DOG.get(), PrairieDogRenderer::new);
        EntityRenderers.register(PUMPKIN_TOADLET.get(), PumpkinToadletRenderer::new);
        EntityRenderers.register(RACCOON.get(), RaccoonRenderer::new);
        EntityRenderers.register(SKUNK.get(), SkunkRenderer::new);
        EntityRenderers.register(SMALL_CLAWED_OTTER.get(), SmallClawedOtterRenderer::new);
        EntityRenderers.register(SNAPPING_TURTLE.get(), SnappingTurtleRenderer::new);
        EntityRenderers.register(SUGAR_GLIDER.get(), SugarGliderRenderer::new);
        EntityRenderers.register(TOMATO_FROG.get(), TomatoFrogRenderer::new);
        EntityRenderers.register(TREE_MONITOR.get(), TreeMonitorRenderer::new);
        EntityRenderers.register(TREE_SQUIRREL.get(), TreeSquirrelRenderer::new);
        EntityRenderers.register(TUFTED_DEER.get(), TuftedDeerRenderer::new);
    }
}
