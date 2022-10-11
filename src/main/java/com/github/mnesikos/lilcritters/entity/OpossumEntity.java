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

public class OpossumEntity extends ZawaLandEntity implements SpeciesVariantsEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("virginia", ZawaSpawnCategory.WET_FOREST),
            new Tuple<>("common", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("southern_white_eared", ZawaSpawnCategory.TEMPERATE_FOREST)
    ));

    public OpossumEntity(EntityType<? extends ZawaLandEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerOpossumAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 10.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PlayerEntity.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
    }

    @Override
    protected void customServerAiStep() {
        if (this.getMoveControl().hasWanted()) {
            this.setSprinting(this.getMoveControl().getSpeedModifier() >= 1.33);
        }

        super.customServerAiStep();
    }

    @Override
    public float getStandingEyeHeight(Pose pose, EntitySize size) {
        return size.height * 0.8F;
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return LCEntities.OPOSSUM.get().create(world);
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.TEMPERATE_FOREST.getBiomes().contains(biome))
            return random.nextBoolean() ? 1 : 2;
        if (ZawaSpawnCategory.WET_FOREST.getBiomes().contains(biome))
            return 0;

        return random.nextInt(this.getWildVariants());
    }

    @Override
    protected SoundEvent getAmbientSound() { // todo
        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }
}
