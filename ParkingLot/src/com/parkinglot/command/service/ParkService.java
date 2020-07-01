package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.model.Car;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;
import com.parkinglot.util.CarUtility;

public class ParkService implements Command {

	ParkingService parkingService;
	
	public ParkService()
	{
		this.parkingService=new ParkingServiceImpl();
	}
	
	@Override
	public void executeCommand(String[] input) {
		String regNum=input[1];
		String color=input[2];
		Car car=CarUtility.getCar(regNum, color);
		this.parkingService.parkVehicle(car);

	}

}
