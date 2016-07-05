package com.codingbat.warmup2;

public class StringX {
	public String stringX(String str) {
		  String output="";
		  for(int i=0;i<str.length();i++){
			  if(i==0||i==str.length()-1||str.charAt(i)!='x'){
				  output+=str.charAt(i);
			  }
		  }
		  return output;
	}
}
