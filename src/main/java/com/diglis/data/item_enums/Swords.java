package com.diglis.data.item_enums;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.ItemInit;
import com.diglis.eldencraft.item.tabs.WpnGroup;
import com.diglis.eldencraft.weapons.BasicSteelFrame;
import com.diglis.eldencraft.weapons.BastardSword;
import com.diglis.eldencraft.weapons.BlackKnife;
import com.diglis.eldencraft.weapons.Shortsword;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public enum Swords {

    BASIC_STEEL_FRAME, BASTARD_SWORD, SHORT_SWORD, BLACK_KNIFE;
    static HashSet<Swords> swords = new HashSet<Swords>();

    public SwordItem getItem() {
        Properties tab = new Item.Properties().tab(WpnGroup.ELDEN_CRAFT_WEAPONS);
        switch(this) {
            case BASTARD_SWORD:
                return new BastardSword(ItemTier.IRON, 6, 5.5f, tab);
            case SHORT_SWORD:
                return new Shortsword(ItemTier.IRON, 4, 8.5f, tab);
            case BLACK_KNIFE:
                return new BlackKnife(ItemTier.NETHERITE, 9, 15f, tab);
            case BASIC_STEEL_FRAME:
                return new BasicSteelFrame(ItemTier.STONE, 0, 0.0001f, tab);
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
            case BASIC_STEEL_FRAME:
                return "basic_steel_frame";
            default:
                return null;
        }
    }

    /*
     *  Sets all HashSets of type Swords (this), then returns
     *  a HashSet which can be assigned elsewhere. All classes have a copy of this
     *  method, so I will keep this description here.
     */
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
        World world = Minecraft.getInstance().level;

        EffectInstance[] effects = {
                new EffectInstance(Effects.DAMAGE_BOOST),
                new EffectInstance(Effects.MOVEMENT_SPEED),
                new EffectInstance(Effects.ABSORPTION, 180, 5),
                new EffectInstance(Effects.DIG_SPEED),
                new EffectInstance(Effects.MOVEMENT_SLOWDOWN),
                new EffectInstance(Effects.INVISIBILITY, 180, 10)
        };

        String[] weaponsList = {
                "bastard_sword",
                "short_sword",
                "black_knife",
                "steel_pickaxe"
        };

        player.getItemInHand(Hand.MAIN_HAND);
        if(player.isHolding(ItemInit.BASTARD_SWORD.get().asItem()) && player.getHealth() == player.getMaxHealth()) {
            //Apply strength if user is holding the weapon and is at full health.
            player.addEffect(effects[0]);
        } else if(player.isHolding(ItemInit.SHORT_SWORD.get().asItem())) {
            //Applies absorption (will re-balance later), and a speed boost when player is at <= 3 hearts
            if(player.getHealth() <= 3.0f) {
                player.addEffect(effects[1]);
                player.addEffect(effects[2]);
            }
        } else if(player.isHolding(ItemInit.STEEL_PICKAXE.get().asItem())) {
            //Gives haste but slows the user down when at max health.
            if(player.getHealth() == player.getMaxHealth()) {
                player.addEffect(effects[3]);
                player.addEffect(effects[4]);
            }
        } else if(player.isHolding(ItemInit.BLACK_KNIFE.get().asItem())) {
            //When player is at >= half health, the user will be invisible.
            if(player.getHealth() >= (player.getHealth() / 2)) {
                player.addEffect(effects[5]);
            } else {
                player.removeEffect(effects[5].getEffect());
            }
        } else if(player.getItemInHand(Hand.MAIN_HAND).isEmpty()) {
            /*
             * Loops through all handslots to check if player is holding another Elden Craft weapon.
             * This should ensure that no effect incompatibilities will cause any issues.
             * It is sort of like a safer flush of the effects the weapons imposed on the player.
             */
            player.getHandSlots().forEach(sword -> {
                int i = weaponsList.length - 1;
                while(sword.getItem().toString().equals(weaponsList[i]) && i != 0) {
                    player.removeEffect(Effects.DAMAGE_BOOST);
                    player.removeEffect(Effects.MOVEMENT_SPEED);
                    player.removeEffect(Effects.ABSORPTION);
                    player.removeEffect(Effects.DIG_SPEED);
                    player.removeEffect(Effects.MOVEMENT_SLOWDOWN);
                    i--;
                }
            });
            player.removeEffect(Effects.INVISIBILITY);
        }
    }
}


