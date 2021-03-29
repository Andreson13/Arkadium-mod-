package cm.andreson.arkamod.items;

import java.util.ArrayList;
import java.util.List;
import cm.andreson.arkamod.ArkadiumMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHangGlider extends Item {
   public static List<EntityPlayer> usingHangGliderClient = new ArrayList();
   public static List<EntityPlayer> usingHangGliderServer = new ArrayList();

   public ItemHangGlider() {
      this.setMaxStackSize(1);
      this.setUnlocalizedName("hangglider");
      this.setCreativeTab(ArkadiumMod.Arkatab);;
      this.setTextureName("arkamod:HangGlider");
   }

   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
      if (world.isRemote) {
         if (!usingHangGliderClient.contains(player)) {
            usingHangGliderClient.add(player);
            return stack;
         }

         usingHangGliderClient.remove(player);
      }

      if (!world.isRemote) {
         if (!usingHangGliderServer.contains(player)) {
            usingHangGliderServer.add(player);
            return stack;
         }

         usingHangGliderServer.remove(player);
      }

      return stack;
   }

   public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
      super.onUpdate(stack, world, entity, p_77663_4_, p_77663_5_);
      if (entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)entity;
         double horizontalSpeed;
         double verticalSpeed;
         double x;
         double z;
         if (world.isRemote) {
            if (player.isCollidedVertically) {
               usingHangGliderClient.remove(player);
            }

            if (usingHangGliderClient.contains(player) && player.motionY < 0.0D) {
               if (player.isSneaking()) {
                  horizontalSpeed = 0.1D;
                  verticalSpeed = 0.9D;
               } else {
                  horizontalSpeed = 0.03D;
                  verticalSpeed = 0.7D;
               }

               player.motionY *= verticalSpeed;
               x = Math.cos(Math.toRadians((double)(player.rotationYawHead + 90.0F))) * horizontalSpeed;
               z = Math.sin(Math.toRadians((double)(player.rotationYawHead + 90.0F))) * horizontalSpeed;
               player.motionX += x;
               player.motionZ += z;
               player.fallDistance = 0.0F;
            }
         }

         if (!world.isRemote) {
            if (player.isCollidedVertically) {
               usingHangGliderServer.remove(player);
            }

            if (usingHangGliderServer.contains(player) && player.motionY < 0.0D) {
               if (player.isSneaking()) {
                  horizontalSpeed = 0.1D;
                  verticalSpeed = 0.7D;
               } else {
                  horizontalSpeed = 0.03D;
                  verticalSpeed = 0.4D;
               }

               player.motionY *= verticalSpeed;
               x = Math.cos(Math.toRadians((double)(player.rotationYawHead + 90.0F))) * horizontalSpeed;
               z = Math.sin(Math.toRadians((double)(player.rotationYawHead + 90.0F))) * horizontalSpeed;
               player.motionX += x;
               player.motionZ += z;
               player.fallDistance = 0.0F;
            }
         }

      }
   }
}
