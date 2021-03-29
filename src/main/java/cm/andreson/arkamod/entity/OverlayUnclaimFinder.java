package cm.andreson.arkamod.entity;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import org.lwjgl.opengl.GL11;

import cm.andreson.arkamod.items.ItemUnclaimFinder;

public class OverlayUnclaimFinder extends Gui {
   private Minecraft mc = Minecraft.getMinecraft();
   private String show = "0%";
   final ResourceLocation bg = new ResourceLocation("palamod", "textures/overlay/UnclaimFinder.png");
   FontRenderer fontRender;
   RenderItem itemRenderer = new RenderItem();

   public OverlayUnclaimFinder() {
      this.fontRender = this.mc.fontRenderer;
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public void onRender(Post event) {
      if (event.type == ElementType.HOTBAR) {
         if (this.mc.thePlayer.getHeldItem() != null && this.mc.thePlayer.getHeldItem().getItem() instanceof ItemUnclaimFinder && this.mc.theWorld.isRemote) {
            this.mc.renderEngine.bindTexture(this.bg);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            DisplayHelper.drawTexturedQuadFit(5.0D, 5.0D, 32.0D, 32.0D, 0.0D);
            int amountTiles = this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + 0, this.mc.thePlayer.chunkCoordZ + 0).chunkTileEntityMap.values().size();
            amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + 0, this.mc.thePlayer.chunkCoordZ + 1).chunkTileEntityMap.values().size();
            amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + 0, this.mc.thePlayer.chunkCoordZ - 1).chunkTileEntityMap.values().size();
            amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + 1, this.mc.thePlayer.chunkCoordZ).chunkTileEntityMap.values().size();
            amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX - 1, this.mc.thePlayer.chunkCoordZ).chunkTileEntityMap.values().size();
            int[] y;
            int[] x;
            int chests;
            if (this.mc.thePlayer.getHeldItem().getItemDamage() >= 1) {
               y = new int[]{-2, -1, 0, 1, 2, -2, 2, -2, 2, -2, 2, -2, -1, 0, 1, 2};
               x = new int[]{-2, -2, -2, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2, 2, 2, 2};

               for(chests = 0; chests < y.length; ++chests) {
                  amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + x[chests], this.mc.thePlayer.chunkCoordZ + y[chests]).chunkTileEntityMap.values().size();
               }
            }

            if (this.mc.thePlayer.getHeldItem().getItemDamage() >= 2) {
               y = new int[]{-3, -2, -1, 0, 1, 2, 0, 3, -3, 3, -3, 3, -3, 3, -3, 3, -3, -2, -1, 0, 1, 2, 3};
               x = new int[]{-3, -3, -3, -3, -3, -3, -5, -2, -1, -1, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3};

               for(chests = 0; chests < y.length; ++chests) {
                  amountTiles += this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + x[chests], this.mc.thePlayer.chunkCoordZ + y[chests]).chunkTileEntityMap.values().size();
               }
            }

            boolean x1;
            if (this.mc.thePlayer.getHeldItem().getItemDamage() >= 3) {
               x1 = false;
               boolean items = false;
               chests = 0;
               int moddedChests = 0;
               int x11 = -3;

               while(true) {
                  if (x11 >= 3) {
                     ItemStack stackChest = new ItemStack(Blocks.chest);
                     GL11.glPushMatrix();
                     GL11.glEnable(2929);
                     GL11.glScaled(1.5D, 1.5D, 1.5D);
                     this.itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.renderEngine, stackChest, 30, 5);
                     GL11.glDisable(2929);
                     GL11.glDisable(2896);
                     GL11.glPopMatrix();
                     int xChests = 53;
                     int xModdedChests = 83;
                     if (chests > 100) {
                        chests = 100;
                     }

                     if (moddedChests > 100) {
                        moddedChests = 100;
                     }

                     String showChests = chests + "%";
                     String showModdedChests = moddedChests + "%";
                     if (chests > 9) {
                        xChests -= 3;
                     }

                     if (moddedChests > 9) {
                        xModdedChests -= 3;
                     }

                     this.fontRender.drawStringWithShadow(showChests, xChests, 37, -1);
                     this.fontRender.drawStringWithShadow(showModdedChests, xModdedChests, 37, -1);
                     break;
                  }

                  Map tileMap = this.mc.theWorld.getChunkFromChunkCoords(this.mc.thePlayer.chunkCoordX + x11, this.mc.thePlayer.chunkCoordZ + z).chunkTileEntityMap;
				 Iterator entries = tileMap.entrySet().iterator();

				 while(entries.hasNext()) {
				    try {
				       Entry e = (Entry)entries.next();
				       TileEntity te = (TileEntity)e.getValue();
				       if (te != null) {
				          if (te.getClass().toString().contains("net.minecraft.tileentity.TileEntityChest")) {
				             ++chests;
				          } else if (te.getClass().toString().contains("Chest") || te.getClass().toString().contains("chest")) {
				             ++moddedChests;
				          }
				       }
				    } catch (TypeMismatchException var13) {
				       System.out.println("ProblÃ¨me dans le fonctionnement de l'unchaim finder !");
				    }
				 }

                  ++x11;
               }
            }

            if (amountTiles > 100) {
               amountTiles = 100;
            }

            this.show = amountTiles + "%";
            x1 = false;
            byte x11;
            if (amountTiles > 9) {
               x11 = 12;
            } else {
               x11 = 15;
            }

            this.fontRender.drawStringWithShadow(this.show, x11, 37, -1);
         }

      }
   }
}
