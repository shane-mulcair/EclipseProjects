package com.codingbat.string1;

public class WithoutX {
	public String withoutX(String str) {
		String output="";
		if(str.equals("x")){
			output= "";
		}
		else if(str.startsWith("x")&&str.endsWith("x")){
			output=str.substring(1,str.length()-1);
		}
		else if(str.endsWith("x")){
			output=str.substring(0, str.length()-1);
		}
		else if(str.startsWith("x")){
			output=str.substring(1);
		}
		else{
			output=str;
		}
		return output;
	}


}
