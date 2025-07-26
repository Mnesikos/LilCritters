package com.github.mnesikos.lilcritters.sounds;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LCSounds {
    public static final DeferredRegister<SoundEvent> REGISTRAR = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LilCritters.MOD_ID);

    public static RegistryObject<SoundEvent> BANDED_PENGUIN_AMBIENT = registerSound("banded_penguin_ambient");
    public static RegistryObject<SoundEvent> BANDED_PENGUIN_HURT = registerSound("banded_penguin_hurt");
    public static RegistryObject<SoundEvent> BULLFROG_AMBIENT = registerSound("bullfrog_ambient");
    public static RegistryObject<SoundEvent> BULLFROG_HURT = registerSound("bullfrog_hurt");
    public static RegistryObject<SoundEvent> DART_FROG_AMBIENT = registerSound("dart_frog_ambient");
    public static RegistryObject<SoundEvent> DART_FROG_HURT = registerSound("dart_frog_hurt");
    public static RegistryObject<SoundEvent> DWARF_CROCODILE_AMBIENT = registerSound("dwarf_crocodile_ambient");
    public static RegistryObject<SoundEvent> DWARF_CROCODILE_ATTACK = registerSound("dwarf_crocodile_attack");
    public static RegistryObject<SoundEvent> DWARF_CROCODILE_HURT = registerSound("dwarf_crocodile_hurt");
    public static RegistryObject<SoundEvent> GUINEA_PIG_AMBIENT = registerSound("guinea_pig_ambient");
    public static RegistryObject<SoundEvent> GUINEA_PIG_HURT = registerSound("guinea_pig_hurt");
    public static RegistryObject<SoundEvent> RACCOON_AMBIENT = registerSound("raccoon_ambient");
    public static RegistryObject<SoundEvent> RACCOON_ATTACK = registerSound("raccoon_attack");
    public static RegistryObject<SoundEvent> RACCOON_HURT = registerSound("raccoon_hurt");
    public static RegistryObject<SoundEvent> SMALL_CLAWED_OTTER_AMBIENT = registerSound("small_clawed_otter_ambient");
    public static RegistryObject<SoundEvent> SMALL_CLAWED_OTTER_ATTACK = registerSound("small_clawed_otter_attack");
    public static RegistryObject<SoundEvent> SMALL_CLAWED_OTTER_HURT = registerSound("small_clawed_otter_hurt");
    public static RegistryObject<SoundEvent> SQUIRREL_AMBIENT = registerSound("squirrel_ambient");
    public static RegistryObject<SoundEvent> SQUIRREL_HURT = registerSound("squirrel_hurt");

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return REGISTRAR.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(LilCritters.MOD_ID, name)));
    }
}
