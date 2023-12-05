/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gemmagics.item.WitherGemItem;
import net.mcreator.gemmagics.item.WeaknessGemItem;
import net.mcreator.gemmagics.item.WaterBreathingGemItem;
import net.mcreator.gemmagics.item.StrengthGemItem;
import net.mcreator.gemmagics.item.SpeedGemItem;
import net.mcreator.gemmagics.item.SlownessGemItem;
import net.mcreator.gemmagics.item.SlowFallingGemItem;
import net.mcreator.gemmagics.item.SaturationGemItem;
import net.mcreator.gemmagics.item.ResistanceGemItem;
import net.mcreator.gemmagics.item.RegenerationGemItem;
import net.mcreator.gemmagics.item.PoisonGemItem;
import net.mcreator.gemmagics.item.NightVisionGemItem;
import net.mcreator.gemmagics.item.NauseaGemItem;
import net.mcreator.gemmagics.item.MiningFatigueGemItem;
import net.mcreator.gemmagics.item.LuckGemItem;
import net.mcreator.gemmagics.item.LevitationGemItem;
import net.mcreator.gemmagics.item.JumpBoostGemItem;
import net.mcreator.gemmagics.item.InvisibilityGemItem;
import net.mcreator.gemmagics.item.InstantHealthGemItem;
import net.mcreator.gemmagics.item.InstantDamageGemItem;
import net.mcreator.gemmagics.item.HungerGemItem;
import net.mcreator.gemmagics.item.HealthBoostGemItem;
import net.mcreator.gemmagics.item.HasteGemItem;
import net.mcreator.gemmagics.item.GlowingGemItem;
import net.mcreator.gemmagics.item.FireResistanceGemItem;
import net.mcreator.gemmagics.item.DolphinGemItem;
import net.mcreator.gemmagics.item.DarknessGemItem;
import net.mcreator.gemmagics.item.ConduitGemItem;
import net.mcreator.gemmagics.item.BlindnessGemItem;
import net.mcreator.gemmagics.item.BadLuckGemItem;
import net.mcreator.gemmagics.item.AbsorptionGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item HASTE_GEM;
	public static Item DOLPHIN_GEM;
	public static Item WITHER_GEM;
	public static Item CONDUIT_GEM;
	public static Item WEAKNESS_GEM;
	public static Item WATER_BREATHING_GEM;
	public static Item STRENGTH_GEM;
	public static Item HUNGER_GEM;
	public static Item SPEED_GEM;
	public static Item SLOWNESS_GEM;
	public static Item HEALTH_BOOST_GEM;
	public static Item SLOW_FALLING_GEM;
	public static Item SATURATION_GEM;
	public static Item RESISTANCE_GEM;
	public static Item REGENERATION_GEM;
	public static Item LEVITATION_GEM;
	public static Item POISON_GEM;
	public static Item LUCK_GEM;
	public static Item NIGHT_VISION_GEM;
	public static Item BAD_LUCK_GEM;
	public static Item NAUSEA_GEM;
	public static Item MINING_FATIGUE_GEM;
	public static Item DARKNESS_GEM;
	public static Item BLINDNESS_GEM;
	public static Item ABSORPTION_GEM;
	public static Item FIRE_RESISTANCE_GEM;
	public static Item GLOWING_GEM;
	public static Item INSTANT_DAMAGE_GEM;
	public static Item INSTANT_HEALTH_GEM;
	public static Item INVISIBILITY_GEM;
	public static Item JUMP_BOOST_GEM;

	public static void load() {
		HASTE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "haste_gem"), new HasteGemItem());
		DOLPHIN_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "dolphin_gem"), new DolphinGemItem());
		WITHER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "wither_gem"), new WitherGemItem());
		CONDUIT_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "conduit_gem"), new ConduitGemItem());
		WEAKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "weakness_gem"), new WeaknessGemItem());
		WATER_BREATHING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "water_breathing_gem"), new WaterBreathingGemItem());
		STRENGTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "strength_gem"), new StrengthGemItem());
		HUNGER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "hunger_gem"), new HungerGemItem());
		SPEED_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "speed_gem"), new SpeedGemItem());
		SLOWNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slowness_gem"), new SlownessGemItem());
		HEALTH_BOOST_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "health_boost_gem"), new HealthBoostGemItem());
		SLOW_FALLING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slow_falling_gem"), new SlowFallingGemItem());
		SATURATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "saturation_gem"), new SaturationGemItem());
		RESISTANCE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "resistance_gem"), new ResistanceGemItem());
		REGENERATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "regeneration_gem"), new RegenerationGemItem());
		LEVITATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "levitation_gem"), new LevitationGemItem());
		POISON_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "poison_gem"), new PoisonGemItem());
		LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "luck_gem"), new LuckGemItem());
		NIGHT_VISION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "night_vision_gem"), new NightVisionGemItem());
		BAD_LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "bad_luck_gem"), new BadLuckGemItem());
		NAUSEA_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "nausea_gem"), new NauseaGemItem());
		MINING_FATIGUE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "mining_fatigue_gem"), new MiningFatigueGemItem());
		DARKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "darkness_gem"), new DarknessGemItem());
		BLINDNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "blindness_gem"), new BlindnessGemItem());
		ABSORPTION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorption_gem"), new AbsorptionGemItem());
		FIRE_RESISTANCE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "fire_resistance_gem"), new FireResistanceGemItem());
		GLOWING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "glowing_gem"), new GlowingGemItem());
		INSTANT_DAMAGE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "instant_damage_gem"), new InstantDamageGemItem());
		INSTANT_HEALTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "instant_health_gem"), new InstantHealthGemItem());
		INVISIBILITY_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "invisibility_gem"), new InvisibilityGemItem());
		JUMP_BOOST_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "jump_boost_gem"), new JumpBoostGemItem());
	}

	public static void clientLoad() {
	}
}
