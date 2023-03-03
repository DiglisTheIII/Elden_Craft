package com.diglis.Entities.models;

import com.diglis.Entities.hostile.GodrickSoldier;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GodrickSoldierModel<T extends GodrickSoldier> extends EntityModel<GodrickSoldier>{
    private final ModelRenderer bb_main;

    public GodrickSoldierModel() {
        texWidth = 64;
        texHeight = 64;

        bb_main = new ModelRenderer(this);
        bb_main.setPos(8f, 24f, 0f);
        bb_main.texOffs(0, 0).addBox(8f, 18f, 8f, 18f, 16f, 0f, false);
    }

    @Override
    public void setupAnim(GodrickSoldier p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
            float p_225597_5_, float p_225597_6_) {
        throw new UnsupportedOperationException("Unimplemented method 'setupAnim'");
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
            float red, float green, float blue, float p_225598_8_) {
            bb_main.render(matrixStack, buffer, packedLight, packedOverlay);    
    }

    public void setRotationAngle(ModelRenderer model, float x, float y, float z) {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }
    
}
