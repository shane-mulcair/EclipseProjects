package com.codingbat.logic1;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if(equalOk){
			  return c>=b&&b>=a;
		  }
		  else{
			  return c>b&&b>a;
		  }
	}
}
