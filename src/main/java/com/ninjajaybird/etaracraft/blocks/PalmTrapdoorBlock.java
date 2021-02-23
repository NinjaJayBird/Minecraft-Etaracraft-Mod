package com.ninjajaybird.etaracraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class PalmTrapdoorBlock extends TrapdoorBlock {

    public PalmTrapdoorBlock() {
        super(FabricBlockSettings.of
                (Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(3.0f, 3.0f)
                .breakByTool(FabricToolTags.AXES));
    }
}
