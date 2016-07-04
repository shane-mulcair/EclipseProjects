package com.codingbat.warmup2;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		String sub="";  
		String output="";
		if(str.length()<=3){
			  sub=str;
		}
		else{
			sub=str.substring(0, 3);
		}
		for(int i=1;i<=n;i++){
			output+=sub;
		}
		return output;
	}
}
