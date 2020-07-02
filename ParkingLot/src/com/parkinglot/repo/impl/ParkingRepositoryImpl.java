package com.parkinglot.repo.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.model.ParkingSpace;
import com.parkinglot.repo.ParkingRepository;

public class ParkingRepositoryImpl implements ParkingRepository {

	ParkingSpace parkingSpace;
	
	Map<String,String> colors_Reg_Map;
	
	Map<String,String> colors_slot_Map;

	@Override
	public void createNewParkingLot(int size) {
		this.parkingSpace = new ParkingSpace(size);
		this.colors_Reg_Map=new HashMap<>();
		this.colors_slot_Map=new HashMap<>();
	}

	@Override
	public void allocateParkingSlot(ParkingSlot slot) {
		if (!parkingSpace.isFull()) {
			Integer availableSlot = parkingSpace.getAvailableSlots().pollFirst();
			parkingSpace.getSlots()[availableSlot] = slot;
			Car car=slot.getCar();
			this.colors_Reg_Map.put(car.getColor(),car.getRegistration_number());
			this.colors_slot_Map.put(car.getColor(),String.valueOf((availableSlot+1)));
		} else {
			System.out.println("full");
		}
	}

	@Override
	public void deallocateParkingSlot(int slotNumber) {
		parkingSpace.getAvailableSlots().add(slotNumber);
		parkingSpace.getSlots()[slotNumber] = null;
	}

	@Override
	public TreeSet<Integer> getAvailableSlots() {
		return this.parkingSpace.getAvailableSlots();
	}

	@Override
	public ParkingSlot[] getParkingSlots() {
		return this.parkingSpace.getSlots();
	}

}
