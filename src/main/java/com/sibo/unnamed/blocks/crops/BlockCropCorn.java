package com.sibo.unnamed.blocks.crops;

import com.sibo.unnamed.common.Unnamed;
import com.sibo.unnamed.common.UnnamedItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops{

	public BlockCropCorn(){
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
		setCreativeTab(Unnamed.creativeTab);
	}
	
	@Override
	protected Item getSeed(){
		return UnnamedItems.seedCorn;
	}
	
	@Override
	protected Item getCrop(){
		return UnnamedItems.cropCorn;
	}
}
