
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.derrobert.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.derrobert.entity.TracyMoodalieEntity;
import net.mcreator.derrobert.entity.TemplateHumanEntity;
import net.mcreator.derrobert.entity.SonKiEntity;
import net.mcreator.derrobert.entity.PiggyCreeperEntity;
import net.mcreator.derrobert.entity.NotchEntity;
import net.mcreator.derrobert.entity.GronkhEntity;
import net.mcreator.derrobert.entity.EvilHerobrineEntity;
import net.mcreator.derrobert.entity.EpixKevEntity;
import net.mcreator.derrobert.entity.CreeperPigEntity;
import net.mcreator.derrobert.entity.ClassicZombiePigmanEntity;
import net.mcreator.derrobert.entity.ClassicZombieEntity;
import net.mcreator.derrobert.entity.ClassicPigmanEntity;
import net.mcreator.derrobert.entity.ClassicHumanEntity;
import net.mcreator.derrobert.entity.ClassicHerobrineEntity;
import net.mcreator.derrobert.entity.AlphaCreeperEntity;
import net.mcreator.derrobert.DerRobertMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DerRobertModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DerRobertMod.MODID);
	public static final RegistryObject<EntityType<ClassicHerobrineEntity>> CLASSIC_HEROBRINE = register("classic_herobrine", EntityType.Builder.<ClassicHerobrineEntity>of(ClassicHerobrineEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClassicHerobrineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClassicHumanEntity>> CLASSIC_HUMAN = register("classic_human",
			EntityType.Builder.<ClassicHumanEntity>of(ClassicHumanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClassicHumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClassicZombieEntity>> CLASSIC_ZOMBIE = register("classic_zombie",
			EntityType.Builder.<ClassicZombieEntity>of(ClassicZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClassicZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CreeperPigEntity>> CREEPER_PIG = register("creeper_pig",
			EntityType.Builder.<CreeperPigEntity>of(CreeperPigEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreeperPigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<EpixKevEntity>> EPIX_KEV = register("epix_kev",
			EntityType.Builder.<EpixKevEntity>of(EpixKevEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpixKevEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvilHerobrineEntity>> EVIL_HEROBRINE = register("evil_herobrine", EntityType.Builder.<EvilHerobrineEntity>of(EvilHerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilHerobrineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronkhEntity>> GRONKH = register("gronkh",
			EntityType.Builder.<GronkhEntity>of(GronkhEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronkhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PiggyCreeperEntity>> PIGGY_CREEPER = register("piggy_creeper",
			EntityType.Builder.<PiggyCreeperEntity>of(PiggyCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PiggyCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<SonKiEntity>> SON_KI = register("son_ki",
			EntityType.Builder.<SonKiEntity>of(SonKiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SonKiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TemplateHumanEntity>> TEMPLATE_HUMAN = register("template_human",
			EntityType.Builder.<TemplateHumanEntity>of(TemplateHumanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TemplateHumanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TracyMoodalieEntity>> TRACY_MOODALIE = register("tracy_moodalie",
			EntityType.Builder.<TracyMoodalieEntity>of(TracyMoodalieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TracyMoodalieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlphaCreeperEntity>> ALPHA_CREEPER = register("alpha_creeper",
			EntityType.Builder.<AlphaCreeperEntity>of(AlphaCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlphaCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<NotchEntity>> NOTCH = register("notch",
			EntityType.Builder.<NotchEntity>of(NotchEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NotchEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClassicPigmanEntity>> CLASSIC_PIGMAN = register("classic_pigman",
			EntityType.Builder.<ClassicPigmanEntity>of(ClassicPigmanEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClassicPigmanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClassicZombiePigmanEntity>> CLASSIC_ZOMBIE_PIGMAN = register("classic_zombie_pigman", EntityType.Builder.<ClassicZombiePigmanEntity>of(ClassicZombiePigmanEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClassicZombiePigmanEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ClassicHerobrineEntity.init();
			ClassicHumanEntity.init();
			ClassicZombieEntity.init();
			CreeperPigEntity.init();
			EpixKevEntity.init();
			EvilHerobrineEntity.init();
			GronkhEntity.init();
			PiggyCreeperEntity.init();
			SonKiEntity.init();
			TemplateHumanEntity.init();
			TracyMoodalieEntity.init();
			AlphaCreeperEntity.init();
			NotchEntity.init();
			ClassicPigmanEntity.init();
			ClassicZombiePigmanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CLASSIC_HEROBRINE.get(), ClassicHerobrineEntity.createAttributes().build());
		event.put(CLASSIC_HUMAN.get(), ClassicHumanEntity.createAttributes().build());
		event.put(CLASSIC_ZOMBIE.get(), ClassicZombieEntity.createAttributes().build());
		event.put(CREEPER_PIG.get(), CreeperPigEntity.createAttributes().build());
		event.put(EPIX_KEV.get(), EpixKevEntity.createAttributes().build());
		event.put(EVIL_HEROBRINE.get(), EvilHerobrineEntity.createAttributes().build());
		event.put(GRONKH.get(), GronkhEntity.createAttributes().build());
		event.put(PIGGY_CREEPER.get(), PiggyCreeperEntity.createAttributes().build());
		event.put(SON_KI.get(), SonKiEntity.createAttributes().build());
		event.put(TEMPLATE_HUMAN.get(), TemplateHumanEntity.createAttributes().build());
		event.put(TRACY_MOODALIE.get(), TracyMoodalieEntity.createAttributes().build());
		event.put(ALPHA_CREEPER.get(), AlphaCreeperEntity.createAttributes().build());
		event.put(NOTCH.get(), NotchEntity.createAttributes().build());
		event.put(CLASSIC_PIGMAN.get(), ClassicPigmanEntity.createAttributes().build());
		event.put(CLASSIC_ZOMBIE_PIGMAN.get(), ClassicZombiePigmanEntity.createAttributes().build());
	}
}
