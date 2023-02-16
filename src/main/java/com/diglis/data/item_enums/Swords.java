package com.diglis.data.item_enums;

import com.diglis.eldencraft.item.tabs.WpnGroup;
import com.diglis.eldencraft.weapons.BastardSword;
import com.diglis.eldencraft.weapons.BlackKnife;
import com.diglis.eldencraft.weapons.Shortsword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;


public enum Swords {

    BASTARD_SWORD, SHORT_SWORD, BLACK_KNIFE;

    public SwordItem getItem() {
        Properties tab = new Item.Properties().tab(WpnGroup.ELDEN_CRAFT_WEAPONS);
        switch(this) {
            case BASTARD_SWORD:
                return new BastardSword(ItemTier.IRON, 6, 5.5f, tab);
            case SHORT_SWORD:
                return new Shortsword(ItemTier.IRON, 4, 3.5f, tab);
            case BLACK_KNIFE:
                return new BlackKnife(ItemTier.NETHERITE, 9, 2.5f, tab);
            default:
                return null;
        }
    }

    public String getName() {
        switch(this) {
            case BASTARD_SWORD:
                return "bastard_sword";
            case SHORT_SWORD:
                return "short_sword";
            case BLACK_KNIFE:
                return "black_knife";
            default:
                return null;
        }
    }
}


