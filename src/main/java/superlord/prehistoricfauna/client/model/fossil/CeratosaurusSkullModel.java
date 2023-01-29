package superlord.prehistoricfauna.client.model.fossil;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.entities.fossil.CeratosaurusSkullEntity;

/**
 * CeratosaurusSkull - Either Mojang or a mod author (Taken From Memory)
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class CeratosaurusSkullModel extends EntityModel<CeratosaurusSkullEntity> {
    public ModelRenderer Head1;
    public ModelRenderer Jaw1;
    public ModelRenderer Snout;
    public ModelRenderer Jaw2;
    public ModelRenderer LowerTeeth;
    public ModelRenderer CrestRight;
    public ModelRenderer UpperTeeth;
    public ModelRenderer CrestLeft;
    public ModelRenderer SnoutHorn;

    public CeratosaurusSkullModel() {
        this.textureWidth = 250;
        this.textureHeight = 250;
        this.Head1 = new ModelRenderer(this, 0, 94);
        this.Head1.setRotationPoint(0.0F, 15.5F, 8.5F);
        this.Head1.addBox(-4.0F, -1.5F, -8.0F, 8.0F, 6.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.LowerTeeth = new ModelRenderer(this, 47, 150);
        this.LowerTeeth.setRotationPoint(0.0F, -1.0F, -0.99F);
        this.LowerTeeth.addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.CrestLeft = new ModelRenderer(this, 0, 140);
        this.CrestLeft.setRotationPoint(2.0F, -2.0F, 1.0F);
        this.CrestLeft.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.CrestRight = new ModelRenderer(this, 16, 140);
        this.CrestRight.setRotationPoint(-2.0F, -2.0F, 1.0F);
        this.CrestRight.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 37, 94);
        this.Snout.setRotationPoint(0.0F, 0.5F, -8.0F);
        this.Snout.addBox(-2.5F, -1.0F, -9.0F, 5.0F, 5.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.UpperTeeth = new ModelRenderer(this, 5, 152);
        this.UpperTeeth.setRotationPoint(0.0F, 4.0F, -1.01F);
        this.UpperTeeth.addBox(-2.5F, 0.0F, -8.0F, 5.0F, 2.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw1 = new ModelRenderer(this, 0, 119);
        this.Jaw1.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Jaw1.addBox(-4.0F, 0.0F, -8.0F, 8.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.SnoutHorn = new ModelRenderer(this, 0, 81);
        this.SnoutHorn.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.SnoutHorn.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw2 = new ModelRenderer(this, 37, 119);
        this.Jaw2.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Jaw2.addBox(-2.0F, -1.0F, -9.0F, 4.0F, 3.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw2.addChild(this.LowerTeeth);
        this.Snout.addChild(this.CrestLeft);
        this.Snout.addChild(this.CrestRight);
        this.Head1.addChild(this.Snout);
        this.Snout.addChild(this.UpperTeeth);
        this.Head1.addChild(this.Jaw1);
        this.Snout.addChild(this.SnoutHorn);
        this.Jaw1.addChild(this.Jaw2);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.Head1).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(CeratosaurusSkullEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
