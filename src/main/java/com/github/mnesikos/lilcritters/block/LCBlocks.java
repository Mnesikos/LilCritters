package com.github.mnesikos.lilcritters.block;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.Util;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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
import org.zawamod.zawa.world.block.ZawaFenceBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, LilCritters.MOD_ID);

    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });

    public static final RegistryObject<ZawaFenceBlock> LOW_BARRIER_FENCE = registerWithItem("low_barrier_fence", () -> new ZawaFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        LCItems.DECORATIONS_REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        ItemBlockRenderTypes.setRenderLayer(LOW_BARRIER_FENCE.get(), cutoutMipped);
    }
}
