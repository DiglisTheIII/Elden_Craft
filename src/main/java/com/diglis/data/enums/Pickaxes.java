package com.diglis.data.enums;

import com.diglis.eldencraft.item.pickaxes.SteelPickaxe;
import com.diglis.eldencraft.item.tabs.EldenCraftTabTools;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

import java.util.Arrays;
import java.util.HashSet;

public enum Pickaxes {

    STEEL_PICKAXE;
    static HashSet<Pickaxes> pickaxes = new HashSet<Pickaxes>();
    public PickaxeItem getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabTools.ELDEN_CRAFT_TAB_TOOLS);
        switch(this) {
            case STEEL_PICKAXE:
                return new SteelPickaxe(ItemTier.IRON, 2, 4.5f, tab);
            default:
                return null;
        }
    }

    public static HashSet<Pickaxes> hashSetter() {
        if(pickaxes.isEmpty()) {
            pickaxes.addAll(Arrays.asList(Pickaxes.values()));
        }

        return pickaxes;
    }

    public String getName() {
        switch(this) {
            case STEEL_PICKAXE:
                return "steel_pickaxe";
            default:
                return null;
        }
    }

}
