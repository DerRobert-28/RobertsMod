package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.init.DerRobertModItems;
import net.mcreator.derrobert.init.DerRobertModBlocks;

public class OnPlasticPaintBrushProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_0.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_0.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_1.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_1.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_2.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_2.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_3.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_3.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_4.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_4.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_5.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_5.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_6.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_6.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_7.get()) {
			world.setBlock(BlockPos.containing(x, y, z), DerRobertModBlocks.PLASTIC_BRICK_7.get().defaultBlockState(), 3);
		}
	}
}
