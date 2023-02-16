package com.diglis.eldencraft.item;

import com.diglis.data.item_enums.Items;
import com.diglis.data.item_enums.Pickaxes;
import com.diglis.data.item_enums.Swords;
import com.diglis.eldencraft.EldenCraft;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EldenCraft.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = REGISTER_ITEM(Items.STEEL_INGOT);
    public static final RegistryObject<Item> STEEL_CHUNK = REGISTER_ITEM(Items.STEEL_CHUNK);
    public static final RegistryObject<Item> CARBON_SHARD = REGISTER_ITEM(Items.CARBON_SHARD);
    public static final RegistryObject<Item> LEATHER_STRIPS = REGISTER_ITEM(Items.LEATHER_STRIPS);
    public static final RegistryObject<Item> SMITHING_STONE = REGISTER_ITEM(Items.SMITHING_STONE);
    public static final RegistryObject<Item> STEEL_HAMMER = REGISTER_ITEM(Items.STEEL_HAMMER);
    public static final RegistryObject<SwordItem> SHORT_SWORD = REGISTER_ITEM(Swords.SHORT_SWORD);
    public static final RegistryObject<SwordItem> BASTARD_SWORD = REGISTER_ITEM(Swords.BASTARD_SWORD);
    public static final RegistryObject<SwordItem> BLACK_KNIFE = REGISTER_ITEM(Swords.BLACK_KNIFE);
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = REGISTER_ITEM(Pickaxes.STEEL_PICKAXE);

    public static RegistryObject REGISTER_ITEM(Object input) {
        if(input instanceof Swords) {
            for(Swords s : Swords.values()) {
                if(input.equals(s)) {
                    return ITEMS.register(s.getName(), s::getItem);
                }
            }
        } else if(input instanceof Pickaxes) {
            for(Pickaxes p : Pickaxes.values()) {
                if(input.equals(p)) {
                    return ITEMS.register(p.getName(), p::getItem);
                }
            }
        } else if(input instanceof Items) {
            for(Items i : Items.values()) {
                if(input.equals(i)) {
                    return ITEMS.register(i.getName(), i::getItem);
                }
            }
        }
        return null;
    }
}
