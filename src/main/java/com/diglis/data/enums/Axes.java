package com.diglis.data.enums;

import com.diglis.eldencraft.item.axes.SteelAxe;
import com.diglis.eldencraft.item.tabs.EldenCraftTabTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

import java.util.Arrays;
import java.util.HashSet;

public enum Axes {

    STEEL_AXE;
    static HashSet<Axes> axes = new HashSet<Axes>();
    public SteelAxe getItem() {
        Item.Properties tab = new Item.Properties().tab(EldenCraftTabTools.ELDEN_CRAFT_TAB_TOOLS);
        switch(this) {
            case STEEL_AXE:
                return new SteelAxe(ItemTier.IRON, 3f, 10f, tab);
            default:
                return null;
        }
    }

    public static HashSet<Axes> hashSetter() {
        if(axes.isEmpty()) {
            axes.addAll(Arrays.asList(Axes.values()));
        }

        return axes;
    }

    public String getName() {
        switch(this) {
            case STEEL_AXE:
                return "steel_axe";
            default:
                return null;
        }
    }

}
