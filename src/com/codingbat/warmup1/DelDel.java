package com.codingbat.warmup1;

public class DelDel {
	public String delDel(String str) {
		  if(str.length()>3&&str.charAt(1)=='d'&&str.charAt(2)=='e'&&str.charAt(3)=='l'){
			  return str.charAt(0)+str.substring(4);
		  }
		  else{
			  return str;
		  }
	}
}
