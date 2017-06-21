package io.github.djeezuss.VWDrivers.block;

import io.github.djeezuss.VWDrivers.block.shipInterface.BlockShipInterface;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockShipInterface shipInterface;
	
	public static void init() {
		shipInterface = register(new BlockShipInterface());
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}
		if(block instanceof BlockTileEntity) {
			GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
