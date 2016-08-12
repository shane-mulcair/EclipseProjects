package com.codingbat.string2;

public class GetSandwich {
	public String getSandwich(String str) {
		String output = "";
		if (str.length() < 10) {
			return output;
		}
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i).startsWith("bread")){
				if(str.substring(i+1).contains("bread")){
					return str.substring(i+5,str.substring(i+1).indexOf('b')+i+1 );
				}
			}
		}
		return output;
	}
}
