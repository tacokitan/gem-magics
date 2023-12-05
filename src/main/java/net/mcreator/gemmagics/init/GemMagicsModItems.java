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
import net.mcreator.gemmagics.item.JumpGemItem;
import net.mcreator.gemmagics.item.InvisGemItem;
import net.mcreator.gemmagics.item.InstaHealthGemItem;
import net.mcreator.gemmagics.item.InstaDamageGemItem;
import net.mcreator.gemmagics.item.HungerGemItem;
import net.mcreator.gemmagics.item.HealthBoostGemItem;
import net.mcreator.gemmagics.item.HasteGemItem;
import net.mcreator.gemmagics.item.GlowGemItem;
import net.mcreator.gemmagics.item.FireResGemItem;
import net.mcreator.gemmagics.item.DolphinGemItem;
import net.mcreator.gemmagics.item.DarknessGemItem;
import net.mcreator.gemmagics.item.ConduitGemItem;
import net.mcreator.gemmagics.item.BlindnessGemItem;
import net.mcreator.gemmagics.item.BadLuckGemItem;
import net.mcreator.gemmagics.item.AbsorbGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item HASTE_GEM;
	public static Item ABSORB_GEM;
	public static Item FIRE_RES_GEM;
	public static Item DOLPHIN_GEM;
	public static Item WITHER_GEM;
	public static Item CONDUIT_GEM;
	public static Item WEAKNESS_GEM;
	public static Item GLOW_GEM;
	public static Item WATER_BREATHING_GEM;
	public static Item HUNGER_GEM;
	public static Item STRENGTH_GEM;
	public static Item INSTA_HEALTH_GEM;
	public static Item SPEED_GEM;
	public static Item HEALTH_BOOST_GEM;
	public static Item SLOWNESS_GEM;
	public static Item INSTA_DAMAGE_GEM;
	public static Item SLOW_FALLING_GEM;
	public static Item INVIS_GEM;
	public static Item SATURATION_GEM;
	public static Item JUMP_GEM;
	public static Item RESISTANCE_GEM;
	public static Item LEVITATION_GEM;
	public static Item REGENERATION_GEM;
	public static Item LUCK_GEM;
	public static Item POISON_GEM;
	public static Item BAD_LUCK_GEM;
	public static Item NIGHT_VISION_GEM;
	public static Item NAUSEA_GEM;
	public static Item DARKNESS_GEM;
	public static Item BLINDNESS_GEM;
	public static Item MINING_FATIGUE_GEM;

	public static void load() {
		HASTE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "haste_gem"), new HasteGemItem());
		ABSORB_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorb_gem"), new AbsorbGemItem());
		FIRE_RES_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "fire_res_gem"), new FireResGemItem());
		DOLPHIN_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "dolphin_gem"), new DolphinGemItem());
		WITHER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "wither_gem"), new WitherGemItem());
		CONDUIT_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "conduit_gem"), new ConduitGemItem());
		WEAKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "weakness_gem"), new WeaknessGemItem());
		GLOW_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "glow_gem"), new GlowGemItem());
		WATER_BREATHING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "water_breathing_gem"), new WaterBreathingGemItem());
		HUNGER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "hunger_gem"), new HungerGemItem());
		STRENGTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "strength_gem"), new StrengthGemItem());
		INSTA_HEALTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "insta_health_gem"), new InstaHealthGemItem());
		SPEED_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "speed_gem"), new SpeedGemItem());
		HEALTH_BOOST_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "health_boost_gem"), new HealthBoostGemItem());
		SLOWNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slowness_gem"), new SlownessGemItem());
		INSTA_DAMAGE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "insta_damage_gem"), new InstaDamageGemItem());
		SLOW_FALLING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slow_falling_gem"), new SlowFallingGemItem());
		INVIS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "invis_gem"), new InvisGemItem());
		SATURATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "saturation_gem"), new SaturationGemItem());
		JUMP_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "jump_gem"), new JumpGemItem());
		RESISTANCE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "resistance_gem"), new ResistanceGemItem());
		LEVITATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "levitation_gem"), new LevitationGemItem());
		REGENERATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "regeneration_gem"), new RegenerationGemItem());
		LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "luck_gem"), new LuckGemItem());
		POISON_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "poison_gem"), new PoisonGemItem());
		BAD_LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "bad_luck_gem"), new BadLuckGemItem());
		NIGHT_VISION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "night_vision_gem"), new NightVisionGemItem());
		NAUSEA_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "nausea_gem"), new NauseaGemItem());
		DARKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "darkness_gem"), new DarknessGemItem());
		BLINDNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "blindness_gem"), new BlindnessGemItem());
		MINING_FATIGUE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "mining_fatigue_gem"), new MiningFatigueGemItem());
	}

	public static void clientLoad() {
	}
}
