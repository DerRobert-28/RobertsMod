package net.mcreator.derrobert.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModBlocks;
import net.mcreator.derrobert.DerRobertMod;

public class Tnt100IgnitionProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.tnt.primed")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.CLASSIC_TNT_IGNITED.get().defaultBlockState(), 3);
		DerRobertMod.queueServerWork(10, () -> {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.TNT_100_BLOCK.get().defaultBlockState(), 3);
			DerRobertMod.queueServerWork(10, () -> {
				world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.CLASSIC_TNT_IGNITED.get().defaultBlockState(), 3);
				DerRobertMod.queueServerWork(10, () -> {
					world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.TNT_100_BLOCK.get().defaultBlockState(), 3);
					DerRobertMod.queueServerWork(10, () -> {
						world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.CLASSIC_TNT_IGNITED.get().defaultBlockState(), 3);
						DerRobertMod.queueServerWork(10, () -> {
							world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.TNT_100_BLOCK.get().defaultBlockState(), 3);
							DerRobertMod.queueServerWork(10, () -> {
								world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.CLASSIC_TNT_IGNITED.get().defaultBlockState(), 3);
								DerRobertMod.queueServerWork(10, () -> {
									world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.TNT_100_BLOCK.get().defaultBlockState(), 3);
									DerRobertMod.queueServerWork(10, () -> {
										world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.CLASSIC_TNT_IGNITED.get().defaultBlockState(), 3);
										DerRobertMod.queueServerWork(10, () -> {
											world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.TNT_100_BLOCK.get().defaultBlockState(), 3);
											DerRobertMod.queueServerWork(10, () -> {
												Tnt100ExplodeProcProcedure.execute(world, x, y, z);
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
