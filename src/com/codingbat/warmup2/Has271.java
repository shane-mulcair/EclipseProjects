package com.codingbat.warmup2;

public class Has271 {
	public boolean has271(int[] nums) {
		  if(nums.length>2){
			  for(int i=1;i<nums.length;i++){
				  if(i+1<nums.length&&(nums[i]==nums[i-1]+5&&Math.abs((nums[i-1]-1)-nums[i+1])<=2)){
					  return true;
				  }
			  }
		  }
		  return false;
	}
}
