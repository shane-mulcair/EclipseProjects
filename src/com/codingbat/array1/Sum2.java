package com.codingbat.array1;

public class Sum2 {
	public int sum2(int[] nums) {
		  int count=0;
		  int total=0;
		  for(int i:nums){
			  if(count<2){
			  total+=i;
			  }
			  count++;
		  }
		  return total;
	}
}
