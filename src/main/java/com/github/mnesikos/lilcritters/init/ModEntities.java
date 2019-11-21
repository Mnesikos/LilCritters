package com.github.mnesikos.lilcritters.init;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.*;
import com.github.mnesikos.lilcritters.configuration.LilCrittersConfig;
import com.github.mnesikos.lilcritters.entity.*;
import com.github.mnesikos.lilcritters.util.Ref;
import com.google.common.collect.Lists;
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

import java.util.List;
import java.util.Set;

public class ModEntities {

    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":tree_squirrel"), EntityTreeSquirrel.class, "tree_squirrel", id++, LilCritters.instance, 80, 1, true, 0x9D8B85, 0xC35D3A);
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":box_turtle"), EntityBoxTurtle.class, "box_turtle", id++, LilCritters.instance, 80, 1, true, 0x61380B, 0xFFBF00);
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":tufted_deer"), EntityTuftedDeer.class, "tufted_deer", id++, LilCritters.instance, 80, 3, true, 0x977858, 0xE8E5E3);
        //EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":skunk"), EntitySkunk.class, "skunk", id++, LilCritters.instance, 80, 1, true, 0x000, 0x000);
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":opossum"), EntityOpossum.class, "", id++, LilCritters.instance, 80, 1, true, 0x000, 0x000);
        /*EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":dwarf_crocodile"), EntityDwarfCrocodile.class, "", id++, LilCritters.instance, 80, 1, true, 0x000, 0x000);*/

        if ((ZAWAConfig.canSpawn && !LilCrittersConfig.separateNaturalSpawns) || (LilCrittersConfig.separateNaturalSpawns && LilCrittersConfig.naturalSpawns)) {
            EntityRegistry.addSpawn(EntityTreeSquirrel.class, LilCrittersConfig.spawns.tree_squirrel.spawnChance, LilCrittersConfig.spawns.tree_squirrel.minGroup, LilCrittersConfig.spawns.tree_squirrel.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.tree_squirrel.biomes)}));
            EntityRegistry.addSpawn(EntityBoxTurtle.class, LilCrittersConfig.spawns.box_turtle.spawnChance, LilCrittersConfig.spawns.box_turtle.minGroup, LilCrittersConfig.spawns.box_turtle.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.box_turtle.biomes)}));
            EntityRegistry.addSpawn(EntityTuftedDeer.class, LilCrittersConfig.spawns.tufted_deer.spawnChance, LilCrittersConfig.spawns.tufted_deer.minGroup, LilCrittersConfig.spawns.tufted_deer.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.tufted_deer.biomes)}));
            /*EntityRegistry.addSpawn(EntitySkunk.class, LilCrittersConfig.spawns.skunk.spawnChance, LilCrittersConfig.spawns.skunk.minGroup, LilCrittersConfig.spawns.skunk.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.skunk.biomes)}));*/
            EntityRegistry.addSpawn(EntityOpossum.class, LilCrittersConfig.spawns.opossum.spawnChance, LilCrittersConfig.spawns.opossum.minGroup, LilCrittersConfig.spawns.opossum.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.opossum.biomes)}));
            /*EntityRegistry.addSpawn(EntityDwarfCrocodile.class, LilCrittersConfig.spawns.dwarf_crocodile.spawnChance, LilCrittersConfig.spawns.dwarf_crocodile.minGroup, LilCrittersConfig.spawns.dwarf_crocodile.maxGroup, EnumCreatureType.CREATURE,
                    SpawnUtils.mergeBiomes(new Biome[][]{getBiomes(LilCrittersConfig.spawns.dwarf_crocodile.biomes)}));*/
        }

        LootTableList.register(EntityBoxTurtle.LOOT);
        //LootTableList.register(EntityDwarfCrocodile.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTreeSquirrel.class, RenderTreeSquirrel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBoxTurtle.class, RenderBoxTurtle::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTuftedDeer.class, RenderTuftedDeer::new);
        //RenderingRegistry.registerEntityRenderingHandler(EntitySkunk.class, RenderSkunk::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityOpossum.class, RenderOpossum::new);
        /*RenderingRegistry.registerEntityRenderingHandler(EntityDwarfCrocodile.class, RenderDwarfCrocodile::new);*/
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
