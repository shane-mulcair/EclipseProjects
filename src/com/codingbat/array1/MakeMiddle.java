package com.codingbat.array1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		  int[] output=new int[2];
		  if(nums.length%2==0){
			  output[0]=nums[nums.length/2-1];
			  output[1]=nums[nums.length/2];
		  }
		  else{
			  output[0]=nums[(int) (Math.floor(nums.length)/2)];
			  output[1]=nums[(int) (Math.floor(nums.length))/2-1];
		  }
		  return output;
	}
}
