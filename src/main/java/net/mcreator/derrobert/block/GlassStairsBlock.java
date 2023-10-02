
package net.mcreator.derrobert.block;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.procedures.HowToCreatePlasticStairsProcedure;
import net.mcreator.derrobert.procedures.ClassicGlassBreakProcProcedure;

public class GlassStairsBlock extends StairBlock {
	public GlassStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).strength(0.5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape().noLootTable());
	}

	@Override
	public float getExplosionResistance() {
		return 0.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		ClassicGlassBreakProcProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		ClassicGlassBreakProcProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
		super.attack(blockstate, world, pos, entity);
		HowToCreatePlasticStairsProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
