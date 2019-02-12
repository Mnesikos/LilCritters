package com.github.mnesikos.lilcritters.client.render.entity;

import com.github.mnesikos.lilcritters.client.model.ModelTreeSquirrel;
import com.github.mnesikos.lilcritters.entity.EntityTreeSquirrel;
import com.github.mnesikos.lilcritters.util.Ref;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.util.BookwormUtils;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;

@SideOnly(Side.CLIENT)
public class RenderTreeSquirrel extends RenderLivingZAWA<EntityTreeSquirrel> {
	private static final ResourceLocation EAS_GRAY = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_1.png");
	private static final ResourceLocation MEX_GRAY = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_2.png");
	private static final ResourceLocation EAST_FOX = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_3.png");
	private static final ResourceLocation EURA_RED = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_4.png");
	private static final ResourceLocation PREVOST = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_5.png");
	private static final ResourceLocation FR_GIANT = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_6.png");
	private static final ResourceLocation LIGHTNIN = new ResourceLocation(Ref.MODID + ":textures/entity/treesquirrel/tree_squirrel_lightning.png");

	public RenderTreeSquirrel(RenderManager render) {
		super(render, new ModelTreeSquirrel(), 0.2F);
		this.addLayer(new RenderTreeSquirrel.LayerTreeSquirrel());
	}

	@Override
	protected void preRenderCallback(EntityTreeSquirrel entity, float partialTickTime) {
		float scale = 0.4F +
				(float)entity.getSizeMultiplier() * (entity.getEntityWorld().rand.nextInt(1) == 0 ? 0.01f : -0.01f);
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.translate(0.0F, -0.46F * scale, 0.0F);
		super.preRenderCallback(entity, partialTickTime);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTreeSquirrel entity) {
		String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
		if (s != null && s.equals("Captain")) {
			return LIGHTNIN;
		} else {
			return this.getTextureOfVar(entity.getAnimalType());
		}
	}

	@Override
	public ResourceLocation getTextureOfVar(int i) {
		switch (i) {
			case 0:
			default:
				return EAS_GRAY;
			case 1:
				return MEX_GRAY;
			case 2:
				return EAST_FOX;
			case 3:
				return EURA_RED;
			case 4:
				return PREVOST;
			case 5:
				return FR_GIANT;
		}
	}

	@SideOnly(Side.CLIENT)
	public class LayerTreeSquirrel implements LayerRenderer<EntityTreeSquirrel> {
		private EntityItem item;

		public LayerTreeSquirrel() {
			this.item = new EntityItem(Minecraft.getMinecraft().world);
		}

		@Override
		public void doRenderLayer(EntityTreeSquirrel entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
			if (!entity.isInvisible() && entity.getIsSitting() && entity.getHeldFood() != ItemStack.EMPTY && !BookwormUtils.isEntityMoving(entity)) {
				this.item.hoverStart = 0.0f;
				this.item.setItem(entity.getHeldFood());

				GlStateManager.pushMatrix();
				GlStateManager.rotate(194.0F, 0.0F, 0.0F, 1.0F);
				GlStateManager.rotate(-8.0F, 1.0F, 0.0F, 0.0F);
				if (entity.isChild()) {
					GlStateManager.scale(0.5F, 0.5F, 0.5F);
					GlStateManager.translate(-0.68F, -3.16F, -1.0F);
				} else {
					GlStateManager.scale(0.8F, 0.8F, 0.8F);
					GlStateManager.translate(-0.37F, -1.8F, -0.96F);
				}
				Minecraft.getMinecraft().getRenderManager().renderEntity(this.item, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
				GlStateManager.popMatrix();
			}
		}

		@Override
		public boolean shouldCombineTextures() {
			return true;
		}
	}
}
