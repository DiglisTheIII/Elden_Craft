package com.diglis.data.enums;

import com.diglis.eldencraft.effects.enchantments.DeathAura;
import com.diglis.eldencraft.item.pickaxes.SteelPickaxe;
import com.diglis.eldencraft.item.tabs.EldenCraftTabTools;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.Arrays;
import java.util.HashSet;

public enum Enchantments {

    DEATH_AURA;

    static HashSet<Enchantments> enchantments = new HashSet<>();

    public Enchantment getItem() {
        switch(this) {
            case DEATH_AURA:
                return new DeathAura(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, EquipmentSlotType.values());
            default:
                return null;
        }
    }

    public static HashSet<Enchantments> hashSetter() {
        if(enchantments.isEmpty()) {
            enchantments.addAll(Arrays.asList(Enchantments.values()));
        }
        return enchantments;
    }

    public String getName() {
        switch(this) {
            case DEATH_AURA:
                return "death_aura";
            default:
                return null;
        }
    }

}
