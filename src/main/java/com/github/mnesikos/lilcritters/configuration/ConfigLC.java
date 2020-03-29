package com.github.mnesikos.lilcritters.configuration;

import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.zawamod.util.SpawnUtils;

import static com.github.mnesikos.lilcritters.init.ModEntities.excludeBiomes;
import static com.github.mnesikos.lilcritters.init.ModEntities.getAllBiomesOf;
import static org.zawamod.util.SpawnUtils.mergeBiomes;

@Config(modid = Ref.MODID, name = "LilCritters-" + Ref.VERSION +"/"+ Ref.MODID)
@Config.LangKey("config.lilcritters.title")
public class ConfigLC {
    @Config.Name("Separate Natural Spawns")
    @Config.Comment("Set this to true if you'd like Lil' Critters to spawn despite ZAWA's Natural Spawning settings.")
    public static boolean separateNaturalSpawns = false;
    @Config.Name("Natural Spawns")
    @Config.Comment("This only works if Separate Natural Spawns is set to true. Set this to false to disable all Lil' Critters spawning.")
    public static boolean naturalSpawns = true;

    @Config.Name("Tree Seed Drops")
    @Config.Comment("Set this to false if you wish to disable acorns and pine cones from dropping from leaves.")
    public static boolean enableTreeSeedDrops = true;
    @Config.Name("Tree Seed Drops Chance")
    @Config.Comment("Set this to adjust acorn and pine cone drop rates.")
    @Config.RangeDouble(min = 0.0, max = 1.0)
    public static double treeSeedDropsChance = 0.08;

    @Config.Comment("Spawns Configuration")
    public static final Spawns spawns = new Spawns();
    public static class Spawns {
        @Config.Name("Tree Squirrels")
        public final SpawnSettings tree_squirrel = new SpawnSettings(30, 1, 2, SpawnUtils.getBiomeIDS(getAllBiomesOf(BiomeDictionary.Type.FOREST)));
        @Config.Name("Box Turtles")
        public final SpawnSettings box_turtle = new SpawnSettings(20, 1, 1, SpawnUtils.getBiomeIDS(excludeBiomes(getAllBiomesOf(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.PLAINS), BiomeDictionary.Type.COLD)));
        @Config.Name("Tufted Deer")
        public final SpawnSettings tufted_deer = new SpawnSettings(10, 1, 1, SpawnUtils.getBiomeIDS(getAllBiomesOf(BiomeDictionary.Type.HILLS, BiomeDictionary.Type.FOREST)));
        @Config.Name("Skunks")
        public final SpawnSettings skunk = new SpawnSettings(10, 1, 2, SpawnUtils.getBiomeIDS(getAllBiomesOf(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.SAVANNA)));
        @Config.Name("Opossum")
        public final SpawnSettings opossum = new SpawnSettings(20, 1, 1, SpawnUtils.getBiomeIDS(excludeBiomes(getAllBiomesOf(BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.SWAMP), BiomeDictionary.Type.COLD)));
        @Config.Name("Dwarf Crocodile")
        public final SpawnSettings dwarf_crocodile = new SpawnSettings(10, 1, 1, SpawnUtils.getBiomeIDS(excludeBiomes(getAllBiomesOf(BiomeDictionary.Type.RIVER, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WET, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.FOREST), BiomeDictionary.Type.COLD)));
        @Config.Name("Small Clawed Otter")
        public final SpawnSettings small_clawed_otter = new SpawnSettings(20, 4, 6, SpawnUtils.getBiomeIDS(getAllBiomesOf(BiomeDictionary.Type.RIVER, BiomeDictionary.Type.BEACH)));
        @Config.Name("Banded Penguin")
        public final SpawnSettings banded_penguin = new SpawnSettings(15, 4, 8, SpawnUtils.getBiomeIDS(getAllBiomesOf(BiomeDictionary.Type.BEACH)));
    }

    public static class SpawnSettings {
        @Config.Name("Spawn Chance")
        public int spawnChance;
        @Config.Name("Min Group")
        public int minGroup;
        @Config.Name("Max Group")
        public int maxGroup;
        @Config.Name("Spawn Biomes")
        public String[] biomes;

        SpawnSettings(int spawnChance, int minGroup, int maxGroup, String[] biomes) {
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
            this.biomes = biomes;
        }
    }

    @Mod.EventBusSubscriber(modid = Ref.MODID)
    private static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Ref.MODID)) {
                ConfigManager.sync(Ref.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
