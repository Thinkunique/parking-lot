package com.parkinglot.service;

import java.util.List;

import com.parkinglot.model.Car;

public interface ParkingService {

	void createParkingLot(int size);
	
	public void parkVehicle(Car car);
	
	public void deallocateParkingSlot(int slotNumber);
	
	public void parkingStatus();
	
	public List<String> getRegistrationNumbersForCarColor(String color);
	
	public List<String> getSlotNumbersForCarColor(String color);
	
	public String getSlotNumberForRegistrationNumber(String regNum);
	
}
