package com.github.mnesikos.lilcritters;

import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import com.github.mnesikos.lilcritters.sounds.LCSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LilCritters.MOD_ID)
public class LilCritters {
    public static final String MOD_ID = "lilcritters";

    public LilCritters() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        LCEntities.REGISTRY.initialize();
        LCItems.REGISTRAR.register(bus);
        LCSounds.REGISTRAR.register(bus);

        bus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LCEntities.registerSpawnPlacements();
    }
}
