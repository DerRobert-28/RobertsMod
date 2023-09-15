
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.derrobert.world.features.ores.WhiteLightBlockFeature;
import net.mcreator.derrobert.world.features.ores.MojangBlockFeature;
import net.mcreator.derrobert.world.features.ores.MissingNoBlockFeature;
import net.mcreator.derrobert.world.features.ores.HerobrineNetherrackFeature;
import net.mcreator.derrobert.world.features.ores.GlowingObsidianFeature;
import net.mcreator.derrobert.world.features.ores.GlassDoorFeature;
import net.mcreator.derrobert.world.features.ores.CreeponiaBrickBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWorkbenchBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodSlabsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodDoorFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicStoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSpongeBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSoulSandFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSandBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicObsidianBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicOakLeavesBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicNetherrackBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicNetherQuartzOreFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMossyStoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMonsterSpawnerFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGrassBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGlowstoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicEndstoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtSlabFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicCryingObsidianFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBrickBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBedrockBlockFeature;
import net.mcreator.derrobert.world.features.ores.BetaMonsterSpawnerFeature;
import net.mcreator.derrobert.world.features.ores.BetaGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.BetaEndStoneFeature;
import net.mcreator.derrobert.world.features.ores.BackgroundDirtFeature;
import net.mcreator.derrobert.world.features.ores.AntiLightBlockFeature;
import net.mcreator.derrobert.world.features.ores.AlphaGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.AlphaGrassBlockFeature;
import net.mcreator.derrobert.world.features.ores.AetherWisprootLogFeature;
import net.mcreator.derrobert.world.features.ores.AetherTherawoodLogFeature;
import net.mcreator.derrobert.world.features.ores.AetherSkyrootLogFeature;
import net.mcreator.derrobert.world.features.ores.AetherGreatrootLogFeature;
import net.mcreator.derrobert.world.features.ores.AetherGrassBlockFeature;
import net.mcreator.derrobert.world.features.ores.AetherDirtBlockFeature;
import net.mcreator.derrobert.world.features.ores.AetherAmberootLogFeature;
import net.mcreator.derrobert.DerRobertMod;

@Mod.EventBusSubscriber
public class DerRobertModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DerRobertMod.MODID);
	public static final RegistryObject<Feature<?>> AETHER_AMBEROOT_LOG = REGISTRY.register("aether_amberoot_log", AetherAmberootLogFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_DIRT_BLOCK = REGISTRY.register("aether_dirt_block", AetherDirtBlockFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_GRASS_BLOCK = REGISTRY.register("aether_grass_block", AetherGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_GREATROOT_LOG = REGISTRY.register("aether_greatroot_log", AetherGreatrootLogFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_SKYROOT_LOG = REGISTRY.register("aether_skyroot_log", AetherSkyrootLogFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_THERAWOOD_LOG = REGISTRY.register("aether_therawood_log", AetherTherawoodLogFeature::new);
	public static final RegistryObject<Feature<?>> AETHER_WISPROOT_LOG = REGISTRY.register("aether_wisproot_log", AetherWisprootLogFeature::new);
	public static final RegistryObject<Feature<?>> GLOWING_OBSIDIAN = REGISTRY.register("glowing_obsidian", GlowingObsidianFeature::new);
	public static final RegistryObject<Feature<?>> ANTI_LIGHT_BLOCK = REGISTRY.register("anti_light_block", AntiLightBlockFeature::new);
	public static final RegistryObject<Feature<?>> CREEPONIA_BRICK_BLOCK = REGISTRY.register("creeponia_brick_block", CreeponiaBrickBlockFeature::new);
	public static final RegistryObject<Feature<?>> GLASS_DOOR = REGISTRY.register("glass_door", GlassDoorFeature::new);
	public static final RegistryObject<Feature<?>> HEROBRINE_NETHERRACK = REGISTRY.register("herobrine_netherrack", HerobrineNetherrackFeature::new);
	public static final RegistryObject<Feature<?>> MISSING_NO_BLOCK = REGISTRY.register("missing_no_block", MissingNoBlockFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_LIGHT_BLOCK = REGISTRY.register("white_light_block", WhiteLightBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WORKBENCH_BLOCK = REGISTRY.register("classic_workbench_block", ClassicWorkbenchBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_BEDROCK_BLOCK = REGISTRY.register("classic_bedrock_block", ClassicBedrockBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_BRICK_BLOCK = REGISTRY.register("classic_brick_block", ClassicBrickBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_CRYING_OBSIDIAN = REGISTRY.register("classic_crying_obsidian", ClassicCryingObsidianFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_BLOCK = REGISTRY.register("classic_dirt_block", ClassicDirtBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_SLAB = REGISTRY.register("classic_dirt_slab", ClassicDirtSlabFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_STAIRS = REGISTRY.register("classic_dirt_stairs", ClassicDirtStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_ENDSTONE_BLOCK = REGISTRY.register("classic_endstone_block", ClassicEndstoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GLOWSTONE_BLOCK = REGISTRY.register("classic_glowstone_block", ClassicGlowstoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GRASS_BLOCK = REGISTRY.register("classic_grass_block", ClassicGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GRAVEL_BLOCK = REGISTRY.register("classic_gravel_block", ClassicGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MONSTER_SPAWNER = REGISTRY.register("classic_monster_spawner", ClassicMonsterSpawnerFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MOSSY_STONE_BLOCK = REGISTRY.register("classic_mossy_stone_block", ClassicMossyStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_NETHERRACK_BLOCK = REGISTRY.register("classic_netherrack_block", ClassicNetherrackBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_NETHER_QUARTZ_ORE = REGISTRY.register("classic_nether_quartz_ore", ClassicNetherQuartzOreFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_OAK_LEAVES_BLOCK = REGISTRY.register("classic_oak_leaves_block", ClassicOakLeavesBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_OBSIDIAN_BLOCK = REGISTRY.register("classic_obsidian_block", ClassicObsidianBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SAND_BLOCK = REGISTRY.register("classic_sand_block", ClassicSandBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SOUL_SAND = REGISTRY.register("classic_soul_sand", ClassicSoulSandFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SPONGE_BLOCK = REGISTRY.register("classic_sponge_block", ClassicSpongeBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_STONE_BLOCK = REGISTRY.register("classic_stone_block", ClassicStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_BLOCK = REGISTRY.register("classic_wood_block", ClassicWoodBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_SLABS = REGISTRY.register("classic_wood_slabs", ClassicWoodSlabsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_STAIRS = REGISTRY.register("classic_wood_stairs", ClassicWoodStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_DOOR = REGISTRY.register("classic_wood_door", ClassicWoodDoorFeature::new);
	public static final RegistryObject<Feature<?>> ALPHA_GRASS_BLOCK = REGISTRY.register("alpha_grass_block", AlphaGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> ALPHA_GRAVEL_BLOCK = REGISTRY.register("alpha_gravel_block", AlphaGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> BACKGROUND_DIRT = REGISTRY.register("background_dirt", BackgroundDirtFeature::new);
	public static final RegistryObject<Feature<?>> MOJANG_BLOCK = REGISTRY.register("mojang_block", MojangBlockFeature::new);
	public static final RegistryObject<Feature<?>> BETA_GRAVEL_BLOCK = REGISTRY.register("beta_gravel_block", BetaGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> BETA_MONSTER_SPAWNER = REGISTRY.register("beta_monster_spawner", BetaMonsterSpawnerFeature::new);
	public static final RegistryObject<Feature<?>> BETA_END_STONE = REGISTRY.register("beta_end_stone", BetaEndStoneFeature::new);
}
