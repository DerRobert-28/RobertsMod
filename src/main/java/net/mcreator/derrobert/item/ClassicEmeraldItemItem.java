
package net.mcreator.derrobert.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClassicEmeraldItemItem extends Item {
	public ClassicEmeraldItemItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
