package com.codingbat.logic1;

public class SumLimit {
	public int sumLimit(int a, int b) {
		  int lenA=String.valueOf(a).length();
		  int lenTotal=String.valueOf(a+b).length();
		  if (lenA==lenTotal){
			  return a+b;
		  }
		  else{
			  return a;
		  }
	}
}
