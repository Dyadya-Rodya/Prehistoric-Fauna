package superlord.prehistoricfauna.entity.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.entity.TyrannosaurusSkeletonEntity;

/**
 * TyrannosaurusrexSkeleto - Either Mojang or a mod author (Taken From Memory)
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class Tyrannosaurusrexskeleton extends EntityModel<TyrannosaurusSkeletonEntity> {
    public ModelRenderer LeftLeg1;
    public ModelRenderer RightLeg1;
    public ModelRenderer Body1;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftFeet;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightFeet;
    public ModelRenderer Tail1;
    public ModelRenderer Body2;
    public ModelRenderer HipCenter;
    public ModelRenderer Tail2;
    public ModelRenderer TailVert;
    public ModelRenderer Tail2Vert;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer Neck;
    public ModelRenderer ChestCenter;
    public ModelRenderer Head1;
    public ModelRenderer NeckCenter;
    public ModelRenderer Snout;
    public ModelRenderer Jaw1;
    public ModelRenderer Jaw3;
    public ModelRenderer Jaw2;

    public Tyrannosaurusrexskeleton() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Jaw1 = new ModelRenderer(this, 0, 186);
        this.Jaw1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Jaw1.addBox(-7.0F, 0.0F, -11.0F, 14.0F, 7.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.Head1 = new ModelRenderer(this, 0, 157);
        this.Head1.setRotationPoint(0.0F, -17.1F, -7.0F);
        this.Head1.addBox(-7.0F, -4.0F, -11.0F, 14.0F, 11.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.NeckCenter = new ModelRenderer(this, 0, 0);
        this.NeckCenter.setRotationPoint(0.0F, -21.0F, 3.0F);
        this.NeckCenter.setTextureOffset(214, 180).addBox(0.0F, 0.0F, -16.0F, 0.0F, 29.0F, 16.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(NeckCenter, -0.001745329278001762F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 69, 0);
        this.RightArm.mirror = true;
        this.RightArm.setRotationPoint(-10.1F, 19.0F, -13.0F);
        this.RightArm.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(RightArm, 0.27314400463445304F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 8, 69);
        this.Tail1.setRotationPoint(0.0F, -3.0F, 17.0F);
        this.Tail1.addBox(-5.0F, -2.0F, -8.0F, 10.0F, 18.0F, 58.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.04555309164612875F, 0.0F, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 0);
        this.Body1.setRotationPoint(0.0F, -29.0F, 0.0F);
        this.Body1.addBox(-7.5F, -7.0F, -16.0F, 15.0F, 33.0F, 33.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.006283185556850939F, 0.0F);
        this.Jaw3 = new ModelRenderer(this, 47, 181);
        this.Jaw3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Jaw3.addBox(-5.5F, -5.0F, 0.0F, 11.0F, 5.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 167, 66);
        this.Neck.setRotationPoint(0.0F, 5.0F, -21.0F);
        this.Neck.addBox(-5.0F, -21.0F, -13.0F, 10.0F, 29.0F, 16.0F, 0.0F, 0.0F, 0.0F);
        this.ChestCenter = new ModelRenderer(this, 0, 0);
        this.ChestCenter.setRotationPoint(0.0F, -7.0F, -23.0F);
        this.ChestCenter.setTextureOffset(73, 175).addBox(0.0F, 0.0F, 0.0F, 0.0F, 28.0F, 31.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ChestCenter, -0.001745329278001762F, 0.0F, 0.0F);
        this.LeftFeet = new ModelRenderer(this, 98, 50);
        this.LeftFeet.setRotationPoint(0.0F, 22.0F, 5.0F);
        this.LeftFeet.addBox(-4.0F, -1.0F, -13.0F, 8.0F, 3.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 212, 142);
        this.RightLeg2.mirror = true;
        this.RightLeg2.setRotationPoint(-2.0F, 26.0F, 5.0F);
        this.RightLeg2.addBox(-3.0F, -8.0F, -1.0F, 6.0F, 30.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 96, 72);
        this.LeftLeg2.setRotationPoint(2.0F, 26.0F, 5.0F);
        this.LeftLeg2.addBox(-3.0F, -8.0F, -1.0F, 6.0F, 30.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.HipCenter = new ModelRenderer(this, 0, 0);
        this.HipCenter.setRotationPoint(0.0F, -10.0F, -16.0F);
        this.HipCenter.setTextureOffset(139, 180).addBox(0.0F, 0.0F, 0.0F, 0.0F, 33.0F, 33.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HipCenter, -0.001745329278001762F, 0.0F, 0.0F);
        this.Body2 = new ModelRenderer(this, 146, 0);
        this.Body2.setRotationPoint(0.0F, -2.0F, -16.0F);
        this.Body2.addBox(-11.0F, -4.0F, -23.0F, 22.0F, 26.0F, 31.0F, 0.0F, 0.0F, 0.0F);
        this.TailVert = new ModelRenderer(this, 0, 0);
        this.TailVert.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.TailVert.setTextureOffset(0, 189).addBox(0.0F, 0.0F, 0.0F, 0.0F, 16.0F, 50.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 10, 78);
        this.LeftLeg1.setRotationPoint(6.0F, -26.0F, 3.0F);
        this.LeftLeg1.addBox(-3.0F, -6.0F, -9.0F, 10.0F, 30.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 92, 61);
        this.Tail2.setRotationPoint(0.0F, -2.0F, 50.0F);
        this.Tail2.addBox(-3.0F, 2.0F, -7.0F, 6.0F, 11.0F, 54.0F, 0.0F, 0.0F, 0.0F);
        this.Tail2Vert = new ModelRenderer(this, 0, 0);
        this.Tail2Vert.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.Tail2Vert.setTextureOffset(130, 193).addBox(0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 53.0F, 0.0F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 69, 0);
        this.LeftArm.setRotationPoint(10.1F, 19.0F, -13.0F);
        this.LeftArm.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LeftArm, 0.27314400463445304F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 57, 150);
        this.Snout.setRotationPoint(0.0F, -2.0F, -11.0F);
        this.Snout.addBox(-4.0F, 0.0F, -16.0F, 8.0F, 12.0F, 16.0F, 0.0F, 0.0F, 0.0F);
        this.RightFeet = new ModelRenderer(this, 98, 50);
        this.RightFeet.setRotationPoint(0.0F, 22.0F, 5.0F);
        this.RightFeet.addBox(-4.0F, -1.0F, -13.0F, 8.0F, 3.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 152, 126);
        this.RightLeg1.setRotationPoint(-6.0F, -26.0F, 3.0F);
        this.RightLeg1.addBox(-7.0F, -6.0F, -9.0F, 10.0F, 30.1F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw2 = new ModelRenderer(this, 4, 211);
        this.Jaw2.setRotationPoint(0.0F, -1.0F, -11.0F);
        this.Jaw2.addBox(-3.0F, 0.0F, -15.0F, 6.0F, 7.0F, 17.0F, 0.0F, 0.0F, 0.0F);
        this.Head1.addChild(this.Jaw1);
        this.Neck.addChild(this.Head1);
        this.Neck.addChild(this.NeckCenter);
        this.Body2.addChild(this.RightArm);
        this.Body1.addChild(this.Tail1);
        this.Jaw1.addChild(this.Jaw3);
        this.Body2.addChild(this.Neck);
        this.Body2.addChild(this.ChestCenter);
        this.LeftLeg2.addChild(this.LeftFeet);
        this.RightLeg1.addChild(this.RightLeg2);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Body1.addChild(this.HipCenter);
        this.Body1.addChild(this.Body2);
        this.Tail1.addChild(this.TailVert);
        this.Tail1.addChild(this.Tail2);
        this.Tail2.addChild(this.Tail2Vert);
        this.Body2.addChild(this.LeftArm);
        this.Head1.addChild(this.Snout);
        this.RightLeg2.addChild(this.RightFeet);
        this.Jaw1.addChild(this.Jaw2);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.Body1, this.LeftLeg1, this.RightLeg1).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(TyrannosaurusSkeletonEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
