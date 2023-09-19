package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModBlocks;

public class NetherReactorCoreBlueToRedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.NETHER_REACTOR_CORE_RED.get().defaultBlockState(), 3);
	}
}
