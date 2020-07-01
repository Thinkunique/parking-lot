package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;

public class CreateParkingLotService implements Command {

	ParkingService parkingService;
	
	public CreateParkingLotService()
	{
		this.parkingService=new ParkingServiceImpl();
	}
	
	@Override
	public void executeCommand(String[] input) {
		int size= Integer.parseInt(input[1]);
		this.parkingService.createParkingLot(size);
	}

}
