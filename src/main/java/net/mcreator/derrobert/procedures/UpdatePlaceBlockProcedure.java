package net.mcreator.derrobert.procedures;
//
//	CUSTOM
//
import der.robert.Custom.BlockWorldUtils;
//
//	MCREATOR
//
import net.mcreator.derrobert.init.DerRobertModBlocks;
//
//	MINECRAFT
//
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;


public class UpdatePlaceBlockProcedure
{
	private static BlockWorldUtils world;
	private static final DerRobertModBlocks robert = new DerRobertModBlocks();

	public static boolean execute(LevelAccessor level, double x, double y, double z)
 
	{
		world = BlockWorldUtils.of(level).at(x, y, z);
		//
		BlockPos _behind = world.getBlockBehind();
		BlockPos _front = world.getBlockInFront();
		ItemStack _stack = ItemStack.EMPTY;
		//
		if(world.isFilled(_front)) return false;
		if(world.isEmpty(_behind)) return false;
		//
		int _slotCnt = world.getSlotCount(_behind);
		if(_slotCnt == 0) return false;
		//
		int _slotPos = -1;
		for(int i = 0; i < _slotCnt; i++) {
			_stack = world.getStack(_behind, i);
			if(_stack == ItemStack.EMPTY) continue;
			_slotPos = i;
			break;
		}
		if(_slotPos < 0) return false;
		//
		BlockState _block = world.convertToState(_stack);
		boolean _removed = world.removeStack(_behind, _slotPos, 1);
		if(_removed) world.setBlock(_front, _block);
		return _removed;
	}
}
