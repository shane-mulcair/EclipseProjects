package com.codingbat.string1;

public class ExtraEnd {
	public String extraEnd(String str) {
		  String substr=str.substring(str.length()-2);
		  String output="";
		  for(int i=0;i<3;i++){
			  output+=substr;
		  }
		  return output;
	}

}
