/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

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
import net.mcreator.gemmagics.item.DarkGemItem;
import net.mcreator.gemmagics.item.ConduitGemItem;
import net.mcreator.gemmagics.item.BlindGemItem;
import net.mcreator.gemmagics.item.BadLuckGemItem;
import net.mcreator.gemmagics.item.AbsorbGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item HASTE_GEM;
	public static Item ABSORB_GEM;
	public static Item FIRE_RES_GEM;
	public static Item DOLPHIN_GEM;
	public static Item BLIND_GEM;
	public static Item CONDUIT_GEM;
	public static Item DARKNESS_GEM;
	public static Item GLOW_GEM;
	public static Item HUNGER_GEM;
	public static Item INSTA_HEALTH_GEM;
	public static Item HEALTH_BOOST_GEM;
	public static Item INSTA_DAMAGE_GEM;
	public static Item INVIS_GEM;
	public static Item JUMP_GEM;
	public static Item LEVITATION_GEM;
	public static Item LUCK_GEM;
	public static Item BAD_LUCK_GEM;

	public static void load() {
		HASTE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "haste_gem"), new HasteGemItem());
		ABSORB_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorb_gem"), new AbsorbGemItem());
		FIRE_RES_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "fire_res_gem"), new FireResGemItem());
		DOLPHIN_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "dolphin_gem"), new DolphinGemItem());
		BLIND_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "blind_gem"), new BlindGemItem());
		CONDUIT_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "conduit_gem"), new ConduitGemItem());
		DARKNESS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "darkness_gem"), new DarkGemItem());
		GLOW_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "glow_gem"), new GlowGemItem());
		HUNGER_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "hunger_gem"), new HungerGemItem());
		INSTA_HEALTH_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "insta_health_gem"), new InstaHealthGemItem());
		HEALTH_BOOST_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "health_boost_gem"), new HealthBoostGemItem());
		INSTA_DAMAGE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "insta_damage_gem"), new InstaDamageGemItem());
		INVIS_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "invis_gem"), new InvisGemItem());
		JUMP_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "jump_gem"), new JumpGemItem());
		LEVITATION_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "levitation_gem"), new LevitationGemItem());
		LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "luck_gem"), new LuckGemItem());
		BAD_LUCK_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "bad_luck_gem"), new BadLuckGemItem());
	}

	public static void clientLoad() {
	}
}
