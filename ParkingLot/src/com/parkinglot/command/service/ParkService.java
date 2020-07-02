package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.model.Car;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.CarUtility;
import com.parkinglot.util.ParkingServiceUtility;

public class ParkService implements Command {

	ParkingService parkingService;
	
	public ParkService()
	{
		this.parkingService=ParkingServiceUtility.getParkingService();
	}
	
	@Override
	public void executeCommand(String[] input) {
		String regNum=input[1];
		String color=input[2];
		Car car=CarUtility.getCar(regNum, color);
		this.parkingService.parkVehicle(car);

	}

}
