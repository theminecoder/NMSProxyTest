package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.CRAFTBUKKIT, className = "CraftServer")
public interface NMSCraftServer extends NMSProxy {

    default double[] getTPS() {
        return console().recentTps();
    }

    @NMSField(type = NMSField.Type.GETTER)
    NMSMinecraftServer console();

}
