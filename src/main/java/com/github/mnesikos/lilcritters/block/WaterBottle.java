package com.github.mnesikos.lilcritters.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.block.EnrichmentBlock;

public class WaterBottle extends HorizontalDirectionalBlock implements EnrichmentBlock {
    public WaterBottle(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH -> {
                return Block.box(5.0D, 2.0D, 10.0D, 11.0D, 15.0D, 16.0D);
            }
            case SOUTH -> {
                return Block.box(5.0D, 2.0D, 0.0D, 11.0D, 15.0D, 6.0D);
            }
            case WEST -> {
                return Block.box(10.0D, 2.0D, 5.0D, 16.0D, 15.0D, 11.0D);
            }
            case EAST -> {
                return Block.box(0.0D, 2.0D, 5.0D, 6.0D, 15.0D, 11.0D);
            }
        }
        return Shapes.block();
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos blockPos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockpos = blockPos.relative(direction.getOpposite());
        BlockState blockstate = levelReader.getBlockState(blockpos);
        return blockstate.isFaceSturdy(levelReader, blockpos, direction);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockstate = defaultBlockState();
        Direction[] adirection = context.getNearestLookingDirections();

        for (Direction direction : adirection) {
            if (direction.getAxis().isHorizontal()) {
                Direction direction1 = direction.getOpposite();
                blockstate = blockstate.setValue(FACING, direction1);
                if (blockstate.canSurvive(context.getLevel(), context.getClickedPos()))
                    return blockstate;
            }
        }

        return null;
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState1, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos1) {
        return direction.getOpposite() == blockState.getValue(FACING) && !blockState.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() : blockState;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
