package com.parkinglot.model;

import java.util.Stack;

public class ParkingSpace {

	ParkingSlot slots[];
	
	int size;
	
	Stack<Integer> availableSlots;
	
	boolean isFull;
	
	public ParkingSpace(int size)
	{
		this.slots=new ParkingSlot[size];
		this.availableSlots=new Stack<>();
	}

	/**
	 * @return the slots
	 */
	public ParkingSlot[] getSlots() {
		return slots;
	}

	/**
	 * @param slots the slots to set
	 */
	public void setSlots(ParkingSlot[] slots) {
		this.slots = slots;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the availableSlots
	 */
	public Stack<Integer> getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * @param availableSlots the availableSlots to set
	 */
	public void setAvailableSlots(Stack<Integer> availableSlots) {
		this.availableSlots = availableSlots;
	}

	/**
	 * @return the isFull
	 */
	public boolean isFull() {
		return isFull;
	}

	/**
	 * @param isFull the isFull to set
	 */
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	
	
	
}
