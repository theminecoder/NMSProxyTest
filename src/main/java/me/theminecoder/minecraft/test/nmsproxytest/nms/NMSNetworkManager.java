package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSMethod;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "NetworkManager")
public interface NMSNetworkManager extends NMSProxy {

    @NMSMethod
    void sendPacket(NMSPacket packet);

}
