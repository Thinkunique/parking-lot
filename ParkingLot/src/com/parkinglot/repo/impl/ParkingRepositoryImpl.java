package com.parkinglot.repo.impl;

import java.util.Stack;

import com.parkinglot.model.ParkingSlot;
import com.parkinglot.model.ParkingSpace;
import com.parkinglot.repo.ParkingRepository;

public class ParkingRepositoryImpl implements ParkingRepository {

	ParkingSpace parkingSpace;
	
	@Override
	public void createNewParkingLot(int size) {
		this.parkingSpace=new ParkingSpace(size);
	}

	@Override
	public void allocateParkingSlot(ParkingSlot slot) {
		if(!parkingSpace.isFull())
		{
			Integer availableSlot=parkingSpace.getAvailableSlots().pop();
			parkingSpace.getSlots()[availableSlot]=slot;
		}
		else{
			System.out.println("full");
		}
	}

	@Override
	public void emptyParkingSlot() {

	}

	@Override
	public Stack<Integer> getAvailableSlots() {
		return this.parkingSpace.getAvailableSlots();
	}

}
