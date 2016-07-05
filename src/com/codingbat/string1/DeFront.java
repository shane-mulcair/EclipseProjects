package com.codingbat.string1;

public class DeFront {
	public String deFront(String str) {    
		 if(str.length()==0){
			 return "";
		 }
		 String output="";
		 if(str.charAt(0)=='a'){
			 output+="a";
		 }
		 if(str.charAt(1)=='b'){
			 output+="b";
		 }
		 return output+=str.substring(2);
	}

}
