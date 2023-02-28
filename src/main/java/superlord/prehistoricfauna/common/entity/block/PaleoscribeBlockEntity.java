package superlord.prehistoricfauna.common.entity.block;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.Mth;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.common.entity.block.container.PaleoscribeContainer;
import superlord.prehistoricfauna.common.entity.block.messages.MessageUpdatePaleoscribe;
import superlord.prehistoricfauna.common.items.PaleopediaItem;
import superlord.prehistoricfauna.common.util.EnumPaleoPages;
import superlord.prehistoricfauna.init.PFBlockEntities;
import superlord.prehistoricfauna.init.PFItems;

public class PaleoscribeBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
	private static final int[] slotsTop = new int[]{0};
    private static final int[] slotsSides = new int[]{1};
    private static final int[] slotsBottom = new int[]{0};
    private static final Random RANDOM = new Random();
    private static final ArrayList<EnumPaleoPages> EMPTY_LIST = new ArrayList<>();
    public final ContainerData furnaceData = new ContainerData() {
        @Override
        public int get(int index) {
            return 0;
        }

        @Override
        public void set(int index, int value) {

        }

        @Override
        public int getCount() {
            return 0;
        }
    };
    public float pageFlip;
    public float pageFlipPrev;
    public float pageHelp1;
    public float pageHelp2;
    public EnumPaleoPages[] selectedPages = new EnumPaleoPages[3];
    net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
        net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN);
    private final Random localRand = new Random();
    private NonNullList<ItemStack> stacks = NonNullList.withSize(3, ItemStack.EMPTY);

    public PaleoscribeBlockEntity(BlockPos pos, BlockState state) {
        super(PFBlockEntities.PALEOSCRIBE.get(), pos, state);
    }
    
    public static String getGuiID() {
        return PrehistoricFauna.MOD_ID + ":paleoscribe";
    }

    public static void bookAnimationTick(Level p_155504_, BlockPos p_155505_, BlockState p_155506_, PaleoscribeBlockEntity p_155507_) {
        float f1 = p_155507_.pageHelp1;
        do {
            p_155507_.pageHelp1 += RANDOM.nextInt(4) - RANDOM.nextInt(4);
        } while (f1 == p_155507_.pageHelp1);
        p_155507_.pageFlipPrev = p_155507_.pageFlip;
        float f = (p_155507_.pageHelp1 - p_155507_.pageFlip) * 0.04F;
        float f3 = 0.02F;
        f = Mth.clamp(f, -f3, f3);
        p_155507_.pageHelp2 += (f - p_155507_.pageHelp2) * 0.9F;
        p_155507_.pageFlip += p_155507_.pageHelp2;
    }
    
    @Override
    public int getContainerSize() {
        return 2;
    }

    @Override
    public @NotNull ItemStack getItem(int index) {
        return this.stacks.get(index);
    }

    private List<EnumPaleoPages> getPossiblePages() {
        final List<EnumPaleoPages> list = EnumPaleoPages.possiblePages(this.stacks.get(0));
        if (list != null && !list.isEmpty()) {
            return list;
        }
        return EMPTY_LIST;
    }

    @Override
    public @NotNull ItemStack removeItem(int index, int count) {
        if (!this.stacks.get(index).isEmpty()) {
            ItemStack itemstack;

            if (this.stacks.get(index).getCount() <= count) {
                itemstack = this.stacks.get(index);
                this.stacks.set(index, ItemStack.EMPTY);
                return itemstack;
            } else {
                itemstack = this.stacks.get(index).split(count);

                if (this.stacks.get(index).getCount() == 0) {
                    this.stacks.set(index, ItemStack.EMPTY);
                }

                return itemstack;
            }
        } else {
            return ItemStack.EMPTY;
        }
    }

    public ItemStack getStackInSlotOnClosing(int index) {
        if (!this.stacks.get(index).isEmpty()) {
            ItemStack itemstack = this.stacks.get(index);
            this.stacks.set(index, ItemStack.EMPTY);
            return itemstack;
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public void setItem(int index, ItemStack stack) {
        boolean flag = !stack.isEmpty() && stack.sameItem(this.stacks.get(index)) && ItemStack.tagMatches(stack, this.stacks.get(index));
        this.stacks.set(index, stack);

        if (!stack.isEmpty() && stack.getCount() > this.getMaxStackSize()) {
            stack.setCount(this.getMaxStackSize());
        }
        if (index == 0 && !flag) {
            this.setChanged();
            selectedPages = randomizePages(getItem(0), getItem(1));
        }
    }

    public EnumPaleoPages[] randomizePages(ItemStack paleopedia, ItemStack manuscript) {
        if (!level.isClientSide) {
            if (paleopedia.getItem() == PFItems.PALEOPEDIA.get()) {
                List<EnumPaleoPages> possibleList = getPossiblePages();
                localRand.setSeed(this.level.getGameTime());
                Collections.shuffle(possibleList, localRand);
                if (!possibleList.isEmpty()) {
                    selectedPages[0] = possibleList.get(0);
                } else {
                    selectedPages[0] = null;
                }
                if (possibleList.size() > 1) {
                    selectedPages[1] = possibleList.get(1);
                } else {
                    selectedPages[1] = null;
                }
                if (possibleList.size() > 2) {
                    selectedPages[2] = possibleList.get(2);
                } else {
                    selectedPages[2] = null;
                }
            }
            int page1 = selectedPages[0] == null ? -1 : selectedPages[0].ordinal();
            int page2 = selectedPages[1] == null ? -1 : selectedPages[1].ordinal();
            int page3 = selectedPages[2] == null ? -1 : selectedPages[2].ordinal();
            PrehistoricFauna.sendMSGToAll(new MessageUpdatePaleoscribe(worldPosition.asLong(), page1, page2, page3, false, 0));
        }
        return selectedPages;
    }

    @Override
    public void load(@NotNull CompoundTag compound) {
        super.load(compound);
        this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(compound, this.stacks);

    }

    @Override
    public void saveAdditional(@NotNull CompoundTag compound) {
        ContainerHelper.saveAllItems(compound, this.stacks);
    }

    @Override
    public void startOpen(@NotNull Player player) {
    }

    @Override
    public void stopOpen(@NotNull Player player) {
    }

    @Override
    public boolean canPlaceItem(int index, ItemStack stack) {
        if (stack.isEmpty())
            return false;
        if (index == 0)
            return stack.getItem() instanceof PaleopediaItem;
        if (index == 1)
            return stack.getItem() == PFItems.PALEOPAGE.get();
        return false;
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        return true;
    }

    @Override
    public void clearContent() {
        this.stacks.clear();
    }

    @Override
    public @NotNull Component getName() {
        return new TranslatableComponent("block.prehistoricfauna.paleoscribe");
    }

    @Override
    public boolean canTakeItemThroughFace(int index, @NotNull ItemStack stack, @NotNull Direction direction) {
        return false;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public int @NotNull [] getSlotsForFace(@NotNull Direction side) {
        return side == Direction.DOWN ? slotsBottom : (side == Direction.UP ? slotsTop : slotsSides);
    }

    @Override
    public boolean canPlaceItemThroughFace(int index, @NotNull ItemStack itemStackIn, Direction direction) {
        return this.canPlaceItem(index, itemStackIn);
    }

    @Override
    public @NotNull ItemStack removeItemNoUpdate(int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket packet) {
        load(packet.getTag());
    }

    @Override
    public @NotNull CompoundTag getUpdateTag() {
        return this.saveWithFullMetadata();
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return getName();
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int id, @NotNull Inventory player) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.stacks) {
            if (!itemstack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public <T> net.minecraftforge.common.util.@NotNull LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.@NotNull Capability<T> capability, @Nullable Direction facing) {
        if (!this.remove && facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (facing == Direction.DOWN)
                return handlers[1].cast();
            else
                return handlers[0].cast();
        }
        return super.getCapability(capability, facing);
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, @NotNull Inventory playerInventory, @NotNull Player player) {
        return new PaleoscribeContainer(id, this, playerInventory, furnaceData);
    }

}