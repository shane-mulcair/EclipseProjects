package com.codingbat.logic1;

public class FizzString {
	public String fizzString(String str) {
		  String output="";
		  if(str.startsWith("f")){
			  output+="Fizz";
		  }
		  if(str.endsWith("b")){
			  output+="Buzz";
		  }
		  return output.length()>0?output:str;
	}
}
