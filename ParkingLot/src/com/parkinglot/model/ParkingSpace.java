package com.parkinglot.model;

import java.util.TreeSet;

public class ParkingSpace {

	ParkingSlot slots[];
	
	int size;
	
	TreeSet<Integer> availableSlots;
	
	boolean isFull;
	
	public ParkingSpace(int size)
	{
		this.slots=new ParkingSlot[size];
		this.availableSlots=new TreeSet<>();
		for(int i=size-1;i>=0;i--)
		{
			this.availableSlots.add(i);
		}
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
	public TreeSet<Integer> getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * @param availableSlots the availableSlots to set
	 */
	public void setAvailableSlots(TreeSet<Integer> availableSlots) {
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
