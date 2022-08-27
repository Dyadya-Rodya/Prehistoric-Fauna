package superlord.prehistoricfauna.client.render.jurassic.morrison;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.client.model.jurassic.morrison.StegosaurusModel;
import superlord.prehistoricfauna.client.model.jurassic.morrison.StegosaurusSleepingModel;
import superlord.prehistoricfauna.common.entities.jurassic.morrison.StegosaurusEntity;

public class StegosaurusRenderer extends MobRenderer<StegosaurusEntity, EntityModel<StegosaurusEntity>> {

    private static final ResourceLocation STEGOSAURUS = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/stegosaurus.png");
    private static final ResourceLocation ALBINO = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/albino.png");
    private static final ResourceLocation MELANISTIC = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/melanistic.png");
    private static final ResourceLocation STEGOSAURUS_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/stegosaurus_sleeping.png");
    private static final ResourceLocation ALBINO_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/albino_sleeping.png");
    private static final ResourceLocation MELANISTIC_SLEEPING = new ResourceLocation(PrehistoricFauna.MOD_ID, "textures/entities/stegosaurus/melanistic_sleeping.png");
    private static final StegosaurusModel STEGOSAURUS_MODEL = new StegosaurusModel();
    private static final StegosaurusSleepingModel STEGOSAURUS_SLEEPING_MODEL = new StegosaurusSleepingModel();

    public StegosaurusRenderer(EntityRendererManager rm) {
        super(rm, STEGOSAURUS_MODEL, 1.25F);
    }

    protected void preRenderCallback(StegosaurusEntity entity, MatrixStack matrixStackIn, float partialTickTime) {
        if (entity.isChild()) {
            matrixStackIn.scale(0.5F, 0.5F, 0.5F);
        }
        float attackProgress = entity.getMeleeProgress(partialTickTime);
        float leftOrRight = entity.getMeleeDirection() ? 1.0F : -1.0F;
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(160F * leftOrRight * attackProgress));
    }

    public void render(StegosaurusEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        if (entityIn.isAsleep()) {
            entityModel = STEGOSAURUS_SLEEPING_MODEL;
        } else {
            entityModel = STEGOSAURUS_MODEL;
        }
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    public ResourceLocation getEntityTexture(StegosaurusEntity entity) {
        if (entity.isAlbino()) {
            if (entity.isAsleep()) {
                return ALBINO_SLEEPING;
            } else return ALBINO;
        } else if (entity.isMelanistic()) {
            if (entity.isAsleep()) {
                return MELANISTIC_SLEEPING;
            } else return MELANISTIC;
        } else {
            if (entity.isAsleep()) {
                return STEGOSAURUS_SLEEPING;
            } else return STEGOSAURUS;
        }
    }

}
