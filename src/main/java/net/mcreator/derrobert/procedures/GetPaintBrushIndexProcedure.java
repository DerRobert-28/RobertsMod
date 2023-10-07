package net.mcreator.derrobert.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.derrobert.init.DerRobertModItems;

public class GetPaintBrushIndexProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		ItemStack currentItem = ItemStack.EMPTY;
		currentItem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_0.get()) {
			return 1;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_1.get()) {
			return 2;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_2.get()) {
			return 3;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_3.get()) {
			return 4;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_4.get()) {
			return 5;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_5.get()) {
			return 6;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_6.get()) {
			return 7;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_7.get()) {
			return 8;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_8.get()) {
			return 9;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_9.get()) {
			return 10;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_10.get()) {
			return 11;
		}
		if (currentItem.getItem() == DerRobertModItems.PLASTIC_PAINT_BRUSH_11.get()) {
			return 12;
		}
		return 0;
	}
}
