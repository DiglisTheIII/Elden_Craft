package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.tabs.MiscGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

import java.util.HashSet;

public enum Items {

    STEEL_INGOT,
    STEEL_CHUNK,
    CARBON_SHARD,
    LEATHER_STRIPS,
    STEEL_HAMMER,
    REINFORCED_STEEL_HAMMER,
    REINFORCED_STICK,
    SMITHING_STONE;

    static HashSet<Items> items = new HashSet<Items>();

    public Item getItem() {
        Properties tab = new Item.Properties().tab(MiscGroup.ELDEN_CRAFT_MISC);
        switch(this) {
            case STEEL_INGOT:
            case STEEL_CHUNK:
            case CARBON_SHARD:
            case LEATHER_STRIPS:
            case SMITHING_STONE:
            case STEEL_HAMMER:
            case REINFORCED_STEEL_HAMMER:
            case REINFORCED_STICK:
                return new Item(tab);
            default:
                return null;
        }
    }

    public static HashSet<Items> hashSetter() {
        if(items.isEmpty()) {
            for(Items i : Items.values()) {
                items.add(i);
            }
        }
        return items;
    }

    public String getName() {
        switch(this) {
            case STEEL_INGOT:
                return "steel_ingot";
            case STEEL_CHUNK:
                return "steel_chunk";
            case CARBON_SHARD:
                return "carbon_shard";
            case LEATHER_STRIPS:
                return "leather_strips";
            case SMITHING_STONE:
                return "smithing_stone";
            case STEEL_HAMMER:
                return "steel_hammer";
            case REINFORCED_STEEL_HAMMER:
                return "reinforced_steel_hammer";
            case REINFORCED_STICK:
                return "reinforced_stick";
            default:
                return null;
        }
    }

}
