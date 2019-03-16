package com.cg.vehicle;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.cg.vehicle.beans.Vehicle;
import com.cg.vehicle.dao.IVehicleDAO;
import com.cg.vehicle.service.IVehicleService;
import com.cg.vehicle.service.VehicleServiceImpl;

public class App 
{
	static Vehicle vehicle=new Vehicle();
	static IVehicleService iVehicleService = new VehicleServiceImpl();
	static Scanner sc =new Scanner(System.in);
    public static void main( String[] args )
    {	do {
        System.out.println("enter 1)Vehicle Insurance Registration\n" + "2)	Insurance Validity Check\n" + "3)	Exit\r\n" + "");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:System.out.println("enter vehicle number");
        vehicle.setVehicleNo(sc.nextInt());
        System.out.println("enter vehicle type");
        vehicle.setVehicleType(sc.next());
        System.out.println("enter insurance period in years");
        vehicle.setInsurancePeriod(sc.nextInt());
        System.out.println("enter aadhar number");
        vehicle.setAadharNo(sc.next());
        System.out.println("enter mobile number");
        vehicle.setMobileNo(sc.next());
        vehicle.setDate(Date.valueOf(LocalDate.now()));
        vehicle=iVehicleService.setVehicleDetails(vehicle);
        System.out.println(vehicle.getDate());
        if(vehicle!=null)
        {
        	System.out.println("done");
        }
        	break;
        case 2:System.out.println("enter vehicle number");
        vehicle.setVehicleNo(sc.nextInt());
        	vehicle=iVehicleService.checkInsurancePeriod(vehicle);
        	break;
        case 3:System.exit(0);
        	break;
        	
        }
    }while(true);
    }
}
