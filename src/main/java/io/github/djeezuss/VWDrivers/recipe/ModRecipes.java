package io.github.djeezuss.VWDrivers.recipe;


import io.github.djeezuss.VWDrivers.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import valkyrienwarfare.addon.world.ValkyrienWarfareWorld;

/**
 * Created by Djeezuss on 2017-06-22.
 */
public class ModRecipes {
	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.shipInterface), "ICI", "TOT", "ICI",
			'I', Items.IRON_INGOT,
			'C', ValkyrienWarfareWorld.INSTANCE.etheriumCrystal,
			'T', li.cil.oc.api.Items.get("transistor").createItemStack(1),
			'O', Blocks.field_190976_dk); //Observer block
	}
}
