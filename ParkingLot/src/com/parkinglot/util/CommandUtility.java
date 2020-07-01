package com.parkinglot.util;

import java.util.HashMap;
import java.util.Map;

import com.parkinglot.command.Command;
import com.parkinglot.command.service.CreateParkingLotService;
import com.parkinglot.command.service.LeaveParkingLotService;
import com.parkinglot.command.service.ParkService;
import com.parkinglot.command.service.ParkingLotStatusService;
import com.parkinglot.command.service.RegistrationNumbersForCarWithColorService;
import com.parkinglot.command.service.SlotForRegistrationNumberService;
import com.parkinglot.command.service.SlotNumbersForCarWithColorService;
import com.parkinglot.constants.ParkingLotConstants;

public class CommandUtility {

	public static Map<String,Command> getAllCommands()
	{
		Map<String,Command> commands=new HashMap<>();
		commands.put(ParkingLotConstants.CREATE_PARKING_LOT,new CreateParkingLotService());
		commands.put(ParkingLotConstants.PARK,new ParkService());
		commands.put(ParkingLotConstants.LEAVE_PARKING_LOT,new LeaveParkingLotService());
		commands.put(ParkingLotConstants.STATUS_PARKING_LOT,new ParkingLotStatusService());
		commands.put(ParkingLotConstants.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR,new RegistrationNumbersForCarWithColorService());
		commands.put(ParkingLotConstants.SLOT_NUMBERS_FOR_CARS_WITH_COLOR,new SlotNumbersForCarWithColorService());
		commands.put(ParkingLotConstants.SLOT_NUMBER_FOR_REGISTRATION_NUMBER,new SlotForRegistrationNumberService());
		return commands;
	}
	
}
