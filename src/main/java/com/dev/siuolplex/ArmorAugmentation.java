package com.dev.siuolplex;

import com.dev.siuolplex.blocks.Blocks;
import com.dev.siuolplex.items.Items;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ArmorAugmentation implements ModInitializer {
	public static final ItemGroup ARMORAUGMENT = FabricItemGroupBuilder.build(new Identifier("kyanite","augmentedarmor"), () -> new ItemStack(Items.REFINED_KYANITE));

	public void onInitialize() {
		System.out.println("Kyanite - Starting Initialization");

		if (FabricLoader.getInstance().isDevelopmentEnvironment())
		{ System.out.println("Kyanite - In Development Enviroment."); }
		else { System.out.println("Kyanite - In Production Enviroment."); }

		Items.init();
		Blocks.init();
		LootTables.init();
		OreGen.init();

		if (FabricLoader.getInstance().isModLoaded("consistency_plus")) {
			System.out.println("Kyanite - Consistency+ Detected");
		}

		if (FabricLoader.getInstance().isModLoaded("quilt_loader")) {
			System.out.println("Kyanite - Quilt Loader Detected.");
			System.out.println("Hi Quilt User!");
			} else {
			System.out.println("Kyanite - Quilt Loader undetected, assuming Fabric Loader.");
			System.out.println("Hi probable Fabric user!");
			}

		System.out.println("Kyanite - Finished Initialization");
	}
}
