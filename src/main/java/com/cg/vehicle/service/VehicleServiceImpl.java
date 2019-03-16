package com.cg.vehicle.service;

import com.cg.vehicle.beans.Vehicle;
import com.cg.vehicle.dao.IVehicleDAO;
import com.cg.vehicle.dao.VehicleDAOImpl;

public class VehicleServiceImpl implements IVehicleService {
	Vehicle vehicle=new Vehicle();
	IVehicleDAO iVehicleDAO=new VehicleDAOImpl();

	public Vehicle setVehicleDetails(Vehicle vehicle) {

		vehicle=iVehicleDAO.setVehicleDetails(vehicle);
		return vehicle;
	}

	public Vehicle checkInsurancePeriod(Vehicle vehicle) {
		vehicle=iVehicleDAO.checkInsurancePeriod(vehicle);
		return vehicle;
	}

}
