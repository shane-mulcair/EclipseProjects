package com.codingbat.string2;

public class MixString {
	public String mixString(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int aL = a.length();
		int bL = b.length();
		if (aL > bL) {
			for (int i = 0; i < aL; i++) {
				sb.append(a.charAt(i));
				if (i < bL) {
					sb.append(b.charAt(i));
				}
			}
		} else {
			for (int i = 0; i < bL; i++) {
				if (i < aL) {
					sb.append(a.charAt(i));

				}
				sb.append(b.charAt(i));
			}
		}
		return sb.toString();
	}
}
