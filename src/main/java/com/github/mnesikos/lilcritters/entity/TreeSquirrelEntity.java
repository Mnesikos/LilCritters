package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.sounds.LCSounds;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.Tuple;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.client.ZawaSounds;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.entity.base.SpeciesVariantsEntity;
import org.zawamod.zawa.entity.base.ZawaBaseEntity;
import org.zawamod.zawa.entity.base.ZawaLandEntity;
import org.zawamod.zawa.entity.behavior.ClimbingEntity;
import org.zawamod.zawa.entity.goals.ZawaMeleeAttackGoal;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeSquirrelEntity extends ZawaLandEntity implements SpeciesVariantsEntity, ClimbingEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("eastern_gray", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("mexican_gray", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("eastern_fox", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("eurasian_red", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("prevosts", ZawaSpawnCategory.DEEP_RAINFOREST),
            new Tuple<>("forest_giant", ZawaSpawnCategory.WET_FOREST)
    ));

    public static final DataParameter<Boolean> CLIMBING = EntityDataManager.defineId(TreeSquirrelEntity.class, DataSerializers.BOOLEAN);

    public TreeSquirrelEntity(EntityType<? extends ZawaBaseEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerTreeSquirrelAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 4.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CLIMBING, false);
    }

    @Override
    protected void customServerAiStep() {
        if (this.getMoveControl().hasWanted()) this.setSprinting(this.getMoveControl().getSpeedModifier() >= 1.33);

        super.customServerAiStep();
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.5F;
    }

    @Override
    public float getScale() {
        return super.getScale(); //todo
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.TREE_SQUIRREL.get().create(world);
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.WET_FOREST.getBiomes().contains(biome))
            return random.nextInt(4);
        if (ZawaSpawnCategory.WET_FOREST.getBiomes().contains(biome))
            return 5;
        if (ZawaSpawnCategory.DEEP_RAINFOREST.getBiomes().contains(biome))
            return 4;

        return random.nextInt(getWildVariants());
    }

    @Override
    protected PathNavigator createNavigation(World world) {
        return new ClimberPathNavigator(this, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level.isClientSide && this.horizontalCollision)
            this.setClimbing(this.isClimbableBlock(this.level, this.blockPosition().relative(this.getDirection())));
    }

    @Override
    public boolean onClimbable() {
        return this.isClimbing();
    }

    @Override
    public boolean causeFallDamage(float distance, float damageMultiplier) {
        return false;
    }

    /*@Override
    public boolean doHurtTarget(Entity entity) {
        boolean didHurtTarget = super.doHurtTarget(entity);
        if (didHurtTarget) {
            this.playSound(LCSounds.TREE_SQUIRREL_ATTACKING.get(), 1.0F, 1.0F);
        }

        return didHurtTarget;
    } // todo */

    @Override
    protected SoundEvent getAmbientSound() {
        if (random.nextInt(4) == 0) // 1/4th the amount of noise
            return LCSounds.SQUIRREL_AMBIENT.get();
        else
            return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return LCSounds.SQUIRREL_HURT.get();
    }

    @Override
    public boolean isClimbing() {
        return this.entityData.get(CLIMBING);
    }

    @Override
    public void setClimbing(boolean climbing) {
        this.entityData.set(CLIMBING, climbing);
    }
}
