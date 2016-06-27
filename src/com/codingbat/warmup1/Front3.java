package com.codingbat.warmup1;

public class Front3 {
	
	public String front3(String str) {
		  if(str.length()>=3){
			  String output=str.substring(0, 3);
			  return output+output+output;
		  }
		  else{
			  return str+str+str;
		  }
	}

}
