package com.codingbat.warmup1;

public class Diff21 {

	public int diff21(int n) {
		  if (n<=21){
			  return Math.abs(21-n);
		  }
		  else{
			  return Math.abs(2*(21-n));
		  }
	}
}
