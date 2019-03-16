package com.cg.vehicle.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


import com.cg.vehicle.beans.Vehicle;

public class VehicleDAOImpl implements IVehicleDAO {
	 Vehicle vehicle = new Vehicle();
	 Vehicle vehicle1 = new Vehicle();
	
	Map<Integer, Vehicle> insuranceEntry;

	public Vehicle setVehicleDetails(Vehicle vehicle) {

		int c = 0;
		int vehiclenum = 0;
		insuranceEntry = new HashMap<Integer, Vehicle>();
		vehiclenum = vehicle.getVehicleNo();

		insuranceEntry.put(vehiclenum, new Vehicle(vehicle.getVehicleNo(), vehicle.getVehicleType(),
				vehicle.getInsurancePeriod(), vehicle.getAadharNo(), vehicle.getMobileNo()));

		c++;
		if (c == 0) {
			System.out.println("invalid details");
			return null;
		} else {

			return vehicle;

		}

	}

	public Vehicle checkInsurancePeriod(Vehicle vehicle) {
		int count=0;
		int vehicleno=0,years=0,days=0;
		
vehicleno=vehicle.getVehicleNo();
		for (Map.Entry m : insuranceEntry.entrySet()) {

			if (m.getKey().equals(vehicleno)) {
				//System.out.println(m.getKey());
				//System.out.println(vehicleno);
					vehicle1=(Vehicle)m.getValue();
					years=vehicle1.getInsurancePeriod();
					days=years*365;
					//System.out.println(vehicle1.getDate());
					String pattern = "yyyy-MM-dd";

					// Create an instance of SimpleDateFormat used for formatting 
					// the string representation of date according to the chosen pattern
					DateFormat df = new SimpleDateFormat(pattern);

					// Get the today date using Calendar object.
					Date today = vehicle.getDate();        
					// Using DateFormat format method we can create a string 
					// representation of a date with the defined format.
					String todayAsString = df.format(today);

					// Print it!
					//System.out.println("Today is: " + todayAsString);
					
					
					
					String oldDate = todayAsString;  
					System.out.println("Date on which you have registered: "+oldDate);
					//Specifying date format that matches the given date
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Calendar c = Calendar.getInstance();
					try{
					   //Setting the date to the given date
					   c.setTime(sdf.parse(oldDate));
					}catch(ParseException e){
						e.printStackTrace();
					 }
					   
					//Number of Days to add
					c.add(Calendar.DAY_OF_MONTH, days);  
					//Date after adding the days to the given date
				
					
					String newDate = sdf.format(c.getTime());  
					//Displaying the new Date after addition of Days
					System.out.println("your insurance date expires on: "+newDate);
					
					try {
						Date date1=(Date) new SimpleDateFormat("yyyy-MM-dd").parse(newDate);
						Date diff = new Date(date1.getTime() - today.getTime());
						System.out.println(diff);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					
					
				count++;
					}

				}
			
		
		if (count == 0) {
			System.out.println("invalid");
			return null;
		} else {

			
			return vehicle;
		}
		
		
		
	}

}
