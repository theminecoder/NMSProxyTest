package me.theminecoder.minecraft.test.nmsproxytest.nms;

import me.theminecoder.minecraft.nmsproxy.annotations.NMSClass;
import me.theminecoder.minecraft.nmsproxy.annotations.NMSField;

/**
 * @author theminecoder
 */
@NMSClass(type = NMSClass.Type.NMS, className = "EntityInsentient")
public interface NMSEntityInsentient extends NMSEntity {

    @NMSField(type = NMSField.Type.GETTER)
    NMSPathfinderGoalSelector goalSelector();

    @NMSField(type = NMSField.Type.GETTER)
    NMSPathfinderGoalSelector targetSelector();

}
