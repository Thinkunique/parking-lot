package com.parkinglot.util;

import java.util.ArrayList;

import com.parkinglot.model.ColorGroup;

public class ColorGroupUtility {

	public static ColorGroup getGroup() {
		ColorGroup group = new ColorGroup();
		group.setRegNum(new ArrayList<>());
		group.setSlotNum(new ArrayList<>());
		return group;
	}

}
