package net.ayetherah.bams.block;

import net.ayetherah.bams.BricksAndMetalSticks;
import net.ayetherah.bams.sound.ModSounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FULL_GRATE = registerBlock("full_grate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(ModSounds.GRATE_SOUNDS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BricksAndMetalSticks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BricksAndMetalSticks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        BricksAndMetalSticks.LOGGER.info("Registering ModBlocks for " + BricksAndMetalSticks.MOD_ID);
    }
}
