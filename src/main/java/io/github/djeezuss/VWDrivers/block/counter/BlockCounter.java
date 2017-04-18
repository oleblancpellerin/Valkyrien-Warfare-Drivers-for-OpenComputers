package io.github.djeezuss.VWDrivers.block.counter;

import javax.annotation.Nullable;

import io.github.djeezuss.VWDrivers.block.BlockTileEntity;
import io.github.djeezuss.VWDrivers.tileEntity.TileEntityCounter;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockCounter extends BlockTileEntity<TileEntityCounter> {

	public BlockCounter() {
		super(Material.ROCK, "counter");
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			@Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCounter tile = getTileEntityWorld(world, pos);
			if (side == EnumFacing.DOWN && tile.getCount() > -16) {
				tile.decrementCount();
			} else if (side == EnumFacing.UP && tile.getCount() < 16) {
				tile.incrementCount();
			}
			player.addChatMessage(new TextComponentString("Count: " + tile.getCount()));
		}
		return true;
	};
	
	@Override
	public Class<TileEntityCounter> getTileEntityClass() {
		return TileEntityCounter.class;
	}
	
	@Override
	public TileEntityCounter createTileEntity(World world, IBlockState state) {
		return new TileEntityCounter();
	}

}
