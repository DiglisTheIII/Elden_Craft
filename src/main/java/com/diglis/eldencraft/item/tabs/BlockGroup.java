package com.diglis.eldencraft.item.tabs;

import com.diglis.eldencraft.block.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BlockGroup extends ItemGroup{

    public static final BlockGroup ELDEN_CRAFT_BLOCKS = new BlockGroup(ItemGroup.TABS.length, "elden_craft_blocks");

    public BlockGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        assert BlockInit.CARBON_RUNOFF != null;
        return new ItemStack(BlockInit.CARBON_RUNOFF.get());
    }

}
