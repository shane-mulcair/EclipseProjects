package com.codingbat.logic2;

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		 if(small+(big*5)<goal){
			 return false;
		 }
		 else if(small+(big*5)==goal){
			 return true;
		 }
		 else if(goal/5<=goal){
			 return true;
		 }
		 else if(goal%5<=small){
			 return true;
		 }
		 else{
			 return false;
		 }
	}
}
