package com.codingbat.warmup1;

public class Front22 {
	public String front22(String str) {
		  if (str.length()>2){
			  String output=str.substring(0, 2);
			  return output+str+output;
		  }
		  else{
			  return str+str+str;
		  }
	}

}
