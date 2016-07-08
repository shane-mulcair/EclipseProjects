package com.codingbat.logic1;

public class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		  if(a!=b&&a!=c&&b!=c){
			  return 0;
		  }
		  else if(a==b&&b==c&&a==c){
			  return 20;
		  }else{
			  return 10;
		  }
	}
}
