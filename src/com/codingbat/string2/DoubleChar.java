package com.codingbat.string2;

public class DoubleChar {
	public String doubleChar(String str) {
		  StringBuilder sb=new StringBuilder();
		  for(char c:str.toCharArray()){
			  sb.append(c+""+c);
		  }
		  return sb.toString();
	}
}
