package com.codingbat.logic2;

public class OneTwo {
	public String oneTwo(String str) {
		String output=""; 
		if(str.length()<3){
			return "";
		}
		for(int i=2;i<=str.length();i+=3){
			  output+=str.charAt(i-1); 
			  output+=str.charAt(i);
			  output+=str.charAt(i-2);
			  
		  }
		return output;
	}
}
