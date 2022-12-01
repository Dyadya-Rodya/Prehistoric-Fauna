package superlord.prehistoricfauna.common.items;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.items.model.DesmatosuchusChestplateModel;

import javax.annotation.Nullable;

public class CustomChestplateItem extends ArmorItem {
	
	public CustomChestplateItem(IArmorMaterial materialIn, EquipmentSlotType slot, Item.Properties builder) {
		super(materialIn, slot, builder);
	}
	
	@SuppressWarnings("unchecked")
	@Nullable
	@Override
	@OnlyIn(Dist.CLIENT)
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default)
    {
		DesmatosuchusChestplateModel model = new DesmatosuchusChestplateModel(1F);
		model.bipedHead.showModel = armorSlot == EquipmentSlotType.CHEST;
		
		model.isChild = _default.isChild;
		model.isSneak = _default.isSneak;
		model.isSitting = _default.isSitting;
		model.rightArmPose = _default.rightArmPose;
		model.leftArmPose = _default.leftArmPose;
		
		return (A) model;
    }
	
	@Override
    @Nullable
	@OnlyIn(Dist.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        return "prehistoricfauna:textures/models/armor/aetosaur_chestplate.png";
    }
	
}
