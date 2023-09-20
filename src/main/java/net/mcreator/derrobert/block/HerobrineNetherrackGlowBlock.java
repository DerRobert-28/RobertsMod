
package net.mcreator.derrobert.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.derrobert.procedures.KillAllHerobrineEntitiesProcedure;
import net.mcreator.derrobert.procedures.HerobrineBlockDeactivateProcedure;

import java.util.List;
import java.util.Collections;

public class HerobrineNetherrackGlowBlock extends Block {
	public HerobrineNetherrackGlowBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(-1, 3600000).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			KillAllHerobrineEntitiesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		} else {
			HerobrineBlockDeactivateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}
