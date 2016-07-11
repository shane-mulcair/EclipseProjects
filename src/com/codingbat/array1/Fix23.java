package com.codingbat.array1;

public class Fix23 {
	public int[] fix23(int[] nums) {
		boolean found2=false;  
		int[] output=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			  if(nums[i]==2){
				  found2=true;
				  output[i]=nums[i];
			  }
			  else if(found2&&nums[i]==3){
				  found2=false;
				  output[i]=0;
			  }
			  else{
				  output[i]=nums[i];
			  }
		}
		return output;
	}
}
