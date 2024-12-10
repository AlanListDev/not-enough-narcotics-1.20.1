package net.flareshock.nen.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.flareshock.nen.block.ModBlocks;
import net.flareshock.nen.block.custom.IndicaCannabisBlock;
import net.flareshock.nen.block.custom.InfectedWheatBlock;
import net.flareshock.nen.block.custom.OpiumPoppyBlock;
import net.flareshock.nen.block.custom.TobaccoPlantBlock;
import net.flareshock.nen.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) { super(dataOutput); }

    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.INFECTED_WHEAT).properties(StatePredicate.Builder.create()
                .exactMatch(InfectedWheatBlock.AGE, 7));
        addDrop(ModBlocks.INFECTED_WHEAT, cropDrops(ModBlocks.INFECTED_WHEAT, ModItems.ERGOT, ModItems.INFECTED_WHEAT_SEEDS, builder));

        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.TOBACCO_PLANT).properties(StatePredicate.Builder.create()
                .exactMatch(TobaccoPlantBlock.AGE, 4));
        addDrop(ModBlocks.TOBACCO_PLANT, cropDrops(ModBlocks.TOBACCO_PLANT, ModItems.TOBACCO_LEAF, ModItems.TOBACCO_SEEDS, builder1));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.INDICA_CANNABIS).properties(StatePredicate.Builder.create()
                .exactMatch(IndicaCannabisBlock.AGE, 6));
        addDrop(ModBlocks.INDICA_CANNABIS, cropDrops(ModBlocks.INDICA_CANNABIS, ModItems.INDICA_CANNABIS_LEAF, ModItems.INDICA_CANNABIS_BUD, builder2));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.OPIUM_POPPY).properties(StatePredicate.Builder.create()
                .exactMatch(OpiumPoppyBlock.AGE, 7));
        addDrop(ModBlocks.OPIUM_POPPY, cropDrops(ModBlocks.OPIUM_POPPY, ModItems.OPIUM_POPPY_SEED_POD, ModItems.OPIUM_POPPY_SEEDS, builder3));
    }
}
