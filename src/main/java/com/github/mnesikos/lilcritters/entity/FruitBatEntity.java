package com.github.mnesikos.lilcritters.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

public class FruitBatEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity {
    public FruitBatEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerFruitBatAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 0.225F).add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 0.8, 1.33, (entity) -> AVOID_PLAYERS.test(entity) && !isTame()));
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return super.getStandingEyeHeight(pose, size);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.FRUIT_BAT.get().create(world);
    }

    @Override
    public int getVariantByBiome(LevelAccessor levelAccessor) {
        return random.nextInt(getWildVariants());
    }
}
