package superlord.prehistoricfauna.client.model.jurassic.morrison;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.entities.jurassic.morrison.AllosaurusEntity;

/**
 * AllosaurusModel - Undefined
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class AllosaurusModel extends EntityModel<AllosaurusEntity> {
    public ModelRenderer Body1;
    public ModelRenderer LeftLeg1;
    public ModelRenderer RightLeg1;
    public ModelRenderer Body2;
    public ModelRenderer Tail1;
    public ModelRenderer Neck;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Head1;
    public ModelRenderer Snout;
    public ModelRenderer Jaw1;
    public ModelRenderer Snout2;
    public ModelRenderer CrestLeft;
    public ModelRenderer CrestRight;
    public ModelRenderer UpperTeeth;
    public ModelRenderer Jaw2;
    public ModelRenderer Jaw3;
    public ModelRenderer LowerTeeth;
    public ModelRenderer Tail2;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftFoot;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightFoot;

    public AllosaurusModel() {
        this.textureWidth = 250;
        this.textureHeight = 250;
        this.RightArm = new ModelRenderer(this, 73, 51);
        this.RightArm.setRotationPoint(-5.0F, 12.0F, -11.0F);
        this.RightArm.addBox(-4.0F, -2.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.LowerTeeth = new ModelRenderer(this, 47, 203);
        this.LowerTeeth.setRotationPoint(0.0F, -1.01F, -0.5F);
        this.LowerTeeth.addBox(-3.0F, -2.0F, -12.0F, 6.0F, 5.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 0);
        this.Body1.setRotationPoint(0.0F, -16.0F, 9.0F);
        this.Body1.addBox(-7.5F, -5.0F, -11.0F, 15.0F, 23.0F, 25.0F, 0.0F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 110, 43);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Tail1.addBox(-6.0F, -4.0F, 0.0F, 12.0F, 14.0F, 32.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw1 = new ModelRenderer(this, 0, 119);
        this.Jaw1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Jaw1.addBox(-5.0F, -1.0F, -12.0F, 10.0F, 5.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 128, 153);
        this.RightLeg1.setRotationPoint(-1.0F, -12.0F, 9.0F);
        this.RightLeg1.addBox(-8.0F, -3.0F, -6.0F, 8.0F, 21.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.CrestLeft = new ModelRenderer(this, 0, 191);
        this.CrestLeft.setRotationPoint(3.0F, -3.0F, 1.0F);
        this.CrestLeft.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 47, 94);
        this.Snout.setRotationPoint(0.0F, -3.0F, -12.0F);
        this.Snout.addBox(-3.5F, -3.0F, -9.0F, 7.0F, 7.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 51);
        this.Neck.setRotationPoint(0.0F, 5.0F, -17.0F);
        this.Neck.addBox(-3.5F, -21.0F, -12.0F, 7.0F, 24.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.Snout2 = new ModelRenderer(this, 83, 94);
        this.Snout2.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.Snout2.addBox(-3.5F, -2.0F, -4.0F, 7.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 80, 222);
        this.LeftFoot.setRotationPoint(0.0F, 19.0F, 2.0F);
        this.LeftFoot.addBox(-4.0F, 0.0F, -11.0F, 8.0F, 3.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 51, 51);
        this.LeftArm.setRotationPoint(5.0F, 12.0F, -11.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Head1 = new ModelRenderer(this, 0, 94);
        this.Head1.setRotationPoint(0.0F, -14.1F, -4.0F);
        this.Head1.addBox(-5.0F, -7.0F, -12.0F, 10.0F, 7.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.UpperTeeth = new ModelRenderer(this, 5, 203);
        this.UpperTeeth.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.UpperTeeth.addBox(-3.0F, -4.01F, -12.5F, 6.0F, 6.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 93, 192);
        this.LeftLeg2.setRotationPoint(4.0F, 14.0F, 8.0F);
        this.LeftLeg2.addBox(-3.5F, 0.0F, -3.0F, 7.0F, 20.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.CrestRight = new ModelRenderer(this, 16, 191);
        this.CrestRight.setRotationPoint(-3.0F, -3.0F, 1.0F);
        this.CrestRight.addBox(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 76, 153);
        this.LeftLeg1.setRotationPoint(1.0F, -12.0F, 9.0F);
        this.LeftLeg1.addBox(0.0F, -3.0F, -6.0F, 8.0F, 21.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw3 = new ModelRenderer(this, 0, 149);
        this.Jaw3.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.Jaw3.addBox(-4.0F, -7.99F, -11.0F, 8.0F, 7.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.RightFoot = new ModelRenderer(this, 126, 222);
        this.RightFoot.setRotationPoint(0.0F, 19.0F, 2.0F);
        this.RightFoot.addBox(-4.0F, 0.0F, -11.0F, 8.0F, 3.0F, 11.0F, 0.0F, 0.0F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 126, 192);
        this.RightLeg2.setRotationPoint(-4.0F, 14.0F, 8.0F);
        this.RightLeg2.addBox(-3.5F, 0.0F, -3.0F, 7.0F, 20.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.Body2 = new ModelRenderer(this, 81, 0);
        this.Body2.setRotationPoint(0.0F, 1.0F, -11.0F);
        this.Body2.addBox(-8.5F, -5.0F, -20.0F, 17.0F, 21.0F, 20.0F, 0.0F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 92, 91);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 32.0F);
        this.Tail2.addBox(-3.0F, -4.0F, 0.0F, 6.0F, 8.0F, 48.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw2 = new ModelRenderer(this, 47, 119);
        this.Jaw2.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.Jaw2.addBox(-3.5F, -1.0F, -13.0F, 7.0F, 3.0F, 13.0F, 0.0F, 0.0F, 0.0F);
        this.Body2.addChild(this.RightArm);
        this.Jaw2.addChild(this.LowerTeeth);
        this.Body1.addChild(this.Tail1);
        this.Head1.addChild(this.Jaw1);
        this.Snout.addChild(this.CrestLeft);
        this.Head1.addChild(this.Snout);
        this.Body2.addChild(this.Neck);
        this.Snout.addChild(this.Snout2);
        this.LeftLeg2.addChild(this.LeftFoot);
        this.Body2.addChild(this.LeftArm);
        this.Neck.addChild(this.Head1);
        this.Snout.addChild(this.UpperTeeth);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Snout.addChild(this.CrestRight);
        this.Jaw1.addChild(this.Jaw3);
        this.RightLeg2.addChild(this.RightFoot);
        this.RightLeg1.addChild(this.RightLeg2);
        this.Body1.addChild(this.Body2);
        this.Tail1.addChild(this.Tail2);
        this.Jaw1.addChild(this.Jaw2);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.Body1, this.RightLeg1, this.LeftLeg1).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(AllosaurusEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float walkSpeed = 1.0f;
        float walkDegree = 0.5f;
        float idleSpeed = 1.0f;
        float idleDegree = 1.0f;
        float partialTick = ageInTicks - entityIn.ticksExisted;
        float attackProgress = entityIn.getMeleeProgress(partialTick);
        float leftOrRight = entityIn.getMeleeDirection() ? 1.0F : -1.0F;
        this.Neck.rotateAngleX = (MathHelper.cos(-1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.3F * limbSwingAmount + 0.35F) + (headPitch * ((float) Math.PI / 180F)) + attackProgress * (float)Math.toRadians(30F);
        this.Body2.rotateAngleX = MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.01F * limbSwingAmount;
        this.Body1.rotateAngleX = Math.abs(-0.025F * MathHelper.sin(0.1F * ageInTicks / 3)) + MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.1F * limbSwingAmount;
        this.Tail1.rotateAngleX = -Math.abs(-0.05F * MathHelper.sin(0.1F * ageInTicks / 5)) + MathHelper.cos(limbSwing * walkSpeed * 0.3F) * walkDegree * 0.1F * limbSwingAmount - 0.05F;
        this.Tail2.rotateAngleX = -Math.abs(-0.05F * MathHelper.sin(0.1F * ageInTicks / 5)) + MathHelper.cos(-1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.15F * limbSwingAmount + 0.05F;
        this.Tail1.rotateAngleY = -0.12F * MathHelper.sin(0.2F * ageInTicks / 5) + MathHelper.cos(limbSwing * walkSpeed * 0.15F) * walkDegree * 0.6F * limbSwingAmount;
        this.Tail2.rotateAngleY = -0.12F * MathHelper.sin(0.2F * ageInTicks / 5) + MathHelper.cos(limbSwing * walkSpeed * 0.15F) * walkDegree * 1.0F * limbSwingAmount;
        this.Head1.rotateAngleX = MathHelper.cos(-1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.25F * limbSwingAmount - 0.2F + attackProgress * (float)Math.toRadians(-40F);
        this.Jaw1.rotateAngleX = attackProgress * (float) Math.toRadians(25F);
        this.Neck.rotateAngleZ = attackProgress * leftOrRight * (float) Math.toRadians(15F);
        this.Head1.rotateAngleZ = attackProgress * leftOrRight * (float) Math.toRadians(15F);
        this.LeftArm.rotateAngleX = -Math.abs(-0.05F * MathHelper.sin(0.15F * ageInTicks / 3)) + MathHelper.cos(limbSwing * walkSpeed * 0.3F) * walkDegree * 0.2F * limbSwingAmount + 0.15F;
        this.RightArm.rotateAngleX = Math.abs(-0.05F * MathHelper.sin(0.15F * ageInTicks / 3)) + MathHelper.cos(2.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.2F * limbSwingAmount + 0.15F;
        this.LeftLeg1.rotateAngleX = MathHelper.cos(1.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * 0.6F * limbSwingAmount - 0.05F + MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.6F * limbSwingAmount - 0.05F;
        this.LeftLeg2.rotateAngleX = MathHelper.cos(1.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * 0.4F * limbSwingAmount + 0.05F + MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.4F * limbSwingAmount + 0.05F;
        this.LeftFoot.rotateAngleX = MathHelper.cos(2.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * 0.3F * limbSwingAmount + MathHelper.cos(2.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * 0.3F * limbSwingAmount;
        this.RightLeg1.rotateAngleX = MathHelper.cos(1.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * -0.6F * limbSwingAmount - 0.05F + MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * -0.6F * limbSwingAmount - 0.05F;
        this.RightLeg2.rotateAngleX = MathHelper.cos(1.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * -0.4F * limbSwingAmount + 0.05F + MathHelper.cos(1.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * -0.4F * limbSwingAmount + 0.05F;
        this.RightFoot.rotateAngleX = MathHelper.cos(2.0F + limbSwing * idleSpeed * 0.3F) * idleDegree * -0.3F * limbSwingAmount + MathHelper.cos(2.0F + limbSwing * walkSpeed * 0.3F) * walkDegree * -0.3F * limbSwingAmount;
        this.Neck.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
