package com.cnm.weaponsplus.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldenToolMaterial implements ToolMaterial {

    public static final GoldenToolMaterial INSTANCE = new GoldenToolMaterial();

    @Override
    public int getDurability() {
        return 32;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.GOLD_INGOT
        );
    }
}
