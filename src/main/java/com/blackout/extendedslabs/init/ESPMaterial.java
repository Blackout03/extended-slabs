package com.blackout.extendedslabs.init;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.PushReaction;

public final class ESPMaterial {
	public static final Material SHOVEL_CLAY = new Builder(MaterialColor.CLAY).build();
	public static final Material SHOVEL_DIRT = new Builder(MaterialColor.DIRT).build();
	public static final Material SHOVEL_GRASS = new Builder(MaterialColor.GRASS).build();
	public static final Material SHOVEL_SAND = new Builder(MaterialColor.SAND).build();
	public static final Material AXE_WOOD = new Builder(MaterialColor.WOOD).flammable().build();
	public static final Material AXE_NETHER_WOOD = new Builder(MaterialColor.WOOD).build();
	public static final Material WOOL = new Builder(MaterialColor.WOOL).flammable().build();
	public static final Material GLASS = new Builder(MaterialColor.NONE).notSolidBlocking().build();
	public static final Material PICKAXE_STONE = new Builder(MaterialColor.STONE).build();
	public static final Material PICKAXE_MUD = new Builder(MaterialColor.DIRT).build();
	public static final Material PICKAXE_METAL = new Builder(MaterialColor.METAL).build();

	private final MaterialColor color;
	private final PushReaction pushReaction;
	private final boolean blocksMotion;
	private final boolean flammable;
	private final boolean liquid;
	private final boolean solidBlocking;
	private final boolean replaceable;
	private final boolean solid;

	public ESPMaterial(MaterialColor p_76324_, boolean p_76325_, boolean p_76326_, boolean p_76327_, boolean p_76328_, boolean p_76329_, boolean p_76330_, PushReaction p_76331_) {
		this.color = p_76324_;
		this.liquid = p_76325_;
		this.solid = p_76326_;
		this.blocksMotion = p_76327_;
		this.solidBlocking = p_76328_;
		this.flammable = p_76329_;
		this.replaceable = p_76330_;
		this.pushReaction = p_76331_;
	}

	public boolean isLiquid() {
		return this.liquid;
	}

	public boolean isSolid() {
		return this.solid;
	}

	public boolean blocksMotion() {
		return this.blocksMotion;
	}

	public boolean isFlammable() {
		return this.flammable;
	}

	public boolean isReplaceable() {
		return this.replaceable;
	}

	public boolean isSolidBlocking() {
		return this.solidBlocking;
	}

	public PushReaction getPushReaction() {
		return this.pushReaction;
	}

	public MaterialColor getColor() {
		return this.color;
	}

	public static class Builder {
		private PushReaction pushReaction = PushReaction.NORMAL;
		private boolean blocksMotion = true;
		private boolean flammable;
		private boolean liquid;
		private boolean replaceable;
		private boolean solid = true;
		private final MaterialColor color;
		private boolean solidBlocking = true;

		public Builder(MaterialColor p_76349_) {
			this.color = p_76349_;
		}

		public Builder liquid() {
			this.liquid = true;
			return this;
		}

		public Builder nonSolid() {
			this.solid = false;
			return this;
		}

		public Builder noCollider() {
			this.blocksMotion = false;
			return this;
		}

		Builder notSolidBlocking() {
			this.solidBlocking = false;
			return this;
		}

		protected Builder flammable() {
			this.flammable = true;
			return this;
		}

		public Builder replaceable() {
			this.replaceable = true;
			return this;
		}

		protected Builder destroyOnPush() {
			this.pushReaction = PushReaction.DESTROY;
			return this;
		}

		protected Builder notPushable() {
			this.pushReaction = PushReaction.BLOCK;
			return this;
		}

		public Material build() {
			return new Material(this.color, this.liquid, this.solid, this.blocksMotion, this.solidBlocking, this.flammable, this.replaceable, this.pushReaction);
		}
	}
}
