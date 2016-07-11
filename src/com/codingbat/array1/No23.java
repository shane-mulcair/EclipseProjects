package com.codingbat.array1;

public class No23 {
	public boolean no23(int[] nums) {
		  for(int i:nums){
			  if (i==2||i==3){
				  return false;
			  }
		  }
		  return true;
	}
}
