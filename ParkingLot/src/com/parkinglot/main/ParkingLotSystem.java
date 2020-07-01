package com.parkinglot.main;

import java.io.IOException;

import com.parkinglot.service.CommandService;
import com.parkinglot.service.InputReaderService;
import com.parkinglot.service.impl.CommandServiceImpl;
import com.parkinglot.service.impl.InputReaderServiceImpl;

public class ParkingLotSystem {
	
	public static void main(String[] args) throws IOException {
		
		InputReaderService inputReader=new InputReaderServiceImpl();
		CommandService commandService=new CommandServiceImpl();
		String command=inputReader.readInputCommand();
		commandService.executeCommand(command);

	}

}
