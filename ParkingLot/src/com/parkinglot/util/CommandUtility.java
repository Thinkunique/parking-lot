package com.parkinglot.util;

import java.util.ArrayList;
import java.util.List;

import com.parkinglot.constants.ParkingLotConstants;

public class CommandUtility {

	public static List<String> getAllCommands()
	{
		List<String> list=new ArrayList<>();
		list.add(ParkingLotConstants.CREATE_PARKING_LOT);
		list.add(ParkingLotConstants.PARK);
		list.add(ParkingLotConstants.LEAVE_PARKING_LOT);
		list.add(ParkingLotConstants.STATUS_PARKING_LOT);
		list.add(ParkingLotConstants.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOR);
		list.add(ParkingLotConstants.SLOT_NUMBERS_FOR_CARS_WITH_COLOR);
		list.add(ParkingLotConstants.SLOT_NUMBER_FOR_REGISTRATION_NUMBER);
		return list;
	}
	
}
