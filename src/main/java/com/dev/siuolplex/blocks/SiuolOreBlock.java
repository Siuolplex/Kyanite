package com.dev.siuolplex.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class SiuolOreBlock extends OreBlock {
    public SiuolOreBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Override
    protected int getExperienceWhenMined(Random random) {
        if (this == Blocks.KYKINITE_ORE) {
            return MathHelper.nextInt(random, 5, 12);
        }
        return super.getExperienceWhenMined(random);
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
    }
}
