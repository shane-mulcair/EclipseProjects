package com.codingbat.warmup2;

public class StringYak {
	public String stringYak(String str) {
		String output = "";
		if (str.length() >= 3) {
			for (int i = 0; i < str.length(); i++) {
					if (i + 2 < str.length()&&str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
						i += 2;
					} else {
						output += str.charAt(i);
					}
				}
			}
		return output;
	}
}
