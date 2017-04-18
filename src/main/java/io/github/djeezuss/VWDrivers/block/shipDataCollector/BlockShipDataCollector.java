package io.github.djeezuss.VWDrivers.block.shipDataCollector;

import io.github.djeezuss.VWDrivers.block.BlockTileEntity;
import io.github.djeezuss.VWDrivers.tileEntity.TileEntityShipDataCollector;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public class BlockShipDataCollector extends BlockTileEntity<TileEntityShipDataCollector> {
	
	public BlockShipDataCollector() {
		super(Material.ROCK, "shipInterface");
	}
	
	@Override
	public Class<TileEntityShipDataCollector> getTileEntityClass() {
		return TileEntityShipDataCollector.class;
	}

	@Override
	public TileEntityShipDataCollector createTileEntity(World world, IBlockState state) {
		return new TileEntityShipDataCollector();
	}
	
}
