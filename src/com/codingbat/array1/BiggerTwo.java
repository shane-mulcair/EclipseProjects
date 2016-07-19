package com.codingbat.array1;

public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		  int totalA=0;
		  int totalB=0;
		  for(int i:a){
			  totalA+=i;
		  }
		  for(int j:b){
			  totalB+=j;
		  }
		  return totalA>=totalB?a:b;
	}
}
