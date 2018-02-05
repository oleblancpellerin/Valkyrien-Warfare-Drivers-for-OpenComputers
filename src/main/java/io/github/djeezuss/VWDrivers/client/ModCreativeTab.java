package io.github.djeezuss.VWDrivers.client;

import io.github.djeezuss.VWDrivers.Reference;
import io.github.djeezuss.VWDrivers.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModCreativeTab extends CreativeTabs {

	public ModCreativeTab() {
		super(13, Reference.MOD_ID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.shipInterface));
	}
}
