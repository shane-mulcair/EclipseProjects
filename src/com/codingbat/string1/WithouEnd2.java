package com.codingbat.string1;

public class WithouEnd2 {
	public String withouEnd2(String str) {
		  if(str.length()<3){
			  return "";
		  }
		  else{
			  return str.substring(1, str.length()-1);
		  }
	}

}
