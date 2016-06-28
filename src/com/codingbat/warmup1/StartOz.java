package com.codingbat.warmup1;

public class StartOz {
	public String startOz(String str) {
		String output="";  
		if (str.length()>=2){
			  if(str.charAt(0)=='o'){
				  output+="o";
			  }
			  if(str.charAt(1)=='z'){
				  output+="z";
			  }
		  }
		  else if (str.length()==1){
			  if(str.charAt(0)=='o'){
				  output+="o";
			  }
		  }
		return output;
	}

}
