package com.diglis.data.enums;
import java.util.Arrays;
import java.util.HashSet;
import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.ItemInit;
import com.diglis.eldencraft.Tazz;
import com.diglis.eldencraft.item.tabs.EldenCraftTabItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = EldenCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public enum Items {
    CRYSTAL_BLADE,
    CRYSTAL_HILT,
    REINFORCED_STEEL_HAMMER,
    STEEL_BLADE,
    STEEL_HAMMER,
    STEEL_HILT,
    ANDEN,
    SAGE,
    TAZZ;
    static HashSet<Items> items = new HashSet<Items>();
    public Item getItem() {
        Properties tab = new Item.Properties().tab(EldenCraftTabItems.ELDEN_CRAFT_TAB_ITEMS);
        switch(this) {
            case STEEL_HAMMER:
            case ANDEN:
            case REINFORCED_STEEL_HAMMER:
            case STEEL_HILT:
            case STEEL_BLADE:
            case CRYSTAL_HILT:
            case CRYSTAL_BLADE:
            case SAGE:
                return new Item(tab);
            case TAZZ:
            return new Tazz(tab.food(new Food.Builder().effect(
                    () -> new EffectInstance(Effects.HARM, 180, 1), 100f)
                    .fast()
                    .build()));
            default:
                return null;
        }
    }
    public static HashSet<Items> hashSetter() {
        if(items.isEmpty()) {
            items.addAll(Arrays.asList(Items.values()));
        }
        return items;
    }
    public String getName() {
        switch(this) {
            case STEEL_HAMMER:
                return "steel_hammer";
            case REINFORCED_STEEL_HAMMER:
                return "reinforced_steel_hammer";
            case STEEL_HILT:
                return "steel_hilt";
            case STEEL_BLADE:
                return "steel_blade";
            case CRYSTAL_HILT:
                return "crystal_hilt";
            case CRYSTAL_BLADE:
                return "crystal_blade";
            case TAZZ:
                return "tazz";
            case ANDEN:
                return "anden";
            case SAGE:
                return "sage";
            default:
                return null;
        }
    }
    @SubscribeEvent
    public static void onClickEvent(InputEvent.ClickInputEvent event) {
        PlayerEntity player = Minecraft.getInstance().player;
        final World world = Minecraft.getInstance().level;
        assert player != null;
        boolean hasLevitation = player.hasEffect(Effects.LEVITATION);
        if(event.getKeyBinding().matchesMouse(0) && player.isHolding(ItemInit.TAZZ.get()) && !hasLevitation) {
            assert world != null;
            world.explode(player, player.getX(), player.getY(), player.getZ(), 5.5f, Explosion.Mode.DESTROY);
        } else if(event.getKeyBinding().matchesMouse(0) && player.isHolding(ItemInit.TAZZ.get()) && hasLevitation) {
            player.removeEffect(Effects.LEVITATION);
        }
        if(event.getKeyBinding().matchesMouse(0) && player.isHolding(ItemInit.ANDEN.get())) {   
            for(int i = (int) player.getY(); i > 0; i--) {
                world.explode(player, player.getX(), i, player.getZ(), 5.5f, Explosion.Mode.DESTROY);
            }
        }
    }
}