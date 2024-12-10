package net.flareshock.nen.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.flareshock.nen.NotEnoughNarcotics;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CompounderScreenHandler> COMPOUNDER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(NotEnoughNarcotics.MOD_ID, "compounding"),
                    new ExtendedScreenHandlerType<>(CompounderScreenHandler::new));

    public static void registerScreenHandlers() {
        NotEnoughNarcotics.LOGGER.info("Registering Screen Handlers for " + NotEnoughNarcotics.MOD_ID);
    }
}
