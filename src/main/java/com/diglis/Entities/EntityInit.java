package com.diglis.Entities;

import com.diglis.Entities.hostile.GodrickSoldier;
import com.diglis.eldencraft.EldenCraft;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
        EldenCraft.MOD_ID);

    public static final RegistryObject<EntityType<GodrickSoldier>> GODRICK_SOLDIER = ENTITY_TYPES.register("godrick_soldier", 
        () -> EntityType.Builder.of(GodrickSoldier::new, EntityClassification.MONSTER).sized(1f, 1f)
            .build(new ResourceLocation(EldenCraft.MOD_ID, "godrick_soldier").toString()));
}
