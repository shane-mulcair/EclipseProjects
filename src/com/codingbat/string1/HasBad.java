package com.codingbat.string1;

public class HasBad {
	public boolean hasBad(String str) {
		if(str.length()>=4){ 
		return str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad"); 
		}
		else if(str.length()==3){
			return str.substring(0,3).equals("bad");
		}
		else{
			return false;
		}
	}
}
