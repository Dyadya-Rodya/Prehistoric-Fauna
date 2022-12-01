package superlord.prehistoricfauna.common.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.HangingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.NetworkHooks;
import superlord.prehistoricfauna.init.PFEntities;
import superlord.prehistoricfauna.init.PFItems;

public class WallFossilEntity extends HangingEntity implements IEntityAdditionalSpawnData {
    public Fossil fossil;

    public WallFossilEntity(EntityType<? extends WallFossilEntity> type, World world) {
        super(type, world);
    }

    public WallFossilEntity(World world, BlockPos pos, Direction facing) {
        super(PFEntities.WALL_FOSSIL, world, pos);
        List<Fossil> list = new ArrayList<>();
        int i = 0;

        for (Fossil fossil : Fossil.VALUES) {
            this.fossil = fossil;
            this.updateFacingWithBoundingBox(facing);
            if (this.onValidSurface()) {
                list.add(fossil);
                int j = fossil.getWidth() * fossil.getHeight();
                if (j > i) {
                    i = j;
                }
            }
        }

        if (!list.isEmpty()) {
            Iterator<Fossil> iterator = list.iterator();

            while (iterator.hasNext()) {
                Fossil fossil = iterator.next();
                if (fossil.getWidth() * fossil.getHeight() < i) {
                    iterator.remove();
                }
            }

            this.fossil = list.get(this.rand.nextInt(list.size()));
        }

        this.updateFacingWithBoundingBox(facing);
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        compound.putInt("Type", fossil.ordinal());
        compound.putByte("Facing", (byte)this.facingDirection.getHorizontalIndex());
        super.writeAdditional(compound);
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        fossil = Fossil.VALUES[compound.getInt("Type")];
        this.facingDirection = Direction.byHorizontalIndex(compound.getByte("Facing"));
        super.readAdditional(compound);
        this.updateFacingWithBoundingBox(this.facingDirection);
    }

    @Override
    public int getWidthPixels() {
        return this.fossil == null ? 1 : this.fossil.getWidth();
    }

    @Override
    public int getHeightPixels() {
        return this.fossil == null ? 1 : this.fossil.getHeight();
    }

    @Override
    public void onBroken(@Nullable Entity brokenEntity) {
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            this.playSound(SoundEvents.ENTITY_PAINTING_BREAK, 1.0F, 1.0F);
            if (brokenEntity instanceof PlayerEntity) {
                PlayerEntity playerentity = (PlayerEntity) brokenEntity;
                if (playerentity.abilities.isCreativeMode) {
                    return;
                }
            }

            this.entityDropItem(PFItems.WALL_FOSSIL.get());
        }
    }

    @Override
    public void playPlaceSound() {
        this.playSound(SoundEvents.ENTITY_PAINTING_PLACE, 1.0F, 1.0F);
    }

    @Override
    public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch) {
        this.setPosition(x, y, z);
    }

    @Override
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport) {
        BlockPos blockpos = this.hangingPosition;
        this.setPosition(blockpos.getX(), blockpos.getY(), blockpos.getZ());
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {
        buffer.writeEnumValue(fossil);
        buffer.writeBlockPos(hangingPosition);
        if (facingDirection == null) {
            buffer.writeBoolean(false);
        } else {
            buffer.writeBoolean(true);
            buffer.writeEnumValue(facingDirection);
        }
    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {
        this.fossil = additionalData.readEnumValue(Fossil.class);
        this.hangingPosition = additionalData.readBlockPos();
        if (additionalData.readBoolean()) {
            this.updateFacingWithBoundingBox(additionalData.readEnumValue(Direction.class));
        }
    }

    public enum Fossil {
        ARCHAEOPTERYX(32, 32),
        CLAMS(16, 16),
        CRAB(16, 16),
        DINOSAUR(48, 32),
        ICHTHYOSAUR(64, 32),
        JAW(32, 16),
        LEAVES(16, 32),
        LONG_FISH(32, 16),
        LOTS_OF_FISH(32, 32),
        PTEROSAUR(48, 32),
        SHELLS(48, 32),
        SMALL_AMMONITE(16, 16),
        SMALL_FISH(16, 16),
        TRILOBITE(16, 16),
        XIPHACTINUS(96, 32),
        HORSESHOE(32, 16),
        LONGISQUAMA_FOSSIL(32, 32);

        public static final Fossil[] VALUES = values();

        private final int width;
        private final int height;

        Fossil(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
    
    @Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return new ItemStack(PFItems.WALL_FOSSIL.get());
	}
    
}
