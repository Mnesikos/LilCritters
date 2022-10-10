package com.github.mnesikos.lilcritters.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
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
            new Tuple<>("three_toed", ZawaSpawnCategory.TEMPERATE_FOREST)
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
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.4F;
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
            return random.nextBoolean() ? 0 : 4;
        if (ZawaSpawnCategory.WET_FOREST.getBiomes().contains(biome))
            return random.nextBoolean() ? 2 : 3;
        if (ZawaSpawnCategory.DRY_GRASSLAND.getBiomes().contains(biome))
            return 1;

        return random.nextInt(this.getWildVariants());
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}
