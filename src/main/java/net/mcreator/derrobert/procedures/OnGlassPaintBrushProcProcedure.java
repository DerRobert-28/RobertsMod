package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModBlocks;

import java.util.Map;

public class OnGlassPaintBrushProcProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		BlockState blockType = Blocks.AIR.defaultBlockState();
		blockType = (world.getBlockState(BlockPos.containing(x, y, z)));
		if (blockType.getBlock() == DerRobertModBlocks.CLASSIC_GLASS_BLOCK.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_BRICK_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		} else if (blockType.getBlock() == DerRobertModBlocks.GLASS_SLABS.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_SLABS_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		} else if (blockType.getBlock() == DerRobertModBlocks.GLASS_STAIRS.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_STAIRS_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		} else if (blockType.getBlock() == DerRobertModBlocks.CLASSIC_GLASS_WALL.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_WALLS_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		} else if (blockType.getBlock() == DerRobertModBlocks.GLASS_DOOR.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_DOOR_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		} else if (blockType.getBlock() == DerRobertModBlocks.CLASSIC_GLASS_PANE.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DerRobertModBlocks.PLASTIC_PANE_WHITE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			return true;
		}
		return false;
	}
}
