package superlord.prehistoricfauna.client.model.cretaceous.hellcreek;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.entities.cretaceous.hellcreek.TriceratopsEntity;

/**
 * Triceratops - Undefined
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class TriceratopsSleepingModel extends EntityModel<TriceratopsEntity> {
    public ModelRenderer Body;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer RightFrontLeg;
    public ModelRenderer LeftHindLeg1;
    public ModelRenderer RightHindLeg1;
    public ModelRenderer Neck;
    public ModelRenderer Tail1;
    public ModelRenderer Head1;
    public ModelRenderer Snout;
    public ModelRenderer horn1;
    public ModelRenderer horn1_1;
    public ModelRenderer Crest;
    public ModelRenderer nasalhorn;
    public ModelRenderer Beak;
    public ModelRenderer Tail2;
    public ModelRenderer quills;
    public ModelRenderer LeftHindLeg2;
    public ModelRenderer LeftHindLeg3;
    public ModelRenderer RightHindLeg2;
    public ModelRenderer RightHindLeg3;

    public TriceratopsSleepingModel() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.RightFrontLeg = new ModelRenderer(this, 220, 75);
        this.RightFrontLeg.mirror = true;
        this.RightFrontLeg.setRotationPoint(-11.0F, 12.0F, -14.0F);
        this.RightFrontLeg.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 27.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightFrontLeg, -1.2901473511162753F, -0.35185837453889574F, 0.0F);
        this.horn1 = new ModelRenderer(this, 60, 165);
        this.horn1.setRotationPoint(4.9F, -1.0F, -12.0F);
        this.horn1.addBox(-2.0F, -4.0F, -20.0F, 3.0F, 4.0F, 25.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn1, -0.7285004590772052F, -0.18203784630933073F, 0.0F);
        this.Head1 = new ModelRenderer(this, 0, 130);
        this.Head1.setRotationPoint(0.0F, -3.0F, -16.0F);
        this.Head1.addBox(-6.0F, -3.0F, -12.0F, 12.0F, 18.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head1, -0.007330382629510778F, 0.0F, 0.0F);
        this.Crest = new ModelRenderer(this, 58, 127);
        this.Crest.setRotationPoint(0.0F, 9.0F, -3.0F);
        this.Crest.addBox(-14.0F, -23.0F, -5.0F, 28.0F, 25.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Crest, -0.591841146688116F, 0.0F, 0.0F);
        this.quills = new ModelRenderer(this, 48, 77);
        this.quills.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.quills.addBox(-3.0F, -2.0F, 0.0F, 6.0F, 2.0F, 22.0F, 0.0F, 0.0F, 0.0F);
        this.RightHindLeg3 = new ModelRenderer(this, 157, 0);
        this.RightHindLeg3.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.RightHindLeg3.addBox(-4.0F, 0.0F, -6.0F, 8.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.horn1_1 = new ModelRenderer(this, 60, 165);
        this.horn1_1.setRotationPoint(-4.9F, -1.0F, -12.0F);
        this.horn1_1.addBox(-1.0F, -4.0F, -20.0F, 3.0F, 4.0F, 25.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(horn1_1, -0.7285004590772052F, 0.18203784630933073F, 0.0F);
        this.LeftFrontLeg = new ModelRenderer(this, 220, 75);
        this.LeftFrontLeg.setRotationPoint(11.0F, 12.0F, -14.0F);
        this.LeftFrontLeg.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 27.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftFrontLeg, -1.055749693826142F, -0.03909537541112055F, -0.4300491170387584F);
        this.Snout = new ModelRenderer(this, 0, 169);
        this.Snout.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.Snout.addBox(-4.0F, 0.0F, -14.0F, 8.0F, 13.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.LeftHindLeg3 = new ModelRenderer(this, 157, 0);
        this.LeftHindLeg3.setRotationPoint(0.0F, 15.0F, 3.0F);
        this.LeftHindLeg3.addBox(-4.0F, 0.0F, -6.0F, 8.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftHindLeg3, 0.0F, 0.0F, -0.0781907508222411F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.Body.addBox(-12.0F, -8.0F, -24.0F, 24.0F, 31.0F, 43.0F, 0.0F, 0.0F, 0.0F);
        this.RightHindLeg1 = new ModelRenderer(this, 190, 0);
        this.RightHindLeg1.setRotationPoint(-11.0F, 5.0F, 14.0F);
        this.RightHindLeg1.addBox(-4.0F, -5.0F, -8.0F, 8.0F, 25.0F, 19.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightHindLeg1, -1.2119566751954398F, 0.23457224414434488F, 0.0F);
        this.LeftHindLeg1 = new ModelRenderer(this, 190, 0);
        this.LeftHindLeg1.setRotationPoint(11.0F, 5.0F, 14.0F);
        this.LeftHindLeg1.addBox(-4.0F, -5.0F, -8.0F, 8.0F, 25.0F, 19.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftHindLeg1, -1.2119566751954398F, -0.23457224414434488F, 0.0F);
        this.Neck = new ModelRenderer(this, 98, 0);
        this.Neck.setRotationPoint(0.0F, 1.0F, -22.0F);
        this.Neck.addBox(-5.0F, -5.0F, -16.0F, 10.0F, 19.0F, 19.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.27366763203903305F, -0.5473352640780661F, 0.0F);
        this.RightHindLeg2 = new ModelRenderer(this, 190, 50);
        this.RightHindLeg2.setRotationPoint(0.0F, 15.0F, 11.0F);
        this.RightHindLeg2.addBox(-3.0F, -4.0F, -2.0F, 6.0F, 19.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightHindLeg2, 2.62218276407008F, 0.0F, -0.23457224414434488F);
        this.Beak = new ModelRenderer(this, 0, 204);
        this.Beak.setRotationPoint(0.0F, 2.0F, -14.0F);
        this.Beak.addBox(-2.0F, 0.0F, -5.0F, 4.0F, 12.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 77);
        this.Tail1.setRotationPoint(0.0F, -1.0F, 19.0F);
        this.Tail1.addBox(-6.0F, -3.0F, -2.0F, 12.0F, 13.0F, 24.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.5141739816585629F, 0.35185837453889574F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 82, 77);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 19.0F);
        this.Tail2.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 8.0F, 27.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.16929693411449862F, 0.35185837453889574F, 0.1563815016444822F);
        this.nasalhorn = new ModelRenderer(this, 0, 0);
        this.nasalhorn.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.nasalhorn.addBox(-1.0F, -5.0F, -3.0F, 2.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(nasalhorn, 0.6373942508178124F, 0.0F, 0.0F);
        this.LeftHindLeg2 = new ModelRenderer(this, 190, 50);
        this.LeftHindLeg2.setRotationPoint(0.0F, 15.0F, 11.0F);
        this.LeftHindLeg2.addBox(-3.0F, -4.0F, -2.0F, 6.0F, 19.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftHindLeg2, 2.62218276407008F, 0.0F, 0.23457224414434488F);
        this.Head1.addChild(this.horn1);
        this.Neck.addChild(this.Head1);
        this.Head1.addChild(this.Crest);
        this.Tail1.addChild(this.quills);
        this.RightHindLeg2.addChild(this.RightHindLeg3);
        this.Head1.addChild(this.horn1_1);
        this.Head1.addChild(this.Snout);
        this.LeftHindLeg2.addChild(this.LeftHindLeg3);
        this.Body.addChild(this.Neck);
        this.RightHindLeg1.addChild(this.RightHindLeg2);
        this.Snout.addChild(this.Beak);
        this.Body.addChild(this.Tail1);
        this.Tail1.addChild(this.Tail2);
        this.Snout.addChild(this.nasalhorn);
        this.LeftHindLeg1.addChild(this.LeftHindLeg2);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.RightFrontLeg, this.LeftFrontLeg, this.Body, this.RightHindLeg1, this.LeftHindLeg1).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(TriceratopsEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
