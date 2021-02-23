package com.ninjajaybird.etaracraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PalmDoorBlock extends DoorBlock {

    public PalmDoorBlock() {
        super(FabricBlockSettings.of
                (Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(3.0f,3.0f)
                .breakByTool(FabricToolTags.AXES));
    }
}
