package com.codingbat.array1;

public class MakeEnds {
	public int[] makeEnds(int[] nums) {
		 int[]output=new int[2];
		 output[0]=nums[0];
		 output[1]=nums[nums.length-1];
		 return output;
	}
}
