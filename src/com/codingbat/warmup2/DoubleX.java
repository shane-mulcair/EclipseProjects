package com.codingbat.warmup2;

public class DoubleX {
	public boolean doubleX(String str) {
		  for(int i=1;i<str.length();i++){
			  if(str.charAt(i-1)=='x'){
				  if(str.charAt(i)=='x'){
					  return true;
				  }
				  else{
					  return false;
				  }
			  }
		  }
		  return false;
	}
}
