package com.parkinglot.util;

import com.parkinglot.constants.Color;
import com.parkinglot.model.Car;

public class CarUtility {

	public static Car getCar(String regNum,String color)
	{
		Car car=new Car();
		car.setRegistration_number(regNum);
		car.setColor(Color.valueOf(color));
		return car;
	}
	
}
