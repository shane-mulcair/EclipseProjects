package com.codingbat.string2;

public class ZipZap {
	public String zipZap(String str) {
		StringBuilder sb=new StringBuilder();  
		for(int i=0;i<str.length();i++){
				  if(str.charAt(i)=='z'&&i+2<str.length()&&str.charAt(i+2)=='p'){
					  sb.append(str.charAt(i));
					  sb.append(str.charAt(i+2));
					  i+=2;
			  }
			  else{
				  sb.append(str.charAt(i));
			  }
		  }
		return sb.toString();
	}
}
