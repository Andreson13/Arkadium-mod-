package cm.andreson.arkamod.blocks;

import cm.andreson.arkamod.ArkadiumMod;
import net.minecraft.block.Block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockSlimePad extends Block {
   protected BlockSlimePad() {
      super(Material.glass);
      this.setBlockBounds(0.125F, 0.0625F, 0.125F, 0.875F, 0.625F, 0.875F);
      this.setCreativeTab(ArkadiumMod.Arkatab);
      this.setResistance(8.0F);
      this.setHarvestLevel("pickaxe", 2);
      this.setBlockName("slimepad");
      this.setBlockTextureName("arkamod:slime_pad");
      this.setHardness(12.0F);
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
      return null;
   }

   public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
      if (!world.isBlockIndirectlyGettingPowered(x, y, z)) {
         double moveX = 0.0D;
         double moveZ = 0.0D;
         double speed = 0.25D;
         int meta = world.getBlockMetadata(x, y, z);
         switch(meta % 8) {
         case 0:
            moveZ += speed;
            break;
         case 1:
            moveZ += speed;
            moveX -= speed;
            break;
         case 2:
            moveX -= speed;
            break;
         case 3:
            moveX -= speed;
            moveZ -= speed;
            break;
         case 4:
            moveZ -= speed;
            break;
         case 5:
            moveZ -= speed;
            moveX += speed;
            break;
         case 6:
            moveX += speed;
            break;
         case 7:
            moveX += speed;
            moveZ += speed;
         }

         if (entity instanceof EntityItem) {
            ++entity.posY;
         }

         entity.fallDistance = 0.0F;
         entity.addVelocity(moveX, speed * 2.0D, moveZ);
         world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), this.stepSound.getStepResourcePath(), this.stepSound.getVolume() / 2.0F, this.stepSound.getPitch() * 0.65F);
      }

   }

   public boolean isBlockReplaceable(World world, int x, int y, int z) {
      return false;
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
      int face = MathHelper.floor_double((double)(entity.rotationYaw * 8.0F / 360.0F) + 0.5D) + (entity.isSneaking() ? 4 : 0) & 7;
      int meta = world.getBlockMetadata(x, y, z) & 8;
      world.setBlockMetadataWithNotify(x, y, z, face | meta, 2);
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public int getRenderBlockPass() {
      return 1;
   }
}