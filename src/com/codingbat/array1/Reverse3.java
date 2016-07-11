package com.codingbat.array1;

public class Reverse3 {
	//Hate doing it this way, but the input is guaranteed to be size=3
	
	public int[] reverse3(int[] nums) {
		int[] output=new int[3];
		output[0]=nums[2];
		output[1]=nums[1];
		output[2]=nums[0];
		return output;
	}
}
