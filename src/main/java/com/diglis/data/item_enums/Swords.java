package com.diglis.data.item_enums;

import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.item.pickaxes.SteelPickaxe;
import com.diglis.eldencraft.item.tabs.EldenCraftTabVariants;
import com.diglis.eldencraft.item.tabs.EldenCraftTabWeapons;
import com.diglis.eldencraft.weapons.*;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.*;

@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
@SuppressWarnings("unused")
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
    ZWEIHANDER,
    ZWEIHANDER_1,
    ZWEIHANDER_2,
    ZWEIHANDER_3,
    ZWEIHANDER_4,
    ZWEIHANDER_5,
    ZWEIHANDER_6,
    ZWEIHANDER_7,
    CRYSTAL_SWORD,
    BASIC_CRYSTAL_FRAME,
    BLACK_KNIFE;
    static final HashSet<Swords> swords = new HashSet<>();
    static final PlayerEntity player = Minecraft.getInstance().player;

    public SwordItem getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabWeapons.ELDEN_CRAFT_TAB_WEAPONS);
        Properties variants = new Item.Properties().tab(EldenCraftTabVariants.ELDEN_CRAFT_TAB_VARIANTS);
        switch(this) {
            case BASTARD_SWORD:
                return new BastardSword(ItemTier.IRON, 6, 5.5f, tab);
            case BASTARD_SWORD_1:
                return new BastardSword(ItemTier.IRON, 7, 5.5f, variants);
            case BASTARD_SWORD_2:
                return new BastardSword(ItemTier.IRON, 8, 5.5f, variants);
            case BASTARD_SWORD_3:
                return new BastardSword(ItemTier.IRON, 9, 5.5f, variants);
            case BASTARD_SWORD_4:
                return new BastardSword(ItemTier.IRON, 10, 5.5f, variants);
            case BASTARD_SWORD_5:
                return new BastardSword(ItemTier.IRON, 11, 5.5f, variants);
            case BASTARD_SWORD_6:
                return new BastardSword(ItemTier.IRON, 12, 5.5f, variants);
            case BASTARD_SWORD_7:
                return new BastardSword(ItemTier.IRON, 13, 5.5f, variants);
            case SHORT_SWORD:
                return new Shortsword(ItemTier.IRON, 4, 8.5f, tab);
            case SHORT_SWORD_1:
                return new Shortsword(ItemTier.IRON, 5, 8.5f, variants);
            case SHORT_SWORD_2:
                return new Shortsword(ItemTier.IRON, 6, 8.5f, variants);
            case SHORT_SWORD_3:
                return new Shortsword(ItemTier.IRON, 7, 8.5f, variants);
            case SHORT_SWORD_4:
                return new Shortsword(ItemTier.IRON, 8, 8.5f, variants);
            case SHORT_SWORD_5:
                return new Shortsword(ItemTier.IRON, 9, 8.5f, variants);
            case SHORT_SWORD_6:
                return new Shortsword(ItemTier.IRON, 10, 8.5f, variants);
            case SHORT_SWORD_7:
                return new Shortsword(ItemTier.IRON, 11, 8.5f, variants);
            case ZWEIHANDER:
                return new Zweihander(ItemTier.IRON, 11, 1f, tab);
            case ZWEIHANDER_1:
                return new Zweihander(ItemTier.IRON, 12, 1f, variants);
            case ZWEIHANDER_2:
                return new Zweihander(ItemTier.IRON, 13, 1f, variants);
            case ZWEIHANDER_3:
                return new Zweihander(ItemTier.IRON, 14, 1f, variants);
            case ZWEIHANDER_4:
                return new Zweihander(ItemTier.IRON, 15, 1f, variants);
            case ZWEIHANDER_5:
                return new Zweihander(ItemTier.IRON, 16, 1f, variants);
            case ZWEIHANDER_6:
                return new Zweihander(ItemTier.IRON, 17, 1f, variants);
            case ZWEIHANDER_7:
                return new Zweihander(ItemTier.IRON, 18, 1f, variants);
            case CRYSTAL_SWORD:
                return new CrystalSword(ItemTier.DIAMOND, 14, 5f, tab);
            case BLACK_KNIFE:
                return new BlackKnife(ItemTier.NETHERITE, 9, 15f, tab);
            case BASIC_STEEL_FRAME:
                return new BasicSteelFrame(ItemTier.STONE, 0, 0.0001f, tab);
            case BASIC_CRYSTAL_FRAME:
                return new BasicCrystalFrame(ItemTier.DIAMOND, 0, 0.0001f, tab);
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
            case ZWEIHANDER:
                return "zweihander";
            case ZWEIHANDER_1:
                return "zweihander_1";
            case ZWEIHANDER_2:
                return "zweihander_2";
            case ZWEIHANDER_3:
                return "zweihander_3";
            case ZWEIHANDER_4:
                return "zweihander_4";
            case ZWEIHANDER_5:
                return "zweihander_5";
            case ZWEIHANDER_6:
                return "zweihander_6";
            case ZWEIHANDER_7:
                return "zweihander_7";
            case CRYSTAL_SWORD:
                return "crystal_sword";
            case BLACK_KNIFE:
                return "black_knife";
            case BASIC_STEEL_FRAME:
                return "basic_steel_frame";
            case BASIC_CRYSTAL_FRAME:
                return "basic_crystal_frame";
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
            swords.addAll(Arrays.asList(Swords.values()));
        }

        return swords;
    }

    @SubscribeEvent
    public static void onClickEvent(InputEvent.ClickInputEvent event) {
        PlayerEntity player = Minecraft.getInstance().player;
        assert player != null;
        if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof BlackKnife) {
            if(event.getKeyBinding().matchesMouse(1) && player.isOnGround() && !player.isHurt()) {
                player.addEffect(new EffectInstance(Effects.LEVITATION, 180, 2));
            } else if(event.getKeyBinding().matchesMouse(1) && !player.isOnGround()) {
                player.removeEffect(Effects.LEVITATION);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        World world = Minecraft.getInstance().level;
        Collection<EffectInstance> effectsOnPlayer = player.getActiveEffects();

        EffectInstance[] effects = {
                new EffectInstance(Effects.DAMAGE_BOOST),
                new EffectInstance(Effects.MOVEMENT_SPEED),
                new EffectInstance(Effects.ABSORPTION, 180, 5),
                new EffectInstance(Effects.DIG_SPEED),
                new EffectInstance(Effects.MOVEMENT_SLOWDOWN),
                new EffectInstance(Effects.INVISIBILITY, 180, 10),
                new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 0, 2)
        };

        String[] weaponsList = {
                "bastard_sword",
                "short_sword",
                "black_knife",
                "steel_pickaxe"
        };

        player.getItemInHand(Hand.MAIN_HAND);
        if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof BastardSword && player.getHealth() == player.getMaxHealth()) {
            //Apply strength if user is holding the weapon and is at full health.
            player.addEffect(effects[0]);
        } else if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof Shortsword) {
            //Applies absorption (will re-balance later), and a speed boost when player is at <= 3 hearts
            if(player.getHealth() <= 3.0f) {
                player.addEffect(effects[1]);
                player.addEffect(effects[2]);
            }
        } else if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof SteelPickaxe) {
            //Gives haste but slows the user down when at max health.
            if(player.getHealth() == player.getMaxHealth()) {
                player.addEffect(effects[3]);
                player.addEffect(effects[4]);
            }
            //TODO Textures for Somber Smithing Stones
        } else if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof BlackKnife) {
            //Heals player if they have a piece of armor with feather falling or projectile protection
            Iterable<ItemStack> slots = player.getArmorSlots();
            slots.forEach(armor -> {
                /* If player was last damaged by gravity, heal 0.5h/t.
                 * Also, it only works if player was last damaged by another fall, just for balancing reasons
                 */
                Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(armor);
                boolean isValidEnchant = enchantments.containsKey(Enchantments.FALL_PROTECTION) || enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION);
                boolean didFallLast = Objects.equals(player.getLastDamageSource(), DamageSource.FALL);
                if(isValidEnchant && didFallLast) {
                    player.heal(0.5f);
                }
            });
        } else if(player.getItemInHand(Hand.MAIN_HAND).getItem() instanceof Zweihander) {
            player.addEffect(effects[6]);
        } else if(player.getItemInHand(Hand.MAIN_HAND).isEmpty()) {
            for(EffectInstance ei : effectsOnPlayer) {
                player.removeEffect(ei.getEffect());
            }
        }
    }
}