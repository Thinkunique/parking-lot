package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;

public class LeaveParkingLotService implements Command {

	ParkingService parkingService;
	
	public LeaveParkingLotService()
	{
		this.parkingService=new ParkingServiceImpl();
	}
	
	@Override
	public void executeCommand(String[] input) {
		

	}

}
