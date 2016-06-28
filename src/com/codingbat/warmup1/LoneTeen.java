package com.codingbat.warmup1;

public class LoneTeen {
	public boolean loneTeen(int a, int b) {
		  boolean aIsTeen=false;
		  boolean bIsTeen=false;
		  if (13<=a && a<=19){
			  aIsTeen=true;
		  }
		  if(13<=b &&b<=19){
			  bIsTeen=true;
		  }
		  return (aIsTeen &&!bIsTeen)||(bIsTeen&&!aIsTeen);
		  
	}
}
