package com.codingbat.array1;

public class SameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length>0){
			  return nums[0]==nums[nums.length-1];
		  }
		  return false;
	}
}
