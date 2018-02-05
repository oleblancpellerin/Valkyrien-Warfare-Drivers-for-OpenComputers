package io.github.djeezuss.VWDrivers.recipe;


import io.github.djeezuss.VWDrivers.Reference;
import io.github.djeezuss.VWDrivers.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import valkyrienwarfare.addon.world.ValkyrienWarfareWorld;

import java.util.UUID;

/**
 * Created by Djeezuss on 2017-06-22.
 */
public class ModRecipes {
	public static void init(RegistryEvent.Register<IRecipe> event) {
		registerRecipe(event, new ItemStack(ModBlocks.shipInterface), "1", "ICI", "TOT", "ICI",
				'I', Items.IRON_INGOT,
				'C', ValkyrienWarfareWorld.INSTANCE.etheriumCrystal,
				'T', li.cil.oc.api.Items.get("transistor").createItemStack(1),
				'O', Blocks.OBSERVER
		);
	}

	public static final void registerRecipe(RegistryEvent.Register<IRecipe> event, ItemStack out, String identifier, Object... in) {
		CraftingHelper.ShapedPrimer primer = CraftingHelper.parseShaped(in);
		event.getRegistry().register((new ShapedRecipes(Reference.MOD_ID, primer.width, primer.height, primer.input, out)).setRegistryName(Reference.MOD_ID, identifier));
	}
}
