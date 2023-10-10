package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModBlocks;

public class OnDimensionChangeProcedureProcedure {
	public static void execute(LevelAccessor world) {
		double ix = 0;
		double iy = 0;
		double iz = 0;
		ix = -3;
		while (ix <= 3) {
			iy = -3;
			while (iy <= 3) {
				iz = -3;
				while (iz <= 3) {
					world.setBlock(BlockPos.containing(ix, iy, iz), DerRobertModBlocks.CLASSIC_GLASS_BLOCK.get().defaultBlockState(), 3);
					iz = iz + 1;
				}
				iy = iy + 1;
			}
			ix = ix + 1;
		}
		ix = -2;
		while (ix <= 2) {
			iy = -2;
			while (iy <= 2) {
				iz = -2;
				while (iz <= 2) {
					world.setBlock(BlockPos.containing(ix, iy, iz), Blocks.AIR.defaultBlockState(), 3);
					iz = iz + 1;
				}
				iy = iy + 1;
			}
			ix = ix + 1;
		}
	}
}
