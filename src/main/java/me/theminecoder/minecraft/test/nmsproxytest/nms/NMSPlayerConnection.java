package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "PlayerConnection")
public interface NMSPlayerConnection extends NMSProxy {

    @NMSField(type = NMSField.Type.GETTER)
    NMSNetworkManager networkManager();

}
