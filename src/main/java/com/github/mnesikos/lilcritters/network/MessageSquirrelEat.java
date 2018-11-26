package com.github.mnesikos.lilcritters.network;

import com.github.mnesikos.lilcritters.entity.EntityTreeSquirrel;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSquirrelEat implements IMessage {
	private int entityId;
	private NBTTagCompound entitySyncDataCompound;
	
	public MessageSquirrelEat() {
	}

	public MessageSquirrelEat(int parEntityId, NBTTagCompound parTagCompound) {
		entityId = parEntityId;
		entitySyncDataCompound = parTagCompound;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		entityId = ByteBufUtils.readVarInt(buf, 4);
		entitySyncDataCompound = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeVarInt(buf, entityId, 4);
		ByteBufUtils.writeTag(buf, entitySyncDataCompound);
	}

	public static class Handler implements IMessageHandler<MessageSquirrelEat, IMessage> {
		@Override
		public IMessage onMessage(MessageSquirrelEat message, MessageContext ctx) {
			EntityTreeSquirrel squirrel = (EntityTreeSquirrel) Minecraft.getMinecraft().player.world.getEntityByID(message.entityId);
			
			squirrel.setSquirrelSitting(true);
			squirrel.setSitting();
			
			if(message.entitySyncDataCompound != null)
				squirrel.setHeldFood(new ItemStack(message.entitySyncDataCompound));
			else
				squirrel.setHeldFood(ItemStack.EMPTY);
			
			return null;
		}
	}
}