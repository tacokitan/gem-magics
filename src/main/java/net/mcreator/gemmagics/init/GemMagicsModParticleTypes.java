/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemmagics.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.gemmagics.client.particle.HasteParticleParticle;
import net.mcreator.gemmagics.client.particle.AbsorptionParticleParticle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class GemMagicsModParticleTypes {
	public static final SimpleParticleType HASTE_PARTICLE = FabricParticleTypes.simple(true);
	public static final SimpleParticleType ABSORPTION_PARTICLE = FabricParticleTypes.simple(true);

	public static void clientLoad() {
		ParticleFactoryRegistry.getInstance().register(HASTE_PARTICLE, HasteParticleParticle::provider);
		ParticleFactoryRegistry.getInstance().register(ABSORPTION_PARTICLE, AbsorptionParticleParticle::provider);
	}

	public static void load() {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("gem_magics", "haste_particle"), HASTE_PARTICLE);
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("gem_magics", "absorption_particle"), ABSORPTION_PARTICLE);
	}
}
