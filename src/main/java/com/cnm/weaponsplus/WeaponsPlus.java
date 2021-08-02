package com.cnm.weaponsplus;

import com.cnm.weaponsplus.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class WeaponsPlus implements ModInitializer {

    public static final String MOD_ID = "wp";

    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
    }
}
