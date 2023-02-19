package com.diglis.data.enums;

import com.diglis.eldencraft.armor.boots.MalikethsBoots;
import com.diglis.eldencraft.armor.chestplates.MalikethsArmor;
import com.diglis.eldencraft.armor.helmets.MalikethsHelm;
import com.diglis.eldencraft.armor.leggings.MalikethsGreaves;
import com.diglis.eldencraft.item.tabs.EldenCraftTabArmor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

import java.util.Arrays;
import java.util.HashSet;

public enum Armor {

    MALIKETHS_HELM,
    MALIKETHS_ARMOR,
    MALIKETHS_GREAVES,
    MALIKETHS_BOOTS,
    MALIKETHS_HELM_E,
    MALIKETHS_ARMOR_E,
    MALIKETHS_GREAVES_E,
    MALIKETHS_BOOTS_E;

    static HashSet<Armor> armor = new HashSet<>();
    public ArmorItem getItem() {
        Item.Properties tab = new Item.Properties().tab(EldenCraftTabArmor.ELDEN_CRAFT_TAB_ARMOR);
        switch(this) {
            case MALIKETHS_HELM:
                return new MalikethsHelm(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, tab, false);
            case MALIKETHS_ARMOR:
                return new MalikethsArmor(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, tab, false);
            case MALIKETHS_GREAVES:
                return new MalikethsGreaves(ArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, tab, false);
            case MALIKETHS_BOOTS:
                return new MalikethsBoots(ArmorMaterial.NETHERITE, EquipmentSlotType.FEET, tab, false);
            case MALIKETHS_HELM_E:
                return new MalikethsHelm(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, tab, true);
            case MALIKETHS_ARMOR_E:
                return new MalikethsArmor(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, tab, true);
            case MALIKETHS_GREAVES_E:
                return new MalikethsGreaves(ArmorMaterial.NETHERITE, EquipmentSlotType.LEGS, tab, true);
            case MALIKETHS_BOOTS_E:
                return new MalikethsBoots(ArmorMaterial.NETHERITE, EquipmentSlotType.FEET, tab, true);
            default:
                return null;
        }
    }

    public static HashSet<Armor> hashSetter() {
        if(armor.isEmpty()) {
            armor.addAll(Arrays.asList(Armor.values()));
        }
        return armor;
    }

    public String getName() {
        switch(this) {
            case MALIKETHS_HELM:
                return "malikeths_helm";
            case MALIKETHS_ARMOR:
                return "malikeths_armor";
            case MALIKETHS_GREAVES:
                return "malikeths_greaves";
            case MALIKETHS_BOOTS:
                return "malikeths_boots";
            case MALIKETHS_HELM_E:
                return "malikeths_helm_e";
            case MALIKETHS_ARMOR_E:
                return "malikeths_armor_e";
            case MALIKETHS_GREAVES_E:
                return "malikeths_greaves_e";
            case MALIKETHS_BOOTS_E:
                return "malikeths_boots_e";
            default:
                return null;
        } //fine
    }

}
