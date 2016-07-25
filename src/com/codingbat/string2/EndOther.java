package com.codingbat.string2;

public class EndOther {
	public boolean endOther(String a, String b) {
		  String aL=a.toLowerCase();
		  String bL=b.toLowerCase();
		  if(aL.endsWith(bL)||bL.endsWith(aL)){
			  return true;
		  }
		  return false;
	}
}
