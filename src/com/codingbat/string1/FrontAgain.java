package com.codingbat.string1;

public class FrontAgain {
	public boolean frontAgain(String str) {
		if(str.length()>=2){
		  return str.startsWith(str.substring(str.length()-2));
		}
		else{
			return false;
		}
	}

}
