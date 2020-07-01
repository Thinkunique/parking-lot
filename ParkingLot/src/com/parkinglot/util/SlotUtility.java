package com.parkinglot.util;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;

public class SlotUtility {

	public static ParkingSlot getParkingSlot(int slotNumber,Car car) {
		ParkingSlot slot=new ParkingSlot();
		slot.setSlotNumber(slotNumber);
		slot.setCar(car);
		return slot;
	}
	
}
