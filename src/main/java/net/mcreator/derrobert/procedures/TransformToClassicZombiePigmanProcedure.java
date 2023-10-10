package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModEntities;

public class TransformToClassicZombiePigmanProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xPos = 0;
		double yPos = 0;
		double zPos = 0;
		if (!entity.level().isClientSide())
			entity.discard();
		xPos = entity.getX();
		yPos = entity.getY();
		zPos = entity.getZ();
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DerRobertModEntities.CLASSIC_ZOMBIE_PIGMAN.get().spawn(_level, BlockPos.containing(xPos, yPos, zPos), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
			}
		}
	}
}
