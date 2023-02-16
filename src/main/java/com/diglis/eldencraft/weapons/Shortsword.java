package com.diglis.eldencraft.weapons;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class Shortsword extends SwordItem {

    public Shortsword(IItemTier tier, int damage, float speed, Properties tab) {
        super(tier, damage, speed, tab);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity user) {
        return super.hurtEnemy(stack, target, user);
    }

}
