package me.theminecoder.minecraft.test.nmsproxytest.nms.pathfinder;

import me.theminecoder.minecraft.nmsproxy.NMSSubclass;
import me.theminecoder.minecraft.test.nmsproxytest.nms.NMSPathfinderGoal;

/**
 * @author theminecoder
 */
public abstract class PathfinderGoalTest implements NMSPathfinderGoal, NMSSubclass {

    @Override
    public boolean a() {
        System.out.println("this = " + this.getClass());
        System.out.println("super = " + super.getClass());
        return false;
    }
}
