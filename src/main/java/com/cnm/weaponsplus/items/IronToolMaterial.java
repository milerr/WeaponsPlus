package com.cnm.weaponsplus.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronToolMaterial implements ToolMaterial {

    public static final IronToolMaterial INSTANCE = new IronToolMaterial();

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.IRON_INGOT
        );
    }
}
