package com.parkinglot.service.impl;


import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.repo.ParkingRepository;
import com.parkinglot.repo.impl.ParkingRepositoryImpl;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.SlotUtility;

public class ParkingServiceImpl implements ParkingService {
	
	private ParkingRepository repo;
	
	public ParkingServiceImpl()
	{
		this.repo=new ParkingRepositoryImpl();
	}

	@Override
	public void createParkingLot(int size) {
		repo.createNewParkingLot(size);
	}

	@Override
	public void parkVehicle(Car car) {
		int slotNumber=this.repo.getAvailableSlots().first();
		ParkingSlot slot=SlotUtility.getParkingSlot(slotNumber, car);
		repo.allocateParkingSlot(slot);
	}

	@Override
	public void deallocateParkingSlot(int slotNumber) {
		repo.deallocateParkingSlot(slotNumber);
	}	
	
}
