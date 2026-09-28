package com.blackout.extendedslabs.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.List;

public final class ESPWeatheringBlocks {
	private ESPWeatheringBlocks() {
	}

	private interface WeatheringBlock extends WeatheringCopper {
		WeatherState weatherState();

		@Override
		default WeatherState getAge() {
			return weatherState();
		}
	}

	private static boolean isRandomlyTicking(BlockState state) {
		return WeatheringCopper.getNext(state.getBlock()).isPresent();
	}

	public static class VerticalSlab extends ESPVerticalSlabBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public VerticalSlab(
				List<TagKey<Block>> tags,
				Block originalBlock,
				Block slabVariant,
				WeatherState weatherState,
				Properties properties
		) {
			super(tags, originalBlock, slabVariant, properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class Corner extends ESPCornerBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public Corner(
				List<TagKey<Block>> tags,
				Block originalBlock,
				Block stairVariant,
				WeatherState weatherState,
				Properties properties
		) {
			super(tags, originalBlock, stairVariant, properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class Wall extends WallBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public Wall(WeatherState weatherState, Properties properties) {
			super(properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class Fence extends FenceBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public Fence(WeatherState weatherState, Properties properties) {
			super(properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class FenceGate extends FenceGateBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public FenceGate(
				WoodType type,
				WeatherState weatherState,
				Properties properties
		) {
			super(type, properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class Button extends ESPButtonBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public Button(
				List<TagKey<Block>> tags,
				Block originalBlock,
				BlockSetType type,
				int ticksToStayPressed,
				WeatherState weatherState,
				Properties properties
		) {
			super(tags, originalBlock, type, ticksToStayPressed, properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}

	public static class PressurePlate extends ESPPressurePlateBlock implements WeatheringBlock {
		private final WeatherState weatherState;

		public PressurePlate(
				List<TagKey<Block>> tags,
				Block originalBlock,
				BlockSetType type,
				WeatherState weatherState,
				Properties properties
		) {
			super(tags, originalBlock, type, properties);
			this.weatherState = weatherState;
		}

		@Override
		public WeatherState weatherState() {
			return weatherState;
		}

		@Override
		protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
			changeOverTime(state, level, pos, random);
		}

		@Override
		protected boolean isRandomlyTicking(BlockState state) {
			return ESPWeatheringBlocks.isRandomlyTicking(state);
		}
	}
}