/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gemmagics.item.HasteGemItem;
import net.mcreator.gemmagics.item.FireResGemItem;
import net.mcreator.gemmagics.item.AbsorbGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item HASTE_GEM;
	public static Item ABSORB_GEM;
	public static Item FIRE_RES_GEM;

	public static void load() {
		HASTE_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "haste_gem"), new HasteGemItem());
		ABSORB_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorb_gem"), new AbsorbGemItem());
		FIRE_RES_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "fire_res_gem"), new FireResGemItem());
	}

	public static void clientLoad() {
	}
}
