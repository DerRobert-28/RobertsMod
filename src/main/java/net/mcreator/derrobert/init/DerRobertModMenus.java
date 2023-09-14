
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.derrobert.world.inventory.ClassicWorkbenchGUIMenu;
import net.mcreator.derrobert.DerRobertMod;

public class DerRobertModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DerRobertMod.MODID);
	public static final RegistryObject<MenuType<ClassicWorkbenchGUIMenu>> CLASSIC_WORKBENCH_GUI = REGISTRY.register("classic_workbench_gui", () -> IForgeMenuType.create(ClassicWorkbenchGUIMenu::new));
}
