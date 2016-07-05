package com.codingbat.string1;

public class StartWord {
	public String startWord(String str, String word) {
		if (str.length() < word.length()) {
			return "";
		}
		if (word.length() == 1) {
			return str.charAt(0) + "";
		}

		String output = "";
		boolean match = false;
		for (int i = 1; i < word.length(); i++) {
			if (str.charAt(i) == (word.charAt(i))) {
				match = true;
				output += str.charAt(i);
			}
			else{
				match=false;
				output="";
			}
		}
		if (match) {
			output = str.charAt(0) + output;
		}
		return output;
	}

}
