package com.parkinglot.service.impl;

import com.parkinglot.constants.ParkingLotConstants;
import com.parkinglot.service.CommandService;

public class CommandServiceImpl implements CommandService {

	@Override
	public void executeCommand(String command) {
	
		if(ParkingLotConstants.CREATE_PARKING_LOT.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.PARK.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.LEAVE_PARKING_LOT.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.STATUS_PARKING_LOT.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.SLOT_NUMBERS_FOR_CARS_WITH_COLOR.equalsIgnoreCase(command))
		{
			
		}
		else if(ParkingLotConstants.SLOT_NUMBER_FOR_REGISTRATION_NUMBER.equalsIgnoreCase(command))
		{
			
		}
		else {
			System.out.println("Not a valid command!");
		}

		
	}

}
