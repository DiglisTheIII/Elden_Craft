package com.diglis.eldencraft;

import com.diglis.eldencraft.block.BlockInit;
import com.diglis.eldencraft.item.ItemInit;
import com.diglis.eldencraft.item.tabs.BlockGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
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

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> event.getRegistry()
                .register(new BlockItem(block, new Item.Properties().tab(BlockGroup.ELDEN_CRAFT_BLOCKS))
                        .setRegistryName(block.getRegistryName())));
    }

}
