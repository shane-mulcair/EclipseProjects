package com.codingbat.string2;

public class XyzThere {
	public boolean xyzThere(String str) {
		if(str.equals("xyz")){
			return true;
		}
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) != '.' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'y'
					&& str.charAt(i + 3) == 'z') {
				return true;
			}
			else if (i==0&&str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
				return true;
			}
			
		}
		return false;
	}
}
