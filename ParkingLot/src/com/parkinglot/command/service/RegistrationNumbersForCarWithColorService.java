package com.parkinglot.command.service;

import java.util.List;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.ParkingServiceUtility;

public class RegistrationNumbersForCarWithColorService implements Command {

	ParkingService parkingService;

	public RegistrationNumbersForCarWithColorService() {
		this.parkingService = ParkingServiceUtility.getParkingService();
	}

	@Override
	public void executeCommand(String[] input) {
		List<String> list = this.parkingService.getRegistrationNumbersForCarColor(input[1]);
		if (list == null || list.isEmpty()) {
			System.out.println("Not found");
		} else {
			System.out.println(list);
		}
	}

}
