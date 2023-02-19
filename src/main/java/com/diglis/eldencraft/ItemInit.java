package com.diglis.eldencraft;

import com.diglis.data.enums.*;
import com.diglis.data.enums.Items;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashSet;

@SuppressWarnings({"unchecked", "unused"})
public class ItemInit {


    //Blah blah boring boilerplate.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EldenCraft.MOD_ID);

    //Big ass block of code!
    public static final RegistryObject<Item> STEEL_INGOT = REGISTER_ITEM(Materials.STEEL_INGOT);
    public static final RegistryObject<Item> STEEL_CHUNK = REGISTER_ITEM(Materials.STEEL_CHUNK);
    public static final RegistryObject<Item> CARBON_SHARD = REGISTER_ITEM(Materials.CARBON_SHARD);
    public static final RegistryObject<Item> LEATHER_STRIPS = REGISTER_ITEM(Materials.LEATHER_STRIPS);
    public static final RegistryObject<Item> SMITHING_STONE_1 = REGISTER_ITEM(Materials.SMITHING_STONE_1);
    public static final RegistryObject<Item> SMITHING_STONE_2 = REGISTER_ITEM(Materials.SMITHING_STONE_2);
    public static final RegistryObject<Item> SMITHING_STONE_3 = REGISTER_ITEM(Materials.SMITHING_STONE_3);
    public static final RegistryObject<Item> SMITHING_STONE_4 = REGISTER_ITEM(Materials.SMITHING_STONE_4);
    public static final RegistryObject<Item> SMITHING_STONE_5 = REGISTER_ITEM(Materials.SMITHING_STONE_5);
    public static final RegistryObject<Item> SMITHING_STONE_6 = REGISTER_ITEM(Materials.SMITHING_STONE_6);
    public static final RegistryObject<Item> SMITHING_STONE_7 = REGISTER_ITEM(Materials.SMITHING_STONE_7);
    public static final RegistryObject<Item> SMITHING_STONE_8 = REGISTER_ITEM(Materials.SMITHING_STONE_8);
    public static final RegistryObject<Item> ANCIENT_DRAGON_SMITHING_STONE = REGISTER_ITEM(Materials.ANCIENT_DRAGON_SMITHING_STONE);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_1 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_1);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_2 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_2);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_3 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_3);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_4 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_4);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_5 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_5);
    public static final RegistryObject<Item> SOMBER_SMITHING_STONE_6 = REGISTER_ITEM(Materials.SOMBER_SMITHING_STONE_6);
    public static final RegistryObject<Item> SHATTERED_CRYSTAL = REGISTER_ITEM(Materials.SHATTERED_CRYSTAL);
    public static final RegistryObject<Item> CRYSTAL_GEM = REGISTER_ITEM(Materials.CRYSTAL_GEM);
    public static final RegistryObject<Item> STEEL_HAMMER = REGISTER_ITEM(Items.STEEL_HAMMER);
    public static final RegistryObject<Item> REINFORCED_STEEL_HAMMER = REGISTER_ITEM(Items.REINFORCED_STEEL_HAMMER);
    public static final RegistryObject<Item> REINFORCED_STICK = REGISTER_ITEM(Materials.REINFORCED_STICK);
    public static final RegistryObject<Item> STEEL_HILT = REGISTER_ITEM(Items.STEEL_HILT);
    public static final RegistryObject<Item> STEEL_BLADE = REGISTER_ITEM(Items.STEEL_BLADE);
    public static final RegistryObject<Item> CRYSTAL_HILT = REGISTER_ITEM(Items.CRYSTAL_HILT);
    public static final RegistryObject<Item> CRYSTAL_BLADE = REGISTER_ITEM(Items.CRYSTAL_BLADE);
    public static final RegistryObject<Item> TAZZ = REGISTER_ITEM(Items.TAZZ);

    public static final RegistryObject<SwordItem> BASIC_STEEL_FRAME = REGISTER_ITEM(Swords.BASIC_STEEL_FRAME);
    public static final RegistryObject<SwordItem> BASIC_CRYSTAL_FRAME = REGISTER_ITEM(Swords.BASIC_CRYSTAL_FRAME);
    public static final RegistryObject<SwordItem> BASTARD_SWORD = REGISTER_ITEM(Swords.BASTARD_SWORD);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_1 = REGISTER_ITEM(Swords.BASTARD_SWORD_1);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_2 = REGISTER_ITEM(Swords.BASTARD_SWORD_2);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_3 = REGISTER_ITEM(Swords.BASTARD_SWORD_3);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_4 = REGISTER_ITEM(Swords.BASTARD_SWORD_4);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_5 = REGISTER_ITEM(Swords.BASTARD_SWORD_5);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_6 = REGISTER_ITEM(Swords.BASTARD_SWORD_6);
    public static final RegistryObject<SwordItem> BASTARD_SWORD_7 = REGISTER_ITEM(Swords.BASTARD_SWORD_7);
    public static final RegistryObject<SwordItem> SHORT_SWORD = REGISTER_ITEM(Swords.SHORT_SWORD);
    public static final RegistryObject<SwordItem> SHORT_SWORD_1 = REGISTER_ITEM(Swords.SHORT_SWORD_1);
    public static final RegistryObject<SwordItem> SHORT_SWORD_2 = REGISTER_ITEM(Swords.SHORT_SWORD_2);
    public static final RegistryObject<SwordItem> SHORT_SWORD_3 = REGISTER_ITEM(Swords.SHORT_SWORD_3);
    public static final RegistryObject<SwordItem> SHORT_SWORD_4 = REGISTER_ITEM(Swords.SHORT_SWORD_4);
    public static final RegistryObject<SwordItem> SHORT_SWORD_5 = REGISTER_ITEM(Swords.SHORT_SWORD_5);
    public static final RegistryObject<SwordItem> SHORT_SWORD_6 = REGISTER_ITEM(Swords.SHORT_SWORD_6);
    public static final RegistryObject<SwordItem> SHORT_SWORD_7 = REGISTER_ITEM(Swords.SHORT_SWORD_7);
    public static final RegistryObject<SwordItem> ZWEIHANDER = REGISTER_ITEM(Swords.ZWEIHANDER);
    public static final RegistryObject<SwordItem> ZWEIHANDER_1 = REGISTER_ITEM(Swords.ZWEIHANDER_1);
    public static final RegistryObject<SwordItem> ZWEIHANDER_2 = REGISTER_ITEM(Swords.ZWEIHANDER_2);
    public static final RegistryObject<SwordItem> ZWEIHANDER_3 = REGISTER_ITEM(Swords.ZWEIHANDER_3);
    public static final RegistryObject<SwordItem> ZWEIHANDER_4 = REGISTER_ITEM(Swords.ZWEIHANDER_4);
    public static final RegistryObject<SwordItem> ZWEIHANDER_5 = REGISTER_ITEM(Swords.ZWEIHANDER_5);
    public static final RegistryObject<SwordItem> ZWEIHANDER_6 = REGISTER_ITEM(Swords.ZWEIHANDER_6);
    public static final RegistryObject<SwordItem> ZWEIHANDER_7 = REGISTER_ITEM(Swords.ZWEIHANDER_7);
    public static final RegistryObject<SwordItem> CRYSTAL_SWORD = REGISTER_ITEM(Swords.CRYSTAL_SWORD);
    public static final RegistryObject<SwordItem> BLACK_KNIFE = REGISTER_ITEM(Swords.BLACK_KNIFE);
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = REGISTER_ITEM(Pickaxes.STEEL_PICKAXE);
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = REGISTER_ITEM(Shovels.STEEL_SHOVEL);
    public static final RegistryObject<AxeItem> STEEL_AXE = REGISTER_ITEM(Axes.STEEL_AXE);
    public static final RegistryObject<ShieldItem> RIVETED_WOODEN_SHIELD = REGISTER_ITEM(Shields.RIVETED_WOODEN_SHIELD);

    public static final RegistryObject<ArmorItem> MALIKETHS_HELM = REGISTER_ITEM(Armor.MALIKETHS_HELM);
    public static final RegistryObject<ArmorItem> MALIKETHS_ARMOR = REGISTER_ITEM(Armor.MALIKETHS_ARMOR);
    public static final RegistryObject<ArmorItem> MALIKETHS_GREAVES = REGISTER_ITEM(Armor.MALIKETHS_GREAVES);
    public static final RegistryObject<ArmorItem> MALIKETHS_BOOTS = REGISTER_ITEM(Armor.MALIKETHS_BOOTS);
    public static final RegistryObject<ArmorItem> MALIKETHS_HELM_E = REGISTER_ITEM(Armor.MALIKETHS_HELM_E);
    public static final RegistryObject<ArmorItem> MALIKETHS_ARMOR_E = REGISTER_ITEM(Armor.MALIKETHS_ARMOR_E);
    public static final RegistryObject<ArmorItem> MALIKETHS_GREAVES_E = REGISTER_ITEM(Armor.MALIKETHS_GREAVES_E);
    public static final RegistryObject<ArmorItem> MALIKETHS_BOOTS_E = REGISTER_ITEM(Armor.MALIKETHS_BOOTS_E);



    public static RegistryObject REGISTER_ITEM(Enum input) {
        //Setting the HashSets to the Enums#hashSetter method
        HashSet<Armor> armor = Armor.hashSetter();
        HashSet<Swords> swords = Swords.hashSetter();
        HashSet<Pickaxes> pickaxes = Pickaxes.hashSetter();
        HashSet<Items> items = Items.hashSetter();
        HashSet<Shovels> shovels = Shovels.hashSetter();
        HashSet<Axes> axes = Axes.hashSetter();
        HashSet<Shields> shields = Shields.hashSetter();
        HashSet<Materials> materials = Materials.hashSetter();

        /* So because Enum objects are weird, this is checking if the values pulled
         * hashSetter contain the Enum value of whichever type of Item I am registering (see parameter).
         */
        if(armor.contains(input)) {
            Armor inputCasted = (Armor) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(swords.contains(input)) {
            Swords inputCasted = (Swords) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(pickaxes.contains(input)) {
            Pickaxes inputCasted = (Pickaxes) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(shovels.contains(input)) {
            Shovels inputCasted = (Shovels) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(axes.contains(input)) {
            Axes inputCasted = (Axes) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(shields.contains(input)) {
            Shields inputCasted = (Shields) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(items.contains(input)) {
            Items inputCasted = (Items) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        } else if(materials.contains(input)) {
            Materials inputCasted = (Materials) input;
            return ITEMS.register(inputCasted.getName(), inputCasted::getItem);
        }

        return null;
    }
}
