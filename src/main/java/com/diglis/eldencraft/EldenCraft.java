package com.diglis.eldencraft;

import com.diglis.Entities.EntityInit;
import com.diglis.eldencraft.block.BlockInit;
import com.diglis.eldencraft.block.generation.GenerateOres;
import com.diglis.eldencraft.effects.EffectsInit;
import com.diglis.eldencraft.item.tabs.EldenCraftTabBlocks;
import com.diglis.eldencraft.network.EldenCraftNetwork;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EldenCraft.MOD_ID)
@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class EldenCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "eldencraft";
    public EldenCraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);
        EffectsInit.ENCHANTMENTS.register(eventBus);
        EntityInit.ENTITY_TYPES.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, GenerateOres::addOres);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> event.getRegistry()
                .register(new BlockItem(block, new Item.Properties().tab(EldenCraftTabBlocks.ELDEN_CRAFT_TAB_BLOCKS))
                        .setRegistryName(block.getRegistryName())));
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        EldenCraftNetwork.init();
    }

}
