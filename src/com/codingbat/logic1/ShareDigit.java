package com.codingbat.logic1;

public class ShareDigit {
	public boolean shareDigit(int a, int b) {
		  int lda=a/10;
		  int ldb=b/10;
		  int rda=a%10;
		  int rdb=b%10;
		  return lda==ldb||rda==rdb||rda==ldb||lda==rdb;
	}
}
