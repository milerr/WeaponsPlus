package com.cnm.weaponsplus.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondToolMaterial implements ToolMaterial {

    public static final DiamondToolMaterial INSTANCE = new DiamondToolMaterial();

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.DIAMOND
        );
    }
}
