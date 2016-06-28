package com.codingbat.warmup1;

public class EveryNth {
	public String everyNth(String str, int n) {
		  String output="";
		  for(int i=0;i<str.length();i+=n){
			  output+=str.charAt(i);
		  }
		  return output;
	}
}
