package com.diglis.data.enums;
import com.diglis.eldencraft.EldenCraft;
import com.diglis.eldencraft.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import java.util.function.Supplier;
public enum ArmorMaterials implements IArmorMaterial {
    STEEL("steel", 4, new int[] {3, 6, 5, 2}, 12,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 1.0f,
                () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    CRYSTAL("crystal", 6, new int[] {5, 8, 7, 4}, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0f, 1.0f,
                () -> Ingredient.of(ItemInit.CRYSTAL_GEM.get())),
    DARK("dark", 10, new int[] {9, 14, 13, 8}, 12, 
            SoundEvents.ARMOR_EQUIP_ELYTRA, 9.0f, 5.0f,
                () -> Ingredient.of(ItemInit.DEATH_BOUND_CORE.get()));
    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;
    private ArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                  SoundEvent soundEvent, float toughness, float knockbackResistance,
                  Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }
    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }
    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
    @Override
    public String getName() {
        return EldenCraft.MOD_ID + ":" + this.name;
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
