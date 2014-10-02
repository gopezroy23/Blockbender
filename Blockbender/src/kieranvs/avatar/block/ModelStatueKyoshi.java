package kieranvs.avatar.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStatueKyoshi extends ModelBase{

	ModelRenderer Stand2;
	ModelRenderer Stand1;
	ModelRenderer LeftDress;
	ModelRenderer RightDress;
	ModelRenderer RightShoulder;
	ModelRenderer LeftShoulder;
	ModelRenderer HairTopRight;
	ModelRenderer HairRight;
	ModelRenderer HairLeft;
	ModelRenderer HairTopLeft;
	ModelRenderer Headband;
	ModelRenderer RightDanglyBit;
	ModelRenderer LeftDanglyBit;
	ModelRenderer HeadbandCrown;
	ModelRenderer RightHeadFan1;
	ModelRenderer RightHeadFan2;
	ModelRenderer RightHeadFan3;
	ModelRenderer RightHeadFan4;
	ModelRenderer LeftHeadFan1;
	ModelRenderer LeftHeadFan2;
	ModelRenderer LeftHeadFan3;
	ModelRenderer LeftHeadFan4;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public ModelStatueKyoshi()
	{
		textureWidth = 128;
		textureHeight = 128;

		Stand2 = new ModelRenderer(this, 79, 0);
		Stand2.addBox(-7F, 2F, -5F, 14, 1, 10);
		Stand2.setRotationPoint(0F, 21F, 0F);
		Stand2.setTextureSize(128, 128);
		Stand2.mirror = true;
		setRotation(Stand2, 0F, 0F, 0F);
		Stand1 = new ModelRenderer(this, 87, 12);
		Stand1.addBox(-6F, 0F, -4F, 12, 2, 8);
		Stand1.setRotationPoint(0F, 21F, 0F);
		Stand1.setTextureSize(128, 128);
		Stand1.mirror = true;
		setRotation(Stand1, 0F, 0F, 0F);
		LeftDress = new ModelRenderer(this, 0, 33);
		LeftDress.addBox(0F, 0F, 0F, 1, 12, 4);
		LeftDress.setRotationPoint(3F, 9F, -2.1F);
		LeftDress.setTextureSize(128, 128);
		LeftDress.mirror = true;
		setRotation(LeftDress, 0F, 0F, -0.0743572F);
		RightDress = new ModelRenderer(this, 0, 33);
		RightDress.addBox(0F, 0F, 0F, 1, 12, 4);
		RightDress.setRotationPoint(-4F, 9F, -2.1F);
		RightDress.setTextureSize(128, 128);
		RightDress.mirror = true;
		setRotation(RightDress, 0F, 0F, 0.0743572F);
		RightShoulder = new ModelRenderer(this, 33, 0);
		RightShoulder.addBox(0F, 0F, 0F, 6, 2, 4);
		RightShoulder.setRotationPoint(-9F, -2F, -2.1F);
		RightShoulder.setTextureSize(128, 128);
		RightShoulder.mirror = true;
		setRotation(RightShoulder, 0F, 0F, -0.2230717F);
		LeftShoulder = new ModelRenderer(this, 33, 0);
		LeftShoulder.addBox(-6F, 0F, 0F, 6, 2, 4);
		LeftShoulder.setRotationPoint(9F, -2F, -2.1F);
		LeftShoulder.setTextureSize(128, 128);
		LeftShoulder.mirror = true;
		setRotation(LeftShoulder, 0F, 0F, 0.2230717F);
		HairTopRight = new ModelRenderer(this, 70, 70);
		HairTopRight.addBox(0F, 0F, 0F, 4, 2, 8);
		HairTopRight.setRotationPoint(-4F, -12F, -4F);
		HairTopRight.setTextureSize(128, 128);
		HairTopRight.mirror = true;
		setRotation(HairTopRight, 0F, 0F, -0.1858931F);
		HairRight = new ModelRenderer(this, 100, 70);
		HairRight.addBox(0F, 0F, 0F, 3, 7, 8);
		HairRight.setRotationPoint(-4F, -12F, -3.9F);
		HairRight.setTextureSize(128, 128);
		HairRight.mirror = true;
		setRotation(HairRight, 0F, 0F, 0.4135088F);
		HairLeft = new ModelRenderer(this, 100, 70);
		HairLeft.addBox(0F, 0F, 0F, 3, 7, 8);
		HairLeft.setRotationPoint(1.1F, -10.8F, -3.9F);
		HairLeft.setTextureSize(128, 128);
		HairLeft.mirror = true;
		setRotation(HairLeft, 0F, 0F, -0.4089647F);
		HairTopLeft = new ModelRenderer(this, 70, 70);
		HairTopLeft.addBox(0F, 0F, 0F, 4, 2, 8);
		HairTopLeft.setRotationPoint(-0.1F, -12.75F, -4F);
		HairTopLeft.setTextureSize(128, 128);
		HairTopLeft.mirror = true;
		setRotation(HairTopLeft, 0F, 0F, 0.1858931F);
		Headband = new ModelRenderer(this, 15, 91);
		Headband.addBox(0F, 0F, 0F, 10, 1, 10);
		Headband.setRotationPoint(-5F, -11F, -5F);
		Headband.setTextureSize(128, 128);
		Headband.mirror = true;
		setRotation(Headband, 0F, 0F, 0F);
		RightDanglyBit = new ModelRenderer(this, 24, 80);
		RightDanglyBit.addBox(0F, 0F, 0F, 1, 5, 1);
		RightDanglyBit.setRotationPoint(-4F, -10F, -5F);
		RightDanglyBit.setTextureSize(128, 128);
		RightDanglyBit.mirror = true;
		setRotation(RightDanglyBit, 0F, 0F, 0F);
		LeftDanglyBit = new ModelRenderer(this, 43, 80);
		LeftDanglyBit.addBox(0F, 0F, 0F, 1, 5, 1);
		LeftDanglyBit.setRotationPoint(3F, -10F, -5F);
		LeftDanglyBit.setTextureSize(128, 128);
		LeftDanglyBit.mirror = true;
		setRotation(LeftDanglyBit, 0F, 0F, 0F);
		HeadbandCrown = new ModelRenderer(this, 31, 79);
		HeadbandCrown.addBox(0F, 0F, 0F, 2, 2, 2);
		HeadbandCrown.setRotationPoint(-1F, -12F, -5.3F);
		HeadbandCrown.setTextureSize(128, 128);
		HeadbandCrown.mirror = true;
		setRotation(HeadbandCrown, 0F, 0F, 0F);
		RightHeadFan1 = new ModelRenderer(this, 30, 60);
		RightHeadFan1.addBox(-2F, -6F, 0F, 2, 6, 0);
		RightHeadFan1.setRotationPoint(0F, -11F, -5.2F);
		RightHeadFan1.setTextureSize(128, 128);
		RightHeadFan1.mirror = true;
		setRotation(RightHeadFan1, 0F, 0F, -0.1115358F);
		RightHeadFan2 = new ModelRenderer(this, 25, 65);
		RightHeadFan2.addBox(-2F, -6.2F, 0F, 2, 6, 0);
		RightHeadFan2.setRotationPoint(0F, -11F, -5.1F);
		RightHeadFan2.setTextureSize(128, 128);
		RightHeadFan2.mirror = true;
		setRotation(RightHeadFan2, 0F, 0F, -0.4461433F);
		RightHeadFan3 = new ModelRenderer(this, 20, 72);
		RightHeadFan3.addBox(-1.7F, -6.4F, 0.1F, 2, 6, 0);
		RightHeadFan3.setRotationPoint(0F, -11F, -5F);
		RightHeadFan3.setTextureSize(128, 128);
		RightHeadFan3.mirror = true;
		setRotation(RightHeadFan3, 0F, 0F, -0.8179294F);
		RightHeadFan4 = new ModelRenderer(this, 14, 80);
		RightHeadFan4.addBox(-1F, -6.5F, 0.1F, 2, 6, 0);
		RightHeadFan4.setRotationPoint(0F, -11F, -4.9F);
		RightHeadFan4.setTextureSize(128, 128);
		RightHeadFan4.mirror = true;
		setRotation(RightHeadFan4, 0F, 0F, -1.226894F);
		LeftHeadFan1 = new ModelRenderer(this, 36, 60);
		LeftHeadFan1.addBox(0F, -6F, 0F, 2, 6, 0);
		LeftHeadFan1.setRotationPoint(0F, -11F, -5.2F);
		LeftHeadFan1.setTextureSize(128, 128);
		LeftHeadFan1.mirror = true;
		setRotation(LeftHeadFan1, 0F, 0F, 0.1115358F);
		LeftHeadFan2 = new ModelRenderer(this, 41, 65);
		LeftHeadFan2.addBox(0F, -6.2F, 0F, 2, 6, 0);
		LeftHeadFan2.setRotationPoint(0F, -11F, -5.1F);
		LeftHeadFan2.setTextureSize(128, 128);
		LeftHeadFan2.mirror = true;
		setRotation(LeftHeadFan2, 0F, 0F, 0.4461433F);
		LeftHeadFan3 = new ModelRenderer(this, 46, 72);
		LeftHeadFan3.addBox(-0.3F, -6.4F, 0.1F, 2, 6, 0);
		LeftHeadFan3.setRotationPoint(0F, -11F, -5F);
		LeftHeadFan3.setTextureSize(128, 128);
		LeftHeadFan3.mirror = true;
		setRotation(LeftHeadFan3, 0F, 0F, 0.8179294F);
		LeftHeadFan4 = new ModelRenderer(this, 51, 80);
		LeftHeadFan4.addBox(-1F, -6.5F, 0.1F, 2, 6, 0);
		LeftHeadFan4.setRotationPoint(0F, -11F, -4.9F);
		LeftHeadFan4.setTextureSize(128, 128);
		LeftHeadFan4.mirror = true;
		setRotation(LeftHeadFan4, 0F, 0F, 1.226894F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, -3F, 0F);
		head.setTextureSize(128, 128);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, -3F, 0.1F);
		body.setTextureSize(128, 128);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
		rightarm.setRotationPoint(-4F, 0F, 0F);
		rightarm.setTextureSize(128, 128);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0.1858931F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(-1.3F, -2F, -2F, 4, 12, 4);
		leftarm.setRotationPoint(4F, 0F, 0F);
		leftarm.setTextureSize(128, 128);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, -0.2230717F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		rightleg.setRotationPoint(-2F, 9F, 0F);
		rightleg.setTextureSize(128, 128);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		leftleg.setRotationPoint(2F, 9F, 0F);
		leftleg.setTextureSize(128, 128);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		render(f5);
	}

	public void render(float f5){
		Stand2.render(f5);
		Stand1.render(f5);
		LeftDress.render(f5);
		RightDress.render(f5);
		RightShoulder.render(f5);
		LeftShoulder.render(f5);
		HairTopRight.render(f5);
		HairRight.render(f5);
		HairLeft.render(f5);
		HairTopLeft.render(f5);
		Headband.render(f5);
		RightDanglyBit.render(f5);
		LeftDanglyBit.render(f5);
		HeadbandCrown.render(f5);
		RightHeadFan1.render(f5);
		RightHeadFan2.render(f5);
		RightHeadFan3.render(f5);
		RightHeadFan4.render(f5);
		LeftHeadFan1.render(f5);
		LeftHeadFan2.render(f5);
		LeftHeadFan3.render(f5);
		LeftHeadFan4.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par6Entity){
		super.setRotationAngles(f, f1, f2, f3, f4, f5, par6Entity);
	}

}
