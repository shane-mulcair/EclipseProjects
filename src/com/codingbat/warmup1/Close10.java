package com.codingbat.warmup1;

public class Close10 {
	public int close10(int a, int b) {
		  int a1=Math.abs(10-a);
		  int b1=Math.abs(10-b);
		  if (a1>b1){
			  return b;
		  }
		  else if(b1>a1){
			  return a;
		  }
		  else return 0;
	}
}
