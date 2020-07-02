package com.parkinglot.service.impl;

import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.repo.ParkingRepository;
import com.parkinglot.repo.impl.ParkingRepositoryImpl;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.SlotUtility;

public class ParkingServiceImpl implements ParkingService {

	private ParkingRepository repo;

	public ParkingServiceImpl() {
		this.repo = new ParkingRepositoryImpl();
	}

	@Override
	public void createParkingLot(int size) {
		repo.createNewParkingLot(size);
	}

	@Override
	public void parkVehicle(Car car) {
		if (this.repo.getAvailableSlots().isEmpty()) {
			System.out.println("Sorry, parking lot is full");
		} else {
			int slotNumber = this.repo.getAvailableSlots().first();
			ParkingSlot slot = SlotUtility.getParkingSlot(slotNumber, car);
			repo.allocateParkingSlot(slot);
			System.out.println("Allocated slot number: "+(slotNumber+1));
		}
	}

	@Override
	public void deallocateParkingSlot(int slotNumber) {
		repo.deallocateParkingSlot(slotNumber);
		System.out.println("Slot number "+(slotNumber+1)+" is free");
	}

	@Override
	public void parkingStatus() {
		ParkingSlot[] slots = repo.getParkingSlots();
		System.out.println("Slot No.\tRegistration No\tColor");
		for (ParkingSlot slot : slots) {
			if (slot != null) {
				Car car = slot.getCar();
				System.out.println((slot.getSlotNumber()+1)+ "\t" + car.getRegistration_number() + "\t" + car.getColor());
			}
		}
	}

}
