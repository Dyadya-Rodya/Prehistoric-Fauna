package superlord.prehistoricfauna.client.render.jurassic.morrison;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.client.model.jurassic.morrison.HesperornithoidesModel;
import superlord.prehistoricfauna.common.entities.jurassic.morrison.HesperornithoidesEntity;

public class HesperornithoidesRenderer extends MobRenderer<HesperornithoidesEntity, EntityModel<HesperornithoidesEntity>> {

	private static final ResourceLocation HESPERORNITHOIDES = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/hesperornithoides.png");
	private static final ResourceLocation ALBINO = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/albino.png");
	private static final ResourceLocation MELANISTIC = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/melanistic.png");
	private static final ResourceLocation HESPERORNITHOIDES_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/hesperornithoides_sleeping.png");
	private static final ResourceLocation ALBINO_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/albino_sleeping.png");
	private static final ResourceLocation MELANISTIC_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/hesperornithoides/melanistic_sleeping.png");
	private static final HesperornithoidesModel HESPERORNITHOIDES_MODEL = new HesperornithoidesModel();
	
	public HesperornithoidesRenderer() {
		super(Minecraft.getInstance().getRenderManager(), HESPERORNITHOIDES_MODEL, 0.375F);
	}
	
	protected void preRenderCallback(HesperornithoidesEntity entity, MatrixStack matrixStackIn, float partialTickTime) {
		if(entity.isChild()) {
			matrixStackIn.scale(0.5F, 0.5F, 0.5F);
		}
	}
	
	@Override
	public ResourceLocation getEntityTexture(HesperornithoidesEntity entity) {
		if (entity.isAlbino()) {
			if (entity.isAsleep() || entity.ticksExisted % 50 >= 0 && entity.ticksExisted % 50 <= 5) {
				return ALBINO_SLEEPING;
			} else return ALBINO;
		} else if (entity.isMelanistic()) {
			if (entity.isAsleep() || entity.ticksExisted % 50 >= 0 && entity.ticksExisted % 50 <= 5) {
				return MELANISTIC_SLEEPING;
			} else return MELANISTIC;
		} else {
			if (entity.isAsleep() || entity.ticksExisted % 50 >= 0 && entity.ticksExisted % 50 <= 5) {
				return HESPERORNITHOIDES_SLEEPING;
			} else return HESPERORNITHOIDES;
		}
	}
	
}
