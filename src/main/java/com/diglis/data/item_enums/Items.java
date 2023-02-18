package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.tabs.EldenCraftTabItems;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

import java.util.Arrays;
import java.util.HashSet;

public enum Items {

    STEEL_INGOT,
    STEEL_CHUNK,
    CARBON_SHARD,
    LEATHER_STRIPS,
    STEEL_HAMMER,
    REINFORCED_STEEL_HAMMER,
    REINFORCED_STICK,
    STEEL_HILT,
    STEEL_BLADE,
    CRYSTAL_HILT,
    CRYSTAL_BLADE,
    SMITHING_STONE_1,
    SMITHING_STONE_2,
    SMITHING_STONE_3,
    SMITHING_STONE_4,
    SMITHING_STONE_5,
    SMITHING_STONE_6,
    SMITHING_STONE_7,
    SMITHING_STONE_8,
    ANCIENT_DRAGON_SMITHING_STONE,
    SHATTERED_CRYSTAL,
    CRYSTAL_GEM;

    static HashSet<Items> items = new HashSet<Items>();

    public Item getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabItems.ELDEN_CRAFT_TAB_ITEMS);
        switch(this) {
            case STEEL_INGOT:
            case STEEL_CHUNK:
            case CARBON_SHARD:
            case LEATHER_STRIPS:
            case SMITHING_STONE_1:
            case SMITHING_STONE_2:
            case SMITHING_STONE_3:
            case SMITHING_STONE_4:
            case SMITHING_STONE_5:
            case SMITHING_STONE_6:
            case SMITHING_STONE_7:
            case SMITHING_STONE_8:
            case ANCIENT_DRAGON_SMITHING_STONE:
            case SHATTERED_CRYSTAL:
            case CRYSTAL_GEM:
            case STEEL_HAMMER:
            case REINFORCED_STEEL_HAMMER:
            case REINFORCED_STICK:
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
            case STEEL_INGOT:
                return "steel_ingot";
            case STEEL_CHUNK:
                return "steel_chunk";
            case CARBON_SHARD:
                return "carbon_shard";
            case LEATHER_STRIPS:
                return "leather_strips";
            case SMITHING_STONE_1:
                return "smithing_stone_1";
            case SMITHING_STONE_2:
                return "smithing_stone_2";
            case SMITHING_STONE_3:
                return "smithing_stone_3";
            case SMITHING_STONE_4:
                return "smithing_stone_4";
            case SMITHING_STONE_5:
                return "smithing_stone_5";
            case SMITHING_STONE_6:
                return "smithing_stone_6";
            case SMITHING_STONE_7:
                return "smithing_stone_7";
            case SMITHING_STONE_8:
                return "smithing_stone_8";
            case ANCIENT_DRAGON_SMITHING_STONE:
                return "ancient_dragon_smithing_stone";
            case SHATTERED_CRYSTAL:
                return "shattered_crystal";
            case CRYSTAL_GEM:
                return "crystal_gem";
            case STEEL_HAMMER:
                return "steel_hammer";
            case REINFORCED_STEEL_HAMMER:
                return "reinforced_steel_hammer";
            case REINFORCED_STICK:
                return "reinforced_stick";
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
