package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ToolGroup extends ItemGroup {

    public static final MiscGroup ELDEN_CRAFT_TOOLS = new MiscGroup(ItemGroup.TABS.length, "elden_craft_tools");

    public ToolGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        assert ItemInit.STEEL_PICKAXE != null;
        return new ItemStack(ItemInit.STEEL_PICKAXE.get());
    }

}
