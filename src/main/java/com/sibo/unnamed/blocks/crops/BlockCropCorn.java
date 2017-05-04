package com.sibo.unnamed.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops{

	public BlockCropCorn(){
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
	}
	
	@Override
	protected Item getSeed(){
		return unnamedItems.cornSeed;
	}
	
	@Override
	protected Item getCrop(){
		return unnamedItems.corn;
	}
}
