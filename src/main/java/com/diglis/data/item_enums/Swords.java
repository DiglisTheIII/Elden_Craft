package com.diglis.data.item_enums;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.ItemInit;
import com.diglis.eldencraft.item.tabs.WpnGroup;
import com.diglis.eldencraft.weapons.BastardSword;
import com.diglis.eldencraft.weapons.BlackKnife;
import com.diglis.eldencraft.weapons.Shortsword;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.ObjectUtils;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public enum Swords {

    BASTARD_SWORD, SHORT_SWORD, BLACK_KNIFE;
    static HashSet<Swords> swords = new HashSet<Swords>();

    public SwordItem getItem() {
        Properties tab = new Item.Properties().tab(WpnGroup.ELDEN_CRAFT_WEAPONS);
        switch(this) {
            case BASTARD_SWORD:
                return new BastardSword(ItemTier.IRON, 6, 5.5f, tab);
            case SHORT_SWORD:
                return new Shortsword(ItemTier.IRON, 4, 3.5f, tab);
            case BLACK_KNIFE:
                return new BlackKnife(ItemTier.NETHERITE, 9, 2.5f, tab);
            default:
                return null;
        }
    }

    public String getName() {
        switch(this) {
            case BASTARD_SWORD:
                return "bastard_sword";
            case SHORT_SWORD:
                return "short_sword";
            case BLACK_KNIFE:
                return "black_knife";
            default:
                return null;
        }
    }

    public static HashSet<Swords> hashSetter() {
        if(swords.isEmpty()) {
            for(Swords s : Swords.values()) {
                swords.add(s);
            }
        }

        return swords;
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        EffectInstance[] effects = {
                new EffectInstance(Effects.DAMAGE_BOOST),
                new EffectInstance(Effects.MOVEMENT_SPEED),
                new EffectInstance(Effects.ABSORPTION, 180, 5),
                new EffectInstance(Effects.DIG_SPEED),
                new EffectInstance(Effects.MOVEMENT_SLOWDOWN),
                new EffectInstance(Effects.INVISIBILITY, 180, 10)
        };


        if(player.getItemInHand(Hand.MAIN_HAND) != null) {
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
            } else if(player.isHolding(ItemInit.BLACK_KNIFE.get().asItem())) {
                if(player.getHealth() >= (player.getHealth() / 2)) {
                    player.addEffect(effects[5]);
                } else {
                    player.removeEffect(effects[5].getEffect());
                }
            } else if(player.getItemInHand(Hand.MAIN_HAND).isEmpty()) {
                player.removeEffect(Effects.INVISIBILITY);
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


