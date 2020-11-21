package com.dev.siuolplex.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

     public static final Block KYKINITE_ORE = register("kykinite_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));
     public static final Block KYKINITE_BLOCK = register("kykinite_block", new SiuolOreBlock(FabricBlockSettings.of(Material.STONE).hardness(4.0f).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().allowsSpawning(AbstractBlock.AbstractBlockState::allowsSpawning)));





        private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("kykinite", name), block);
        // Remember, the namespace is kykinite.
    }

    public static void init() {

    }
}