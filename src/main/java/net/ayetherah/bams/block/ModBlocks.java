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

    //vanilla bricks

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
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

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

    public static final Block BRICKS_BIG_WINDOW_SIDE2 = registerBlock("bricks_big_window_side2",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_BIG_WINDOW_SIDE = registerBlock("bricks_big_window_side",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_BIG_WINDOW_MIDDLE = registerBlock("bricks_big_window_middle",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_BIG_SMALL_CONNECTION = registerBlock("bricks_big_small_connection",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_BIG = registerBlock("bricks_big",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICKS_ARCH1 = registerBlock("bricks_arch1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    //concrete

    public static final Block CONCRETE_BEAM = registerBlock("concrete_beam",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block CONCRETE_BEAM_SIDE = registerBlock("concrete_beam_side",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block CONCRETE_PLATE = registerBlock("concrete_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block CONCRETE_BLOCK = registerBlock("concrete_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block CONCRETE_BLOCK1 = registerBlock("concrete_block1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block BRICK_MORTAR_FLOOR = registerBlock("brick_mortar_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    //rust

    public static final Block BEAM_RUSTED_VERTICAL = registerBlock("beam_rusted_vertical",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));





    //dark bricks

    public static final Block DARK_BRICKS = registerBlock("dark_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED1 = registerBlock("dark_bricks_abandoned1",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED2 = registerBlock("dark_bricks_abandoned2",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED3 = registerBlock("dark_bricks_abandoned3",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED4 = registerBlock("dark_bricks_abandoned4",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED5 = registerBlock("dark_bricks_abandoned5",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED6 = registerBlock("dark_bricks_abandoned6",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED7 = registerBlock("dark_bricks_abandoned7",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_BIG = registerBlock("dark_bricks_big",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_SLABLIKE = registerBlock("dark_bricks_slablike",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_STRIPED = registerBlock("dark_bricks_striped",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_TILE = registerBlock("dark_bricks_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_TILY = registerBlock("dark_bricks_tily",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_ABANDONED8 = registerBlock("dark_bricks_abandoned8",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_OVERGROWN = registerBlock("dark_bricks_overgrown",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_SLABLIKE_ABANDONED = registerBlock("dark_bricks_slablike_abandoned",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_TOP_ARCH = registerBlock("dark_bricks_top_arch",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_TOP_ARCH_ABANDONED = registerBlock("dark_bricks_top_arch_abandoned",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS_BIG_ABANDONED = registerBlock("dark_bricks_big_abandoned",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS19 = registerBlock("dark_bricks19",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS20 = registerBlock("dark_bricks20",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS21 = registerBlock("dark_bricks21",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS22 = registerBlock("dark_bricks22",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS23 = registerBlock("dark_bricks23",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS24 = registerBlock("dark_bricks24",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS25 = registerBlock("dark_bricks25",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS26 = registerBlock("dark_bricks26",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS27 = registerBlock("dark_bricks27",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS28 = registerBlock("dark_bricks28",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS29 = registerBlock("dark_bricks29",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block DARK_BRICKS30 = registerBlock("dark_bricks30",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));












    //darkest bricks

    public static final Block DARKEST_BRICKS = registerBlock("darkest_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));


    //tile

    public static final Block TILE_YELLOWED = registerBlock("tile_yellowed",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));


    //overgrown

    public static final Block OVERGROWN_METAL = registerBlock("overgrown_metal",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block OVERGROWN_WALL = registerBlock("overgrown_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));

    public static final Block OVERGROWN_METAL_TILES = registerBlock("overgrown_metal_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));




























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
