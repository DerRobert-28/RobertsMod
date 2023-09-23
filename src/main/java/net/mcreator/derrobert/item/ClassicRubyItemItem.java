
package net.mcreator.derrobert.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClassicRubyItemItem extends Item {
	public ClassicRubyItemItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
