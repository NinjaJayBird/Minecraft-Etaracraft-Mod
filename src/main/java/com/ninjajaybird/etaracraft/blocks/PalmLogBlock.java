package com.ninjajaybird.etaracraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;

public class PalmLogBlock extends PillarBlock {

    public PalmLogBlock() {
        super(FabricBlockSettings.of
                (Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(2.0f, 2.0f)
                .breakByTool(FabricToolTags.AXES));
    }
}
