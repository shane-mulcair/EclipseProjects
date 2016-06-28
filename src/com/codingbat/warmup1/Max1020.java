package com.codingbat.warmup1;

public class Max1020 {
	public int max1020(int a, int b) {
		  if((10<=a&&a<=20)&&(10<=b&&b<=20)){
			  return a>=b?a:b;
		  }
		  else if(10<=a&&a<=20){
			  return a;
		  }
		  else if(10<=b&&b<=20){
			  return b;
		  }
		  else{
			  return 0;
		  }
	}
}
