package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabArmor extends ItemGroup {
    public static final EldenCraftTabArmor ELDEN_CRAFT_TAB_ARMOR = new EldenCraftTabArmor(ItemGroup.TABS.length, "elden_craft_armor");

    public EldenCraftTabArmor(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.BLACK_KNIFE.get());
    }
}
