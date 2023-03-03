package com.diglis.Entities.renderers;
import com.diglis.Entities.hostile.GodrickSoldier;
import com.diglis.Entities.models.GodrickSoldierModel;
import com.diglis.eldencraft.EldenCraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
public class GodrickSoldierRenderer extends MobRenderer<GodrickSoldier, GodrickSoldierModel<GodrickSoldier>> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(EldenCraft.MOD_ID, "textures/entity/godrick_soldier/godrick_soldier.png");
    public GodrickSoldierRenderer(EntityRendererManager manager) {
        super(manager, new GodrickSoldierModel<>(), 0.7f);
    }
    @Override
    public ResourceLocation getTextureLocation(GodrickSoldier entity) {
        return TEXTURE;
    }
}
