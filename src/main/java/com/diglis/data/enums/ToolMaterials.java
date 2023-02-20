package com.diglis.data.enums;
import java.util.function.Supplier;
import com.diglis.eldencraft.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
public enum ToolMaterials implements IItemTier  {
    STEEL(256, 3.5f, 5f, 2, 12, () -> Ingredient.of(ItemInit.STEEL_INGOT.get())),
    CRYSTAL(1024, 6.5f, 8f, 4, 12, null),
    DARK(4096, 10f, 14f, 8, 12, () -> Ingredient.of(ItemInit.DEATH_BOUND_CORE.get()));
    private int uses;
    private float speed;
    private float attackDamageBonus;
    private int level;
    private int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    private ToolMaterials(int uses, float speed, float attackDamageBonus, int level, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }
    @Override
    public int getUses() {
        return this.uses;
    }
    @Override
    public float getSpeed() {
        return this.speed;
    }
    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }
    @Override
    public int getLevel() {
        return this.level;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
