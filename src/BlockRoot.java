package net.minecraft.src;

import java.util.Random;

public class BlockRoot extends BlockFlower {
	protected BlockRoot(int i, int j) {
		super (i, j);
        blockIndexInTexture = j;
        setTickRandomly(true);
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);

	}
	
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID;
    }
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        if (!super.canPlaceBlockAt(par1World, par2, par3, par4))
        {
            return false;
        }
        else
        {
            return canBlockStay(par1World, par2, par3, par4);
        }
    }
	
	public int idDropped(int i, Random random, int j)
    {
        return mod_ExtraBiomesXL.rootItem.shiftedIndex;
    }
}