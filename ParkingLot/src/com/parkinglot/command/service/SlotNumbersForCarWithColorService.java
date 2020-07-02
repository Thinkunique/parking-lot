package com.parkinglot.command.service;

import java.util.List;

import com.parkinglot.command.Command;
import com.parkinglot.service.ParkingService;
import com.parkinglot.util.ParkingServiceUtility;

public class SlotNumbersForCarWithColorService implements Command {

	ParkingService parkingService;

	public SlotNumbersForCarWithColorService() {
		this.parkingService = ParkingServiceUtility.getParkingService();
	}

	@Override
	public void executeCommand(String[] input) {
		List<String> list = this.parkingService.getSlotNumbersForCarColor(input[1]);
		if (list == null || list.isEmpty()) {
			System.out.println("Not found");
		} else {
			System.out.println(list);
		}
	}
}
