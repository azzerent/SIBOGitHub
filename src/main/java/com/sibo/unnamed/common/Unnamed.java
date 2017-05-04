package com.sibo.unnamed.common;

import com.sibo.unnamed.common.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Unnamed.modId, name = Unnamed.name, version = Unnamed.version, acceptedMinecraftVersions = "[1.10.2]")
public class Unnamed {
	
	public static final String modId = "unnamed";
	public static final String name = "Unnamed Mod";
	public static final String version = "0.1.0";
	
	@Mod.Instance(modId)
	public static Unnamed instance;
	
	@SidedProxy(serverSide = "com.sibo.unnamed.common.proxy.ServerProxy", clientSide = "com.sibo.unnamed.common.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		UnnmedBlocks.init();
		UnnamedItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
