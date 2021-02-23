package com.ninjajaybird.etaracraft.registry;

import com.ninjajaybird.etaracraft.Etaracraft;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem PALM_LOG = new BlockItem(ModBlocks.PALM_LOG, new Item.Settings().group(Etaracraft.ETARACRAFT));
    public static final BlockItem PALM_PLANKS = new BlockItem(ModBlocks.PALM_PLANKS, new Item.Settings().group(Etaracraft.ETARACRAFT));
    public static final BlockItem PALM_DOOR = new BlockItem(ModBlocks.PALM_DOOR, new Item.Settings().group(Etaracraft.ETARACRAFT));
    public static final BlockItem PALM_TRAPDOOR = new BlockItem(ModBlocks.PALM_TRAPDOOR, new Item.Settings().group(Etaracraft.ETARACRAFT));
    public static final BlockItem GREEN_AGAVE = new BlockItem(ModBlocks.GREEN_AGAVE, new Item.Settings().group(Etaracraft.ETARACRAFT));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Etaracraft.MOD_ID,"palm_log"), PALM_LOG);
        Registry.register(Registry.ITEM, new Identifier(Etaracraft.MOD_ID,"palm_planks"), PALM_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Etaracraft.MOD_ID,"palm_door"), PALM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Etaracraft.MOD_ID,"palm_trapdoor"), PALM_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Etaracraft.MOD_ID,"green_agave"), GREEN_AGAVE);
    }
}
