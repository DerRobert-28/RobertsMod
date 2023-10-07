package net.mcreator.derrobert.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GetRandomBlockProcedure {
	public static String execute() {
		String blockStr = "";
		String localLetters = "";
		String zeichen = "";
		double blockId = 0;
		double blockLength = 0;
		double index = 0;
		double index1 = 0;
		blockId = Mth.nextInt(RandomSource.create(), 0, 3);
		if (blockId == 0) {
			blockStr = "air";
		} else if (blockId == 1) {
			blockStr = "bedrock";
		} else if (blockId == 2) {
			blockStr = "cobblestone";
		} else if (blockId == 3) {
			blockStr = "dirt";
		}
		return "minecraft:" + blockStr;
	}
}
