package com.parkinglot.main;

import java.io.IOException;
import java.util.Map;

import com.parkinglot.command.Command;
import com.parkinglot.constants.ParkingLotConstants;
import com.parkinglot.service.InputReaderService;
import com.parkinglot.service.impl.InputReaderServiceImpl;
import com.parkinglot.util.CommandUtility;

public class ParkingLotSystem {
	
	public static void main(String[] args) throws IOException {
		
		InputReaderService inputReader=new InputReaderServiceImpl();
		String command=inputReader.readInputCommand();
		executeCommand(command);
	}
	
	public static void executeCommand(String inputCommand) {
		
		String inputs[]=inputCommand.split(ParkingLotConstants.SPACE);
		String commandAction=inputs[0];
		Map<String,Command> commands=CommandUtility.getAllCommands();
		for(Map.Entry<String, Command> command:commands.entrySet())
		{
			if(command.getKey().equalsIgnoreCase(commandAction))
			{
				command.getValue().executeCommand(inputs);
			}
		}
	}

}
