package com.github.mnesikos.lilcritters;

import com.github.mnesikos.lilcritters.entity.*;
import com.github.mnesikos.lilcritters.init.ModEntities;
import com.github.mnesikos.lilcritters.init.ModItems;
import com.github.mnesikos.lilcritters.proxy.CommonProxy;
import com.github.mnesikos.lilcritters.util.DietHandlerLC;
import com.github.mnesikos.lilcritters.util.Ref;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;
import org.zawamod.entity.base.ZAWABaseWater;
import org.zawamod.entity.core.DamageHandler;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.entity.core.EnrichmentHandler;
import org.zawamod.entity.water.EntityFishBase;
import org.zawamod.init.ZAWAItems;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACCEPTED_VERSIONS,
		updateJSON = Ref.UPDATE_JSON, dependencies = Ref.DEPENDS)
public class LilCritters {
	@Mod.Instance
	public static LilCritters instance;
	
	@SidedProxy(clientSide=Ref.CLIENT_PROXY, serverSide=Ref.SERVER_PROXY)
	public static CommonProxy PROXY;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Adding new enrichment objects
		//new EnrichmentHandler.EnrichmentObject(ModBlocks.BIRD_FEEDER, 1.0F, 1.0F);
		//new EnrichmentHandler.EnrichmentObject(ModBlocks.HOLLOW_LOG, 1.0F, 1.0F);
		//new EnrichmentHandler.EnrichmentObject(ModBlocks.BABY_POOL, 1.0F, 1.0F);
		//new EnrichmentHandler.EnrichmentObject(ModBlocks.SPRINKLER, 1.0F, 1.0F);
		//new EnrichmentHandler.EnrichmentObject(ModItems.CARDBOARD_BOX, 1.0F, 1.0F);
		//new EnrichmentHandler.EnrichmentObject(ModItems.SMALL_BALL, 1.0F, 1.0F);

		//Adding LC entities to preexisting enrichment objects
		EnrichmentHandler.SALT.validityList.add(EntityTuftedDeer.class);
		EnrichmentHandler.WHEEL.invalidityList.addAll(Stream.of(EntityBoxTurtle.class, EntityDwarfCrocodile.class, EntityTuftedDeer.class).collect(Collectors.toList()));
		EnrichmentHandler.HAY_BALL.validityList.add(EntityTuftedDeer.class);
		EnrichmentHandler.HEAT_LAMP.validityList.addAll(Stream.of(EntityBoxTurtle.class, EntityDwarfCrocodile.class).collect(Collectors.toList()));
		EnrichmentHandler.BALL.invalidityList.addAll(Stream.of(EntityBoxTurtle.class, EntityDwarfCrocodile.class).collect(Collectors.toList()));
		EnrichmentHandler.BRUSH.invalidityList.addAll(Stream.of(EntityBoxTurtle.class, EntityDwarfCrocodile.class).collect(Collectors.toList()));

		//Registering diets for LC entities
		DietHandler.DIET_MAP.put(EntityBandedPenguin.class, DietHandlerLC.AQUATIC_CARNIVORE);
		DietHandler.DIET_MAP.put(EntityBoxTurtle.class, DietHandler.OPPORTUNIST);
		DietHandler.DIET_MAP.put(EntityDwarfCrocodile.class, DietHandler.CARNIVORE_FISH);
		DietHandler.DIET_MAP.put(EntityOpossum.class, DietHandler.OPPORTUNIST);
		DietHandler.DIET_MAP.put(EntitySkunk.class, DietHandler.OMNIVORE);
		DietHandler.DIET_MAP.put(EntitySmallClawedOtter.class, DietHandlerLC.AQUATIC_CARNIVORE);
		DietHandler.DIET_MAP.put(EntityTreeSquirrel.class, DietHandler.OPPORTUNIST);
		DietHandler.DIET_MAP.put(EntityTuftedDeer.class, DietHandlerLC.DEER);

		//Registering damage here will allow the ZAWABase to handle how much damage to deal depending on difficulty
		DamageHandler.DAMAGE_MAP.put(EntityDwarfCrocodile.class, 5.0F);
		DamageHandler.DAMAGE_MAP.put(EntityTreeSquirrel.class, 1.0F);

		//Registering spawn eggs here will allow the NPCs to sell the entities spawn egg
		ZAWAItems.SPAWN_EGG_DATA.put(EntityBandedPenguin.class, new ItemStack(ModItems.BANDED_PENGUIN_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntityBoxTurtle.class, new ItemStack(ModItems.BOX_TURTLE_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntityDwarfCrocodile.class, new ItemStack(ModItems.DWARF_CROCODILE_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntityOpossum.class, new ItemStack(ModItems.OPOSSUM_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntitySkunk.class, new ItemStack(ModItems.SKUNK_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntitySmallClawedOtter.class, new ItemStack(ModItems.SMALL_CLAWED_OTTER_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntityTreeSquirrel.class, new ItemStack(ModItems.TREE_SQUIRREL_SPAWN_EGG));
		ZAWAItems.SPAWN_EGG_DATA.put(EntityTuftedDeer.class, new ItemStack(ModItems.TUFTED_DEER_SPAWN_EGG));

		PROXY.postInit(event);
	}

	@Mod.EventHandler
	public static void serverStarting(FMLServerStartingEvent event) {
		DietHandlerLC.registerFoodItems();
	}

	@Mod.EventBusSubscriber(modid = Ref.MODID)
	public static class Handlers {
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
			final IForgeRegistry<EntityEntry> registry = event.getRegistry();
			int id = 0;
			for (ModEntities.EntityContainer a : ModEntities.CONTAINERS){
				EntityEntry entry = EntityEntryBuilder.create().entity(a.entityClass).id(new ResourceLocation(Ref.MODID, a.entityName), id++).name(Ref.MODID + "." + a.entityName).tracker(1024, 1, true).build();
				if (ZAWABaseWater.class.isAssignableFrom(a.entityClass) || EntityFishBase.class.isAssignableFrom(a.entityClass)) {
					EntitySpawnPlacementRegistry.setPlacementType(a.entityClass, EntityLiving.SpawnPlacementType.IN_WATER);
				}
				registry.register(entry);
			}
		}
	}
}
