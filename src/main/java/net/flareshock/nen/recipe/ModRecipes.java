package net.flareshock.nen.recipe;

import net.flareshock.nen.NotEnoughNarcotics;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER,
                new Identifier(NotEnoughNarcotics.MOD_ID, CompounderRecipe.Serializer.ID),
                CompounderRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE,
                new Identifier(NotEnoughNarcotics.MOD_ID, CompounderRecipe.Type.ID),
                CompounderRecipe.Type.INSTANCE);
    }
}