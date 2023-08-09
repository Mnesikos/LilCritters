package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.*;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class LCEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, LilCritters.MOD_ID);

    public static final RegistryObject<EntityType<BandedPenguinEntity>> BANDED_PENGUIN = new Builder<>(BandedPenguinEntity::new, EntityClassification.CREATURE)
            .attributes(BandedPenguinEntity::registerBandedPenguinAttributes)
            .renderer(() -> BandedPenguinRenderer::new)
            .spawn(ZawaSpawnCategory.COASTAL_DESERT, 5, 4, 8)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.8F).clientTrackingRange(10))
            .build(REGISTRAR, "banded_penguin");

    public static final RegistryObject<EntityType<BoxTurtleEntity>> BOX_TURTLE = new Builder<>(BoxTurtleEntity::new, EntityClassification.CREATURE)
            .attributes(BoxTurtleEntity::registerBoxTurtleAttributes)
            .renderer(() -> BoxTurtleRenderer::new)
            .spawnVariant(BoxTurtleEntity.VARIANT_SPAWNS, 5, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "box_turtle");

    public static final RegistryObject<EntityType<BullfrogEntity>> BULLFROG = new Builder<>(BullfrogEntity::new, EntityClassification.CREATURE)
            .attributes(BullfrogEntity::registerBullfrogAttributes)
            .renderer(() -> BullfrogRenderer::new)
            .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "bullfrog");

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = new Builder<>(CapybaraEntity::new, EntityClassification.CREATURE)
            .attributes(CapybaraEntity::registerCapybaraAttributes)
            .renderer(() -> CapybaraRenderer::new)
            .spawn(ZawaSpawnCategory.DRY_RAINFOREST, 10, 3, 6)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
            .build(REGISTRAR, "capybara");

    public static final RegistryObject<EntityType<DartFrogEntity>> DART_FROG = new Builder<>(DartFrogEntity::new, EntityClassification.CREATURE)
            .attributes(DartFrogEntity::registerDartFrogAttributes)
            .renderer(() -> DartFrogRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build(REGISTRAR, "dart_frog");

    public static final RegistryObject<EntityType<DwarfCrocodileEntity>> DWARF_CROCODILE = new Builder<>(DwarfCrocodileEntity::new, EntityClassification.CREATURE)
            .attributes(DwarfCrocodileEntity::registerDwarfCrocodileAttributes)
            .renderer(() -> DwarfCrocodileRenderer::new)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(1.0F, 0.5F).clientTrackingRange(10))
            .build(REGISTRAR, "dwarf_crocodile");

    public static final RegistryObject<EntityType<GuineaPigEntity>> GUINEA_PIG = new Builder<>(GuineaPigEntity::new, EntityClassification.CREATURE)
            .attributes(GuineaPigEntity::registerGuineaPigAttributes)
            .renderer(() -> GuineaPigRenderer::new)
            .spawn(ZawaSpawnCategory.TROPICAL_ALPINE, 15, 2, 6)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "guinea_pig");

    public static final RegistryObject<EntityType<MysterySnailEntity>> MYSTERY_SNAIL = new Builder<>(MysterySnailEntity::new, EntityClassification.WATER_AMBIENT)
            .attributes(MysterySnailEntity::registerMysterySnailAttributes)
            .renderer(() -> MysterySnailRenderer::new)
            .spawns(10, 2, 6, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.FAST_FRESH_WATER)
            .data(tBuilder -> tBuilder.sized(0.4F, 0.4F).clientTrackingRange(4))
            .build(REGISTRAR, "mystery_snail");

    public static final RegistryObject<EntityType<OpossumEntity>> OPOSSUM = new Builder<>(OpossumEntity::new, EntityClassification.CREATURE)
            .attributes(OpossumEntity::registerOpossumAttributes)
            .renderer(() -> OpossumRenderer::new)
            .spawnVariant(OpossumEntity.VARIANT_SPAWNS, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build(REGISTRAR, "opossum");

    public static final RegistryObject<EntityType<PacmanFrogEntity>> PACMAN_FROG = new Builder<>(PacmanFrogEntity::new, EntityClassification.CREATURE)
            .attributes(PacmanFrogEntity::registerPacmanFrogAttributes)
            .renderer(() -> PacmanFrogRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "pacman_frog");

    public static final RegistryObject<EntityType<PondSliderEntity>> POND_SLIDER = new Builder<>(PondSliderEntity::new, EntityClassification.CREATURE)
            .attributes(PondSliderEntity::registerPondSliderAttributes)
            .renderer(() -> PondSliderRenderer::new)
            .spawn(ZawaSpawnCategory.WET_FOREST, 10, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "pond_slider");

    public static final RegistryObject<EntityType<PumpkinToadletEntity>> PUMPKIN_TOADLET = new Builder<>(PumpkinToadletEntity::new, EntityClassification.CREATURE)
            .attributes(PumpkinToadletEntity::registerPumpkinToadletAttributes)
            .renderer(() -> PumpkinToadletRenderer::new)
            .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 2, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
            .build(REGISTRAR, "pumpkin_toadlet");

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = new Builder<>(RaccoonEntity::new, EntityClassification.CREATURE)
            .attributes(RaccoonEntity::registerRaccoonAttributes)
            .renderer(() -> RaccoonRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 15, 2, 4)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.6F).clientTrackingRange(10))
            .build(REGISTRAR, "raccoon");

    public static final RegistryObject<EntityType<SkunkEntity>> SKUNK = new Builder<>(SkunkEntity::new, EntityClassification.CREATURE)
            .attributes(SkunkEntity::registerSkunkAttributes)
            .renderer(() -> SkunkRenderer::new)
            .spawns(10, 1, 3, ZawaSpawnCategory.DRY_GRASSLAND, ZawaSpawnCategory.TEMPERATE_FOREST)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build(REGISTRAR, "skunk");

    public static final RegistryObject<EntityType<SmallClawedOtterEntity>> SMALL_CLAWED_OTTER = new Builder<>(SmallClawedOtterEntity::new, EntityClassification.CREATURE)
            .attributes(SmallClawedOtterEntity::registerSmallClawedOtterAttributes)
            .renderer(() -> SmallClawedOtterRenderer::new)
            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 5, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "small_clawed_otter");

    public static final RegistryObject<EntityType<TomatoFrogEntity>> TOMATO_FROG = new Builder<>(TomatoFrogEntity::new, EntityClassification.CREATURE)
            .attributes(TomatoFrogEntity::registerTomatoFrogAttributes)
            .renderer(() -> TomatoFrogRenderer::new)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "tomato_frog");

    public static final RegistryObject<EntityType<TreeMonitorEntity>> TREE_MONITOR = new Builder<>(TreeMonitorEntity::new, EntityClassification.CREATURE)
            .attributes(TreeMonitorEntity::registerTreeMonitorAttributes)
            .renderer(() -> TreeMonitorRenderer::new)
            .spawn(ZawaSpawnCategory.WET_RAINFOREST, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build(REGISTRAR, "tree_monitor");

    public static final RegistryObject<EntityType<TreeSquirrelEntity>> TREE_SQUIRREL = new Builder<>(TreeSquirrelEntity::new, EntityClassification.CREATURE)
            .attributes(TreeSquirrelEntity::registerTreeSquirrelAttributes)
            .renderer(() -> TreeSquirrelRenderer::new)
            .spawnVariant(TreeSquirrelEntity.VARIANT_SPAWNS, 15, 1, 3)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build(REGISTRAR, "tree_squirrel");

    public static final RegistryObject<EntityType<TuftedDeerEntity>> TUFTED_DEER = new Builder<>(TuftedDeerEntity::new, EntityClassification.CREATURE)
            .attributes(TuftedDeerEntity::registerTuftedDeerAttributes)
            .renderer(() -> TuftedDeerRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_ALPINE, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.8F, 1.2F).clientTrackingRange(10))
            .build(REGISTRAR, "tufted_deer");

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

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(LilCritters.MOD_ID, LCItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }
    }
}
