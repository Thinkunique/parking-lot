package com.parkinglot.model;

public class ParkingSpace {

	Car car;

	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	
	public boolean isEmpty()
	{
		if(car!=null)
		{
			return false;
		}
		return true;
	}
	
}
