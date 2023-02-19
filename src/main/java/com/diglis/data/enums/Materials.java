package com.diglis.data.enums;

import com.diglis.eldencraft.item.tabs.EldenCraftTabItems;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.HashSet;

public enum Materials {

    ANCIENT_DRAGON_SMITHING_STONE,
    CARBON_SHARD,
    CRYSTAL_GEM,
    LEATHER_STRIPS,
    REINFORCED_STICK,
    SHATTERED_CRYSTAL,
    SMITHING_STONE_1,
    SMITHING_STONE_2,
    SMITHING_STONE_3,
    SMITHING_STONE_4,
    SMITHING_STONE_5,
    SMITHING_STONE_6,
    SMITHING_STONE_7,
    SMITHING_STONE_8,
    SOMBER_SMITHING_STONE_1,
    SOMBER_SMITHING_STONE_2,
    SOMBER_SMITHING_STONE_3,
    SOMBER_SMITHING_STONE_4,
    SOMBER_SMITHING_STONE_5,
    SOMBER_SMITHING_STONE_6,
    STEEL_CHUNK,
    STEEL_INGOT;

    static HashSet<Materials> materials = new HashSet<Materials>();

    public static HashSet<Materials> hashSetter() {
        if(materials.isEmpty()) {
            materials.addAll(Arrays.asList(Materials.values()));
        }
        return materials;
    }

    public Item getItem() {
        Item.Properties tab = new Item.Properties().tab(EldenCraftTabItems.ELDEN_CRAFT_TAB_ITEMS);
        switch(this) {
            case STEEL_INGOT:
            case STEEL_CHUNK:
            case CARBON_SHARD:
            case LEATHER_STRIPS:
            case REINFORCED_STICK:
            case SHATTERED_CRYSTAL:
            case CRYSTAL_GEM:
            case SMITHING_STONE_1:
            case SMITHING_STONE_2:
            case SMITHING_STONE_3:
            case SMITHING_STONE_4:
            case SMITHING_STONE_5:
            case SMITHING_STONE_6:
            case SMITHING_STONE_7:
            case SMITHING_STONE_8:
            case ANCIENT_DRAGON_SMITHING_STONE:
            case SOMBER_SMITHING_STONE_1:
            case SOMBER_SMITHING_STONE_2:
            case SOMBER_SMITHING_STONE_3:
            case SOMBER_SMITHING_STONE_4:
            case SOMBER_SMITHING_STONE_5:
            case SOMBER_SMITHING_STONE_6:
                return new Item(tab);
            default:
                return null;
        }
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
            case REINFORCED_STICK:
                return "reinforced_stick";
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
            case SOMBER_SMITHING_STONE_1:
                return "somber_smithing_stone_1";
            case SOMBER_SMITHING_STONE_2:
                return "somber_smithing_stone_2";
            case SOMBER_SMITHING_STONE_3:
                return "somber_smithing_stone_3";
            case SOMBER_SMITHING_STONE_4:
                return "somber_smithing_stone_4";
            case SOMBER_SMITHING_STONE_5:
                return "somber_smithing_stone_5";
            case SOMBER_SMITHING_STONE_6:
                return "somber_smithing_stone_6";
            case SHATTERED_CRYSTAL:
                return "shattered_crystal";
            case CRYSTAL_GEM:
                return "crystal_gem";
        }
        return null;
    }
}
