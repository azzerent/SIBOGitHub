package com.sibo.unnamed.blocks.propertiesTest;

import com.sibo.unnamed.blocks.BlockBase;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;

public class BlockProperties extends BlockBase{

	public static final PropertyEnum TYPE = PropertyEnum.create("type", BlockProperties.EnumType.class);
	
	public BlockProperties(Material material, String name) {
		super(material.ROCK, "properties");
		setHardness(3f);
		setResistance(3f);
	}
	
	@Override
	protected BlockStateContainer createBlockState(){
		return new BlockStateContainer(this, new IProperty[EnumFacing] { TYPE });
	}
	
	
	
	public enum EnumType implements IStringSerializable {
		WHITE(0, "white"),
	    BLACK(1, "black");

	    private int ID;
	    private String name;

	    private EnumType(int ID, String name){
	    	this.ID = ID;
	    	this.name = name;
	    }
	    
		@Override
		public String getName() {
			return name;
		}
		
		public int getID(){
			return ID;
		}
		
		@Override
		public String toString(){
			return getName();
		}
	}

}
