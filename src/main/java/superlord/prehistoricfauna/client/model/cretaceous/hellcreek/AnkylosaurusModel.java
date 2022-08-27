package superlord.prehistoricfauna.client.model.cretaceous.hellcreek;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.entities.cretaceous.hellcreek.AnkylosaurusEntity;

/**
 * Ankylosaurus - Bastion
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class AnkylosaurusModel extends EntityModel<AnkylosaurusEntity> {
	public ModelRenderer Body;
	public ModelRenderer Tail1;
	public ModelRenderer LeftArm;
	public ModelRenderer RightArm;
	public ModelRenderer Neck;
	public ModelRenderer RightThigh;
	public ModelRenderer LeftThigh;
	public ModelRenderer Tail2;
	public ModelRenderer TailClub;
	public ModelRenderer Head;
	public ModelRenderer Snout;
	public ModelRenderer LeftOsteoderm;
	public ModelRenderer LeftCheekbone;
	public ModelRenderer RightOsteoderm;
	public ModelRenderer RightCheekbone;
	public ModelRenderer RightLeg;
	public ModelRenderer RightFoot;
	public ModelRenderer LeftLeg;
	public ModelRenderer LeftFoot;

	public AnkylosaurusModel() {
		this.textureWidth = 200;
		this.textureHeight = 200;
		this.Head = new ModelRenderer(this, 0, 91);
		this.Head.setRotationPoint(0.0F, 1.0F, -6.0F);
		this.Head.addBox(-6.0F, -4.0F, -13.0F, 12.0F, 10.0F, 13.0F, 0.0F, 0.0F, 0.0F);
		this.LeftLeg = new ModelRenderer(this, 64, 167);
		this.LeftLeg.setRotationPoint(2.0F, 11.0F, 4.0F);
		this.LeftLeg.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.TailClub = new ModelRenderer(this, 157, 13);
		this.TailClub.setRotationPoint(0.0F, 0.0F, 15.0F);
		this.TailClub.addBox(-5.0F, -1.0F, 0.0F, 10.0F, 6.0F, 11.0F, 0.0F, 0.0F, 0.0F);
		this.Snout = new ModelRenderer(this, 57, 91);
		this.Snout.setRotationPoint(0.0F, 1.0F, -13.0F);
		this.Snout.addBox(-4.0F, -3.0F, -2.0F, 8.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.LeftOsteoderm = new ModelRenderer(this, 154, 63);
		this.LeftOsteoderm.setRotationPoint(3.0F, -3.0F, -2.0F);
		this.LeftOsteoderm.addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(LeftOsteoderm, 0.12566370281464037F, 0.25132740562928074F, -0.0F);
		this.LeftThigh = new ModelRenderer(this, 64, 136);
		this.LeftThigh.setRotationPoint(9.5F, 1.0F, 1.0F);
		this.LeftThigh.addBox(-2.0F, -1.0F, -5.0F, 8.0F, 15.0F, 11.0F, 0.0F, 0.0F, 0.0F);
		this.RightThigh = new ModelRenderer(this, 105, 136);
		this.RightThigh.setRotationPoint(-9.5F, 1.0F, 1.0F);
		this.RightThigh.addBox(-6.0F, -1.0F, -5.0F, 8.0F, 15.0F, 11.0F, 0.0F, 0.0F, 0.0F);
		this.RightOsteoderm = new ModelRenderer(this, 132, 63);
		this.RightOsteoderm.setRotationPoint(-3.0F, -3.0F, -2.0F);
		this.RightOsteoderm.addBox(-4.0F, -2.0F, 0.0F, 4.0F, 4.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(RightOsteoderm, 0.12566370281464037F, -0.25132740562928074F, -0.0F);
		this.Neck = new ModelRenderer(this, 0, 63);
		this.Neck.setRotationPoint(0.0F, -3.0F, -31.0F);
		this.Neck.addBox(-5.0F, 0.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, 0.0F, 0.0F);
		this.LeftCheekbone = new ModelRenderer(this, 154, 79);
		this.LeftCheekbone.setRotationPoint(3.0F, 3.0F, -2.0F);
		this.LeftCheekbone.addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(LeftCheekbone, 0.0F, 0.18849556254433897F, -0.0F);
		this.RightCheekbone = new ModelRenderer(this, 136, 78);
		this.RightCheekbone.setRotationPoint(-3.0F, 3.0F, -2.0F);
		this.RightCheekbone.addBox(-4.0F, -2.0F, 0.0F, 4.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(RightCheekbone, 0.0F, -0.18849556254433897F, -0.0F);
		this.RightLeg = new ModelRenderer(this, 92, 167);
		this.RightLeg.setRotationPoint(-2.0F, 11.0F, 4.0F);
		this.RightLeg.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.Tail2 = new ModelRenderer(this, 157, 31);
		this.Tail2.setRotationPoint(0.0F, 2.0F, 18.0F);
		this.Tail2.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 4.0F, 16.0F, 0.0F, 0.0F, 0.0F);
		this.LeftFoot = new ModelRenderer(this, 64, 188);
		this.LeftFoot.setRotationPoint(0.0F, 9.0F, 0.0F);
		this.LeftFoot.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.LeftArm = new ModelRenderer(this, 64, 110);
		this.LeftArm.setRotationPoint(8.5F, 9.0F, -26.0F);
		this.LeftArm.addBox(0.0F, -1.0F, -3.0F, 6.0F, 15.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.RightFoot = new ModelRenderer(this, 95, 188);
		this.RightFoot.setRotationPoint(0.0F, 9.0F, 0.0F);
		this.RightFoot.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.Body = new ModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 1.0F, 12.0F);
		this.Body.addBox(-14.0F, -5.0F, -31.0F, 28.0F, 19.0F, 41.0F, 0.0F, 0.0F, 0.0F);
		this.Tail1 = new ModelRenderer(this, 101, 0);
		this.Tail1.setRotationPoint(0.0F, -3.0F, 10.0F);
		this.Tail1.addBox(-5.0F, 0.0F, 0.0F, 10.0F, 10.0F, 18.0F, 0.0F, 0.0F, 0.0F);
		this.RightArm = new ModelRenderer(this, 91, 110);
		this.RightArm.setRotationPoint(-8.5F, 9.0F, -26.0F);
		this.RightArm.addBox(-6.0F, -1.0F, -3.0F, 6.0F, 15.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.Neck.addChild(this.Head);
		this.LeftThigh.addChild(this.LeftLeg);
		this.Tail2.addChild(this.TailClub);
		this.Head.addChild(this.Snout);
		this.Head.addChild(this.LeftOsteoderm);
		this.Body.addChild(this.LeftThigh);
		this.Body.addChild(this.RightThigh);
		this.Head.addChild(this.RightOsteoderm);
		this.Body.addChild(this.Neck);
		this.Head.addChild(this.LeftCheekbone);
		this.Head.addChild(this.RightCheekbone);
		this.RightThigh.addChild(this.RightLeg);
		this.Tail1.addChild(this.Tail2);
		this.LeftLeg.addChild(this.LeftFoot);
		this.Body.addChild(this.LeftArm);
		this.RightLeg.addChild(this.RightFoot);
		this.Body.addChild(this.Tail1);
		this.Body.addChild(this.RightArm);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
		ImmutableList.of(this.Body).forEach((modelRenderer) -> { 
			modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		});
	}

	@Override
	public void setRotationAngles(AnkylosaurusEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float speed = 0.9f;
		float degree = 1.0f;
		float partialTick = ageInTicks - entityIn.ticksExisted;
		float attackProgress = entityIn.getMeleeProgress(partialTick);
		float leftOrRight = entityIn.getMeleeDirection() ? 1.0F : -1.0F;
		this.Body.rotateAngleX = 0F;
		this.LeftThigh.rotateAngleX = -0F;
		this.RightThigh.rotateAngleX = -0F;
		this.RightArm.rotateAngleX = -0F;
		this.LeftArm.rotateAngleX = -0F;
		this.RightArm.rotateAngleZ = 0F;
		this.LeftArm.rotateAngleZ = -0F;
		this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.8F * limbSwingAmount;
		this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.8F * limbSwingAmount;
		this.RightThigh.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.8F * limbSwingAmount;
		this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.8F * limbSwingAmount;
		this.RightFoot.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.4F * limbSwingAmount;
		this.LeftThigh.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.8F * limbSwingAmount;
		this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.8F * limbSwingAmount;
		this.LeftFoot.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.4F * limbSwingAmount;
		this.Tail1.rotateAngleY = (-0.12F * MathHelper.sin(0.2F * ageInTicks / 5)) + (MathHelper.cos(limbSwing * speed * 0.15F) * degree * 0.35F * limbSwingAmount) + attackProgress * leftOrRight * (float)Math.toRadians(-15);
		this.Tail2.rotateAngleY = (-0.12F * MathHelper.sin(0.2F * ageInTicks / 5)) + (MathHelper.cos(limbSwing * speed * 0.15F) * degree * 0.35F * limbSwingAmount) + attackProgress * leftOrRight * (float)Math.toRadians(-25);
		this.Tail1.rotateAngleX = (-Math.abs(-0.05F * MathHelper.sin(0.1F * ageInTicks / 5))) + (MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.15F * limbSwingAmount - 0.15F);
		this.Tail2.rotateAngleX = (-Math.abs(-0.05F * MathHelper.sin(0.1F * ageInTicks / 5))) + (MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.15F * limbSwingAmount + 0.15F);
		this.Neck.rotateAngleX = (Math.abs(-0.025F * MathHelper.sin(0.1F * ageInTicks / 3))) + (MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.1F * limbSwingAmount + 0.15F);
		this.Head.rotateAngleX = (-Math.abs(-0.025F * MathHelper.sin(0.1F * ageInTicks / 3))) + (MathHelper.cos(-1.0F + limbSwing * speed * 0.3F) * degree * 0.15F * limbSwingAmount + 0.05F);
		this.Body.rotateAngleY = attackProgress * leftOrRight * (float)Math.toRadians(-200);
		this.Tail1.rotateAngleZ = attackProgress * leftOrRight * (float)Math.toRadians(15);
		this.TailClub.rotateAngleY = attackProgress * leftOrRight * (float)Math.toRadians(-25);
		this.Body.rotationPointZ = 12.0F + attackProgress * -22;
		if (entityIn.isEating()) {
			this.Neck.rotateAngleX = Math.abs(MathHelper.sin(0.05F * ageInTicks) * 0.5F) + 0.25F;
			this.Body.rotateAngleX = 0.1F;
			this.LeftThigh.rotateAngleX = -0.1F;
			this.RightThigh.rotateAngleX = -0.1F;
			this.RightArm.rotateAngleX = -0.1F;
			this.LeftArm.rotateAngleX = -0.1F;
			this.RightArm.rotateAngleZ = 0.3F;
			this.LeftArm.rotateAngleZ = -0.3F;
		}
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
