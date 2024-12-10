package net.flareshock.nen;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.flareshock.nen.block.ModBlocks;
import net.flareshock.nen.screen.CompounderScreen;
import net.flareshock.nen.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class NotEnoughNarcoticsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INFECTED_WHEAT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOBACCO_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INDICA_CANNABIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OPIUM_POPPY, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.COMPOUNDER_SCREEN_HANDLER, CompounderScreen::new);
    }
}
