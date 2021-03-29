package cm.andreson.arkamod.items;

import java.util.ArrayList;
import java.util.List;

import cm.andreson.arkamod.blocks.BlockCreation;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ToolHandler {
   protected static ThreadLocal<Boolean> captureDrops = new ThreadLocal<Boolean>() {
      protected Boolean initialValue() {
         return false;
      }
   };
   protected static ThreadLocal<List<ItemStack>> capturedDrops = new ThreadLocal<List<ItemStack>>() {
      protected List<ItemStack> initialValue() {
         return new ArrayList();
      }
   };
   public static Block[] minerals;

   public static void removeBlocksInIteration(EntityPlayer player, ItemStack stack, World world, int x, int y, int z, int xs, int ys, int zs, int xe, int ye, int ze, Block block, Material[] materialsListing, boolean smelt, int fortune, boolean dispose, boolean obsidian) {
      float blockHardness = block == null ? 1.0F : block.getBlockHardness(world, x, y, z);

      for(int x1 = xs; x1 < xe; ++x1) {
         for(int y1 = ys; y1 < ye; ++y1) {
            for(int z1 = zs; z1 < ze; ++z1) {
               if (world.getBlock(x1 + x, y1 + y, z1 + z).isToolEffective("pickaxe", 3) || world.getBlock(x1 + x, y1 + y, z1 + z) instanceof BlockRedstoneOre || obsidian && world.getBlock(x1 + x, y1 + y, z1 + z) instanceof BlockObsidian) {
                  removeBlockWithDrops(player, stack, world, x1 + x, y1 + y, z1 + z, x, y, z, world.getBlock(x1 + x, y1 + y, z1 + z), materialsListing, smelt, fortune, blockHardness, dispose, obsidian);
               }
            }
         }
      }

   }

   public static void removeBlockWithDrops(EntityPlayer player, ItemStack stack, World world, int x, int y, int z, int bx, int by, int bz, Block block, Material[] materialsListing, boolean smelt, int fortune, float blockHardness, boolean dispose, boolean obsidian) {
      removeBlockWithDrops(player, stack, world, x, y, z, bx, by, bz, block, materialsListing, smelt, fortune, blockHardness, dispose, true, obsidian);
   }

   public static void removeBlockWithDrops(EntityPlayer player, ItemStack stack, World world, int x, int y, int z, int bx, int by, int bz, Block block, Material[] materialsListing, boolean smelt, int fortune, float blockHardness, boolean dispose, boolean particles, boolean obsidian) {
      if (world.blockExists(x, y, z)) {
         Block blk = world.getBlock(x, y, z);
         int meta = world.getBlockMetadata(x, y, z);
         if (block == null || blk == block) {
            Material mat = world.getBlock(x, y, z).getMaterial();
            boolean flag = false;
            if (!world.isRemote && blk != null && !blk.isAir(world, x, y, z) && blk.getPlayerRelativeBlockHardness(player, world, x, y, z) > 0.0F) {
               if (!blk.canHarvestBlock(player, meta) || !isRightMaterial(blk, materialsListing) || blk == Blocks.obsidian && !obsidian) {
                  return;
               }

               int localMeta;
               if (!player.capabilities.isCreativeMode) {
                  localMeta = world.getBlockMetadata(x, y, z);
                  blk.onBlockHarvested(world, x, y, z, localMeta, player);
                  if (blk.removedByPlayer(world, player, x, y, z, true)) {
                     blk.onBlockDestroyedByPlayer(world, x, y, z, localMeta);
                  }

                  if (smelt) {
                     ItemStack result = FurnaceRecipes.smelting().getSmeltingResult((ItemStack)blk.getDrops(world, x, y, z, blk.getDamageValue(world, x, y, z), fortune).get(0));
                     if (result == null) {
                        blk.dropBlockAsItem(world, x, y, z, localMeta, fortune);
                     } else {
                        flag = true;
                        ItemStack resultCopy = result.copy();
                        float count = 1.0F;
                        if (fortune > 0 && isMineral(block)) {
                           count = (float)(1 + (fortune - world.rand.nextInt(fortune)) / 2);
                        }

                        if (count <= 0.0F) {
                           count = 1.0F;
                        }

                        resultCopy.stackSize = (int)count;
                        EntityItem entityItem = new EntityItem(world, (double)x, (double)y, (double)z, resultCopy);
                        world.spawnEntityInWorld(entityItem);
                     }
                  } else {
                     blk.dropBlockAsItem(world, x, y, z, localMeta, fortune);
                  }
               } else {
                  localMeta = world.getBlockMetadata(x, y, z);
                  blk.dropBlockAsItem(world, x, y, z, localMeta, fortune);
               }

               localMeta = blk.getExpDrop(world, blk.getDamageValue(world, x, y, z), fortune);
               EntityXPOrb xp = new EntityXPOrb(world, (double)x, (double)y, (double)z, localMeta);
               if (localMeta > 0) {
                  world.spawnEntityInWorld(xp);
               }
            } else {
               world.setBlockToAir(x, y, z);
            }

            world.playAuxSFX(2001, x, y, z, Block.getIdFromBlock(blk) + (meta << 12));
            world.setBlockToAir(x, y, z);
            if (flag) {
               world.spawnParticle("flame", (double)x + 0.5D + 0.5D * world.rand.nextDouble(), (double)y - 0.1D, (double)z + 0.5D * world.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
               world.spawnParticle("flame", (double)x + 0.5D + 0.5D * world.rand.nextDouble(), (double)y - 0.1D, (double)z + 0.5D * world.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
               world.spawnParticle("smoke", (double)x + 0.5D + 0.5D * world.rand.nextDouble(), (double)y - 0.1D, (double)z + 0.5D * world.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

         }
      }
   }

   public static boolean isMineral(Block block) {
      Block[] var1 = minerals;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Block b = var1[var3];
         if (b == block) {
            return true;
         }
      }

      return false;
   }

   public static boolean isRightMaterial(Block block, Material[] materialsListing) {
      Material material = block.getMaterial();
      Material[] var3 = materialsListing;
      int var4 = materialsListing.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Material mat = var3[var5];
         if (material == mat) {
            return true;
         }
      }

      return false;
   }

   public static boolean isRightBlock(Block block, Block[] list) {
      Block[] var2 = list;
      int var3 = list.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Block blk = var2[var4];
         if (block == blk) {
            return false;
         }
      }

      return true;
   }

   public static MovingObjectPosition raytraceFromEntity(World world, Entity player, boolean par3, double range) {
      float f = 1.0F;
      float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
      float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
      double d0 = player.prevPosX + (player.posX - player.prevPosX) * (double)f;
      double d1 = player.prevPosY + (player.posY - player.prevPosY) * (double)f;
      if (!world.isRemote && player instanceof EntityPlayer) {
         d1 += (double)((EntityPlayer)player).eyeHeight;
      }

      double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double)f;
      Vec3 vec3 = Vec3.createVectorHelper(d0, d1, d2);
      float f3 = MathHelper.cos(-f2 * 0.017453292F - 3.1415927F);
      float f4 = MathHelper.sin(-f2 * 0.017453292F - 3.1415927F);
      float f5 = -MathHelper.cos(-f1 * 0.017453292F);
      float f6 = MathHelper.sin(-f1 * 0.017453292F);
      float f7 = f4 * f5;
      float f8 = f3 * f5;
      Vec3 vec31 = vec3.addVector((double)f7 * range, (double)f6 * range, (double)f8 * range);
      return world.rayTraceBlocks(vec3, vec31, par3);
   }

   static {
      minerals = new Block[]{BlockCreation.titanium_ore, Blocks.coal_ore, Blocks.redstone_ore, Blocks.diamond_ore, Blocks.emerald_ore, Blocks.quartz_ore, Blocks.iron_ore, Blocks.lapis_ore, BlockCreation.arkadium_ore, BlockCreation.vibranium_ore, Blocks.gold_ore, Blocks.lit_redstone_ore};
   }
}
