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
import net.mcreator.gemmagics.item.HasteGemItem;
import net.mcreator.gemmagics.item.FireResGemItem;
import net.mcreator.gemmagics.item.DolphinGemItem;
import net.mcreator.gemmagics.item.AbsorbGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item HASTE_GEM;
	public static Item ABSORB_GEM;
	public static Item FIRE_RES_GEM;
	public static Item DOLPHIN_GEM;
	public static Item WITHER_GEM;
	public static Item WEAKNESS_GEM;
	public static Item WATER_BREATHING_GEM;
	public static Item STRENGTH_GEM;
	public static Item SPEED_GEM;
	public static Item SLOWNESS_GEM;
	public static Item SLOW_FALLING_GEM;
	public static Item SATURATION_GEM;
	public static Item RESISTANCE_GEM;
	public static Item REGENERATION_GEM;
	public static Item POISON_GEM;
	public static Item NIGHT_VISION_GEM;
	public static Item NAUSEA_GEM;
	public static Item MINING_FATIGUE_GEM;

	public static void load() {
		HASTE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "haste_gem"), new HasteGemItem());
		ABSORB_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorb_gem"), new AbsorbGemItem());
		FIRE_RES_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "fire_res_gem"), new FireResGemItem());
		DOLPHIN_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "dolphin_gem"), new DolphinGemItem());
		WITHER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "wither_gem"), new WitherGemItem());
		WEAKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "weakness_gem"), new WeaknessGemItem());
		WATER_BREATHING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "water_breathing_gem"), new WaterBreathingGemItem());
		STRENGTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "strength_gem"), new StrengthGemItem());
		SPEED_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "speed_gem"), new SpeedGemItem());
		SLOWNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slowness_gem"), new SlownessGemItem());
		SLOW_FALLING_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "slow_falling_gem"), new SlowFallingGemItem());
		SATURATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "saturation_gem"), new SaturationGemItem());
		RESISTANCE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "resistance_gem"), new ResistanceGemItem());
		REGENERATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "regeneration_gem"), new RegenerationGemItem());
		POISON_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "poison_gem"), new PoisonGemItem());
		NIGHT_VISION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "night_vision_gem"), new NightVisionGemItem());
		NAUSEA_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "nausea_gem"), new NauseaGemItem());
		MINING_FATIGUE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "mining_fatigue_gem"), new MiningFatigueGemItem());
	}

	public static void clientLoad() {
	}
}
