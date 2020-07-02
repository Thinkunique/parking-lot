package com.parkinglot.service;

import com.parkinglot.model.Car;

public interface ParkingService {

	void createParkingLot(int size);
	
	public void parkVehicle(Car car);
	
	public void deallocateParkingSlot(int slotNumber);
	
	public void parkingStatus();
	
}
