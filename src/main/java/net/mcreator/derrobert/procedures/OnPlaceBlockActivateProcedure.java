package net.mcreator.derrobert.procedures;


import der.robert.Custom.BlockWorldUtils;
import net.mcreator.derrobert.init.DerRobertModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;


public class OnPlaceBlockActivateProcedure
{
	private static BlockWorldUtils world;


	public static boolean execute(LevelAccessor level, double x, double y, double z)
	{
		world = BlockWorldUtils.of(level).at(x, y, z);
		Direction _placeDir = world.getDirection();
		//
		BlockPos _behind = world.getBackwardBlock();
		BlockPos _front = world.getForwardBlock();

		if(world.isFilled(_front))
		{
			return false;
		}

		BlockState _testBlock1 = DerRobertModBlocks.INTERNAL_UPDATE_BLOCK.get().defaultBlockState();
		world.setBlock(_testBlock1, _front);

		return true;
	}

}
		
		
		
//		BlockState _testBlock1 = DerRobertModBlocks.PLASTIC_BRICK_0.get().defaultBlockState();
//		BlockState _testBlock2 = DerRobertModBlocks.PLASTIC_BRICK_2.get().defaultBlockState();
//		//
//		world.setBlock(_testBlock1, _front);
//		world.setBlock(_testBlock2, _behind);

//		world.setBlock(
//			BWU.getBlockPos(_fx, _fy, _fz),
//			DerRobertModBlocks.PLASTIC_BRICK_0.get().defaultBlockState(),
//			3
//		);
//
		
//		double bz = 0;
//		double index = 0;
//		double maxCount = 0;
//		double fx = 0;
//		double fy = 0;
//		double fz = 0;
//		ItemStack currentItem = ItemStack.EMPTY;
//		BlockState testIfAir = Blocks.AIR.defaultBlockState();
//		boolean testIfAirResult = false;
//		boolean blockIsFree = false;
//		boolean alreadyBlock = false;
////		Direction placeDir = Direction.NORTH;
//		{
//			BlockPos _bp = BlockPos.containing(x, y, z);
//			BlockState _bs = DerRobertModBlocks.PLACE_BLOCK_ON.get().defaultBlockState();
//			BlockState _bso = world.getBlockState(_bp);
//			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
//				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
//				if (_property != null && _bs.getValue(_property) != null)
//					try {
//						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
//					} catch (Exception e) {
//					}
//			}
//			world.setBlock(_bp, _bs, 3);
//		}
//		BlockWorldUtils bwu = BlockWorldUtils.of(world);
//		placeDir = new Object() {
//			public Direction getDirection(BlockPos pos) {
//				BlockState _bs = world.getBlockState(pos);
//				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
//				if (property != null && _bs.getValue(property) instanceof Direction _dir)
//					return _dir;
//				else if (_bs.hasProperty(BlockStateProperties.AXIS))
//					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
//				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
//					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
//				return Direction.NORTH;
//			}
//		}.getDirection(BlockPos.containing(x, y, z));
//		bx = bwu.backwardFromX(placeDir, x);;
//		by = bwu.backwardFromY(placeDir, y);;
//		fx = bwu.forwardFromX(placeDir, x);;
//		fy = bwu.forwardFromY(placeDir, y);;
//		fz = bwu.forwardFromZ(placeDir, z);;
//		world.setBlock(BlockPos.containing(bx, by, bz), DerRobertModBlocks.PLASTIC_BRICK_0.get().defaultBlockState(), 3);

