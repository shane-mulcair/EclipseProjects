package com.codingbat.warmup2;

public class StringMatch {
	public int stringMatch(String a, String b) {
		  int count=0;
		  for(int i=1;(i<a.length()&&i<b.length());i++){
			  String subA=a.substring(i-1, i+1);
			  String subB=b.substring(i-1, i+1);
			  if(subA.equals(subB)){
				  count++;
			  }
		  }
		  return count;
	}
}
