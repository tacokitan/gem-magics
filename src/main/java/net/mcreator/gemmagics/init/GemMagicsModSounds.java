
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class GemMagicsModSounds {
	public static SoundEvent GEM_CRUSH = SoundEvent.createVariableRangeEvent(new ResourceLocation("gem_magics", "gem_crush"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("gem_magics", "gem_crush"), GEM_CRUSH);
	}
}
