package com.diglis.data.enums;
import com.diglis.eldencraft.effects.enchantments.DeathAura;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import java.util.Arrays;
import java.util.HashSet;
public enum Enchantments {
    DEATH_AURA;
    static HashSet<Enchantments> enchantments = new HashSet<>();
    public Enchantment getItem() {
        switch(this) {
            case DEATH_AURA:
                return new DeathAura(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, EquipmentSlotType.values());
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
