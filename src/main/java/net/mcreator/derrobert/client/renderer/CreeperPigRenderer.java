
package net.mcreator.derrobert.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.derrobert.entity.CreeperPigEntity;

public class CreeperPigRenderer extends MobRenderer<CreeperPigEntity, PigModel<CreeperPigEntity>> {
	public CreeperPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperPigEntity entity) {
		return new ResourceLocation("der_robert:textures/entities/creeper_pig.png");
	}
}
