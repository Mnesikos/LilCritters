package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.client.render.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.entity.ZawaEntities;
import org.zawamod.zawa.entity.base.ZawaBaseEntity;

public class LCEntities extends ZawaEntities {
    public static final RegistryObject<EntityType<BandedPenguinEntity>> BANDED_PENGUIN = new Builder<>(BandedPenguinEntity::new, EntityClassification.CREATURE)
            .attributes(BandedPenguinEntity::registerBandedPenguinAttributes)
            .renderer(() -> BandedPenguinRenderer::new)
            .spawn(ZawaSpawnCategory.COASTAL_DESERT, 8, 4, 8)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.8F).clientTrackingRange(10))
            .build(REGISTRAR, "banded_penguin");

    public static final RegistryObject<EntityType<BoxTurtleEntity>> BOX_TURTLE = new Builder<>(BoxTurtleEntity::new, EntityClassification.CREATURE)
            .attributes(BoxTurtleEntity::registerBoxTurtleAttributes)
            .renderer(() -> BoxTurtleRenderer::new)
            .spawn(ZawaSpawnCategory.DRY_FOREST, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.5F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "box_turtle");

    public static final RegistryObject<EntityType<DwarfCrocodileEntity>> DWARF_CROCODILE = new Builder<>(DwarfCrocodileEntity::new, EntityClassification.CREATURE)
            .attributes(DwarfCrocodileEntity::registerDwarfCrocodileAttributes)
            .renderer(() -> DwarfCrocodileRenderer::new)
            .spawn(ZawaSpawnCategory.SLOW_FRESH_WATER, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(1.0F, 0.5F).clientTrackingRange(10))
            .build(REGISTRAR, "dwarf_crocodile");

    public static final RegistryObject<EntityType<OpossumEntity>> OPOSSUM = new Builder<>(OpossumEntity::new, EntityClassification.CREATURE)
            .attributes(OpossumEntity::registerOpossumAttributes)
            .renderer(() -> OpossumRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 10, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.5F).clientTrackingRange(10))
            .build(REGISTRAR, "opossum");

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = new Builder<>(RaccoonEntity::new, EntityClassification.CREATURE)
            .attributes(RaccoonEntity::registerRaccoonAttributes)
            .renderer(() -> RaccoonRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 8, 1, 1)
            .data(tBuilder -> tBuilder.sized(0.8F, 0.6F).clientTrackingRange(10))
            .build(REGISTRAR, "raccoon");

    public static final RegistryObject<EntityType<SkunkEntity>> SKUNK = new Builder<>(SkunkEntity::new, EntityClassification.CREATURE)
            .attributes(SkunkEntity::registerSkunkAttributes)
            .renderer(() -> SkunkRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 5, 1, 2)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
            .build(REGISTRAR, "skunk");

    public static final RegistryObject<EntityType<SmallClawedOtterEntity>> SMALL_CLAWED_OTTER = new Builder<>(SmallClawedOtterEntity::new, EntityClassification.CREATURE)
            .attributes(SmallClawedOtterEntity::registerSmallClawedOtterAttributes)
            .renderer(() -> SmallClawedOtterRenderer::new)
            .spawn(ZawaSpawnCategory.FAST_FRESH_WATER, 10, 4, 6)
            .data(tBuilder -> tBuilder.sized(0.6F, 0.4F).clientTrackingRange(10))
            .build(REGISTRAR, "small_clawed_otter");

    public static final RegistryObject<EntityType<TuftedDeerEntity>> TUFTED_DEER = new Builder<>(TuftedDeerEntity::new, EntityClassification.CREATURE)
            .attributes(TuftedDeerEntity::registerTuftedDeerAttributes)
            .renderer(() -> TuftedDeerRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_ALPINE, 5, 1, 1)
            .data(tBuilder -> tBuilder.sized(1.0F, 1.2F).clientTrackingRange(10))
            .build(REGISTRAR, "tufted_deer");

    public static final RegistryObject<EntityType<TreeSquirrelEntity>> TREE_SQUIRREL = new Builder<>(TreeSquirrelEntity::new, EntityClassification.CREATURE)
            .attributes(TreeSquirrelEntity::registerTreeSquirrelAttributes)
            .renderer(() -> TreeSquirrelRenderer::new)
            .spawn(ZawaSpawnCategory.TEMPERATE_FOREST, 15, 1, 2)
            .data(tBuilder -> tBuilder.sized(1.0f, 1.0f).clientTrackingRange(10))
            .build(REGISTRAR, "tree_squirrel");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(BANDED_PENGUIN.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(BOX_TURTLE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(DWARF_CROCODILE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(OPOSSUM.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(RACCOON.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SKUNK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SMALL_CLAWED_OTTER.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(TUFTED_DEER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(TREE_SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
    }
}
