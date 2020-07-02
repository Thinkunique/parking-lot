package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;
import com.parkinglot.util.ParkingServiceUtility;

public class SlotForRegistrationNumberService implements Command {

	ParkingService parkingService;
	
	public SlotForRegistrationNumberService()
	{
		this.parkingService=ParkingServiceUtility.getParkingService();
	}
	
	
	@Override
	public void executeCommand(String[] input) {
		

	}

}
