package com.github.mnesikos.lilcritters.init;

import com.github.mnesikos.lilcritters.client.render.entity.*;
import com.github.mnesikos.lilcritters.configuration.ConfigLC;
import com.github.mnesikos.lilcritters.entity.*;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.configuration.ZAWAConfig;
import org.zawamod.configuration.ZAWASpawnConfiguration;
import org.zawamod.util.BiomeEdit;
import org.zawamod.util.SpawnUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModEntities {

    public static final List<EntityContainer> CONTAINERS = new ArrayList<>();

    static {
        add(EntityBandedPenguin.class, "bandedpenguin");
        add(EntityBoxTurtle.class, "boxturtle");
        add(EntityDwarfCrocodile.class, "dwarfcrocodile");
        add(EntityOpossum.class, "opossum");
        add(EntitySkunk.class, "skunk");
        add(EntitySmallClawedOtter.class, "smallclawedotter");
        add(EntityTreeSquirrel.class, "treesquirrel");
        add(EntityTuftedDeer.class, "tufteddeer");

    }

    private static void add(Class<? extends Entity> entityClass, String entityNameIn) {
        CONTAINERS.add(new EntityContainer(entityClass, entityNameIn));
    }

    public static class EntityContainer {
        public Class<? extends Entity> entityClass;
        public String entityName;

        public EntityContainer(Class<? extends Entity> EntityClass, String entityNameIn) {
            this.entityClass = EntityClass;
            this.entityName = entityNameIn;
        }
    }

    public static void init() {
        if ((ZAWAConfig.serverOptions.canSpawn && !ConfigLC.separateNaturalSpawns) || (ConfigLC.separateNaturalSpawns && ConfigLC.naturalSpawns)) {
            // BiomeEdit(add, remove)
            ZAWASpawnConfiguration.edits.put(EntityTreeSquirrel.class, new BiomeEdit(new String[0], new String[]{"biomesoplenty:bamboo_forest", "biomesoplenty:bog", "biomesoplenty:eucalyptus_forest", "biomesoplenty:land_of_lakes", "biomesoplenty:meadow", "biomesoplenty:mountain", "biomesoplenty:shield", "biomesoplenty:wetland"}));
            ZAWASpawnConfiguration.edits.put(EntityBoxTurtle.class, new BiomeEdit(new String[0], new String[]{"biomesoplenty:bamboo_forest", "biomesoplenty:eucalyptus_forest", "biomesoplenty:land_of_lakes", "biomesoplenty:mountain", "biomesoplenty:shield", "biomesoplenty:wetland", "biomesoplenty:mountain_foothills"}));
            ZAWASpawnConfiguration.edits.put(EntityTuftedDeer.class, new BiomeEdit(new String[]{"minecraft:extreme_hills_with_trees"}, new String[]{"minecraft:desert_hills", "biomesoplenty:crag", "biomesoplenty:grassland", "biomesoplenty:highland", "biomesoplenty:moor", "minecraft:mutated_swampland", "minecraft:mutated_ice_flats", "minecraft:ice_mountains"}));
            ZAWASpawnConfiguration.edits.put(EntitySkunk.class, new BiomeEdit(new String[]{"biomesoplenty:bayou", "biomesoplenty:dead_swamp", "biomesoplenty:lush_swamp", "biomesoplenty:marsh", "biomesoplenty:moor", "biomesoplenty:tropical_rainforest"}, new String[]{"biomesoplenty:outback", "biomesoplenty:bamboo_forest", "biomesoplenty:eucalyptus_forest", "biomesoplenty:land_of_lakes", "biomesoplenty:snowy_coniferous_forest", "biomesoplenty:snowy_forest"}));
            ZAWASpawnConfiguration.edits.put(EntityOpossum.class, new BiomeEdit(new String[]{"biomesoplenty:bog", "biomesoplenty:boreal_forest"}, new String[]{"biomesoplenty:bamboo_forest", "biomesoplenty:eucalyptus_forest", "biomesoplenty:mangrove", "biomesoplenty:outback", "biomesoplenty:tropical_island", "biomesoplenty:land_of_lakes"}));
            ZAWASpawnConfiguration.edits.put(EntityDwarfCrocodile.class, new BiomeEdit(new String[]{"biomesoplenty:bog", "biomesoplenty:dead_swamp"}, new String[]{"minecraft:extreme_hills_with_trees", "biomesoplenty:brushland", "biomesoplenty:cherry_blossom_grove", "biomesoplenty:quagmire", "biomesoplenty:eucalyptus_forest", "biomesoplenty:highland", "biomesoplenty:mystic_grove", "biomesoplenty:overgrown_cliffs", "biomesoplenty:rainforest", "biomesoplenty:temperate_rainforest", "biomesoplenty:tropical_rainforest", "biomesoplenty:outback", "biomesoplenty:xeric_shrubland", "biomesoplenty:mountain", "biomesoplenty:orchard", "biomesoplenty:redwood_forest", "biomesoplenty:mountain_foothills"}));
            ZAWASpawnConfiguration.edits.put(EntitySmallClawedOtter.class, new BiomeEdit(new String[]{"biomesoplenty:tropical_island"}, new String[0]));
            ZAWASpawnConfiguration.edits.put(EntityBandedPenguin.class, new BiomeEdit(new String[]{"biomesoplenty:tropical_island"}, new String[0]));

            ZAWASpawnConfiguration.add(EntityTreeSquirrel.class, "TreeSquirrels", 30, 1, 2, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.FOREST), BiomeDictionary.Type.JUNGLE));
            ZAWASpawnConfiguration.add(EntityBoxTurtle.class, "BoxTurtles", 20, 1, 1, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.PLAINS), BiomeDictionary.Type.COLD, BiomeDictionary.Type.JUNGLE));
            ZAWASpawnConfiguration.add(EntityTuftedDeer.class, "TuftedDeer", 10, 1, 1, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.HILLS, BiomeDictionary.Type.MOUNTAIN), BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.SPARSE));
            ZAWASpawnConfiguration.add(EntitySkunk.class, "Skunks", 10, 1, 2, EnumCreatureType.CREATURE, SpawnUtils.mergeBiomes(SpawnUtils.getBiomesOfType(BiomeDictionary.Type.FOREST), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.PLAINS), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.SAVANNA)));
            ZAWASpawnConfiguration.add(EntityOpossum.class, "Opossums", 20, 1, 1, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.SWAMP), BiomeDictionary.Type.COLD, BiomeDictionary.Type.JUNGLE));
            ZAWASpawnConfiguration.add(EntityDwarfCrocodile.class, "DwarfCrocodiles", 10, 1, 1, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.RIVER, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WET, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.FOREST), BiomeDictionary.Type.COLD, BiomeDictionary.Type.JUNGLE));
            ZAWASpawnConfiguration.add(EntitySmallClawedOtter.class, "SmallClawedOtters", 20, 4, 6, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.RIVER, BiomeDictionary.Type.BEACH), BiomeDictionary.Type.COLD));
            ZAWASpawnConfiguration.add(EntityBandedPenguin.class, "BandedPenguins", 15, 4, 8, EnumCreatureType.CREATURE, excludeBiomesByType(getAllBiomesOf(BiomeDictionary.Type.BEACH), BiomeDictionary.Type.COLD));

            /*EntityRegistry.addSpawn(EntityTreeSquirrel.class, ConfigLC.spawns.tree_squirrel.spawnChance, ConfigLC.spawns.tree_squirrel.minGroup, ConfigLC.spawns.tree_squirrel.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.tree_squirrel.biomes)}));
            EntityRegistry.addSpawn(EntityBoxTurtle.class, ConfigLC.spawns.box_turtle.spawnChance, ConfigLC.spawns.box_turtle.minGroup, ConfigLC.spawns.box_turtle.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.box_turtle.biomes)}));
            EntityRegistry.addSpawn(EntityTuftedDeer.class, ConfigLC.spawns.tufted_deer.spawnChance, ConfigLC.spawns.tufted_deer.minGroup, ConfigLC.spawns.tufted_deer.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.tufted_deer.biomes)}));
            EntityRegistry.addSpawn(EntitySkunk.class, ConfigLC.spawns.skunk.spawnChance, ConfigLC.spawns.skunk.minGroup, ConfigLC.spawns.skunk.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.skunk.biomes)}));
            EntityRegistry.addSpawn(EntityOpossum.class, ConfigLC.spawns.opossum.spawnChance, ConfigLC.spawns.opossum.minGroup, ConfigLC.spawns.opossum.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.opossum.biomes)}));
            EntityRegistry.addSpawn(EntityDwarfCrocodile.class, ConfigLC.spawns.dwarf_crocodile.spawnChance, ConfigLC.spawns.dwarf_crocodile.minGroup, ConfigLC.spawns.dwarf_crocodile.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.dwarf_crocodile.biomes)}));
            EntityRegistry.addSpawn(EntitySmallClawedOtter.class, ConfigLC.spawns.small_clawed_otter.spawnChance, ConfigLC.spawns.small_clawed_otter.minGroup, ConfigLC.spawns.small_clawed_otter.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.small_clawed_otter.biomes)}));
            EntityRegistry.addSpawn(EntityBandedPenguin.class, ConfigLC.spawns.banded_penguin.spawnChance, ConfigLC.spawns.banded_penguin.minGroup, ConfigLC.spawns.banded_penguin.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.banded_penguin.biomes)}));*/
        }

        LootTableList.register(EntityBoxTurtle.LOOT);
        LootTableList.register(EntityDwarfCrocodile.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBandedPenguin.class, RenderBandedPenguin::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBoxTurtle.class, RenderBoxTurtle::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDwarfCrocodile.class, RenderDwarfCrocodile::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityOpossum.class, RenderOpossum::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySkunk.class, RenderSkunk::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySmallClawedOtter.class, RenderSmallClawedOtter::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTreeSquirrel.class, RenderTreeSquirrel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTuftedDeer.class, RenderTuftedDeer::new);
    }

    /**
     * Registers all biomes of every type provided.
     *
     * @param type Biome types to include.
     * @return Biome array of all biomes retrieved from the type param.
     **/
    public static Biome[] getAllBiomesOf(BiomeDictionary.Type... type) {
        List<Biome> biomesOfType = Lists.newArrayList();
        for (BiomeDictionary.Type t : type) {
            for (Biome b : Biome.REGISTRY) {
                Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(b);
                if (types.contains(t)) {
                    biomesOfType.add(b);
                }
            }
        }

        return biomesOfType.toArray(new Biome[biomesOfType.size()]);
    }

    /**
     * Creates a list of biomes given then removes the excluded biome types given.
     *
     * @param include All biomes to include.
     * @param exclude The biome types to exclude of the previously given biomes.
     * @return Biome array of included biomes minus any excluded biome types.
     **/
    public static Biome[] excludeBiomesByType(Biome[] include, BiomeDictionary.Type... exclude) {
        List<Biome> biomesOfType = Lists.newArrayList();

        for(int i = 0; i < include.length; ++i) {
            biomesOfType.add(include[i]);

            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(include[i]);
            for (BiomeDictionary.Type t : exclude) {
                if (types.contains(t)) {
                    biomesOfType.remove(include[i]);
                }
            }
        }

        return biomesOfType.toArray(new Biome[biomesOfType.size()]);
    }
}
