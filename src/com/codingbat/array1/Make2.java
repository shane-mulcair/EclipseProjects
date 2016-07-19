package com.codingbat.array1;

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		  int[] output=new int[2];
		  int counter=0;
		  int apos=0;
		  int bpos=0;
		  while (counter<2){
			  if(apos<a.length){
				  output[counter]=a[apos];
				  apos++;
			  }
			  else if(bpos<b.length){
				  output[counter]=b[bpos];
				  bpos++;
			  }
			  counter++;
		  }
		  return output;
	}
}
