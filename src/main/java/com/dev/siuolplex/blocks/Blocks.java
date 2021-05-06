package com.dev.siuolplex.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
    public static final Block KYANITE_ORE = register("kyanite_ore", new KyaniteOreBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));
    public static final Block KYANITE_BLOCK = register("kyanite_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));
    public static final Block TELAITE_ORE = register("telaite_ore", new KyaniteOreBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));
    public static final Block TELAITE_BLOCK = register("telaite_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("kyanite", name), block);
    }

    public static void init() {}
}