package net.everett.tutorialmod.entity.client;

import net.everett.tutorialmod.TutorialMod;
import net.everett.tutorialmod.entity.custom.PracticeCubeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PracticeCubeRenderer extends MobEntityRenderer<PracticeCubeEntity, PracticeCubeModel<PracticeCubeEntity>> {
    private static final Identifier TEXTURE = new Identifier(TutorialMod.MOD_ID, "textures/entity/practice_cube.png");

    public PracticeCubeRenderer(EntityRendererFactory.Context context) {
        super(context, new PracticeCubeModel<>(context.getPart(ModModelLayers.PRACTICE_CUBE)), 0.5f);
    }

    @Override
    public Identifier getTexture(PracticeCubeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(PracticeCubeEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}