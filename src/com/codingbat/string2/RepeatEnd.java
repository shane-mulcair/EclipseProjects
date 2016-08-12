package com.codingbat.string2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		  String end=str.substring(str.length()-n);
		  String output="";
		  for(int i=0;i<n;i++){
			  output+=end;
		  }
		  return output;
	}
}
