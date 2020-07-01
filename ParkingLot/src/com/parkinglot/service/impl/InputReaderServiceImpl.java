package com.parkinglot.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.parkinglot.service.InputReaderService;

public class InputReaderServiceImpl implements InputReaderService {

	BufferedReader br;

	public InputReaderServiceImpl() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public String readInputCommand() {
		String input = "";
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

}
