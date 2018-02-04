package io.github.djeezuss.VWDrivers.tileEntity;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.Optional.Method;
import valkyrienwarfare.api.ValkyrienWarfareHooks;
import valkyrienwarfare.api.Vector;

@Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "opencomputers")
public class TileEntityShipInterface extends TileEntity implements SimpleComponent{
	
	@Override
	public String getComponentName() {
		return "ship_interface";
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getMass(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipMass(ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos)) };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getPosition(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			Vector ship = new Vector(ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos));
			return new Object[] { ship.X, ship.Y, ship.Z };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getPitch(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos).pitch };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getYaw(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos).yaw };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getRoll(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos).roll };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "opencomputers")
	public Object[] getYawPitch(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(world, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos).yaw,
					ValkyrienWarfareHooks.getShipEntityManagingPos(world, pos).pitch };
		}
		return new Object[] { null };
	}
}
