
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
import net.mcreator.derrobert.world.features.ores.SomeWhiteSideSlabFeature;
import net.mcreator.derrobert.world.features.ores.SomeWhiteCylinderFeature;
import net.mcreator.derrobert.world.features.ores.SomeWhiteBlockStairsFeature;
import net.mcreator.derrobert.world.features.ores.SomeWhiteBlockSlabsFeature;
import net.mcreator.derrobert.world.features.ores.SomeWhiteBlockFeature;
import net.mcreator.derrobert.world.features.ores.SixSidedHayBlockFeature;
import net.mcreator.derrobert.world.features.ores.NoChestFeature;
import net.mcreator.derrobert.world.features.ores.NetherPortalButtonFeature;
import net.mcreator.derrobert.world.features.ores.MojangBlockFeature;
import net.mcreator.derrobert.world.features.ores.MissingNoButtonFeature;
import net.mcreator.derrobert.world.features.ores.MissingNoBlockFeature;
import net.mcreator.derrobert.world.features.ores.ManicWoodPlanksFeature;
import net.mcreator.derrobert.world.features.ores.ManicWaterFeature;
import net.mcreator.derrobert.world.features.ores.ManicStoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ManicRoofBlockFeature;
import net.mcreator.derrobert.world.features.ores.ManicLeavesFeature;
import net.mcreator.derrobert.world.features.ores.ManicLavaFeature;
import net.mcreator.derrobert.world.features.ores.ManicGrassOnlyFeature;
import net.mcreator.derrobert.world.features.ores.ManicGrassBlockFeature;
import net.mcreator.derrobert.world.features.ores.ManicDirtBlockFeature;
import net.mcreator.derrobert.world.features.ores.ManicCobblestoneFeature;
import net.mcreator.derrobert.world.features.ores.ManicCamouflageFeature;
import net.mcreator.derrobert.world.features.ores.HerobrineNetherrackGlowFeature;
import net.mcreator.derrobert.world.features.ores.HerobrineNetherrackFeature;
import net.mcreator.derrobert.world.features.ores.GlowingObsidianFeature;
import net.mcreator.derrobert.world.features.ores.GlassDoorFeature;
import net.mcreator.derrobert.world.features.ores.EndPortalButtonFeature;
import net.mcreator.derrobert.world.features.ores.CreeponiaBrickWallFeature;
import net.mcreator.derrobert.world.features.ores.CreeponiaBrickStairsFeature;
import net.mcreator.derrobert.world.features.ores.CreeponiaBrickSlabsFeature;
import net.mcreator.derrobert.world.features.ores.CreeponiaBrickBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWorkbenchBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodTrapdoorFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodTableFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodSlabsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodSideSlabFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodPaneFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodDoorFeature;
import net.mcreator.derrobert.world.features.ores.ClassicWoodBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicStoneStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicStoneSlabFeature;
import net.mcreator.derrobert.world.features.ores.ClassicStoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSpongeBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSoulSandFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSmoothStoneStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSmoothStoneSlabFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSmoothStoneFeature;
import net.mcreator.derrobert.world.features.ores.ClassicSandBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicRubyOreFeature;
import net.mcreator.derrobert.world.features.ores.ClassicObsidianBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicOakLeavesBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicNetherrackBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicNetherQuartzOreFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMossyStoneStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMossyStoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMossySlabsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMonsterSpawnerFeature;
import net.mcreator.derrobert.world.features.ores.ClassicMissingNoFeature;
import net.mcreator.derrobert.world.features.ores.ClassicIronDoorFeature;
import net.mcreator.derrobert.world.features.ores.ClassicHayStackFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGrassBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGlowstoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGlassWallFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGlassPaneFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGlassBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicGhostDirtFeature;
import net.mcreator.derrobert.world.features.ores.ClassicEndstoneBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicEmeraldOreFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtTriangleFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtTrapDoorFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtSlabFeature;
import net.mcreator.derrobert.world.features.ores.ClassicDirtBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicCryingObsidianFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBrickStairsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBrickSlabsFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBrickBlockFeature;
import net.mcreator.derrobert.world.features.ores.ClassicBedrockBlockFeature;
import net.mcreator.derrobert.world.features.ores.BetaMonsterSpawnerFeature;
import net.mcreator.derrobert.world.features.ores.BetaGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.BetaEndStoneFeature;
import net.mcreator.derrobert.world.features.ores.BackgroundDirtFeature;
import net.mcreator.derrobert.world.features.ores.AntiLightBlockFeature;
import net.mcreator.derrobert.world.features.ores.AlphaGravelBlockFeature;
import net.mcreator.derrobert.world.features.ores.AlphaGrassSlabFeature;
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
	public static final RegistryObject<Feature<?>> CLASSIC_BEDROCK_BLOCK = REGISTRY.register("classic_bedrock_block", ClassicBedrockBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_BRICK_BLOCK = REGISTRY.register("classic_brick_block", ClassicBrickBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_BRICK_SLABS = REGISTRY.register("classic_brick_slabs", ClassicBrickSlabsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_BRICK_STAIRS = REGISTRY.register("classic_brick_stairs", ClassicBrickStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_CRYING_OBSIDIAN = REGISTRY.register("classic_crying_obsidian", ClassicCryingObsidianFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_BLOCK = REGISTRY.register("classic_dirt_block", ClassicDirtBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_SLAB = REGISTRY.register("classic_dirt_slab", ClassicDirtSlabFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_STAIRS = REGISTRY.register("classic_dirt_stairs", ClassicDirtStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_TRAP_DOOR = REGISTRY.register("classic_dirt_trap_door", ClassicDirtTrapDoorFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_DIRT_TRIANGLE = REGISTRY.register("classic_dirt_triangle", ClassicDirtTriangleFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_EMERALD_ORE = REGISTRY.register("classic_emerald_ore", ClassicEmeraldOreFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_ENDSTONE_BLOCK = REGISTRY.register("classic_endstone_block", ClassicEndstoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GLASS_BLOCK = REGISTRY.register("classic_glass_block", ClassicGlassBlockFeature::new);
	public static final RegistryObject<Feature<?>> GLASS_DOOR = REGISTRY.register("glass_door", GlassDoorFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GLASS_PANE = REGISTRY.register("classic_glass_pane", ClassicGlassPaneFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GLASS_WALL = REGISTRY.register("classic_glass_wall", ClassicGlassWallFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GLOWSTONE_BLOCK = REGISTRY.register("classic_glowstone_block", ClassicGlowstoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GRASS_BLOCK = REGISTRY.register("classic_grass_block", ClassicGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GRAVEL_BLOCK = REGISTRY.register("classic_gravel_block", ClassicGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_HAY_STACK = REGISTRY.register("classic_hay_stack", ClassicHayStackFeature::new);
	public static final RegistryObject<Feature<?>> HEROBRINE_NETHERRACK = REGISTRY.register("herobrine_netherrack", HerobrineNetherrackFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_IRON_DOOR = REGISTRY.register("classic_iron_door", ClassicIronDoorFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MISSING_NO = REGISTRY.register("classic_missing_no", ClassicMissingNoFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MONSTER_SPAWNER = REGISTRY.register("classic_monster_spawner", ClassicMonsterSpawnerFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MOSSY_STONE_BLOCK = REGISTRY.register("classic_mossy_stone_block", ClassicMossyStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MOSSY_SLABS = REGISTRY.register("classic_mossy_slabs", ClassicMossySlabsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_MOSSY_STONE_STAIRS = REGISTRY.register("classic_mossy_stone_stairs", ClassicMossyStoneStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_NETHERRACK_BLOCK = REGISTRY.register("classic_netherrack_block", ClassicNetherrackBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_NETHER_QUARTZ_ORE = REGISTRY.register("classic_nether_quartz_ore", ClassicNetherQuartzOreFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_OAK_LEAVES_BLOCK = REGISTRY.register("classic_oak_leaves_block", ClassicOakLeavesBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_OBSIDIAN_BLOCK = REGISTRY.register("classic_obsidian_block", ClassicObsidianBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_RUBY_ORE = REGISTRY.register("classic_ruby_ore", ClassicRubyOreFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SAND_BLOCK = REGISTRY.register("classic_sand_block", ClassicSandBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SMOOTH_STONE = REGISTRY.register("classic_smooth_stone", ClassicSmoothStoneFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SMOOTH_STONE_SLAB = REGISTRY.register("classic_smooth_stone_slab", ClassicSmoothStoneSlabFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SMOOTH_STONE_STAIRS = REGISTRY.register("classic_smooth_stone_stairs", ClassicSmoothStoneStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SOUL_SAND = REGISTRY.register("classic_soul_sand", ClassicSoulSandFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_SPONGE_BLOCK = REGISTRY.register("classic_sponge_block", ClassicSpongeBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_STONE_BLOCK = REGISTRY.register("classic_stone_block", ClassicStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_STONE_SLAB = REGISTRY.register("classic_stone_slab", ClassicStoneSlabFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_STONE_STAIRS = REGISTRY.register("classic_stone_stairs", ClassicStoneStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_BLOCK = REGISTRY.register("classic_wood_block", ClassicWoodBlockFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_DOOR = REGISTRY.register("classic_wood_door", ClassicWoodDoorFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_PANE = REGISTRY.register("classic_wood_pane", ClassicWoodPaneFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_SIDE_SLAB = REGISTRY.register("classic_wood_side_slab", ClassicWoodSideSlabFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_SLABS = REGISTRY.register("classic_wood_slabs", ClassicWoodSlabsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_STAIRS = REGISTRY.register("classic_wood_stairs", ClassicWoodStairsFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_TABLE = REGISTRY.register("classic_wood_table", ClassicWoodTableFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WOOD_TRAPDOOR = REGISTRY.register("classic_wood_trapdoor", ClassicWoodTrapdoorFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_WORKBENCH_BLOCK = REGISTRY.register("classic_workbench_block", ClassicWorkbenchBlockFeature::new);
	public static final RegistryObject<Feature<?>> ANTI_LIGHT_BLOCK = REGISTRY.register("anti_light_block", AntiLightBlockFeature::new);
	public static final RegistryObject<Feature<?>> CREEPONIA_BRICK_BLOCK = REGISTRY.register("creeponia_brick_block", CreeponiaBrickBlockFeature::new);
	public static final RegistryObject<Feature<?>> CREEPONIA_BRICK_SLABS = REGISTRY.register("creeponia_brick_slabs", CreeponiaBrickSlabsFeature::new);
	public static final RegistryObject<Feature<?>> CREEPONIA_BRICK_STAIRS = REGISTRY.register("creeponia_brick_stairs", CreeponiaBrickStairsFeature::new);
	public static final RegistryObject<Feature<?>> CREEPONIA_BRICK_WALL = REGISTRY.register("creeponia_brick_wall", CreeponiaBrickWallFeature::new);
	public static final RegistryObject<Feature<?>> END_PORTAL_BUTTON = REGISTRY.register("end_portal_button", EndPortalButtonFeature::new);
	public static final RegistryObject<Feature<?>> CLASSIC_GHOST_DIRT = REGISTRY.register("classic_ghost_dirt", ClassicGhostDirtFeature::new);
	public static final RegistryObject<Feature<?>> MISSING_NO_BLOCK = REGISTRY.register("missing_no_block", MissingNoBlockFeature::new);
	public static final RegistryObject<Feature<?>> MISSING_NO_BUTTON = REGISTRY.register("missing_no_button", MissingNoButtonFeature::new);
	public static final RegistryObject<Feature<?>> NETHER_PORTAL_BUTTON = REGISTRY.register("nether_portal_button", NetherPortalButtonFeature::new);
	public static final RegistryObject<Feature<?>> NO_CHEST = REGISTRY.register("no_chest", NoChestFeature::new);
	public static final RegistryObject<Feature<?>> SIX_SIDED_HAY_BLOCK = REGISTRY.register("six_sided_hay_block", SixSidedHayBlockFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_LIGHT_BLOCK = REGISTRY.register("white_light_block", WhiteLightBlockFeature::new);
	public static final RegistryObject<Feature<?>> ALPHA_GRASS_BLOCK = REGISTRY.register("alpha_grass_block", AlphaGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> ALPHA_GRASS_SLAB = REGISTRY.register("alpha_grass_slab", AlphaGrassSlabFeature::new);
	public static final RegistryObject<Feature<?>> ALPHA_GRAVEL_BLOCK = REGISTRY.register("alpha_gravel_block", AlphaGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> SOME_WHITE_BLOCK = REGISTRY.register("some_white_block", SomeWhiteBlockFeature::new);
	public static final RegistryObject<Feature<?>> SOME_WHITE_SIDE_SLAB = REGISTRY.register("some_white_side_slab", SomeWhiteSideSlabFeature::new);
	public static final RegistryObject<Feature<?>> SOME_WHITE_BLOCK_SLABS = REGISTRY.register("some_white_block_slabs", SomeWhiteBlockSlabsFeature::new);
	public static final RegistryObject<Feature<?>> SOME_WHITE_BLOCK_STAIRS = REGISTRY.register("some_white_block_stairs", SomeWhiteBlockStairsFeature::new);
	public static final RegistryObject<Feature<?>> GLOWING_OBSIDIAN = REGISTRY.register("glowing_obsidian", GlowingObsidianFeature::new);
	public static final RegistryObject<Feature<?>> BACKGROUND_DIRT = REGISTRY.register("background_dirt", BackgroundDirtFeature::new);
	public static final RegistryObject<Feature<?>> MOJANG_BLOCK = REGISTRY.register("mojang_block", MojangBlockFeature::new);
	public static final RegistryObject<Feature<?>> BETA_END_STONE = REGISTRY.register("beta_end_stone", BetaEndStoneFeature::new);
	public static final RegistryObject<Feature<?>> BETA_GRAVEL_BLOCK = REGISTRY.register("beta_gravel_block", BetaGravelBlockFeature::new);
	public static final RegistryObject<Feature<?>> BETA_MONSTER_SPAWNER = REGISTRY.register("beta_monster_spawner", BetaMonsterSpawnerFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_CAMOUFLAGE = REGISTRY.register("manic_camouflage", ManicCamouflageFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_COBBLESTONE = REGISTRY.register("manic_cobblestone", ManicCobblestoneFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_DIRT_BLOCK = REGISTRY.register("manic_dirt_block", ManicDirtBlockFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_GRASS_BLOCK = REGISTRY.register("manic_grass_block", ManicGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_LAVA = REGISTRY.register("manic_lava", ManicLavaFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_LEAVES = REGISTRY.register("manic_leaves", ManicLeavesFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_ROOF_BLOCK = REGISTRY.register("manic_roof_block", ManicRoofBlockFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_STONE_BLOCK = REGISTRY.register("manic_stone_block", ManicStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_WATER = REGISTRY.register("manic_water", ManicWaterFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_WOOD_PLANKS = REGISTRY.register("manic_wood_planks", ManicWoodPlanksFeature::new);
	public static final RegistryObject<Feature<?>> SOME_WHITE_CYLINDER = REGISTRY.register("some_white_cylinder", SomeWhiteCylinderFeature::new);
	public static final RegistryObject<Feature<?>> HEROBRINE_NETHERRACK_GLOW = REGISTRY.register("herobrine_netherrack_glow", HerobrineNetherrackGlowFeature::new);
	public static final RegistryObject<Feature<?>> MANIC_GRASS_ONLY = REGISTRY.register("manic_grass_only", ManicGrassOnlyFeature::new);
}
