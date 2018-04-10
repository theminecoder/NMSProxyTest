package me.theminecoder.minecraft.test.nmsproxytest.nms;

import com.mojang.authlib.GameProfile;
import me.theminecoder.minecraft.nmsproxy.NMSProxy;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSMethod;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "EntityPlayer")
public interface NMSEntityPlayer extends NMSEntity {

    @NMSField(type = NMSField.Type.GETTER)
    NMSPlayerConnection playerConnection();

    @NMSMethod
    GameProfile getProfile();

}
