package io.github.djeezuss.VWDrivers.block.shipInterface;

import io.github.djeezuss.VWDrivers.block.BlockTileEntity;
import io.github.djeezuss.VWDrivers.tileEntity.TileEntityShipInterface;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public class BlockShipInterface extends BlockTileEntity<TileEntityShipInterface> {
	
	public BlockShipInterface() {
		super(Material.ROCK, "ship_interface");
	}
	
	@Override
	public Class<TileEntityShipInterface> getTileEntityClass() {
		return TileEntityShipInterface.class;
	}

	@Override
	public TileEntityShipInterface createTileEntity(World world, IBlockState state) {
		return new TileEntityShipInterface();
	}
	
}
