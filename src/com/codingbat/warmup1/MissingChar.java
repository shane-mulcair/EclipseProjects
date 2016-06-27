package com.codingbat.warmup1;

public class MissingChar {

	public String missingChar(String str, int n) {
		String output="";  
		for(int i=0;i<str.length();i++){
			  if (i!=n){
				  output+=str.charAt(i);
			  }
		  }
		return output;
	}

}
