package com.parkinglot.service;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;

public interface ParkingSlotService {

	public ParkingSlot createParkingSlot(int slotNumber,Car car);
	
}
