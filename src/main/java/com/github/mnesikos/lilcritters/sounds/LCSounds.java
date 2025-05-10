package com.github.mnesikos.lilcritters.sounds;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LCSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LilCritters.MOD_ID);

    public static RegistryObject<SoundEvent> SQUIRREL_AMBIENT = registerSound("squirrel_ambient");
    public static RegistryObject<SoundEvent> SQUIRREL_HURT = registerSound("squirrel_hurt");

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(LilCritters.MOD_ID, name)));
    }
}
