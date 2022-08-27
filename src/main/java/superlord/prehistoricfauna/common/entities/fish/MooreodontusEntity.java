package superlord.prehistoricfauna.common.entities.fish;

import java.util.Random;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import superlord.prehistoricfauna.init.PFItems;
import superlord.prehistoricfauna.init.SoundInit;

public class MooreodontusEntity extends AbstractFishEntity {
	
	public MooreodontusEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public static AttributeModifierMap.MutableAttribute createAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 3.0D);
	}

   protected ItemStack getFishBucket() {
      return new ItemStack(PFItems.MOOREODONTUS_BUCKET.get());
   }

   protected SoundEvent getDeathSound() {
      return SoundInit.MOOREODONTUS_DEATH;
   }

   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
      return SoundInit.MOOREODONTUS_HURT;
   }

	@Override
	protected SoundEvent getFlopSound() {
		return SoundInit.FISH_FLOP;
	}

	public static boolean func_223363_b(EntityType<? extends AbstractFishEntity> type, IWorld worldIn, SpawnReason reason, BlockPos p_223363_3_, Random randomIn) {
		return worldIn.getBlockState(p_223363_3_).isIn(Blocks.WATER) && randomIn.nextFloat() > 0.95F;
	}
	
}
