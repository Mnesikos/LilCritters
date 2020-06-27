package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.entity.core.IMultiSpeciesEntity;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class EntityBoxTurtle extends LCBaseLand implements IMultiSpeciesEntity {
    public static final ResourceLocation LOOT = new ResourceLocation(Ref.MODID, "entities/box_turtle");
    private boolean isTurtleHiding;
    private EntityLivingBase attacker;

    public EntityBoxTurtle(World world) {
        super(world);
        setSize(0.5F, 0.4F);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.4F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.BOX_TURTLE, ModEntityPoses.BOX_TURTLE_SLEEP);
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.BOX_TURTLE, ModEntityPoses.BOX_TURTLE_SLEEP);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.BOX_TURTLE;
    }

    @Override
    public Map<Integer, String> speciesData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Common");
        map.put(1, "Desert");
        map.put(2, "Eastern");
        map.put(3, "Gulf Coast");
        map.put(4, "Three-Toed");
        return map;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityBoxTurtle parent2 = (EntityBoxTurtle) ageable;
        EntityBoxTurtle child = new EntityBoxTurtle(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
    }

    @Override
    public boolean isFoodItem(ItemStack stack) {
        return DietHandler.OpportunistItems(stack);
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 5;
    }

    @Override
    public void onLivingUpdate() {
        if (this.isTurtleHiding) {
            if (this.attacker == null || this.attacker.isDead) {
                this.isTurtleHiding = false;
            } else {
                if (getDistance(attacker) > 10.0D) {
                    this.attacker = null;
                    this.isTurtleHiding = false;
                }
            }
        }

        super.onLivingUpdate();
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (source.getTrueSource() instanceof EntityLivingBase) {
            this.isTurtleHiding = true;
            this.attacker = (EntityLivingBase)source.getTrueSource();
        }
        if (this.isTurtleHiding) {
            amount *= 0.2F;
        }
        return super.attackEntityFrom(source, amount);
    }

    public void setTurtleHiding(boolean b) {
        this.isTurtleHiding = b;
    }

    public boolean getIsHiding() {
        return this.isTurtleHiding;
    }

    @Override
    protected boolean isMovementBlocked() {
        return this.isTurtleHiding || super.isMovementBlocked();
    }

    @Override
    public void travel(float strafe, float vertical, float forward) {
        if (this.isTurtleHiding) {
            this.motionX = 0.0D;
            this.motionY = 0.0D;
            this.motionZ = 0.0D;
        }
        super.travel(strafe, vertical, forward);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.inventory.getCurrentItem();
        if (stack.isEmpty()) {
            if (player.getPassengers().size() < 3) {
                this.startRiding(player, true);
            }
            return true;
        }
        return super.processInteract(player, hand);
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        return LOOT;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        //TODO
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        //TODO
        return null;
    }
}
