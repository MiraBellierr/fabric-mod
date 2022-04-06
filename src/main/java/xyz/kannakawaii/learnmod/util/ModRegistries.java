package xyz.kannakawaii.learnmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import xyz.kannakawaii.learnmod.LearnMod;
import xyz.kannakawaii.learnmod.item.ModItems;

public class ModRegistries {
    public static void registerMods() {
        registerFuels();
    }

    private static void registerFuels() {
        LearnMod.LOGGER.info("Registering Fuels for " + LearnMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }
}
