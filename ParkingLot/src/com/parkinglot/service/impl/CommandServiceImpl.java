package com.parkinglot.service.impl;

import com.parkinglot.constants.ParkingLotConstants;
import com.parkinglot.model.Car;
import com.parkinglot.service.CommandService;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.CarUtility;

public class CommandServiceImpl implements CommandService {
	
	ParkingService parkingService;
	
	public CommandServiceImpl()
	{
		this.parkingService=new ParkingServiceImpl();
	}

	@Override
	public void executeCommand(String command) {
	
		String input[]=command.split("\s+");
		String commandAction=input[0];
		if(ParkingLotConstants.CREATE_PARKING_LOT.equalsIgnoreCase(commandAction))
		{
			int size= Integer.parseInt(input[1]);
			this.parkingService.createParkingLot(size);
		}
		else if(ParkingLotConstants.PARK.equalsIgnoreCase(commandAction))
		{
			String regNum=input[1];
			String color=input[2];
			Car car=CarUtility.getCar(regNum, color);
			this.parkingService.parkVehicle(car);
		}
		else if(ParkingLotConstants.LEAVE_PARKING_LOT.equalsIgnoreCase(commandAction))
		{
			int slot=Integer.parseInt(input[1]);
			this.parkingService.deallocateParkingSlot(slot);
		}
		else if(ParkingLotConstants.STATUS_PARKING_LOT.equalsIgnoreCase(commandAction))
		{
			
		}
		else if(ParkingLotConstants.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR.equalsIgnoreCase(commandAction))
		{
			
		}
		else if(ParkingLotConstants.SLOT_NUMBERS_FOR_CARS_WITH_COLOR.equalsIgnoreCase(commandAction))
		{
			
		}
		else if(ParkingLotConstants.SLOT_NUMBER_FOR_REGISTRATION_NUMBER.equalsIgnoreCase(commandAction))
		{
			
		}
		else {
			System.out.println("Not a valid command!");
		}

		
	}

}
