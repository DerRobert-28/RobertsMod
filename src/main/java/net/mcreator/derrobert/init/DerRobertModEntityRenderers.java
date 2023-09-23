
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.derrobert.client.renderer.TemplateHumanRenderer;
import net.mcreator.derrobert.client.renderer.PiggyCreeperRenderer;
import net.mcreator.derrobert.client.renderer.EvilHerobrineRenderer;
import net.mcreator.derrobert.client.renderer.CreeperPigRenderer;
import net.mcreator.derrobert.client.renderer.ClassicZombieRenderer;
import net.mcreator.derrobert.client.renderer.ClassicHumanRenderer;
import net.mcreator.derrobert.client.renderer.ClassicHerobrineRenderer;
import net.mcreator.derrobert.client.renderer.AlphaCreeperRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DerRobertModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DerRobertModEntities.CLASSIC_HEROBRINE.get(), ClassicHerobrineRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.CLASSIC_HUMAN.get(), ClassicHumanRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.CLASSIC_ZOMBIE.get(), ClassicZombieRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.CREEPER_PIG.get(), CreeperPigRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.EVIL_HEROBRINE.get(), EvilHerobrineRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.PIGGY_CREEPER.get(), PiggyCreeperRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.TEMPLATE_HUMAN.get(), TemplateHumanRenderer::new);
		event.registerEntityRenderer(DerRobertModEntities.ALPHA_CREEPER.get(), AlphaCreeperRenderer::new);
	}
}
