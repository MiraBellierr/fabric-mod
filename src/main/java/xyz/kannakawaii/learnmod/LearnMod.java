package xyz.kannakawaii.learnmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.kannakawaii.learnmod.block.ModBlocks;
import xyz.kannakawaii.learnmod.item.ModItems;

public class LearnMod implements ModInitializer {

	public static final String MOD_ID = "learnmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
