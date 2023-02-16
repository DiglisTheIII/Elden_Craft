package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WpnGroup extends ItemGroup {
    public static final MiscGroup ELDEN_CRAFT_WEAPONS = new MiscGroup(ItemGroup.TABS.length, "elden_craft_wpn");

    public WpnGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        assert ItemInit.BASTARD_SWORD != null;
        return new ItemStack(ItemInit.BASTARD_SWORD.get());
    }
}
