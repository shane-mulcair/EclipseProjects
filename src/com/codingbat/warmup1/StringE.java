package com.codingbat.warmup1;

public class StringE {
	public boolean stringE(String str) {
		  int count=0;
		  for(char c:str.toCharArray()){
			  if(c=='e'){
				  count++;
			  }
		  }
		  if(count>=1 &&count<=3){
			  return true;
		  }
		  else{
			  return false;
		  }
	}
}
