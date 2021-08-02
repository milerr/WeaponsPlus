package com.cnm.weaponsplus.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WoodenToolMaterial implements ToolMaterial {

    public static final WoodenToolMaterial INSTANCE = new WoodenToolMaterial();

    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0f;
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
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(
                Items.OAK_PLANKS,
                Items.BIRCH_PLANKS,
                Items.DARK_OAK_WOOD,
                Items.SPRUCE_PLANKS,
                Items.JUNGLE_PLANKS,
                Items.ACACIA_PLANKS,
                Items.CRIMSON_PLANKS,
                Items.WARPED_PLANKS
        );
    }
}
