package net.flareshock.nen.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flareshock.nen.NotEnoughNarcotics;
import net.flareshock.nen.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COKE_BRICK = registerItem("coke_brick", new Item(new FabricItemSettings()));
    public static final Item SYRINGE = registerItem("syringe", new Item(new FabricItemSettings()));
    public static final Item DULL_SYRINGE = registerItem("dull_syringe", new Item(new FabricItemSettings()));
    public static final Item NEEDLE = registerItem("needle", new Item(new FabricItemSettings()));
    public static final Item FILLED_SYRINGE = registerItem("filled_syringe", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_BOTTLE = registerItem("obsidian_bottle", new Item(new FabricItemSettings()));
    public static final Item SUGAR_CUBE = registerItem("sugar_cube", new Item(new FabricItemSettings().food(ModFoodComponents.SUGAR_CUBE)));
    public static final Item GELATIN = registerItem("gelatin", new Item(new FabricItemSettings().food(ModFoodComponents.GELATIN)));
    public static final Item LSD_BLOTTER = registerItem("lsd_blotter", new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_ERGOTAMINE = registerItem("crystal_ergotamine", new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_LSD = registerItem("crystal_lsd", new Item(new FabricItemSettings()));
    public static final Item ERGOT = registerItem("ergot", new Item(new FabricItemSettings()));
    public static final Item LIQUID_ERGOTAMINE = registerItem("liquid_ergotamine", new Item(new FabricItemSettings()));
    public static final Item LIQUID_LSD = registerItem("liquid_lsd", new Item(new FabricItemSettings()));
    public static final Item LSD_BLOTTER_SHEET = registerItem("lsd_blotter_sheet", new Item(new FabricItemSettings()));
    public static final Item LSD_GEL_TAB_BLUE = registerItem("lsd_gel_tab_blue", new Item(new FabricItemSettings()));
    public static final Item LSD_GEL_TAB_SHEET = registerItem("lsd_gel_tab_sheet", new Item(new FabricItemSettings()));
    public static final Item LSD_MICRODOT_BLUE = registerItem("lsd_microdot_blue", new Item(new FabricItemSettings()));
    public static final Item LSD_MICRODOT_SHEET_BLUE = registerItem("lsd_microdot_sheet_blue", new Item(new FabricItemSettings()));
    public static final Item LSD_SUGAR_CUBE = registerItem("lsd_sugar_cube", new Item(new FabricItemSettings()));
    public static final Item AMMONIA_GAS = registerItem("ammonia_gas", new Item(new FabricItemSettings()));
    public static final Item LAVA_BOTTLE = registerItem("lava_bottle", new Item(new FabricItemSettings()));
    public static final Item LIQUID_DIETHYLAMINE = registerItem("liquid_diethylamine", new Item(new FabricItemSettings()));
    public static final Item LYSERGIC_ACID = registerItem("lysergic_acid", new Item(new FabricItemSettings()));
    public static final Item ACTIVATED_LYSERGIC_ACID = registerItem("activated_lysergic_acid", new Item(new FabricItemSettings()));
    public static final Item TOBACCO_LEAF = registerItem("tobacco_leaf", new Item(new FabricItemSettings()));
    public static final Item CIGARETTE = registerItem("cigarette", new Item(new FabricItemSettings()));
    public static final Item LIT_CIGARETTE = registerItem("lit_cigarette", new Item(new FabricItemSettings()));
    public static final Item LIT_INDICA_BLUNT = registerItem("lit_indica_blunt", new Item(new FabricItemSettings()));
    public static final Item LIT_SATIVA_BLUNT = registerItem("lit_sativa_blunt", new Item(new FabricItemSettings()));
    public static final Item LIT_HYBRID_BLUNT = registerItem("lit_hybrid_blunt", new Item(new FabricItemSettings()));
    public static final Item CIGARETTE_PACK = registerItem("cigarette_pack", new Item(new FabricItemSettings()));
    public static final Item FILTER = registerItem("filter", new Item(new FabricItemSettings()));
    public static final Item DRIED_TOBACCO_LEAF = registerItem("dried_tobacco_leaf", new Item(new FabricItemSettings()));
    public static final Item CRUSHED_TOBACCO = registerItem("crushed_tobacco", new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_NICOTINE = registerItem("crystal_nicotine", new Item(new FabricItemSettings()));
    public static final Item AIR_BOTTLE = registerItem("air_bottle", new Item(new FabricItemSettings()));
    public static final Item PRESSURIZED_BOTTLE = registerItem("pressurized_bottle", new Item(new FabricItemSettings()));
    public static final Item PRESSURIZED_AIR = registerItem("pressurized_air", new Item(new FabricItemSettings()));
    public static final Item CARBON_DIOXIDE_GAS = registerItem("carbon_dioxide_gas", new Item(new FabricItemSettings()));
    public static final Item LIQUID_ETHANOL = registerItem("liquid_ethanol", new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_KETAMINE = registerItem("crystal_ketamine", new Item(new FabricItemSettings()));
    public static final Item KETAMINE_POWDER = registerItem("ketamine_powder", new Item(new FabricItemSettings()));
    public static final Item CARBON_MONOXIDE_GAS = registerItem("carbon_monoxide_gas", new Item(new FabricItemSettings()));
    public static final Item CHLORINE_GAS = registerItem("chlorine_gas", new Item(new FabricItemSettings()));
    public static final Item HYDROGEN_GAS = registerItem("hydrogen_gas", new Item(new FabricItemSettings()));
    public static final Item OXYGEN_GAS = registerItem("oxygen_gas", new Item(new FabricItemSettings()));
    public static final Item INDICA_CANNABIS_LEAF = registerItem("indica_cannabis_leaf", new Item(new FabricItemSettings()));
    public static final Item SATIVA_CANNABIS_LEAF = registerItem("sativa_cannabis_leaf", new Item(new FabricItemSettings()));
    public static final Item HYBRID_CANNABIS_LEAF = registerItem("hybrid_cannabis_leaf", new Item(new FabricItemSettings()));
    public static final Item TOBACCO_PAPER = registerItem("tobacco_paper", new Item(new FabricItemSettings()));
    public static final Item SATIVA_BLUNT = registerItem("sativa_blunt", new Item(new FabricItemSettings()));
    public static final Item INDICA_BLUNT = registerItem("indica_blunt", new Item(new FabricItemSettings()));
    public static final Item HYBRID_BLUNT = registerItem("hybrid_blunt", new Item(new FabricItemSettings()));
    public static final Item REACTION_CATALYST = registerItem("reaction_catalyst", new Item(new FabricItemSettings()));
    public static final Item TOBACCO_POWDER = registerItem("tobacco_powder", new Item(new FabricItemSettings()));
    public static final Item INDICA_CANNABIS_BUD = registerItem("indica_cannabis_bud", new Item(new FabricItemSettings()));


    public static final Item DRIED_INDICA_CANNABIS_BUD = registerItem("dried_indica_cannabis_bud", new Item(new FabricItemSettings()));


    public static final Item OPIUM_POPPY_SEED_POD = registerItem("opium_poppy_seed_pod", new Item(new FabricItemSettings()));

    public static final Item INFECTED_WHEAT_SEEDS = registerItem("infected_wheat_seeds",
            new AliasedBlockItem(ModBlocks.INFECTED_WHEAT, new FabricItemSettings()));

    public static final Item TOBACCO_SEEDS = registerItem("tobacco_seeds",
            new AliasedBlockItem(ModBlocks.TOBACCO_PLANT, new FabricItemSettings()));

    public static final Item OPIUM_POPPY_SEEDS = registerItem("opium_poppy_seeds",
            new AliasedBlockItem(ModBlocks.OPIUM_POPPY, new FabricItemSettings()));

    public static final Item INDICA_CANNABIS_SEEDS = registerItem("indica_cannabis_seeds",
            new AliasedBlockItem(ModBlocks.INDICA_CANNABIS, new FabricItemSettings()));
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(SUGAR_CUBE);
        entries.add(GELATIN);
    }

    private static void addItemsToNaturalBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOBACCO_SEEDS);
        entries.add(TOBACCO_LEAF);
        entries.add(INFECTED_WHEAT_SEEDS);
        entries.add(INDICA_CANNABIS_SEEDS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughNarcotics.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NotEnoughNarcotics.LOGGER.info("Registering Mod Items for" + NotEnoughNarcotics.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlocksItemGroup);
    }
}
