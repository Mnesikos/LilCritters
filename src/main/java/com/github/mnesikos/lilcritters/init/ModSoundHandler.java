package com.github.mnesikos.lilcritters.init;

import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class ModSoundHandler {
    @GameRegistry.ObjectHolder("lilcritters:squirrel.ambient")
    public static final SoundEvent SQUIRREL_AMBIENT = null;
    @GameRegistry.ObjectHolder("lilcritters:squirrel.hurt")
    public static final SoundEvent SQUIRREL_HURT = null;


    @SubscribeEvent
    public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
        final SoundEvent[] soundEvents = {
                register("squirrel.ambient"),
                register("squirrel.hurt"),
        };

        event.getRegistry().registerAll(soundEvents);
    }

    public static SoundEvent register(final String name) {
        final ResourceLocation location = new ResourceLocation(Ref.MODID, name);

        return new SoundEvent(location).setRegistryName(location);
    }
}
