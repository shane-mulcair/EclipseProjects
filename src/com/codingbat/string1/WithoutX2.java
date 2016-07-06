package com.codingbat.string1;

public class WithoutX2 {
	public String withoutX2(String str) {
		if(str.length()==0){
		return str;
		}
		else if(str.startsWith("xx")){
			return str.substring(2);
		}
		else if(str.startsWith("x")){
			  return str.substring(1);
		}
		else if(str.charAt(1)=='x'){
			return str.charAt(0)+str.substring(2);
		}
		else{
			return str;
		}
	}

}
