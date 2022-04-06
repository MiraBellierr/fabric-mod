package xyz.kannakawaii.learnmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import xyz.kannakawaii.learnmod.LearnMod;

public class ModItemGroups {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(LearnMod.MOD_ID, "mythril"), () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
