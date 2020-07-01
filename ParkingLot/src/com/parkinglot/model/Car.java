package com.parkinglot.model;

import com.parkinglot.constants.Color;

public class Car {

	private String registration_number;
	
	private Color color;

	/**
	 * @return the registration_number
	 */
	public String getRegistration_number() {
		return registration_number;
	}

	/**
	 * @param registration_number the registration_number to set
	 */
	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
}
