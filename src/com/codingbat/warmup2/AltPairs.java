package com.codingbat.warmup2;

public class AltPairs {
	public String altPairs(String str) {
		int pointer = 0;
		String output = "";
		for (char c : str.toCharArray()) {
			if (pointer % 4 == 0 || pointer % 4 == 1) {
				output += c;
			}
			pointer++;
		}
		return output;
	}
}
