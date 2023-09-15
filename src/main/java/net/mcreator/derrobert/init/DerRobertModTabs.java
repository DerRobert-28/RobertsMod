
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.derrobert.DerRobertMod;

public class DerRobertModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DerRobertMod.MODID);
	public static final RegistryObject<CreativeModeTab> ROBERTS_AETHER_TAB = REGISTRY.register("roberts_aether_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_aether_tab")).icon(() -> new ItemStack(DerRobertModBlocks.AETHER_DIRT_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.AETHER_AMBEROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_DIRT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_GREATROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_SKYROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_THERAWOOD_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_WISPROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_PORTAL_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_ALPHA_TAB = REGISTRY.register("roberts_alpha_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_alpha_tab")).icon(() -> new ItemStack(DerRobertModBlocks.ALPHA_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.ALPHA_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.ALPHA_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.ALPHA_CREEPER_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_BETA_TAB = REGISTRY.register("roberts_beta_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_beta_tab")).icon(() -> new ItemStack(DerRobertModBlocks.BETA_GRAVEL_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.BETA_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.BETA_MONSTER_SPAWNER.get().asItem());
				tabData.accept(DerRobertModBlocks.BETA_END_STONE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_CLASSIC_TAB = REGISTRY.register("roberts_classic_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_classic_tab")).icon(() -> new ItemStack(DerRobertModBlocks.CLASSIC_BEDROCK_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.CLASSIC_BEDROCK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_BRICK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_CRYING_OBSIDIAN.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_ENDSTONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLASS_PANE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLOWSTONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MONSTER_SPAWNER.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MOSSY_STONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_NETHERRACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_NETHER_QUARTZ_ORE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_OAK_LEAVES_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_OBSIDIAN_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SAND_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SOUL_SAND.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SPONGE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_STONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_TNT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_DOOR.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_HEROBRINE_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_HUMAN_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_ZOMBIE_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_MOJANG_TAB = REGISTRY.register("roberts_mojang_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_mojang_tab")).icon(() -> new ItemStack(DerRobertModBlocks.BACKGROUND_DIRT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.BACKGROUND_DIRT.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_PACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MODERN_PACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MOJANG_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.UNKNOWN_PACK_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_MOD_TAB = REGISTRY.register("roberts_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_mod_tab")).icon(() -> new ItemStack(DerRobertModBlocks.CREEPONIA_BRICK_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.ANTI_LIGHT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CREEPONIA_BRICK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.GLASS_DOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.HEROBRINE_NETHERRACK.get().asItem());
				tabData.accept(DerRobertModBlocks.MISSING_NO_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.WHITE_LIGHT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WORKBENCH_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.WATER_PORTAL_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.CREEPER_PIG_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.EVIL_HEROBRINE_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.PIGGY_CREEPER_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.TEMPLATE_HUMAN_SPAWN_EGG.get());
				tabData.accept(DerRobertModBlocks.GLASS_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.GLASS_SLABS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_POCKET_TAB = REGISTRY.register("roberts_pocket_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_pocket_tab")).icon(() -> new ItemStack(DerRobertModBlocks.GLOWING_OBSIDIAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.GLOWING_OBSIDIAN.get().asItem());
			})

					.build());
}
