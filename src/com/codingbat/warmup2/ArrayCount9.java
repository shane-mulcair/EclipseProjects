package com.codingbat.warmup2;

public class ArrayCount9 {
	public int arrayCount9(int[] nums) {
		  int count=0;
		  for(int i:nums){
			  if (i==9){
				  count++;
			  }
		  }
		  return count;
	}
}
