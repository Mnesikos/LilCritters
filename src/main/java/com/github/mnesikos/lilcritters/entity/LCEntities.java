package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.*;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.thread.EffectiveSide;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.entity.SpawnInfo;
import org.zawamod.zawa.entity.base.ZawaBaseAmbientEntity;
import org.zawamod.zawa.entity.base.ZawaBaseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LCEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, LilCritters.MOD_ID);
    private static final List<Tuple<Supplier<EntityType<? extends LivingEntity>>, Supplier<AttributeModifierMap.MutableAttribute>>> ATTRIBUTES = new ArrayList<>();
    private static final List<Tuple<Supplier<EntityType<?>>, Supplier<IRenderFactory<?>>>> RENDERERS = new ArrayList<>();
    public static final Map<ResourceLocation, SpawnInfo> SPAWN_INFOS = new HashMap<>();

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
        EntitySpawnPlacementRegistry.register(BULLFROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(CAPYBARA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(DART_FROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(DWARF_CROCODILE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(GUINEA_PIG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MYSTERY_SNAIL.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseAmbientEntity::checkAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(OPOSSUM.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(PACMAN_FROG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(POND_SLIDER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(PUMPKIN_TOADLET.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(RACCOON.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SKUNK.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(SMALL_CLAWED_OTTER.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkSemiAquaticSpawnRules);
        EntitySpawnPlacementRegistry.register(TREE_MONITOR.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TREE_SQUIRREL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkLandSpawnRulesWithLeaves);
        EntitySpawnPlacementRegistry.register(TUFTED_DEER.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
    }

    public static void registerAttributes(BiConsumer<EntityType<? extends LivingEntity>, AttributeModifierMap.MutableAttribute> register) {
        for (Tuple<Supplier<EntityType<? extends LivingEntity>>, Supplier<AttributeModifierMap.MutableAttribute>> attribute : ATTRIBUTES)
            register.accept(attribute.getA().get(), attribute.getB().get());
        ATTRIBUTES.clear();
    }

    public static void registerRenderers() {
        for (Tuple<Supplier<EntityType<?>>, Supplier<IRenderFactory<?>>> renderer : RENDERERS)
            RenderingRegistry.registerEntityRenderingHandler(renderer.getA().get(), cast(renderer.getB().get()));

        RENDERERS.clear();
    }

    @SuppressWarnings("unchecked")
    private static <T, F> T cast(F from) {
        return (T) from;
    }

    public static class Builder<T extends Entity> {
        private final EntityType.IFactory<T> factory;
        private final EntityClassification category;
        private Supplier<AttributeModifierMap.MutableAttribute> attributes;
        private Supplier<IRenderFactory<? super T>> renderer;
        private boolean noSpawnEgg = false;
        private Consumer<EntityType.Builder<T>> builderConsumer;
        private ZawaSpawnCategory spawnCategory;
        private ZawaSpawnCategory[] spawnCategories;
        private List<Tuple<String, ZawaSpawnCategory>> variantSpawns;
        private int spawnChance;
        private int minGroup;
        private int maxGroup;

        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            this.factory = factory;
            this.category = category;
        }

        public Builder<T> attributes(Supplier<AttributeModifierMap.MutableAttribute> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder<T> renderer(Supplier<IRenderFactory<? super T>> renderer) {
            this.renderer = renderer;
            return this;
        }

        public Builder<T> noSpawnEgg() {
            this.noSpawnEgg = true;
            return this;
        }

        public Builder<T> spawn(ZawaSpawnCategory category, int spawnChance, int minGroup, int maxGroup) {
            this.spawnCategory = category;
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
            return this;
        }

        public Builder<T> spawnVariant(List<Tuple<String, ZawaSpawnCategory>> variantSpawns, int spawnChance, int minGroup, int maxGroup) {
            this.variantSpawns = variantSpawns;
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
            return this;
        }

        public Builder<T> spawns(int spawnChance, int minGroup, int maxGroup, ZawaSpawnCategory... categories) {
            this.spawnCategories = categories;
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
            return this;
        }

        public Builder<T> data(Consumer<EntityType.Builder<T>> consumer) {
            this.builderConsumer = consumer;
            return this;
        }

        public RegistryObject<EntityType<T>> build(DeferredRegister<EntityType<?>> registrar, String name) {
            RegistryObject<EntityType<T>> type = registrar.register(name, () -> {
                final EntityType.Builder<T> entityBuilder = EntityType.Builder.of(factory, category);
                if (builderConsumer != null) builderConsumer.accept(entityBuilder);
                return entityBuilder.build(LilCritters.MOD_ID + "." + name);
            });

            if (attributes != null) {
                ATTRIBUTES.add(new Tuple<>(cast(type), attributes));
            }

            if (EffectiveSide.get().isClient() && renderer != null) {
                RENDERERS.add(new Tuple<>(cast(type), cast(renderer)));
            }

            if (spawnCategory != null) {
                SpawnInfo spawnInfo = new SpawnInfo(type, name, minGroup, maxGroup, spawnChance, category);
                SPAWN_INFOS.put(new ResourceLocation(LilCritters.MOD_ID, name), spawnInfo);
                spawnCategory.spawnInfos.add(spawnInfo);
            }

            if (variantSpawns != null) {
                for (Tuple<String, ZawaSpawnCategory> variantSpawn : variantSpawns) {
                    String variantName = variantSpawn.getA() + "_" + name;
                    SpawnInfo spawnInfo = new SpawnInfo(type, variantName, minGroup, maxGroup, spawnChance, category);
                    SPAWN_INFOS.put(new ResourceLocation(LilCritters.MOD_ID, variantName), spawnInfo);
                    variantSpawn.getB().spawnInfos.add(spawnInfo);
                }
            }

            if (spawnCategories != null) {
                SpawnInfo spawnInfo = new SpawnInfo(type, name, minGroup, maxGroup, spawnChance, category);
                SPAWN_INFOS.put(new ResourceLocation(LilCritters.MOD_ID, name), spawnInfo);
                for (ZawaSpawnCategory zawaSpawnCategory : spawnCategories) {
                    zawaSpawnCategory.spawnInfos.add(spawnInfo);
                }
            }

            if (!noSpawnEgg) {
                LCItems.REGISTRAR.register(name + "_spawn_egg", () -> new ForgeSpawnEggItem(type, 16777215, 16777215, (new Item.Properties()).tab(Zawa.ENTITIES_GROUP)));
            }

            return type;
        }
    }
}
