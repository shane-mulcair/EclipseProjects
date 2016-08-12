package com.codingbat.string2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		  String output="";
		  for(int i=n;i>=0;i--){
			  output+=str.substring(0, i);
		  }
		  return output;
	}
}
