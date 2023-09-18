
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.derrobert.DerRobertMod;

public class DerRobertModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DerRobertMod.MODID);
	public static final RegistryObject<Item> AETHER_AMBEROOT_LOG = block(DerRobertModBlocks.AETHER_AMBEROOT_LOG);
	public static final RegistryObject<Item> AETHER_DIRT_BLOCK = block(DerRobertModBlocks.AETHER_DIRT_BLOCK);
	public static final RegistryObject<Item> AETHER_GRASS_BLOCK = block(DerRobertModBlocks.AETHER_GRASS_BLOCK);
	public static final RegistryObject<Item> AETHER_GREATROOT_LOG = block(DerRobertModBlocks.AETHER_GREATROOT_LOG);
	public static final RegistryObject<Item> AETHER_SKYROOT_LOG = block(DerRobertModBlocks.AETHER_SKYROOT_LOG);
	public static final RegistryObject<Item> AETHER_THERAWOOD_LOG = block(DerRobertModBlocks.AETHER_THERAWOOD_LOG);
	public static final RegistryObject<Item> AETHER_WISPROOT_LOG = block(DerRobertModBlocks.AETHER_WISPROOT_LOG);
	public static final RegistryObject<Item> AETHER_PORTAL_BLOCK = block(DerRobertModBlocks.AETHER_PORTAL_BLOCK);
	public static final RegistryObject<Item> GLOWING_OBSIDIAN = block(DerRobertModBlocks.GLOWING_OBSIDIAN);
	public static final RegistryObject<Item> ANTI_LIGHT_BLOCK = block(DerRobertModBlocks.ANTI_LIGHT_BLOCK);
	public static final RegistryObject<Item> CREEPONIA_BRICK_BLOCK = block(DerRobertModBlocks.CREEPONIA_BRICK_BLOCK);
	public static final RegistryObject<Item> END_PORTAL_BUTTON = block(DerRobertModBlocks.END_PORTAL_BUTTON);
	public static final RegistryObject<Item> GLASS_DOOR = doubleBlock(DerRobertModBlocks.GLASS_DOOR);
	public static final RegistryObject<Item> GLASS_STAIRS = block(DerRobertModBlocks.GLASS_STAIRS);
	public static final RegistryObject<Item> GLASS_SLABS = block(DerRobertModBlocks.GLASS_SLABS);
	public static final RegistryObject<Item> HEROBRINE_NETHERRACK = block(DerRobertModBlocks.HEROBRINE_NETHERRACK);
	public static final RegistryObject<Item> LUCKY_STONE_BLOCK = block(DerRobertModBlocks.LUCKY_STONE_BLOCK);
	public static final RegistryObject<Item> MISSING_NO_BLOCK = block(DerRobertModBlocks.MISSING_NO_BLOCK);
	public static final RegistryObject<Item> MISSING_NO_BUTTON = block(DerRobertModBlocks.MISSING_NO_BUTTON);
	public static final RegistryObject<Item> NETHER_PORTAL_BUTTON = block(DerRobertModBlocks.NETHER_PORTAL_BUTTON);
	public static final RegistryObject<Item> SOME_WHITE_BLOCK = block(DerRobertModBlocks.SOME_WHITE_BLOCK);
	public static final RegistryObject<Item> WHITE_LIGHT_BLOCK = block(DerRobertModBlocks.WHITE_LIGHT_BLOCK);
	public static final RegistryObject<Item> CLASSIC_WORKBENCH_BLOCK = block(DerRobertModBlocks.CLASSIC_WORKBENCH_BLOCK);
	public static final RegistryObject<Item> WATER_PORTAL_BLOCK = block(DerRobertModBlocks.WATER_PORTAL_BLOCK);
	public static final RegistryObject<Item> CREEPER_PIG_SPAWN_EGG = REGISTRY.register("creeper_pig_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.CREEPER_PIG, -16744704, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> EVIL_HEROBRINE_SPAWN_EGG = REGISTRY.register("evil_herobrine_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.EVIL_HEROBRINE, -65536, -256, new Item.Properties()));
	public static final RegistryObject<Item> PIGGY_CREEPER_SPAWN_EGG = REGISTRY.register("piggy_creeper_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.PIGGY_CREEPER, -32897, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEMPLATE_HUMAN_SPAWN_EGG = REGISTRY.register("template_human_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.TEMPLATE_HUMAN, -1, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> CLASSIC_BEDROCK_BLOCK = block(DerRobertModBlocks.CLASSIC_BEDROCK_BLOCK);
	public static final RegistryObject<Item> CLASSIC_BRICK_BLOCK = block(DerRobertModBlocks.CLASSIC_BRICK_BLOCK);
	public static final RegistryObject<Item> CLASSIC_CRYING_OBSIDIAN = block(DerRobertModBlocks.CLASSIC_CRYING_OBSIDIAN);
	public static final RegistryObject<Item> CLASSIC_DIRT_BLOCK = block(DerRobertModBlocks.CLASSIC_DIRT_BLOCK);
	public static final RegistryObject<Item> CLASSIC_DIRT_SLAB = block(DerRobertModBlocks.CLASSIC_DIRT_SLAB);
	public static final RegistryObject<Item> CLASSIC_DIRT_STAIRS = block(DerRobertModBlocks.CLASSIC_DIRT_STAIRS);
	public static final RegistryObject<Item> CLASSIC_ENDSTONE_BLOCK = block(DerRobertModBlocks.CLASSIC_ENDSTONE_BLOCK);
	public static final RegistryObject<Item> CLASSIC_GLASS_BLOCK = block(DerRobertModBlocks.CLASSIC_GLASS_BLOCK);
	public static final RegistryObject<Item> CLASSIC_GLASS_PANE = block(DerRobertModBlocks.CLASSIC_GLASS_PANE);
	public static final RegistryObject<Item> CLASSIC_GLOWSTONE_BLOCK = block(DerRobertModBlocks.CLASSIC_GLOWSTONE_BLOCK);
	public static final RegistryObject<Item> CLASSIC_GRASS_BLOCK = block(DerRobertModBlocks.CLASSIC_GRASS_BLOCK);
	public static final RegistryObject<Item> CLASSIC_GRAVEL_BLOCK = block(DerRobertModBlocks.CLASSIC_GRAVEL_BLOCK);
	public static final RegistryObject<Item> CLASSIC_MONSTER_SPAWNER = block(DerRobertModBlocks.CLASSIC_MONSTER_SPAWNER);
	public static final RegistryObject<Item> CLASSIC_MOSSY_STONE_BLOCK = block(DerRobertModBlocks.CLASSIC_MOSSY_STONE_BLOCK);
	public static final RegistryObject<Item> CLASSIC_NETHERRACK_BLOCK = block(DerRobertModBlocks.CLASSIC_NETHERRACK_BLOCK);
	public static final RegistryObject<Item> CLASSIC_NETHER_QUARTZ_ORE = block(DerRobertModBlocks.CLASSIC_NETHER_QUARTZ_ORE);
	public static final RegistryObject<Item> CLASSIC_OAK_LEAVES_BLOCK = block(DerRobertModBlocks.CLASSIC_OAK_LEAVES_BLOCK);
	public static final RegistryObject<Item> CLASSIC_OBSIDIAN_BLOCK = block(DerRobertModBlocks.CLASSIC_OBSIDIAN_BLOCK);
	public static final RegistryObject<Item> CLASSIC_SAND_BLOCK = block(DerRobertModBlocks.CLASSIC_SAND_BLOCK);
	public static final RegistryObject<Item> CLASSIC_SOUL_SAND = block(DerRobertModBlocks.CLASSIC_SOUL_SAND);
	public static final RegistryObject<Item> CLASSIC_SPONGE_BLOCK = block(DerRobertModBlocks.CLASSIC_SPONGE_BLOCK);
	public static final RegistryObject<Item> CLASSIC_STONE_BLOCK = block(DerRobertModBlocks.CLASSIC_STONE_BLOCK);
	public static final RegistryObject<Item> CLASSIC_TNT_BLOCK = block(DerRobertModBlocks.CLASSIC_TNT_BLOCK);
	public static final RegistryObject<Item> CLASSIC_WOOD_BLOCK = block(DerRobertModBlocks.CLASSIC_WOOD_BLOCK);
	public static final RegistryObject<Item> CLASSIC_WOOD_SLABS = block(DerRobertModBlocks.CLASSIC_WOOD_SLABS);
	public static final RegistryObject<Item> CLASSIC_WOOD_STAIRS = block(DerRobertModBlocks.CLASSIC_WOOD_STAIRS);
	public static final RegistryObject<Item> CLASSIC_WOOD_DOOR = doubleBlock(DerRobertModBlocks.CLASSIC_WOOD_DOOR);
	public static final RegistryObject<Item> CLASSIC_HEROBRINE_SPAWN_EGG = REGISTRY.register("classic_herobrine_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.CLASSIC_HEROBRINE, -16776961, -65536, new Item.Properties()));
	public static final RegistryObject<Item> CLASSIC_HUMAN_SPAWN_EGG = REGISTRY.register("classic_human_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.CLASSIC_HUMAN, -16776961, -16711681, new Item.Properties()));
	public static final RegistryObject<Item> CLASSIC_ZOMBIE_SPAWN_EGG = REGISTRY.register("classic_zombie_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.CLASSIC_ZOMBIE, -16776961, -16711936, new Item.Properties()));
	public static final RegistryObject<Item> ALPHA_GRASS_BLOCK = block(DerRobertModBlocks.ALPHA_GRASS_BLOCK);
	public static final RegistryObject<Item> ALPHA_GRAVEL_BLOCK = block(DerRobertModBlocks.ALPHA_GRAVEL_BLOCK);
	public static final RegistryObject<Item> ALPHA_CREEPER_SPAWN_EGG = REGISTRY.register("alpha_creeper_spawn_egg", () -> new ForgeSpawnEggItem(DerRobertModEntities.ALPHA_CREEPER, -16711936, -1, new Item.Properties()));
	public static final RegistryObject<Item> BACKGROUND_DIRT = block(DerRobertModBlocks.BACKGROUND_DIRT);
	public static final RegistryObject<Item> CLASSIC_PACK_BLOCK = block(DerRobertModBlocks.CLASSIC_PACK_BLOCK);
	public static final RegistryObject<Item> MODERN_PACK_BLOCK = block(DerRobertModBlocks.MODERN_PACK_BLOCK);
	public static final RegistryObject<Item> MOJANG_BLOCK = block(DerRobertModBlocks.MOJANG_BLOCK);
	public static final RegistryObject<Item> UNKNOWN_PACK_BLOCK = block(DerRobertModBlocks.UNKNOWN_PACK_BLOCK);
	public static final RegistryObject<Item> BETA_GRAVEL_BLOCK = block(DerRobertModBlocks.BETA_GRAVEL_BLOCK);
	public static final RegistryObject<Item> BETA_MONSTER_SPAWNER = block(DerRobertModBlocks.BETA_MONSTER_SPAWNER);
	public static final RegistryObject<Item> BETA_END_STONE = block(DerRobertModBlocks.BETA_END_STONE);
	public static final RegistryObject<Item> CLASSIC_IRON_DOOR = doubleBlock(DerRobertModBlocks.CLASSIC_IRON_DOOR);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
