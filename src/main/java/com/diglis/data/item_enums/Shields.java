package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.shields.RivetedWoodenShield;
import com.diglis.eldencraft.item.tabs.EldenCraftTabTools;
import com.diglis.eldencraft.item.tabs.EldenCraftTabWeapons;
import net.minecraft.item.Item;
import net.minecraft.item.ShieldItem;

import java.util.Arrays;
import java.util.HashSet;

public enum Shields {

    RIVETED_WOODEN_SHIELD;
    static HashSet<Shields> shields = new HashSet<Shields>();

    public ShieldItem getItem() {
        Item.Properties tab = new Item.Properties().tab(EldenCraftTabTools.ELDEN_CRAFT_TAB_TOOLS);
        switch(this) {
            case RIVETED_WOODEN_SHIELD:
                return new RivetedWoodenShield(tab);
            default:
                return null;
        }
    }

    public static HashSet<Shields> hashSetter() {
        if(shields.isEmpty()) {
            shields.addAll(Arrays.asList(Shields.values()));
        }
        return shields;
    }

    public String getName() {
        switch(this) {
            case RIVETED_WOODEN_SHIELD:
                return "riveted_wooden_shield";
            default:
                return null;
        }
    }

}
