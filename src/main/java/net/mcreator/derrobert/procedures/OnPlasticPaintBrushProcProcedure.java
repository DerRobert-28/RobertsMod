package net.mcreator.derrobert.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class OnPlasticPaintBrushProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double paintBrushType = 0;
		String blockName = "";
		String paintBrushTypeStr = "";
		BlockState paintedBlock = Blocks.AIR.defaultBlockState();
		BlockState blockType = Blocks.AIR.defaultBlockState();
		if (!OnGlassPaintBrushProcProcedure.execute(world, x, y, z)) {
			paintBrushType = GetPaintBrushIndexProcedure.execute(entity);
			paintBrushType = paintBrushType - 1;
			paintBrushTypeStr = new java.text.DecimalFormat("##").format(paintBrushType);
			blockType = GetPlasticTypeProcedure.execute(world, x, y, z);
			blockName = ForgeRegistries.BLOCKS.getKey(blockType.getBlock()).toString();
			blockName = blockName.replace("white", paintBrushTypeStr);
			paintedBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation((blockName).toLowerCase(java.util.Locale.ENGLISH))).defaultBlockState();
			if ((ForgeRegistries.BLOCKS.getKey(paintedBlock.getBlock()).toString()).contains("plastic")) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = paintedBlock;
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
			}
		}
	}
}
