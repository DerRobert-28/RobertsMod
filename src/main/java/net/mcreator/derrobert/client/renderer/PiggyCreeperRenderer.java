
package net.mcreator.derrobert.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.derrobert.entity.PiggyCreeperEntity;

public class PiggyCreeperRenderer extends MobRenderer<PiggyCreeperEntity, CreeperModel<PiggyCreeperEntity>> {
	public PiggyCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PiggyCreeperEntity entity) {
		return new ResourceLocation("der_robert:textures/entities/piggy_creeper.png");
	}
}
