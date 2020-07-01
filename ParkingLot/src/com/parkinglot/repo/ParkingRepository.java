package com.parkinglot.repo;

import java.util.Stack;

import com.parkinglot.model.ParkingSlot;

public interface ParkingRepository {

	void createNewParkingLot(int size);
	
	void allocateParkingSlot(ParkingSlot slot);
	
	void emptyParkingSlot();
	
	Stack<Integer> getAvailableSlots();
	
}
