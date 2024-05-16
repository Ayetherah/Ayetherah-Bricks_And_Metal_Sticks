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

    public static final Block BRICKS_STRIPED = registerBlock("bricks_striped",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_STEP1 = registerBlock("bricks_step1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_SMALL_BIG_CONNECTION = registerBlock("bricks_small_big_connection",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_SIDEWAYS = registerBlock("bricks_sideways",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_RAIL = registerBlock("bricks_rail",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLATE = registerBlock("bricks_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PIPES = registerBlock("bricks_pipes",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PATTERN3 = registerBlock("bricks_pattern3",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PATTERN2 = registerBlock("bricks_pattern2",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PATTERN1 = registerBlock("bricks_pattern1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_NOVEL = registerBlock("bricks_novel",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_GRATE_TINY = registerBlock("bricks_grate_tiny",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_GRATE_SMALL = registerBlock("bricks_grate_small",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_GRATE = registerBlock("bricks_grate",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_FLOOR2 = registerBlock("bricks_floor2",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_FLOOR1 = registerBlock("bricks_floor1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXTENDO_EXTRA = registerBlock("bricks_extendo_extra",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXTENDO_BIG_CONNECTION = registerBlock("bricks_extendo_big_connection",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_EXTENDO = registerBlock("bricks_extendo",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_DRAIN_BOTTOM_SMALL = registerBlock("bricks_drain_bottom_small",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_DRAIN_BOTTOM_ME = registerBlock("bricks_drain_bottom_me",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER22 = registerBlock("bricks_placeholder22",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER23 = registerBlock("bricks_placeholder23",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER24 = registerBlock("bricks_placeholder24",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER25 = registerBlock("bricks_placeholder25",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER26 = registerBlock("bricks_placeholder26",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_PLACEHOLDER27 = registerBlock("bricks_placeholder27",
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
