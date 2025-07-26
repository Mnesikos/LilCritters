package com.github.mnesikos.lilcritters.block;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.Util;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
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
import org.zawamod.zawa.world.block.ZawaEnrichmentBlock;
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

    public static final Map<String, RegistryObject<Block>> IGLOO_HIDES = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_igloo_hide", () -> new IglooHide(BlockBehaviour.Properties.of().mapColor(color.getMapColor()))));
        }
    });

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        LCItems.DECORATIONS_REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        ItemBlockRenderTypes.setRenderLayer(LOW_BARRIER_FENCE.get(), cutoutMipped);

        RenderType translucent = RenderType.translucent();
        for (int i = 0; i < 16; i++)
            ItemBlockRenderTypes.setRenderLayer(IGLOO_HIDES.get(DyeColor.byId(i).getName()).get(), translucent);
    }
}
