package com.diglis.eldencraft.item.pickaxes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.world.World;
public class SteelPickaxe extends PickaxeItem {
    public SteelPickaxe(IItemTier tier, int damage, float speed, Properties tab) {
        super(tier, damage, speed, tab);
    }
    @Override
    public void onCraftedBy(ItemStack stack, World world, PlayerEntity player) {
        super.onCraftedBy(stack, world, player);
    }
}
