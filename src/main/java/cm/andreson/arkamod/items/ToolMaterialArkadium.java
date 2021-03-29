package cm.andreson.arkamod.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialArkadium {
public static ToolMaterial toolTypeVibranium;
   public static ToolMaterial toolTypePlatinium;
   public static ToolMaterial toolTypeTitanium;
   public static ToolMaterial toolTypeArkadium;

   public static void init() {
	  toolTypeVibranium = EnumHelper.addToolMaterial("vibraniumTool", 3, 4999, 30.0F, 6.0F, 35);
      toolTypePlatinium = EnumHelper.addToolMaterial("platiniumTool", 3, 1999, 20.0F, 4.0F, 20);
      toolTypeTitanium = EnumHelper.addToolMaterial("titaniumTool", 3, 2999, 23.0F, 5.0F, 25);
      toolTypeArkadium = EnumHelper.addToolMaterial("arkadiumTool", 4, 4999, 28.0F, 7.0F, 35);
   }
}
