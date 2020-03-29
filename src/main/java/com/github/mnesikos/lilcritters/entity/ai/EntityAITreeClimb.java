package com.github.mnesikos.lilcritters.entity.ai;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIMoveToBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.zawamod.configuration.ZAWAConfig;

import java.util.Random;

// TODO
public class EntityAITreeClimb extends EntityAIMoveToBlock {
    protected Random rand;
    private final EntityCreature entity;
    /** 0 => climb tree trunk, 1 => navigate through leaves, -1 => none */
    private int currentTask;

    public EntityAITreeClimb(EntityCreature parEntity, double speed) {
        super(parEntity, speed, 16);
        this.entity = parEntity;
    }

    @Override
    public boolean shouldExecute() {
        if (runDelay <= 0) {
            if (ZAWAConfig.serverOptions.canClimb) {
                return false;

            } else if (rand.nextInt(200) != 0) {
                return false;

            }

            this.currentTask = -1;
        }
        return super.shouldExecute();
    }

    @Override
    public boolean shouldContinueExecuting() {
        return this.currentTask >= 0 && super.shouldContinueExecuting();
    }

    @Override
    public void updateTask() {
        super.updateTask();
    }

    @Override
    protected boolean shouldMoveTo(World worldIn, BlockPos pos) {
        Block block = worldIn.getBlockState(pos).getBlock();

        if (block == Blocks.LOG) {
            if (this.currentTask <= 0) {
                this.currentTask = 0;
                return true;
            }

            if (this.currentTask == 1 || this.currentTask < 0) {
                this.currentTask = 1;
                return true;
            }
        }

        return false;
    }
}
