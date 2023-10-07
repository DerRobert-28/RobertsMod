package net.mcreator.derrobert.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModBlocks;

public class GetPlasticTypeProcedure {
	public static BlockState execute(LevelAccessor world, double x, double y, double z) {
		String blockTypeStr = "";
		BlockState blockType = Blocks.AIR.defaultBlockState();
		blockType = (world.getBlockState(BlockPos.containing(x, y, z)));
		blockTypeStr = ForgeRegistries.BLOCKS.getKey(blockType.getBlock()).toString();
		blockTypeStr = (blockTypeStr).toLowerCase();
		if (blockTypeStr.contains("plastic")) {
			if (blockTypeStr.contains("brick")) {
				return DerRobertModBlocks.PLASTIC_BRICK_WHITE.get().defaultBlockState();
			} else if (blockTypeStr.contains("door")) {
				return DerRobertModBlocks.PLASTIC_DOOR_WHITE.get().defaultBlockState();
			} else if (blockTypeStr.contains("pane")) {
				return DerRobertModBlocks.PLASTIC_PANE_WHITE.get().defaultBlockState();
			} else if (blockTypeStr.contains("slab")) {
				return DerRobertModBlocks.PLASTIC_SLABS_WHITE.get().defaultBlockState();
			} else if (blockTypeStr.contains("stair")) {
				return DerRobertModBlocks.PLASTIC_STAIRS_WHITE.get().defaultBlockState();
			} else if (blockTypeStr.contains("wall")) {
				return DerRobertModBlocks.PLASTIC_WALLS_WHITE.get().defaultBlockState();
			}
		}
		return blockType;
	}
}
