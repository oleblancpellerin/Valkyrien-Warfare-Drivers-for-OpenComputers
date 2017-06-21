package io.github.djeezuss.VWDrivers.tileEntity;

import ValkyrienWarfareBase.API.ValkyrienWarfareHooks;
import ValkyrienWarfareBase.API.Vector;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.Optional.Method;

@Interface(iface = "li.cil.oc.api.network.SimpleComponent", modid = "OpenComputers")
public class TileEntityShipInterface extends TileEntity implements SimpleComponent{
	
	@Override
	public String getComponentName() {
		return "ship_interface";
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getMass(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipMass(ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos)) };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getPosition(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			Vector ship = new Vector(ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos));
			return new Object[] { ship.X, ship.Y, ship.Z };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getPitch(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos).pitch };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getYaw(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos).yaw };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getRoll(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos).roll };
		}
		return new Object[] { null };
	}
	
	@Callback
	@Method(modid = "OpenComputers")
	public Object[] getYawPitch(Context context, Arguments args) {
		if(ValkyrienWarfareHooks.isBlockPartOfShip(worldObj, pos)) {
			return new Object[] { ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos).yaw,
					ValkyrienWarfareHooks.getShipEntityManagingPos(worldObj, pos).pitch };
		}
		return new Object[] { null };
	}
}
