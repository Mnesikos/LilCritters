package com.github.mnesikos.lilcritters.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.block.EnrichmentBlock;

public class IglooHide extends HorizontalDirectionalBlock implements EnrichmentBlock {
    public IglooHide(Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case NORTH -> {
                return Shapes.join(Block.box(1.0D, 0.0D, 0.0D, 15.0D, 12.0D, 16.0D), Shapes.or(box(4.0D, 0.0D, 0.0D, 12.0D, 7.5D, 3.0D), box(1.5D, 0.0D, 3.0D, 14.5D, 11.0D, 15.0D)), BooleanOp.ONLY_FIRST);
            }
            case SOUTH -> {
                return Shapes.join(Block.box(1.0D, 0.0D, 0.0D, 15.0D, 12.0D, 16.0D), Shapes.or(box(4.0D, 0.0D, 13.0D, 12.0D, 7.5D, 16.0D), box(1.5D, 0.0D, 1.0D, 14.5D, 11.0D, 13.0D)), BooleanOp.ONLY_FIRST);
            }
            case WEST -> {
                return Shapes.join(Block.box(0.0D, 0.0D, 1.0D, 16.0D, 12.0D, 15.0D), Shapes.or(box(0.0D, 0.0D, 4.0D, 3.0D, 7.5D, 12.0D), box(3.0D, 0.0D, 1.5D, 15.0D, 11.0D, 14.5D)), BooleanOp.ONLY_FIRST);
            }
            case EAST -> {
                return Shapes.join(Block.box(0.0D, 0.0D, 1.0D, 16.0D, 12.0D, 15.0D), Shapes.or(box(13.0D, 0.0D, 4.0D, 16.0D, 7.5D, 12.0D), box(1.0D, 0.0D, 1.5D, 13.0D, 11.0D, 14.5D)), BooleanOp.ONLY_FIRST);
            }
        }
        return Shapes.block();
    }

    @Override
    public boolean isPathfindable(BlockState p_60475_, BlockGetter p_60476_, BlockPos p_60477_, PathComputationType p_60478_) {
        return false;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
