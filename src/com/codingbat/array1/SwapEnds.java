package com.codingbat.array1;

public class SwapEnds {
	public int[] swapEnds(int[] nums) {
		 int[] output=new int[nums.length];
		 output[0]=nums[nums.length-1];
		 output[nums.length-1]=nums[0];
		 for(int i=1;i<nums.length-1;i++){
			 output[i]=nums[i];
		 }
		 return output;
	}
}
