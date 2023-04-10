package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Tuple;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.entity.base.SpeciesVariantsEntity;
import org.zawamod.zawa.entity.base.ZawaLandEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxTurtleEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("eastern", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("desert", ZawaSpawnCategory.DRY_GRASSLAND),
            new Tuple<>("florida", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("gulf_coast", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("three_toed", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("ornate", ZawaSpawnCategory.DRY_GRASSLAND),
            new Tuple<>("mexican", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("yucatan", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("spotted", ZawaSpawnCategory.DRY_ALPINE),
            new Tuple<>("coahuilan", ZawaSpawnCategory.SLOW_FRESH_WATER),
            new Tuple<>("amboina", ZawaSpawnCategory.WET_RAINFOREST),
            new Tuple<>("yellow_headed", ZawaSpawnCategory.SLOW_FRESH_WATER),
            new Tuple<>("bourrets", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("vietnamese_three_striped", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("chinese", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("indochinese", ZawaSpawnCategory.TEMPERATE_ALPINE),
            new Tuple<>("mccords", ZawaSpawnCategory.TEMPERATE_ALPINE),
            new Tuple<>("keeled", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("pans", ZawaSpawnCategory.SLOW_FRESH_WATER),
            new Tuple<>("southern_vietnamese", ZawaSpawnCategory.TEMPERATE_ALPINE),
            new Tuple<>("golden_coin", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("yunnan", ZawaSpawnCategory.TEMPERATE_ALPINE),
            new Tuple<>("zhous", ZawaSpawnCategory.TEMPERATE_FOREST)
    ));

    public BoxTurtleEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerBoxTurtleAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 1.0, 1.0, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.5F;
    }

    @Override
    public float getScale() {
        return this.isBaby() ? 0.8F : 1.0F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.BOX_TURTLE.get().create(world);
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.TEMPERATE_FOREST.getBiomes().contains(biome))
            if (random.nextBoolean()) return random.nextInt(3) == 0 ? 12 : random.nextBoolean() ? 13 : 17;
            else return random.nextInt(3) == 0 ? 0 : random.nextBoolean() ? 4 : 22;
        if (ZawaSpawnCategory.WET_FOREST.getBiomes().contains(biome))
            if (random.nextBoolean()) return random.nextInt(3) == 0 ? 6 : random.nextBoolean() ? 7 : 14;
            else return random.nextInt(3) == 0 ? 2 : random.nextBoolean() ? 3 : 20;
        if (ZawaSpawnCategory.DRY_GRASSLAND.getBiomes().contains(biome))
            return random.nextBoolean() ? 1 : 5;
        if (ZawaSpawnCategory.DRY_ALPINE.getBiomes().contains(biome))
            return 8;
        if (ZawaSpawnCategory.SLOW_FRESH_WATER.getBiomes().contains(biome))
            return random.nextInt(3) == 0 ? 9 : random.nextBoolean() ? 11 : 18;
        if (ZawaSpawnCategory.WET_RAINFOREST.getBiomes().contains(biome))
            return 10;
        if (ZawaSpawnCategory.TEMPERATE_ALPINE.getBiomes().contains(biome))
            if (random.nextBoolean()) return random.nextBoolean() ? 19 : 21;
            else return random.nextBoolean() ? 15 : 16;

        return random.nextInt(this.getWildVariants());
    }
}
