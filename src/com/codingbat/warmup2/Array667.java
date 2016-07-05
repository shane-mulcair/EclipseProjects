package com.codingbat.warmup2;

public class Array667 {
	public int array667(int[] nums) {
		int count=0;  
		for(int i=1;i<nums.length;i++){
			 if(nums[i-1]==6 &&(nums[i]==6||nums[i]==7)){
				 count++;
			 }
		}
		return count;
	}
}
