package com.codingbat.array1;

public class Double23 {
	public boolean double23(int[] nums) {
		  int count2=0;
		  int count3=0;
		  for(int i:nums){
			  if(i==2){
				  count2++;
			  }
			  else if(i==3){
				  count3++;
			  }
		  }
		  if(count2>1||count3>1){
			  return true;
		  }
		  else{
			  return false;
		  }
	}
}
