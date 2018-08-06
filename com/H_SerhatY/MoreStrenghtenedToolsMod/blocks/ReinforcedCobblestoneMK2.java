package com.H_SerhatY.MoreStrenghtenedToolsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ReinforcedCobblestoneMK2 extends BlockBase 
{

	public ReinforcedCobblestoneMK2(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(68.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
}
