package com.codingbat.warmup2;

public class StringSplosion {
	public String stringSplosion(String str) {
		  String output="";
		  for(int i=0;i<=str.length();i++){
			  output+=str.substring(0, i);
		  }
		  return output;
	}
}
