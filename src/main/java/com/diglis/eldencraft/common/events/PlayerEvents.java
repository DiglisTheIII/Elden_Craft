package com.diglis.eldencraft.common.events;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        EffectInstance[] effects = {
                new EffectInstance(Effects.DAMAGE_BOOST),
                new EffectInstance(Effects.MOVEMENT_SPEED),
                new EffectInstance(Effects.ABSORPTION, 180, 5),
                new EffectInstance(Effects.DIG_SPEED),
                new EffectInstance(Effects.MOVEMENT_SLOWDOWN)
        };


        if(!player.getItemInHand(Hand.MAIN_HAND).equals(null)) {
            if(player.isHolding(ItemInit.BASTARD_SWORD.get().asItem())) {
                player.addEffect(effects[0]);
            } else if(player.isHolding(ItemInit.SHORT_SWORD.get().asItem())) {
                if(player.getHealth() <= 3.0f) {
                    player.addEffect(effects[1]);
                    player.addEffect(effects[2]);
                }
            } else if(player.isHolding(ItemInit.STEEL_PICKAXE.get().asItem())) {
                if(player.getHealth() == player.getMaxHealth()) {
                    player.addEffect(effects[3]);
                    player.addEffect(effects[4]);
                }
            }
        } else {
            for(EffectInstance ei : effects) {
                if(Objects.equals(ei, new EffectInstance(Effects.ABSORPTION, 180, 5))) {
                    System.out.println("DO NOTHING");
                } else {
                    player.removeEffect(ei.getEffect());
                }
            }
        }
    }
}