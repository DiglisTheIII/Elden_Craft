package com.diglis.eldencraft.effects;

import com.diglis.data.enums.*;
import com.diglis.eldencraft.EldenCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashSet;

public class EffectsInit {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EldenCraft.MOD_ID);

    public static final RegistryObject<Enchantment> DEATH_AURA = REGISTER_ENCHANTMENT(Enchantments.DEATH_AURA);

    public static RegistryObject REGISTER_ENCHANTMENT(Enum input) {
        HashSet<Enchantments> enchantments = Enchantments.hashSetter();

        if(enchantments.contains(input)) {
            Enchantments inputCasted = (Enchantments) input;
            return ENCHANTMENTS.register(inputCasted.getName(), inputCasted::getItem);
        }

        return null;
    }



}
