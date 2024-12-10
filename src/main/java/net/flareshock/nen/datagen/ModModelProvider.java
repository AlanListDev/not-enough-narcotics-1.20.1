package net.flareshock.nen.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flareshock.nen.block.ModBlocks;
import net.flareshock.nen.block.custom.IndicaCannabisBlock;
import net.flareshock.nen.block.custom.InfectedWheatBlock;
import net.flareshock.nen.block.custom.OpiumPoppyBlock;
import net.flareshock.nen.block.custom.TobaccoPlantBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCrop(ModBlocks.INFECTED_WHEAT, InfectedWheatBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.TOBACCO_PLANT, TobaccoPlantBlock.AGE, 0, 1, 2, 3, 4);
        blockStateModelGenerator.registerCrop(ModBlocks.INDICA_CANNABIS, IndicaCannabisBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockStateModelGenerator.registerCrop(ModBlocks.OPIUM_POPPY, OpiumPoppyBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerSimpleState(ModBlocks.COMPOUNDER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
