package io.github.djeezuss.VWDrivers;

import ValkyrienWarfareBase.API.ValkyrienWarfareHooks;
import io.github.djeezuss.VWDrivers.proxy.CommonProxy;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class VWDrivers {
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static VWDrivers instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		if(ValkyrienWarfareHooks.isValkyrienWarfareInstalled) {
			FMLLog.getLogger().info("Valkyrien Warfare is installed");
		} else {
			FMLLog.getLogger().info("Valkyrien Warfare is NOT installed");
		}
		proxy.postInit(e);
	}
}
