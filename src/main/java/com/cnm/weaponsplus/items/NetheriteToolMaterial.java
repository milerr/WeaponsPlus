package com.cnm.weaponsplus.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteToolMaterial implements ToolMaterial {

    public static final NetheriteToolMaterial INSTANCE = new NetheriteToolMaterial();

    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.NETHERITE_INGOT
        );
    }
}
