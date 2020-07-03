package com.parkinglot.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUtility {

	private static BufferedReader br;

	private static BufferedReader getBufferedReader() {
		if (br == null) {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		return br;
	}

	public static String readCommand() {
		BufferedReader br = getBufferedReader();
		String input = "";
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

}
