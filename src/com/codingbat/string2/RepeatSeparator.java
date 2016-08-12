package com.codingbat.string2;

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		String output = word;
		if (count > 1) {
			for (int i = 1; i < count; i++) {
				output += sep + word;
			}
		}
		if (count == 0) {
			return "";
		}
		return output;
	}
}
