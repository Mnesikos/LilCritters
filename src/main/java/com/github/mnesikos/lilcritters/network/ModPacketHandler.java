package com.github.mnesikos.lilcritters.network;

import com.github.mnesikos.lilcritters.util.Ref;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModPacketHandler {
	
	public static SimpleNetworkWrapper net;
	private static int ID = 0;

	public static void initPackets() {
		net = NetworkRegistry.INSTANCE.newSimpleChannel(Ref.MODID.toUpperCase());
		registerMessage(MessageSquirrelEat.Handler.class, MessageSquirrelEat.class);
	}
	
	private static void registerMessage(Class packet, Class message) {
		net.registerMessage(packet, message, ID, Side.CLIENT);
		net.registerMessage(packet, message, ID, Side.SERVER);
		ID++;
	}
}