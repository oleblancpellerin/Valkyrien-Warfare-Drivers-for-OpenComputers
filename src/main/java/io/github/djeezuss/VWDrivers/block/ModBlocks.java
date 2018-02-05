package io.github.djeezuss.VWDrivers.block;

import io.github.djeezuss.VWDrivers.block.shipInterface.BlockShipInterface;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockShipInterface shipInterface;
	
	public static void init(RegistryEvent.Register<Block> event) {
		shipInterface = new BlockShipInterface();

		event.getRegistry().register(shipInterface);
	}

	public static void registerItemBlocks(RegistryEvent.Register<Item> event)	{
		event.getRegistry().register(new ItemBlock(shipInterface).setRegistryName(shipInterface.getRegistryName()));
	}
}
