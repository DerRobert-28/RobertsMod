
package net.mcreator.derrobert.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.derrobert.entity.AlphaCreeperEntity;

public class AlphaCreeperRenderer extends MobRenderer<AlphaCreeperEntity, CreeperModel<AlphaCreeperEntity>> {
	public AlphaCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlphaCreeperEntity entity) {
		return new ResourceLocation("der_robert:textures/entities/alpha_creeper.png");
	}
}
