package com.diglis.eldencraft.weapons;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import javax.annotation.ParametersAreNonnullByDefault;

public class Zweihander extends SwordItem {
    public Zweihander(IItemTier tier, int damage, float speed, Properties tab) {
        super(tier, damage, speed, tab);
    }

    @Override
    public boolean hurtEnemy(@ParametersAreNonnullByDefault ItemStack stack, LivingEntity target, LivingEntity player) {
        target.knockback(1f, player.getX() - target.getX(), player.getZ() - target.getZ());
        return true;
    }
}
