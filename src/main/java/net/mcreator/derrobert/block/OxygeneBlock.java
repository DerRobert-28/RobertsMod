
package net.mcreator.derrobert.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class OxygeneBlock extends Block {
	public OxygeneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(0.5f).noCollission().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
