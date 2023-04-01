package superlord.prehistoricfauna.common.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import superlord.prehistoricfauna.common.entities.DinosaurEntity;
import superlord.prehistoricfauna.common.entities.cretaceous.djadochta.CitipatiEntity;
import superlord.prehistoricfauna.common.entities.cretaceous.djadochta.TelmasaurusEntity;
import superlord.prehistoricfauna.init.PFBlocks;

public class DinosaurEggBlock extends Block {
	private static final VoxelShape ONE_EGG_SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 12.0D, 7.0D, 12.0D);
	private static final VoxelShape MULTI_EGG_SHAPE = Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D);
	public static final IntegerProperty HATCH = BlockStateProperties.HATCH_0_2;
	public static final IntegerProperty EGGS = BlockStateProperties.EGGS_1_4;
	public static final BooleanProperty CITIPATIFIED = BooleanProperty.create("citipatified");
	public final EntityType<?> typeIn;

	public DinosaurEggBlock(EntityType<?> entity, Block.Properties properties) {
		super(properties);
		this.typeIn = entity;
		this.setDefaultState(this.stateContainer.getBaseState().with(HATCH, Integer.valueOf(0)).with(EGGS, Integer.valueOf(1)).with(CITIPATIFIED, false));
	}

	/**
	 * Called when the given entity walks on this Block
	 */
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		this.tryTrample(worldIn, pos, entityIn, 100);
		super.onEntityWalk(worldIn, pos, entityIn);
	}

	/**
	 * Block's chance to react to a living entity falling on it.
	 */
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
		super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
	}

	private void tryTrample(World worldIn, BlockPos pos, Entity trampler, int p_203167_4_) {
		if (!this.canTrample(worldIn, trampler)) {
			super.onEntityWalk(worldIn, pos, trampler);
		} else {
			if (!worldIn.isRemote && worldIn.rand.nextInt(p_203167_4_) == 0) {
				this.removeOneEgg(worldIn, pos, worldIn.getBlockState(pos));
			}

		}
	}

	private void removeOneEgg(World worldIn, BlockPos pos, BlockState state) {
		worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ENTITY_TURTLE_EGG_BREAK, SoundCategory.BLOCKS, 0.7F,
				0.9F + worldIn.rand.nextFloat() * 0.2F);
		int i = state.get(EGGS);
		if (i <= 1) {
			worldIn.destroyBlock(pos, false);
		} else {
			worldIn.setBlockState(pos, state.with(EGGS, Integer.valueOf(i - 1)), 2);
			worldIn.playEvent(2001, pos, Block.getStateId(state));
		}

	}

	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		if (this.canGrow(worldIn, state) && this.hasProperHabitat(worldIn, pos)) {
			int i = state.get(HATCH);
			if (i < 2) {
				worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ENTITY_TURTLE_EGG_CRACK, SoundCategory.BLOCKS,
						0.7F, 0.9F + rand.nextFloat() * 0.2F);
				worldIn.setBlockState(pos, state.with(HATCH, Integer.valueOf(i + 1)), 2);
			} else {
				worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ENTITY_TURTLE_EGG_HATCH, SoundCategory.BLOCKS,
						0.7F, 0.9F + rand.nextFloat() * 0.2F);
				worldIn.removeBlock(pos, false);

				for (int j = 0; j < state.get(EGGS); ++j) {
					worldIn.playEvent(2001, pos, Block.getStateId(state));
					Entity dinosaurEntity = typeIn.create(worldIn);
					((DinosaurEntity)dinosaurEntity).setGrowingAge(-24000);
					dinosaurEntity.setLocationAndAngles((double) pos.getX() + 0.3D + (double) j * 0.2D,
							(double) pos.getY(), (double) pos.getZ() + 0.3D, 0.0F, 0.0F);
					worldIn.addEntity(dinosaurEntity);
				}
			}
		}

	}

	private boolean hasProperHabitat(IBlockReader blockReader, BlockPos pos) {
		return blockReader.getBlockState(pos.down()).getBlock() == Blocks.SAND || blockReader.getBlockState(pos.down()).getBlock() == Blocks.RED_SAND || blockReader.getBlockState(pos.down()).getBlock() == Blocks.COARSE_DIRT || blockReader.getBlockState(pos.down()).getBlock() == Blocks.GRASS_BLOCK || blockReader.getBlockState(pos.down()).getBlock() == Blocks.DIRT || blockReader.getBlockState(pos.down()).getBlock() == PFBlocks.LOAM || blockReader.getBlockState(pos.down()).getBlock() == PFBlocks.PACKED_LOAM || blockReader.getBlockState(pos.down()).getBlock() == PFBlocks.SILT || blockReader.getBlockState(pos.down()).getBlock() == PFBlocks.HARDENED_SILT || blockReader.getBlockState(pos.down()).getBlock() == PFBlocks.MOSSY_DIRT || blockReader.getBlockState(pos.down()).getBlock() == Blocks.PODZOL || blockReader.getBlockState(pos.down()).getBlock() == Blocks.MYCELIUM || blockReader.getBlockState(pos.down()).getBlock() == BlockTags.LEAVES;
	}

	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		if (this.hasProperHabitat(worldIn, pos) && !worldIn.isRemote) {
			worldIn.playEvent(2005, pos, 0);
		}

	}

	private boolean canGrow(World worldIn, BlockState state) {
		boolean citipatified = state.get(CITIPATIFIED);
		int regularTime = 2400;
		int citipatifiedTime = 1200;
		Random rand = new Random();
		for (int i = regularTime + rand.nextInt(600); i>=0; i--) {
			if (i == 0) {
				return true;
			}
		}
		if (citipatified) {
			for (int i = citipatifiedTime + rand.nextInt(600); i >= 0; i--) {
				if (i == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Spawns the block's drops in the world. By the time this is called the Block
	 * has possibly been set to air via Block.removedByPlayer
	 */
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state,
			@Nullable TileEntity te, ItemStack stack) {
		super.harvestBlock(worldIn, player, pos, state, te, stack);
		this.removeOneEgg(worldIn, pos, state);
	}

	@SuppressWarnings("deprecation")
	public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
		return useContext.getItem().getItem() == this.asItem() && state.get(EGGS) < 4 ? true
				: super.isReplaceable(state, useContext);
	}

	@Nullable
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockState blockstate = context.getWorld().getBlockState(context.getPos());
		return blockstate.getBlock() == this
				? blockstate.with(EGGS, Integer.valueOf(Math.min(4, blockstate.get(EGGS) + 1)))
						: super.getStateForPlacement(context);
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return state.get(EGGS) > 1 ? MULTI_EGG_SHAPE : ONE_EGG_SHAPE;
	}

	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(HATCH, EGGS, CITIPATIFIED);
	}


	private boolean canTrample(World worldIn, Entity trampler) {
		if (trampler.getType() == typeIn || trampler instanceof CitipatiEntity || trampler instanceof TelmasaurusEntity) {
			return false;
		} else {
			return trampler instanceof LivingEntity && !(trampler instanceof PlayerEntity)
					? net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(worldIn, trampler)
							: true;
		}
	}
}