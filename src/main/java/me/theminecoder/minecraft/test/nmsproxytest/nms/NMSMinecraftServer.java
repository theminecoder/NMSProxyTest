package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "MinecraftServer")
public interface NMSMinecraftServer extends NMSProxy {

    @NMSField(type = NMSField.Type.GETTER)
    int ticks();

    @NMSField(type = NMSField.Type.SETTER)
    void ticks(int ticks);

    @NMSField(type = NMSField.Type.SETTER)
    void motd(String newMotd);

    @NMSField(type = NMSField.Type.GETTER)
    String motd();

    @NMSField(type = NMSField.Type.GETTER)
    double[] recentTps();

}
