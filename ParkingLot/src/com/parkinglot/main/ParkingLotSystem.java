package com.parkinglot.main;

import java.io.IOException;
import java.util.Map;

import com.parkinglot.command.Command;
import com.parkinglot.constants.ParkingLotConstants;
import com.parkinglot.util.CommandUtility;
import com.parkinglot.util.InputUtility;

public class ParkingLotSystem {

	public static void main(String[] args) throws IOException {
		while (true) {
			String command = InputUtility.readCommand();
			executeCommand(command);
		}
	}

	public static void executeCommand(String inputCommand) {
		String inputs[] = inputCommand.split(ParkingLotConstants.SPACE);
		String commandAction = inputs[0];
		boolean commandNotFound = true;
		Map<String, Command> commands = CommandUtility.getAllCommands();
		for (Map.Entry<String, Command> command : commands.entrySet()) {
			if (command.getKey().equalsIgnoreCase(commandAction)) {
				command.getValue().executeCommand(inputs);
				commandNotFound = false;
			}
		}
		if (commandNotFound) {
			System.out.println("Command not found.");
		}
	}

}
