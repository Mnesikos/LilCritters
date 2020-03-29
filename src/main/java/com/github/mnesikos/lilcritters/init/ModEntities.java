package com.github.mnesikos.lilcritters.init;

import com.github.mnesikos.lilcritters.client.render.entity.*;
import com.github.mnesikos.lilcritters.configuration.ConfigLC;
import com.github.mnesikos.lilcritters.entity.*;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.configuration.ZAWAConfig;
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
            EntityRegistry.addSpawn(EntityTreeSquirrel.class, ConfigLC.spawns.tree_squirrel.spawnChance, ConfigLC.spawns.tree_squirrel.minGroup, ConfigLC.spawns.tree_squirrel.maxGroup, EnumCreatureType.CREATURE,
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
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(ConfigLC.spawns.banded_penguin.biomes)}));
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
    public static Biome[] excludeBiomes(Biome[] include, BiomeDictionary.Type... exclude) {
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

    /**
     * Get biomes as strings.
     *
     * @param strings Biomes.
     * @return Biome string.
     */
    private static Biome[] getBiomes(String[] strings) {
        Biome[] b = new Biome[strings.length];
        int i = 0;
        for (String s : strings) {
            try {
                b[i] = ForgeRegistries.BIOMES.getValue(new ResourceLocation(s));
                i++;
            } catch (NullPointerException e) {
                System.out.println("The specified biome \'" + s + "\' does not exist. This is an error of the player-set config.");
            }
        }
        return b;
    }
}
