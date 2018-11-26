package com.github.mnesikos.lilcritters.network;

import com.github.mnesikos.lilcritters.entity.EntityTreeSquirrel;
import com.github.mnesikos.lilcritters.init.ModItems;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSquirrelEat implements IMessage {
	private int entityId;
	private int itm;

	public MessageSquirrelEat() {
	}

	public MessageSquirrelEat(int parEntityId, int itm) {
		entityId = parEntityId;
		this.itm = itm;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		entityId = ByteBufUtils.readVarInt(buf, 4);
		this.itm = ByteBufUtils.readVarInt(buf, 4);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeVarInt(buf, entityId, 4);
		ByteBufUtils.writeVarInt(buf, itm, 4);
	}

	public static class Handler implements IMessageHandler<MessageSquirrelEat, IMessage> {
		@Override
		public IMessage onMessage(MessageSquirrelEat message, MessageContext ctx) {
			EntityTreeSquirrel squirrel = (EntityTreeSquirrel) Minecraft.getMinecraft().player.world.getEntityByID(message.entityId);
			
			squirrel.isSquirrelSitting = true;
			squirrel.setSitting();
			
			if(message.itm == 0) {
				squirrel.heldFood = new ItemStack(ModItems.ACORN, 1);
			}
			else {
				squirrel.heldFood = new ItemStack(ModItems.PINE_CONE, 1);
			}

			return null;
		}
	}
}