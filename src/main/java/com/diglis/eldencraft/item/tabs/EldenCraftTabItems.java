package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabItems extends ItemGroup {

    public static final EldenCraftTabItems ELDEN_CRAFT_TAB_ITEMS = new EldenCraftTabItems(ItemGroup.TABS.length, "elden_craft_items");

    public EldenCraftTabItems(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return ItemInit.REINFORCED_STEEL_HAMMER.get().getDefaultInstance();
    }



}
