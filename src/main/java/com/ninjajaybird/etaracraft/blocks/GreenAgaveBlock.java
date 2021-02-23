package com.ninjajaybird.etaracraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class GreenAgaveBlock extends DeadBushBlock {

    public GreenAgaveBlock() {
        super(FabricBlockSettings.of
                (Material.PLANT)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.0f,0.0f)
                .nonOpaque()
                .noCollision());
    }
}
