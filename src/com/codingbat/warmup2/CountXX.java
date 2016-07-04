package com.codingbat.warmup2;

public class CountXX {
	public int countXX(String str) {
		int counter=0;  
		for(int i=1;i<str.length();i++){
			  if (str.charAt(i)=='x' && str.charAt(i)==str.charAt(i-1)){
				  counter++;
			  }
		}
		return counter;
	}
}
