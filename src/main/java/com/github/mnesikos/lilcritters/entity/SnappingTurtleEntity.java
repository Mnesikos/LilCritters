package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaSemiAquaticEntity;

public class SnappingTurtleEntity extends ZawaSemiAquaticEntity implements SpeciesVariantsEntity, OviparousEntity {
    public SnappingTurtleEntity(EntityType<? extends ZawaSemiAquaticEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerSnappingTurtleAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.10F).add(Attributes.MAX_HEALTH, 12.0).add(Attributes.ATTACK_DAMAGE, 3.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 2.0, 1.33, false));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NonTameRandomTargetGoal<>(this, Player.class, true, (entity) -> distanceToSqr(entity) <= 10.0));
    }

    @Override
    public float swimSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public boolean canBabySwim() {
        return true;
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        return super.getStandingEyeHeight(pose, size);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.SNAPPING_TURTLE.get().create(world);
    }

    @Override
    public int getVariantByBiome(LevelAccessor levelAccessor) {
        return random.nextInt(getWildVariants());
    }

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.SNAPPING_TURTLE_EGG.get().getDefaultInstance();
    }
}
