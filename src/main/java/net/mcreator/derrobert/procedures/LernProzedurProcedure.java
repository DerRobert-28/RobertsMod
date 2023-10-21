package net.mcreator.derrobert.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class LernProzedurProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack itemTest = ItemStack.EMPTY;
		BlockState blockTest = Blocks.AIR.defaultBlockState();
		// LERN-PROZDUR FÜR EIGENEN MINECRAFT-MOD-CODE
		itemTest = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0));
		blockTest = (itemTest.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
		world.setBlock(BlockPos.containing(x, y, z), blockTest, 3);
	}
}
