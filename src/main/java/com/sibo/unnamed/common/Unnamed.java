package com.sibo.unnamed.common;

import com.sibo.unnamed.common.proxy.CommonProxy;
import com.sibo.unnamed.world.UnnamedWorldGen;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Unnamed.modId, name = Unnamed.name, version = Unnamed.version, acceptedMinecraftVersions = "[1.10.2]")
public class Unnamed {
	
	public static final String modId = "unnamed";
	public static final String name = "Unnamed Mod";
	public static final String version = "0.1.0";
	
	
	@Mod.Instance(modId)
	public static Unnamed instance;
	
	@SidedProxy(serverSide = "com.sibo.unnamed.common.proxy.ServerProxy", clientSide = "com.sibo.unnamed.common.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final UnnamedTab creativeTab = new UnnamedTab();
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
	public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper", 15, new int[]{2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		UnnamedBlocks.init();
		UnnamedItems.init();
		GameRegistry.registerWorldGenerator(new UnnamedWorldGen(), 3);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		UnnamedRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
