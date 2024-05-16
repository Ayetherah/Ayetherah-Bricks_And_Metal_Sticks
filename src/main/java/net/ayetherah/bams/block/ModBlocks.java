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

    public static final Block BRICKS_TILE = registerBlock("bricks_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_THAT_IS_NOT_HOW_BRICKS_WORK = registerBlock("bricks_that_is_not_how_bricks_work",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_TALL_WINDOW_BOTTOM = registerBlock("bricks_tall_window_bottom",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_TALL_WINDOW_MIDDLE = registerBlock("bricks_tall_window_middle",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_TALL_WINDOW_TOP = registerBlock("bricks_tall_window_top",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));













    //experimental feature blocks

    public static final Block BRICKS_EXPANDED = registerBlock("bricks_expanded",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXPANDED_RTT = registerBlock("bricks_expanded_rtt",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXPANDED_C1 = registerBlock("bricks_expanded_c1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXPANDED_C2 = registerBlock("bricks_expanded_c2",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXPANDED_C3 = registerBlock("bricks_expanded_c3",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXPANDED_C4 = registerBlock("bricks_expanded_c4",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));


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
