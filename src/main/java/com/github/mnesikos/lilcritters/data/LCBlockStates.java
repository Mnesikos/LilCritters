package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.block.LCBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static com.github.mnesikos.lilcritters.LilCritters.PLUSHIES_LIST;

public class LCBlockStates extends BlockStateProvider {
    public LCBlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LilCritters.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (String plush : PLUSHIES_LIST) rotateYBlock(LCBlocks.PLUSHIES.get(plush).get());
    }

    public void rotateYBlock(Block block) {
        ModelFile model = models().getExistingFile(ForgeRegistries.BLOCKS.getKey(block));
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(model).rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite().toYRot()) % 360).build());
    }
}
