package com.codingbat.array1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		  int[] output = null;
		  int pos=0;
		  if(a.length>0&&b.length>0){
			  output=new int[2];
			  output[0]=a[0];
			  output[1]=b[0];
		  }
		  else if(a.length>0){
			  output=new int[1];
			  output[0]=a[0];
		  }
		  else if(b.length>0){
			  output=new int[1];
			  output[0]=b[0];
		  }
		  return output==null?new int[0]:output;
	}
}
