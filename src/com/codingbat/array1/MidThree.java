package com.codingbat.array1;

public class MidThree {
	public int[] midThree(int[] nums) {
		  int[] output=new int[3];
		  int len=nums.length;
		  int mid=len/2;
		  output[0]=nums[mid-1];
		  output[1]=nums[mid];
		  output[2]=nums[mid+1];
		  return output;
	}
}
