package com.cg.vehicle.beans;

import java.sql.Date;

public class Vehicle {
	private int vehicleNo;
	private String vehicleType;
	private int insurancePeriod;
	private String aadharNo;
	private String mobileNo;
	private Date date;
	public Vehicle(int vehicleNo, String vehicleType, int insurancePeriod, String aadharNo, String mobileNo) {
		this.vehicleNo=vehicleNo;
		this.vehicleType=vehicleType;
		this.insurancePeriod=insurancePeriod;
		this.aadharNo=aadharNo;
		this.mobileNo=mobileNo;
		
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
