package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "Entity")
public interface NMSEntity extends NMSProxy {
}
