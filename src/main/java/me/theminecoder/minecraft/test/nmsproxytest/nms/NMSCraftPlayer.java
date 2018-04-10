package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSMethod;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.CRAFTBUKKIT, className = "entity.CraftPlayer")
public interface NMSCraftPlayer extends NMSCraftEntity {

    @NMSMethod
    NMSEntityPlayer getHandle();

}
