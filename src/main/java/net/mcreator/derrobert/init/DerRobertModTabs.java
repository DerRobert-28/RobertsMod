
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
				tabData.accept(DerRobertModBlocks.AETHER_PORTAL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_SKYROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_THERAWOOD_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.AETHER_WISPROOT_LOG.get().asItem());
				tabData.accept(DerRobertModBlocks.WATER_PORTAL_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_ALPHA_TAB = REGISTRY.register("roberts_alpha_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_alpha_tab")).icon(() -> new ItemStack(DerRobertModBlocks.ALPHA_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.ALPHA_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.ALPHA_GRASS_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.ALPHA_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.SOME_WHITE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.SOME_WHITE_SIDE_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.SOME_WHITE_BLOCK_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.SOME_WHITE_BLOCK_STAIRS.get().asItem());
				tabData.accept(DerRobertModItems.ALPHA_CREEPER_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_BETA_TAB = REGISTRY.register("roberts_beta_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_beta_tab")).icon(() -> new ItemStack(DerRobertModBlocks.BETA_GRAVEL_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.BETA_END_STONE.get().asItem());
				tabData.accept(DerRobertModBlocks.BETA_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.BETA_MONSTER_SPAWNER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_CLASSIC_TAB = REGISTRY.register("roberts_classic_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_classic_tab")).icon(() -> new ItemStack(DerRobertModBlocks.CLASSIC_BEDROCK_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.CLASSIC_BEDROCK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_BRICK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_BRICK_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_BRICK_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_CRYING_OBSIDIAN.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_TRAP_DOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_DIRT_TRIANGLE.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_EMERALD_ITEM.get());
				tabData.accept(DerRobertModBlocks.CLASSIC_EMERALD_ORE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_ENDSTONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.GLASS_DOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLASS_PANE.get().asItem());
				tabData.accept(DerRobertModBlocks.GLASS_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.GLASS_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLASS_WALL.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GLOWSTONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_GLOW_STONE_DUST.get());
				tabData.accept(DerRobertModBlocks.CLASSIC_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GRAVEL_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.HEROBRINE_NETHERRACK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_IRON_DOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MONSTER_SPAWNER.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MOSSY_STONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MOSSY_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MOSSY_STONE_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_MOSSY_STONE_WALL.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_NETHERRACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_NETHER_QUARTZ_ORE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_OAK_LEAVES_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_OBSIDIAN_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_ITEM.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_AXE.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_HOE.get());
				tabData.accept(DerRobertModBlocks.CLASSIC_RUBY_ORE.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_PICKAXE.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_SHOVEL.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_SWORD.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_ARMOR_HELMET.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_ARMOR_CHESTPLATE.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_ARMOR_LEGGINGS.get());
				tabData.accept(DerRobertModItems.CLASSIC_RUBY_ARMOR_BOOTS.get());
				tabData.accept(DerRobertModBlocks.CLASSIC_SAND_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SMOOTH_STONE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SMOOTH_STONE_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SMOOTH_STONE_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SOUL_SAND.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_SPONGE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_STONE_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_STONE_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_STONE_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_TNT_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_SKY_DIMENSION.get());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_DOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_PANE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_SIDE_SLAB.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_TABLE.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WOOD_TRAPDOOR.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_WORKBENCH_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.CLASSIC_HEROBRINE_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_HUMAN_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_PIGMAN_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.CLASSIC_ZOMBIE_PIGMAN_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_MOJANG_TAB = REGISTRY.register("roberts_mojang_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_mojang_tab")).icon(() -> new ItemStack(DerRobertModBlocks.BACKGROUND_DIRT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.BACKGROUND_DIRT.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_PACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MODERN_PACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MOJANG_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.UNKNOWN_PACK_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.NOTCH_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_MOD_TAB = REGISTRY.register("roberts_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_mod_tab")).icon(() -> new ItemStack(DerRobertModBlocks.CREEPONIA_BRICK_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.ANTI_LIGHT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.BOULDER_DASH_BONUS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.BOULDER_DASH_BONUS_BLOCK_BW.get().asItem());
				tabData.accept(DerRobertModBlocks.CREEPONIA_BRICK_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.CREEPONIA_BRICK_SLABS.get().asItem());
				tabData.accept(DerRobertModBlocks.CREEPONIA_BRICK_STAIRS.get().asItem());
				tabData.accept(DerRobertModBlocks.CREEPONIA_BRICK_WALL.get().asItem());
				tabData.accept(DerRobertModBlocks.END_PORTAL_BUTTON.get().asItem());
				tabData.accept(DerRobertModBlocks.CLASSIC_GHOST_DIRT.get().asItem());
				tabData.accept(DerRobertModBlocks.LUCKY_BLOCK_OFF.get().asItem());
				tabData.accept(DerRobertModBlocks.LUCKY_BLOCK_ON.get().asItem());
				tabData.accept(DerRobertModBlocks.MISSING_NO_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MISSING_NO_BUTTON.get().asItem());
				tabData.accept(DerRobertModBlocks.NETHER_PORTAL_BUTTON.get().asItem());
				tabData.accept(DerRobertModBlocks.NO_CHEST.get().asItem());
				tabData.accept(DerRobertModBlocks.SIX_SIDED_PISTON.get().asItem());
				tabData.accept(DerRobertModBlocks.SIX_SIDED_STICKY_PISTON.get().asItem());
				tabData.accept(DerRobertModBlocks.WHITE_LIGHT_BLOCK.get().asItem());
				tabData.accept(DerRobertModItems.NOT_NETHER_DIMENSION.get());
				tabData.accept(DerRobertModItems.SKY_BLOCK_DIMENSION.get());
				tabData.accept(DerRobertModItems.CREEPER_PIG_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.EPIX_KEV_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.EVIL_HEROBRINE_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.GRONKH_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.PIGGY_CREEPER_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.SON_KI_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.TEMPLATE_HUMAN_SPAWN_EGG.get());
				tabData.accept(DerRobertModItems.TRACY_MOODALIE_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_POCKET_TAB = REGISTRY.register("roberts_pocket_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_pocket_tab")).icon(() -> new ItemStack(DerRobertModBlocks.GLOWING_OBSIDIAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.GLOWING_OBSIDIAN.get().asItem());
				tabData.accept(DerRobertModBlocks.NETHER_REACTOR_CORE_BLUE.get().asItem());
				tabData.accept(DerRobertModBlocks.POCKET_STONE_CUTTER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_MANIC_DIGGER = REGISTRY.register("roberts_manic_digger",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_manic_digger")).icon(() -> new ItemStack(DerRobertModBlocks.MANIC_GRASS_ONLY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.MANIC_COBBLESTONE.get().asItem());
				tabData.accept(DerRobertModBlocks.MANIC_DIRT_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MANIC_GRASS_BLOCK.get().asItem());
				tabData.accept(DerRobertModBlocks.MANIC_STONE_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROBERTS_PLASTIC_TAB = REGISTRY.register("roberts_plastic_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.der_robert.roberts_plastic_tab")).icon(() -> new ItemStack(DerRobertModBlocks.PLASTIC_BRICK_WHITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DerRobertModBlocks.PLASTIC_BRICK_WHITE.get().asItem());
				tabData.accept(DerRobertModBlocks.PLASTIC_DOOR_WHITE.get().asItem());
				tabData.accept(DerRobertModBlocks.PLASTIC_PANE_WHITE.get().asItem());
				tabData.accept(DerRobertModItems.PLASTIC_PAINT_BRUSH_0.get());
				tabData.accept(DerRobertModBlocks.PLASTIC_SLABS_WHITE.get().asItem());
				tabData.accept(DerRobertModBlocks.PLASTIC_STAIRS_WHITE.get().asItem());
				tabData.accept(DerRobertModBlocks.PLASTIC_WALLS_WHITE.get().asItem());
			})

					.build());
}
