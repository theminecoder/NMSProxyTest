package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSMethod;

import java.util.Set;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "PathfinderGoalSelector")
public interface NMSPathfinderGoalSelector extends NMSProxy {

    @NMSField(type = NMSField.Type.GETTER)
    Set<Object> b();

    @NMSField(type = NMSField.Type.GETTER)
    Set<Object> c();

    @NMSMethod
    void a(int priority, NMSPathfinderGoal pathfinderGoal);

}
