package com.sibo.unnamed.blocks.furnace;

import javax.annotation.Nullable;

import com.sibo.unnamed.blocks.BlockBase;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMegaFurnace_old extends BlockBase{

	public static final PropertyBool IS_SMELTING = PropertyBool.create("is_smelting");
	
	
	public BlockMegaFurnace_old() {
		super(Material.ROCK, "megaFurnace");
		
		setHardness(3f);
		setResistance(3f);
		setDefaultState(this.blockState.getBaseState().withProperty(IS_SMELTING, false));
	}
	
	@Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[]{IS_SMELTING});
    }
	
	@Override
	public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos){
		IBlockState blockState = world.getBlockState(pos);	
		boolean isBurning = blockState.getValue(IS_SMELTING);
		return isBurning ? 0 : 15;
	}
	
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(IS_SMELTING, (meta > 0 ? true : false));
    }

	@Override
    public int getMetaFromState(IBlockState state)
    {
		int intState = state.getValue(IS_SMELTING) ? 1 : 0;
        return intState;
    }
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ){
		if(!world.isRemote){
			if(state.getValue(IS_SMELTING) == true){
				world.setBlockState(pos, state.withProperty(IS_SMELTING, false));
			} else {
				world.setBlockState(pos, state.withProperty(IS_SMELTING, true));
			}
		}
		return true;
	}
	
	


}
