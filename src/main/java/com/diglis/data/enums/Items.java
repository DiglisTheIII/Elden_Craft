package com.diglis.data.enums;

import com.diglis.eldencraft.item.tabs.EldenCraftTabItems;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

import java.util.Arrays;
import java.util.HashSet;

public enum Items {

    //cock

    STEEL_HAMMER,
    REINFORCED_STEEL_HAMMER,
    STEEL_HILT,
    STEEL_BLADE,
    CRYSTAL_HILT,
    CRYSTAL_BLADE;

    static HashSet<Items> items = new HashSet<Items>();

    public Item getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabItems.ELDEN_CRAFT_TAB_ITEMS);
        switch(this) {
            case STEEL_HAMMER:
            case REINFORCED_STEEL_HAMMER:
            case STEEL_HILT:
            case STEEL_BLADE:
            case CRYSTAL_HILT:
            case CRYSTAL_BLADE:
                return new Item(tab);
            default:
                return null;
        }
    }

    public static HashSet<Items> hashSetter() {
        if(items.isEmpty()) {
            items.addAll(Arrays.asList(Items.values()));
        }
        return items;
    }

    public String getName() {
        switch(this) {
            case STEEL_HAMMER:
                return "steel_hammer";
            case REINFORCED_STEEL_HAMMER:
                return "reinforced_steel_hammer";
            case STEEL_HILT:
                return "steel_hilt";
            case STEEL_BLADE:
                return "steel_blade";
            case CRYSTAL_HILT:
                return "crystal_hilt";
            case CRYSTAL_BLADE:
                return "crystal_blade";
            default:
                return null;
        }
    }

}
