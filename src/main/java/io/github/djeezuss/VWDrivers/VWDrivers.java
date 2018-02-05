package io.github.djeezuss.VWDrivers;

import io.github.djeezuss.VWDrivers.block.ModBlocks;
import io.github.djeezuss.VWDrivers.client.ModCreativeTab;
import io.github.djeezuss.VWDrivers.item.ModItems;
import io.github.djeezuss.VWDrivers.proxy.CommonProxy;
import io.github.djeezuss.VWDrivers.recipe.ModRecipes;
import io.github.djeezuss.VWDrivers.tileEntity.TileEntityShipInterface;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.12.2]",
	dependencies="required-after:valkyrienwarfare;required-after:opencomputers")
public class VWDrivers {
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static VWDrivers instance;
	
	public static final ModCreativeTab creativeTab = new ModCreativeTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		GameRegistry.registerTileEntity(TileEntityShipInterface.class, "ship_interface");
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegisterEvents	{
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.init(event);
		}

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModBlocks.registerItemBlocks(event);
			ModItems.init(event);
		}

		@SubscribeEvent
		public static void registerRecipies(RegistryEvent.Register<IRecipe> event) {
			ModRecipes.init(event);
		}
	}
}
