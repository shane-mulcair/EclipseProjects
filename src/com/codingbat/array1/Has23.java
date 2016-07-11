package com.codingbat.array1;

public class Has23 {
	public boolean has23(int[] nums) {
		  for(int i:nums){
			  if (i==2||i==3){
				  return true;
			  }
		  }
		  return false;
	}
}
