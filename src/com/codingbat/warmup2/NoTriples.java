package com.codingbat.warmup2;

public class NoTriples {
	public boolean noTriples(int[] nums) {
		if (nums.length > 2) {
			for (int i = 1; i < nums.length; i++) {
				if (nums[i - 1] == nums[i] && nums[i - 1] == nums[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
