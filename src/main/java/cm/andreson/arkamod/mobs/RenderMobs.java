package cm.andreson.arkamod.mobs;

import com.google.common.base.Strings;

import cm.andreson.arkamod.items.GhostMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMobs extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(":ghost2");
	public RenderMobs(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

	}
	
	protected ResourceLocation getEntityTexture(GhostMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntitTexture(Entity entity){
		return this.getEntityTexture((GhostMob)entity);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		// TODO Auto-generated method stub
		return null;
	}
}
