package com.diglis.eldencraft.weapons;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BlackKnife extends SwordItem {
    public BlackKnife(IItemTier tier, int damage, float speed, Properties tab) {
        super(tier, damage, speed, tab);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity user) {
        if(user.getHealth() == user.getMaxHealth()) {
            target.setHealth(target.getHealth() - 3f);
            System.out.println(target.getHealth());
            if(target instanceof MonsterEntity) {
                if(user.hasEffect(Effects.NIGHT_VISION)) {
                    target.kill();
                    System.out.println("KILLED");
                } else {
                    if(!target.isOnFire()) {
                        target.setSecondsOnFire(2000);
                    } else {
                        target.kill();
                    }
                    System.out.println(target.getName() + " knocked back");
                }
            } else if(target instanceof LivingEntity) {
                target.addEffect(new EffectInstance(Effects.POISON, 100, 10));
            }

        }
        return super.hurtEnemy(stack, target, user);
    }

}
