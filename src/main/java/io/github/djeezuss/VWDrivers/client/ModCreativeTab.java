package io.github.djeezuss.VWDrivers.client;

import io.github.djeezuss.VWDrivers.Reference;
import io.github.djeezuss.VWDrivers.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Djeezuss on 2017-06-24.
 */
public class ModCreativeTab extends CreativeTabs{
	public ModCreativeTab() {
		super(CreativeTabs.getNextID(), Reference.MOD_ID);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.shipInterface);
	}
}
