package com.parkinglot.constants;

public enum Color {
	
	VIOLET("violet"),
	RED("red"),
	BLUE("blue"),
	YELLOW("yellow"),
	ORANGE("orange"),
	BLACK("black"),
	BROWN("brown");
	
	private final String colorCode;
	
	private Color(String code)
	{
		this.colorCode=code;
	}

}
