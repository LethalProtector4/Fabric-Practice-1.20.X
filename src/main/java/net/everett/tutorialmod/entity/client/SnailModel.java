// Made with Blockbench 5.0.6
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.everett.tutorialmod.entity.client;

import net.everett.tutorialmod.entity.animation.ModAnimations;
import net.everett.tutorialmod.entity.custom.SnailEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class SnailModel<T extends SnailEntity> extends SinglePartEntityModel<T> {
	private final ModelPart snail;

	public SnailModel(ModelPart root) { this.snail = root.getChild("snail"); }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData snail = modelPartData.addChild("snail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData antenna = snail.addChild("antenna", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = antenna.addChild("cube_r1", ModelPartBuilder.create().uv(16, 14).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -6.0F, 0.6109F, 0.0F, 0.0F));

		ModelPartData shell = snail.addChild("shell", ModelPartBuilder.create().uv(0, 10).cuboid(-1.5F, -5.0F, -2.5F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData torso = snail.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = torso.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData foot = torso.addChild("foot", ModelPartBuilder.create().uv(16, 10).cuboid(-1.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 3.5F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(SnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		this.updateAnimation(entity.idleAnimationState, ModAnimations.SNAIL_IDLE, ageInTicks, 1f);
		this.animateMovement(ModAnimations.SNAIL_MOVE, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		snail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return snail;
	}
}