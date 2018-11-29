package com.github.mnesikos.lilcritters.init;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.RenderBoxTurtle;
import com.github.mnesikos.lilcritters.client.render.entity.RenderTreeSquirrel;
//import com.github.mnesikos.lilcritters.client.render.entity.RenderTuftedDeer;
import com.github.mnesikos.lilcritters.configuration.LilCrittersConfig;
import com.github.mnesikos.lilcritters.entity.EntityBoxTurtle;
import com.github.mnesikos.lilcritters.entity.EntityTreeSquirrel;
//import com.github.mnesikos.lilcritters.entity.EntityTuftedDeer;
import com.github.mnesikos.lilcritters.util.Ref;
import com.google.common.collect.Lists;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.configuration.ZAWAConfig;

import java.util.List;
import java.util.Set;

public class ModEntities {

    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":treesquirrel"), EntityTreeSquirrel.class, "TreeSquirrel", id++, LilCritters.instance, 80, 3, true, 0x9D8B85, 0xC35D3A);
        EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":boxturtle"), EntityBoxTurtle.class, "BoxTurtle", id++, LilCritters.instance, 80, 3, true, 0x61380B, 0xFFBF00);

        //EntityRegistry.registerModEntity(new ResourceLocation(Ref.MODID + ":tufteddeer"), EntityTuftedDeer.class, "TuftedDeer", id++, LilCritters.instance, 80, 3, true, 0x977858, 0xE8E5E3);

        if ((ZAWAConfig.canSpawn && !LilCrittersConfig.separateNaturalSpawns) || (LilCrittersConfig.separateNaturalSpawns && LilCrittersConfig.naturalSpawns)) {
            EntityRegistry.addSpawn(EntityTreeSquirrel.class, LilCrittersConfig.spawns.squirrel.spawnChance, LilCrittersConfig.spawns.squirrel.minGroup, LilCrittersConfig.spawns.squirrel.maxGroup, EnumCreatureType.AMBIENT, getAllBiomesOf(BiomeDictionary.Type.FOREST));
            EntityRegistry.addSpawn(EntityBoxTurtle.class, LilCrittersConfig.spawns.turtle.spawnChance, LilCrittersConfig.spawns.turtle.minGroup, LilCrittersConfig.spawns.turtle.maxGroup, EnumCreatureType.AMBIENT, excludeBiomes(getAllBiomesOf(BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.PLAINS), BiomeDictionary.Type.COLD));

            //EntityRegistry.addSpawn(EntityTuftedDeer.class, LilCrittersConfig.spawns.tuftedDeer.spawnChance, LilCrittersConfig.spawns.tuftedDeer.minGroup, LilCrittersConfig.spawns.tuftedDeer.maxGroup, EnumCreatureType.CREATURE, getAllBiomesOf(BiomeDictionary.Type.HILLS, BiomeDictionary.Type.FOREST));
        }

        LootTableList.register(EntityBoxTurtle.LOOT);
    }

    private static Biome[] getAllBiomesOf(BiomeDictionary.Type... type) {
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

    private static Biome[] excludeBiomes(Biome[] include, BiomeDictionary.Type... exclude) {
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

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTreeSquirrel.class, RenderTreeSquirrel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBoxTurtle.class, RenderBoxTurtle::new);

        //RenderingRegistry.registerEntityRenderingHandler(EntityTuftedDeer.class, RenderTuftedDeer::new);
    }
}
