package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.pickaxes.SteelPickaxe;
import com.diglis.eldencraft.item.tabs.ToolGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public enum Pickaxes {

    STEEL_PICKAXE;

    public PickaxeItem getItem() {
        Properties tab = new Item.Properties().tab(ToolGroup.ELDEN_CRAFT_TOOLS);
        switch(this) {
            case STEEL_PICKAXE:
                return new SteelPickaxe(ItemTier.IRON, 2, 4.5f, tab);
            default:
                return null;
        }
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
