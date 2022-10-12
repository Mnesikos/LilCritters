package com.github.mnesikos.lilcritters.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.FindWaterGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.Tags;
import org.zawamod.zawa.entity.base.ZawaBaseAmbientEntity;
import org.zawamod.zawa.entity.behavior.ClimbingEntity;

import javax.annotation.Nullable;

public class MysterySnailEntity extends ZawaBaseAmbientEntity implements ClimbingEntity {
    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(MysterySnailEntity.class, DataSerializers.BOOLEAN);

    public MysterySnailEntity(EntityType<? extends ZawaBaseAmbientEntity> type, World world) {
        super(type, world);
        this.maxUpStep = 1.0F;
        this.setPathfindingMalus(PathNodeType.WATER, 0.0F);
    }

    public static AttributeModifierMap.MutableAttribute registerMysterySnailAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 2.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FindWaterGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 8.0F, 0.8D, 1.33D, AVOID_PLAYERS::test));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 1.0D));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.MYSTERY_SNAIL.get().create(world);
    }

    @Override
    protected PathNavigator createNavigation(World world) {
        return new ClimberPathNavigator(this, world);
    }

    @Override
    protected void playStepSound(BlockPos blockPos, BlockState blockState) {
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public CreatureAttribute getMobType() {
        return CreatureAttribute.WATER;
    }

    @Override
    public boolean checkSpawnObstruction(IWorldReader level) {
        return level.isUnobstructed(this);
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    public void tick() {
        super.tick();
        if (!level.isClientSide && horizontalCollision)
            setClimbing(isClimbableBlock(level, blockPosition().relative(getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return isClimbing();
    }

    @Override
    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    @Override
    public boolean isClimbing() {
        return entityData.get(CLIMBING);
    }

    @Override
    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }

    @Override
    public boolean isClimbableBlock(World level, BlockPos blockPos) {
        Block block = (level.getBlockState(blockPos)).getBlock();
        return Tags.Blocks.DIRT.contains(block) || BlockTags.SAND.contains(block) || ClimbingEntity.super.isClimbableBlock(level, blockPos);
    }
}
