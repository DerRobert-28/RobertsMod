package net.mcreator.derrobert.procedures;

import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetSeedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		double theSeed = 0;
		boolean success = false;
		theSeed = Math.round(DoubleArgumentType.getDouble(arguments, "0"));
	}
}
