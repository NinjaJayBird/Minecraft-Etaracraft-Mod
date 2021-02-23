package com.ninjajaybird.etaracraft;

import com.ninjajaybird.etaracraft.registry.ModBlocks;
import com.ninjajaybird.etaracraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Etaracraft implements ModInitializer {

    public static final String MOD_ID = "etaracraft";

    public static final ItemGroup ETARACRAFT = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID,"etaracraft"),
            () -> new ItemStack(ModItems.PALM_LOG));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModBlocks.registerFlammables();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_AGAVE, RenderLayer.getCutout());
    }
}