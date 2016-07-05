package com.codingbat.warmup2;

public class Last2 {
	public int last2(String str) {
		int count = 0;
		if (str.length() > 1) {
			String substr = str.substring(str.length() - 2);
			for (int i = 1; i < str.length(); i++) {
				String pair = str.charAt(i - 1) + "" + str.charAt(i);
				if (pair.equals(substr)) {
					count++;
				}
			}
		}
		return count==0?count:count-1;
	}
}
