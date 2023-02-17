package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabTools extends ItemGroup {
    public static final EldenCraftTabTools ELDEN_CRAFT_TAB_TOOLS = new EldenCraftTabTools(ItemGroup.TABS.length, "elden_craft_tools");

    public EldenCraftTabTools(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return ItemInit.STEEL_PICKAXE.get().getDefaultInstance();
    }
}
