package com.diglis.data.item_enums;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.ItemInit;
import com.diglis.eldencraft.item.tabs.EldenCraftTabWeapons;
import com.diglis.eldencraft.weapons.BasicSteelFrame;
import com.diglis.eldencraft.weapons.BastardSword;
import com.diglis.eldencraft.weapons.BlackKnife;
import com.diglis.eldencraft.weapons.Shortsword;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public enum Swords {

    BASIC_STEEL_FRAME,
    BASTARD_SWORD,
    BASTARD_SWORD_1,
    BASTARD_SWORD_2,
    BASTARD_SWORD_3,
    BASTARD_SWORD_4,
    BASTARD_SWORD_5,
    BASTARD_SWORD_6,
    BASTARD_SWORD_7,
    SHORT_SWORD,
    SHORT_SWORD_1,
    SHORT_SWORD_2,
    SHORT_SWORD_3,
    SHORT_SWORD_4,
    SHORT_SWORD_5,
    SHORT_SWORD_6,
    SHORT_SWORD_7,
    BLACK_KNIFE;
    static HashSet<Swords> swords = new HashSet<Swords>();
    static final PlayerEntity player = Minecraft.getInstance().player;

    public SwordItem getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabWeapons.ELDEN_CRAFT_TAB_WEAPONS);
        switch(this) {
            case BASTARD_SWORD:
                return new BastardSword(ItemTier.IRON, 6, 5.5f, tab);
            case BASTARD_SWORD_1:
                return new BastardSword(ItemTier.IRON, 7, 5.5f, tab);
            case BASTARD_SWORD_2:
                return new BastardSword(ItemTier.IRON, 8, 5.5f, tab);
            case BASTARD_SWORD_3:
                return new BastardSword(ItemTier.IRON, 9, 5.5f, tab);
            case BASTARD_SWORD_4:
                return new BastardSword(ItemTier.IRON, 10, 5.5f, tab);
            case BASTARD_SWORD_5:
                return new BastardSword(ItemTier.IRON, 11, 5.5f, tab);
            case BASTARD_SWORD_6:
                return new BastardSword(ItemTier.IRON, 12, 5.5f, tab);
            case BASTARD_SWORD_7:
                return new BastardSword(ItemTier.IRON, 13, 5.5f, tab);
            case SHORT_SWORD:
                return new Shortsword(ItemTier.IRON, 4, 8.5f, tab);
            case SHORT_SWORD_1:
                return new Shortsword(ItemTier.IRON, 5, 8.5f, tab);
            case SHORT_SWORD_2:
                return new Shortsword(ItemTier.IRON, 6, 8.5f, tab);
            case SHORT_SWORD_3:
                return new Shortsword(ItemTier.IRON, 7, 8.5f, tab);
            case SHORT_SWORD_4:
                return new Shortsword(ItemTier.IRON, 8, 8.5f, tab);
            case SHORT_SWORD_5:
                return new Shortsword(ItemTier.IRON, 9, 8.5f, tab);
            case SHORT_SWORD_6:
                return new Shortsword(ItemTier.IRON, 10, 8.5f, tab);
            case SHORT_SWORD_7:
                return new Shortsword(ItemTier.IRON, 11, 8.5f, tab);
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
            case BASTARD_SWORD_1:
                return "bastard_sword_1";
            case BASTARD_SWORD_2:
                return "bastard_sword_2";
            case BASTARD_SWORD_3:
                return "bastard_sword_3";
            case BASTARD_SWORD_4:
                return "bastard_sword_4";
            case BASTARD_SWORD_5:
                return "bastard_sword_5";
            case BASTARD_SWORD_6:
                return "bastard_sword_6";
            case BASTARD_SWORD_7:
                return "bastard_sword_7";
            case SHORT_SWORD:
                return "short_sword";
            case SHORT_SWORD_1:
                return "short_sword_1";
            case SHORT_SWORD_2:
                return "short_sword_2";
            case SHORT_SWORD_3:
                return "short_sword_3";
            case SHORT_SWORD_4:
                return "short_sword_4";
            case SHORT_SWORD_5:
                return "short_sword_5";
            case SHORT_SWORD_6:
                return "short_sword_6";
            case SHORT_SWORD_7:
                return "short_sword_7";
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
     *  a HashSet which can be assigned elsewhere. All enums have a copy of this
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
        } else if(player.isHolding(ItemInit.BASIC_STEEL_FRAME.get().asItem())) {
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


