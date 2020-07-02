package com.parkinglot.command.service;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;
import com.parkinglot.util.ParkingServiceUtility;

public class LeaveParkingLotService implements Command {

	ParkingService parkingService;
	
	public LeaveParkingLotService()
	{
		this.parkingService=ParkingServiceUtility.getParkingService();
	}
	
	@Override
	public void executeCommand(String[] input) {
		int slotNumber=Integer.parseInt(input[1]);
		this.parkingService.deallocateParkingSlot(slotNumber);
	}

}
