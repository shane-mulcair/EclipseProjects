package com.codingbat.string1;

public class MinCat {
	public String minCat(String a, String b) {
		  int al=a.length();
		  int bl=b.length();
		  if(al==bl){
			  return a+b;
		  }
		  else if(al>bl){
			  return a.substring(al-bl)+b;
		  }
		  else{
			  return a+b.substring(bl-al);
		  }
	}

}
