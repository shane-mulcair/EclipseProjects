package com.codingbat.string2;

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		if(str.equals("xyz")){
			return true;
		}
		if(str.length()<3){
			return false;
		}
		for(int i=str.length()/2-1;i<str.length()-1;i++){
			if(str.charAt(i-1)=='x'&&str.charAt(i)=='y'&&str.charAt(i+1)=='z'){
				return Math.abs(((str.length()-(i+2))-(i-1)))<2;
			}
		}
		return false;
	}
}
