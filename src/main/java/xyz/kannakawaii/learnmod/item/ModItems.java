package xyz.kannakawaii.learnmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.kannakawaii.learnmod.LearnMod;
import xyz.kannakawaii.learnmod.item.custom.DowsingRodItem;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroups.MYTHRIL)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings().group(ModItemGroups.MYTHRIL)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings().group(ModItemGroups.MYTHRIL)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod", new DowsingRodItem(new FabricItemSettings().group(ItemGroup.MISC).maxDamage(16)));
    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LearnMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LearnMod.LOGGER.info("Registering Mod Items for " + LearnMod.MOD_ID);
    }
}
