package com.parkinglot.util;

import com.parkinglot.service.ParkingService;
import com.parkinglot.service.impl.ParkingServiceImpl;

public class ParkingServiceUtility {

	private static ParkingService parkingService;

	public static ParkingService getParkingService() {
		if (parkingService == null) {
			parkingService = new ParkingServiceImpl();
		}
		return parkingService;
	}

}
