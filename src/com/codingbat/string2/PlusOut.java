package com.codingbat.string2;

public class PlusOut {
	public String plusOut(String str, String word) {
		StringBuilder sb = new StringBuilder();
		int wordLength = word.length();
		for (int i = 0; i <= str.length() - wordLength; i++) {
			if (str.substring(i, i + wordLength).equals(word)) {
				sb.append(word);
				if(wordLength>1){
				i++;
				}
			} else {
				sb.append("+");
			}
		}
		if (!str.endsWith(word)&&wordLength>1) {
			sb.append("+");
		}
		return sb.toString();
	}
}
