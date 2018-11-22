package com.github.mnesikos.lilcritters.configuration;

import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Ref.MODID)
@Config.LangKey("config.lilcritters.title")
public class LilCrittersConfig {
    @Config.Name("Separate Natural Spawns")
    @Config.Comment("Set this to true if you'd like Lil' Critters to spawn despite ZAWA's Natural Spawning settings.")
    public static boolean separateNaturalSpawns = false;
    @Config.Name("Natural Spawns")
    @Config.Comment("This only works if Separate Natural Spawns is set to true. Set this to false to disable all Lil' Critters spawning.")
    public static boolean naturalSpawns = true;

    @Config.Comment("Spawns Configuration")
    public static final Spawns spawns = new Spawns();
    public static class Spawns {
        @Config.Name("Tree Squirrels")
        public final SpawnSettings squirrel = new SpawnSettings(3, 1, 2);
        /*@Config.Name("Tufted Deer")
        public final SpawnSettings tuftedDeer = new SpawnSettings(2, 1, 1);*/
        @Config.Name("Box Turtles")
        public final SpawnSettings turtle = new SpawnSettings(3, 1, 1);
    }

    public static class SpawnSettings {
        @Config.Name("Spawn Chance")
        public int spawnChance;
        @Config.Name("Min Group")
        public int minGroup;
        @Config.Name("Max Group")
        public int maxGroup;

        SpawnSettings(int spawnChance, int minGroup, int maxGroup) {
            this.spawnChance = spawnChance;
            this.minGroup = minGroup;
            this.maxGroup = maxGroup;
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
