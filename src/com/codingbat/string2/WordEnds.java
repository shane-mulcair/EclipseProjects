package com.codingbat.string2;

public class WordEnds {
	public String wordEnds(String str, String word) {
		String output = "";
		int wordLength = word.length();
		if(str.length()==wordLength){
			return output;
		}
		if (str.startsWith(word)) {
			output += str.charAt(wordLength);
		}

		for (int i = 1; i < str.length() - wordLength; i++) {
			if (str.substring(i, i + wordLength).equals(word)) {
				output += str.charAt(i - 1);
				output += str.charAt(i + wordLength);
			}
		}
		if (str.endsWith(word)) {
			output += str.charAt(str.length() - wordLength - 1);
		}
		return output;
	}
}
