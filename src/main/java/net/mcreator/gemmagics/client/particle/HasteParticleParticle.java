
package net.mcreator.gemmagics.client.particle;

import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class HasteParticleParticle extends TextureSheetParticle {

	public static HasteParticleParticleProvider provider(SpriteSet spriteSet) {
		return new HasteParticleParticleProvider(spriteSet);
	}

	public static class HasteParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public HasteParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new HasteParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected HasteParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize((float) 0.2, (float) 0.2);
		this.quadSize *= (float) 1;

		this.lifetime = 13;

		this.gravity = (float) 0;
		this.hasPhysics = true;

		this.xd = vx * 0.01;
		this.yd = vy * 0.01;
		this.zd = vz * 0.01;

		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();

		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 14 + 1, 14));
		}

	}

}
