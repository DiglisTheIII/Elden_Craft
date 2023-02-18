package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.shovels.SteelShovel;
import com.diglis.eldencraft.item.tabs.EldenCraftTabTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

import java.util.Arrays;
import java.util.HashSet;

public enum Shovels {

    STEEL_SHOVEL;
    static HashSet<Shovels> shovels = new HashSet<Shovels>();
    public SteelShovel getItem() {
        Item.Properties tab = new Item.Properties().tab(EldenCraftTabTools.ELDEN_CRAFT_TAB_TOOLS);
        switch(this) {
            case STEEL_SHOVEL:
                return new SteelShovel(ItemTier.IRON, 3f, 10f, tab);
            default:
                return null;
        }
    }

    public static HashSet<Shovels> hashSetter() {
        if(shovels.isEmpty()) {
            shovels.addAll(Arrays.asList(Shovels.values()));
        }

        return shovels;
    }

    public String getName() {
        switch(this) {
            case STEEL_SHOVEL:
                return "steel_shovel";
            default:
                return null;
        }
    }

}
