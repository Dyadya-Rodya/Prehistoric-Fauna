package superlord.prehistoricfauna.client.render.henos;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.client.model.henos.HenosModel;
import superlord.prehistoricfauna.client.model.henos.HenosSummonedModel;
import superlord.prehistoricfauna.client.render.PFRenderTypes;
import superlord.prehistoricfauna.client.render.layer.HenosGemGlowLayer;
import superlord.prehistoricfauna.common.entities.henos.TimeGuardianEntity;

@OnlyIn(Dist.CLIENT)
public class BossRenderer extends MobRenderer<TimeGuardianEntity, EntityModel<TimeGuardianEntity>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/henos.png");
	private static final ResourceLocation SUMMONED_TEXTURE = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/henos_summoned.png");
	private static final ResourceLocation FUNKY_MONKEY = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/brass_monkey.png");
	private static final ResourceLocation TEXTURE_LIT = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/henos_lit.png");
	private static final ResourceLocation SUMMONED_TEXTURE_LIT = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/henos_summoned_lit.png");
	private static final ResourceLocation FUNKY_MONKEY_LIT = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/brass_monkey_lit.png");
    private static final HenosModel HENOS = new HenosModel(0.0F);
    private static final HenosSummonedModel SUMMONED = new HenosSummonedModel(0.0F);
    private static final HenosModel HENOS_HEALING = new HenosModel(0.5F);
    private static final HenosSummonedModel SUMMONED_HEALING = new HenosSummonedModel(0.5F);

    private static final ResourceLocation BEAM_TEXTURE = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/henos/beam.png");
    private static final RenderType BEAM_RENDER_TYPE = PFRenderTypes.getBossBeam(BEAM_TEXTURE);
    
	public BossRenderer(EntityRendererManager rm) {
        super(Minecraft.getInstance().getRenderManager(), HENOS, 1.25F);
		this.addLayer(new HenosGemGlowLayer(this));
		this.addLayer(new HealingLayer(this));
	}

	private static void func_229108_a_(IVertexBuilder p_229108_0_, Matrix4f p_229108_1_, Matrix3f p_229108_2_, float p_229108_3_, float p_229108_4_, float p_229108_5_, int p_229108_6_, int p_229108_7_, int p_229108_8_, float p_229108_9_, float p_229108_10_) {
		p_229108_0_.pos(p_229108_1_, p_229108_3_, p_229108_4_, p_229108_5_).color(p_229108_6_, p_229108_7_, p_229108_8_, 255).tex(p_229108_9_, p_229108_10_).overlay(OverlayTexture.NO_OVERLAY).lightmap(240).normal(p_229108_2_, 0.0F, 1.0F, 0.0F).endVertex();
	}

	public boolean shouldRender(TimeGuardianEntity livingEntityIn, ClippingHelper camera, double camX, double camY, double camZ) {
		if (super.shouldRender(livingEntityIn, camera, camX, camY, camZ)) {
			return true;
		} else {
			if (livingEntityIn.hasLaserTarget()) {
				Entity livingentity = livingEntityIn.getLaserTarget();
				if (livingentity != null) {
					Vector3d vec3d = livingEntityIn.getLaserTargetPos(1.0F);
					Vector3d vec3d1 = this.getPosition(livingEntityIn, livingEntityIn.getEyeHeight(), 1.0F);
					return camera.isBoundingBoxInFrustum(new AxisAlignedBB(vec3d1.x, vec3d1.y, vec3d1.z, vec3d.x, vec3d.y, vec3d.z));
				}
			}

			return false;
		}
	}

	private Vector3d getPosition(Entity entityLivingBaseIn, double p_177110_2_, float p_177110_4_) {
		double d0 = MathHelper.lerp(p_177110_4_, entityLivingBaseIn.lastTickPosX, entityLivingBaseIn.getPosX());
		double d1 = MathHelper.lerp(p_177110_4_, entityLivingBaseIn.lastTickPosY, entityLivingBaseIn.getPosY()) + p_177110_2_;
		double d2 = MathHelper.lerp(p_177110_4_, entityLivingBaseIn.lastTickPosZ, entityLivingBaseIn.getPosZ());
		return new Vector3d(d0, d1, d2);
	}

	protected void applyRotations(TimeGuardianEntity entityIn, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityIn, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
		Vector3d vec = entityIn.getLaserTargetPos(partialTicks);
		double d0 = vec.x - entityIn.getPosX();
		double d2 = vec.z - entityIn.getPosZ();
		float f1 = MathHelper.wrapDegrees(180.0F - rotationYaw);
		float f2 = MathHelper.wrapDegrees((float)(MathHelper.atan2(d2, d0) * (double)(180F / (float)Math.PI)) + 90.0F);
		float f3 = entityIn.getLaserTargetProgress(partialTicks);
		matrixStackIn.rotate(Vector3f.YN.rotationDegrees(f1 * f3));
		matrixStackIn.rotate(Vector3f.YN.rotationDegrees(f2 * f3));
	}

	public void render(TimeGuardianEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
		if (entityIn.isSummoned()) {
            entityModel = SUMMONED;
        } else {
            entityModel = HENOS;
        }
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		Entity livingentity = entityIn.getLaserTarget();
		if (livingentity != null) {
			float f1 = (float) entityIn.world.getGameTime() + partialTicks;
			float f2 = f1 * -0.2F % 1.0F;
			float f3 = entityIn.getHeight() * 0.625F;
			matrixStackIn.push();
			matrixStackIn.translate(0.0D, f3, 0.0D);
			Vector3d vector3d = entityIn.getLaserTargetPos(partialTicks);
			Vector3d vector3d1 = this.getPosition(entityIn, f3, partialTicks);
			Vector3d vector3d2 = vector3d.subtract(vector3d1);
			float f4 = (float) (vector3d2.length());
			vector3d2 = vector3d2.normalize();
			float f5 = (float) Math.acos(vector3d2.y);
			float f6 = (float) Math.atan2(vector3d2.z, vector3d2.x);
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees((((float) Math.PI / 2F) - f6) * (180F / (float) Math.PI)));
			matrixStackIn.rotate(Vector3f.XP.rotationDegrees(f5 * (180F / (float) Math.PI)));
			float f8 = 1F;
			int j = (int) (f8 * 255.0F);
			int k = (int) (f8 * 255.0F);
			int l = (int) (f8 * 255.0F);
			float width = (100 - (100 - MathHelper.clamp(entityIn.getLaserTick(), 5, 100))) * 0.01F;
			float f11 = MathHelper.cos(0 + 2.3561945F) * 0.8F;
			float f12 = MathHelper.sin(0 + 2.3561945F) * 0.8F;
			float f13 = MathHelper.cos(0 + ((float) Math.PI / 4F)) * 0.8F;
			float f14 = MathHelper.sin(0 + ((float) Math.PI / 4F)) * 0.8F;
			float f15 = MathHelper.cos(0 + 3.926991F) * 0.8F;
			float f16 = MathHelper.sin(0 + 3.926991F) * 0.8F;
			float f17 = MathHelper.cos(0 + 5.4977875F) * 0.8F;
			float f18 = MathHelper.sin(0 + 5.4977875F) * 0.8F;
			float f19 = MathHelper.cos(0 + (float) Math.PI) * width;
			float f20 = MathHelper.sin(0 + (float) Math.PI) * width;
			float f21 = MathHelper.cos(0 + 0.0F) * width;
			float f22 = MathHelper.sin(0 + 0.0F) * width;
			float f23 = MathHelper.cos(0 + ((float) Math.PI / 2F)) * width;
			float f24 = MathHelper.sin(0 + ((float) Math.PI / 2F)) * width;
			float f25 = MathHelper.cos(0 + ((float) Math.PI * 1.5F)) * width;
			float f26 = MathHelper.sin(0 + ((float) Math.PI * 1.5F)) * width;
			float f29 = -1.0F + f2;
			float f30 = f4 * 0.5F + f29;
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(BEAM_RENDER_TYPE);
			MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
			Matrix4f matrix4f = matrixstack$entry.getMatrix();
			Matrix3f matrix3f = matrixstack$entry.getNormal();
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f19, f4, f20, j, k, l, 0.4999F, f30);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f19, 0.0F, f20, j, k, l, 0.4999F, f29);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f21, 0.0F, f22, j, k, l, 0.0F, f29);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f21, f4, f22, j, k, l, 0.0F, f30);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f23, f4, f24, j, k, l, 0.4999F, f30);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f23, 0.0F, f24, j, k, l, 0.4999F, f29);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f25, 0.0F, f26, j, k, l, 0.0F, f29);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f25, f4, f26, j, k, l, 0.0F, f30);

			float f31 = 0.0F;
			if (entityIn.ticksExisted % 2 == 0) {
				f31 = 0.5F;
			}

			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f11, f4, f12, j, k, l, 0.5F, f31 + 0.5F);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f13, f4, f14, j, k, l, 1.0F, f31 + 0.5F);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f17, f4, f18, j, k, l, 1.0F, f31);
			func_229108_a_(ivertexbuilder, matrix4f, matrix3f, f15, f4, f16, j, k, l, 0.5F, f31);
			matrixStackIn.pop();
		}
	}

	public ResourceLocation getEntityTexture(TimeGuardianEntity entity) {
		String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName().getString());
		if (!entity.isSummoned() && s != null && "Brass Monkey".equals(s)) {
			if (entity.getLaserTick() > 0) {
				return FUNKY_MONKEY_LIT;
			} else {
				return FUNKY_MONKEY;
			}
		}
		if (entity.isSummoned()) {
			if (entity.getLaserTick() > 0) {
				return SUMMONED_TEXTURE_LIT;
			} else {
				return SUMMONED_TEXTURE;
			}
		} else {
			if (entity.getLaserTick() > 0) {
				return TEXTURE_LIT;
			} else {
				return TEXTURE;
			}
		}
	}

	class HealingLayer extends LayerRenderer<TimeGuardianEntity, EntityModel<TimeGuardianEntity>>{

		public HealingLayer(IEntityRenderer<TimeGuardianEntity, EntityModel<TimeGuardianEntity>> entityRendererIn) {
			super(entityRendererIn);
		}

		@Override
		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, TimeGuardianEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			if(entitylivingbaseIn.hasHealingShield()){
				EntityModel<TimeGuardianEntity> model = entitylivingbaseIn.isSummoned() ? SUMMONED_HEALING : HENOS_HEALING;
				IVertexBuilder vertexBuilder = bufferIn.getBuffer(PFRenderTypes.getBossGlint());
				model.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.render(matrixStackIn, vertexBuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, entitylivingbaseIn.getShieldThickness());
			}
		}
	}
}