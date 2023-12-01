/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.gemmagics.item.AbsorbGemItem;
import net.mcreator.gemmagics.GemMagicsMod;

public class GemMagicsModItems {
	public static Item ABSORB_GEM;

	public static void load() {
		ABSORB_GEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GemMagicsMod.MODID, "absorb_gem"), new AbsorbGemItem());
	}

	public static void clientLoad() {
	}
}
