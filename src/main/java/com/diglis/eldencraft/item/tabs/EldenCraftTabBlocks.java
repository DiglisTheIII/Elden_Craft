package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.block.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EldenCraftTabBlocks extends ItemGroup {

    public static final EldenCraftTabBlocks ELDEN_CRAFT_TAB_BLOCKS = new EldenCraftTabBlocks(ItemGroup.TABS.length, "elden_craft_blocks");

    public EldenCraftTabBlocks(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.STEEL_BLOCK.get());
    }

}
