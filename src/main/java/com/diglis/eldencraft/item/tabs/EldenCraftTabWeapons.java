package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabWeapons extends ItemGroup {
    public static final EldenCraftTabWeapons ELDEN_CRAFT_TAB_WEAPONS = new EldenCraftTabWeapons(ItemGroup.TABS.length, "elden_craft_weapons");

    public EldenCraftTabWeapons(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return ItemInit.BLACK_KNIFE.get().getDefaultInstance();
    }

}

