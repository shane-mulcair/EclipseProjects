package com.codingbat.array1;

public class MaxTriple {
	public int maxTriple(int[] nums) {
		  int max=0;
		  if(nums[0]>max){
			  max=nums[0];
		  }
		  if(nums[nums.length-1]>max){
			  max=nums[nums.length-1];
		  }
		  if(nums[nums.length/2]>max){
			  max=nums[nums.length/2];
		  }
		  return max;
	}
}
