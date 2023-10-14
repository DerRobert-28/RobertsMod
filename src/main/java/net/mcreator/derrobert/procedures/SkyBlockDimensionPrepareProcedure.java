package net.mcreator.derrobert.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.derrobert.DerRobertMod;

public class SkyBlockDimensionPrepareProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		DerRobertMod.queueServerWork(20, () -> {
			if (entity instanceof Player _player)
				_player.getInventory().clearContent();
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
			{
				Entity _ent = entity;
				_ent.teleportTo(0, 1000, 0);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(0, 1000, 0, _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().flying = true;
				_player.onUpdateAbilities();
			}
			DerRobertMod.queueServerWork(20, () -> {
				world.setBlock(new BlockPos(10000, 100, 10000), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(10000, 101, 10000), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(4, 69, 0), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill ~-10 ~-10 ~-10 ~10 ~10 ~10 minecraft:air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"fill -10 60 -10 10 80 10 minecraft:air");
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 20, Level.ExplosionInteraction.TNT);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, 0, 60, 0, 20, Level.ExplosionInteraction.TNT);
				DerRobertMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 66 -1 4 67 1 minecraft:dirt");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 66 -1 1 67 4 minecraft:dirt");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 68 -1 4 68 1 minecraft:grass_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 68 -1 1 68 4 minecraft:grass_block");
					{
						Entity _ent = entity;
						_ent.teleportTo(0, 69, 0);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(0, 69, 0, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), new BlockPos(0, 69, 0), _serverPlayer.getYRot(), true, false);
					world.setBlock(new BlockPos(0, 66, 0), Blocks.BEDROCK.defaultBlockState(), 3);
					world.setBlock(new BlockPos(3, 67, 0), Blocks.SAND.defaultBlockState(), 3);
					world.setBlock(new BlockPos(0, 67, 0), Blocks.SAND.defaultBlockState(), 3);
					world.setBlock(new BlockPos(0, 67, 3), Blocks.SAND.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 69 4 -1 72 4 minecraft:oak_log");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -3 71 3 1 71 5 minecraft:oak_leaves");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -2 71 2 0 71 6 minecraft:oak_leaves");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -3 72 2 1 72 6 minecraft:oak_leaves");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill 0 73 5 -2 73 3 minecraft:oak_leaves");
					world.setBlock(new BlockPos(-1, 74, 4), Blocks.OAK_LEAVES.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"fill -1 69 4 -1 72 4 minecraft:oak_log");
					DerRobertMod.queueServerWork(20, () -> {
						world.setBlock(new BlockPos(10000, 100, 10000), Blocks.BEDROCK.defaultBlockState(), 3);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock 10000 101 10000 chest" + "{Items:[" + "{id:\"der_robert:classic_endstone_block\",Slot:0,Count:14}," + "{id:\"der_robert:sky_block_dimension\",Slot:1,Count:1}" + "]}"));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock 4 69 0 chest" + "[facing=west]" + "{Items:[" + "{id:\"string\",Slot:0,Count:12}," + "{id:\"lava_bucket\",Slot:1,Count:1}," + "{id:\"bone\",Slot:2,Count:1}," + "{id:\"sugar_cane\",Slot:3,Count:1},"
											+ "{id:\"red_mushroom\",Slot:9,Count:1}," + "{id:\"ice\",Slot:10,Count:2}," + "{id:\"pumpkin_seeds\",Slot:11,Count:1}," + "{id:\"brown_mushroom\",Slot:18,Count:1}," + "{id:\"melon_slice\",Slot:19,Count:1},"
											+ "{id:\"cactus\",Slot:20,Count:1}" + "]}"));
						if (entity instanceof ServerPlayer _player)
							_player.setGameMode(GameType.SURVIVAL);
					});
				});
			});
		});
	}
}
