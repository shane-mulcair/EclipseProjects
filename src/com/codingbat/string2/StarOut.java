package com.codingbat.string2;

public class StarOut {
	public String starOut(String str) {
		StringBuilder sb=new StringBuilder();
		  for(int i=0;i<str.length();i++){
			  if(str.charAt(i)=='*'||(i<str.length()-1&&str.charAt(i+1)=='*')||(i<str.length()&&i>0&&str.charAt(i-1)=='*')){
			  }
			  else{
				  sb.append(str.charAt(i));
			  }
		  }
		  return sb.toString();
	}
}
