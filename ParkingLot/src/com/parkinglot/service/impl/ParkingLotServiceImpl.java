package com.parkinglot.service.impl;


import com.parkinglot.service.CommandService;
import com.parkinglot.service.InputReaderService;
import com.parkinglot.service.ParkingLotService;

public class ParkingLotServiceImpl implements ParkingLotService {

	private CommandService commandService;
	
	private InputReaderService inputReader;
	
	public ParkingLotServiceImpl()
	{
		this.commandService=new CommandServiceImpl();
		this.inputReader=new InputReaderServiceImpl();
	}

	@Override
	public void launchParkingLotSystem() {
		String command=inputReader.readInputCommand();
		commandService.executeCommand(command);
	}

	@Override
	public void createParkingLot(int size) {
		
		
	}
	
	
	
	
}
