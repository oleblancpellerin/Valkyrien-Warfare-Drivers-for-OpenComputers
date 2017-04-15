package io.github.djeezuss.VWDrivers.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase testTool;
	
	public static void init() {
		testTool = register(new ItemBase("testTool").setCreativeTab(CreativeTabs.TOOLS));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemBase)
			((ItemBase)item).registerItemModel();
		
		return item;
	}
}
