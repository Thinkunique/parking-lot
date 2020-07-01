package com.parkinglot.service.impl;


import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingSlot;
import com.parkinglot.repo.ParkingRepository;
import com.parkinglot.repo.impl.ParkingRepositoryImpl;
import com.parkinglot.service.CommandService;
import com.parkinglot.service.InputReaderService;
import com.parkinglot.service.ParkingService;
import com.parkinglot.service.ParkingSlotService;

public class ParkingServiceImpl implements ParkingService {

	private CommandService commandService;
	
	private InputReaderService inputReader;
	
	private ParkingSlotService slotService;
	
	private ParkingRepository repo;
	
	public ParkingServiceImpl()
	{
		this.commandService=new CommandServiceImpl();
		this.inputReader=new InputReaderServiceImpl();
		this.slotService=new ParkingSlotServiceImpl();
		this.repo=new ParkingRepositoryImpl();
	}

	@Override
	public void launchParkingLotSystem() {
		String command=inputReader.readInputCommand();
		commandService.executeCommand(command);
	}

	@Override
	public void createParkingLot(int size) {
		
		
	}

	@Override
	public void parkVehicle(Car car) {
		int slotNumber=this.repo.getAvailableSlots().peek();
		ParkingSlot slot=slotService.createParkingSlot(slotNumber, car);
		repo.allocateParkingSlot(slot);
	}
	
	
	
	
}
