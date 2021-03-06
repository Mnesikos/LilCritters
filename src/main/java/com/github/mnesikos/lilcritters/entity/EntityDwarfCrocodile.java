package com.github.mnesikos.lilcritters.entity;

import com.github.mnesikos.lilcritters.entity.base.LCBaseCrossover;
import com.github.mnesikos.lilcritters.util.AnimalPacksLC;
import com.github.mnesikos.lilcritters.util.ModEntityPoses;
import com.github.mnesikos.lilcritters.util.Ref;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.core.AnimalPack;
import org.zawamod.entity.core.modules.ModuleManager;
import org.zawamod.util.DataItem;
import org.zawamod.util.StringedItem;
import org.zawamod.util.status.StatusSunSeeking;
import org.zawamod.util.status.StatusSwimming;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class EntityDwarfCrocodile extends LCBaseCrossover {
    public static final ResourceLocation LOOT = new ResourceLocation(Ref.MODID, "entities/dwarf_crocodile");
    private BlockPos toGo = null;
    private int swimTime = 0;

    public EntityDwarfCrocodile(World world) {
        super(world);
        setSize(1.0F, 0.5F);
        this.tasks.addTask(5, aiWander);
    }

    @Override
    public float getEyeHeight() {
        return this.height * 0.6F;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.DWARF_CROCODILE, ModEntityPoses.DWARF_CROCODILE_SLEEP);
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.DWARF_CROCODILE, ModEntityPoses.DWARF_CROCODILE_SLEEP);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.targetTasks.addTask(6, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.tasks.addTask(0, new EntityAIFleeSun(this, 1.26D));
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksLC.DWARF_CROC;
    }
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        EntityDwarfCrocodile parent2 = (EntityDwarfCrocodile) ageable;
        EntityDwarfCrocodile child = new EntityDwarfCrocodile(this.world);
        if (ModuleManager.VARIANT.getVariant(parent2) != ModuleManager.VARIANT.getVariant(this) && this.rand.nextInt(2) == 0)
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(parent2));
        else
            ModuleManager.VARIANT.setVariant(child, ModuleManager.VARIANT.getVariant(this));

        return child;
    }

    public DataItem getIconList() {
        List<StringedItem> s = new ArrayList<>();
        s.add(new StatusSwimming());
        s.add(new StatusSunSeeking());
        return new DataItem(s);
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        return LOOT;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.inWater) {
            ++this.swimTime;
        } else {
            this.swimTime = 0;
            if (this.toGo != null) {
                this.toGo = null;
            }
        }

        if (this.swimTime > 30 && this.toGo == null) {
            Vec3d vec3d = RandomPositionGenerator.getLandPos(this, 10, 7);
            if (vec3d != null) {
                this.toGo = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
            }
        }

        if (this.toGo != null) {
            this.navigator.tryMoveToXYZ((double)this.toGo.getX(), (double)this.toGo.getY(), (double)this.toGo.getZ(), 1.0D);
        }
    }

    @Override
    public void travel(float strafe, float up, float forward) {
        if (this.isServerWorld() && this.isInWater()) {
            this.moveRelative(strafe, up, forward, 0.1F);
            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.7999999761581421D;
            this.motionY *= 0.7999999761581421D;
            this.motionZ *= 0.7999999761581421D;
            if (this.collidedHorizontally) {
                this.motionY = 0.25999999046325684D;
                float f = this.rotationYaw * 0.017453292F;
                this.motionX -= (double)(MathHelper.sin(f) * 0.2F) * 1.0D;
                this.motionZ += (double)(MathHelper.cos(f) * 0.2F) * 1.0D;
            }

            if (!this.isMoving() && this.getAttackTarget() == null)
                this.motionY += 0.005D;
        } else
            super.travel(strafe, up, forward);
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
