package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MiscGroup extends ItemGroup {
    public static final MiscGroup ELDEN_CRAFT_MISC = new MiscGroup(ItemGroup.TABS.length, "elden_craft_misc");

    public MiscGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        assert ItemInit.STEEL_INGOT != null;
        return new ItemStack(ItemInit.STEEL_INGOT.get());
    }
}
