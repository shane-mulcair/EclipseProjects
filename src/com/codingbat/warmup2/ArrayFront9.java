package com.codingbat.warmup2;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		  int limit=0;
		  for(int i:nums){
			  if(limit<4){
				  if(i==9){
					  return true;
					  }
			  }
			  limit++;
		  }
		  return false;
	}
}
