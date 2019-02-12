package com.github.mnesikos.lilcritters.event;

import com.github.mnesikos.lilcritters.configuration.LilCrittersConfig;
import com.github.mnesikos.lilcritters.init.ModItems;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

import java.util.Iterator;

public class CrittersEventHandler {
    public CrittersEventHandler() {

    }

    @SubscribeEvent
    public void onHarvestDrops(HarvestDropsEvent event) {
        if (LilCrittersConfig.enableTreeSeedDrops) {
            if (event.getState() == Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK)) {
                if (event.getWorld().rand.nextInt(12) == 0) {
                    event.getDrops().add(new ItemStack(ModItems.ACORN, 1));
                    event.setDropChance((float)LilCrittersConfig.treeSeedDropsChance);
                }
            }
            if (event.getState() == Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE)) {
                if (event.getWorld().rand.nextInt(16) == 0) {
                    event.getDrops().add(new ItemStack(ModItems.PINE_CONE, 1));
                    event.setDropChance((float)LilCrittersConfig.treeSeedDropsChance);
                }
            }
        }
    }

    // TODO
    // This is only called on the server side of things, useless for Single Player worlds???
    @SubscribeEvent
    public void onPlayerLogOut(PlayerLoggedOutEvent event) {
        if (event.player != null && !event.player.getPassengers().isEmpty()) {
            Iterator<Entity> passengers = event.player.getPassengers().iterator();
            while (passengers.hasNext()) {
                (passengers.next()).dismountRidingEntity();
            }
        }
    }

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {

    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {

    }
}
