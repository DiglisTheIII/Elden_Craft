package com.diglis.eldencraft.weapons;

import com.diglis.eldencraft.effects.EffectsInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class BastardSword extends SwordItem {
    public BastardSword(IItemTier tier, int damage, float speed, Properties tab) {
        super(tier, damage, speed, tab);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity user) {
        return super.hurtEnemy(stack, target, user);
    }
}
