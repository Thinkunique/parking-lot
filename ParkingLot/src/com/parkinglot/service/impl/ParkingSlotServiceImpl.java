package com.parkinglot.service.impl;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.service.ParkingSlotService;

public class ParkingSlotServiceImpl implements ParkingSlotService {

	@Override
	public ParkingSlot createParkingSlot(int slotNumber,Car car) {
		ParkingSlot slot=new ParkingSlot();
		slot.setSlotNumber(slotNumber);
		slot.setCar(car);
		return slot;
	}

}
