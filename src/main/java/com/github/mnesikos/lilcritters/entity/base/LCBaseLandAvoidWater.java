package com.github.mnesikos.lilcritters.entity.base;

import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.world.World;

public abstract class LCBaseLandAvoidWater extends LCBaseLand {

    public LCBaseLandAvoidWater(World world) {
        super(world);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.removeTask(this.aiWander);
        this.aiWanderAvoidWater = new EntityAIWanderAvoidWater(this, 1.0D);
        this.tasks.addTask(7, aiWanderAvoidWater);
    }

    @Override
    protected void updateAITasks() {
        if (this.isTamed()) {
            if (this.getControl() == 1) {
                this.tasks.addTask(1, this.aiFollowOwner);
                this.tasks.addTask(1, this.aiWanderAvoidWater);
                this.setSitting(false);

            } else if (this.getControl() == 3) {
                this.tasks.addTask(1, this.aiWanderAvoidWater);
                this.tasks.removeTask(this.aiFollowOwner);
                this.setSitting(false);

            } else if (this.getControl() == 2) {
                this.tasks.removeTask(this.aiWanderAvoidWater);
                this.tasks.removeTask(this.aiFollowOwner);
                this.setSitting(true);
            }
        } else {
            super.updateAITasks();
        }
    }
}
