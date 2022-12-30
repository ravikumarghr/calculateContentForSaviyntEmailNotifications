package com.ghrartifacts.utilities;

public class StringUtility {

	public static boolean isValidString(String attr) {

		if (attr == null || attr.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
