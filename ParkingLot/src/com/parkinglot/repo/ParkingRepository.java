package com.parkinglot.repo;

import java.util.List;
import java.util.TreeSet;

import com.parkinglot.model.ParkingSlot;

public interface ParkingRepository {

	void createNewParkingLot(int size);
	
	void allocateParkingSlot(ParkingSlot slot);
	
	void deallocateParkingSlot(int slotNumber);
	
	TreeSet<Integer> getAvailableSlots();
	
	public ParkingSlot[] getParkingSlots();
	
	public List<String> getRegistrationNumbersForCarColor(String color);
	
	public List<String> getSlotNumbersForCarColor(String color);
	
	public String getSlotNumberForRegistrationNumber(String regNum);
	
}
