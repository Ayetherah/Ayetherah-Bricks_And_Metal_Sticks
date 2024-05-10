package net.ayetherah.bams.block;

import net.ayetherah.bams.BricksAndMetalSticks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BricksAndMetalSticks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        BricksAndMetalSticks.LOGGER.info("Registering ModBlocks for " + BricksAndMetalSticks.MOD_ID);
    }
}
