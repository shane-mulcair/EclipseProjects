package com.codingbat.warmup2;

public class Array123 {
	public boolean array123(int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		for (int i = 1; i < nums.length; i++) {
			if (i + 1 < (nums.length)) {
				if (nums[i - 1] == 1 && nums[i] == 2 && nums[i + 1] == 3) {
					return true;
				}
			}
		}
		return false;
	}
}
