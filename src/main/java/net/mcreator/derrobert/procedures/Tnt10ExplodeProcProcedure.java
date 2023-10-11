package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class Tnt10ExplodeProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double index = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		index = 0;
		while (index <= 10) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), y, z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), y, z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y + index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y - index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y + index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y + index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y - index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y - index), z, 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), y, (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), y, (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), y, (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), y, (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y + index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y - index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y + index), (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, (y - index), (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y + index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y + index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y - index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y - index), (z + index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y + index), (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y + index), (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + index), (y - index), (z - index), 4, Level.ExplosionInteraction.TNT);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - index), (y - index), (z - index), 4, Level.ExplosionInteraction.TNT);
			index = index + 1;
		}
	}
}
