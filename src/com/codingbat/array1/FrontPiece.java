package com.codingbat.array1;

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		int count = 0;
		int[] output;
		if (nums.length > 1) {
			output = new int[2];
			for (int i : nums) {
				if (count < 2) {
					output[count] = i;
				}
				count++;
			}
		} else {
			output = nums;
		}
		return output;
	}
}
