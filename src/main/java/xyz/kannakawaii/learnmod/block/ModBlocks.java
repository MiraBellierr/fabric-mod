package xyz.kannakawaii.learnmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.kannakawaii.learnmod.LearnMod;
import xyz.kannakawaii.learnmod.item.ModItemGroups;

public class ModBlocks {

    private static final Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.MYTHRIL);
    private static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.MYTHRIL);
    private static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroups.MYTHRIL);
    private static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.MYTHRIL);
    private static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroups.MYTHRIL);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(LearnMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Registry.register(Registry.ITEM, new Identifier(LearnMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        LearnMod.LOGGER.info("Registering Mod Blocks for " + LearnMod.MOD_ID);
    }
}
