package superlord.prehistoricfauna.client.model.cretaceous.hellcreek;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.common.entities.cretaceous.hellcreek.TriceratopsEntity;

/**
 * Triceratops juvenile - Undefined
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class TriceratopsJuvenileModel extends EntityModel<TriceratopsEntity> {
	public ModelRenderer Body;
	public ModelRenderer LeftFrontLeg;
	public ModelRenderer LeftHindLeg1;
	public ModelRenderer RightFrontLeg;
	public ModelRenderer RightHindLeg1;
	public ModelRenderer Neck;
	public ModelRenderer Tail1;
	public ModelRenderer Head1;
	public ModelRenderer Snout;
	public ModelRenderer horn1;
	public ModelRenderer Crest;
	public ModelRenderer horn1_1;
	public ModelRenderer nasalhorn;
	public ModelRenderer Beak;
	public ModelRenderer Tail2;
	public ModelRenderer LeftHindLeg2;
	public ModelRenderer LeftHindLeg3;
	public ModelRenderer RightHindLeg2;
	public ModelRenderer RightHindLeg3;

	public TriceratopsJuvenileModel() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.horn1_1 = new ModelRenderer(this, 66, 90);
		this.horn1_1.setRotationPoint(-2.9F, -1.0F, -9.0F);
		this.horn1_1.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(horn1_1, -0.7285004590772052F, 0.18203784630933073F, 0.0F);
		this.LeftHindLeg3 = new ModelRenderer(this, 98, 61);
		this.LeftHindLeg3.setRotationPoint(0.0F, 9.0F, 0.0F);
		this.LeftHindLeg3.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.RightHindLeg2 = new ModelRenderer(this, 100, 28);
		this.RightHindLeg2.setRotationPoint(0.0F, 10.0F, 3.0F);
		this.RightHindLeg2.addBox(-2.0F, -4.0F, -2.0F, 4.0F, 14.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.RightFrontLeg = new ModelRenderer(this, 96, 79);
		this.RightFrontLeg.mirror = true;
		this.RightFrontLeg.setRotationPoint(-6.0F, 7.0F, -8.0F);
		this.RightFrontLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.LeftHindLeg2 = new ModelRenderer(this, 100, 28);
		this.LeftHindLeg2.setRotationPoint(0.0F, 10.0F, 3.0F);
		this.LeftHindLeg2.addBox(-2.0F, -4.0F, -2.0F, 4.0F, 14.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.LeftHindLeg1 = new ModelRenderer(this, 92, 0);
		this.LeftHindLeg1.setRotationPoint(6.0F, 3.0F, 5.0F);
		this.LeftHindLeg1.addBox(-3.0F, -4.0F, -5.0F, 6.0F, 14.0F, 10.0F, 0.0F, 0.0F, 0.0F);
		this.LeftFrontLeg = new ModelRenderer(this, 96, 79);
		this.LeftFrontLeg.setRotationPoint(6.0F, 7.0F, -8.0F);
		this.LeftFrontLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.Crest = new ModelRenderer(this, 48, 67);
		this.Crest.setRotationPoint(0.0F, 1.0F, -3.0F);
		this.Crest.addBox(-6.0F, -9.0F, -2.0F, 12.0F, 11.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(Crest, -0.956091342937205F, 0.0F, 0.0F);
		this.RightHindLeg1 = new ModelRenderer(this, 92, 0);
		this.RightHindLeg1.setRotationPoint(-6.0F, 3.0F, 5.0F);
		this.RightHindLeg1.addBox(-3.0F, -4.0F, -5.0F, 6.0F, 14.0F, 10.0F, 0.0F, 0.0F, 0.0F);
		this.Snout = new ModelRenderer(this, 37, 88);
		this.Snout.setRotationPoint(0.0F, 1.0F, -9.0F);
		this.Snout.addBox(-2.0F, 0.0F, -7.0F, 4.0F, 8.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.Neck = new ModelRenderer(this, 58, 0);
		this.Neck.setRotationPoint(0.0F, -1.0F, -10.0F);
		this.Neck.addBox(-3.0F, -5.0F, -10.0F, 6.0F, 11.0F, 10.0F, 0.0F, 0.0F, 0.0F);
		this.Body = new ModelRenderer(this, 0, 0);
		this.Body.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.Body.addBox(-7.0F, -8.0F, -12.0F, 14.0F, 17.0F, 24.0F, 0.0F, 0.0F, 0.0F);
		this.Tail2 = new ModelRenderer(this, 66, 37);
		this.Tail2.setRotationPoint(0.0F, -1.0F, 12.0F);
		this.Tail2.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 15.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(Tail2, 0.0911061832922575F, 0.0F, 0.0F);
		this.Head1 = new ModelRenderer(this, 0, 79);
		this.Head1.setRotationPoint(0.0F, -5.0F, -10.0F);
		this.Head1.addBox(-4.0F, -3.0F, -9.0F, 8.0F, 13.0F, 9.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(Head1, 0.500909508638178F, 0.0F, 0.0F);
		this.nasalhorn = new ModelRenderer(this, 0, 0);
		this.nasalhorn.setRotationPoint(0.0F, 1.0F, -5.0F);
		this.nasalhorn.addBox(-0.5F, -3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(nasalhorn, 0.6373942508178124F, 0.0F, 0.0F);
		this.Tail1 = new ModelRenderer(this, 0, 48);
		this.Tail1.setRotationPoint(0.0F, -3.0F, 12.0F);
		this.Tail1.addBox(-3.0F, -3.0F, -2.0F, 6.0F, 7.0F, 14.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(Tail1, -0.3186971254089062F, 0.0F, 0.0F);
		this.RightHindLeg3 = new ModelRenderer(this, 98, 61);
		this.RightHindLeg3.setRotationPoint(0.0F, 9.0F, 0.0F);
		this.RightHindLeg3.addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.horn1 = new ModelRenderer(this, 66, 90);
		this.horn1.setRotationPoint(2.9F, -1.0F, -9.0F);
		this.horn1.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(horn1, -0.7285004590772052F, -0.18203784630933073F, 0.0F);
		this.Beak = new ModelRenderer(this, 0, 106);
		this.Beak.setRotationPoint(0.0F, 3.0F, -7.0F);
		this.Beak.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.Head1.addChild(this.horn1_1);
		this.LeftHindLeg2.addChild(this.LeftHindLeg3);
		this.RightHindLeg1.addChild(this.RightHindLeg2);
		this.LeftHindLeg1.addChild(this.LeftHindLeg2);
		this.Head1.addChild(this.Crest);
		this.Head1.addChild(this.Snout);
		this.Body.addChild(this.Neck);
		this.Tail1.addChild(this.Tail2);
		this.Neck.addChild(this.Head1);
		this.Snout.addChild(this.nasalhorn);
		this.Body.addChild(this.Tail1);
		this.RightHindLeg2.addChild(this.RightHindLeg3);
		this.Head1.addChild(this.horn1);
		this.Snout.addChild(this.Beak);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
		ImmutableList.of(this.RightFrontLeg, this.LeftHindLeg1, this.LeftFrontLeg, this.RightHindLeg1, this.Body).forEach((modelRenderer) -> { 
			modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		});
	}

	@Override
	public void setRotationAngles(TriceratopsEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.resetModel();
		if (entityIn.isSleeping()) {
			this.Tail1.rotateAngleX = -0.43598323915870024F;
			this.Tail1.rotateAngleY = 0.11728612207217244F;
			this.RightHindLeg2.rotateAngleX = 2.5413739344815873F;
			this.RightHindLeg2.rotateAngleZ = -0.3127630032889644F;
			this.RightHindLeg1.rotateAngleX = -1.13376586611655F;
			this.RightHindLeg1.rotateAngleY = 0.19547687289441354F;
			this.LeftFrontLeg.rotateAngleX = -1.2119566751954398F;
			this.LeftFrontLeg.rotateAngleY = -0.27366763203903305F;
			this.Neck.rotateAngleX = 0.1563815016444822F;
			this.Neck.rotateAngleY = -0.46914448828868976F;
			this.Head1.rotateAngleX = 0.14905111745452548F;
			this.Head1.rotateAngleY = -0.1563815016444822F;
			this.RightFrontLeg.rotateAngleX = -1.291369076266349F;
			this.RightFrontLeg.rotateAngleY = -0.23457224414434488F;
			this.LeftHindLeg1.rotateAngleX = -1.13376586611655F;
			this.LeftHindLeg1.rotateAngleY = -0.19547687289441354F;
			this.Tail2.rotateAngleX = 0.13020156286456727F;
			this.Tail2.rotateAngleY = 0.3127630032889644F;
			this.LeftHindLeg2.rotateAngleX = 2.5411994974301875F;
			this.LeftHindLeg2.rotateAngleZ = 0.3127630032889644F;
			this.Body.rotationPointY = 13;
			this.LeftFrontLeg.rotationPointY = 19;
			this.RightFrontLeg.rotationPointY = 19;
			this.LeftHindLeg1.rotationPointY = 15;
			this.RightHindLeg1.rotationPointY = 15;
			
		} else {
			if (entityIn.isJuvenile()) {
				float speed = 1.0f;
				float degree = 1.0f;
				this.Body.rotationPointY = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 3.0F;
				this.Neck.rotateAngleX = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 0.05F;
				this.Head1.rotateAngleX = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 0.5F;
				this.LeftFrontLeg.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * 0.8F * limbSwingAmount;
				this.RightFrontLeg.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * -0.8F * limbSwingAmount;
				this.LeftHindLeg1.rotateAngleX = MathHelper.cos(1.0F + (limbSwing / 3) * speed * 0.3F) * degree * 0.4F * limbSwingAmount;
				this.LeftHindLeg2.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * 0.3F * limbSwingAmount;
				this.LeftHindLeg3.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * -0.3F * limbSwingAmount;
				this.RightHindLeg1.rotateAngleX = MathHelper.cos(1.0F + (limbSwing / 3) * speed * 0.3F) * degree * -0.4F * limbSwingAmount;
				this.RightHindLeg2.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * -0.3F * limbSwingAmount;
				this.RightHindLeg3.rotateAngleX = MathHelper.cos((limbSwing / 3) * speed * 0.3F) * degree * 0.3F * limbSwingAmount;
				this.Tail1.rotateAngleX = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.3F) * degree * 0.15F * limbSwingAmount - 0.3F;
				this.Tail1.rotateAngleY = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.15F) * degree * 0.05F * limbSwingAmount;
				this.Tail2.rotateAngleX = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.3F) * degree * 0.15F * limbSwingAmount + 0.15F;
				this.Tail2.rotateAngleY = MathHelper.cos(-1.0F + (limbSwing / 3) * speed * 0.15F) * degree * 0.15F * limbSwingAmount;
			} else {
				float speed = 1.0f;
				float degree = 1.0f;
				this.Body.rotationPointY = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 3.0F;
				this.Neck.rotateAngleX = MathHelper.cos(-1.0F + limbSwing * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 0.05F;
				this.Head1.rotateAngleX = MathHelper.cos(-1.0F + limbSwing * speed * 0.3F) * degree * 0.05F * limbSwingAmount + 0.5F;
				this.LeftFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.8F * limbSwingAmount;
				this.RightFrontLeg.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.8F * limbSwingAmount;
				this.LeftHindLeg1.rotateAngleX = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * 0.4F * limbSwingAmount;
				this.LeftHindLeg2.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.3F * limbSwingAmount;
				this.LeftHindLeg3.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.3F * limbSwingAmount;
				this.RightHindLeg1.rotateAngleX = MathHelper.cos(1.0F + limbSwing * speed * 0.3F) * degree * -0.4F * limbSwingAmount;
				this.RightHindLeg2.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * -0.3F * limbSwingAmount;
				this.RightHindLeg3.rotateAngleX = MathHelper.cos(limbSwing * speed * 0.3F) * degree * 0.3F * limbSwingAmount;
				this.Tail1.rotateAngleX = MathHelper.cos(-1.0F + limbSwing * speed * 0.3F) * degree * 0.15F * limbSwingAmount - 0.3F;
				this.Tail1.rotateAngleY = MathHelper.cos(-1.0F + limbSwing * speed * 0.15F) * degree * 0.05F * limbSwingAmount;
				this.Tail2.rotateAngleX = MathHelper.cos(-1.0F + limbSwing * speed * 0.3F) * degree * 0.15F * limbSwingAmount + 0.15F;
				this.Tail2.rotateAngleY = MathHelper.cos(-1.0F + limbSwing * speed * 0.15F) * degree * 0.15F * limbSwingAmount;
			}
			if (entityIn.isEating()) {
				this.Neck.rotateAngleX = Math.abs(MathHelper.sin(0.05F * ageInTicks) * 0.25F) + 0.15F;
				this.Body.rotateAngleX = 0.1F;
			}
		}
	}
	
	public void resetModel() {
		this.Tail1.rotateAngleX = -0.3186971254089062F;
		this.Tail1.rotateAngleY = 0;
		this.RightHindLeg2.rotateAngleX = 0;
		this.RightHindLeg2.rotateAngleZ = 0;
		this.RightHindLeg1.rotateAngleX = 0;
		this.RightHindLeg1.rotateAngleY = 0;
		this.LeftFrontLeg.rotateAngleX = 0;
		this.LeftFrontLeg.rotateAngleY = 0;
		this.Neck.rotateAngleX = 0;
		this.Neck.rotateAngleY = 0;
		this.Head1.rotateAngleX = 0.500909508638178F;
		this.Head1.rotateAngleY = 0;
		this.RightFrontLeg.rotateAngleX = 0;
		this.RightFrontLeg.rotateAngleY = 0;
		this.LeftHindLeg1.rotateAngleX = 0;
		this.LeftHindLeg1.rotateAngleY = 0;
		this.Tail2.rotateAngleX = 0.0911061832922575F;
		this.Tail2.rotateAngleY = 0;
		this.LeftHindLeg2.rotateAngleX = 0;
		this.LeftHindLeg2.rotateAngleZ = 0;
		this.Body.rotationPointY = 3;
		this.LeftFrontLeg.rotationPointY = 7;
		this.RightFrontLeg.rotationPointY = 7;
		this.LeftHindLeg1.rotationPointY = 3;
		this.RightHindLeg1.rotationPointY = 3;
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
