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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

public class BurrowingOwlEntity extends ZawaLandEntity implements OviparousEntity {
    public BurrowingOwlEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerBurrowingOwlAttributes() {
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225F).add(Attributes.MAX_HEALTH, 12.0F).add(Attributes.ATTACK_DAMAGE, 1.0F);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5, 1.33, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    protected void customServerAiStep() {
        if (getMoveControl().hasWanted()) setSprinting(getMoveControl().getSpeedModifier() >= 1.33);
        super.customServerAiStep();
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return LCEntities.BURROWING_OWL.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return LCItems.BURROWING_OWL_EGG.get().getDefaultInstance();
    }
}
