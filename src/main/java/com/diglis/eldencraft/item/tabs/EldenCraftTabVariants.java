package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabVariants extends ItemGroup {
    public static final EldenCraftTabVariants ELDEN_CRAFT_TAB_VARIANTS = new EldenCraftTabVariants(ItemGroup.TABS.length, "elden_craft_variants");
    public EldenCraftTabVariants(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.BASTARD_SWORD_1.get());
    }
}
