package net.flareshock.nen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.flareshock.nen.NotEnoughNarcotics;
import net.flareshock.nen.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup OTHER_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "syringe"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.other"))
                    .icon(() -> new ItemStack(ModItems.SYRINGE)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.SYRINGE));
                        entries.add(new ItemStack(ModItems.DULL_SYRINGE));
                        entries.add(new ItemStack(ModItems.NEEDLE));
                        entries.add(new ItemStack(ModItems.OBSIDIAN_BOTTLE));
                        entries.add(new ItemStack(ModItems.FILTER));
                        entries.add(new ItemStack(ModItems.PRESSURIZED_BOTTLE));
                        entries.add(new ItemStack(ModItems.SUGAR_CUBE));
                        entries.add(new ItemStack(ModItems.GELATIN));
                        entries.add(new ItemStack(ModItems.TOBACCO_PAPER));
                        entries.add(ModBlocks.COMPOUNDER);
                    }).build());

public static final ItemGroup PSYCHEDELICS_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(NotEnoughNarcotics.MOD_ID, "lsd_blotter"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.psychedelics"))
                .icon(() -> new ItemStack(ModItems.LSD_BLOTTER)).entries((displayContext, entries) -> {
                    entries.add(new ItemStack(ModItems.LSD_BLOTTER));
                    entries.add(new ItemStack(ModItems.CRYSTAL_ERGOTAMINE));
                    entries.add(new ItemStack(ModItems.LIQUID_ERGOTAMINE));
                    entries.add(new ItemStack(ModItems.CRYSTAL_LSD));
                    entries.add(new ItemStack(ModItems.LIQUID_LSD));
                    entries.add(new ItemStack(ModItems.ERGOT));
                    entries.add(new ItemStack(ModItems.LSD_MICRODOT_BLUE));
                    entries.add(new ItemStack(ModItems.LSD_BLOTTER_SHEET));
                    entries.add(new ItemStack(ModItems.LSD_GEL_TAB_BLUE));
                    entries.add(new ItemStack(ModItems.LSD_GEL_TAB_SHEET));
                    entries.add(new ItemStack(ModItems.LSD_SUGAR_CUBE));
                    entries.add(new ItemStack(ModItems.LSD_MICRODOT_SHEET_BLUE));
                    entries.add(new ItemStack(ModItems.INFECTED_WHEAT_SEEDS));

                }).build());

    public static final ItemGroup CHEMISTRY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "ammonia_gas"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chemistry"))
                    .icon(() -> new ItemStack(ModItems.AMMONIA_GAS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPOUNDER);
                        entries.add(new ItemStack(ModItems.REACTION_CATALYST));
                        entries.add(new ItemStack(ModItems.COKE_BRICK));
                        entries.add(new ItemStack(ModItems.LIQUID_ETHANOL));
                        entries.add(new ItemStack(ModItems.LIQUID_DIETHYLAMINE));
                        entries.add(new ItemStack(ModItems.LYSERGIC_ACID));
                        entries.add(new ItemStack(ModItems.ACTIVATED_LYSERGIC_ACID));
                        entries.add(new ItemStack(ModItems.AIR_BOTTLE));
                        entries.add(new ItemStack(ModItems.LAVA_BOTTLE));
                        entries.add(new ItemStack(ModItems.PRESSURIZED_AIR));
                        entries.add(new ItemStack(ModItems.CARBON_DIOXIDE_GAS));
                        entries.add(new ItemStack(ModItems.CARBON_MONOXIDE_GAS));
                        entries.add(new ItemStack(ModItems.AMMONIA_GAS));
                        entries.add(new ItemStack(ModItems.CHLORINE_GAS));
                        entries.add(new ItemStack(ModItems.HYDROGEN_GAS));
                        entries.add(new ItemStack(ModItems.OXYGEN_GAS));
                    }).build());

    public static final ItemGroup NICOTINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "cigarette"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nicotine"))
                    .icon(() -> new ItemStack(ModItems.CIGARETTE)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.CIGARETTE));
                        entries.add(new ItemStack(ModItems.CIGARETTE_PACK));
                        entries.add(new ItemStack(ModItems.TOBACCO_SEEDS));
                        entries.add(new ItemStack(ModItems.TOBACCO_LEAF));
                        entries.add(new ItemStack(ModItems.DRIED_TOBACCO_LEAF));
                        entries.add(new ItemStack(ModItems.CRUSHED_TOBACCO));
                        entries.add(new ItemStack(ModItems.TOBACCO_POWDER));
                        entries.add(new ItemStack(ModItems.CRYSTAL_NICOTINE));
                    }).build());

    public static final ItemGroup CANNABIS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "indica_cannabis_leaf"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cannabis"))
                    .icon(() -> new ItemStack(ModItems.INDICA_CANNABIS_LEAF)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.INDICA_CANNABIS_LEAF));
                        entries.add(new ItemStack(ModItems.SATIVA_CANNABIS_LEAF));
                        entries.add(new ItemStack(ModItems.HYBRID_CANNABIS_LEAF));
                        entries.add(new ItemStack(ModItems.INDICA_BLUNT));
                        entries.add(new ItemStack(ModItems.SATIVA_BLUNT));
                        entries.add(new ItemStack(ModItems.HYBRID_BLUNT));
                        entries.add(new ItemStack(ModItems.INDICA_CANNABIS_BUD));


                        entries.add(new ItemStack(ModItems.DRIED_INDICA_CANNABIS_BUD));


                        entries.add(new ItemStack(ModItems.INDICA_CANNABIS_SEEDS));


                    }).build());

    public static final ItemGroup DISSOCIATIVES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "crystal_ketamine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dissociatives"))
                    .icon(() -> new ItemStack(ModItems.CRYSTAL_KETAMINE)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.CRYSTAL_KETAMINE));
                        entries.add(new ItemStack(ModItems.KETAMINE_POWDER));
                    }).build());

    public static final ItemGroup OPIOIDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughNarcotics.MOD_ID, "opium_poppy_seeds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.opioids"))
                    .icon(() -> new ItemStack(ModItems.OPIUM_POPPY_SEED_POD)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.OPIUM_POPPY_SEEDS));
                        entries.add(new ItemStack(ModItems.OPIUM_POPPY_SEED_POD));
                    }).build());

    public static void registerItemGroups() {
        NotEnoughNarcotics.LOGGER.info("Registering Mod Item Groups for" + NotEnoughNarcotics.MOD_ID);
    }
}
