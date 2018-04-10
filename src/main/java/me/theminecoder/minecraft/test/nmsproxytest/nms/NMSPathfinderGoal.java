package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "PathfinderGoal")
public interface NMSPathfinderGoal {

    public boolean a();

    public default boolean b() {
        return this.a();
    }

    public default boolean g() {
        return true;
    }

    public default void c() {

    }

    public default void d() {

    }

    public default void e() {

    }

    public default void a(int var) {

    }

    public default int h() {
        return -1;
    }

}
