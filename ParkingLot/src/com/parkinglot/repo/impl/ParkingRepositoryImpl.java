package com.parkinglot.repo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.parkinglot.model.Car;
import com.parkinglot.model.ColorGroup;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.model.ParkingSpace;
import com.parkinglot.repo.ParkingRepository;
import com.parkinglot.util.ColorGroupUtility;

public class ParkingRepositoryImpl implements ParkingRepository {

	ParkingSpace parkingSpace;

	Map<String, ColorGroup> colorsMap;
	
	Map<String, String> regMap;

	@Override
	public void createNewParkingLot(int size) {
		this.parkingSpace = new ParkingSpace(size);
		this.colorsMap = new HashMap<>();
		this.regMap=new HashMap<>();
	}

	@Override
	public void allocateParkingSlot(ParkingSlot slot) {
		if (!parkingSpace.isFull()) {
			Integer availableSlot = parkingSpace.getAvailableSlots().pollFirst();
			parkingSpace.getSlots()[availableSlot] = slot;
			String slotNumber=String.valueOf((availableSlot + 1));
			Car car = slot.getCar();
			this.regMap.put(car.getRegistration_number(),slotNumber);
			ColorGroup group = this.colorsMap.get(car.getColor());
			if (group != null) {
				group.getRegNum().add(car.getRegistration_number());
				group.getSlotNum().add(slotNumber);
			} else {
				group = ColorGroupUtility.getGroup();
				group.getRegNum().add(car.getRegistration_number());
				group.getSlotNum().add(slotNumber);
				this.colorsMap.put(car.getColor(), group);
			}
		} else {
			System.out.println("full");
		}
	}

	@Override
	public void deallocateParkingSlot(int slotNumber) {
		parkingSpace.getAvailableSlots().add(slotNumber-1);
		ParkingSlot slot=parkingSpace.getSlots()[slotNumber-1];
		Car car=slot.getCar();
		List<String> list=this.colorsMap.get(car.getColor()).getRegNum();
		List<String> list2=this.colorsMap.get(car.getColor()).getSlotNum();
		list.remove(car.getRegistration_number());
		list2.remove(slot.getSlotNumber());
		regMap.remove(car.getRegistration_number());
		parkingSpace.getSlots()[slotNumber-1] = null;
	}

	@Override
	public TreeSet<Integer> getAvailableSlots() {
		return this.parkingSpace.getAvailableSlots();
	}

	@Override
	public ParkingSlot[] getParkingSlots() {
		return this.parkingSpace.getSlots();
	}

	@Override
	public List<String> getRegistrationNumbersForCarColor(String color) {
		ColorGroup group=this.colorsMap.get(color);
		return group.getRegNum();
	}

	@Override
	public List<String> getSlotNumbersForCarColor(String color) {
		ColorGroup group=this.colorsMap.get(color);
		return group.getSlotNum();
	}

	@Override
	public String getSlotNumberForRegistrationNumber(String regNum) {
		return this.regMap.get(regNum);
	}

}
