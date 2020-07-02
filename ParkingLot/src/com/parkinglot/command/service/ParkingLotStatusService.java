package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;
import com.parkinglot.util.ParkingServiceUtility;

public class ParkingLotStatusService implements Command {

	ParkingService parkingService;
	
	public ParkingLotStatusService()
	{
		this.parkingService=ParkingServiceUtility.getParkingService();
	}
	
	
	@Override
	public void executeCommand(String[] input) {
		this.parkingService.parkingStatus();
	}

}
