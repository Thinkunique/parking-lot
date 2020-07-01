package com.parkinglot.service;

import com.parkinglot.model.Car;

public interface ParkingService {

	void launchParkingLotSystem();
	
	void createParkingLot(int size);
	
	public void parkVehicle(Car car);
	
}
