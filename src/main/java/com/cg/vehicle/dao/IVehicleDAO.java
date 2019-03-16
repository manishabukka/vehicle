package com.cg.vehicle.dao;

import com.cg.vehicle.beans.Vehicle;

public interface IVehicleDAO {

	Vehicle setVehicleDetails(Vehicle vehicle);

	Vehicle checkInsurancePeriod(Vehicle vehicle);

}
