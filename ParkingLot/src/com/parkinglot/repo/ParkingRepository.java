package com.parkinglot.repo;

import java.util.TreeSet;

import com.parkinglot.model.ParkingSlot;

public interface ParkingRepository {

	void createNewParkingLot(int size);
	
	void allocateParkingSlot(ParkingSlot slot);
	
	void deallocateParkingSlot(int slotNumber);
	
	TreeSet<Integer> getAvailableSlots();
	
	public ParkingSlot[] getParkingSlots();
	
}
