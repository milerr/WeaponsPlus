package com.cnm.weaponsplus.registry;

import com.cnm.weaponsplus.WeaponsPlus;
import com.cnm.weaponsplus.items.GoldenToolMaterial;
import com.cnm.weaponsplus.items.IronToolMaterial;
import com.cnm.weaponsplus.items.WoodenToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static  final ToolItem WOODEN_HAMMER = new SwordItem(WoodenToolMaterial.INSTANCE,6 ,-3.4f ,new Item.Settings().group(ItemGroup.COMBAT));
    public static  final ToolItem GOLDEN_HAMMER = new SwordItem(GoldenToolMaterial.INSTANCE,6 ,-3.2f ,new Item.Settings().group(ItemGroup.COMBAT));
    public static  final ToolItem STONE_HAMMER = new SwordItem(GoldenToolMaterial.INSTANCE,8 ,-3.4f ,new Item.Settings().group(ItemGroup.COMBAT));
    public static  final ToolItem IRON_HAMMER = new SwordItem(IronToolMaterial.INSTANCE,8 ,-3.3f ,new Item.Settings().group(ItemGroup.COMBAT));
    public static  final ToolItem DIAMOND_HAMMER = new SwordItem(IronToolMaterial.INSTANCE,8 ,-3.2f ,new Item.Settings().group(ItemGroup.COMBAT));
    public static  final ToolItem NETHERITE_HAMMER = new SwordItem(IronToolMaterial.INSTANCE,9 ,-3.2f ,new Item.Settings().group(ItemGroup.COMBAT));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "wooden_hammer"), WOODEN_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "stone_hammer"), STONE_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "golden_hammer"), GOLDEN_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "iron_hammer"), IRON_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "diamond_hammer"), DIAMOND_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(WeaponsPlus.MOD_ID, "netherite_hammer"), NETHERITE_HAMMER);
    }

}
