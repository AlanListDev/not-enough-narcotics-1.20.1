package net.flareshock.nen.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.flareshock.nen.NotEnoughNarcotics;
import net.flareshock.nen.block.custom.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block INFECTED_WHEAT = Registry.register(Registries.BLOCK, new Identifier(NotEnoughNarcotics.MOD_ID, "infected_wheat"),
            new InfectedWheatBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block TOBACCO_PLANT = Registry.register(Registries.BLOCK, new Identifier(NotEnoughNarcotics.MOD_ID, "tobacco_plant"),
            new TobaccoPlantBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).sounds(BlockSoundGroup.CHERRY_SAPLING)));

    public static final Block INDICA_CANNABIS = Registry.register(Registries.BLOCK, new Identifier(NotEnoughNarcotics.MOD_ID, "indica_cannabis"),
            new IndicaCannabisBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).sounds(BlockSoundGroup.SMALL_DRIPLEAF)));

    public static final Block OPIUM_POPPY = Registry.register(Registries.BLOCK, new Identifier(NotEnoughNarcotics.MOD_ID, "opium_poppy"),
            new OpiumPoppyBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).sounds(BlockSoundGroup.WOOD)));

    public static final Block COMPOUNDER = registerBlock("compounder",
            new CompounderBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NotEnoughNarcotics.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughNarcotics.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        NotEnoughNarcotics.LOGGER.info("Registering Mod Blocks for" + NotEnoughNarcotics.MOD_ID);
    }
}
