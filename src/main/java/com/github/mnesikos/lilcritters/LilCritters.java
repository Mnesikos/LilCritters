package com.github.mnesikos.lilcritters;

import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import com.github.mnesikos.lilcritters.sounds.LCSounds;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LilCritters.MOD_ID)
public class LilCritters {
    public static final String MOD_ID = "lilcritters";

    public LilCritters() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        LCEntities.REGISTRAR.register(bus);
        LCItems.REGISTRAR.register(bus);
        LCSounds.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::registerAttributes);
        bus.addListener(this::setupClient);
    }

    private void registerAttributes(final EntityAttributeCreationEvent event) {
        LCEntities.registerAttributes((type, builder) -> event.put(type, builder.build()));
    }

    private void setup(final FMLCommonSetupEvent event) {
        LCEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        LCEntities.registerRenderers();
    }
}
