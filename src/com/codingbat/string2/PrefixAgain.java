package com.codingbat.string2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		  String prefix=str.substring(0, n);
		  return str.substring(1).contains(prefix);
	}
}
