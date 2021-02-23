package com.ninjajaybird.etaracraft.registry;

import com.ninjajaybird.etaracraft.Etaracraft;
import com.ninjajaybird.etaracraft.blocks.GreenAgaveBlock;
import com.ninjajaybird.etaracraft.blocks.PalmDoorBlock;
import com.ninjajaybird.etaracraft.blocks.PalmLogBlock;
import com.ninjajaybird.etaracraft.blocks.PalmTrapdoorBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block PALM_LOG = new PalmLogBlock();
    public static final Block PALM_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f).breakByTool(FabricToolTags.AXES));
    public static final Block PALM_DOOR = new PalmDoorBlock();
    public static final Block PALM_TRAPDOOR = new PalmTrapdoorBlock();
    public static final Block GREEN_AGAVE = new GreenAgaveBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Etaracraft.MOD_ID, "palm_log"), PALM_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Etaracraft.MOD_ID, "palm_planks"), PALM_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Etaracraft.MOD_ID, "palm_door"), PALM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Etaracraft.MOD_ID, "palm_trapdoor"), PALM_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Etaracraft.MOD_ID, "green_agave"), GREEN_AGAVE);

    }

    public static void registerFlammables() {
        FlammableBlockRegistry.getInstance(Blocks.FIRE).add(ModBlocks.PALM_LOG,5,5);
        FlammableBlockRegistry.getInstance(Blocks.FIRE).add(ModBlocks.PALM_PLANKS,5,20);
        FlammableBlockRegistry.getInstance(Blocks.FIRE).add(ModBlocks.GREEN_AGAVE,60,100);
    }
}
