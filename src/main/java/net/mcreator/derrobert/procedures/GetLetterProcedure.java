package net.mcreator.derrobert.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.derrobert.network.DerRobertModVariables;

public class GetLetterProcedure {
	public static String execute(LevelAccessor world) {
		double code = 0;
		String localLetters = "";
		code = DerRobertModVariables.WorldVariables.get(world).GetLetterArgument;
		localLetters = "_abcdefghijklmnopqrstuvwxyz";
		if (code < 0) {
			return "?";
		} else if (code > 26) {
			return "?";
		}
		return localLetters.substring((int) code, (int) code);
	}
}
