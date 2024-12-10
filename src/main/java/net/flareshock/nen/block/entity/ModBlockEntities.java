package net.flareshock.nen.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.flareshock.nen.NotEnoughNarcotics;
import net.flareshock.nen.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CompounderBlockEntity> COMPOUNDER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(NotEnoughNarcotics.MOD_ID, "compounder"),
                    FabricBlockEntityTypeBuilder.create(CompounderBlockEntity::new,
                            ModBlocks.COMPOUNDER).build());

    public static void registerBlockEntities() {
        NotEnoughNarcotics.LOGGER.info("Registering Block Entities for" + NotEnoughNarcotics.MOD_ID);
    }
}
