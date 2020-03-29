package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseLand;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.zawamod.entity.core.AnimalData;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.entity.core.IMultiSpeciesEntity;
import org.zawamod.init.ZAWAItems;

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
        this.stepHeight = 1.0F;
        this.speed = 0.8F;
        this.activity = AnimalData.Activity.LAZY;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10D);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.4F;
    }

    @Override
    public boolean displayCuriosity() {
        return true;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
    }

    @Override
    public ItemStack setTameItem() {
        return new ItemStack(ZAWAItems.TORTOISE_KIBBLE, 1);
    }

    @Override
    public int setVariants() {
        return 5;
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
    public AnimalData.EnumNature setNature() {
        return AnimalData.EnumNature.NEUTRAL;
    }

    @Override
    public ItemStack setVial() {
        return new ItemStack(ZAWAItems.TORTOISE_VIAL, 1);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityBoxTurtle parent2 = (EntityBoxTurtle) ageable;
        EntityBoxTurtle child = new EntityBoxTurtle(this.world);
        if (parent2.getAnimalType() != this.getAnimalType() && this.rand.nextInt(2) == 0) {
            child.setAnimalType(parent2.getAnimalType());
        } else {
            child.setAnimalType(this.getAnimalType());
        }
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
