package com.github.mnesikos.lilcritters.proxy;

import com.github.mnesikos.lilcritters.init.ModEntities;

import com.github.mnesikos.lilcritters.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModEntities.initModels();
	}

	@SubscribeEvent
	public static void registerItemModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(ModItems.ACORN, 0, new ModelResourceLocation("lilcritters:acorn"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ROASTED_ACORN, 0, new ModelResourceLocation("lilcritters:roasted_acorn"));
		ModelLoader.setCustomModelResourceLocation(ModItems.PINE_CONE, 0, new ModelResourceLocation("lilcritters:pine_cone"));

		ModelLoader.setCustomModelResourceLocation(ModItems.RODENT_KIBBLE, 0, new ModelResourceLocation("lilcritters:rodent_kibble"));
		ModelLoader.setCustomModelResourceLocation(ModItems.RODENT_VIAL, 0, new ModelResourceLocation("lilcritters:rodent_vial"));
	}
}
