package com.codingbat.string2;

public class CatDog {
	public boolean catDog(String str) {
		  int catCount=0;
		  int dogCount=0;
		  for(int i=0;i<str.length()-2;i++){
			  if(str.substring(i,i+3).equals("cat")){
				  catCount++;
			  }
			  else if(str.substring(i,i+3).equals("dog")){
				  dogCount++;
			  }
		  }
		  return dogCount==catCount;
	}
}
