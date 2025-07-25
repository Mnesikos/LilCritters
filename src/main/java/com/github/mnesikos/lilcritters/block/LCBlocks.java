package com.github.mnesikos.lilcritters.block;

import com.github.mnesikos.lilcritters.LilCritters;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.world.block.PlushBlock;

import java.util.HashMap;
import java.util.Map;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, LilCritters.MOD_ID);

    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {

    }
}
