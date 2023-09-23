
package net.mcreator.derrobert.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class ClassicDirtTriangleBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ClassicDirtTriangleBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(0.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 1, 16, 2, 16), box(0, 2, 2, 16, 3, 16), box(0, 3, 3, 16, 4, 16), box(0, 4, 4, 16, 5, 16), box(0, 5, 5, 16, 6, 16), box(0, 6, 6, 16, 7, 16), box(0, 7, 7, 16, 8, 16),
					box(0, 8, 8, 16, 9, 16), box(0, 9, 9, 16, 10, 16), box(0, 10, 10, 16, 11, 16), box(0, 11, 11, 16, 12, 16), box(0, 12, 12, 16, 13, 16), box(0, 13, 13, 16, 14, 16), box(0, 14, 14, 16, 15, 16), box(0, 15, 15, 16, 16, 16));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 16, 2, 15), box(0, 2, 0, 16, 3, 14), box(0, 3, 0, 16, 4, 13), box(0, 4, 0, 16, 5, 12), box(0, 5, 0, 16, 6, 11), box(0, 6, 0, 16, 7, 10), box(0, 7, 0, 16, 8, 9),
					box(0, 8, 0, 16, 9, 8), box(0, 9, 0, 16, 10, 7), box(0, 10, 0, 16, 11, 6), box(0, 11, 0, 16, 12, 5), box(0, 12, 0, 16, 13, 4), box(0, 13, 0, 16, 14, 3), box(0, 14, 0, 16, 15, 2), box(0, 15, 0, 16, 16, 1));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 0, 16, 2, 16), box(2, 2, 0, 16, 3, 16), box(3, 3, 0, 16, 4, 16), box(4, 4, 0, 16, 5, 16), box(5, 5, 0, 16, 6, 16), box(6, 6, 0, 16, 7, 16), box(7, 7, 0, 16, 8, 16),
					box(8, 8, 0, 16, 9, 16), box(9, 9, 0, 16, 10, 16), box(10, 10, 0, 16, 11, 16), box(11, 11, 0, 16, 12, 16), box(12, 12, 0, 16, 13, 16), box(13, 13, 0, 16, 14, 16), box(14, 14, 0, 16, 15, 16), box(15, 15, 0, 16, 16, 16));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(0, 1, 0, 15, 2, 16), box(0, 2, 0, 14, 3, 16), box(0, 3, 0, 13, 4, 16), box(0, 4, 0, 12, 5, 16), box(0, 5, 0, 11, 6, 16), box(0, 6, 0, 10, 7, 16), box(0, 7, 0, 9, 8, 16),
					box(0, 8, 0, 8, 9, 16), box(0, 9, 0, 7, 10, 16), box(0, 10, 0, 6, 11, 16), box(0, 11, 0, 5, 12, 16), box(0, 12, 0, 4, 13, 16), box(0, 13, 0, 3, 14, 16), box(0, 14, 0, 2, 15, 16), box(0, 15, 0, 1, 16, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof ShovelItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
