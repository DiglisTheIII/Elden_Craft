package com.diglis.eldencraft.armor.helmets;
import com.diglis.eldencraft.effects.EffectsInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class MalikethsHelm extends ArmorItem {
    private boolean isUpgraded;
    public MalikethsHelm(IArmorMaterial material, EquipmentSlotType slot, Properties tab, boolean isUpgraded) {
        super(material, slot, tab);
        this.isUpgraded = isUpgraded;
    }
    @Override
    public void onCraftedBy(ItemStack stack, World world, PlayerEntity player) {
        if(isUpgraded) {
            stack.enchant(EffectsInit.DEATH_AURA.get(), 1);
        }
        super.onCraftedBy(stack, world, player);
    }
}
