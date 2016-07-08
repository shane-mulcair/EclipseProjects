package com.codingbat.logic1;

public class FizzString2 {
	public String fizzString2(int n) {
		  String output="";
		  if(n%3==0){
			  output+="Fizz";
		  }
		  if(n%5==0){
			  output+="Buzz";
		  }
		  return output.length()>0?output+"!":n+"!";
	}
}
