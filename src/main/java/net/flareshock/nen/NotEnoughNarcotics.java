package net.flareshock.nen;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.flareshock.nen.block.ModBlocks;
import net.flareshock.nen.block.entity.ModBlockEntities;
import net.flareshock.nen.item.ModItemGroups;
import net.flareshock.nen.item.ModItems;
import net.flareshock.nen.recipe.ModRecipes;
import net.flareshock.nen.screen.ModScreenHandlers;
import net.flareshock.nen.util.ModLootTableModifiers;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughNarcotics implements ModInitializer {
	public static final String MOD_ID = "nen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FuelRegistry.INSTANCE.add(ModItems.COKE_BRICK, 800);
		ModRecipes.registerRecipes();

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}