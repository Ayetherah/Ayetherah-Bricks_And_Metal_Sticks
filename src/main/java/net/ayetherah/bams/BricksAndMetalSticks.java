package net.ayetherah.bams;

import net.ayetherah.bams.block.ModBlocks;
import net.ayetherah.bams.item.ModItemGroups;
import net.ayetherah.bams.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BricksAndMetalSticks implements ModInitializer {
 	public static final String MOD_ID = "ayetherah-bricks-and-metal-sticks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}